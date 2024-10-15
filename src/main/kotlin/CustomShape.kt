import androidx.compose.runtime.Immutable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

@Immutable
interface Shape {
    fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density): Outline
}

class CustomShape: Shape {
    override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density): Outline {
        return Outline.Generic(path = drawCustomPath(size = size))
    }
}

fun drawCustomPath(size: Size): Path {
    return Path().apply {
        reset()
        moveTo(size.width, size.height) // inizio in basso a destra
        lineTo(size.width - (size.width / 2f * 5f / 3f), size.height) // linea in basso
        lineTo(0f, size.height / 2f * 5f / 3f) // angolo in basso a sinistra
        lineTo(0f, 0f) // lina a sinistra
        lineTo(size.width / 2f * 5f / 3f, 0f) // linea in alto
        lineTo(size.width, size.height - (size.height / 2f * 5f / 3f)) // angolo in alto a destra
        lineTo(size.width, size.height) // linea di destra
        lineTo(size.width / 2f * 5f / 3f, size.height / 2f * 5f / 3f) // angolo in basso a destra
        lineTo(size.width / 2f * 5f / 3f, 0f) // linea tridimensionale in basso
        moveTo(size.width / 2f * 5f / 3f, size.height / 2f * 5f / 3f) // spostati sull'angolo
        lineTo(0f, size.height / 2f * 5f / 3f)
        close()
    }
}