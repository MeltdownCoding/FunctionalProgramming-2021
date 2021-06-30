object StartswithC extends App {
   val fruits = List("Apple","Banana","Cantaloupe","Cherry","Coconut","Grape","Guava","Strawberry","Lemon","Lime")
    for ( i <- 0 to (fruits.length - 1)) {
    if(fruits(i).charAt(0)=='C'){
        println(fruits(i))
    }
}
}