package com.example.fundamentos

import android.R.string
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        const val moneda = "MXN"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYTiposDeDatos()
        //operadoresDeComparacion()
        //estructuraWhen()
        //estructuraIf()
        //println(estructuraDoWhile())
        usoDeBreak()

    }

    public fun variablesYTiposDeDatos(){

        var  nombre : String = "Alfredo"
        val edad : Number = 25
        var isFake : Boolean = true
        var saldo : Float = 343.23f
        var saldoDouble : Double = 245.66
        var inicial : Char = 'A'

        /*Impresión*/
        println(nombre)
        println(edad)
        println(moneda)
        println(isFake)
        println(saldo)
        println(saldoDouble)
        println(inicial)




    }

    public fun operadoresDeComparacion(){

        var a: Int = 3
        var b: Int = 4

        println(a == b)
        println(a != b)
        println(a>b)
        println(a<b)
        println(a<=b)
        println(a>=b)

    }

    public fun estructuraWhen(){

        var fecha : String = "20/09/2023"
        var mes : Int =  fecha.substring(3,5).toInt()

        when(mes){

            1 -> println("Mes importante")
            2 -> println("Mes medio importante")
            else -> println("No importa")

        }


    }

    public  fun estructuraIf(){

        var isAdmin : Boolean = false

        if(isAdmin) println("Eres adimistrador")
        else        println("Usuario normal")
    }

    public fun estructuraDoWhile(): Int{

        var i: Int = 0

        do {
            println(i)
            i++
        }while (i <= 10)

        return 0


    }

    public fun usoDeBreak(){
        var i: Int = 0

        do {
            println(i)
            if(i == 5){
                println("El valor es 5, se ejecuta break")
                break
            }
            i++
        }while (i <= 10)

    }

}