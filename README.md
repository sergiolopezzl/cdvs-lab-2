# CVDS-LAB2

## INTEGRANTES

**Andrés Felipe Arias Ajiaco**
**Sergio Daniel Lopez Vargas**

## PREGUNTAS

*COMPILAR Y EJECUTAR*

**Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.**

El parámetro "package" es una de las fases del ciclo de vida de construcción de proyectos que permite empaquetar el proyecto compilado en un formato específico, como un archivo JAR (Java Archive), un archivo WAR (Web Application Archive), o incluso un archivo ZIP, según el tipo de proyecto que estés construyendo.

Maven permite especificar otros parámetros y opciones al ejecutar comandos. Algunos de los parámetros más comunes que se pueden enviar al comando mvn son:

> * -D: Permite definir propiedades del sistema o propiedades del proyecto. Por ejemplo, puedes usar -DskipTests para omitir la ejecución de pruebas durante la compilación.
> * -P: Permite activar perfiles específicos durante la construcción. Los perfiles son conjuntos de configuraciones que se pueden aplicar a diferentes entornos.
> * -f: Especifica un archivo POM (Project Object Model) diferente al pom.xml predeterminado. Puedes utilizarlo para construir proyectos con diferentes configuraciones o ubicaciones de archivos POM.
> * -pl: Permite construir solo un submódulo específico de un proyecto multimódulo. Se utiliza junto con el parámetro -am para evitar la compilación de módulos dependientes.
> * -am: Cuando se usa junto con -pl, construye también los módulos dependientes del módulo especificado.
> * -B: Activa el modo batch, que reduce la salida detallada durante la compilación.
> * -U: Actualiza las dependencias en el repositorio antes de construir.
> * -q: Ejecuta en modo silencioso, reduciendo la cantidad de salida en la consola.
> * -X: Activa la salida de depuración, que proporciona información detallada sobre el proceso de construcción.

**Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass".**

mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App"

**Buscar cómo enviar parámetros al plugin "exec".**

$ mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App" -Dexec.args="Jorge Perez"

*HACER EL ESQUELETO DE LA APLICACIÓN*

**¿CuáL(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?**
> * Sin parámetros
> * Parámetro: qwerty
> * Parámetro: pentagon
> * Parámetro: Hexagon

Todas las intrucciones ejecutadas funcionan correctamente, pues hace las correspondientes validaciones como lo son: que tenga párametro, que exista la figura ingresada y por último si cumple lo anterior muestra los vértices de la figura.



