--������̺��� ������ ���
SELECT TRUNC(AVG(SAL))
FROM EMP;

--������̺��� �ְ� ����
SELECT MAX(SAL)
FROM EMP;

--������̺��� ���� ����
SELECT MIN(SAL)
FROM EMP;

--������̺��� ��� �������� ���� �޴� ����� �����ȣ, �����,����,�Ի��� ��ȸ
--WHRER�������� �����Լ��� ����� �� �����ϴ�.
SELECT EMPNO,ENAME,SAL,HIREDATE
FROM EMP
WHERE AVG(SAL) < SAL;

--�����Լ��� group by


--������̺��� �μ���ȣ,�μ��� �ο���ȸ , �μ��� ������ ��
SELECT DEPTNO,COUNT(ENAME),SUM(SAL)
FROM EMP
GROUP BY DEPTNO;


--������̺��� �Ŵ��� ��ȣ, �Ŵ����� �����ϴ� �����
--�ְ���
SELECT MGR ,COUNT(EMPNO),MAX(SAL)
FROM EMP
WHERE MGR IS NOT NULL
GROUP BY MGR;

--��� ���̺��� ������� 4�� �̻��� �μ��� �μ���ȣ,�μ��� �����,
--������ ��
SELECT DEPTNO,COUNT(DEPTNO),SUM(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING COUNT(EMPNO)>4;

--������̺��� �Ŵ����� �����ϴ� ����� 2�� �̻��� �Ŵ�����
--�Ŵ��� ��ȣ, ���������, ��� ����, �ְ���,���������� ���̸� ��ȸ
SELECT MGR,COUNT(EMPNO),TRUNC(AVG(SAL),0),(MAX(SAL)-MIN(SAL))
FROM EMP
GROUP BY MGR
HAVING COUNT(EMPNO) > 1;

--��� ���̺��� �μ���ȣ, �μ��� �����, ���� ��, ��ü������ ��ȸ
SELECT DEPTNO, COUNT(EMPNO),SUM(SAL)
FROM EMP
GROUP BY ROLLUP(DEPTNO);

--����column�� �׷����� ���̸� �׷캰 ���, �߰���� , ���հ���� ����Ѵ�.
--���� �μ��� �ش��ϴ� ����� ����� �� ������ ��ȸ
SELECT DEPTNO,JOB,COUNT(EMPNO)
FROM EMP
GROUP BY ROLLUP(DEPTNO,JOB);

SELECT DEPTNO,JOB,COUNT(EMPNO)
FROM EMP
GROUP BY CUBE(DEPTNO,JOB);

--- ORDER BY

-- ������� �������� ����.
--�÷��� �������� ���� (ASC)�� �⺻����
SELECT EMPNO, ENAME
FROM EMP
ORDER BY ENAME;

-- ������� �������� ����.
SELECT EMPNO, ENAME
FROM EMP
ORDER BY ENAME DESC;

--�����ȣ ����� ������ ��ȸ
-- ������ ���� ���� ������ ��ȸ
SELECT ENAME ,SAL
FROM EMP
ORDER BY SAL DESC, ENAME;


--���ڿ��� ���� �ڸ����� ����
CREATE TABLE TEST_ORDERBY(
NUM VARCHAR2(10)
);

INSERT INTO TEST_ORDERBY(NUM) VALUES (1);
INSERT INTO TEST_ORDERBY(NUM) VALUES (11);
INSERT INTO TEST_ORDERBY(NUM) VALUES (201);
INSERT INTO TEST_ORDERBY(NUM) VALUES (10009);
INSERT INTO TEST_ORDERBY(NUM) VALUES (2005);
INSERT INTO TEST_ORDERBY(NUM) VALUES (3);
INSERT INTO TEST_ORDERBY(NUM) VALUES (4);
INSERT INTO TEST_ORDERBY(NUM) VALUES (321);
INSERT INTO TEST_ORDERBY(NUM) VALUES (30001);

commit;

--���ڿ�(varchar2,char)���������� ���ڸ� ������ �ڸ����� ������ ����.
SELECT NUM
FROM TEST_ORDERBY
ORDER BY TO_NUMBER(NUM);

select * from TEST_ORDERBY ;



--RANK �Լ� : ������ �ο��� �� ���ȴ�.
--ORDER BY���� �Բ� ������ �ʴ´�.

--������̺��� �����ȣ ����� ���� ������ ������ ��ȸ
SELECT EMPNO,ENAME,SAL,RANK() OVER(ORDER BY SAL)
FROM EMP;

SELECT EMPNO,ENAME,SAL,ROW_NUMBER() OVER(ORDER BY SAL DESC)
FROM EMP;

SELECT ENAME,RANK()OVER(ORDER BY ENAME)
FROM EMP;



-- ������̺��� ���� ������ �������� ���� ����� ��ȸ
--�� ���� ������ �����Ѵٸ� ���� ������ ������.
SELECT JOB, RANK()OVER(PARTITION BY JOB ORDER BY SAL),SAL,ENAME
FROM EMP;

-- ��¥ �Լ�
-- ��¥�� +������ ����ϸ� ���� ��¥���� +�� ����ŭ�� ���� ������ ��¥�� ���� �� �ִ�.
-- ��¥�� -������ ����ϸ� ���� ��¥���� -�� ����ŭ�� ���� ������ ��¥�� ���� �� �ִ�.
SELECT SYSDATE, SYSDATE+1 ,ADD_MONTHS(SYSDATE,101)
FROM DUAL;
