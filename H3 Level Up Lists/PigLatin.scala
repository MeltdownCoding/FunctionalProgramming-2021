import scala.io.StdIn.readLine
object PigLatin extends App{
  var a = readLine().split(" ")
  val i = 0
  for(i <- 0 to (a.length - 1)){
    if(i == a.length - 1) print(a(i).substring(1) + a(i).charAt(0) + "ay ")
    else print(a(i).substring(1) + a(i).charAt(0) + "ay ")
  }
}