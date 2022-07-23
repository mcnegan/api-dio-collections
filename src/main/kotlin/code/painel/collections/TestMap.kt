package code.painel.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v")} // iteração do Map

    val map2 = mapOf(
        "Mauricio" to 2500.0,
        "Maria" to 4000.0
    )
    map2.forEach{ (k, v)-> println("Chave: $k - Valor: $v")}


}
