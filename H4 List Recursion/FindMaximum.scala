import scala.io.StdIn.readLine

@main def maximumMain() = {
  val numbers = readLine().split(" ").map(_.toInt).toList
  val result = maximum(numbers)
  println(s"Maximum is $result")
}

def maximum(list: List[Int]): Int = list match {
  case Nil => 0
  case head :: tail => if(tail.length == 0) head else  (if(head > maximum(tail)) head else (maximum(tail)))
}