#!/bin/bash

num1=3
num2=4
expr $num1 \> $num2

num3=`expr $num1 + $num2`
echo $num3
num4=`expr $num1 \* $num2`
echo $num4
num3=`expr $num1 % $num2`
echo $num3
num4=`expr $num1 - $num2`
echo $num4


# $(())不需要转义，只能+-*/
num3=$(($num1 + $num2))
echo $num3
num3=$(($num1 * $num2))
echo $num3