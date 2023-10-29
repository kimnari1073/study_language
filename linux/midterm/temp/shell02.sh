#!/bin/bash
a=0
b=1
c=0
i=1
echo -n "$a $b "
while [ $i -le 8 ]
do
	c=`expr $a + $b`
	echo -n "$c "
	a=$b
	b=$c
	i=`expr $i + 1`
done

