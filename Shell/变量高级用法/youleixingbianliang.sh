#!/bin/bash

# declare tyepset
:<<!
declare -r var1
declare -i num
declare -f
declare -F
declare -a array
declare -x var2 --声明环境变量，与终端无关
!

# 默认都是字符串
declare -i num1
num1=10
num2=20
declare -i num3
num3=$num1+40
echo $num3
echo $num2+40

declare -a array
array=("hi" "jack" "mark")
echo ${array[@]}
echo ${array[0]}
echo ${#array[@]}
echo ${#array[0]}