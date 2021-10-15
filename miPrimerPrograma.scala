package Clase1

object miPrimerPrograma extends App {

  println("Hola Mundo")

  //String strNOmbre = "HOla";
  //int intValox = 5;

  //val y var
  val intX : Int = 2
 //intX = 3
  println(intX)

  var inty : Int = 3
  println(inty)
  inty = 3 + intX
  println(inty)

  val condicion = false
  val valCondicion = if(condicion) 5 else 3
  println(valCondicion)


  val condicional = 3
  val resultado = if(condicional == 2) println("Igual") else println("diferente")

  var i = 0
  val cicloWHile = while (i < 20)
  {
    print(i)
    i += 1
  }


  def datosConsolo(): Unit=
  {
    println("Ingrese 1 Valor")
    val valorUno = scala.io.StdIn.readLine()
    val intVal1 = valorUno.toInt
    println("INgrese 2 Valor")
    val valorDos = scala.io.StdIn.readLine()
    val intVal2 = valorDos.toInt

    var suma = intVal1 + intVal2
    println("La suma de valoes es:" +suma)
    suma = intVal1 * intVal2
    println("La multi de valores es:"+suma)

  }
  datosConsolo()


  1.- Funcion factorial 5 = 120
  2.- Funcion fibonacci 5 ultimo valor
  3.- FUncion que permita determinar si un nùmero primo o no


}
