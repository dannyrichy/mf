package scripts

import sys.process._
import java.net.URL
import java.io.File
import scala.language.postfixOps

object downloader {

  def goo() = {
    new URL("http://google.com") #> new File("D://projects/Output.html") !!
  }

}
