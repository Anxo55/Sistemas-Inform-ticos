#!/bin/sh
echo "Introduce un número"
read num
if [ $num -le 0 ];
then
	echo "El valor introducido es menor o igual a cero"
fi
