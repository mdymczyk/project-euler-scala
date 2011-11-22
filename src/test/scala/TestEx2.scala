import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class TestEx2 extends FunSuite with ShouldMatchers {

  test("should compute proper sum")  {
    Ex2.sumFibon(4000000) should equal (4613732)
  }

}
