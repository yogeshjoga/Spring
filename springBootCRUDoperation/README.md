# spring boot crud operation 
  Create 
  Retrive 
  Update
  Delete
  
# project requirements
 Get all the students list
 Update the student 
 Add new student into data
 Delete a student 

# Plan the project
 

# Application Architecure


# Build the project by using maven
  Go to new and crate a maven starter project
  Check the dependencys 
         spring web
         spring data jpa
         thymeleaf
         mysql driver
         spring boot dev tools

# Create the required Packages
		spring boot project main package
		    under this package we can create project packages 
		      controller
		      model
		      service
		      Repository
		     these packages are enough to do the project.

# Check the test run
    rapid run application first to make sure.
    
    
# Start the coding 
  Go to the model package crate a class file  StudentModel
  
  write the code 
  jpa @Entity
      @Table(name="Student")
      @Id this annotation is used to make a variable as primary key in ur database.
    all properties are private and genrate a getter and setter methods.
    
    Give the column names
    
    all column names and @Table name will automatically create a table in ur database
    
    
    
    
    
    
    
    
    
    