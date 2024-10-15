import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun Calcoli(navController: NavController) {

    val obj: List<String> = listOf(
        "Massa Molare", "Testo", "Elettronegatività", "Formula minima",
        "Gas perfetti", "Conversioni", "Colligative", "Frazione Molare",
        "Moli", "Molarità", "Molalità", "PH Tampone", "PH", "Acid list"
    )

    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .background(Color.Gray, RoundedCornerShape(8.dp))
    ) {
        obj.forEach { i ->
            Button(
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 5.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(50, 105, 168),
                    contentColor = Color.White
                ),
                onClick = {
                    navController.navigate(i)
                }
            ) {
                Text(text = i)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Default.KeyboardArrowRight, contentDescription = null)
            }
        }
    }
}