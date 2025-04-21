package commonfactors

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

trait CommonFactorBehaviors extends AnyFlatSpec with Matchers with TableDrivenPropertyChecks {
  this: AnyFlatSpec =>

  def hasCommonFactorBehavior(a: Int, b: Int, expected: Boolean): Unit = {
    it should s"return $expected when checking if $a and $b have a common factor" in {
      CommonFactorUtils.hasCommonFactor(a, b) shouldBe expected
    }
  }

  def primeFactorsBehavior(n: Int, expectedFactors: List[Int]): Unit = {
    it should s"return $expectedFactors as prime factors of $n" in {
      CommonFactorUtils.primeFactors(n) shouldBe expectedFactors
    }
  }

  def computeABehavior(n: Int, expectedValue: Long): Unit = {
    it should s"return $expectedValue for a($n)" in {
      CommonFactorUtils.computeA(n) shouldBe expectedValue
    }
  }
}
