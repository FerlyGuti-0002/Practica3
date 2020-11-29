class Persona{ 
    var nombre:String = "" 
    var apellido:String = "" 
    constructor(){ 

} 
    
    constructor(n:String, a:String):this() 
{ 
    nombre=n 
    apellido=a 
} 
} 

fun main(){ 
    var persona = Persona("Ferly","Quiroz") 
    var nueva = Persona() 
    nueva.nombre = "Da Silva" 
    nueva.apellido = "Gutiérrez" 
    println(persona.nombre)
    println(nueva.nombre)
 }