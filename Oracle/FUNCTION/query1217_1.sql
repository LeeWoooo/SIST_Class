--��ġ �Լ�

--���밪
SELECT ABS(-12),ABS(12)
FROM DUAL;

--�ݿø�
SELECT ROUND(555.555,2), ROUND(555.553,2)
FROM DUAL;

--��� ���̺��� ��� ����� �����ȣ ����� ���� ������ ��ȸ
-- �� ������ �Ҽ��� ù��° �ڸ����� �ݿø��Ͽ� ����θ� ���
SELECT EMPNO, ENAME, SAL, ROUND((SAL*0.033),0)
FROM EMP;

--�ø�
SELECT CEIL(15.7)
FROM DUAL;

--����
SELECT FLOOR(10.9)
FROM DUAL;

--����
--�Ǽ��� �ش� �ε��� �������� �ڸ���
SELECT TRUNC(15.79,1)
FROM DUAL;
--�����δ� �ش� �ε������� �ڸ���.
SELECT TRUNC(15.79,-1)
FROM DUAL;

--������̺��� ��� ����� �����ȣ ����� ���� ������ ��ȸ
--�� ������ ������ 3.3%�� ��� �� ������ �����Ͽ� ���
SELECT EMPNO, ENAME, SAL, TRUNC((SAL*0.033),-1) tax
FROM EMP;

--null

SELECT NVL('','��')
FROM DUAL;

--������̺��� �����ȣ ����� �Ի��� ���� ���ʽ� �Ѽ��ɾ��� ��ȸ
--�� ���ʽ��� ���ٸ� 0���� ��� �� ���ɾ��� ����+���ʽ�
SELECT EMPNO, ENAME, HIREDATE, SAL, NVL(COMM,0) COMM, (SAL+NVL(COMM,0)) TOTAL
FROM EMP;


--�����ȣ ���̺��� '������' �� ���� ��ȸ�Ͽ�
--�����ȣ �õ�, ����, ��, ������ ��ȸ
--�� ������ ���� ��� '���������� ���'
SELECT ZIPCODE, SIDO, GUGUN, DONG, NVL(BUNJI,'��������')
FROM ZIPCODE
WHERE DONG  LIKE '������%';

SELECT NVL2('','�ִ�','����'),NVL2('A','�ִ�','����')
FROM DUAL;

--������̺��� �����, �����ȣ, ����, ���ʽ�,�μ�Ƽ�긦��ȸ
-- �� �μ�Ƽ��� ���ʽ��� �ִٸ� �ϰ� 50��������ϰ� ���ٸ� 100

SELECT ENAME, EMPNO, SAL, NVL(COMM,0), NVL2(COMM,50,100) INCETIVE
FROM EMP;

--���ڿ�

--����
SELECT LENGTH('������ ����� �Դϴ�')
FROM DUAL;

--��� table���� ������� 4������ ����� ����� ������� ���ڼ�
--�����ȣ �Ի��� ��ȸ

SELECT ENAME, LENGTH(ENAME), EMPNO, HIREDATE
FROM EMP
WHERE LENGTH(ENAME)=4;


--���ڿ� ��ġ��
SELECT CONCAT('������','�����') ,'������'||'�����'
FROM DUAL;

--ù���ڸ� �빮�ڷ�
SELECT INITCAP('hello')
FROM DUAL;

SELECT INITCAP('HELLO'),INITCAP('i am a boy')
FROM DUAL;


--UPPER, LOWER
--������̺��� ������� 'scott'�� ����� �����ȣ, �����,����
--���ʽ�, �Ŵ�����ȣ ��ȸ
SELECT EMPNO, ENAME, SAL, COMM, MGR
FROM EMP
WHERE ENAME=UPPER('scott');
--WHERE LOWER(ENAME) = 'scott';


--index���
SELECT INSTR('AbcdE','A')
FROM DUAL;

--������� A�� ���Ե� ����� ��ȸ
SELECT ENAME
FROM EMP
WHERE INSTR(ENAME,'A') <>0;

--�����ڸ���
SELECT SUBSTR('AbcdeF',2,4)
FROM DUAL;

SELECT SUBSTR('AbcdeF',3,1)
FROM DUAL;

--�л����̺��� �л��� �̸�, �̸���, �̸����ּ� ��ȸ
SELECT NAME, EMAIL, SUBSTR(EMAIL,1,INSTR(EMAIL,'@')-1),
SUBSTR(EMAIL,INSTR(EMAIL,'@')+1)
FROM STUDENT;

--���ڿ� ġȯ
SELECT REPLACE('������ �ݿ��� �Դϴ�','������','������')
FROM DUAL;


--trim
SELECT TRIM('  A B C  ')
FROM DUAL;

SELECT LTRIM('  A B C  ')
FROM DUAL;

SELECT RTRIM(' A B C  ')
FROM DUAL;

--LPAD
SELECT LPAD('AbcD',10,'#')
FROM DUAL;

