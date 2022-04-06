package com.example.ejerciciohilos.cinterfaces

class HiloSimulacionPeli (var pelicula:String){

    fun simularPeli() {
        var hilo = Thread(Runnable {
            println("El Hilo de la $pelicula ha sido creado")

        })
        hilo.start()
    }
}