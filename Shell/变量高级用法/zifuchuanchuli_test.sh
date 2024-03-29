#!/bin/bash

string="Bigdata process framework is Hadoop, Hadoop s an open source project"

function print_tips
{
	echo "*****************************"
	echo "(1）打印string长度"
	echo "(2) 删除所有的Hadoop"
	echo "(3) 替换第一个Hadoop"
	echo "(4) 替换所有的Hadoop"
	echo "*****************************"
}

function len_of_string
{
	echo "${#string}"
}

function del_hadoop
{
	echo "${string//Hadoop/}"
}


function rep_hadoop_mapreduce_first
{
	echo "${string/Hadoop/Mapreduce}"	
}

function rep_hadoop_mapreduce
{
	echo "${string//Hadoop/Mapreduce}"	
}


while true
do
	echo
	echo "[string=$string]"
	echo
    print_tips
	read -p "pls input your choice 1|2|3|4|q|Q:" choice

	case $choice in
		1)
			len_of_string
			;;
		2)
			del_hadoop
			;;
		3)
			rep_hadoop_mapreduce_first
			;;
		4)
			rep_hadoop_mapreduce
			;;
		q|Q) 
			exit;
			;;
		*)
			echo "Error, input only in {1|2|3|4|q|Q}"
		
	esac
done

# print_tips
# len_of_string
# del_hadoop
# rep_hadoop_mapreduce_first
# rep_hadoop_mapreduce