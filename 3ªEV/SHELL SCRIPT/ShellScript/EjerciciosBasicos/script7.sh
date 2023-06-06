#!/bin/bash
read -p "Introduce un número: " num

# ---- Sin decimales ----
#mitad=$((num / 2))
#let mitad=num/2
#mitad=$(expr $mitad / 2)

# --- Con decimales ---
mitad=$(echo "scale = 2; $num/2"| bc -l)
echo "La mitad de $num es $mitad"

