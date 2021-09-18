import scala.annotation.tailrec
import scala.io.StdIn.readLine

@main def searchMain() = {
  val numbers = readLine().split(" ").map(_.toInt).toList
  val searchNumber = readLine().toInt
  val result = search(numbers, searchNumber)
  println(if (result) "found" else "not found")
}

def search(list: List[Int], element: Int): Boolean = {
  @tailrec
  def trSearch(l:List[Int],elem:Int): Boolean = l match {
    case Nil => false
    case h::t => if(h == elem) true else trSearch(t,elem)
  }

  trSearch(list,element)
}