package mx.edu.ittepic.ladm_u2_practica2_castellanosalexis

class Hilo(p:MainActivity):Thread(){
    var puntero = p
    var figura : FiguraGeometrica?=null

    override fun run() {
        super.run()
        //para que la empiece despues de 2 segundos iniciada la .apk***********************
        fun esperar(segundos: Long) {
            try {
                Thread.sleep(segundos * 1000)

            } catch (e: Exception) {
                println(e)
            }
        }
        esperar(2)
        //********************************************
        while (true) {
                    sleep(10)
                    puntero.runOnUiThread {
                        puntero.lienzo!!.animarCirculo()
                    }
        }
    }
}