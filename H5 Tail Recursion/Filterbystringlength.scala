import scala.annotation.tailrec
import scala.io.StdIn.readLine

@main def filterStringLengthMain() = {
  val strings = readLine().split(" ").toList
  val length = readLine().toInt
  val filteredStrings = filterStringLength(strings, length)
  println(filteredStrings.mkString(" "))
}

def filterStringLength(list: List[String], length: Int): List[String] = {
  @tailrec
  def trFilterStringLength(list: List[String], length: Int, acc: List[String]): List[String] = list match {
    case Nil => acc
    case h::t => if(h.length >= length) trFilterStringLength(t,length,acc:+h) else trFilterStringLength(t,length,acc)
  }

  trFilterStringLength(list, length, List())
}