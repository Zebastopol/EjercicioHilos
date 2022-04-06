package com.example.ejerciciohilos.abasicos

class HiloCreacionPeli () {

    fun crearHilo() {
        var h = Thread(Runnable {
        println("Se están creando los Hilos")
            /**/
        })

        h.start()
    }

}