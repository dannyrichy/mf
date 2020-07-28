package core

import java.io.File
import java.net.URL

import scala.language.postfixOps
import scala.sys.process._

object downloader {

  val url_mf = new url_constructor(mf_number = 55,mf_type = 1)

  def goo(): String = {
    new URL(url_mf.url("24-06-2020","24-06-2020")) #> new File("D://projects/mutual_funds/Output.txt") !!
  }

}
