package components

import kotlinx.css.*
import react.*
import styled.css
import styled.styledDiv

external interface HeaderProps: RProps {
    var userName: String
}


fun RBuilder.header(handler: HeaderProps.() -> Unit): ReactElement {
    return child(Header::class) {
        this.attrs(handler)
    }
}

class Header: RComponent<HeaderProps, RState>() {
    override fun RBuilder.render() {

        styledDiv {
            css {
                overflow = Overflow.hidden
                fontSize = 28.px
            }
            styledDiv{
                css{
                    float = kotlinx.css.Float.left
                    fontWeight = FontWeight.bold
                    textAlign = TextAlign.center
                    padding = "14px 16px"
                }
                +"_Game of Crosses"
            }
            styledDiv{
                css{
                    float = kotlinx.css.Float.right
                    textAlign = TextAlign.center
                    padding = "14px 16px"
                }
                +"${props.userName}"
            }

        }
    }
}