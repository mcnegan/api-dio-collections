package code.painel.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for(salario in salarios){
        println(salario)
    }
    println("-------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")
    println("-------------------------")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    salarioMaiorQue2500.forEach{ println(it) }
    println("-------------------------")
    println("Parte 2 - Arrays count, find e any")
    println("-------------------------")
    println(salarios.count { it in 2000.0..5000.0} )
    println("-------------------------")
    println(salarios.find { it == 2250.0 } )
    println("-------------------------")
    println(salarios.any { it == 1000.0} )
    println("-------------------------")
    println(salarios.any { it == 500.0} )

}
