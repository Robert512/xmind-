#!/bin/bash
#
while true
do
	this_pid=$$
	ps ef|grep nginx|grep -v grep|grep -v $this_pid &> /dev/null
	if [ $? -eq 0 ];then
		echo "nginx is running well"
		sleep 3
	else
		#systemctl start nginx
		echo "Nginx id down, Start it..."
		sleep 3
	fi
done


#nohup sh start_nignx.sh &

#netstat -tnlp|grep :80

#curl localhost/index.html