import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@Composable
fun Testo() {
    val text = remember { mutableStateOf(TextFieldValue("")) }
    val somma = remember { mutableDoubleStateOf(value = 0.0) }

    val padding = 10.dp

    Column(
        modifier = Modifier.padding(padding)
            .fillMaxWidth()
            .background(Color.LightGray, RoundedCornerShape(8.dp))
    ) {
        OutlinedTextField(
            modifier = Modifier.padding(padding).fillMaxWidth(),
            value = text.value,
            onValueChange = { newText ->
                text.value = newText
            },
            label = { Text(text = "Inserisci la formula") },
            placeholder = { Text(text = "Ca(OH)2") },
            shape = RoundedCornerShape(8.dp)
        )
        Box(modifier = Modifier.padding(horizontal = padding), contentAlignment = Alignment.Center) {
            Row(
                modifier = Modifier.padding(vertical = padding)
                    .fillMaxWidth()
            ) {
                Text(
                    text = getText(text = text.value.text).toString(),
                    modifier = Modifier.padding(horizontal = padding)
                )
                Text(text = "g/mol")
            }
        }
    }
}

fun getText(text: String): Double {
    var somma = 0.0
    val strArr = text.toCharArray()
    val len = strArr.size
    var vecchiaStr = ""
    var intStr = ""
    var intNVolte = ""
    var j = len - 1
    var semiSomma: Double
    var sommaString: String
    while (j >= 0) {
        if (strArr[j].isDigit()) {
            intStr = strArr[j].toString() + intStr
        }

        if (strArr[j].isUpperCase() && strArr[if (j + 1 < len) j + 1 else j].isLowerCase()) {
            sommaString = strArr[j].toString() + vecchiaStr
            somma += Elemento().massaMolare(sommaString)
        }
        else if (strArr[j].isUpperCase() && (strArr[if (j + 1 < len) j + 1 else j].isUpperCase() || strArr[if (j + 1 < len) j + 1 else j].toString() == ")")) {
            somma += Elemento().massaMolare(strArr[j].toString())
        }
        else if (strArr[j].isDigit() && strArr[if (j - 1 >= 0) j - 1 else j].isUpperCase()) {
            semiSomma = Elemento().massaMolare(strArr[if (j - 1 >= 0) j - 1 else j].toString()) * intStr.toInt()
            somma += semiSomma
            intStr = ""
        }
        else if (strArr[j].isDigit() && strArr[if (j - 1 >= 0) j - 1 else j].isLowerCase()) {
            val characters: List<Char> = listOf(strArr[if (j - 2 >= 0) j - 2 else if (j - 1 >= 0) j - 1 else j], strArr[if (j - 1 >= 0) j - 1 else j])
            val semiString = characters.toString()
            semiSomma = Elemento().massaMolare(semiString) * strArr[j].digitToInt()
            somma += semiSomma
            intStr = ""
        }
        else if (strArr[j].isLowerCase() && strArr[if (j + 1 < len) j + 1 else j].isDigit()) {
            j -= 2
            continue
        }
        else if (strArr[j].isLowerCase()) {
            vecchiaStr = strArr[j].toString()
        }

        if (strArr[j].toString() == ")") {
            intNVolte = intStr
            intStr = ""
        }

        if (strArr[j].toString() == "(") {
            somma *= if (intNVolte.isNotEmpty()) {
                intNVolte.toInt()
            } else {
                1
            }
        }

        j -= 1
    }
    return somma
}