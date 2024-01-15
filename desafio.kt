// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

TODO("Adicionar parâmetros para os usuários.")
data class Usuario

TODO("Alterar a duração de acordo com os conteúdos")
TODO("adicionar uma lista de conteudoEducacional")
data class ConteudoEducacional(val nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, /*var nivel*/, var conteudos: List<ConteudoEducacional>) {
	
    TODO("Passar os usuários para a lista de inscritos após serem matriculados.")
    val inscritos = mutableListOf<Usuario>()
    
    TODO("passar um varArgs de usuários.")
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}
TODO("")
fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	TODO("Imprimir lista de matriculados em suas formações")
}

