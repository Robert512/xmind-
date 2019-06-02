#!/bin/bash

# 命令替换
# `command`
# $(command)

index=1
for user in `cat ./users.txt | cut -d ":" -f 1`
do
	echo "This is $index user:" $user
	index=$(($index+1))
done


# $(())算术运算
date +%Y

echo "This is $(($(date +%Y)+1)) year"

date +%j
echo "This year have passed $(date +%j) days"
echo "This year have passed $(($(date +%j) / 7)) weeks"
echo "This year $(((365-$(date +%j)) / 7)) weeks left."