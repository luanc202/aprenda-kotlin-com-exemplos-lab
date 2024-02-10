// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val matricula: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }
}

fun main() {
    val usuario1 = Usuario("Pedro", 111)
    val usuario2 = Usuario("Paulo", 112)

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Avançado Kotlin", 120)

    val conteudos = listOf(conteudo1, conteudo2)
    val formacao1 = Formacao("Kotlin Backend", Nivel.INTERMEDIARIO, conteudos)

    formacao1.matricular(usuario1, usuario2)

    println(formacao1)
}
