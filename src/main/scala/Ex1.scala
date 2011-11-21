object Ex1 {
	
	def sumMultiples(upperBound : Int) : Int = {
		var result = 0
		(1 to upperBound - 1 ).foreach(x => if ( x % 3 == 0 || x % 5 == 0 ) result += x)
		result
	}

	def sumMultiplesFilter(upperBound : Int) : Int = {
		(1 until upperBound).filter(x => x % 3 == 0 || x % 5 == 0).foldLeft(0)(_ + _)
	}

	def main(args : Array[String]) {
		println(sumMultiples(1000))
	}
}
