import scala.io.StdIn.readLine

  @main def countOddMain() = {
    val numbers = readLine().split(" ").map(_.toInt).toList
    val total = countOdd(numbers)
    println(s"List contains $total odd numbers")
}

  def countOdd(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => if(head % 2 != 0) 1 + countOdd(tail) else  0 + countOdd(tail)
}
