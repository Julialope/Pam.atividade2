
package funcoes


// Função para calcular a área da circunferência
fun areaCircunferencia(raio: Int): Double = PI * raio * raio
 val PI = 3.14159

// A função usa a constante PI para calcular a área com base no raio fornecido
fun main() {
    val raio = 4 // Define o raio da circunferência
    val area = areaCircunferencia(raio) // Chama a função para calcular a área
    println("A área da circunferência com raio $raio é: $area")
    // Imprime o resultado
}
