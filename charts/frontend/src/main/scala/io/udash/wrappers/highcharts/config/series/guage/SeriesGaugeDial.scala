/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.guage

import io.udash.wrappers.highcharts.HighchartsUtils._

import scala.scalajs.js
import scala.scalajs.js.`|`


//TODO not verified
@js.annotation.ScalaJSDefined
class SeriesGaugeDial extends js.Object {

  /**
    * The background or fill color of the gauge's dial. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The length of the dial's base part, relative to the total radius or length of the dial. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
    */
  val baseLength: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of the base of the gauge dial. The base is the part closest to the pivot, defined by baseLength. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
    */
  val baseWidth: js.UndefOr[Double] = js.undefined

  /**
    * The border color or stroke of the gauge's dial. By default, the borderWidth is 0, so this must be set in addition to a custom border color.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the gauge dial border in pixels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The radius or length of the dial, in percentages relative to the radius of the gauge itself.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
    */
  val radius: js.UndefOr[String] = js.undefined

  /**
    * The length of the dial's rear end, the part that extends out on the other side of the pivot. Relative to the dial's length. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
    */
  val rearLength: js.UndefOr[String] = js.undefined

  /**
    * The width of the top of the dial, closest to the perimeter. The pivot narrows in from the base to the top.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
    */
  val topWidth: js.UndefOr[Double] = js.undefined
}

object SeriesGaugeDial {
  /**
    * @param backgroundColor The background or fill color of the gauge's dial. 
    * @param baseLength The length of the dial's base part, relative to the total radius or length of the dial. 
    * @param baseWidth The pixel width of the base of the gauge dial. The base is the part closest to the pivot, defined by baseLength. 
    * @param borderColor The border color or stroke of the gauge's dial. By default, the borderWidth is 0, so this must be set in addition to a custom border color.
    * @param borderWidth The width of the gauge dial border in pixels.
    * @param radius The radius or length of the dial, in percentages relative to the radius of the gauge itself.
    * @param rearLength The length of the dial's rear end, the part that extends out on the other side of the pivot. Relative to the dial's length. 
    * @param topWidth The width of the top of the dial, closest to the perimeter. The pivot narrows in from the base to the top.
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, baseLength: js.UndefOr[String] = js.undefined, baseWidth: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[String] = js.undefined, rearLength: js.UndefOr[String] = js.undefined, topWidth: js.UndefOr[Double] = js.undefined): SeriesGaugeDial = {
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val baseLengthOuter: js.UndefOr[String] = baseLength
    val baseWidthOuter: js.UndefOr[Double] = baseWidth
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val radiusOuter: js.UndefOr[String] = radius
    val rearLengthOuter: js.UndefOr[String] = rearLength
    val topWidthOuter: js.UndefOr[Double] = topWidth
    new SeriesGaugeDial {
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val baseLength: js.UndefOr[String] = baseLengthOuter
      override val baseWidth: js.UndefOr[Double] = baseWidthOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val radius: js.UndefOr[String] = radiusOuter
      override val rearLength: js.UndefOr[String] = rearLengthOuter
      override val topWidth: js.UndefOr[Double] = topWidthOuter
    }
  }
}
