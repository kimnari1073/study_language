#!/bin/bash
sum=0
i=1
while [ $i -le 100 ]
do
	if [ `expr $i % 7` -eq 0 ]
	then
		sum=`expr $sum + $i`
		echo -n "$i "
	fi
	i=`expr $i + 1`
done
echo Sum = "$sum"


