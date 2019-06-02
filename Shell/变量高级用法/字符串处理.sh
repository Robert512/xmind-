#!/bin/bash 
# 计算字符串长度
#${#string}
#expr length $string

var1="Hello world"
len1=${#var1}
echo $len1
len2=`expr length "$var1"`
echo $len2



# 获取子串在字符串中索引的位置
# expr $string $substring

var1="quickstart a app"
ind=`expr index "$var1" start`
echo $ind

ind=`expr index "$var1" cnk`
echo $ind

ind=`expr index "$var1" 1`
echo $ind

# 获取子串的长度
# expr match "$string" substr
var1="quickstart a app"
sub_len=`expr match "$var1" app`
echo $sub_len

sub_len=`expr match "$var1" quick.*`
echo $sub_len

# 抽取子串
# ${string:length}
# ${string:positon:length}
# ${string: -postion}
# ${string:(position)}
# expr substr $string $position $length
echo 抽取子串
var1="kafka hadoop yarn mapreduce"
sub_str=${var1:10}
echo $sub_str
sub_str=${var1:10:4}
echo $sub_str
sub_str=${var1: -5}
echo $sub_str
sub_str=${var1:(-5)}
echo $sub_str
sub_str=`expr substr "$var1" 3 6`
echo $sub_str
