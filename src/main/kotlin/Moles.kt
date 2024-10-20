import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Moli() {

    val selection = remember { mutableStateOf("Massa Molare") }
    val select: List<String> = listOf("Moli", "Grammi", "Massa Molare")
    val moli = remember { mutableStateOf(TextFieldValue("")) }
    val grammi = remember { mutableStateOf(TextFieldValue("")) }
    val massaMolare = remember { mutableStateOf(TextFieldValue("")) }
    val massaMolare2 = remember { mutableStateOf(TextFieldValue("")) }

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
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                value = moli.value,
                onValueChange = { newText ->
                    moli.value = newText
                },
                label = { Text(text = "Moli") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[0],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                value = grammi.value,
                onValueChange = { newText ->
                    grammi.value = newText
                },
                label = { Text(text = "Grammi") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[1],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                value = massaMolare.value,
                onValueChange = { newText ->
                    massaMolare.value = newText
                },
                label = { Text(text = "Massa molare") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[2],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                value = massaMolare2.value,
                onValueChange = { newText ->
                    massaMolare2.value = newText
                },
                label = { Text(text = "Calcola la massa molare") },
                placeholder = { Text(text = "Ca(OH)2") },
                shape = RoundedCornerShape(8.dp),
            )
            Row {
                Text(
                    text = getText(text = massaMolare2.value.text).toString(),
                    modifier = Modifier.padding(padding)
                )
                Text(text = "g/mol", modifier = Modifier.padding(vertical = padding))
                Spacer(modifier = Modifier.weight(1f))
            }
        }
        Row(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp)),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth()
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
                .background(Color.LightGray, RoundedCornerShape(8.dp)),
        ) {
            Text(
                text = resultMoli(
                    grammi.value.text.toDoubleOrNull(),
                    moli.value.text.toDoubleOrNull(),
                    massaMolare.value.text.toDoubleOrNull(),
                    selection.value
                ).toString(), modifier = Modifier.padding(padding)
            )
            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

            when (selection.value) {
                "Moli" -> Text(
                    text = "${
                        resultMoli(
                            grammi.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            massaMolare.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } mol = ${grammi.value.text} g / ${massaMolare.value.text} MM",
                    modifier = Modifier.padding(padding)
                )

                "Grammi" -> Text(
                    text = "${
                        resultMoli(
                            grammi.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            massaMolare.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } g = ${moli.value.text} mol * ${massaMolare.value.text} MM",
                    modifier = Modifier.padding(padding)
                )

                else -> Text(
                    text = "${
                        resultMoli(
                            grammi.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            massaMolare.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } MM = ${grammi.value.text} g / ${moli.value.text} mol",
                    modifier = Modifier.padding(padding)
                )
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Molarity() {

    val selection = remember { mutableStateOf("Molarità") }
    val select: List<String> = listOf("Moli", "Litri", "Molarità")
    val moli = remember { mutableStateOf(TextFieldValue("")) }
    val litri = remember { mutableStateOf(TextFieldValue("")) }
    val molar = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenSize - padding * 4) / select.count()

    Column {
        Column(
            modifier = Modifier.padding(padding).fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = moli.value,
                onValueChange = { newText ->
                    moli.value = newText
                },
                label = { Text(text = "Moli") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[0],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = litri.value,
                onValueChange = { newText ->
                    litri.value = newText
                },
                label = { Text(text = "Litri") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[1],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = molar.value,
                onValueChange = { newText ->
                    molar.value = newText
                },
                label = { Text(text = "Molarità") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[2],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )
        }

        Row(
            modifier = Modifier.padding(padding).fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp)),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
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
            modifier = Modifier.padding(padding).fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            Text(
                text = resultMolarity(
                    litri.value.text.toDoubleOrNull(),
                    moli.value.text.toDoubleOrNull(),
                    molar.value.text.toDoubleOrNull(),
                    selection.value
                ).toString(), modifier = Modifier.padding(padding)
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

            when (selection.value) {
                "Molarità" -> Text(
                    text = "${
                        resultMolarity(
                            litri.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            molar.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } M = ${moli.value.text} mol / ${litri.value.text} L",
                    modifier = Modifier.padding(padding)
                )

                "Litri" -> Text(
                    text = "${
                        resultMolarity(
                            litri.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            molar.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } L = ${moli.value.text} mol / ${molar.value.text} M",
                    modifier = Modifier.padding(padding)
                )

                else -> Text(
                    text = "${
                        resultMolarity(
                            litri.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            molar.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } mol = ${molar.value.text} M * ${litri.value.text} L",
                    modifier = Modifier.padding(padding)
                )
            }
        }
    }

}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Molality() {

    val selection = remember { mutableStateOf("Molalità") }
    val select: List<String> = listOf("Moli", "Kili", "Molalità")
    val moli = remember { mutableStateOf(TextFieldValue("")) }
    val kili = remember { mutableStateOf(TextFieldValue("")) }
    val molal = remember { mutableStateOf(TextFieldValue("")) }

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
                value = moli.value,
                onValueChange = { newText ->
                    moli.value = newText
                },
                label = { Text(text = "Moli") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[0],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = kili.value,
                onValueChange = { newText ->
                    kili.value = newText
                },
                label = { Text(text = "Kili") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[1],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = molal.value,
                onValueChange = { newText ->
                    molal.value = newText
                },
                label = { Text(text = "Molalità") },
                placeholder = { Text(text = "2.75") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[2],
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
                text = resultMolality(
                    kili.value.text.toDoubleOrNull(),
                    moli.value.text.toDoubleOrNull(),
                    molal.value.text.toDoubleOrNull(),
                    selection.value
                ).toString(), modifier = Modifier.padding(padding)
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

            when (selection.value) {
                "Molalità" -> Text(
                    text = "${
                        resultMolality(
                            kili.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            molal.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } m = ${moli.value.text} mol / ${kili.value.text} Kg",
                    modifier = Modifier.padding(padding)
                )

                "Kili" -> Text(
                    text = "${
                        resultMolality(
                            kili.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            molal.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } Kg = ${moli.value.text} mol / ${molal.value.text} m",
                    modifier = Modifier.padding(padding)
                )

                else -> Text(
                    text = "${
                        resultMolality(
                            kili.value.text.toDoubleOrNull(),
                            moli.value.text.toDoubleOrNull(),
                            molal.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } mol = ${molal.value.text} m * ${kili.value.text} Kg",
                    modifier = Modifier.padding(padding)
                )
            }
        }
    }
}

@Composable
fun Frazione() {
    val nSoluto = remember { mutableStateOf(TextFieldValue("")) }
    val nSolvente = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp

    Column {
        Column(
            modifier = Modifier.padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = nSoluto.value,
                onValueChange = { newText ->
                    nSoluto.value = newText
                },
                label = { Text(text = "Moli soluto") },
                placeholder = { Text(text = "0.15") },
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = nSolvente.value,
                onValueChange = { newText ->
                    nSolvente.value = newText
                },
                label = { Text(text = "Moli solvente") },
                placeholder = { Text(text = "0.75") },
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )
        }
        Column(
            modifier = Modifier.padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            Text(
                text = resultSoluto(
                    nSoluto.value.text.toDoubleOrNull(),
                    nSolvente.value.text.toDoubleOrNull()
                ).toString(), modifier = Modifier.padding(padding)
            )
            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)
            Text(
                text = "${
                    resultSoluto(
                        nSoluto.value.text.toDoubleOrNull(),
                        nSolvente.value.text.toDoubleOrNull()
                    )
                } Xslt = ${nSoluto.value.text} nSlt / (${nSoluto.value.text} nSlt + ${nSolvente.value.text} nSlv)",
                modifier = Modifier.padding(padding)
            )
        }
        Column(
            modifier = Modifier.padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {

            Text(
                text = resultSolvente(
                    nSoluto.value.text.toDoubleOrNull(),
                    nSolvente.value.text.toDoubleOrNull()
                ).toString(), modifier = Modifier.padding(padding)
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

            Text(
                text = "${
                    resultSolvente(
                        nSoluto.value.text.toDoubleOrNull(),
                        nSolvente.value.text.toDoubleOrNull()
                    )
                } Xslv = ${nSolvente.value.text} nSlv / (${nSoluto.value.text} nSlt + ${nSolvente.value.text} nSlv)",
                modifier = Modifier.padding(padding)
            )
        }
    }
}