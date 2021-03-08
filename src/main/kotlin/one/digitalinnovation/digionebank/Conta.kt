package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Conta{
    abstract val agencia: String
    abstract val numero: String
    abstract val saldo: BigDecimal
}


    fun deposito (valor: BigDecimal) {

    }
    fun saque (valor: BigDecimal){

    }

