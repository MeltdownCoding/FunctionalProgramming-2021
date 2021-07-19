import scala.io.StdIn.readLine
object TitleCase extends App
{
  val input = readLine().toLowerCase.split(" ")
  val result = input.map(_.capitalize).mkString(" ")
  print(result)
}