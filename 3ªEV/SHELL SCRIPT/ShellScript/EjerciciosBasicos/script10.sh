#!/bin/bash
read -p "Introduce un número de mes: " mes

case $mes in
	1)
		echo "Estamos en invierno";;
	2)
		echo "Estamos en invierno";;
	3)
		echo "Estamos en invierno";;
	4)
		echo "Estamos en primavera";;
	5)
		echo "Estamos en primavera";;
	6)
		echo "Estamos en verano";;
	7)
		echo "Estamos en verano";;
	8)
		echo "Estamos en verano";;
	9)
		echo "Estamos en verano";;
	10)
		echo "Estamos en otoño";;
	11)
		echo "Estamos en otoño";;
	12)
		echo "Estamos en otoño";;
	*)
		echo "El número introducido no es un mes válido";;
esac
