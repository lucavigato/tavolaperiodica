import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import java.awt.Toolkit

fun main() = application {
    val elements: List<List<String>> = listOf(
        listOf("H", "Li", "Na", "K", "Rb", "Cs", "Fr", "", ""),
        listOf("", "Be", "Mg", "Ca", "Sr", "Ba", "Ra", "", ""),
        listOf("", "", "", "Sc", "Y", "La", "Ac", "Ce", "Th"),
        listOf("", "", "", "Ti", "Zr", "Hf", "Rf", "Pr", "Pa"),
        listOf("", "", "", "V", "Nb", "Ta", "Db", "Nd", "U"),
        listOf("", "", "", "Cr", "Mo", "W", "Sg", "Pm", "Np"),
        listOf("", "", "", "Mn", "Tc", "Re", "Bh", "Sm", "Pu"),
        listOf("", "", "", "Fe", "Ru", "Os", "Hs", "Eu", "Am"),
        listOf("", "", "", "Co", "Rh", "Ir", "Mt", "Gd", "Cm"),
        listOf("", "", "", "Ni", "Pd", "Pt", "Ds", "Tb", "Bk"),
        listOf("", "", "", "Cu", "Ag", "Au", "Rg", "Dy", "Cf"),
        listOf("", "", "", "Zn", "Cd", "Hg", "Cn", "Ho", "Es"),
        listOf("", "B", "Al", "Ga", "In", "Tl", "Nh", "Er", "Fm"),
        listOf("", "C", "Si", "Ge", "Sn", "Pb", "Fl", "Tm", "Md"),
        listOf("", "N", "P", "As", "Sb", "Bi", "Mc", "Yb", "No"),
        listOf("", "O", "S", "Se", "Te", "Po", "Lv", "Lu", "Lr"),
        listOf("", "F", "Cl", "Br", "I", "At", "Ts", "", ""),
        listOf("He", "Ne", "Ar", "Kr", "Xe", "Rn", "Og", "", "")
    )

    val temi: List<String> = listOf("Default", "Ebollizione", "Elettronegatività", "Fusione", "SATP", "Densità", "Radioattivi")
    val filtri: List<String> = listOf("Metalli alcalini", "Metalli alcalino terrosi", "Metalli del blocco d", "Metalli del blocco p", "Non metalli", "Semimetalli", "Alogeni", "Gas nobili", "Lantanidi", "Attinidi")

    var tema by remember { mutableStateOf("Default") }

    var calcolo by remember { mutableStateOf("") }
    var nomeElemento by remember { mutableStateOf("") }

    var newWindow by remember { mutableStateOf(false) }
    var elementWindow by remember { mutableStateOf(false) }

    val obj: List<String> = listOf(
        "Massa Molare", "Testo", "Elettronegatività", "Formula minima",
        "Gas perfetti", "Conversioni", "Colligative", "Frazione Molare",
        "Moli", "Molarità", "Molalità", "PH Tampone", "PH", "Acid list"
    )

    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(width = Dp.Unspecified, height = Dp.Unspecified),
        title = "Tavola Periodica",
        resizable = false
    ) {

        val screenSize = remember { Toolkit.getDefaultToolkit().screenSize }

        val windowHeight = screenSize.height.dp * 1.5f

        val dimension = windowHeight / 25f
        val fontSize = dimension + ((dimension - dimension / 2 * 5 / 3) / -2 * 6)
        val fontOffset = (dimension - dimension / 2 * 5 / 3) / -2

        MenuBar {
            Menu("Azioni", mnemonic = 'A') {
                Menu("Temi", mnemonic = 'T') {
                    temi.forEach { theme ->
                        Item(text = theme, onClick = { tema = theme })
                    }
                }
                Menu("Filtri", mnemonic = 'F') {
                    filtri.forEach { filter ->
                        Item(text = filter, onClick = { tema = filter })
                    }
                }
            }
            Menu("Calcoli", mnemonic = 'C') {
                obj.forEach { calc ->
                    Item(text = calc, onClick = {
                        calcolo = calc
                        newWindow = true
                    })
                }
            }
        }

        Box(modifier = Modifier.padding(25.dp)) {
            Row {
                elements.forEach { rows ->
                    Column {
                        rows.forEach { elemento ->
                            Box(modifier = Modifier
                                .size(dimension)
                                .padding(1.dp)
                                .graphicsLayer {
                                    shape = CustomShape()
                                    clip = true
                                }
                                .background(color = getColor(tema, elemento))
                                .drawBehind {
                                    drawPath(
                                        path = drawCustomPath(size = size),
                                        color = if (elemento != "") Color.Black else Color.Transparent,
                                        style = Stroke(
                                            width = 1f
                                        )
                                    )
                                }
                                .clickable(onClick = {
                                    nomeElemento = elemento
                                    elementWindow = true
                                },
                                    enabled = elemento != ""
                                )
                            ) {
                                Text(
                                    text = elemento,
                                    fontSize = with(LocalDensity.current) { fontSize.toSp() },
                                    modifier = Modifier.align(alignment = Alignment.Center).offset(fontOffset, fontOffset)
                                )
                            }
                        }
                    }
                }
            }
        }

        if (newWindow) {
            DialogWindow(
                onCloseRequest = { newWindow = false },
                state = rememberDialogState(width = screenSize.width.dp / 4f, height = Dp.Unspecified),
                title = calcolo
            ) {
                when (calcolo) {
                    "Testo" -> Detail("I")
                    "Conversioni" -> Detail("Co")
                    else -> Column {
                        Text(text = "dimension = $dimension")
                        Text(text = "window height = $windowHeight")
                        Text(text = "screen height = ${screenSize.height.dp}")
                        Text(text = "font size = $fontSize")
                        Text(text = "font offset = $fontOffset")
                    }
                }
            }
        }

        if (elementWindow) {
            DialogWindow(
                onCloseRequest = { elementWindow = false},
                state = rememberDialogState(width = screenSize.width.dp / 2.5f, height = screenSize.height.dp / 1.5f),
                title = nomeElemento
            ) {
                Detail(nomeElemento)
            }
        }
    }
}

