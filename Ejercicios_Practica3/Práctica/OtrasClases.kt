//Objetos, data class y class enum
enum class Direccion { 
    NORTH, SOUTH, WEST, EAST 
} 

data class Usuario(val usuario: String, val clave: String) 
object Calculadora { 
    
fun sumarDosNumeros(sum1: Int, sum2: Int): Int{ 
    return sum1+sum2 
}
}

fun main()
{
    var usuario = Usuario("Ferly","123") 
    var direccion = Direccion.NORTH 
    var suma = Calculadora.sumarDosNumeros(5,6) 
    println("Soy el usuario: ${usuario.usuario} y vivo en el ${direccion} y la suma es $suma")
}


