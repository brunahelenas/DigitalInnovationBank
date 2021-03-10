package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){

    val bruna = Pessoa(nome = "Bruna", cpf = "123456789" )
    println(bruna.nome)
    println(bruna.cpf)

    val joao = Funcionario("Joao Francisco","987654321", BigDecimal.valueOf(2000.0))
    println("\n")
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}