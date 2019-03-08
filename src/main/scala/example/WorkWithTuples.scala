package example

object WorkWithTuple{
  def run(){
    val tuple5 = ("a", 1, 2.2, 1111, "five")
    val tuple  = ("apple", "dog")
    val fruit  = tuple._1
    val animal = tuple._2
    println(fruit)
    println(animal)
    println(tuple5._4)
  }
}
