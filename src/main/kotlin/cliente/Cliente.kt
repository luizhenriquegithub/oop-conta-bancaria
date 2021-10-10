package cliente

import conta.Conta

abstract class Cliente (
    val endereco: String,
    val conta: Conta
) {
    abstract fun imprimirDados()
}