--���ڰ� �� 12�ڷ� �����ǰ� 12�ڰ� �ƴ϶�� �տ�0�� ä���־�
--12�ڷ� ���� �� �ش� ���ھտ� SIST���ڿ��� �ٿ�
--SIST_000000000001�� �������� ���
SELECT CONCAT('SIST_',LPAD(1,12,0)) num
FROM DUAL;

SELECT LPAD(LPAD(1,12,0),17,'SIST_') num
FROM DUAL;

SELECT 'SIST_'||LPAD(1,12,0) num
FROM DUAL;


--�����Լ�
SELECT DECODE(1,1,'��',2,'��''����')
FROM DUAL;

--�μ� ���̺��� �μ���ȣ, �μ��� , �ѱۺμ����� ��ȸ
--�� �ѱۺμ����� �Ʒ��� ǥ�� ���� �����Ѵ�.
--10�� = ���ߺ� 20�� = ���������� 30 = ������ 40 = �ѹ���
SELECT DEPTNO, DNAME, DECODE(DEPTNO,10,'���ߺ�',20,'����������'
,30,'������',40,'�ѹ���') KORDNAME
FROM DEPT;

--��� ���̺��� �����ȣ, �����, ����, �ѱ����� ��ȸ
--�ѱ� ������ �Ʒ��� ǥ�� ���� �����Ѵ�.
-- CLERK = �Ϲݻ��, SALESMAN = �������, MANAGER = �������, ANALYST = �м����, PRESIDENT = ����

SELECT EMPNO, ENAME, JOB,DEPTNO, DECODE(JOB,'CLERK','�Ϲݻ��','SALESMAN','�������','MANAGER','�������','ANALYST','�м����','PRESIDENT','����') KORJNAME
FROM EMP;

--������̺��� �����ȣ, �����, ���� , ���ʽ�, �μ���ȣ�� ��ȸ
--�� ���ʽ��� �Ʒ��� ǥ�� ���� �μ����� ���������Ѵ�.
-- 10 = ������ 10 20 = ������ 15 30 = ������ 20 40 = ������ 50
SELECT EMPNO, ENAME, SAL, (DECODE(DEPTNO,10,SAL*0.1,20,SAL*0.15,30,SAL*0.2,40,SAL*0.5)) BONUS, DEPTNO
FROM EMP;


--CASE

SELECT CASE 'java' WHEN 'java' THEN '�Ϻ��� OOP���'
									WHEN 'HTML' THEN 'MARKUP LANGUAGE'
									WHEN 'JavaScript' THEN 'Toy Language'
									ELSE '����� ������ �����ϴ�.'
				END  LANGUAGE
FROM DUAL;

-- ������̺��� �����ȣ, �����, �μ���ȣ, �μ��� ���ʽ�,������ ��ȸ
--�� �μ��� ���ʽ��� 10 - 100, 20 - 400, 30 - 250, �� �ܴ� 1000
SELECT EMPNO, ENAME, DEPTNO,
			 CASE DEPTNO WHEN 10 THEN 100
			 						WHEN 20 THEN 400
			 						WHEN 30 THEN 250
			 						ELSE 1000
				END DEPT_BONUS
				,JOB
FROM EMP;


--��ȯ�Լ�

SELECT SYSDATE
FROM DUAL;

SELECT TO_CHAR(SYSDATE,'yyyy-mm-dd am(hh24):mi:ss dy day q"�б�"')
FROM DUAL;

--������̺��� �����ȣ ����� �Ի����� ��ȸ
-- �� �Ի����� ��-��-���� �������� ���
SELECT EMPNO, ENAME, TO_CHAR(HIREDATE, 'mm-dd-yyyy')
FROM EMP;

-- ������̺��� �Ի�⵵��1981 ����� �����ȣ ����� ����, �Ի��� �μ���ȣ�� ��ȸ
SELECT EMPNO, ENAME, SAL, HIREDATE, DEPTNO
FROM EMP
WHERE TO_CHAR(HIREDATE,'yyyy') = '1981' ;

--���� ��ȯ
--0 : �ش��ڸ��� �����Ͱ� �������� ������ 0�� ����Ѵ�.
SELECT TO_CHAR(2020,'0,000,000')
FROM DUAL;

--9 : �ش��ڸ��� �����Ͱ� �����ϴ� �͸� ����Ѵ�.
SELECT TO_CHAR(2020,'9,999,999')
FROM DUAL;

-- ������̺��� �����ȣ ����� �Ի��� ������ ��ȸ
-- �� ������ 3�ڸ��� �ʰ����� ���� 3�ڸ����� ,�� �־� ���
SELECT EMPNO, ENAME, HIREDATE, TO_CHAR(SAL,'9,999')
FROM EMP;


--TO_DATE
SELECT TO_DATE('2020-12-17' , 'yyyy-mm-dd')
FROM DUAL;

--Insert�� ��¥ �߰�
select * from STUDENT;

INSERT INTO STUDENT(
NUM,NAME,INPUTDATE)
VALUES
(5,'�����',TO_DATE('2020-12-17','yyyy-mm-dd'));

