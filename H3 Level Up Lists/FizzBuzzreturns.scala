import scala.io.StdIn.readLine
object FizzBuzzreturns extends App
{
  val numInput = readLine()
  val numString = numInput.split(" ")
  val numbers = numString.map(n => n.toInt)
  for ( i <- 0 to (number.length - 1)) 
  {
    if(number(i)%3 ==0 && number(i)%5 ==0) 
    {
      print("Fizz Buzz" + " ")
    }
    else if (number(i)%3 ==0)
    {
      print("Fizz" + " ")
    }
    else if (number(i)%5 ==0) 
    {
      print("Buzz" + " ")
    }
    else 
    {
      print(number(i) + " ")
    }
}