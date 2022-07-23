package code.painel.collections

fun main() {
    val names = Array(5){""}
    names[0] = "Mauricio"
    names[1] = "Zaza"
    names[2] = "Isabelle"
    names[3] = "Jucycleide"
    names[4] = "Sofia"
    for(name in names){
    println(name)
    }
    println("----------------------------")
    names.sort()
    names.forEach {
        println(it)
    }
    println("----------------------------")
    val namestwo = arrayOf("Mauricio", "Cleide", "Isabelle", "Judy")
    namestwo.sort()
    namestwo.forEach {
        println(it)
    }

}