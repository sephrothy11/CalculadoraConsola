package com.example.calculadora1

fun main()
{
    var menu = 0
    var num1 = 0.00
    var num2 = 0.00

    do {
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicacion")
        println("4. Division")
        println("5. Salir")
        print("Seleccione la opcion deseada: ")
        menu = readLine()!!.toInt()
        when(menu)
        {
            1 ->{
                print("Primer numero: ")
                num1 = readLine()!!.toDouble()
                println()
                print("Segundo numero: ")
                num2 = readLine()!!.toDouble()
                println()
                println("El resultado es: " + (num1+num2))
                println()
            }

            2 ->{
                print("Primer numero: ")
                num1 = readLine()!!.toDouble()
                println()
                print("Segundo numero: ")
                num2 = readLine()!!.toDouble()
                println()
                println("El resultado es: " + (num1-num2))
                println()
            }

            3 ->{
                print("Primer numero: ")
                num1 = readLine()!!.toDouble()
                println()
                print("Segundo numero: ")
                num2 = readLine()!!.toDouble()
                println()
                println("El resultado es: " + (num1*num2))
                println()
            }

            4 ->{
                print("Primer numero: ")
                num1 = readLine()!!.toDouble()
                println()
                print("Segundo numero: ")
                num2 = readLine()!!.toDouble()
                println()
                println("El resultado es: " + (num1/num2))
                println()
            }
        }
    }while(menu < 5)
}