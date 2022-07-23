package code.painel.collections

fun main() {
    val salarios = DoubleArray(4)
    salarios[0] = 4500.00
    salarios[1] = 1500.00
    salarios[2] = 3500.00
    salarios[3] = 2500.00

    for(salario in salarios)
        println(salario)
    println("-----------------")
    salarios.sort()
    salarios.forEach {
        println(it)
    }
    println("-----------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
    println("--------------------")
    val bonus = doubleArrayOf(1500.0, 1250.0, 5000.0)
    bonus.sort()
    bonus.forEach { println(it) }

}