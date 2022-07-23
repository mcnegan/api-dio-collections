package code.painel.collections

fun main() {
    val joao = Funcionario("João", 1800.0, "CLT")
    val mauricio = Funcionario("Mauricio", 1212.0, "PJ") // Instancias
    val maria = Funcionario("Maria", 1550.0, "CLT")

    val funcionarios = listOf(joao, mauricio, maria) //Atributos

    funcionarios.forEach{ println(it) } // iterou a lista
    println("-------------------------")
    println(funcionarios.find{ it.nome == "Maria"})

    println("-----------1--------------")
    funcionarios
        .sortedBy { it.salario}
        .forEach {print(it)}

    println("----------2---------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach {print(it)}
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome:   $nome
            Salário:$salario 
        """.trimIndent()

}