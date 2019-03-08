package example


object HigherOrderFunctions{
    def inc = { x: Int => x + 1 }
    def dec = ( x: Int) => x - 1
    def run() {

        val incrementer = 1
        def closure = { x: Int ⇒
            x + incrementer
        }
        val result1 = closure(10)
        val x = inc.apply(1)
        val y = inc(1)
        println("closure result: " + result1 + s". x = $x; y = $y")
    }
}