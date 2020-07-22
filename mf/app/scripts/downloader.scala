package scripts

import sys.process._
import java.net.URL
import java.io.File
import scala.language.postfixOps

object downloader {

  def goo() = {
    new URL("http://portal.amfiindia.com/DownloadNAVHistoryReport_Po.aspx?mf=55&tp=1&frmdt=01-Jul-2020&todt=23-Jul-2020") #> new File("D://projects/mutual_funds/Output.txt") !!
  }

}
