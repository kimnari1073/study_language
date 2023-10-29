#!/bin/bash
i=2
j=1
sum=0
while [ $i -le 9 ]
do
	echo ----------
	while [ $j -le 9 ]
	do
		sum=`expr $i \* $j`
		echo "$i * $j = $sum"
		j=`expr $j + 1`
	done
	j=1
	i=`expr $i + 1`
done


