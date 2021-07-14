import scala.io.StdIn.readLine
object Removeapples extends App {
  val input = readLine()
  val wordString = input.split(" ")
  for (i <- 0 to (wordString.length - 1))
    {
      if (wordString(i).endsWith("apple"))
        {
          print("")
        }
        else print(wordString(i)+" ")
    }
}
