package mx.edu.ittepic.ladm_u2_practica2_castellanosalexis

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p: MainActivity) : View(p) {
    var puntero = p
    var circulo = FiguraGeometrica(800, 100, 120)
    var circulo1 = FiguraGeometrica(100, 200, 150)
    var circulo2 = FiguraGeometrica(800, 1000, 70)
    var circulo3 = FiguraGeometrica(300, 900, 50)
    var circulo4 = FiguraGeometrica(1000, 500, 20)
    var circulo5 = FiguraGeometrica(500, 800, 10)
    var circulo6 = FiguraGeometrica(600, 1200, 80)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.rgb(135, 206, 235))
        //Dibujando un círculo
        paint.style = Paint.Style.FILL
        paint.color = Color.argb(70, 200, 155, 55)
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        circulo.pintar(canvas, paint)


        //Dibujando un círculo1
        paint.style = Paint.Style.FILL
        paint.color = Color.argb(70,100,250,200)
        circulo1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GREEN
        paint.strokeWidth = 5f
        circulo1.pintar(canvas, paint)
        //Dibujando un círculo2
        paint.style = Paint.Style.FILL
        paint.color = Color.argb(70,120,130,150)
        circulo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.YELLOW
        paint.strokeWidth = 5f
        circulo2.pintar(canvas, paint)
        //Dibujando un círculo3
        paint.style = Paint.Style.FILL
        paint.color = Color.argb(70,250,100,150)
        circulo3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.RED
        paint.strokeWidth = 5f
        circulo3.pintar(canvas, paint)
        //Dibujando un círculo4
        paint.style = Paint.Style.FILL
        paint.color = Color.argb(70,54,178,34)
        circulo4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        paint.strokeWidth = 5f
        circulo4.pintar(canvas, paint)
        //Dibujando un círculo5
        paint.color = Color.argb(40,20,250,147)
        circulo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        circulo5.pintar(canvas, paint)
        //Dibujando un círculo6
        paint.style = Paint.Style.FILL
        paint.color = Color.argb(55,33,150,243)
        circulo6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.DKGRAY
        paint.strokeWidth = 5f
        circulo6.pintar(canvas, paint)

    }

    fun animarCirculo() {
        circulo.reboteCirculo(width, height)
        circulo1.reboteCirculo1(width, height)
        circulo2.reboteCirculo2(width, height)
        circulo3.reboteCirculo3(width, height)
        circulo4.reboteCirculo4(width, height)
        circulo5.reboteCirculo5(width, height)
        circulo6.reboteCirculo6(width, height)
        invalidate()
    }
}