import scala.io.StdIn.readLine
object Framedsentence extends App {

  def star(num:Int) : Unit = {
    for (i <- 0 to num+3)
      print("*")
  }

  def WordPrint(word:String,num:Int) : Unit = {
    print("* " + word)
    for(i <- 1 to num - word.length)
      print(" ")
    println(" *")
  }

  var input = readLine().split(" ")
  var max = 0
  for (i <- input)
    if(max < input.length)
      max = i.length

  star(max)
  println()
  input.foreach(x => WordPrint(x,max))
  star(max)

}