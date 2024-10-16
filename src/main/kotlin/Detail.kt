import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLocalization
import androidx.compose.ui.platform.LocalViewConfiguration
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import kotlin.system.exitProcess


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Detail(nome: String) {

    val configuration = LocalWindowInfo.current
    val screenHeight = configuration.containerSize.height.dp

    val dimension = screenHeight / 11.5f
    val fontSize = dimension + ((dimension - dimension / 2 * 5 / 3) / -2 * 6)
    val nameSize = dimension + ((dimension - dimension / 2 * 5 / 3) / -2 * 6)
    val fontOffset = (dimension - dimension / 2 * 5 / 3) / -2

    val showShort = remember { mutableStateOf(true)}

    val index = remember { mutableIntStateOf(value = Elemento().numero(nome))}
    val elements: List<String> = listOf("", "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og", "")
    val padding = 10.dp

    val screenWidth = configuration.containerSize.width.dp
    val buttonSize = (screenWidth - padding * 4) / 2

    val isOpen = remember { mutableStateOf(false) }

    //Window(onCloseRequest = { isOpen.value = true }, title = nome) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState()).fillMaxWidth()) {
            Row(
                modifier = Modifier.padding(padding).fillMaxWidth()
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
            ) {
                Box(modifier = Modifier
                    .size(dimension)
                    .graphicsLayer {
                        shape = CustomShape()
                        clip = true
                    }
                    .background(
                        color = getColor(
                            Elemento().classeIta(elements[index.intValue]),
                            elements[index.intValue]
                        )
                    )
                    .drawBehind {
                        drawPath(
                            path = drawCustomPath(size = size),
                            color = Color.Black,
                            style = Stroke(
                                width = 5f
                            )
                        )
                    }
                ) {
                    Text(
                        text = elements[index.intValue],
                        fontSize = with(LocalDensity.current) { fontSize.toSp() },
                        modifier = Modifier.align(alignment = Alignment.Center)
                            .offset(fontOffset, fontOffset)
                    )
                }
            }
        }
    //}
}