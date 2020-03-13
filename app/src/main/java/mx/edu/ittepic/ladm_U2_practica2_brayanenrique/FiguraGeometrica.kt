package mx.edu.ittepic.ladm_U2_practica2_brayanenrique

import android.graphics.Canvas
import android.graphics.Paint

class FiguraGeometrica() {
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 6
    var incY = 6

    var incYCirculoGrande = 2
    var incXCirculoGrande = 2

    var incYCirculoChico = 8
    var incXCirculoChico = 8

    var caidaX=4
    var caiday=4


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

    fun rebote(ancho: Int, alto: Int) {
        x += incX
        if (x <= -100 || x >= ancho) {
            incX *= -1
        }
        y += incY
        if (y <= -100 || y >= alto) {
            incY *= -1
        }
    }

    fun reboteCirculoGrande(ancho: Int, alto: Int) {
        x += incXCirculoGrande
        if (x <= -100 || x >= ancho) {
            incXCirculoGrande *= -1
        }
        y += incYCirculoGrande
        if (y <= -100 || y >= alto) {
            incYCirculoGrande *= -1
        }
    }


    fun reboteCirculoChico(ancho: Int, alto: Int) {
        x += incXCirculoChico
        if (x <= -100 || x >= ancho) {
            incXCirculoChico *= -1
        }
        y += incYCirculoChico
        if (y <= -100 || y >= alto) {
            incYCirculoChico *= -1
        }
    }



    fun reboteCirculoChicoNieve(alto: Int) {

        y += caiday
        if (y <= -100 || y >= alto) {
            caiday *= -1
        }
    }



    fun lento(Msegundos: Long) {
        Thread.sleep(Msegundos)
    }

}