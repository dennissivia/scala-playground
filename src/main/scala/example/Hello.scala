package example

class Point(x: Int, y: Int) {
  override def toString(): String = "(" + x + ", " + y + ")"
}

class Movie(val name: String, val year: Short)
// campanion object for static methods like factories
object Movie {
  def academyAwardBestMoviesForYear(x: Short) = {
    //This is a match statement, more powerful than a Java switch statement!
    x match {
      case 1930 ⇒ Some(new Movie("All Quiet On the Western Front", 1930))
      case 1931 ⇒ Some(new Movie("Cimarron", 1931))
      case 1932 ⇒ Some(new Movie("Grand Hotel", 1932))
      case _ ⇒ None
    }
  }
}



trait Greeting {
  lazy val greeting: String = "hello"
}

object Hello extends Greeting with App {
  val pt = new Point(1, 2)
  println(Movie.academyAwardBestMoviesForYear(1932).get.name)
  println(pt)
  println(greeting)
}

