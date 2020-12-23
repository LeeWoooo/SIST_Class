--���� 1
--�Ʒ� ���õ� ������׿� ���Ͽ� ���ڵ带 ������ �� �ִ� ���̺� ����
--���̵� �̸� ���� ���� �ּ� �μ���ȣ �̸��� �Է���
--*�÷��� �����ؾ� �ϴ� �������.
-- ���̵�� null�� ������� ������, �ߺ����� ������ �� ����.
-- �̸��� �ݵ�� �ԷµǾ���Ѵ�.
-- ���̴� 20~39������� �Է°����ϴ�.
-- ������ 'M' �Ǵ� 'F'�� �Է°����ؾ��Ѵ�.
-- �ּҴ� �ݵ�� �ԷµǾ���Ѵ�.
-- �μ���ȣ�� dept���̺� deptno���� �ش��ϴ� ��ȣ�� �Է°����ؾ��ϸ�
-- dept���̺��� ���ڵ尡 �����Ǹ� ���� ���� �Ǿ���Ѵ�.
-- �̸����� ���� ���� ������ �ִٸ� �����ؾ��Ѵ�.
-- �Է�����  �Էµ��� �ʴ´ٸ� �߰��Ǵ� ������ ���� ��¥���ԷµǾ���Ѵ�.

CREATE TABLE HOMEWORK_1222(
ID VARCHAR2(15),
NAME VARCHAR2(12) NOT NULL,
AGE NUMBER(2) CHECK(AGE BETWEEN 20 AND 39),
GENDER CHAR(1) CHECK(GENDER IN('M','F')),
ADDR VARCHAR2(100) NOT NULL,
DEPTNO NUMBER(2) CHECK(DEPTNO IN(10,20,30,40)),
EMAIL VARCHAR(30) UNIQUE,
INPUT_DATE DATE DEFAULT SYSDATE
);

SELECT * FROM HOMEWORK_1222;


--���� 1. �������� ����, ���, BMW, BENZ�� ��� ������ ������, ������
--�𵨸�, �ɼ�, ����,�Է����� ��ȸ�ϼ���.
--��, �Է����� ������������ �������� �� 3~5��° ���ڵ常 ����ϰ�,
--�ɼ��� ù��°',' ������ ����մϴ�.
--�Է����� 'mm-dd-yyyy' �� �������� ����մϴ�.

SELECT COUNTRY,MAKER,MODEL,SUBSTR(CAR_OPTION,0,INSTR(CAR_OPTION,',')-1) CAR_OPTION,CAR_YEAR,TO_CHAR(HIREDATE,'mm-dd-yyyy') HIREDATE,SEQ
FROM

	(SELECT cct.COUNTRY,cct.MAKER,cmk.MODEL,cmd.CAR_OPTION,cmd.CAR_YEAR,cmd.HIREDATE,ROW_NUMBER()OVER(ORDER BY cmd.HIREDATE DESC) SEQ
	FROM CAR_COUNTRY cct, CAR_MAKER cmk, CAR_MODEL cmd
	WHERE (cmk.MAKER(+) = cct.MAKER AND cmd.MODEL(+) = cmk.MODEL) AND cct.MAKER IN('����','���','BMW','BENZ'))

WHERE SEQ BETWEEN 3 AND 5;



select * from CAR_COUNTRY;
select * from CAR_MAKER;
select * from CAR_MODEL;

SELECT COUNTRY,MAKER,MODEL,CAR_OPTION,CAR_YEAR,HD,SEQ

FROM
		(SELECT cct.COUNTRY COUNTRY ,cct.MAKER MAKER,cmk.MODEL MODEL,
		cmd.CAR_OPTION CAR_OPTION,cmd.CAR_YEAR CAR_YEAR,TO_CHAR(cmd.HIREDATE,'mm-dd-yyyy') HD,
		ROW_NUMBER()OVER(ORDER BY cmd.HIREDATE DESC) SEQ

		FROM CAR_COUNTRY cct
		LEFT JOIN CAR_MAKER cmk
		ON cmk.MAKER = cct.MAKER
		LEFT JOIN CAR_MODEL cmd
		ON cmd.MODEL = cmk.MODEL

		WHERE cct.MAKER IN('����','���','BMW','BENZ')
		)

WHERE SEQ BETWEEN 3 AND 5;


