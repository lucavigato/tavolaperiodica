import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Acid() {

    // list of tuples
    val list: List<Pair<String, String>> = listOf(
        "Acid name" to "Ka",
        "HCl"       to "10\u2077",
        "HF"        to "6.7 x 10\u207B\u00B3",
        "HBr"       to "10\u2079",
        "HCN"       to "6.2 x 10\u207B\u00B9\u2070",
        "H\u2082SO\u2084"     to "10\u2075",
        "HSO\u2084\u207B"     to "10\u207B\u00B2",
        "H\u2083PO\u2084"     to "7.1 x 10\u207B\u00B3",
        "H\u2082PO\u2084\u207B"    to "6.32 x 10\u207B\u2078",
        "HPO\u2084\u00B2\u207B"    to "4.5 x 10\u207B\u00B9\u00B3",
        "HNO\u2082"      to "7.1 x 10\u207B\u2074",
        "HI"        to "> 10\u2079",
        "HClO\u2083"     to "10"
    )

    val padding = 10.dp

    Column(
        modifier = Modifier.padding(padding)
            .fillMaxWidth()
            .background(Color.LightGray, RoundedCornerShape(8.dp))
    ) {
        list.forEach { index ->
            Row(
                modifier = Modifier.fillMaxWidth().padding(padding),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = index.first)
                Text(text = index.second)
            }
            HorizontalDivider(modifier = Modifier.padding(horizontal = padding), color = Color.Gray)
        }
    }
}