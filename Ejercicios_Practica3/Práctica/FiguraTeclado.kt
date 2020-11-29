open class Figura { 
    
    open fun Dibujar() 
    { 
        println("Soy una figura") 
} }

class Cuadrado:Figura() { 
    
    override fun Dibujar() 
    {
        if (cuadrado = Figura){
            println("Esta es una figura")
        }else{
            println("Esta no es una figura")
        } 

} }

class Circulo:Figura() { 
    
    override fun Dibujar() 
    { 
        if (circulo = Figura){
            println("Esta es una figura")
        }else{
            println("Esta no es una figura")
        } 
} } 

class Triangulo:Figura() { 
    
    override fun Dibujar()
     { 
        if (triangulo= Figura){
            println("Esta es una figura")
        }else{
            println("Esta no es una figura")
        } 
} }

fun main(){

    println("Ingrese el nombre de la figura")
    var lista_figuras = readLine()!!.toInt()
  
}

fun main(){

    var lista_figuras = ArrayList<Figura>() 
    var cuadro = Cuadrado() 
    var circulo = Circulo() 
    var triangulo = Triangulo() 
    lista_figuras.add(cuadro) 
    lista_figuras.add(circulo) 
    lista_figuras.add(triangulo)
    for(fig in lista_figuras)
 { 
     fig.Dibujar() 

}
}