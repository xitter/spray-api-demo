package com.xitter.serializers

import java.text.SimpleDateFormat

import org.json4s.ext.JodaTimeSerializers
import org.json4s.{DefaultFormats, Formats}
import spray.httpx.Json4sSupport

trait JsonSupport extends Json4sSupport {

  implicit def json4sFormats: Formats = customDateFormat ++ JodaTimeSerializers.all

  val customDateFormat = new DefaultFormats {
    override def dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
  }
  
}