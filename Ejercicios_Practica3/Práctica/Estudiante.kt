//III. Herencia y polimorfismo   

class Estudiante(nombre:String, apellido:String, var asignatura:String, var profesor:String): 
Persona(nombre,apellido)

open class Persona(var nombre:String, var apellido:String)
 fun main()
 {
     var estudiante = Estudiante("Ferly", "Quiroz", "App", "Yesser")
    println("Asignatura: ${estudiante.asignatura} con ${estudiante.nombre}")
 }

      
    