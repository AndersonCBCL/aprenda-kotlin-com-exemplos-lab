// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
TODO("")



//TODO("Adicionar parâmetros para os usuários.")
TODO("Entender se é para ser val ou var")
TODO("Testar o gerador de id")
data class Usuario(
	val nome: String, val email: String, val id: Int
){      
    override fun equals(other: Any?) =
        other is Usuario && other.id == this.id 
    fun geradorDeId(id: Int){
        val id = Usuario.hashCode()
    }
}



//TODO("Alterar a duração de acordo com os conteúdos duracao -> var")
TODO("adicionar uma lista de conteudoEducacional")
data class ConteudoEducacional(
    val nome: String, var duracao: Int = 60
)




data class Formacao(
    val nome: String, val nivel: String, var conteudos: List<ConteudoEducacional>
) {
	
    TODO("Passar os usuários para a lista de inscritos após serem matriculados.")
    val inscritos = mutableListOf<Usuario>()
    
    TODO("passar um varArgs de usuários.")
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}




fun main() {
    val aluno1 = Usuario("Anderson", "anderson.cbcl3@gmail.com")
    
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	TODO("Imprimir lista de matriculados em suas formações")
}