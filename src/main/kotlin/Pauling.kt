import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import kotlin.math.exp
import kotlin.math.abs

@Composable
fun Pauling() {
    val elemento1 = remember { mutableStateOf(TextFieldValue("")) }
    val elemento2 = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp
    Column {
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .padding(horizontal = padding)
                    .fillMaxWidth(),
                value = elemento1.value,
                onValueChange = { text ->
                    elemento1.value = text
                },
                label = { Text(text = "Inserisci il primo elemento") },
                placeholder = { Text(text = "Br") },
                shape = RoundedCornerShape(8.dp)
            )
            OutlinedTextField(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                value = elemento2.value,
                onValueChange = { text ->
                    elemento2.value = text
                },
                label = { Text(text = "Inserisci il secondo elemento") },
                placeholder = { Text(text = "F") },
                shape = RoundedCornerShape(8.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            Text(text = "Differenza: ${getEl(elemento1.value.text, elemento2.value.text)}", modifier = Modifier.padding(padding))
            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)
            Text(text = "Carattere ionico: ${ionico(getEl(elemento1.value.text, elemento2.value.text))}", modifier = Modifier.padding(padding))
            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)
            Text(text = "Legame: ${if (getEl(elemento1.value.text, elemento2.value.text) >= 1.9) "Ionico" else if (getEl(elemento1.value.text, elemento2.value.text) == 0.0) "" else "Covalente"}", modifier = Modifier.padding(padding))
        }
    }
}

fun getEl(el1: String, el2: String): Double {
    val x = Elemento().elettro(el1) - Elemento().elettro(el2)
    return abs(x)
}

fun ionico(valore: Double): Double {
    return 100 * (1 - exp(-0.25 * valore * valore))
}