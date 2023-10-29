#!/bin/bash

i=2
j=1
sum=0
while [ $j -le 9 ]
do
	while [ $i -le 9 ]
	do
		sum=`expr $i \* $j`
		echo -en "$i * $j = $sum \t"
		i=`expr $i + 1`
	done
	i=2
	j=`expr $j + 1`
	echo -e "\n"
done
