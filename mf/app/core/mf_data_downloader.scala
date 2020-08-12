package core

import java.net.URL

import scala.language.postfixOps

object mf_data_downloader {

  val url_mf = new url_constructor(mf_number = 55, mf_type = 1)


  def goo() = {
    // Converting URL to InputStreamReader which is fed to Buffered Reader.
    val content = new URL(url_mf.url("24-06-2020", "24-06-2020")).openStream()

  }

}
