package commonfactors

import org.scalatest.flatspec.AnyFlatSpec

class CommonFactorRegularSpec extends AnyFlatSpec with CommonFactorBehaviors {

  import TestValues._

  "Regular CommonFactorUtils" should {
    behave like hasCommonFactor(4, 6)  
    behave like hasCommonFactor(5, 7)  

    behave like primeFactors(28, List(2, 2, 7))
    behave like computeA(6, 4L)
  }
}
