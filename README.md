# 📖 Trabajo Práctico Nº 3: JSON - Ejercicio 4

![Banner UNPA](img/unpa_logo.png)

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=flat&logo=java&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-000000?style=flat&logo=json&logoColor=white)

## 📝 Descripción

Este proyecto corresponde al **Ejercicio 4** del **Trabajo Práctico Nº 3** de la asignatura **Laboratorio de Programación** de las carreras **Licenciatura en Sistemas** y **Analista de Sistemas** de la **Universidad Nacional de la Patagonia Austral (UNPA)**, primer cuatrimestre de 2025. El objetivo es procesar un archivo JSON que contiene información de películas (basado en el Ejercicio 2 del TP) utilizando **Java** y la librería **JSON** para realizar las siguientes operaciones:
- **Listar**: Título, año y duración de todas las películas.
- **Contar**: Títulos y número de protagonistas por película.
- **Filtrar**: Películas cuyo argumento contiene dos palabras dadas.
- **Buscar**: Películas en las que ha trabajado un actor dado.

## 📂 Estructura del Proyecto

| Archivo/Directorio | Descripción |
|--------------------|-------------|
| 📄 `movies.json`   | Archivo JSON con datos de películas. |
| 📄 `Main.java`     | Código Java que procesa el JSON y realiza las operaciones solicitadas. |
| 📦 `lib/`          | Librerías externas (ejemplo: `json-simple-1.1.1.jar`). |

## 🛠️ Requisitos

- 🌐 **Java**: JDK 17 o superior.
- 📚 **Librería JSON**: `json-simple` (incluida en `lib/` o descargable desde [Maven Repository](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple)).
- 🖥️ Entorno de desarrollo (recomendado: IntelliJ IDEA, Eclipse o VS Code).
- 📦 Acceso al archivo `movies.json` en el directorio raíz.

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
6. ✅ Verifica que el archivo `movies.json` esté en el directorio raíz y que la salida en consola muestre los resultados esperados.

## 📚 Detalles del Ejercicio

El código Java (`Main.java`) realiza las siguientes operaciones sobre el archivo `movies.json`:
- **a) Listar información**: Muestra el título, año y duración de todas las películas.
- **b) Contar información**: Muestra los títulos y el número de protagonistas por película.
- **c) Filtrar información**: Filtra películas cuyo argumento contiene dos palabras especificadas (por ejemplo, "ciencia" y "ficción").
- **d) Buscar información relacionada**: Lista películas en las que ha trabajado un actor dado (por ejemplo, "Leonardo DiCaprio").

### Código de Ejemplo

## 👤 Autor

- **Nombre**: Nicolás Butterfield
- **Contacto**: [nicobutter@gmail.com](mailto:nicobutter@gmail.com) | [GitHub](#)

## 📜 Licencia

![Licencia MIT](https://img.shields.io/badge/License-MIT-green.svg)

Este proyecto está bajo la **Licencia MIT**, lo que permite su uso, copia y modificación libremente bajo los términos establecidos. Consulta el archivo `LICENSE` para más detalles.

## 📚 Referencias

- Consigna del Trabajo Práctico Nº 3, Laboratorio de Programación, UNPA.
- Documentación oficial de HTML5 y JavaScript (MDN Web Docs).
