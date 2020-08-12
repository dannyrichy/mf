package core

import java.io.{BufferedReader, InputStream, InputStreamReader}

import scala.collection.mutable.ArrayBuffer

object fileHandler {
  def file_reader(file_stream: InputStream): Unit = {
    val content = new BufferedReader(
      new InputStreamReader(
        file_stream
      )
    )
    // The buffer will store each line as elements in array
    val buffer = new ArrayBuffer[String]()
    var inputLine = content.readLine()
    while (inputLine != null) {
      if (!inputLine.trim.eq("")) {
        buffer += inputLine.trim
      }
      inputLine = content.readLine()
    }
    content.close()
  }
}
