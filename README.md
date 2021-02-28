# Prueba Técnica // Analista de Pruebas Nivel 1 

* En el desarrollo de las actividades propuestas se seleccionó el Framework Serenity
* La base inicial en el desarrollo de este proyecto fue tomada de [Serenity BDD](https://github.com/serenity-bdd/serenity-cucumber4-starter.git).

## Requisitos
* JDK 8 o superior
* Graddle 6.x.x
* Intellij IDEA
* **Plugins requeridos para Intellij IDEA**
    * Cucumber for java
    * Gherkin
    * Hocon
* Google Chrome
* Descargar el [ChromeDriver](https://chromedriver.chromium.org/) segun su version de Chrome

### Reemplazar ChromeDriver
Abrimos el proyecto con Intellij IDEA, una vez abierto nos ubicamos en carpeta src, luego en la carpeta test, continuamos a la carpeta resources y finalmente en webdriver, en esta carpeta nos mostrara 3 carpetas cada una referente a un sistema operativo, segun su sistema operativo nos ubicamos dentro de dicha carpeta ubicamos el archivo **chromedriver** damos clic derecho sobre este archivo e indicamos que queremos verlo en el explorador, ubicados en esta carpeta borramos el chromedriver y proseguimos a pegar el chromedriver referente a nuestra versión del navegador de chrome.  
![Estrucura de carpetas](https://i.ibb.co/y5BZWZx/2021-02-27-19h32-17.png)

## Ejecución
Teniendo nuestro entorno listo y abierto el proyecto en Intellij IDEA proseguimos a ejecutar la siguiente línea de comando:
```
gradle clean test -Pwebdriver.driver=chrome -Denvironment=staging
```

### Entorno de desarrollo del proyecto
* Windows 10
* Google Chrome 88.0.4324.96
* Intellij IDEA 2020.2
* JDK 8
* Graddle 6.8.3
