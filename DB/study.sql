Create table EMPLOYEE(
    empno   char(3) NOT NULL,
    ename   varchar(12),
    dept    varchar(18),
    tel     char(4),
    salary  int,
    PRIMARY KEY(empno)
);

insert into EMPLOYEE values(100,'�����','����','1241',200);
insert into EMPLOYEE values(101,'ȫ����','��ȹ','5621',200);
insert into EMPLOYEE values(102,'�̸���','����','5251',250);
insert into EMPLOYEE values(103,'������','����','1231',300);

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

insert into dept values(100,'������',100);
insert into dept values(200,'������',300);
insert into dept values(300,'���ź�',220);
insert into dept values(400,'�����',500);

insert into emp values(1001,'ȫ����',100,'2001-02-01','Ư������',350);
insert into emp values(1002,'������',100,'1999-01-01','��������',400);
insert into emp values(1003,'�赿��',200,'2000-09-01','ǰ������',300);
insert into emp values(1004,'�����',300,'1997-02-01','�޿�',450);
insert into emp values(1005,'�ڼ���',200,'2000-02-01','��������',320);

select * from EMPLOYEE;
select * from emp;
select * from dept;