fun getColor(tema: String, elem: String): Color {
    val number: Double

    if (elem == "") {
        return Color(255, 255, 255, 0)
    }

    val blocco = Elemento().classeIta(elem)
    val color: Color = when (tema) {
        "Ebollizione" -> {
            number = Elemento().ebolli(elem)

            if (number != 0.0) {
                Color.hsv(0f, (number / 5928).toFloat(), 1f)
            } else {
                Color(142, 142, 147, 255)
            }
        }
        "Elettronegatività" -> {
            number = Elemento().elettro(elem)

            if (number != 0.0) {
                Color.hsv(30f, (number / 3.98).toFloat(), 1f)
            } else {
                Color(142, 142, 147, 255)
            }
        }
        "Fusione" -> {
            number = Elemento().fusione(elem)

            if (number != 0.0) {
                Color.hsv(180f, (number / 3695).toFloat(), 1f)
            } else {
                Color(142, 142, 147, 255)
            }
        }
        "SATP" -> {
            if (Elemento().satpIta(elem) == "Gas") {
                Color(254, 138, 37, 255)
            } else if (Elemento().satpIta(elem) == "Liquido") {
                Color(3, 111, 249, 255)
            } else {
                Color(142, 142, 147, 255)
            }
        }
        "Densità" -> {
            number = Elemento().densità(elem)

            if (number != 0.0) {
                Color.hsv(270f, (number / 22600).toFloat(), 1f)
            } else {
                Color(142, 142, 147, 255)
            }
        }
        "Radioattivi" -> {
            if (Elemento().radioattivo(elem)) {
                Color(44, 250, 31, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Metalli alcalini" -> {
            if (blocco == "Metalli alcalini") {
                Color(254, 54, 48, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Metalli alcalino terrosi" -> {
            if (blocco == "Metalli alcalino terrosi") {
                Color(254, 138, 37, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Metalli del blocco d" -> {
            if (blocco == "Metalli del blocco d") {
                Color(164, 73, 212, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Metalli del blocco p" -> {
            if (blocco == "Metalli del blocco p") {
                Color(19, 191, 181, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Semimetalli" -> {
            if (blocco == "Semimetalli") {
                Color(50, 191, 87, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Non metalli" -> {
            if (blocco == "Non metalli") {
                Color(255, 197, 48, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Alogeni" -> {
            if (blocco == "Alogeni") {
                Color(151, 121, 86, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Gas nobili" -> {
            if (blocco == "Gas nobili") {
                Color(3, 111, 249, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Lantanidi" -> {
            if (blocco == "Lantanidi") {
                Color(77, 76, 203, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        "Attinidi" -> {
            if (blocco == "Attinidi") {
                Color(46, 163, 223, 255)
            } else {
                Color(255, 255, 255, 255)
            }
        }
        else                ->  getDefaultColor(blocco)
    }

    return color
}

fun getDefaultColor(classe: String): Color {

    val color: Color = when (classe) {
        "Metalli alcalini"          -> Color(254, 54, 48, 255)
        "Metalli alcalino terrosi"  -> Color(254, 138, 37, 255)
        "Metalli del blocco d"      -> Color(164, 73, 212, 255)
        "Metalli del blocco p"      -> Color(19, 191, 181, 255)
        "Semimetalli"               -> Color(50, 191, 87, 255)
        "Non metalli"               -> Color(255, 197, 48, 255)
        "Alogeni"                   -> Color(151, 121, 86, 255)
        "Gas nobili"                -> Color(3, 111, 249, 255)
        "Lantanidi"                 -> Color(77, 76, 203, 255)
        "Attinidi"                  -> Color(46, 163, 223, 255)
        else                        -> Color(255, 255, 255, 255)
    }
    return color
}