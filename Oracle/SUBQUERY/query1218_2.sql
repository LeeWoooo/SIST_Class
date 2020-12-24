--SUBQUERY
-- CREATE SUBQUERY
-- ��������� USER_CONSTRAINTS DATA DICTIONARY���� �˻� ����

--emp���̺��� �����ȣ, �����, ����, �μ���ȣ�� ��ȸ�Ͽ� cp_emp1 ���̺� ����
CREATE TABLE CP_EMP1
AS (SELECT EMPNO,ENAME,SAL,DEPTNO FROM EMP);
select * from CP_EMP1;


--emp���̺��� �����ȣ ����� ���� ���� ���ʽ� �Ի��� �μ���ȣ�� ��ȸ�Ͽ�
--cp_emp2����
CREATE TABLE CP_EMP2
AS(SELECT EMPNO,ENAME,JOB,SAL,COMM,HIREDATE FROM EMP);

SELECT * FROM USER_CONSTRAINTS;


--������̺��� �����ȣ, �����, �Ի���,�μ���ȣ,����,������
--���ڵ尡 ��ȸ���� �ʵ��� ��ȸ�Ͽ� cp_emp3���̺� ����. ������ ����
CREATE TABLE CP_EMP3 AS(
SELECT EMPNO, ENAME, HIREDATE, DEPTNO, JOB, SAL
FROM EMP
WHERE 1=0);


--WHERE 1=1 �� ��� ���ڵ带 �˻��ϴ� ��.
select * from CP_EMP3;


--������̺��� �Ի�⵵�� 1981���� ������� �����ȣ, �����, ����, �Ŵ�����ȣ , ����
--�Ի���, �μ���ȣ�� ��ȸ�Ͽ� cp_emp4 ���̺� ����
CREATE TABLE CP_EMP4 AS
(SELECT EMPNO, ENAME, JOB, MGR, SAL, HIREDATE, DEPTNO
 FROM EMP
 WHERE TO_CHAR(HIREDATE,'yyyy') = '1981');

 select * from CP_EMP4;


 --INSERT SUBQUERY
 --cp_emp3 ���̺� �Ʒ��� ���� ���ڵ带 �߰��ض�.
 --�����ȣ : 1111
 --����� : �̿��
 --�Ի��� : ����
 --�μ���ȣ : 10
 --���� : ���
 --���� : emp���̺� �����ȣ�� 7788�� ����� ����

 INSERT INTO CP_EMP3
 (EMPNO,ENAME,HIREDATE,DEPTNO,JOB,SAL)
 VALUES
 (1111,'�̿��',SYSDATE,10,'����',(SELECT SAL FROM EMP WHERE EMPNO = 7788));

select * from CP_EMP3;

DELETE FROM CP_EMP3 WHERE SAL IS NULL;

commit;


--EMP ���̺��� �����ȣ�� 7566�� �����  �����ȣ, ����̸�, �Ի���, �μ���ȣ, ���� , ������
--cp_emp3�� �߰�
INSERT INTO CP_EMP3
(EMPNO,ENAME,HIREDATE,DEPTNO,JOB,SAL)
(SELECT EMPNO,ENAME,HIREDATE,DEPTNO,JOB,SAL FROM EMP WHERE EMPNO = 7566);


--�����ȣ 1112 ����� �̿�� �Ի��� �̹��� �������� �μ���ȣ 10
--���� emp���̺��� ����� scott�� ����� ������ ����
--���� emp���̺��� �����ȣ�� 7566�� ����� ������ ������ ����
INSERT INTO cp_emp3
(EMPNO,ENAME,HIREDATE,DEPTNO,JOB,SAL)
VALUES
(1112,'�̿��',LAST_DAY(SYSDATE),10,
(SELECT JOB FROM EMP WHERE ENAME = 'SCOTT'),
(SELECT SAL FROM EMP WHERE EMPNO = 7566));

select * from CP_EMP3;
commit;

CREATE TABLE INSERT_SUB(
JOB VARCHAR2(9),
TOTAL_SAL NUMBER,
INPUT_DATE DATE);

--������̺��� �Ի�⵵�� 1981�̸鼭 ������ SALESMAN��
--��� ����� �ջ꿬���� INSERT_SUB TOTAL_SAL column �� �߰�
--JOB�� SALESMAN
--INPUTDATE�� ������

INSERT INTO INSERT_SUB (JOB,TOTAL_SAL,INPUT_DATE)
VALUES
('SALESMAN',(SELECT SUM(SAL) FROM EMP WHERE JOB = 'SALESMAN' AND TO_CHAR(HIREDATE,'yyyy') = 1981),SYSDATE);

select * from INSERT_SUB;

--1981�⿡ �Ի��� ������ �������� INSERT_SUB���̺� ���ó�¥�� �߰�
INSERT INTO INSERT_SUB (JOB, TOTAL_SAL,INPUT_DATE)
(SELECT DISTINCT JOB ,SUM(SAL),SYSDATE FROM EMP WHERE TO_CHAR(HIREDATE,'yyyy') = '1981'GROUP BY JOB);

--update subquery

SELECT * FROM CP_EMP3;

--cp_emp3���̺��� ������� �̿�� �� ����� ������
--emp ���̺��� �����ȣ�� 7698�� ����� ������ ������ �������� ����

UPDATE CP_EMP3
SET SAL = (
SELECT SAL
FROM EMP
WHERE EMPNO = 7698)
WHERE ENAME = '�̿��';

SELECT * FROM CP_EMP3;

commit;

--delete subquery
--emp TABLE�� ������� 'SCOTT'�� ����� �����ȣ�� ��ġ�ϴ� �����
--cp_emp3���� ����

SELECT * FROM CP_EMP3;

DELETE FROM CP_EMP3
WHERE EMPNO = (
								SELECT EMPNO
								FROM EMP
								WHERE ENAME = 'SCOTT');


SELECT * FROM CP_EMP3;

--emp���̺��� �μ���ȣ�� 20���� �μ��� �����ȣ�� ��ġ�ϴ� ��� ����� cp_emp3���̺��� ����

DELETE FROM CP_EMP3
WHERE EMPNO IN (
SELECT EMPNO
FROM EMP
WHERE DEPTNO = 20);

commit;
