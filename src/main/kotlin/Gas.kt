import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Gas() {
    val selection = remember { mutableStateOf("Press") }
    val select: List<String> = listOf("Mol", "Temp", "Vol", "Press")
    val p = remember { mutableStateOf(TextFieldValue("")) }
    val v = remember { mutableStateOf(TextFieldValue("")) }
    val n = remember { mutableStateOf(TextFieldValue("")) }
    val t = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenSize - padding * 4) / select.count()

    Column {
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = n.value,
                onValueChange = { newText ->
                    n.value = newText
                },
                label = { Text(text = "Moli") },
                placeholder = { Text(text = "") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[0],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = t.value,
                onValueChange = { newText ->
                    t.value = newText
                },
                label = { Text(text = "Temperatura") },
                placeholder = { Text(text = "") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[1],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = v.value,
                onValueChange = { newText ->
                    v.value = newText
                },
                label = { Text(text = "Volume") },
                placeholder = { Text(text = "") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[2],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = p.value,
                onValueChange = { newText ->
                    p.value = newText
                },
                label = { Text(text = "Pressione") },
                placeholder = { Text(text = "") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[3],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )
        }
        Row(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
        ) {
            Row(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (selection.value == i) Color(50, 199, 90) else Color.Gray),
                        onClick = {
                            selection.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }
        }

        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            Text(
                text = resultGas(
                    p.value.text.toDoubleOrNull(),
                    v.value.text.toDoubleOrNull(),
                    n.value.text.toDoubleOrNull(),
                    t.value.text.toDoubleOrNull(),
                    selection.value
                ).toString(), modifier = Modifier.padding(padding)
            )
            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)
            when (selection.value) {
                "Mol" -> Text(
                    text = "${
                        resultGas(
                            p.value.text.toDoubleOrNull(),
                            v.value.text.toDoubleOrNull(),
                            n.value.text.toDoubleOrNull(),
                            t.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } mol = (${p.value.text} atm * ${v.value.text} L) / (0.0821 L*atm/mol*K * ${t.value.text} K)",
                    modifier = Modifier.padding(padding)
                )

                "Temp" -> Text(
                    text = "${
                        resultGas(
                            p.value.text.toDoubleOrNull(),
                            v.value.text.toDoubleOrNull(),
                            n.value.text.toDoubleOrNull(),
                            t.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } K = (${p.value.text} atm * ${v.value.text} L) / (0.0821 L*atm/mol*K * ${n.value.text} mol)",
                    modifier = Modifier.padding(padding)
                )

                "Vol" -> Text(
                    text = "${
                        resultGas(
                            p.value.text.toDoubleOrNull(),
                            v.value.text.toDoubleOrNull(),
                            n.value.text.toDoubleOrNull(),
                            t.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } L = (${n.value.text} mol * 0.0821 L*atm/mol*K * ${t.value.text} K) / ${p.value.text} atm",
                    modifier = Modifier.padding(padding)
                )

                else -> Text(
                    text = "${
                        resultGas(
                            p.value.text.toDoubleOrNull(),
                            v.value.text.toDoubleOrNull(),
                            n.value.text.toDoubleOrNull(),
                            t.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } atm = (${n.value.text} mol * 0.0821 L*atm/mol*K * ${t.value.text} K) / ${v.value.text} L",
                    modifier = Modifier.padding(padding)
                )
            }
        }
    }

}