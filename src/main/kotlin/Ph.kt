import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun Ph() {

    val concentrazione = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp

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
            value = concentrazione.value,
            onValueChange = { newText ->
                concentrazione.value = newText
            },
            label = { Text(text = "Concentrazione") },
            placeholder = { Text(text = "0,0001") },
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            trailingIcon = {
                Text(text = "mol/L")
            }
        )

        Row(
            modifier = Modifier.padding(vertical = padding)
        ) {
            Text(text = "pH", modifier = Modifier.padding(horizontal = padding))
            Text(text = "${returnPh(concentrazione.value.text.toDoubleOrNull())}")
            Spacer(modifier = Modifier.weight(1f))
        }
        HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)
        Row(
            modifier = Modifier.padding(vertical = padding)
        ) {
            Text(text = "pOH", modifier = Modifier.padding(horizontal = padding))
            Text(text = "${returnPoh(concentrazione.value.text.toDoubleOrNull())}")
        }
    }
}

@Composable
fun Tampone() {
    val acido = remember { mutableStateOf(TextFieldValue("")) }
    val const = remember { mutableStateOf(TextFieldValue("")) }
    val sale = remember { mutableStateOf(TextFieldValue("")) }

    val padding = 10.dp

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
            value = const.value,
            onValueChange = { newText ->
                const.value = newText
            },
            label = { Text(text = "Costante ionizzazione") },
            placeholder = { Text(text = "0,0000015") },
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            )
        )

        OutlinedTextField(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth(),
            value = acido.value,
            onValueChange = { newText ->
                acido.value = newText
            },
            label = { Text(text = "Concentrazione acido") },
            placeholder = { Text(text = "0,050") },
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            )
        )

        OutlinedTextField(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth(),
            value = sale.value,
            onValueChange = { newText ->
                sale.value = newText
            },
            label = { Text(text = "Concentrazione sale") },
            placeholder = { Text(text = "0,075") },
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            )
        )

        // pH
        Row(
            modifier = Modifier.padding(vertical = padding)
        ) {
            Text(text = "pH", modifier = Modifier.padding(horizontal = padding))
            Text(
                text = "${
                    returnTampone(
                        const.value.text.toDoubleOrNull(),
                        acido.value.text.toDoubleOrNull(),
                        sale.value.text.toDoubleOrNull()
                    )
                }"
            )
            Spacer(modifier = Modifier.weight(1f))
        }
        HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)

        Row(
            modifier = Modifier.padding(vertical = padding)
        ) {


            Text(text = "pOH", modifier = Modifier.padding(horizontal = padding))
            Text(
                text = "${if (returnTampone(const.value.text.toDoubleOrNull(), acido.value.text.toDoubleOrNull(), sale.value.text.toDoubleOrNull()) != 0.0)
                    14.0 - returnTampone(
                        const.value.text.toDoubleOrNull(),
                        acido.value.text.toDoubleOrNull(),
                        sale.value.text.toDoubleOrNull()
                    ) else 0.0
                }"
            )
        }
    }
}
