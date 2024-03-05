package funcoes

import kotlin.math.sqrt

// Função para calcular a área do triângulo equilátero
fun calcularAreaTrianguloEquilatero(lado: Double): Double = (lado * lado * sqrt(3.0)) / 4


// Função para calcular a área do triângulo isósceles
fun calcularAreaTrianguloIsosceles(base: Double, altura: Double): Double = (base * altura) / 2


// Função para calcular a área do triângulo escaleno
fun calcularAreaTrianguloEscaleno(ladoA: Double, ladoB: Double, ladoC: Double): Double {
    val s = (ladoA + ladoB + ladoC) / 2
    return sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC))
}


fun main() {
    // Exemplos de uso
    val ladoTrianguloEquilatero = 4.0
    val areaTrianguloEquilatero = calcularAreaTrianguloEquilatero(ladoTrianguloEquilatero)
    println("Área do triângulo equilátero: $areaTrianguloEquilatero")

    val baseTrianguloIsosceles = 6.0
    val alturaTrianguloIsosceles = 8.0
    val areaTrianguloIsosceles = calcularAreaTrianguloIsosceles(baseTrianguloIsosceles, alturaTrianguloIsosceles)
    println("Área do triângulo isósceles: $areaTrianguloIsosceles")

    val ladoATrianguloEscaleno = 3.0
    val ladoBTrianguloEscaleno = 4.0
    val ladoCTrianguloEscaleno = 5.0
    val areaTrianguloEscaleno = calcularAreaTrianguloEscaleno(ladoATrianguloEscaleno, ladoBTrianguloEscaleno, ladoCTrianguloEscaleno)
    println("Área do triângulo escaleno: $areaTrianguloEscaleno")
}

