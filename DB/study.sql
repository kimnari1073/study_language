Create table EMPLOYEE(
    empno   char(3) NOT NULL,
    ename   varchar(12),
    dept    varchar(18),
    tel     char(4),
    salary  int,
    PRIMARY KEY(empno)
);

insert into EMPLOYEE values(100,'김기훈','영업','1241',200);
insert into EMPLOYEE values(101,'홍성범','기획','5621',200);
insert into EMPLOYEE values(102,'이만수','영업','5251',250);
insert into EMPLOYEE values(103,'강나미','생산','1231',300);

create table dept(
    deptid int not null,
    dname char(20),
    budget int,
    primary key(deptid)
);
create table emp(
    empid int NOT NULL,
    ename char(20),
    deptid int,
    hire_data date,
    job char(20),
    salary int NOT NULL,
    primary key(empid),
    foreign key(deptid) references dept(deptid)
);

insert into dept values(100,'영업부',100);
insert into dept values(200,'관리부',300);
insert into dept values(300,'구매부',220);
insert into dept values(400,'생산부',500);

insert into emp values(1001,'홍성길',100,'2001-02-01','특수영업',350);
insert into emp values(1002,'곽희준',100,'1999-01-01','영업관리',400);
insert into emp values(1003,'김동준',200,'2000-09-01','품질관리',300);
insert into emp values(1004,'성재규',300,'1997-02-01','급여',450);
insert into emp values(1005,'박성범',200,'2000-02-01','수입자재',320);

select * from EMPLOYEE;
select * from emp;
select * from dept;