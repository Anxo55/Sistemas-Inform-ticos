#!/bin/bash
num=4
#for i in {4..100}
#do
#	echo $i
#done

#while [ $num -le 100 ]
#	do
#		echo "$num"
#		let num=num+1
#	done

until [ $num -eq 101 ]
	do
		echo "$num"
		let num=num+1
	done
