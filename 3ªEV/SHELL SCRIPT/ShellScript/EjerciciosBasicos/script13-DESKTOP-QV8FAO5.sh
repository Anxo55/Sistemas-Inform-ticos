#!/bin/bash
read -p "Introduce un número: " num
if test $num -ge 10 && test $num -le 20
	then
		echo "Rango aceptado"
	elif test $num -ge 21 && test $num -le 100
		then
			echo "Rango excedido"
	else
		echo "Rango incorrecto"
fi
