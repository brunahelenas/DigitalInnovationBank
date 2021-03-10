package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){

    val maria = Gerente("Maria","1020304050", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}

