import scala.io.StdIn.readLine
object Removeoddwords extends App
{
  val input = readLine()
  val wordString = input.split(" ")
  for (i<-0 to (wordString.length-1))
    {
      if(wordString(i).length % 2 == 1)
      {
          print("")
      }
      else print(wordString(i)+" ")
    }
}