const val ADICAO = 1
const val SUBTRACAO = 2
const val DIVISAO = 3
const val MULTIPLICACAO = 4

fun main() {

    print("Digite um Número Inteiro: ")
    var a:Int = readLine()!!.toInt()
    print("Digite um Número Inteiro: ")
    var b: Int = readLine()!!.toInt()
    print("Escolha a Operação ( 1 = +; 2 = -; 3 = /; 4 = *  ): ")
    var oper:Int = readLine()!!.toInt()

    var s = operacao(a,b,oper)
    println(s)
}

fun operacao(a:Int,b:Int,op:Int):String {

    var o: Int
    var r: String


    if (op == 1) {
        o = a + b
        r = "Adição - Resultado: $o"
    } else if (op == 2) {
        o = a - b
        r = "Subtração - Resultado: $o"
    } else if (op == 3) {
        o = a / b
        r = "Divisão - Resultado: $o"
    } else if (op == 4){
        o = a * b
        r = "Multiplicação - Resultado: $o"
    } else {
        r = "Digite um número de 1 a 4!"
    }
        return r

}


