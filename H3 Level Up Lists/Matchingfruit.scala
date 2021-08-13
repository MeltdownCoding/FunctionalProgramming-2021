import scala.io.Source.stdin
object Matchingfruit extends App {
  def matching(word:String, aList:List[String]): String = {
    if(aList.length == 1 ){
      if(word.length == aList.head.length & word.head.toUpper == aList.head.head) aList.head else ""
    }
    else {
      if(word.length == aList.head.length & word.head.toUpper == aList.head.head) aList.head else "" + matching(word,aList.tail)
    }
  }

  val fruits = List("Apple", "Banana", "Cantaloupe", "Fig", "Grape", "Lime")
  val input = stdin.getLines().toList

  print(input.map(n => matching(n,fruits)).filter(_!="").mkString("\n"))

}