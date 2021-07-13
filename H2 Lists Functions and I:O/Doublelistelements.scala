import scala.io.StdIn.readLine
object Doublelistelements extends App
{
  val numInput = readLine()
  val numString = numInput.split(" ")
  val numbers = numString.map(n => n.toInt)
  val numInt = numbers.map(n => n * 2 + " ")
  numInt.foreach(print)
}