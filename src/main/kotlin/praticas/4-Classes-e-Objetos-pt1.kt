// Questão 1
class Produto(var nome: String = "Produto", var preco: Double = 0.0)

// Questão 2
class Cliente {
    var nome: String = ""
    private var idade: Int = 0

    fun mostrarIdade() {
        println("A idade do cliente é: $idade")
    }
}

// Questão 3
abstract class Personagem {
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    override fun atacar() {
        println("Guerreiro está atacando com a espada")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        println("Mago está lançando um feitiço")
    }
}

// Questão 4
interface FormaGeometrica {
    fun calcularArea(): Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return largura * altura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return 3.14 * raio * raio
    }
}

// Questão 5
class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
        get() = field.capitalize()
    var saldo: Double = 0.0
        set(value) {
            if(value < 0){
                field = 0.0
            } else {
                field = value
            }
        }
}

fun main() {
    var produto1 = Produto("Arroz", 7.00)
    var produto2 = Produto("Shampoo")
    var produto3 = Produto() // sem argumentos

    println("${produto1.nome}  ${produto1.preco}")
    println("${produto2.nome}  ${produto2.preco}")
    println("${produto3.nome}  ${produto3.preco}")

    val cliente = Cliente()
    cliente.nome = "Ricardo"
    cliente.mostrarIdade()

    var guerreiro = Guerreiro()
    var mago = Mago()

    mago.atacar()
    guerreiro.atacar()

    var circulo = Circulo(2.0)
    println(circulo.calcularArea())
    var retangulo = Retangulo(5.0, 3.0)
    println(retangulo.calcularArea())

    var contaBancaria = ContaBancaria()
    contaBancaria.nomeTitular = "Ricardo"
    contaBancaria.numeroConta = "4"
    contaBancaria.saldo = -1.0

    println("${contaBancaria.numeroConta},${contaBancaria.nomeTitular},${contaBancaria.saldo}")
}
