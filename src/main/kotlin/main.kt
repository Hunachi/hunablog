import kotlinx.browser.document
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLHeadingElement
import org.w3c.dom.events.Event

fun main() {
    var flag = false
    val button = document.getElementById("hunaButton") as HTMLButtonElement
    val text = document.getElementById("hunaText") as HTMLHeadingElement
    button.onClick{
        flag = !flag
        if (flag) {
            button.textContent = "clicled"
            text.textContent = "nyan"
        } else {
            button.textContent = "Button"
            text.textContent = "wan"
        }
    }
}

fun HTMLButtonElement.onClick(event: (Event) -> Unit){
    this.addEventListener("click", event)
}