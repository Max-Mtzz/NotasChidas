package mx.edu.utez.notaschidas.data.model

data class Note(
    val id: Int = 0,
    val titulo: String,
    val descripcion: String,
    val imageUri: String?
)
