package commonfactors

object CommonFactorUtils {

  def hasCommonFactor(a: Int, b: Int): Boolean = {
    if (a <= 1 || b <= 1) false /
    else gcd(a, b) > 1
  }

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def primeFactors(n: Int): List[Int] = {
    def primeFactorsRecursive(n: Int, divisor: Int = 2, factors: List[Int] = List()): List[Int] = {
      if (n <= 1) {
        factors
      } else if (n % divisor == 0) {
        primeFactorsRecursive(n / divisor, divisor, divisor :: factors)
      } else {
        primeFactorsRecursive(n, divisor + 1, factors)
      }
    }

    primeFactorsRecursive(n).reverse.distinct 
  }


  def computePhi(n: Int): Int = {
    (1 to n).count(i => gcd(i, n) == 1)
  }

  def computeA(n: Int): Long = {
    val totalPairs = (n.toLong * (n - 1).toLong) / 2 // nC2
    var commonFactorPairs = 0L
    for (x <- 2 to n; y <- (x + 1) to n) {
      if (hasCommonFactor(x, y)) {
        commonFactorPairs += 1
      }
    }
    commonFactorPairs
  }

  def checkCommonFactors(numbers: Seq[Int]): Boolean = {
    if (numbers.length < 2) false
    else numbers.combinations(2).exists(pair => hasCommonFactor(pair(0), pair(1)))
  }
}