--����2. �����ɼǿ� 'ABS' ����� �ִ� ������ ������, ������,�𵨸�,
-- ����, ����, �Է���, �̹������� ��ȸ�ϼ���.
-- ��, ������ ������������ �����ϵ� ������ ���ٸ� ������ ������������
-- �������� �� 2~7��° ���ڵ常 ����մϴ�.
-- ���İ� ���ݿ��� 3�ڸ� ���� ','�� �־� ����ϰ�, �ɼ��� 'ABS' ������
-- ����մϴ�. �̹������� ó������ '.'������ ����մϴ�.
-- �ɼǰ� �̹������� ��� �빮�ڷ� ����մϴ�.
SELECT COUNTRY,MAKER,MODEL,TO_CHAR(CAR_YEAR,'9,999') CAR_YEAR,TO_CHAR(PRICE,'9,999') PRICE,
HIREDATE,UPPER(SUBSTR(CAR_IMG,0,INSTR(CAR_IMG,'.')-1)) CAR_IMG,UPPER(SUBSTR(CAR_OPTION,0,INSTR(CAR_OPTION,'ABS')+2)) CAR_OPTION,SEQ
FROM
		(SELECT cct.COUNTRY,cct.MAKER,cmk.MODEL,cmd.CAR_YEAR,cmd.PRICE,cmd.HIREDATE,cmd.CAR_IMG,cmd.CAR_OPTION,
		ROW_NUMBER()OVER(ORDER BY cmd.PRICE ASC,cmd.CAR_YEAR DESC) SEQ
		FROM CAR_COUNTRY cct, CAR_MAKER cmk, CAR_MODEL cmd
		WHERE (cmk.MAKER = cct.MAKER AND cmd.MODEL = cmk.MODEL) AND cmd.CAR_OPTION LIKE '%ABS%')
WHERE SEQ BETWEEN 2 AND 7;



SELECT COUNTRY,MAKER,MODEL,CAR_YEAR,PRICE,HD,IMG,CAR_OPTION,SEQ

FROM

		(SELECT cct.COUNTRY COUNTRY, cct.MAKER MAKER, cmk.MODEL MODEL, TO_CHAR(cmd.CAR_YEAR,'9,999') CAR_YEAR,
		TO_CHAR(cmd.PRICE,'9,999') PRICE, cmd.HIREDATE HD,UPPER(SUBSTR(cmd.CAR_IMG,0,INSTR(cmd.CAR_IMG,'.')-1))IMG,
		UPPER(cmd.CAR_OPTION) CAR_OPTION,
		ROW_NUMBER()OVER(ORDER BY PRICE ASC, HIREDATE DESC) SEQ

		FROM  CAR_COUNTRY cct , CAR_MAKER cmk , CAR_MODEL cmd

		WHERE (cmk.MAKER = cct.MAKER AND cmd.MODEL = cmk.MODEL) AND cmd.CAR_OPTION LIKE '%ABS%'
		)

WHERE SEQ BETWEEN 2 AND 7;



--����3. �����ȣ,�����,����, ���ʽ�, �Ǽ��ɾ�, �Ի���,�μ���ȣ,�μ���, ��ġ,
--�����ȣ,�õ�,����,��, ������ ��ȸ�ϼ���.
--��. ������� ������������ �������� �� 3~6��° ���ڵ常 ����մϴ�.
--������� ù���ڸ� �빮�ڷ� ����մϴ�.
--������ ��ü 7�ڸ��� ���� ','�� �־� ����ϵ� 7�ڸ��� ���� �ʴ� ������
--0�� �־� ����ϼ���.
--�����ȣ�� '-'�ڷ� ���͸� ����մϴ�.
--������ ���ٸ� '��������'�� ����մϴ�.
select * from ZIPCODE;

SELECT EMPNO,INITCAP(ENAME),TO_CHAR(SAL,'0,000,000') SAL,NVL(COMM,0) COMM,((SAL+NVL(COMM,0))*(1-0.033)) TOTAL_MONEY,
HIREDATE,DEPTNO,DNAME,LOC,SUBSTR(ZIPCODE,INSTR(ZIPCODE,'-')+1) ZIPCODE,SIDO,GUGUN,DONG,NVL(BUNJI,'��������') BUNJI ,SEQ
FROM
		(SELECT e.EMPNO,e.ENAME,e.SAL,e.COMM,e.HIREDATE,d.DEPTNO,d.DNAME,d.LOC,
		z.ZIPCODE,z.SIDO,z.GUGUN,z.DONG,z.BUNJI,ROW_NUMBER()OVER(ORDER BY e.ENAME) SEQ
		FROM DEPT d, EMP e, ZIPCODE z
		WHERE (e.DEPTNO = d.DEPTNO AND z.SEQ = e.EMPNO))
WHERE SEQ BETWEEN 3 AND 6;



SELECT EMPNO,ENAME,SAL,COMM,REAL_MONEY,DEPTNO,DNAME,LOC,ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ

