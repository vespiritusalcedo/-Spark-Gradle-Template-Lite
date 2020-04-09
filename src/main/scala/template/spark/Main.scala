package template.spark

import org.apache.spark.sql.functions._
import template.spark.utils.InitSpark

final case class Person(firstName: String, lastName: String,
                        country: String, age: Int)

object Main extends InitSpark {

  def main(args: Array[String]): Unit = {
    import spark.implicits._

    val sparkVersion = spark.version
    val scalaVersion = util.Properties.versionNumberString


    println("SPARK VERSION = " + sparkVersion)
    println("SCALA VERSION = " + scalaVersion)


    close()
  }
}
