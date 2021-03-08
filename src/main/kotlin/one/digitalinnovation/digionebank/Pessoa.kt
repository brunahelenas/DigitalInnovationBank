package one.digitalinnovation.digionebank

class Pessoa {

    var nome: String = "Bruna"
    var cpf: String = "123.785.014.87"
    private set

    constructor()

    fun UnePessoa() = "$nome e $cpf"
}

fun main(){

    val bruna = Pessoa()
    println(bruna.UnePessoa())
}