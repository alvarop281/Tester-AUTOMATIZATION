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

Para el segundo ejercicio INTERFAZ – PRUEBA DE FUNCIONALIDAD, se automatizo la prueba usando Selenium webDriver, maven y TestNG, por lo cual para poder ejecutarlo es necesario:

1.- Tener Java instalado en el ordenador

2.- Contar con Eclipse o Visual Studio Code, si se tiene instalado Eclipse, es necesario tener instalado el pluggin de TestNG, desde VSC es necesario la extensión Visual Studio IntelliCode

3.- Tener el navegador Chrome actualizado con la versión 97.0.46

4.- Clonar el repositorio

5.- Ir a la carpeta con el nombre INTERFAZ_PRUEBA_DE_FUNCIONALIDAD

6.1.- Desde VSC en la ruta src\test\java\test\RegisterForm.java es posible ejecutar la prueba

6.2.- Desde Eclipse desde el archivo testng.xml (en la raíz de la carpeta) se puede ejecutar usando TestNG
	Run As TestNG suite

7.- En la carpeta se encuentra INTERFAZ_PRUEBA_DE_FUNCIONALIDAD un pdf con los casos de uso utilizados para este ejercicio.  
