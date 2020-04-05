# client-server-application


# You need to create database in phpMyAdmin call "student_info" AND create two tables "student" AND "enseignant"



*CREATE TABLE student 
   ( student_id varchar(30),
     nom varchar(30),
     prenom varchar(30),
     phone varchar (30),
     email varchar(255),
     filiere varchar(30),
     niveau varchar(10),
     option_nom varchar(30),
     prof varchar(30),
     primary key (student_id)
     );
     
*CREATE TABLE enseignant
   ( prof_id varchar(30),
     nom varchar (30),
     primary key (prof_id)
   );
   
# You change localhost with an IP address 
     
     
     
