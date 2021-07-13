import scala.io.StdIn.readLine
object Countwordlengths extends App
{
  val name = readLine()
  val nameString = name.split(" ")
  val names = nameString.map(n => n.length)
  val nameSpace = names.map(n => n + " ")
  nameSpace.foreach(print)
}