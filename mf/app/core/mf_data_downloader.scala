package core

import java.io.{BufferedReader, InputStreamReader}
import java.net.URL

import scala.collection.mutable.ArrayBuffer
import scala.language.postfixOps

object mf_data_downloader {

  val url_mf = new url_constructor(mf_number = 55, mf_type = 1)

  def goo() = {
    val content = new BufferedReader(
      new InputStreamReader(
      new URL(url_mf.url("24-06-2020", "24-06-2020")).openStream()
      )
    )
    val buffer = new ArrayBuffer[String]()
    var inputLine = content.readLine()
    while (inputLine != null) {
      if (!inputLine.trim.eq("")){
        buffer+= inputLine.trim
      }
      inputLine = content.readLine()
    }
    content.close

  }

}
