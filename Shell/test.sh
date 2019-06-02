#!/bin/bash 
echo "hello world!"

variable1="I love you, Do you love me."
echo $variable1

var1=${variable1#*ov}
echo $var1


var2=${variable1##*ov}
echo $var2


var3=${variable1%ov*}
echo $var3


var4=${variable1%%ov*}
echo $var4

var5=${PATH/bin/BIN}
echo $var5

var6=${PATH//bin/BIN}
echo $var6