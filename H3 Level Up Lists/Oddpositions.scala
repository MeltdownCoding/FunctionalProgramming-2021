import scala.io.StdIn.readLine
object Oddpositions extends App {
  val input = readLine()
  val odd = input.split(" ")

  def oddString(args: Array[String]): Unit = {
    var result = ""
    for (i <- 0 to (odd.length - 1)) {
      if (i%2 == 0) {
        result = result + odd(i) + " "
      }
    }
    print(result)
  }
  oddString(odd)
}