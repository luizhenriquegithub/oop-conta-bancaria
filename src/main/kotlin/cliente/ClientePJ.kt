package conta.cliente

import cliente.Cliente
import conta.Conta

class ClientePJ(
    endereco: String,
    conta: Conta,
    val cnpj: String,
    val razaoSocial: String
) : Cliente(endereco, conta) {

    override fun imprimirDados() {
        println("Razao Social: $razaoSocial Conta: ${conta.numero}")
    }

}