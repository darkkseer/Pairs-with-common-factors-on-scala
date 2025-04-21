package commonfactors

import org.scalatest.flatspec.AnyFlatSpec

class CommonFactorFastSpec extends AnyFlatSpec with CommonFactorBehaviors {

  import TestValues._

  "Fast CommonFactorUtils.hasCommonFactor" should behave like {
    forAll(primePairs) { (a, b) =>
      it should s"return false for relatively prime numbers ($a, $b)" in {
        assert(!CommonFactorUtils.hasCommonFactor(a, b))
      }
    }
    forAll(commonFactorPairs) { (a, b) =>
      it should s"return true for numbers with common factors ($a, $b)" in {
        assert(CommonFactorUtils.hasCommonFactor(a, b))
      }
    }
  }

  "Fast CommonFactorUtils.primeFactors" should behave like {
    forAll(primeFactorData) { (n, expectedFactors) =>
      it should s"return $expectedFactors for $n" in {
        assert(CommonFactorUtils.primeFactors(n) == expectedFactors)
      }
    }
  }

  "Fast CommonFactorUtils.computeA" should behave like {
    forAll(aValues) { (n, expectedValue) =>
      it should s"return $expectedValue for a($n)" in {
        assert(CommonFactorUtils.computeA(n) == expectedValue)
      }
    }
  }
}
