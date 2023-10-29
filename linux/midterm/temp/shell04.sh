#!/bin/bash
echo 숫자 3개를 입력하세요.
read a b c

min=$a
max=$a
echo "$a $b $c"
echo "$min $max"
if [ $min -gt $b ]
then
	min=$b
	echo "$min"
elif [ $min -gt $c ]
then
	min=$c
fi


if [ $max -lt $b ]
then 
	max=$b
elif [ $max -lt $c ]
then
	max=$c
	echo "$max"
fi

echo "가장 큰 수 = $max , 가장 작은 수 = $min"



