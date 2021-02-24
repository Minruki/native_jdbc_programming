select user(), database();

show tables;

desc title;
desc department;
desc employee;

select * from employee;
insert into employee values (1004, '이민정', 3, 4377, 3000000, 3);
update employee set empname = '민루키' where empno = 1004;
select tno, tname from title;
select * from department;
select tno, tname from title t where tno = 3;

update title set tname = '계약직' where tno = 6;

delete from title where tno = 6;
delete from department where deptno = 5;

insert into title values(6, '인턴');
insert 

select deptNo, deptName, floor from department;
select empno, empname, title, manager, salary, dept from employee;

select e.*, t.*, m.emp_no, m.emp_name, d.*
  from employee e join title t on e.tno = t.title_no
  		left join employee e on e.manager = m.emp_no
  		join department d on e.dno=d.dpet_no;

  	
create or replace view vw_employee
(empno, empname, tno, titlename, manager, mgrName, salary, dno, deptname, floor)
as 
select e.empname, e.empname, e.tno, t.titlename, e.salary,
	   d.deptno, d.deptname, d.floor
  from employee e join title t on e.tno = t.titleno
	   left join employee m on e.manager = m.empno
	   join department d on e.dno = d.deptno;
	  
select emp_no, emp_name, manager, salary, mgr_name, tno, title_name, dno, dept_name, floor
  from vw_employee;
  
select emp_no, emp_name, manager, salary, mgr_name, tno, title_name, dno, dept_name, floor
  from vw_employee
 where emp_no = 1003;
 