package com.example.ejerciciohilos.bprincipiosderesponsabilidadunica

fun main() {

    for (i in 1..5){
        var azar = (1000..9000).random().toLong()
        azar.crearHilo(i,azar)
    }
}