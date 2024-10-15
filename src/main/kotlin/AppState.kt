import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class AppState {
    var filter by mutableStateOf("Default")
        private set

    fun updateFilter(newFilter: String) {
        filter = newFilter
    }
}