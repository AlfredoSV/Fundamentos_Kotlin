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
        //usoDeBreak()
        //mostrarNombre("Alfredo")
        //arreglosYMatrices()
        //coleccionSetInmutables()
        //coleccionSetMutables()
        coleccionListastInmutablesYMutables()

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

    public fun mostrarNombre(nombre : String){
        println("Mi nombre es $nombre")
    }

    public fun arreglosYMatrices(){

        var nombres : Array<String> = arrayOf("Alfredo","Jorge","Mario")
        nombres.set(0,"AlfredoModi")
        var numeros = arrayOf(
            intArrayOf(3,4,5),
            intArrayOf(35,7,8),
            intArrayOf(4,5,6,6)
        )

        for (nombre in nombres){

            println(nombre)

        }

        for(i in nombres.indices)
            println(nombres.get(i))

        for(i in 0..nombres.size -1)
            println("${i + 1}: ${nombres.get(i)}")



    }

    public fun coleccionSetInmutables(){

        var clientesIds : Set<Int> = setOf(35,56,67)
        var datos = setOf(456,"Alfredo")
        //clientesIds.add(34)

        println("El set clientesIds contine el valor 35 ${clientesIds.contains(35)}")
        println("El set clientesIds contine el valor 0 ${clientesIds.contains(0)}")

        println("Tamaño de datos ${datos.size}")


    }

    public fun coleccionSetMutables(){

        var clientesIds : MutableSet<Int> = mutableSetOf(35,56,67)
        var datos = mutableSetOf(456,"Alfredo")

        clientesIds.add(0)
        println("El set clientesIds contine el valor 35 ${clientesIds.contains(35)}")
        println("El set clientesIds contine el valor 0 ${clientesIds.contains(0)}")

        println("Tamaño de datos ${datos.size}")


    }

    public fun coleccionListastInmutablesYMutables(){

        var clientesIds : List<Int> = listOf(35,56,67)
        //clientesIds.add(0)
        println("La lista clientesIds contine el valor 35 ${clientesIds.contains(35)}")
        println("La lista clientesIds contine el valor 0 ${clientesIds.contains(0)}")

        println("Tamaño de datos ${clientesIds.size}")

        var clientesIds2 : MutableList<Int> = mutableListOf(35,56,67)
        clientesIds2.add(0)
        println("La lsiat clientesIds2 contine el valor 35 ${clientesIds.contains(35)}")
        println("La list clientesIds2 contine el valor 0 ${clientesIds.contains(0)}")

        println("Tamaño de datos ${clientesIds.size}")


    }

}