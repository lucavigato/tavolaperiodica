import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Detail(nome: String) {

    val windowHeight = LocalWindowInfo.current.containerSize.height.dp

    val dimension = windowHeight / 11.5f
    val fontSize = dimension + ((dimension - dimension / 2 * 5 / 3) / -2 * 6)
    val nameSize = dimension + ((dimension - dimension / 2 * 5 / 3) / -2 * 6)
    val fontOffset = (dimension - dimension / 2 * 5 / 3) / -2

    val showShort = remember { mutableStateOf(true)}

    val index = remember { mutableIntStateOf(value = Elemento().numero(nome))}
    val elements: List<String> = listOf("", "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og", "")
    val padding = 10.dp

    val windowWidth = LocalWindowInfo.current.containerSize.width.dp / 2f
    val buttonSize = (windowWidth - padding * 4) / 2

    Column(modifier = Modifier.verticalScroll(rememberScrollState()).fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(padding).fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            Box(modifier = Modifier.padding(padding)) {
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

            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
                Text(
                    text = Elemento().nItaElem(elements[index.intValue]),
                    modifier = Modifier.padding(padding),
                    fontSize = with(LocalDensity.current) { nameSize.toSp() }
                )
                Text(
                    text = Elemento().classeIta(elements[index.intValue]),
                    modifier = Modifier.padding(horizontal = padding).background(
                        color = getColor(
                            Elemento().classeIta(elements[index.intValue]),
                            elements[index.intValue]
                        ),
                        RoundedCornerShape(8.dp)
                    ).padding((padding.value / 2).dp)
                )
                Text(
                    text = "Numero atomico: ${Elemento().numero(elements[index.intValue])}",
                    modifier = Modifier.padding(padding).background(
                        color = getColor(
                            Elemento().classeIta(elements[index.intValue]),
                            elements[index.intValue]
                        ),
                        RoundedCornerShape(8.dp)
                    ).padding((padding.value / 2).dp)
                )
                Text(
                    text = "Group: ${Elemento().gruppo(elements[index.intValue])}",
                    modifier = Modifier.padding(horizontal = padding).background(
                        color = getColor(
                            Elemento().classeIta(elements[index.intValue]),
                            elements[index.intValue]
                        ),
                        RoundedCornerShape(8.dp)
                    ).padding((padding.value / 2).dp)
                )
                Text(
                    text = "Periodo: ${Elemento().periodo(elements[index.intValue])}",
                    modifier = Modifier.padding(padding).background(
                        color = getColor(
                            Elemento().classeIta(elements[index.intValue]),
                            elements[index.intValue]
                        ),
                        RoundedCornerShape(8.dp)
                    ).padding((padding.value / 2).dp)
                )
            }
        }
        Row(modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            Button(modifier = Modifier
                .padding((padding.value / 2).dp)
                .width(buttonSize),
                onClick = {
                    if (elements[index.intValue - 1] != "") {
                        index.intValue -= 1
                    }
                },
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(text = elements[index.intValue - 1])
            }

            Button(modifier = Modifier
                .padding((padding.value / 2).dp)
                .width(buttonSize),
                onClick = {
                    if (elements[index.intValue + 1] != "") {
                        index.intValue += 1
                    }
                },
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(text = elements[index.intValue + 1])
            }
        }

        Column(modifier = Modifier.padding(padding).fillMaxWidth().background(Color.LightGray, RoundedCornerShape(8.dp))) {
            Text(text = "Massa molare: ${Elemento().massaMolare(elements[index.intValue])}", modifier = Modifier.padding(padding))
            Text(text = "Numeri di ossidazione: ${Elemento().ossidazione(elements[index.intValue])}", modifier = Modifier.padding(padding))
            Text(text = "Configurazione elettronica: ${ if (showShort.value) Elemento().confEl(elements[index.intValue]) else Elemento().fullConfEl(elements[index.intValue])}",
                modifier = Modifier
                    .padding(padding)
                    .clickable {
                        showShort.value = !showShort.value
                    },
                color = Color.Blue
            )

            Text(text = "Elettronegatività: ${Elemento().elettro(elements[index.intValue])} Pauling", modifier = Modifier.padding(padding))
            Text(text = "Stato in SATP: ${Elemento().satpIta(elements[index.intValue])}", modifier = Modifier.padding(padding))
            Text(text = "Temperatura di fusione: ${Elemento().fusione(elements[index.intValue])} K", modifier = Modifier.padding(padding))
            Text(text = "Temperatura di ebollizione: ${Elemento().ebolli(elements[index.intValue])} K", modifier = Modifier.padding(padding))
            Text(text = "Densità: ${Elemento().densità(elements[index.intValue])} g/L", modifier = Modifier.padding(padding))
        }
        HorizontalDivider()
        Column(modifier = Modifier.padding(padding).fillMaxWidth().background(Color.LightGray, RoundedCornerShape(8.dp))) {
            Text(text = "Protoni: ${Elemento().numero(elements[index.intValue])}", modifier = Modifier.padding(padding))
            Text(text = "Elettroni: ${Elemento().numero(elements[index.intValue])}", modifier = Modifier.padding(padding))
            Text(text = "Neutroni: ${Elemento().neutroni(elements[index.intValue])}", modifier = Modifier.padding(padding))
            Text(text = "Raggio atomico: ${Elemento().raggio(elements[index.intValue])} pm", modifier = Modifier.padding(padding))
        }
        HorizontalDivider()
        Column(modifier = Modifier.padding(padding).fillMaxWidth().background(Color.LightGray, RoundedCornerShape(8.dp))) {
            Text(text = "Radioattivo: ${if (Elemento().radioattivo(elements[index.intValue])) "Radioattivo" else "Non radioattivo"}", modifier = Modifier.padding(padding))
        }
        HorizontalDivider()
        Elemento().isotopiIta(elements[index.intValue]).forEach { index ->
            Column(modifier = Modifier.padding(padding).fillMaxWidth().background(Color.LightGray, RoundedCornerShape(8.dp))) {
                Text(text = "Isotopo: ${index[0]}", modifier = Modifier.padding(padding))
                Text(text = "Abbondanza: ${index[1]}", modifier = Modifier.padding(padding))
                Text(text = "Emivita: ${index[2]}", modifier = Modifier.padding(padding))
                if (index[2] != "Stabile") {
                    Text(text = "Decadimento: ${index[3]}", modifier = Modifier.padding(padding))
                    Text(text = "Energia di decadimento: ${index[4]} MeV", modifier = Modifier.padding(padding))
                    Text(text = "Prodotto: ${index[5]}", modifier = Modifier.padding(padding))
                }
            }
            HorizontalDivider()
        }
    }
}