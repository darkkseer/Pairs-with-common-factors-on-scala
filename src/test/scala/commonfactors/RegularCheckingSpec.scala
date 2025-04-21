package commonfactors

import org.scalatest.flatspec.AnyFlatSpec

class RegularCheckingSpec extends AnyFlatSpec {
  "CommonFactorUtils checker" should "verify common factor in pairs" in {
    assert(CommonFactorUtils.hasCommonFactor(4, 6))
    assert(CommonFactorUtils.hasCommonFactor(15, 25))
  }

  "CommonFactorUtils checker" should "fail for numbers with non-common factor" in {
    assert(!CommonFactorUtils.hasCommonFactor(1, 5))
    assert(!CommonFactorUtils.hasCommonFactor(1, 5))
  }
}