# Auto wiring 
   
   it supports only for object type,
   
  expilcit and implecit
  we can do 1st expilcit by using autowire tag in xml doc
  and we can pass the type of the auto wire.
   
   these are the types in autowire
   
    byType
       it mean object type and class name must be similar
    byName
       it ment by litral name and id name must be similar 
    construcor
       it is only invoke the constructor agrs 
    default
       it will take default values as a wire
       
      
     @Autowired
       annotation is the most used annotation to inject the values implcitly.
     @Qualifier 
         annotation is used to pass which type of values or object will inject.
    	
    
    