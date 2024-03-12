/** SISTEMA DE REGISTROS DE FUNCIONÁRIOS
 *
 * Desenvolva um sistema de registro de funcionários para uma empresa.
 * O sistema deverá permitir registrar diferentes tipos de funcionários e apresentar suas informações.
 *
 * Alguns passos abaixo:
 *
 * 1.Crie uma classe base chamada Funcionario com as seguintes propriedades:
 * - Nome (string): o nome do funcionário.
 * - Idade (int): a idade do funcionário.
 *
 * 2.Crie uma classe Gerente que herda da classe Funcionario e adicione uma propriedade adicional:
 * - Setor (string): o setor em que o gerente trabalha.
 *
 * 3.Crie uma classe Desenvolvedor que herda da classe Funcionario e adicione uma propriedade adicional:
 * - Linguagem (string): a linguagem de programação que o desenvolvedor utiliza.
 *
 * 4.Crie uma classe Analista que herda da classe Funcionario e adicione uma propriedade adicional:
 * - Area (string): a área de especialização do analista.
 *
 * 5.Imprima uma mensagem informando que um novo funcionário foi registrado, juntamente com o nome e a idade do
 * funcionário. (Lembre-se do init)
 *
 * 6. Crie um método na classe Funcionario chamado Apresentar que imprima uma mensagem de apresentação do funcionário,
 * incluindo o nome e a idade.
 *
 * 7. Crie uma lista de funcionários e adicione diferentes tipos de funcionários (gerentes, desenvolvedores e analistas)
 * à lista.
 *
 * 8. Utilize o typecast (is e as) para verificar o tipo de cada funcionário na lista e chamar o método Apresentar
 * correspondente.
 */

open class Funcionario(var nome: String, var idade: Int) {
    init {
        println("Novo Funcionario registrado com nome: ${nome} e idade: ${idade}")
    }

    fun apresentar() {
        println("Olá me chamo ${nome} e tenho ${idade} anos")
    }
}

class Gerente(nome: String, idade: Int, setor: String) : Funcionario(nome, idade)

class Desenvolvedor(nome: String, idade: Int, linguagem: String) : Funcionario(nome, idade)

class Analista(nome: String, idade: Int, area: String) : Funcionario(nome, idade)

fun main() {

    val funcionario = Funcionario("Joao", 15)
    val gerente = Gerente("Mari", 30, "Robótica")
    val desenvolvedor = Desenvolvedor("Carla", 20, "Kotlin")
    val analista = Analista("Isa", 20, "Sistemas")

    val funcionarios = mutableListOf<Funcionario>()

    funcionarios.add(funcionario)
    funcionarios.add(gerente)
    funcionarios.add(desenvolvedor)
    funcionarios.add(analista)

    for (funcionario in funcionarios) {
        when (funcionario) {
            is Gerente -> {
                println("\nGerente encontrado:")
                (funcionario as Gerente).apresentar()
            }

            is Desenvolvedor -> {
                println("\nDesenvolvedor encontrado:")
                (funcionario as Desenvolvedor).apresentar()
            }

            is Analista -> {
                println("\nAnalista encontrado:")
                (funcionario as Analista).apresentar()
            }
        }

    }
}