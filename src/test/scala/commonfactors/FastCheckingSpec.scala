package commonfactors

import org.scalatest.flatspec.AnyFlatSpec

class FastCheckingSpec extends AnyFlatSpec {
  "Common Factor Checker" should "verify common factor numbers quickly" in {
    assert(CommonFactorUtils.hasCommonFactor(4, 6))
    assert(!CommonFactorUtils.hasCommonFactor(1, 5))
  }
}
