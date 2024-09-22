<b>Descripció</b>

Nivel 1 - Ejercicio 1:
  Se crean dos clases: Producte, con 2 atributos (nombre, precio), y Venda, también con 2 atributos (una colección de productos y el importe de la venta)
  En la clase Venda, se implementa dos métodos:
    - Uno ,addProductToSale, para añadir productos a la cesta de la compra
    - Otro, calcularTotal(), para calcular el importe total de la compra, iterando sobre el contenido de la cesta
  Este segundo dispara una excepción personalizada VendaBuidaException() en caso de que la cesta esté vacía, que indica al usuario de que primero debe añadir productos.

  En la clase Main, creamos en primer lugar unos productos para hacer la prueba.
  Creamos una cesta vacía y comprobamos que se dispara el error al invocar el método calcularTotal().
  Añadimos unos cuantos productos a la cestas, y comprobamos que el método calcularTotal() devuelve ahora el importe correcto.
  Finalmente intentamos acceder a un índice de la cesta creada, fuera de rango, y comprobamos que capturamos por pantalla la excepción IndexOutOfBoundsException.

Nivel 2 - Ejercicio 1:
  Creamos una clase Entrada en la que implantamos varios métodos que sirven para preguntar al usuario el dato a entrar, y para controlar las distintas excepciones que se pueden disparar al introducir datos por pantalla, utilizando la clase Scanner.
  Los 4 primeros controlan la entrada de tipo byte, int, float y double, y capturamos la excepción InputMismatchException de la cual personalizamos el mensaje de error.
  Los 3 últimos controlan la entrada de tipo char, String y boolean, y capturamos una excepción personalizada en función del error:
    - char: Comprobamos que el usuario haya introducido solo un carácter
    - String: Pedimos que el usuario introduzca un nombre y comprobamos que la entrada contenga solo caracteres mediante Regex
    - boolean: Pedimos que el usuario conteste a una pregunta con 's' o 'n' y comprobamos que la entrada solo contenga un carácter, y que éste sea 's' o 'n' o sus mayúsculas respectivas
  
Tecnologies Utilitzades : IDE IntelliJ Idea v 2024.2.1, Java, SDK openjdk-22 Oracle OpenJDK 22.0.2
Requisits: SDK openjdk-22 Oracle OpenJDK 22.0.2

Instal·lació: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/1.02_JavaLanguage_Sprint1_Task2.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.

Ejecución:
Localizar y abrir las classes Main de cada ejercicio, y ejecutarlas con el Run.

Contribuciones:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/1.01_JavaLanguage_Sprint1_Task1
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request
