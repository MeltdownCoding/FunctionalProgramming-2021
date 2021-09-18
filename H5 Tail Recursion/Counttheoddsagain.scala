import scala.io.StdIn.readLine
import scala.annotation.tailrec

@main def countOddMain() = {
  val numbers = readLine().split(" ").map(_.toInt).toList
  val total = countOdd(numbers)
  println(s"List contains $total odd numbers")
}

def countOdd(list: List[Int]): Int = {
  @tailrec
  def trCountOdd(l: List[Int], acc: Int): Int = l match {
    case Nil => acc
    case head::tail => if(head%2 != 0) trCountOdd(tail,acc+1) else trCountOdd(tail,acc+0)
  }
  trCountOdd(list, 0)
}