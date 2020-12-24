--EXISTS
--������̺��� ������� 'SCOTT'�� ����� ������ �� ������̺��� ��ȸ
--��� ��ȣ ����� �Ի��� ���� �μ���ȣ
--SCOTT�̶�� ����� ���� �� �� ��� ��� ������ ��ȸ �Ǿ������Ѵ�.
SELECT EMPNO,ENAME,HIREDATE,SAL,DEPTNO
FROM EMP
WHERE EXISTS(SELECT * FROM EMP WHERE ENAME = 'SCOTT');

--�μ��� ���� ������ ����
--�μ���ȣ(NUMBER(2) , ����(VARCHAR2(9) , ���� ��(NUMBER), �Է���(DATE)�� �����ϴ� ���̺� ����
CREATE TABLE DEPT_ACCOUNT(
DEPTNO NUMBER(2),
JOB VARCHAR2(9),
SAL_TOTAL NUMBER,
INPUT_DATE DATE
);


--���� ������ ���̺� 30�� �μ��̸鼭 1981�⿡ �Ի��� �������
--����,������,��ȸ������ ��¥�� �߰�
--1981�� �Ի��� ����� �����Ѵٸ� ��������� ����
--�׷��� �ʴٸ� ���� �۾��� �������� �ʴ´�.
INSERT INTO DEPT_ACCOUNT
		(DEPTNO,JOB,SAL_TOTAL,INPUT_DATE)
		(
		SELECT DEPTNO,JOB,SUM(SAL),SYSDATE
		FROM EMP
		WHERE EXISTS(SELECT EMPNO FROM EMP WHERE TO_CHAR(HIREDATE,'yyyy')='1981')
		AND DEPTNO = 10 AND TO_CHAR(HIREDATE,'yyyy')='1981'
		GROUP BY DEPTNO,JOB
		);

select * from DEPT_ACCOUNT;

