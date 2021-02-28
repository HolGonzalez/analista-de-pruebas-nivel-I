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

## Importacion del proyecto en Intellij IDEA
Abrimos Intellij IDEA indicamos que vamos a crear un nuevo proyecto y que lo importaremos de un gestor de control de versiones, copiamos la url de este proyecto https://github.com/HolGonzalez/analista-de-pruebas-nivel-I, la pegamos en Intellij IDEA y finalizamos en clonar. una vez el proyecto se haya clonado en nuestro equipo comenzara a indexar los archivos y aparecera una alerta en la cual nos pregunta la configuración de proyecto nos brinda dos opciones Maven o Gradle, en este escenario seleccionamos Gradle.  
![Gradle](https://i.ibb.co/VgdCSCq/Captura-de-Pantalla-2021-02-27-a-la-s-8-09-38-p-m.png)


## Reemplazar ChromeDriver
Una vez clonado y preparado nuestro proyecto, nos ubicamos en la carpeta src, luego en la carpeta test, continuamos a la carpeta resources y finalmente en webdriver, en esta carpeta nos mostrara 3 carpetas cada una referente a un sistema operativo, segun su sistema operativo nos ubicamos dentro de dicha carpeta ubicamos el archivo **chromedriver** damos clic derecho sobre este archivo e indicamos que queremos verlo en el explorador, ubicados en esta carpeta borramos el chromedriver y proseguimos a pegar el chromedriver referente a nuestra versión del navegador de chrome.  
![Estrucura de carpetas](https://i.ibb.co/y5BZWZx/2021-02-27-19h32-17.png)

## Ejecución
Teniendo nuestro entorno listo y abierto el proyecto en Intellij IDEA proseguimos a ejecutar la siguiente línea de comando:
```
gradle clean test -Pwebdriver.driver=chrome -Denvironment=staging
```

## Historia de usuario  
**Titulo:** Prueba técnica  
**Como:** Reclutador  
**Quiero:** Evaluar las capacidades técnicas  
**Para:** Continuar con el proceso de selección  
**Criterio de aceptación:** Enviar la prueba resuelta antes del 28/02/21 a media noche

## Historia de usuario  
**Titulo:** Automatización registro de usuario  
**Como:** Programado  
**Quiero:** Automatizar el registro de usuarios en la plataforma  
**Para:** Evaluar y validar el correcto funcionamiento del registro de la plataforma  
**Criterio de aceptación:** Correcto funcionamiento del script y automatización del registro de usuario

### Entorno de desarrollo del proyecto
* Windows 10
* Google Chrome 88.0.4324.96
* Intellij IDEA 2020.2
* JDK 8
* Graddle 6.8.3 uptade 281
