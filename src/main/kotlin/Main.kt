import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
@Preview
fun app() {
    val tabs = listOf(TabItem.NavTable, TabItem.NavCalcoli, TabItem.NavInfo)
    val tabNum = remember { mutableStateOf(0) }

    Scaffold(bottomBar = {
        TabRow(modifier = Modifier.background(Color.Gray), selectedTabIndex = tabNum.value) {
            tabs.forEachIndexed { index, tab ->
                Tab(text = { Text(tab.title) }, selected = tabNum.value == index, onClick = { tabNum.value = index} )
            }
        }
    }, content = { padding ->
        Column(modifier = Modifier
            .fillMaxHeight()
            .padding(padding)) {
            tabs[tabNum.value].screen()
        }
    })
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Compose Demo") {
        app()
    }
}

@Composable
fun NavInfo() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Info"
    ) {
        composable("Main") { app() }
        composable("Detail/{name}") { backStackEntry ->
            Detail(backStackEntry.arguments?.getString("name").toString())
        }
        composable("Info") { Info(navController) }
    }
}

@Composable
fun NavTable() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Table") {
        composable("Main") { app() }
        composable("Detail/{name}") { backStackEntry ->
            Detail(backStackEntry.arguments?.getString("name").toString())
        }
        composable("Table") { Table(navController) }
    }
}

@Composable
fun NavCalcoli() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Calcoli") {
        composable("Calcoli") { Calcoli(navController) } // Principale
        composable("Elettronegatività") { Pauling() } // Elettronegatività
        composable("Massa Molare") { Massa() } // Massa molare grafico
        composable("Testo") { Testo() } // Massa molare testo
        composable("Moli") { Moli() } // Moli
        composable("Molarità") { Molarity() } // Molarità
        composable("Molalità") { Molality() } // Molalità
        composable("Massa") { ConvMass() } // Conversione Massa
        composable("Lunghezza") { ConvLength() } // Conversione Lunghezza
        composable("Pressione") { ConvPress() } // Conversione Pressione
        composable("Energia") { ConvEnergy() } // Conversione Energia
        composable("Temperatura") { ConvTemp() } // Conversione Temperatura
        composable("Volume") { ConvVol() } // Conversione Volume
        composable("Conversioni") { Conversioni(navController) } // Calcoli
        composable("Colligative") { Colligative(navController) } // Proprietà Colligative
        composable("Abbassamento") { Abbassamento() } // Abbassamento crioscopico
        composable("Innalzamento") { Innalzamento() } // Innalzamento ebullioscopico
        composable("Osmotica") { Osmotica() } // Pressione osmotica
        composable("Tensione") { Tensione() } // Tensione di vapore
        composable("Gas perfetti") { Gas() } // Gas Perfetti pvnRT
        composable("Frazione molare") { Frazione() } // Frazione Molare
        composable("PH") { Ph() } // ph
        composable("PH Tampone") { Tampone() } // ph Tampone
        composable("Formula minima") { Formula() } // Formula minima
        composable("Acid list") { Acid() } // Acid list
    }
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    app()
}
*/