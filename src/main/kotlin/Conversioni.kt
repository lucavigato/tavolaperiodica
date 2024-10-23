import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ConvMass() {

    val entry1 = remember { mutableStateOf("lb") }
    val entry2 = remember { mutableStateOf("kg") }

    val select: List<String> = listOf("g", "oz", "lb", "kg")

    val input = remember { mutableStateOf(TextFieldValue("")) }
    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenSize - padding * 5) / select.count()

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
            value = input.value,
            onValueChange = { newText ->
                input.value = newText
            },
            label = { Text(text = "Input") },
            placeholder = { Text(text = "Input") },
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            trailingIcon = {
                Text(text = entry1.value)
            }
        )
        Column(
            modifier = Modifier
                .padding(horizontal = padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = (padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier
                            .width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry1.value == i) Color(50, 199, 90) else Color.Gray),
                        shape = RoundedCornerShape(8.dp),
                        onClick = {
                            entry1.value = i
                        },
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }

            Row(
                modifier = Modifier
                    .padding(horizontal = (padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier
                            .width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry2.value == i) Color(252, 186, 3) else Color.Gray),
                        shape = RoundedCornerShape(8.dp),
                        onClick = {
                            entry2.value = i
                        },
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }
        }
        Box(contentAlignment = Alignment.Center) {
            Row(
                modifier = Modifier.padding(vertical = padding)
            ) {
                Text(
                    text = resultMassa(
                        entry1.value,
                        entry2.value,
                        input.value.text.toDoubleOrNull()
                    ).toString(), modifier = Modifier.padding(horizontal = padding)
                )
                Text(text = entry2.value)
            }
        }

        // TODO: add the inverse formulas
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ConvLength() {

    val entry1 = remember { mutableStateOf("km") }
    val entry2 = remember { mutableStateOf("mi") }

    val select: List<String> = listOf("in", "ft", "yd", "m", "km", "mi", "nmi")

    val input = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenSize - padding * 5) / select.count()


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
            value = input.value,
            onValueChange = { newText ->
                input.value = newText
            },
            shape = RoundedCornerShape(8.dp),
            label = { Text(text = "Input") },
            placeholder = { Text(text = "Input") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            trailingIcon = {
                Text(text = entry1.value)
            }
        )
        Column(
            modifier = Modifier
                .padding(horizontal = padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = (padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry1.value == i) Color(50, 199, 90) else Color.Gray),
                        shape = RoundedCornerShape(8.dp),
                        onClick = {
                            entry1.value = i
                        },
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }

            Row(
                modifier = Modifier
                    .padding(horizontal = (padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry2.value == i) Color(252, 186, 3) else Color.Gray),
                        shape = RoundedCornerShape(8.dp),
                        onClick = {
                            entry2.value = i
                        },
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }
        }
        Box(modifier = Modifier.padding(vertical = padding), contentAlignment = Alignment.Center) {
            Text(
                text = "${resultLength(
                    entry1.value,
                    entry2.value,
                    input.value.text.toDoubleOrNull()
                )} ${entry2.value}", modifier = Modifier.padding(horizontal = padding)
            )
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ConvPress() {

    val entry1 = remember { mutableStateOf("atm") }
    val entry2 = remember { mutableStateOf("bar") }

    val select: List<String> = listOf("bar", "kPa", "torr", "atm")

    val input = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenSize - padding * 5) / select.count()


    Column(
        modifier = Modifier
            .padding(horizontal = padding)
            .fillMaxWidth()
            .background(Color.LightGray, RoundedCornerShape(8.dp))
    ) {
        OutlinedTextField(
            modifier = Modifier.padding(padding).fillMaxWidth(),
            value = input.value,
            onValueChange = { newText ->
                input.value = newText
            },
            shape = RoundedCornerShape(8.dp),
            label = { Text(text = "Input") },
            placeholder = { Text(text = "Input") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            trailingIcon = {
                Text(text = entry1.value)
            }
        )
        Column(
            modifier = Modifier
                .padding(horizontal = padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
        ) {
            Row(
                modifier = Modifier
                    .padding((padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry1.value == i) Color(50, 199, 90) else Color.Gray),
                        onClick = {
                            entry1.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }

            Row(
                modifier = Modifier
                    .padding((padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry2.value == i) Color(252, 186, 3) else Color.Gray),
                        onClick = {
                            entry2.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }
        }

        Row(
            modifier = Modifier.padding(vertical = padding)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = resultPress(
                    entry1.value,
                    entry2.value,
                    input.value.text.toDoubleOrNull()
                ).toString(), modifier = Modifier.padding(horizontal = padding)
            )
            Text(text = entry2.value)
            Spacer(modifier = Modifier.weight(1f))
        }
        // TODO: add the formulas to convert
    }

}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ConvTemp() {

    val entry1 = remember { mutableStateOf("Celsius") }
    val entry2 = remember { mutableStateOf("Fahrenheit") }

    val select: List<String> = listOf("Celsius", "Fahrenheit", "Kelvin", "Rankine")

    val input = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenSize - padding * 5) / select.count()


    Column(
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .background(Color.LightGray, RoundedCornerShape(8.dp))
    ) {
        OutlinedTextField(
            modifier = Modifier.padding(padding).fillMaxWidth(),
            value = input.value,
            onValueChange = { newText ->
                input.value = newText
            },
            label = { Text(text = "Input") },
            placeholder = { Text(text = "Input") },
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            trailingIcon = {
                Text(text = entry1.value, modifier = Modifier.padding(padding))
            }
        )
        Column(
            modifier = Modifier
                .padding(horizontal = padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
        ) {
            Row(
                modifier = Modifier
                    .padding((padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry1.value == i) Color(50, 199, 90) else Color.Gray),
                        onClick = {
                            entry1.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }

            Row(
                modifier = Modifier
                    .padding((padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry2.value == i) Color(252, 186, 3) else Color.Gray),
                        onClick = {
                            entry2.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }
        }

        Row(
            modifier = Modifier.padding(vertical = padding)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = resultTemp(
                    entry1.value,
                    entry2.value,
                    input.value.text.toDoubleOrNull()
                ).toString(), modifier = Modifier.padding(horizontal = padding)
            )
            Text(text = entry2.value)
            Spacer(modifier = Modifier.weight(1f))
        }
        // TODO: add the formulas to convert
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ConvVol() {

    val entry1 = remember { mutableStateOf("L") }
    val entry2 = remember { mutableStateOf("dm3") }

    val select: List<String> = listOf("gal", "oz", "L", "mL", "m3", "dm3", "ft3")

    val input = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenSize - padding * 5) / select.count()

    Column(
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .background(Color.LightGray, RoundedCornerShape(8.dp))
    ) {
        OutlinedTextField(
            modifier = Modifier.padding(padding).fillMaxWidth(),
            value = input.value,
            onValueChange = { newText ->
                input.value = newText
            },
            label = { Text(text = "Input") },
            placeholder = { Text(text = "Input") },
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            trailingIcon = {
                Text(text = entry1.value)
            }
        )

        Column(
            modifier = Modifier.padding(horizontal = padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
        ) {
            Row(
                modifier = Modifier
                    .padding((padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry1.value == i) Color(50, 199, 90) else Color.Gray),
                        onClick = {
                            entry1.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }

            Row(
                modifier = Modifier.padding((padding.value / 2).dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry2.value == i) Color(252, 186, 3) else Color.Gray),
                        onClick = {
                            entry2.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }
        }
        Row(
            modifier = Modifier.padding(vertical = padding)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = resultVol(
                    entry1.value,
                    entry2.value,
                    input.value.text.toDoubleOrNull()
                ).toString(), modifier = Modifier.padding(horizontal = padding)
            )
            Text(text = entry2.value)
            Spacer(modifier = Modifier.weight(1f))
        }
        // TODO: add the formulas to convert
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ConvEnergy() {

    val entry1 = remember { mutableStateOf("cal") }
    val entry2 = remember { mutableStateOf("j") }

    val select: List<String> = listOf("j", "kcal", "cal", "Wh")

    val input = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp
    val screenSize = LocalWindowInfo.current.containerSize.width.dp / 2
    val buttonSize = (screenSize - padding * 5) / select.count()

    Column(
        modifier = Modifier.padding(padding)
            .fillMaxWidth()
            .background(Color.LightGray, RoundedCornerShape(8.dp))
    ) {
        OutlinedTextField(
            modifier = Modifier.padding(padding).fillMaxWidth(),
            value = input.value,
            onValueChange = { newText ->
                input.value = newText
            },
            label = { Text(text = "Input") },
            placeholder = { Text(text = "Input") },
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            trailingIcon = {
                Text(text = entry1.value)
            }
        )

        Column(
            modifier = Modifier
                .padding(horizontal = padding)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
        ) {
            Row(
                modifier = Modifier.padding((padding.value / 2).dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry1.value == i) Color(50, 199, 90) else Color.Gray),
                        onClick = {
                            entry1.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }

            Row(
                modifier = Modifier.padding((padding.value / 2).dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                select.forEach { i ->
                    Button(
                        modifier = Modifier.width(buttonSize),
                        colors = ButtonDefaults.buttonColors(if (entry2.value == i) Color(252, 186, 3) else Color.Gray),
                        onClick = {
                            entry2.value = i
                        },
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(text = i)
                    }
                }
            }
        }

        Box (contentAlignment = Alignment.Center) {
            Row(
                modifier = Modifier.padding(vertical = padding)
                    .fillMaxWidth()
            ) {
                Text(
                    text = resultEnergy(
                        entry1.value,
                        entry2.value,
                        input.value.text.toDoubleOrNull()
                    ).toString(), modifier = Modifier.padding(horizontal = padding)
                )
                Text(text = entry2.value)
            }
        }
        // TODO: add the formulas to convert
    }
}