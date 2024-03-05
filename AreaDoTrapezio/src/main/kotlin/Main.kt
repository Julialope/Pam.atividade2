package funcoes

fun areaTrapezio(baseMaior: Int, baseMenor: Int, altura: Int): Int {
    return ((baseMaior + baseMenor) * h) / 2
}

fun main() {
    val baseMaior = 10
    val baseMenor = 6
    val h = 4
    val area = areaTrapezio(baseMaior, baseMenor, h)
    println("A área do trapézio é $baseMaior, $baseMenor e altura $h = $area")
}
