/*************************************
파일명 : Or07DDL.sql
DDL : DDL
****************************/

/*
테이블 생성
형식]
create table 테이블명(
컬럼1 자료형,
컬럼2 자료형,
......
primary key(컬럼명) 등 제약조건
);
*/

create table tb_member (
member_idx number(10),--10자리 정수
userid varchar2(30),
passwd varchar2(50),
username varchar2(30),
mileage number(7, 2)--실수표현. 전체7자리
);

--현재 접속한 계정에 생성된 테이블의 목록을 확인
select * from tab;
--테이블의 구조를 확인, 컬럼명, 컬럼의 자료형 , 제약조건 등을 확인할수 있음
desc tb_member;

/*
기존 생성된 테이블에 새로운 칼럼 추가하기
-> tb_member 테이블에 email 컬럼을 추가하시오

형식] alter table 테이블명 add 추가할칼럼 자료형(크기) 제약조건;
*/

alter table tb_member add email varchar2(100);
desc tb_member;

/*
기존 생성된 테이블의 칼럼 수정하기
-> tb_member 테이블의 email 칼럼의 사이즈를 200으로 확장하시오
또한 이름이 저장되는 username컬럼도 60으로 확장하시오

형식] alter table 테이블명 modify 수정할칼럼명 자료형(크기); 
*/

alter table tb_member modify email varchar2(200);
desc tb_member;
alter table tb_member modify username varchar2(60);
desc tb_member;

/*
기존 생성된 테이블에서 칼럼 삭제하기
-> tb_member 테이블의 mileage 컬럼을 삭제하시오

형식] alter table명  drop column mileage;
*/
alter table tb_member drop column mileage;
desc tb_member;

/*
테이블삭제하기
    -> tb_member 테이블은 더이상 사용하지 않으므로 삭제하시오
    
    형식] drop table 삭제할테이블명;
*/
drop table tb_member;
select * from tab;--빈 레코드 출력됨
desc tb_member;--오류발생

/*
퀴즈 ] 테이블 정의서로 작성한 employees테이블을 해당 study계정에
생성하시오, 단 제약조건을 명시하지 않습니다.
*/

create table employees (
employee_id	number(6),
first_name	varchar2(20),
last_name	varchar2(25),
email	varchar2(25),
phone_number	varchar2(10),
hire_date	date,
job_id	varchar2(10),
salary	number(8,2),
commission_pct	number(2,2),
manager_id	number(6),
department_id	number(4)
);
---------------------------------------------------
위에서 생성했던 tb_member테이블을 다시한번 생성한 후 진행합니다.
select * from tab;

--새로운 레코드를 삽입하는 DML문(뒤에서 학습할 예정)
insert into tb_member values(1, 'hong', '1234', '홍길동', 10000);
insert into tb_member values(2, 'park', '9876', '박문수', 20000);
select * from tb_member;

--테이블을 레코드까지 복사하기
create table tb_member_copy
as
select * from tb_member;
--복사되었는지 확인하기
desc tb_member_copy;
select*from tb_member_copy;

--테이블을 레코드를 제외하고 구조만 복사하기
create table tb_member_copy2
as
select * from tb_member where 1=0;
--복사되었는지 확인하기
desc tb_member_copy2;
select*from tb_member_copy2;

/*
DDL문 : 테이블을 생성 및 조작하는 쿼리문
    테이블 생성 : create table 테이블명
    테이블 수정 
        컬럼추가: alter table 테이블명 add 칼럼명
        컬럼수정: alter table 테이블명 modify 칼럼명
        컬럼삭제: alter table 테이블명 drop column 칼럼명
    테이블 삭제 : drop table 테이블명
*/


------------------------------연습문제-------------------
1.
create table pr_dept
dno
dname
loc

