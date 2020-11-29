//Modficador private y public

/*class Estudiante(nombre:String, apellido:String, var asignatura:String, var profesor:String): 
Persona(nombre,apellido)

open class Persona(private var nombre:String, public var apellido:String)
 fun main()
 {
    var estudiante = Estudiante("Ferly", "Quiroz", "App", "Yesser")
    println("Nombre: ${estudiante.nombre} con apellido ${estudiante.apellido}")
 }*/

 //Modficador Internal y public

 class Estudiante(nombre:String, apellido:String, var asignatura:String, var profesor:String): 
Persona(nombre,apellido)

open class Persona(internal var nombre:String, public var apellido:String)
 fun main()
 {
    var estudiante = Estudiante("Ferly", "Quiroz", "App", "Yesser")
    println("Nombre: ${estudiante.nombre} con apellido ${estudiante.apellido}")
 }