#!/bin/bash

while [[ true ]]; do
	#statements
	read -p "Pls input num:" num
	expr $num + 1 &> /dev/null

	if [ $? -eq 0 ];then
		if [ `expr $num \> 0`  -eq 1 ];then
			echo "Yes, prsitv number"
			for((i=1;i<=$num;i++))
			do
				sum=`expr $sum + $i`
			done
			echo "1+2+3+...+$num=$sum" 
			exit
		else 
			echo "Error"
		fi
		exit
	fi
	echo "Error, enlegal input"
	continue
done
