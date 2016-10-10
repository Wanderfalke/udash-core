/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package api

import io.udash.wrappers.highcharts.HighchartsUtils._
import io.udash.wrappers.highcharts.config

import scala.scalajs.js

@js.native
trait Legend extends js.Object {
  def update(options: config.legend.Legend, redraw: Boolean = js.native): Unit = js.native
}


