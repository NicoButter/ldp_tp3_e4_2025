# 📖 Trabajo Práctico Nº 3: JSON - Ejercicio 3

![Banner UNPA](img/unpalogo.png)

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=flat&logo=java&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-000000?style=flat&logo=json&logoColor=white)

## 📝 Descripción

Este proyecto corresponde al **Ejercicio 3** del **Trabajo Práctico Nº 3** de la asignatura **Laboratorio de Programación** de las carreras **Licenciatura en Sistemas** y **Analista de Sistemas** de la **Universidad Nacional de la Patagonia Austral (UNPA)**, primer cuatrimestre de 2025. El objetivo es crear un documento JSON en **Java** utilizando una librería adecuada, basado en un caso de estudio de gestión de películas (similar a IMDb), y mostrar su contenido en consola. El JSON incluye información como código, título, director, protagonistas, año, título original, argumento, duración y géneros de películas.

## 📂 Estructura del Proyecto

| Archivo/Directorio | Descripción |
|--------------------|-------------|
| 📄 `Main.java`     | Código Java que genera el archivo JSON y muestra su contenido. |
| 📄 `movies.json`   | Archivo JSON generado con datos de películas. |
| 📦 `lib/`          | Librerías externas (ejemplo: `json-simple-1.1.1.jar`). |

## 🛠️ Requisitos

- 🌐 **Java**: JDK 17 o superior.
- 📚 **Librería JSON**: `json-simple` (incluida en `lib/` o descargable desde [Maven Repository](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple)).
- 🖥️ Entorno de desarrollo (recomendado: IntelliJ IDEA, Eclipse o VS Code).
- 📂 Directorio de escritura para generar `movies.json`.

## 💻 Entorno de Desarrollo

- 🖌️ **Editor de Código**: Visual Studio Code (v1.XX.X).
- 🐧 **Sistema Operativo**: openSUSE.
- 💻 **Hardware**: HP Victus D16 Laptop.

## 🚀 Instrucciones de Uso

1. 📥 Clona el repositorio: `git clone <URL_DEL_REPOSITORIO>`.
2. 📂 Navega al directorio del proyecto: `cd <NOMBRE_DEL_PROYECTO>`.
3. 📦 Asegúrate de que la librería `json-simple-1.1.1.jar` esté en el directorio `lib/` y configurada en el classpath.
4. ⚙️ Compila el código: `javac -cp lib/json-simple-1.1.1.jar Main.java`.
5. 🚀 Ejecuta el programa: `java -cp .:lib/json-simple-1.1.1.jar Main`.
6. ✅ Verifica que el archivo `movies.json` se genere en el directorio raíz y que su contenido se muestre en consola.

## 📚 Detalles del Ejercicio

El código Java (`Main.java`) realiza las siguientes tareas:
- Crea un objeto JSON que representa una colección de películas, cada una con atributos como código, título, director, protagonistas (array), año, título original, argumento, duración y géneros (array).
- Almacena el JSON en un archivo (`movies.json`).
- Lee y muestra el contenido del archivo JSON en consola.

## 👤 Autor

- **Nombre**: Nicolás Butterfield
- **Contacto**: [nicobutter@gmail.com](mailto:nicobutter@gmail.com) | [GitHub](#)

## 📜 Licencia

![Licencia MIT](https://img.shields.io/badge/License-MIT-green.svg)

Este proyecto está bajo la **Licencia MIT**, lo que permite su uso, copia y modificación libremente bajo los términos establecidos. Consulta el archivo `LICENSE` para más detalles.

## 📚 Referencias

- Consigna del Trabajo Práctico Nº 3, Laboratorio de Programación, UNPA.
- Documentación oficial de HTML5 y JavaScript (MDN Web Docs).

### The cake is a lie." - GLaDOS (Portal)![GlaDOS](img/glados.png)
