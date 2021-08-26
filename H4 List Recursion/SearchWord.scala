import scala.io.StdIn.readLine

@main def searchWordMain() = {
  val words = readLine().split(" ").toList
  val searchWord = readLine()
  val result = search(words, searchWord)
  println(if (result) "found" else "not found")
}

def search(list: List[String], element: String): Boolean = list match {
  case Nil => false
  case head :: tail => if(element.equals(head)) true else  search(tail,element)
}

