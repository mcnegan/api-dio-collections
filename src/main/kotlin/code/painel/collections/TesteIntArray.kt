package code.painel.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for(valor in values){
        println(valor)
    }
    println("-----------------------------------------")
    values.forEach {// aqui estamos utilizando a função lambida VALUES pra
        println(it)      // poder fazer a impressão aqui o IT é a nossa variável//

    }
    println("-----------------------------------------")
    values.forEach { valor ->
        println(valor)
    }
    println("-----------------------------------------")
    for (index in values.indices){
        println(values[index])
    }
    println("-----------------------------------------")
    values.sort()
    for (valor in values){
        println(valor)
    }
    println("-----------------------------------------")
}
