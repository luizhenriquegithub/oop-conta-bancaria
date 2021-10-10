package conta

import cliente.ClientePF
import conta.cliente.ClientePJ

fun main() {

    val conta = ContaPoupanca(123,"001")
    println("saldo ${conta.getSaldo()}")
    conta.depositar(40.0)
    println("saldo ->  ${conta.getSaldo()}")

    val contaCorrente = ContaCorrente(321,"002")
    contaCorrente.depositar(50.0)
    println("taxa -> ${contaCorrente.taxa()}")

    val clientePF = ClientePF("endereco", conta, "Carol", 29)
    clientePF.imprimirDados()
    println("Saldo PF -> ${conta.getSaldo()}")
    println(clientePF.segmento)

    val clientePJ = ClientePJ("endereco PJ", contaCorrente, "CNPJ", "Razao Social")
    clientePJ.imprimirDados()
    println(clientePF.segmento)


}