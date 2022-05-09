# 1 thing set the server take tomcat 9v 
   install tomcat 9v after change the admin host port as a 1.
# 2 create a web dynamic project
  create a web dynamic project 
  with web.xml file.
# 3 IN main java source file create a package
   create what is your req package name 
    starts with com.somthing your require
# 4 create spring Bean config file
   crate spring Bean config file
    use existing servlets class or jsp trick it and select DISPATCHER SERVLETS.
    name should be MUST follow some rules 
    your servlet name with -servlet.xml
    and select your required bean extensions 
    like beans context servlets.
    it will automati
# 5 Go to the package 
   create a java file 
   before class put an annotation is @Controller
   and create a method with return type 
   befor method put an Annoations 
   @ResponceBody
   @RequestMapping(/put url ur wish)
   
# run as a server select the server and run it 
  Run the project as a server 
  it will show 404 error
  don't worry see your xml file inside xml requestmapping tag content is your url
  after enter this add forward slash and enter your java method requestMapping url
  boom boom you can create a app 
  
  by using java servlet spring wow very nice..
  congrats.