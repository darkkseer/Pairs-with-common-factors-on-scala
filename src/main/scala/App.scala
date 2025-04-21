import commonfactors.CommonFactorUtils

object App {
  def main(args: Array[String]): Unit = {

    val nValues = List(10, 100, 1000, 10000, 100000) 

    for (n <- nValues) {
      val aN = CommonFactorUtils.computeA(n)
      println(s"a($n) = $aN")
    }

    val num1 = 12
    val num2 = 18
    if (CommonFactorUtils.hasCommonFactor(num1, num2)) {
      println(s"$num1 и $num2 имеют общий простой делитель.")
    } else {
      println(s"$num1 и $num2 не имеют общих простых делителей.")
    }

    val number = 28
    val factors = CommonFactorUtils.primeFactors(number)
    println(s"Простые множители числа $number: $factors")
  }
}

