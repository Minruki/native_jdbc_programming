INSERT INTO DEPARTMENT VALUES(1, '영업', 8);
INSERT INTO DEPARTMENT VALUES(2, '기획', 10);
INSERT INTO DEPARTMENT VALUES(3, '개발', 9);
INSERT INTO DEPARTMENT VALUES(4, '총무', 7);

INSERT INTO TITLE VALUES (1, '사장');
INSERT INTO TITLE VALUES (2, '부장');
INSERT INTO TITLE VALUES (3, '과장');
INSERT INTO TITLE VALUES (4, '대리');
INSERT INTO TITLE VALUES (5, '사원');

INSERT INTO EMPLOYEE VALUES(4377, '이성래', 1, NULL, 5000000, 2);
INSERT INTO EMPLOYEE VALUES(3426, '박영권', 3, 4377, 3000000, 1);
INSERT INTO EMPLOYEE VALUES(3011, '이수민', 2, 4377, 4000000, 3);
INSERT INTO EMPLOYEE VALUES(3427, '최종철', 5, 3011, 1500000, 3);
INSERT INTO EMPLOYEE VALUES(1003, '조민희', 3, 4377, 3000000, 2);
INSERT INTO EMPLOYEE VALUES(2106, '김창섭', 4, 1003, 2500000, 2);
INSERT INTO EMPLOYEE VALUES(1365, '김상원', 5, 3426, 1500000, 1);

insert into department values
(1, '영업', 8), (2, '기획', 10),(3, '개발', 9), (4, '총무', 7);

create table department2 (
    deptno int(11) not null,
    deptname char(20),
    floor int(11) default 1
);
insert into department2 value(1, '마케팅', 80);
insert into department2 value(2, '인사', 8);
insert into department2 value(3, '홍보', 9);


select * from employee;


select deptNo, deptName, floor from department;

create or replace view vw_full_employee
as
select e.empno
	 , e.empname
	 , t.tno as title_no
	 , t.tname as title_name
	 , e.manager as manager_no
	 , m.empname as manager_name
	 , e.salary
	 , d.deptNo
	 , d.deptName
	 , d.floor
  from employee e join title t on e.title_no = t.tno
   	   left join employee m on e.manager = m.empno
  	   join department d on e.dept = d.deptNo;

select empno, empname, title_no,title_name, manager_no, manager_name, salary, deptNo, deptName, floor
  from vw_full_employee;
 
 select * from vw_full_employee;

 
 select * from vw_full_employee;
 
select empno, empname, title as title_no, manager as manager_no, salary, dept as deptNo
  from employee;
  
 insert into employee values(1004, '천사', 5, 4377, 2000000, 1);
 update employee
    set dept = 3
  where empno = 1004;
  
 delete 
   from employee 
  where empno = 1004;
  
 select * from employee;
select empno, empname, title_no, manager as manager_no, salary, dept as deptNo from employee where empno= 4377;

update employee set empno = 1004, empname = '천사', salary =3, dept =1003 where empno = 3000000;
update employee set empname = '천사', title = 3, salary =3000000, dept =3, where empno = 1004;

select deptNo.deptName, floor from department;

desc employee;

select * from employee;

delete from employee where empno=1004;

-- 부서가 1인 사원정보를 출력
select empno, empname, title, manager, salary, dept 
  from employee
 where dept = (select deptNo from department where deptNo = 1);






