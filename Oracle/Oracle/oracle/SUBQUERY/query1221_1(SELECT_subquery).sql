--select subquery

--�ܼ���
--������̺��� ��� ���� ���� ���� �޴� ����� �����ȣ, �����
--�Ի���, ������ ��ȸ�ϼ���.

SELECT EMPNO, ENAME, HIREDATE, SAL
FROM EMP
WHERE SAL > TRUNC((SELECT AVG(SAL) FROM EMP),0);

select * from CP_EMP3;

--cp_emp3���� �����ȣ�� 1111���� ����� �μ���ȣ�� ���� �μ���ȣ��
--����� emp���̺��� ��ȸ�ض�
--��ȸ column�� �μ���ȣ �����ȣ ����� �Ի��� ����
SELECT DEPTNO, EMPNO, ENAME, HIREDATE, SAL
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO FROM CP_EMP3 WHERE EMPNO = 1111);

-- scalra subquery (�ܼ���): ��ȸ�ϴ� column�� ���.
-- ���� query�� column��� �ٱ� query�� column���� ���ٸ� "���̺� ��.column�� ��������
-- column�� �ĺ��Ͽ� ���

-- �����ȣ,�����,�μ���ȣ,�μ����� ��ȸ
SELECT EMPNO, ENAME, DEPTNO,
(SELECT DNAME FROM DEPT WHERE DEPT.DEPTNO = EMP.DEPTNO) DNAME
FROM EMP;

--������̺��� �ְ���,�ְ����� �����ϴ� ������� ��ȸ
SELECT ENAME, (SELECT MAX(SAL) FROM EMP)
FROM EMP
WHERE SAL = (SELECT MAX(SAL) FROM EMP);

--������ subquery : ��ȸ ����� ������ �� ��ȸ




--�����ȣ
--��� ���̺��� ��ȣ,�����ȣ,����� ��ȸ
--��ȣ�� ��ȸ�Ǵ� column�� ������� 1������ ���������� �ο�
SELECT ROWNUM,EMPNO,ENAME
FROM EMP;

--rownum�� orderby���� ���� ����
--������̺��� ��ȣ,�����ȣ,�������ȸ
--������� ������������ ����
SELECT ROWNUM,EMPNO,ENAME
FROM EMP
ORDER BY ENAME;

--WHERE������ ����ϸ� 1������ �񱳰� �ǳ� 1�� ���Ŀ��� �񱳵��� �ʴ´�.
--������̺��� ��ȣ,�����ȣ,������� ��ȸ
--��, ��ȣ�� 1~7�������� ����� ���

SELECT ROWNUM , EMPNO, ENAME
FROM EMP
WHERE ROWNUM >= 1 AND ROWNUM <= 7;


--������
SELECT EMPNO, ENAME, SAL, HIREDATE
FROM (
			SELECT EMPNO, ENAME, SAL, HIREDATE
			FROM EMP
			);

--���� query���� column�� alias�� �ο��Ǹ� �ٱ� query������ alias�θ� ��밡��
SELECT EMPNO, ENAME, SAL, H
FROM (
			SELECT EMPNO, ENAME, SAL, HIREDATE H
			FROM EMP
			);

--rownum�� select���� �����ǰ� ���ȴ�.
SELECT a, EMPNO,ENAME,JOB
FROM (SELECT ROWNUM a, EMPNO , ENAME, JOB FROM EMP ORDER BY ENAME)  ;

--��� ���̺��� ���� �������� �Ի��� ������� 5���� ��� ������ ��ȸ
--�����ȣ ����� �Ի���
SELECT ROWNUM, EMPNO, ENAME, HIREDATE
FROM (SELECT EMPNO , ENAME, HIREDATE FROM EMP ORDER BY HIREDATE DESC)
WHERE ROWNUM BETWEEN 1 AND 5;

--��� ���̺��� ���� �������� �Ի������� ������� 5���� ��� ������ ��ȸ
--�����ȣ ����� �Ի���
SELECT EMPNO, ENAME, HIREDATE, HIRE
FROM (SELECT EMPNO , ENAME, HIREDATE, ROW_NUMBER()OVER(ORDER BY HIREDATE DESC) HIRE FROM EMP)
WHERE HIRE BETWEEN 2 AND 6;

