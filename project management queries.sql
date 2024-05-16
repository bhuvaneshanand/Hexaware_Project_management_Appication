create database project_management_system;
use project_management_system;
create table Project(
Id int primary key,
ProjectName varchar(50), 
Description varchar(255),
Start_date varchar(20), 
status enum('started', 'dev', 'build', 'test', 'deployed')
);

create table Employee(
id int primary key, 
name varchar(200), 
Designation varchar(100), 
Gender varchar(12), 
Salary double, 
Project_id int, 
foreign key (project_id) references Project(Id) on delete cascade
);

create table Task(
task_id int Primary Key, 
task_name varchar(100), 
project_id int, 
employee_id int, 
Status enum('Assigned','started','completed'), 
foreign key(project_id) references Project(Id)on delete cascade, 
foreign key(employee_id) references Employee(id)on delete cascade
);

