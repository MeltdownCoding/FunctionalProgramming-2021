import scala.io.StdIn.readLine
object Currencyconversions extends App {
  val input1 = readLine()
  val numberString = input1.split(" ")
  val baht = numberString.map(n => n.toInt)
  val input2= readLine()
  val currency = input2
  for ( i <- 0 to (baht.length - 1)) 
  {
    if("GBP".equals(currency)) 
    {
      val GBP = baht(i)*0.022
      print("%.2f".format(GBP) + " ")
    }
    else if(currency.equals("USD")) 
    {
      val USD = baht(i)*0.030
      print("%.2f".format(USD) + " ")
    }
    else if(currency.equals("EUR")) 
    {
      val EUR = baht(i)*0.026
      print("%.2f".format(EUR) + " ")
    }
  }
}