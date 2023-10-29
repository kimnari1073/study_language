#!/bin/bash
i=5
j=5
while [ $j -ge 1 ]
do
	i=$j
	while [ $i -ge 1 ]
	do
		echo -n "*"
		i=`expr $i - 1`
	done
	echo -e "\n"
	j=`expr $j - 1`
	
done
