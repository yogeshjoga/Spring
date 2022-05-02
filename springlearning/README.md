# this is the xml configuration and some implemenation 
```xml
	<?xml version="1.0" encoding="UTF-8"?>
 <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
           	xmlns:context="http://www.springframework.org/schema/context"
    	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    	http://www.springframework.org/schema/context/spring-	context.xsd">

    <!-- Define your beans here -->
   
  
    
    <!-- Dependences of setters in student class  -->
    <bean id="student" class="com.dependences.Student" >
	<property name="studentName" value="yogesh joga" ></property>
	<property name="rollNum" value="1001"></property>
	
	
	<!-- Dependences of constructor in student class  -->
	<constructor-arg name="studentName1" value="yogesh billa"></constructor-arg>
     <constructor-arg name="rollNum1" value="1002"></constructor-arg>
    </bean>
    
     
  <!-- this is the Object creation for use multiple times to use in our program -->
      <bean id="stud1" class="com.dependent.injection.object.type.Student1"/>
      
      
      
     <bean id="studentOfObject" class="com.dependent.injection.object.type.Student">
      <property name="studentName" value="yogesh joga darling"/>
      <property name="rollNum" value="1007"/>
      <property name="stud1" ref="stud1"/>
     
     </bean>

     
     

</beans>

```




	