# Spring
 spring is java framework it will automatically create objects and manage the object to the developer.
   it provides the @annotations 

# spring IOC
 IOC mean inversion of control
  it mean we can inject the dependencsis
  like setter and constructor injections

   by using xml file web.xml config file

# Spring mvc
 mvc mean mode view and controller

 model mean database to the java object
 view mean presentation layer
 controller mean businees logic or persistance logic


# spring boot 
 spring boot is the module of spring 
 it proviedes whole project dependences and configuration are automatically configure spring boot only.
 ```java

 list of some annations in spring boot very importent to write a code in spring boot


Spring boot basic annotations

 @SpringBootApplication
   @Configuration
   @EnableAutoConfiguration
   @ComponentScan
   // these are the child Annotations in @SpringBootApplication annoatation
 @SpringBootConfiguration
 @AllArgsConstructor
 @NoArgsConstructor


Streotype annotations

@Controller
@RestController
@Component
@Repository
@Service



spring core annotations
@Autowired
@Qulifyer
@Lazy



```

# TOTAL ANNOTATIONS IN COMPLETE JAVA AND SPRING, HIBERNET WITH DATA JPA, GIT COMMANDS


    For full stack JAVA Developer we should know abt this section is very imp to us....
    This ANNOTATIONS AND COMMANDS ARE VERY IMPT TO INTERVIEW ROOM 
       EXP PEOPLES.......

```java
            JAVA GENRAL ANNOTATIONS
                @Override
                @Deprecated
                @SafeVarArgs
                @SuppressWarnings
                @FunctionalInterface


            JAVA META ANNOTATIONS
                @Inherited
                @Documented
                @Target
                @Retention
                @Repeatable


            SPRING ANNOTATIONS
                @Configuration
                @Bean
                @Autowired
                @Qualifier @Primary
                @Lazy
                @Value
                @ProperitySource
                @ConfigurationPropeties
                @Profile
                @Scope

            SPRING BOOT ANNOTATIONS
                @SpringBootApplication
                @Configuration
                @ComponentScan
                @EnableAutoConfiguration
                @SpringBootConfiguration

            AUTO CONFIGURATION CONDIOTIONS
                @ConditionalOnClass
                @ConditionalOnMissingClass
                @ConditionalOnBean
                @ConditionalOnMissingBean
                @ConditionalOnPropery
                @ConditionalOnResource
                @ConditionalOnWebApplication
                @ConditionalOnNotWebApplication
                @ConditionalExpression
                @Conditional

            REQUEST RESPONCE
                @AllArgsConstructor
                @NoArgsConstructor
                @ControllerAdvice
                @ExceptionHandler
                @GetMapping
                @PostMapping
                @DeleteMapping
                @PutMapping
                @RequestMapping
                @RequestParam
                @RequestBody
                @PathVariable

            COMPONENT TYPE (STERO TYPE ANNOTATIONS )
                @Component
                @Service
                @Repository
                @Controller
                @RestController
                @Controller

            SPRING TESTING ANNOTATIONS
                @SpringBootTest
                @MockBean
                @Validated

            MISC ANNOTATIONS
                @Bean
                @ConditaonlOnJava
            
            SPRING AOP ANNOTATIONS
                @Befor
                @After
                @AfterReturning
                @AfterThrowing
                @Around

            Hibernates  DATA WITH JPA (ORM)
                @OneToOne
                @OneToMany
                @ManyToOne
                @ManyToMany
                @Entity
                @Id 
                @Table
                @Embeddable
                @Column
                @Transactional


            SPRING SECURITY
                @CrossOrigin
                @Secured
                @PreAuthorize
                @PermitAll

            CACHING RELATED ANNOTATIONS
                @EnableCaching
                @Cacheable
                @Cacheput
                @CacheEvict

            

            JUnit Testing 
                @RunWith
                @SuitClasses
                @Test
                @Before
                @After
                @BeforeClass
                @AfterClass
                @Ignor
          
            GIT COMMANDS 
                GIT CONFIG
                GIT INIT
                GIT CLONE
                GIT ADD
                GIT COMMIT
                GIT DIFF
                GIT RESET
                GIT STATUS
                GIT RM
                GIT LOG
                GIT SHOW
                GIT TAG
                GIT BRANCH
                GIT CHECKOUT
                GIT MERGE
                GIT REMOTE
                GIT PUSH
                GIT PULL
                GIT STASH


```


# ---------------------Notes----------------------

```java
      SPRING  CORE
              1 Dependency injection
              2 Spring JDBC Templetes
              3 Spring ORM, ORM, Hibernet with JPA
              4 Spring MVC
              5 Spring remoting, OXM, WEB, MAIL...



              DEPENDENCY INJECTION
                    We are using two type of dependency injections in 
                    spring,
                        1 Setter Injection
                        2 Constructor Injection

                              Setter Injection:
                                    we can inject values or depency's through SETTER methods

                              Constructor Injection
                                    we can inject values or depency's though Constructor 
                              
              Types of depedencys
                        Literal Depedency
                              ex: if we can pass the values through variables its called Litral
                                  int a;
                                  reference a=10; // in xml or pom depedencys
              
                        Object Depedency
                              ex: if we can pass the values through Oject references 
                                      Car car; // just intilization the object refer
                                      car = Car; // inject the value by using object refer

                        Collections Depedency
                              ex: if we can pass the values collections 
                                    Car car;
                                    car = <tataCars>car; // these type of injection is called collection injection
```




















