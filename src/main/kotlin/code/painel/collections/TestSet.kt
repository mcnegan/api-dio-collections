package code.painel.collections

//class TestSet {}

fun main() {
    val joao = Funcionario("João", 1800.0, "CLT")
    val mauricio = Funcionario("Mauricio", 1212.0, "PJ") // Instancias
    val maria = Funcionario("Maria", 1550.0, "CLT")

    val funcionarios1 = setOf(joao, mauricio)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao, maria, mauricio)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach {println(it)}

    println("---------Subtrai da coleção 3 o que está na coleção 2-------------")
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {println(it)}

    println("---------Inserir da coleção 2 o que está na coleção 3-------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach {println(it)}

}