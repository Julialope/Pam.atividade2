package funcoes

// Função para calcular a área de um retângulo com base e altura fornecidas
fun calcularAreaRetangulo(base: Int, altura: Int): Int {
    return base * altura
}
// A função multiplica a base pela altura para obter a área do retângulo

fun main() {
    val base = 4 // Define a base do retângulo
    val altura = 5 // Define a altura do retângulo
    val area = calcularAreaRetangulo(base, altura) // Chama a função para calcular a área
    println("A área do retângulo é: $area")
    // Imprime o resultado
}



