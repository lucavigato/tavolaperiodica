import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Formula() {
    val elemento = remember { mutableStateOf(TextFieldValue("")) }
    val percentuale = remember { mutableStateOf(TextFieldValue("")) }
    var elementi: MutableList<ItemElement> = mutableListOf()
    
    val formula = remember { mutableStateOf("") }
    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp
    val buttonSize = (screenSize - padding * 7) / 3

    Column {
        Column(
            modifier = Modifier.padding(padding).fillMaxWidth().background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = elemento.value,
                onValueChange = { newText ->
                    elemento.value = newText
                },
                label = { Text(text = "Elemento") },
                placeholder = { Text(text = "C") },
                shape = RoundedCornerShape(8.dp),
                trailingIcon = {
                    IconButton(
                        onClick = {
                            elementi.add(ItemElement(elemento.value.text, percentuale.value.text))
                        }
                    ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
                    }
                }
            )
            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = percentuale.value,
                onValueChange = { newText ->
                    percentuale.value = newText
                },
                label = { Text(text = "Percentuale") },
                placeholder = { Text(text = "20") },
                shape = RoundedCornerShape(8.dp)
            )
        }



        elementi.forEach { index ->
            Row(
                modifier = Modifier.fillMaxWidth().padding(padding).background(Color.LightGray, RoundedCornerShape(8.dp)),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = index.elemento)
                Text(text = index.massa)
            }
        }
        Row(
            modifier = Modifier.padding(padding).fillMaxWidth().background(Color.Gray, RoundedCornerShape(8.dp)),
        ) {
            Row(
                modifier = Modifier
                    .padding((padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    modifier = Modifier.width(buttonSize),
                    onClick = {
                        formula.value = getFormula(elementi = elementi)
                        elementi.clear()
                        //result = listOf()
                    },
                    colors = ButtonDefaults.buttonColors(Color(50, 199, 90)),
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Calcola")
                }

                Button(
                    modifier = Modifier.width(buttonSize),
                    onClick = {
                        formula.value = ""
                        elementi = mutableListOf()
                        //result = listOf()
                    },
                    colors = ButtonDefaults.buttonColors(Color(252, 186, 3)),
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Reset")
                }

                Button(
                    modifier = Modifier.width(buttonSize),
                    onClick = {
                        elementi.dropLast(1)
                        //result.dropLast()
                    },
                    colors = ButtonDefaults.buttonColors(Color(227, 48, 48)),
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Delete")
                }
            }
        }

        if (formula.value != "") {
            Column(
                modifier = Modifier.padding(padding)
                    .fillMaxWidth()
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
            ) {
                Text(text = formula.value)
            }
        }
    }
}

data class ItemElement(val elemento: String, val massa: String)