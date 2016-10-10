/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package pane

import io.udash.wrappers.highcharts.HighchartsUtils._

import scala.scalajs.js
import scala.scalajs.js.`|`

// TODO not verified
@js.annotation.ScalaJSDefined
class PaneBackground extends js.Object {

  /**
    * The background color or gradient for the pane.
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pane background border color.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel border width of the pane background.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The inner radius of the pane background. Can be either numeric (pixels) or a percentage string.
    */
  val innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * The outer radius of the circular pane background. Can be either numeric (pixels) or a percentage string.
    */
  val outerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * Tha shape of the pane background. When <code>solid</code>, the background is circular. When <code>arc</code>, the background extends only from the min to the max of the value axis.
    */
  val shape: js.UndefOr[String] = js.undefined
}

object PaneBackground {
  /**
    * @param backgroundColor The background color or gradient for the pane.
    * @param borderColor The pane background border color.
    * @param borderWidth The pixel border width of the pane background.
    * @param innerRadius The inner radius of the pane background. Can be either numeric (pixels) or a percentage string.
    * @param outerRadius The outer radius of the circular pane background. Can be either numeric (pixels) or a percentage string.
    * @param shape Tha shape of the pane background. When <code>solid</code>, the background is circular. When <code>arc</code>, the background extends only from the min to the max of the value axis.
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, innerRadius: js.UndefOr[Double | String] = js.undefined, outerRadius: js.UndefOr[Double | String] = js.undefined, shape: js.UndefOr[String] = js.undefined): PaneBackground = {
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val innerRadiusOuter: js.UndefOr[Double | String] = innerRadius
    val outerRadiusOuter: js.UndefOr[Double | String] = outerRadius
    val shapeOuter: js.UndefOr[String] = shape
    new PaneBackground {
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val innerRadius: js.UndefOr[Double | String] = innerRadiusOuter
      override val outerRadius: js.UndefOr[Double | String] = outerRadiusOuter
      override val shape: js.UndefOr[String] = shapeOuter
    }
  }
}
