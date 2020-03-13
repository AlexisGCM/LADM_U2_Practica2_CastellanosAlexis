package mx.edu.ittepic.ladm_u2_practica2_castellanosalexis

import android.graphics.Canvas
import android.graphics.Paint

class FiguraGeometrica() {
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5
    var incY = 5

    var incXCirculo=3
    var incYCirculo=3

    var incXCirculo1=2
    var incYCirculo1=2

    var incXCirculo2=5
    var incYCirculo2=5

    var incXCirculo3=7
    var incYCirculo3=7

    var incXCirculo4=9
    var incYCirculo4=9

    var incXCirculo5=13
    var incYCirculo5=13

    var incXCirculo6=4
    var incYCirculo6=4

    constructor(x: Int, y: Int, radio: Int) : this() {
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        ancho = this.radio * 2
        alto = ancho
    }

    fun pintar(c: Canvas, p: Paint) {
        when (tipo) {
            1 -> {
                c.drawCircle(x + radio, y + radio, radio, p)
            }
            2 -> {
                c.drawRect(x, y, x + ancho, y + alto, p)
            }
        }
    }

    fun reboteCirculo(ancho:Int, alto:Int){
        x+= incXCirculo
        if(x<= -100||x>=ancho){
            incXCirculo*=-1
        }
        y+=incYCirculo
        if(y<=-100||y>=alto){
            incYCirculo*=-1
        }
    }

    fun reboteCirculo1(ancho: Int, alto: Int) {
        x += incXCirculo1
        if (x <= -100 || x >= ancho) {
            incXCirculo1 *= -1
        }
        y += incYCirculo1
        if (y <= -100 || y >= alto) {
            incYCirculo1 *= -1
        }
    }


    fun reboteCirculo2(ancho: Int, alto: Int) {
        x += incXCirculo2
        if (x <= -100 || x >= ancho) {
            incXCirculo2 *= -1
        }
        y += incYCirculo2
        if (y <= -100 || y >= alto) {
            incYCirculo2 *= -1
        }
    }

    fun reboteCirculo3(ancho: Int, alto: Int) {
        x += incXCirculo3
        if (x <= -100 || x >= ancho) {
            incXCirculo3 *= -1
        }
        y += incYCirculo3
        if (y <= -100 || y >= alto) {
            incYCirculo3 *= -1
        }
    }

    fun reboteCirculo4(ancho: Int, alto: Int) {
        x += incXCirculo4
        if (x <= -100 || x >= ancho) {
            incXCirculo4 *= -1
        }
        y += incYCirculo4
        if (y <= -100 || y >= alto) {
            incYCirculo4 *= -1
        }
    }
    fun reboteCirculo5(ancho: Int, alto: Int) {
        x += incXCirculo5
        if (x <= -100 || x >= ancho) {
            incXCirculo5 *= -1
        }
        y += incYCirculo5
        if (y <= -100 || y >= alto) {
            incYCirculo5 *= -1
        }
    }
    fun reboteCirculo6(ancho: Int, alto: Int) {
        x += incXCirculo6
        if (x <= -100 || x >= ancho) {
            incXCirculo6 *= -1
        }
        y += incYCirculo6
        if (y <= -100 || y >= alto) {
            incYCirculo6 *= -1
        }
    }
   /* fun lento(Msegundos:Long){
        Thread.sleep(Msegundos)
    }*/

}