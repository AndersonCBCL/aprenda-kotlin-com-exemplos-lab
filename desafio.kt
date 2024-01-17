// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
enum class Duracao { 30, 45, 60 }

TODO("")

//TODO("Adicionar parâmetros para os usuários.")
//TODO("Entender se é para ser val ou var")
//TODO("Testar o gerador de id")
data class Usuario(
    val nome: String, 
    val email: String, 
    val id: Int = gerarIdUnico()
) {
    companion object {
        var proximoId = 1

        fun gerarIdUnico(): Int {
            return proximoId++
        }
    }
    override fun equals(other: Any?) =
        other is Usuario && other.id == this.id 
}


//TODO("Alterar a duração de acordo com os conteúdos duracao -> var")
TODO("adicionar uma lista de conteudoEducacional")
data class ConteudoEducacional(
    val nome: String
    val duracao: Int = Duracao
){
    val listaDeConteudos = mutableListOf<ConteudoEducacional>()
}

data class Formacao(
    val nome: String
    val nivel: Nivel
    var conteudos: List<ConteudoEducacional>
) {
	
    TODO("Passar os usuários para a lista de inscritos após serem matriculados.")
    val inscritos = mutableListOf<Usuario>()
        
    TODO("passar um vararg de usuários.")
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}




fun main() {
    val aluno1 = Usuario("Anderson", "anderson.cbcl3@gmail.com")
    println(aluno1)
    
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	TODO("Imprimir lista de matriculados em suas formações")
}