import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
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
fun Innalzamento() {
    val selection = remember { mutableStateOf("Delta") }
    val select: List<String> = listOf("M", "i", "K", "Delta")
    val moli = remember { mutableStateOf(TextFieldValue("")) }
    val vanthoff = remember { mutableStateOf(TextFieldValue("")) }
    val const = remember { mutableStateOf(TextFieldValue("")) }
    val delta = remember { mutableStateOf(TextFieldValue("")) }
    val padding = 10.dp
    val screenWidth = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenWidth - padding * 4) / select.count()

    Column {
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp)),
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                value = moli.value,
                onValueChange = { newText ->
                    moli.value = newText
                },
                label = { Text(text = "Molarità") },
                placeholder = { Text(text = "0.45") },
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
                value = vanthoff.value,
                onValueChange = { newText ->
                    vanthoff.value = newText
                },
                label = { Text(text = "i") },
                placeholder = { Text(text = "2") },
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
                value = const.value,
                onValueChange = { newText ->
                    const.value = newText
                },
                label = { Text(text = "K") },
                placeholder = { Text(text = "0.512") },
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
                value = delta.value,
                onValueChange = { newText ->
                    delta.value = newText
                },
                label = { Text(text = "Delta") },
                placeholder = { Text(text = "0.4608") },
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
                        modifier = Modifier
                            .width(buttonSize),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            if (selection.value == i) Color(
                                50,
                                199,
                                90
                            ) else Color.Gray
                        ),
                        onClick = {
                            selection.value = i
                        },
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        if (i != "Delta") {
                            Text(text = i)
                        } else {
                            Text(text = "∆")
                        }
                    }
                }
            }
        }

        // it's not pretty, but it's istantaneous. idk how to make it short and still functional how i want
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            Text(text = resultInnalzamento(moli.value.text.toDoubleOrNull(), vanthoff.value.text.toDoubleOrNull(), const.value.text.toDoubleOrNull(), delta.value.text.toDoubleOrNull(), selection.value).toString(), modifier = Modifier.padding(padding))

            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

            when (selection.value) {
                "M" -> Text(
                    text = "${
                        resultInnalzamento(
                            moli.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            const.value.text.toDoubleOrNull(),
                            delta.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } M = ${delta.value.text} Delta / (${vanthoff.value.text} i * ${const.value.text} K)",
                    modifier = Modifier.padding(padding)
                )

                "i" -> Text(
                    text = "${
                        resultInnalzamento(
                            moli.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            const.value.text.toDoubleOrNull(),
                            delta.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } i = ${delta.value.text} Delta / (${moli.value.text} M * ${const.value.text} K)",
                    modifier = Modifier.padding(padding)
                )

                "K" -> Text(
                    text = "${
                        resultInnalzamento(
                            moli.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            const.value.text.toDoubleOrNull(),
                            delta.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } K = ${delta.value.text} Delta / (${moli.value.text} M * ${vanthoff.value.text} i)",
                    modifier = Modifier.padding(padding)
                )

                else -> Text(
                    text = "${
                        resultInnalzamento(
                            moli.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            const.value.text.toDoubleOrNull(),
                            delta.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } Delta = ${moli.value.text} M * ${vanthoff.value.text} i * ${const.value.text} K",
                    modifier = Modifier.padding(padding)
                )

            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Abbassamento() {
    val selection = remember { mutableStateOf("Delta") }
    val select: List<String> = listOf("m", "i", "K", "Delta")
    val moli = remember { mutableStateOf(TextFieldValue("")) }
    val vanthoff = remember { mutableStateOf(TextFieldValue("")) }
    val const = remember { mutableStateOf(TextFieldValue("")) }
    val delta = remember { mutableStateOf(TextFieldValue("")) }
    val padding = 10.dp
    val screenWidth = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenWidth - padding * 4) / select.count()

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
                label = { Text(text = "Molalità") },
                placeholder = { Text(text = "0.45") },
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
                value = vanthoff.value,
                onValueChange = { newText ->
                    vanthoff.value = newText
                },
                label = { Text(text = "i") },
                placeholder = { Text(text = "2") },
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
                value = const.value,
                onValueChange = { newText ->
                    const.value = newText
                },
                label = { Text(text = "K") },
                placeholder = { Text(text = "1.86") },
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
                value = delta.value,
                onValueChange = { newText ->
                    delta.value = newText
                },
                label = { Text(text = "Delta") },
                placeholder = { Text(text = "1.674") },
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
                    Button(modifier = Modifier.width(buttonSize),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            if (selection.value == i) Color(
                                50,
                                199,
                                90
                            ) else Color.Gray
                        ),
                        onClick = {
                            selection.value = i
                        },
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        if (i != "Delta") {
                            Text(text = i)
                        } else {
                            Text(text = "∆")
                        }
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
            // it's not pretty, but it's istantaneous. idk how to make it short and still functional how i want
            Text(
                text = resultAbbassamento(
                    moli.value.text.toDoubleOrNull(),
                    vanthoff.value.text.toDoubleOrNull(),
                    const.value.text.toDoubleOrNull(),
                    delta.value.text.toDoubleOrNull(),
                    selection.value
                ).toString(), modifier = Modifier.padding(padding)
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

            when (selection.value) {
                "M" -> Text(
                    text = "${
                        resultAbbassamento(
                            moli.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            const.value.text.toDoubleOrNull(),
                            delta.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } m = ${delta.value.text} Delta / (${vanthoff.value.text} i * ${const.value.text} K)",
                    modifier = Modifier.padding(padding)
                )

                "i" -> Text(
                    text = "${
                        resultAbbassamento(
                            moli.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            const.value.text.toDoubleOrNull(),
                            delta.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } i = ${delta.value.text} Delta / (${moli.value.text} m * ${const.value.text} K)",
                    modifier = Modifier.padding(padding)
                )

                "K" -> Text(
                    text = "${
                        resultAbbassamento(
                            moli.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            const.value.text.toDoubleOrNull(),
                            delta.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } K = ${delta.value.text} Delta / (${moli.value.text} m * ${vanthoff.value.text} i)",
                    modifier = Modifier.padding(padding)
                )

                else -> Text(
                    text = "${
                        resultAbbassamento(
                            moli.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            const.value.text.toDoubleOrNull(),
                            delta.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } Delta = ${moli.value.text} m * ${vanthoff.value.text} i * ${const.value.text} K",
                    modifier = Modifier.padding(padding)
                )

            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Osmotica() {
    val selection = remember { mutableStateOf("atm") }
    val select: List<String> = listOf("M", "T", "i", "atm")
    val moli = remember { mutableStateOf(TextFieldValue("")) }
    val temp = remember { mutableStateOf(TextFieldValue("")) }
    val vanthoff = remember { mutableStateOf(TextFieldValue("")) }
    val press = remember { mutableStateOf(TextFieldValue("")) }
    val padding = 10.dp
    val screenWidth = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenWidth - padding * (2 + select.count() * 2)) / select.count()

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
                label = { Text(text = "Molarità") },
                placeholder = { Text(text = "0.15") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[0],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = temp.value,
                onValueChange = { newText ->
                    temp.value = newText
                },
                label = { Text(text = "Tempeartura (K)") },
                placeholder = { Text(text = "273.15") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[1],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = vanthoff.value,
                onValueChange = { newText ->
                    vanthoff.value = newText
                },
                label = { Text(text = "i") },
                placeholder = { Text(text = "2") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[2],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = press.value,
                onValueChange = { newText ->
                    press.value = newText
                },
                label = { Text(text = "Pressione (atm)") },
                placeholder = { Text(text = "6.727685") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[3],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )
        }
        Row(
            modifier = Modifier.padding(padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp)),
        ) {
            Row(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier
                            .defaultMinSize(buttonSize),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            if (selection.value == i) Color(
                                50,
                                199,
                                90
                            ) else Color.Gray
                        ),
                        onClick = {
                            selection.value = i
                        },
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        if (i != "atm") {
                            Text(text = i)
                        } else {
                            Text(text = "P")
                        }
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
            // it's not pretty, but it's istantaneous. idk how to make it short and still functional how i want
            Text(
                text = resultOsmotica(
                    moli.value.text.toDoubleOrNull(),
                    temp.value.text.toDoubleOrNull(),
                    vanthoff.value.text.toDoubleOrNull(),
                    press.value.text.toDoubleOrNull(),
                    selection.value
                ).toString(), modifier = Modifier.padding(padding)
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

            when (selection.value) {
                "M" -> Text(
                    text = "${
                        resultOsmotica(
                            moli.value.text.toDoubleOrNull(),
                            temp.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            press.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } M = ${press.value.text} atm / (0.0821 R * ${temp.value.text} K * ${vanthoff.value.text} i)",
                    modifier = Modifier.padding(padding)
                )

                "T" -> Text(
                    text = "${
                        resultOsmotica(
                            moli.value.text.toDoubleOrNull(),
                            temp.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            press.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } K = ${press.value.text} atm / (${moli.value.text} M * 0.0821 R * ${vanthoff.value.text} i)",
                    modifier = Modifier.padding(padding)
                )

                "i" -> Text(
                    text = "${
                        resultOsmotica(
                            moli.value.text.toDoubleOrNull(),
                            temp.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            press.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } i = ${press.value.text} atm / (${moli.value.text} M * 0.0821 R * ${temp.value.text} K)",
                    modifier = Modifier.padding(padding)
                )

                else -> Text(
                    text = "${
                        resultOsmotica(
                            moli.value.text.toDoubleOrNull(),
                            temp.value.text.toDoubleOrNull(),
                            vanthoff.value.text.toDoubleOrNull(),
                            press.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } atm = ${moli.value.text} M * 0.0821 R * ${temp.value.text} K * ${vanthoff.value.text} i",
                    modifier = Modifier.padding(padding)
                )

            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Tensione() {
    val selection = remember { mutableStateOf("X") }
    val select: List<String> = listOf("P slv", "X", "P slt")
    val pSolvente = remember { mutableStateOf(TextFieldValue("")) }
    val pSoluto = remember { mutableStateOf(TextFieldValue("")) }
    val xSolvente = remember { mutableStateOf(TextFieldValue("")) }
    val padding = 10.dp
    val screenWidth = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenWidth - padding * 4) / select.count()

    Column {
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = pSolvente.value,
                onValueChange = { newText ->
                    pSolvente.value = newText
                },
                label = { Text(text = "Press. solv") },
                placeholder = { Text(text = "1.57") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[0],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = xSolvente.value,
                onValueChange = { newText ->
                    xSolvente.value = newText
                },
                label = { Text(text = "Fraz. mol. solv.") },
                placeholder = { Text(text = "0.914") },
                shape = RoundedCornerShape(8.dp),
                enabled = selection.value != select[1],
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                modifier = Modifier.padding(padding).fillMaxWidth(),
                value = pSoluto.value,
                onValueChange = { newText ->
                    pSoluto.value = newText
                },
                label = { Text(text = "Press. sol.") },
                placeholder = { Text(text = "1.43498") },
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
                .background(Color.Gray, RoundedCornerShape(8.dp)),
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
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            if (selection.value == i) Color(
                                50,
                                199,
                                90
                            ) else Color.Gray
                        ),
                        onClick = {
                            selection.value = i
                        },
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
                text = resultTensione(
                    pSolvente.value.text.toDoubleOrNull(),
                    xSolvente.value.text.toDoubleOrNull(),
                    pSoluto.value.text.toDoubleOrNull(),
                    selection.value
                ).toString(), modifier = Modifier.padding(padding)
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

            when (selection.value) {
                "P slv" -> Text(
                    text = "${
                        resultTensione(
                            pSolvente.value.text.toDoubleOrNull(),
                            xSolvente.value.text.toDoubleOrNull(),
                            pSoluto.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } P slv = ${pSoluto.value.text} P slt / ${xSolvente.value.text} X",
                    modifier = Modifier.padding(padding)
                )

                "X" -> Text(
                    text = "${
                        resultTensione(
                            pSolvente.value.text.toDoubleOrNull(),
                            xSolvente.value.text.toDoubleOrNull(),
                            pSoluto.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } X = ${pSoluto.value.text} P slt / ${pSolvente.value.text} P slv",
                    modifier = Modifier.padding(padding)
                )

                else -> Text(
                    text = "${
                        resultTensione(
                            pSolvente.value.text.toDoubleOrNull(),
                            xSolvente.value.text.toDoubleOrNull(),
                            pSoluto.value.text.toDoubleOrNull(),
                            selection.value
                        )
                    } P slt = ${pSolvente.value.text} P slv * ${xSolvente.value.text} X",
                    modifier = Modifier.padding(padding)
                )
            }
        }
    }
}