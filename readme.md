Actividad2 - Proyecto Maven 

## Descripción

Este proyecto es una aplicación basada en Maven que genera un `.jar` ejecutable. 
Incluye las siguientes características:
- Uso de Commons CLI para manejo de argumentos en línea de comandos.
- Uso de Log4j para el registro de logs.
- Generación de un "fat jar" que contiene todas las dependencias necesarias para su correcta ejecución.

## Configuración del Proyecto

- GroupId:`ar.edu.udeci.pv`
- ArtifactId:`Actividad2`
- Versión:** `1.0-SNAPSHOT`
- Dependencias: 
  - `commons-cli` (manejo de argumentos)
  - `log4j` (registro de logs)
  - `junit-jupiter-api` (para pruebas unitarias)

##  Estructura del Proyecto

Actividad2/
├── src/
│   ├── main/
│   │   ├── java/ar/edu/udeci/pv/
│   │   │   ├── CLIejemplo.java
│   │   │   ├── LogEjemplo.java
│   ├── test/
│   │   ├── java/ar/edu/udeci/pv/
│   │   │   ├── AppTest.java
├── pom.xml
├── README.md
├── target/  (se generará después de compilar el proyecto)


## Instalación y Ejecución
### 1️⃣ Compilar el proyecto

Ejecuta este comando para limpiar archivos previos y generar el `.jar` empaquetado con todas sus dependencias:
mvn clean package


Al completar este paso, se generará un archivo `.jar` en la carpeta `target/` con el nombre:
"Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar"

### 2️⃣ Ejecutar la aplicación

Para ejecutar el `.jar` generado en `target/`, usa:
java -jar target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar 


### 3️⃣ Probar los argumentos
La aplicación admite los siguientes argumentos de línea de comandos:
- `-h` o `--help`: Muestra un mensaje de ayuda sobre el uso de la aplicación.
- `-n` o `--name <arg>`: Permite pasar un nombre como argumento. 

Ejemplo:
java -jar target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar -n "Facundo Boschini"

Esto generará una salida personalizada como:
"Hola, Facundo Boschini"


### 4️⃣ Ejecutar pruebas
Para validar las pruebas unitarias incluidas en el proyecto, ejecuta:
mvn test

##  Autor y Colaboración
-Autor: Boschini Facundo
-Visibilidad en GitHub: Proyecto será subido a GitHub y accesible para el usuario `ale-vz`.


