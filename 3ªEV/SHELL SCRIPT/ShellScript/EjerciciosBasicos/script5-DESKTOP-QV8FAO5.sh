#!/bin/sh
read -p "Escribe un texto: " texto
if [ $texto == "windows" ] || [ $texto == "linux" ] || [ $texto == "mac" ];
then
	echo "Eso es un sistema operativo"
else
	echo "Eso no se qué es"
fi
