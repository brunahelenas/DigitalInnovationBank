package one.digitalinnovation.digionebank

class Pessoa {

    var nome: String = "Bruna"
    var cpf: String = "123.785.014.87"
    private set

    inner class Endereco{

        var rua: String = "Aristides Cury"
    }

}

fun main(){

    val bruna = Pessoa()
    println(bruna.nome)
    println(bruna.cpf)
    println(bruna.Endereco().rua)
}