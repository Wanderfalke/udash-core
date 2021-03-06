package io.udash.bootstrap
package form

import io.udash.bootstrap.UdashBootstrap.ComponentId
import org.scalajs.dom

import scalatags.JsDom.all._

class UdashInputGroup private(groupSize: InputGroupSize, override val componentId: ComponentId)(content: Modifier*) extends UdashBootstrapComponent {
  override lazy val render =
    div(BootstrapStyles.Form.inputGroup, groupSize)(
      content
    ).render
}

object UdashInputGroup {
  /**
    * Creates input group. More: <a href="http://getbootstrap.com/components/#input-groups">Bootstrap Docs</a>.
    *
    * @param groupSize   Size of the inputs in group.
    * @param componentId Id of the root DOM node.
    * @param content     Group content.
    * @return `UdashInputGroup` component, call render to create DOM element.
    */
  def apply(groupSize: InputGroupSize = InputGroupSize.Default,
            componentId: ComponentId = UdashBootstrap.newId())(content: Modifier*): UdashInputGroup =
    new UdashInputGroup(groupSize, componentId)(content)

  /** Creates addon element for input group. */
  def addon(content: Modifier*): Modifier =
    span(BootstrapStyles.Form.inputGroupAddon)(content)

  /** Wraps buttons for input group. */
  def buttons(content: Modifier*): Modifier =
    div(BootstrapStyles.Form.inputGroupBtn)(content)

  /** Wraps input for input group. */
  def input(el: dom.Element): dom.Element = {
    BootstrapStyles.Form.formControl.addTo(el)
    el
  }
}