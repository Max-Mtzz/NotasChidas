package mx.edu.utez.notaschidas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.edu.utez.notaschidas.ui.nav.NavGraph
import mx.edu.utez.notaschidas.ui.theme.NotasChidasTheme
import mx.edu.utez.notaschidas.viewmodel.NoteViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            NotasChidasTheme {

                val noteViewModel: NoteViewModel = viewModel()

                NavGraph(viewModel = noteViewModel)
            }
        }
    }
}