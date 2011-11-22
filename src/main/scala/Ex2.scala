object Ex2 {
  def sumFibon(bound : Int) : Int = {
    var i, j = 1
    var sum = 0

    while (j < bound) {
      val temp = i
      i = j
      j = temp + j
      if (j % 2 == 0) sum += j
    }

    sum
  }

  def sumFibonLazy() : Int = {
    lazy val fib : Stream[Int] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail).map(p => p._1 + p._2)))
    fib.filter(_ % 2 == 0).takeWhile(_ <= 4000000).foldLeft(0)(_ + _)
  }
	
  def main(args : Array[String]) {
    println(sumFibon(4000000))
  }
}
