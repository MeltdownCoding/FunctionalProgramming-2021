import scala.io.StdIn.readLine
object lncrementlistelements extends App
{
  val numInput = readLine()
  val numString = numInput.split(" ")
  val numbers = numString.map(n => n.toInt)
  val numInt = numbers.map(n => n + 1 + " ")
  numInt.foreach(print)
}