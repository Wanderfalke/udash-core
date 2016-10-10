/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.treemap

import io.udash.wrappers.highcharts.HighchartsUtils._

import scala.scalajs.js
import scala.scalajs.js.`|`


//TODO not verified
@js.annotation.ScalaJSDefined
class SeriesTreemapLevels extends js.Object {

  /**
    * Can set borderColor on all points which lies on the same level.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Set the dash style of the border of all the point which lies on the level.
    * See <a href"#plotOptions.scatter.dashStyle">plotOptions.scatter.dashStyle</a> for possible options.
    */
  val borderDashStyle: js.UndefOr[String] = js.undefined

  /**
    * Can set the borderWidth on all points which lies on the same level.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Can set a color on all points which lies on the same level.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Can set the options of dataLabels on each point which lies on the level.
    * <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a> for possible values.
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * Can set the layoutAlgorithm option on a specific level. 
    */
  val layoutAlgorithm: js.UndefOr[String] = js.undefined

  /**
    * Can set the layoutStartingDirection option on a specific level.
    */
  val layoutStartingDirection: js.UndefOr[String] = js.undefined

  /**
    * Decides which level takes effect from the options set in the levels object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/treemap-levels/" target="_blank">Styling of both levels</a>
    */
  val level: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapLevels {
  /**
    * @param borderColor Can set borderColor on all points which lies on the same level.
    * @param borderDashStyle Set the dash style of the border of all the point which lies on the level.. See <a href"#plotOptions.scatter.dashStyle">plotOptions.scatter.dashStyle</a> for possible options.
    * @param borderWidth Can set the borderWidth on all points which lies on the same level.
    * @param color Can set a color on all points which lies on the same level.
    * @param dataLabels Can set the options of dataLabels on each point which lies on the level.. <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a> for possible values.
    * @param layoutAlgorithm Can set the layoutAlgorithm option on a specific level. 
    * @param layoutStartingDirection Can set the layoutStartingDirection option on a specific level.
    * @param level Decides which level takes effect from the options set in the levels object.
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, borderDashStyle: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, layoutAlgorithm: js.UndefOr[String] = js.undefined, layoutStartingDirection: js.UndefOr[String] = js.undefined, level: js.UndefOr[Double] = js.undefined): SeriesTreemapLevels = {
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderDashStyleOuter: js.UndefOr[String] = borderDashStyle
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val layoutAlgorithmOuter: js.UndefOr[String] = layoutAlgorithm
    val layoutStartingDirectionOuter: js.UndefOr[String] = layoutStartingDirection
    val levelOuter: js.UndefOr[Double] = level
    new SeriesTreemapLevels {
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderDashStyle: js.UndefOr[String] = borderDashStyleOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val layoutAlgorithm: js.UndefOr[String] = layoutAlgorithmOuter
      override val layoutStartingDirection: js.UndefOr[String] = layoutStartingDirectionOuter
      override val level: js.UndefOr[Double] = levelOuter
    }
  }
}
