import sbt._

object Dependencies {

  private val scalaTestVersion = "3.2.12" 

  lazy val testLibs = List(
    "org.scalatest" %% "scalatest" % scalaTestVersion,
  ).map(_ % Test)

}
