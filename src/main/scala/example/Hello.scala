package example

class Point(x: Int, y: Int) {
  override def toString(): String = "(" + x + ", " + y + ")"
}

trait Greeting {
  lazy val greeting: String = "hello"
}

object Hello extends Greeting with App {
  val pt = new Point(1, 2)
  println(Movie.academyAwardBestMoviesForYear(1932).get.name)
  WorkWithTuple.run()
  HigherOrderFunctions.run()
  
  println(pt)
  println(greeting)
}