FROM
		(SELECT e.EMPNO EMPNO,INITCAP(e.ENAME) ENAME,TO_CHAR(e.SAL,'0,000,000') SAL,
		NVL(e.COMM,0) COMM, (e.SAL+NVL(e.COMM,0))*(1-0.033) REAL_MONEY,
		e.DEPTNO DEPTNO,d.DNAME DNAME,d.LOC LOC,SUBSTR(z.ZIPCODE,INSTR(ZIPCODE,'-')+1) ZIPCODE,
		z.SIDO SIDO,z.GUGUN GUGUN,z.DONG DONG,NVL(z.BUNJI,'��������') BUNJI,ROW_NUMBER()OVER(ORDER BY e.ENAME ASC) SEQ

		FROM DEPT d, EMP e, ZIPCODE z
		WHERE(e.DEPTNO = d.DEPTNO AND z.SEQ = e.EMPNO)
		)

WHERE SEQ BETWEEN 3 AND 6;


--���� 4.������̺���  ������� 'ADAMS' �� ������� ������ ���� �޴�
--����� �����ȣ, �����, ����,�μ���ȣ,�μ���,��ġ,�����ȣ,�õ�,����,
--�����𵨸�, ����,����,�ɼ�, �Է����� ��ȸ�ϼ���.
--��. �����ȣ�� seq�� ������ ������ ���� �������� ����Ͽ� ������ ��.
--���� �𵨸��� ������������ �����ϰ�, �������� ���ٸ� �����
--������������ �����Ͽ� 1~4��° ���ڵ常 ����մϴ�.


SELECT ROWNUM EMPNO,ENAME,SAL,DEPTNO,DNAME,LOC,ZIPCODE,SIDO,GUGUN,MODEL,CAR_YEAR,PRICE,CAR_OPTION,HIREDATE
FROM
		(SELECT e.EMPNO,e.ENAME,e.SAL,d.DEPTNO,d.DNAME,d.LOC,z.ZIPCODE,z.SIDO,z.GUGUN,
		c_mod.MODEL,c_mod.CAR_YEAR,c_mod.PRICE,c_mod.CAR_OPTION,c_mod.HIREDATE
		FROM EMP e, DEPT d , ZIPCODE z ,CAR_MODEL c_mod
		WHERE (e.DEPTNO = d.DEPTNO AND z.SEQ = e.EMPNO AND z.SEQ = c_mod.CAR_YEAR) AND SAL > (SELECT SAL FROM EMP WHERE ENAME = 'ADAMS')
		ORDER BY c_mod.MODEL DESC , c_mod.CAR_YEAR DESC)
WHERE ROWNUM BETWEEN 1 AND 4; --ROWNUM�� 1���ʹ� ��ȸ�� �����մϴ�.


SELECT EMPNO,ENAME,SAL,DEPTNO,LOC,DNAME,ZIPCODE,SIDO,GUGUN,MODEL,CAR_YEAR,PRICE,CAR_OPTION,HD,SEQ
FROM

(SELECT e1.EMPNO EMPNO,e1.ENAME ENAME,e1.SAL SAL,e1.DEPTNO DEPTNO,d.LOC LOC,d.DNAME DNAME,
z.ZIPCODE ZIPCODE,z.SIDO SIDO,z.GUGUN GUGUN,
cmd.MODEL MODEL,cmd.CAR_YEAR CAR_YEAR,cmd.PRICE PRICE, cmd.CAR_OPTION CAR_OPTION,cmd.HIREDATE HD,
ROW_NUMBER()OVER(ORDER BY cmd.MODEL DESC,cmd.HIREDATE DESC) SEQ
FROM
	(SELECT e.EMPNO EMPNO,e.ENAME ENAME,e.SAL SAL,e.DEPTNO DEPTNO
	FROM EMP e, EMP e2
	WHERE (e.SAL > e2.SAL) AND e2.ENAME = 'ADAMS') e1,
	DEPT d,
	ZIPCODE z,
	CAR_MODEL cmd
WHERE (e1.DEPTNO = d.DEPTNO AND z.SEQ = e1.EMPNO AND z.SEQ = cmd.CAR_YEAR));



--���� 5. �������̺��� �����𵨺�, ����������, �Ѱ���, ��հ���,
--�ְ���,���������� ��ȸ�ϼ���.


SELECT MODEL,CAR_YEAR,COUNT(MODEL) CNT,SUM(PRICE) PRICE_SUM,TRUNC(AVG(PRICE)) PRICE_AVG,MAX(PRICE),MIN(PRICE)
FROM CAR_MODEL
GROUP BY ROLLUP(MODEL,CAR_YEAR);



