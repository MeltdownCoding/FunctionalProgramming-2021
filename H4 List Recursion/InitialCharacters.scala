import scala.io.StdIn.readLine

  @main def initialsMain() = {
    val words = readLine().split(" ").toList
    val result = initials(words)
    println(result)
  }

  def initials(list: List[String]): String = list match {
    case Nil => ""
    case head :: tail => head.charAt(0) + initials(tail)
  }
