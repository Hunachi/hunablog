import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event

fun main() {
}

fun HTMLElement.onClick(event: (Event) -> Unit) {
    this.addEventListener("click", event)
}