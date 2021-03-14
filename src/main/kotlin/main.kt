import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.events.Event

fun main() {
    // TODO
}

fun HTMLButtonElement.onClick(event: (Event) -> Unit){
    this.addEventListener("click", event)
}