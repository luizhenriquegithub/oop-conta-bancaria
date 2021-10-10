package conta

abstract class Conta(
    val numero: Int,
    val agencia: String
) : MovimentacaoFinanceira {

    private var _saldo: Double = 0.0

    abstract fun taxa(): Double

    private fun temSaldo(valor: Double): Boolean {
        return (_saldo >= valor)
    }

    open fun getSaldo(): Double {
        return _saldo
    }

    override fun sacar(valor: Double) {
        if (temSaldo(valor)) {
            _saldo -= valor
            println("Saque -> Valor $valor")
        } else {
            println("Saque -> Não há saldo suficiente!")
        }
    }

    override fun depositar(valor: Double) {
        if (valor > 0) {
            _saldo += valor
            println("Deposito -> Valor $valor")
        } else {
            println("Deposito -> Informe um valor valido para deposito")
        }
    }

    override fun transferir(contaBancariaDestino: Conta, valor: Double) {
        if (temSaldo(valor)) {
            this.sacar(valor)
            contaBancariaDestino.depositar(valor)
            println(
                """
                    
            """.trimIndent()
            )
        }
    }

}