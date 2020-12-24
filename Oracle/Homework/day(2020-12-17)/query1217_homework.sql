--���� 1
-- ��� ���̺��� ��� ����� �����ȣ,�����,�Ի���,����,������ ��ȸ
-- �� ������ ������ 12�� ���� ������ �Ҽ��� ù��° �ڸ����� �ݿø�
SELECT EMPNO, ENAME, HIREDATE, SAL, ROUND(SAL/12,0)
FROM EMP;

-- ���� 2
-- ��� ���̺��� �Ի���� 12���� ������� �����ȣ, �����, �Ի���,����, �Ǽ��ɾ��� ��ȸ
--�� �Ǽ��ɾ��� ������ ���ʽ��� �ջ��� �ݾ����� ����
-- ������ �� ���ɾ׿��� 3.3%�� ������ �ݾ����� �����Ͽ� ������ �����Ͽ� ���
SELECT EMPNO, ENAME, HIREDATE, SAL, TRUNC(((SAL*(1-0.033))+NVL(COMM,0)),0) Real_Money
FROM EMP
WHERE TO_CHAR(HIREDATE,'mm')=12;

-- ���� 3
--������̺��� 10�� �μ��� 30�� �μ��� �ٹ��ϸ鼭 �Ŵ����� �ִ� �����
--�����ȣ, �Ŵ�����ȣ, �Ի���,����,�����,������ ��ȸ
-- �� �Ի����� "��-��-��-�б�-����"�� �������� ����ϵ� �⵵�� 2�ڸ��� ���
--������� ��� �ҹ��ڷ� ��� ������ ���ڸ��� �빮�ڷ� ���
SELECT EMPNO, MGR, TO_CHAR(HIREDATE,'yy-mm-dd-q"�б�"-day'), SAL, LOWER(ENAME) ENAME, INITCAP(JOB) JOB
FROM EMP
WHERE (DEPTNO IN (10,30)) AND (MGR IS NOT NULL);

-- ���� 4
-- �Ʒ��� ���� �Է��� �� �ִ� ���̺��� �����ϰ� �����͸� �߰��ϼ���.
CREATE TABLE STUDENT_HOMEWORK(
NUM NUMBER(5),
NAME CHAR(9),
SCNUMBER CHAR(14)
);

INSERT INTO STUDENT_HOMEWORK
(NUM, NAME, SCNUMBER)
VALUES
(12345,'������','880101-1234567');

INSERT INTO STUDENT_HOMEWORK
(NUM, NAME, SCNUMBER)
VALUES
(4326,'������','980101-2234567');

INSERT INTO STUDENT_HOMEWORK
(NUM, NAME, SCNUMBER)
VALUES
(51,'�κ���','991217-1234567');

INSERT INTO STUDENT_HOMEWORK
(NUM, NAME, SCNUMBER)
VALUES
(98762,'��츮','991212-1234567');

INSERT INTO STUDENT_HOMEWORK
(NUM, NAME, SCNUMBER)
VALUES
(961,'������','001212-4234567');

select * from STUDENT_HOMEWORK;

-- ���� 5
-- 4������ ������ ���̺��� ����Ͽ� ��ȣ,�̸�,�ֹι�ȣ - ���ڸ���, ������ ��ȸ�ϼ���
SELECT CONCAT('I_',LPAD(NUM,8,0)), NAME, SUBSTR(SCNUMBER,1,INSTR(SCNUMBER,'-')-1) SCNUMBER,
DECODE(SUBSTR(SCNUMBER,INSTR(SCNUMBER,'-')+1,1),'1','��','2','��','4','��') GENDER
FROM STUDENT_HOMEWORK;

-- ���� 6
-- 4������ ������ ���̺��� �̸��� ��츮�� �����
-- �ֹι�ȣ�� 991212-2234567�� ����
UPDATE STUDENT_HOMEWORK
SET SCNUMBER = '991212-2234567'
WHERE NAME = '��츮';

COMMIT;

select * from STUDENT_HOMEWORK;
