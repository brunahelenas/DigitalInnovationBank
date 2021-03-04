package one.digitalinnovation.digionebank

class Pessoa {

    var nome: String = "Bruna"
    var cpf: String = "123.785.014.87"
}

fun main(){

    val bruna = Pessoa()
    println(bruna.nome)
    println(bruna.cpf)

}