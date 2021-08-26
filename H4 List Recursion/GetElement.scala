import scala.io.StdIn.readLine

@main def getElementMain() = {
  val words = readLine().split(" ").toList
  val index = readLine().toInt
  val result = get(words, index)
  println(result)
}

def get(list: List[String],index:Int): String = list match {
  case Nil => ""
  case head :: tail => if(list.indexOf(head) == index) head else get(tail,index - 1)
}
