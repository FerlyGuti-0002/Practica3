open class Persona { 
    
    open fun Recorrer() 
    { 
        println("Soy una persona")
} }

class marcela:Persona() { 
    
    override fun Recorrer() 
    {
         println("Soy Marcela") 
} }

class brian:Persona() { 
    
    override fun Recorrer() 
    { 
        println("Soy Brian") 
} } 

class nicole:Persona() { 
    
    override fun Recorrer()
     { 
         println("Soy Nicole") 
} }

fun main(){

    var lista_personas = ArrayList<Persona>() 
    var Marcela= marcela() 
    var Brian = brian() 
    var Nicole = nicole() 
    lista_personas.add(Marcela) 
    lista_personas.add(Brian) 
    lista_personas.add(Nicole)
    for(per in lista_personas)
 { 
     per.Recorrer() 

}
}