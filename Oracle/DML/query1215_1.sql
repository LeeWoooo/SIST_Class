--Comment


/*
1.
Edit (ED) : SQLplus���� �����ϴ� �������̴�.
���1)���� : Edit ���/���ϸ�.sql
���2)���� : ed ���/���ϸ�.sql

2.
Edit�ȿ��� SQL���� �ۼ��Ѵ�. (SQL Schema �ۼ�)
-SQL���� ��,�ҹ��ڴ� ������ �ʴ´�.(DBMS������ �빮�� ó��)
-SQL���� ������ ���� ǥ���� ;�� ���δ�.

3. �ۼ��� SQL�� ����
 @���/���ϸ�.sql
*/

SELECT * FROM DEPT;

DESC DEPT;


/*
	���̺� �ۼ�
  �л������� �����ϴ� ���̺��� ����.
  �й�(����5), �̸�(����������15), ����(����2), e-mail(���� ������ 50��),��ȭ��ȣ(���������� 13),
	�ּ�(���������� 200), �ֹι�ȣ(���������� 14),��(���������� 1),�Է���(��¥)
*/

-- ���̺���̳� �÷����� �����ؾ��Ѵ�
-- ���̺���̳� �÷����� �δܾ�� ������� ��� _�� Ȱ���ض�.
CREATE TABLE student(
	num NUMBER(5),
	name VARCHAR2(15),
	age NUMBER(2),
	email VARCHAR2(50),
	phone VARCHAR2(13),
	addr VARCHAR2(200),
	ssn VARCHAR2(14),
	class CHAR(1),
	inputDate DATE
);

--���̺��� ���� ����
DESC student;

--������ ������ �ִ� ���̺��� ����� ��ȸ
-- select * from tab;
-- tab�� DBMS���� �����ϴ� ���̺�� DataDictionary��� �Ѵ�.
SELECT * FROM TAB;


SELECT * FROM student;


/*
������ ���̺� record �߰��ϱ�
*/
--column�� �����ؼ� �߰�. (���� ��Ȯ�� ������ Ȯ���� ��ƴ�)
INSERT INTO student
VALUES
(1,'�̿��', 25, 'lee@gmail.com','010-1234-5678','����� ���α�','961111-1234567','S',SYSDATE);

SELECT * FROM STUDENT WHERE num=1;

INSERT INTO student
VALUES
(2,'�̿��', 25, 'woo@gmail.com','010-5678-1234','����� ���α�','961212-2345678','S',SYSDATE);


select * from student where num=2;


select * from student;

--column�� ����Ͽ� �߰�. (�ԷµǴ� ���� ��� column���� �߰� �Ǵ��� �˼� �ִ�.)
INSERT INTO student(
num,name,age,email,phone,addr,ssn,class,inputdate)
VALUES
(3,'�̷��',25,'ru@gmail.com','010-7894-1234','����� ���빮��','961225-1456789','S',SYSDATE);

select * from student;

INSERT INTO student(
num,name,age,email,phone,addr,ssn,class,inputdate)
VALUES
(4,'�̷��',25,'ra@gmail.com','010-4567-1234','����� ���빮��','961225-2456786','S',SYSDATE);


select * from student;

commit;

/*
	�˻� : ��� ���ڵ��� Ư�� �÷��� �˻��Ѵ�.
*/

SELECT * FROM student;

--�л� ���̺��� ��ȣ,�̸�,�̸���,�ּҸ� �˻��Ѵ�.

select num,name,email,addr
FROM student;

-- �̿���� �ּҸ� ����� ���빮���� ����
UPDATE student
SET ADDR = '����� ���빮��'
WHERE name = '�̿��';

commit;

select * FROM student;

--���̰� 25�� �л����� CLASS�� A�� ����
UPDATE student
SET CLASS = 'A'
WHERE AGE = 25;

select * FROM student;

--UPDATE OPTION ���
ROLLBACK;

select * FROM student;

--�л� ���̺��� �й��� 4���̸� ���� S �������� �л��� ���̸� 27�� �ּҸ� '����� ������',�Է����� query�� ����� �ð�����

UPDATE student
SET AGE = 27, ADDR = '����� ������',INPUTDATE = SYSDATE
WHERE NUM = 4 AND CLASS = 'S';

select * FROM student;

COMMIT;

select * FROM student;


DELETE
FROM STUDENT;

SELECT * FROM STUDENT;

ROLLBACK;

SELECT * FROM STUDENT;

-- �л����̺��� ��ȣ�� 1���� �л��� ���ڵ带 ����
DELETE
FROM STUDENT
WHERE AGE = 25;

SELECT * FROM STUDENT;

--TRUNCATE
TRUNCATE TABLE STUDENT;




--savapoint�� �̿��� rollback

SAVEPOINT INSERT_A;

INSERT INTO STUDENT(
NUM,NAME,ADDR)
VALUES
(1,'�̿��','����� ���α�');

SAVEPOINT B;

UPDATE STUDENT
SET ADDR = '����� ���빮��'
WHERE NAME = '�̿��';


ROLLBACK TO B;

SELECT * FROM STUDENT;

--���̺� ���� : ���ڵ��� ���¿� ������� ���̺��� �����ȴ�.
DROP TABLE STUDENT;

SELECT * FROM TAB;

-- �����뿡 ������ ���̺� Ȯ���ϱ�
SHOW RECYCLEBIN;

-- ���̺� ����
FLASHBACK TABLE student TO BEFORE DROP;

DROP TABLE STUDENT;

-- ���������
PURGE RECYCLEBIN;

