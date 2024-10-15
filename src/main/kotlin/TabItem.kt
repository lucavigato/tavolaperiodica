import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var title: String, var screen: ComposableFun){
    object NavInfo : TabItem("Info", { NavInfo() })
    object NavTable : TabItem("Table", { NavTable() })
    object NavCalcoli : TabItem("Calcoli", { NavCalcoli() })
}