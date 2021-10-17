object Tarea1 extends App {
  //----------------------------------------------------------------------
  //1.- Funcion factorial 5 = 120
  def factorial(numberFactorial: Int): Int = {
    if (numberFactorial == 1) {
      return 1
    }
    var x: Int = numberFactorial
    x = x * factorial(numberFactorial - 1)
    return x
  }

  //2.- Funcion fibonaci 5 la posicion ultimo valor
  def fibonaci(posicion: Int): Int = {
    if (posicion == 0)
      return 0
    else if (posicion == 1)
      return 1
    else
      return fibonaci(posicion - 1) + fibonaci(posicion - 2)
  }

  //3.- Funcion que permita determinar si un nùmero es primo o no
  def buscarPrimo(contador: Int, numberCompare: Int): String = {
    if (numberCompare == 1)
      return "no es primo"
    if ((numberCompare / 2) < contador)
      return "es primo"
    else if (((numberCompare % contador) == 0))
      return "no es primo"
    else
      return buscarPrimo(contador + 1, numberCompare)
  }
  //======================================= Tarea 1 ====================================
  //1.Ejercicio Factorial:
  println("============== Ejercicio Factorial ==============")
  print("\nIngrese un numero para sacar el factorial:\n>- ")
  val numberFactorial = scala.io.StdIn.readInt()
  printf("El factorial de %d es: %d\n", numberFactorial, factorial(numberFactorial))
  //............................................................................
  //2.Ejercicio Serie Fibonaci
  println("\n============== Ejercicio Serie Fibonaci ==============")
  print("\nIngrese la posicion que desea conocer de la serie fibonaci:\n>- ")
  val posicion = scala.io.StdIn.readInt()
  printf("En la posicion: %d de la serie fibonaci esta el numero: %d\n", posicion, fibonaci(posicion))
  //............................................................................
  //3.Ejercicio Numeros Primos
  println("\n============== Ejercicio Numeros Primos ==============")
  print("Ingrese un valor para comprobar si es primo o no:\n>- ")
  val numberCompare = scala.io.StdIn.readInt()
  printf("El numero %d %s\n", numberCompare, buscarPrimo(contador = 2, numberCompare))

}
