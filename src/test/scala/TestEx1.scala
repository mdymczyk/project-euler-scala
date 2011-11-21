import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class TestEx1 extends FunSuite {

	test("should compute proper sum")  {
		assert(Ex1.sumMultiples(1000) === 233168)
	}

	test("expecting a proper result") {
		expect(233168) {
			Ex1.sumMultiples(1000)
		}
	}
}
