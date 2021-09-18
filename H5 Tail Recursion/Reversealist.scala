import scala.annotation.tailrec
import scala.io.StdIn.readLine

@main def reverseMain() = {
  val words = readLine().split(" ").toList
  val result = reverse(words)
  println(result.mkString(" "))
}

def reverse(list: List[String]): List[String] = {
  @tailrec
  def trReverse(l:List[String],acc:List[String]): List[String] = l match {
    case Nil => acc
    case h::t => trReverse(t,h::acc)
  }

  trReverse(list,List())

}