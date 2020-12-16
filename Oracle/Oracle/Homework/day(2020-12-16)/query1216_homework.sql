--���� 1
--������ 1300 �ʰ� 3000�̸���
--��� ����� �����ȣ,�����,�Ի���,������ ��ȸ

SELECT EMPNO, ENAME, HIREDATE, SAL
FROM EMP
WHERE SAL > 1300 AND SAL <3000;


--���� 2
--������ CLERK,SALESMAN,ANALYST��
--����� �����ȣ, ����, �����, ����,����,�Ǽ��ɾ��� ��ȸ
--�� ������ ������ 12�� ������, �Ǽ��ɾ��� �������� ����3.3%�� ����
SELECT EMPNO, JOB, ENAME, SAL	,SAL/12 SALARY	,SAL*(1-0.033) REAL_INCOME
FROM EMP
WHERE JOB IN('CRERK','SALESMAN','ANALYST');

--���� 3
-- ������ 2000~3000���� �̸鼭 �μ��� 10���� �ƴ� �μ����� �ٹ��ϴ�
--����� �����ȣ, �����, �μ���ȣ, ����, ����, �Ի����� ��ȸ
SELECT EMPNO, ENAME, DEPTNO, SAL, JOB, HIREDATE
FROM EMP
WHERE (SAL BETWEEN 2000 AND 3000) AND DEPTNO NOT IN(10);

--���� 4
--������� 'A'�� �ְų�, 'S'�� �����鼭 ������ 1200���� ���� �޴� �����
--�����ȣ, �����, ����, ����, �μ���ȣ, �Ի����� ��ȸ
SELECT EMPNO, SAL, JOB, DEPTNO, HIREDATE
FROM EMP
WHERE ((ENAME LIKE '%A%') OR (ENAME LIKE '%S%')) AND SAL > 1200;

--���� 5
--��� ���̺��� �Ŵ����� �ִ� ����� �����ȣ, �����,����,�Ի����� ��ȸ�Ͽ�
--�Ʒ��� �������� ����ϰ� �÷����� ��ҹ��� �����Ͽ� OutPut�� ����.

SELECT ENAME||'('||EMPNO||')����'||HIREDATE||'�� �Ի��ϼ����� ���� ����'||SAL||'���Դϴ�' "OutPut"
FROM EMP
WHERE MGR IS NOT NULL;

--���� 6
--��� ���̺��� 7698, 7966, 7902 �Ŵ����� �������� �ʴ� �����
--�����ȣ, �����, ����, ����, ���ʽ�, �μ���ȣ�� ��ȸ
SELECT EMPNO, ENAME, JOB, SAL, COMM, DEPTNO
FROM EMP
WHERE MGR NOT IN(7698,7966,7902);

--���� 7
--��� ���̺��� ��� ����� �����ȣ, �����, ����, ����,���⿬���� ��ȸ
--���� ������ ���� �������� 10% �λ�� �ݾ�
SELECT EMPNO, ENAME, JOB, SAL, SAL+(SAL*0.1) NEXTYEAR_SAL
FROM EMP;
