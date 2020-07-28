package core

import java.text.SimpleDateFormat
import java.util.Date

class url_constructor(mf_number: Int, mf_type: Int = 1) {
  protected val common_string: String = "http://portal.amfiindia.com/DownloadNAVHistoryReport_Po.aspx?"

  val url: String = common_string
    .concat("mf=%s&".format(mf_number.toString))
    .concat("tp=%s&".format(mf_type.toString))
    .concat("frmdt=%s&todt=%s")

  def url(from_date: Any, end_date: Any): String = {

    url.format(date_formatter(from_date), date_formatter(end_date))
  }

  protected def date_formatter(value: Any): String = value match {
    case d: Date => new SimpleDateFormat("dd-MMM-yyyy").format(d)
    case s: String => {
      new SimpleDateFormat("dd-MMM-yyyy").format(
        new SimpleDateFormat("dd-MM-yyyy").parse(s)
      )
    }
  }

}
