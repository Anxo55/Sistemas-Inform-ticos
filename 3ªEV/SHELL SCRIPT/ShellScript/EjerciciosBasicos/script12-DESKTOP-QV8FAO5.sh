#!/bin/bash
read -p "Introduce el nombre del fichero que quieres borrar: " fichero
if [ -e $fichero ];
	then
		if  [ -w $fichero ];
			then
				rm $fichero
				echo "El fichero se ha borrado correctamente"
			else
				echo "El fichero no tiene los permisos necesarios"
		fi
	else
		echo "El fichero no existe"
fi
