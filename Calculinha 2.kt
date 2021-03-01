
fun main() {


    print("Digite um Número Inteiro: ")
    var a: Double = readLine()!!.toDouble()

    print("Digite um Número Inteiro: ")
    var b: Double = readLine()!!.toDouble()
    println()


    var s: Double = a + b
    var m: Double = a - b
    var v: Double = a * b
    var d: Double = a / b

    println("O resultado de $a + $b é: $s ")
    println("O resultado de $a - $b é: $m ")
    println("O resultado de $a X $b é: $v ")
    println("O resultado de $a / $b é: $d ")


}
