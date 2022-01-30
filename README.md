# Tester-AUTOMATIZATION
QA TESTER AUTOMATIZATION

Se brinda solución a los ejercicios indicados en el archivo Habits.AI.pdf

Para el primer ejercicio API – PRUEBA DE CARGA Y PERFORMANCE, se seleccionó la herramienta k6 para cumplir con los criterios establecidos y para ejecutar este script es necesario:

1.- Clonar el repositorio

2.- Ir a la carpeta con el nombre API – PRUEBA DE CARGA Y PERFORMANCE

3.- Disponer de k6 en el ordenador

4.- Ejecutar el comando:

	k6 run script.js

5.- Para generar el reporte en formato json es necesario ejecutar el siguiente comando:

	k6 run --summary-export=export.json script.js
