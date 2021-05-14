#Autor: Camilo Henao Bravo

@stories
   Feature:Academy Choucair
     As a user,  I want to learn how to automate  in screenplay at the Choucair Academy with the automation course
     @scenario1
     Scenario: Search for a automation course
       Given than Camilo wants to learn automation at the academy Choucair
       | strUser   | strPassword  |
       | 1020440350|Choucair2021* |
       When he search for the course Recursos Automatización Bancolombia on the choucair academy platform
       | strCourse |
       | <strCourse>|
       Then he finds the course called resources Recursos Automatización Bancolombia
       | strCourse|
       | <strCourse> |
