#!/bin/bash
num1=36
num2=50

let suma=num1+num2

resta=$((num2-num1))

multiplicacion=$(expr $num1 \* $num2)

echo $suma
echo $resta
echo $multiplicacion
