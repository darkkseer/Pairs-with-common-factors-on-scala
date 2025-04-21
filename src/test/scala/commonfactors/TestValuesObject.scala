package commonfactors

import org.scalatest.prop.Tables._ //Import Tables

object TestValues {

  val hasCommonFactorTestCases = Table(
    ("a", "b", "expected"),
    (4, 6, true),   // Имеют общий делитель
    (5, 7, false),  // Взаимно простые
    (12, 18, true),  // Имеют общий делитель
    (2, 3, false)   // Взаимно простые
  )

  val primeFactorTestCases = Table(
    ("n", "expectedFactors"),
    (2, List(2)),
    (6, List(2, 3)),
    (28, List(2, 2, 7)),
    (72, List(2, 2, 2, 3, 3))
  )

  val computeATestCases = Table(
    ("n", "expectedValue"),
    (1, 0L),
    (2, 0L),
    (3, 0L),
    (4, 1L),
    (5, 1L),
    (6, 4L)
  )
}
