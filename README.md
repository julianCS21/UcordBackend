<h1>U-Cord <img width="30" height="30" src="https://image.flaticon.com/icons/png/512/2232/2232688.png"></h1>

## Prerrequisitos

-   [Git](https://git-scm.com/downloads) - Version Control System
-   [Maven](https://maven.apache.org/download.cgi) - Dependency Management
-   [Java 8](https://www.java.com/download/ie_manual.jsp) - Development Environment
-   [Spring-Boot](https://spring.io/projects/spring-boot) - Framework Web
-   [Intellij Idea](https://www.jetbrains.com/es-es/idea/download/) (Opcional)

## Instrucciones de ejecución local
1. Desde cmd clonar el repositorio

```git
git clone https://github.com/LaEsquinaDeLaMesaRedonda/U-Cord.git
```

2. Ubicarse en la carpeta U-Cord y borraremos todas las dependencias y modulos que puedan exisitir de los binarios del proyecto.
```maven
mvn clean
```

3. Realizamos la compilación del proyecto
```maven
mvn package
```

4. Ejecutamos el proyecto
```maven
mvn spring-boot:run
```

<img style="height: 450px" src="https://github.com/LaEsquinaDeLaMesaRedonda/U-cord-Wiki/blob/main/img/ucord-mvnSpringBoot.jpg">

## Para más información
Para conocer más sobre este proyecto, ingrese a [wiki U-Cord](https://github.com/LaEsquinaDeLaMesaRedonda/U-cord-Wiki)

## Despliague Heroku

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://u-cord.herokuapp.com/)

## Autores

-   [Ana Gabriela Silva](https://github.com/gabrielaasilva).
-   [Iván Camilo](https://github.com/Rincon10).
-   [Leonardo Galeano](https://github.com/Ersocaut).
