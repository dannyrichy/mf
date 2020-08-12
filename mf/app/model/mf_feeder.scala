package model

import play.api.libs.json.{Json, OFormat}

case class mf_feeder(id:Long,
                     mf_id:Long,
                     mf_type_id:Long,
                     date:java.sql.Date,
                     nav:Float)

object mf_feeder{
  implicit val mf_format: OFormat[mf_feeder] = Json.format[mf_feeder]
}