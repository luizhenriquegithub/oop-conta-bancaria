package cliente

import conta.Conta
import conta.cliente.Segmento

class ClientePF(
    endereco: String,
    conta: Conta,
    val nome: String,
    val idade: Int
) : Cliente(endereco, conta) {

    val segmento: Segmento
        get() = if (conta.getSaldo() >= 50) {
            Segmento.VAN_GOGH
        } else {
            Segmento.CLASSICO
        }

    override fun imprimirDados() {
        println("Nome: $nome, Conta: ${conta.numero}")
    }


}