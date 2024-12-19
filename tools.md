1. Librerias usadas
    -JRE System Librery(jre23) de Java
    -JavaFX SDK es una libreria orientada a la integracion y gestion de de css en aplicaciones JavaFX, especialmente diseñada para su uso en el entorno de desarrollo Eclipse.
    -JavaFX_Lib es una libreria de usuario, creada para usar interfaces de usuario graficas, que cuenta con los siguientes elementos:
        ·javafx.base.jar esta libreria nos proporciona funcionalidades comunes como "ObservableList", "Property", "ChangeListener", etc.
        ·javafx.controls.jar esta libreria nos permite agregar elementos graficos y controles como: "Button", "TextField", "Label","TableView", etc.
        ·javafx.fxml.jar esta libreria nos facilita el diseño de interfaces de usuario sin necesidad de escribir codigo Java para crear la interfaz.
        ·javafx.graphics.jar esta libreria nos proporciona soporte para renderizar graficos, imagenes, efectos visuales, animaciones y el manejo de componentes graficos como "Scene", "Stage", "Canvas", etc.
        ·javafx.media.jar esta libreria nos permite integrar capacidades multimedia, como la reproduccion de archivos de audio o video, a traves de clases como "Media" y "MediaPlayer".
        ·javafx.swimg.jar esta libreria nos permite que una aplicacion JavaFX funcione junto con SWT, facilitando la integracion de los controles y widgets de SWT.
        ·javafx.web.jar esta libreria nos permite incorporar un navegador web dentro de la aplicacion JavaFX usando la clase "WebView".
        ·javafx-swt.jar esta libreria nos facilita la ejecucion conjunta de JavaFX y SWT en una misma aplicacion
    -JUnit4 es una libreria de pruebas unitarias de Unit version 4, que nos permite comprobar el funcionamiento del codigo de forma automatizadas asegurando la calidad del codigo y detectar errores de manera temprana.

2. Gerarquia del componente
    -El componente y sus elementos se encuentra en un paquete llamada application, situado dentro de la carpeta src.
    -El archivo module-info.java se encuentra fuera del paquete "application"

3. Archivos del componente
    -Main.java en este archivo cargamos la interfaz grafica que usa el componente.
    -SampleController.java en este archivo tenemos el controlador con los metodos que dan funcionalidad a la aplicacion.
    -SampleControllerTest.java en este archivo tenemos las pruebas unitarias del controlador.
    -application.css en este archivo definimos los estilos y el aspecto de los componentes del componente.
    -Sample.fxml en este archivo definimos la interfaz grafica del componente mediante lenguaje FXML.
    -module-info.java en este archivo podemos declarar el modulo de la aplicacion, especificar dependecias, exportar paquetes.

4. Elementos del componente
    -Rectangle este elemento nos crea un rectangulo, que es el elemento que giraremos despues y cambiaremos de color.
    -Button este elemento es el que al pulsarlo nos permitira ejecutar el metodo que modificara el rectangulo.

5. Metodos
    -rotarFigura este metodo no recibe ningun parametro, ni devuelve ningun parametro, este metodo genera un numero aleatorio del 0 al 9 en la linea 15 con la instruccion "int numeroColor = (int)(Math.random() * 10);",
    que dependiendo del resultado cambia el color de la figura esto se ha realizado mediante un switch pasandole la variable "numeroColor", si sale un 0 el color sera YELLOW, si sale un 1 sera BROWN, si sale un 2 BISQUE,
    si sale un 3 BLUE, si sale un 4 BLUEVIOLET, si sale un 5 AQUA, si sale un 6 AZURE, si sale un 7 BEIGE, si sale un 8 CADETBLUE, si sale un 9 CORAL,
    si se modificase los parametros del generador de numero aleatorio y diese un valor superior a 9 o inferior a 0, se ha decidido que por defecto se pinte la figura del color BLUE.
    Tras cambiar el color de la figura se rota la figura 30 grados a la izquierda esto se ha realizado en la linea 51 con la instruccion "rectangulo.setRotate(rectangulo.getRotate() + 30);" que rota el triangulo 30 grados
    respecto a la posicion del triangulo en la ejecucion del metodo. 