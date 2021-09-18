import scala.annotation.tailrec
import scala.io.StdIn.readLine

@main def minimumMain() = {
  val numbers = readLine().split(" ").map(_.toInt).toList
  val result = minimum(numbers)
  println(s"Minimum is $result")
}

def minimum(l: List[Int]): Int ={
  @tailrec
  def trMinimum(list: List[Int],num:Int): Int = list match {
    case Nil => num
    case h::t => if(h < num) trMinimum(t,h) else trMinimum(t,num)
  }

  trMinimum(l,l(0))
}