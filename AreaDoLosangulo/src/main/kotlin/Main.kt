package funcoes

fun areaLosango(baseMaior: Int, baseMenor: Int): Int {
    return (baseMaior * baseMenor) / 2
}

fun main() {
    val baseMaior = 10
    val baseMenor = 10
    val area = areaLosango(baseMaior, baseMenor)
    println("A área do losango é $baseMaior e $baseMenor = $area")
}
