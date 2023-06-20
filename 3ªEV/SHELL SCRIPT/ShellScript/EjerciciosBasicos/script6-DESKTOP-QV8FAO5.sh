#!/bin/bash
read -p "Introduce un directorio: " dir
if [ -d ~/$dir ]; then
		echo "El directorio existe en tu HOME"
	else
		echo "El directorio no existe en tu HOME"
fi
