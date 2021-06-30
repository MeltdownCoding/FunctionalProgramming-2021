object Lengthatleast7 extends App
{
  val fruits = List("Apple","Banana","Cantaloupe","Cherry","Coconut","Grape","Guava","Strawberry","Lemon","Lime")
  for (i <- 0 to (fruits.length - 1))
  {
    if(fruits(i).length>=7)
    {
      println(fruits(i))
    }
  }
}


