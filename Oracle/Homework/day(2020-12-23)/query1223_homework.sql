--����1.
--������̺��� �μ���ȣ�� 10, 30�� �μ��� �����  ������ ��ȸ�Ͽ�
--��ȸ�Ѱ����  emp_work ���̺��� �����մϴ�.

CREATE TABLE EMP_WORK AS
(SELECT * FROM EMP WHERE DEPTNO IN(10,30));

SELECT * FROM EMP_WORK;

--����2. ���̺� ����
--2-1. ������ ������ ���̺���  empno �÷����� emp_no�� �����մϴ�.
ALTER TABLE EMP_WORK RENAME COLUMN EMPNO to EMP_NO;
SELECT * FROM EMP_WORK;

--2-2. ������ ������ ���̺��� ename �÷��� �ѱ� 30�� ���� �Է°����ϵ���
--�÷��� ���̸� �����մϴ�.
ALTER TABLE EMP_WORK MODIFY ENAME VARCHAR2(90);
SELECT * FROM EMP_WORK;

--2-3. ������ ������ ���̺� ename �÷��� null�� �������� �ʵ��� �����մϴ�.
ALTER TABLE EMP_WORK MODIFY ENAME VARCHAR2(90) NOT NULL;

-- 2-4. ������ ������ ���̺�  empno�÷��� primary key ��������� �����մϴ�.
ALTER TABLE EMP_WORK ADD CONSTRAINT PK_EMP_WORK PRIMARY KEY(EMP_NO);

-- 2-5. ������ ������ ���̺� deptno �÷��� foreign key ��������� �����մϴ�.(�θ����̺��� dept)
ALTER TABLE EMP_WORK ADD CONSTRAINT FK_EMP_WORK FOREIGN KEY(DEPTNO) REFERENCES DEPT;

-- 2-6. ������ ������ 2-5�� ������ �����ϼ���.
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'EMP_WORK';
ALTER TABLE EMP_WORK DROP CONSTRAINT FK_EMP_WORK;

--2-7. ������ ������ 2-4 �� ������ ��Ȱ��ȭ �ϼ���.
ALTER TABLE EMP_WORK DISABLE CONSTRAINT PK_EMP_WORK;
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'EMP_WORK';

--3. �����ڰ������� �α��� �Ͽ�
--���̵�� ��й�ȣ�� test/test1234�� ������ �����ϰ�
--���Ӱ����ϵ��� ������ �����ϼ���.

ALTER SESSION SET "_ORACLE_SCRIPT"=true;
CREATE USER test IDENTIFIED BY test1234;
GRANT CONNECT to test;

-- 4. ���� ������ ���� �մϴ�.
DROP USER test;

--5.user_cons_columns ���̺��  user_constraints�� ����Ͽ�
-- 'EMP'���̺� ������ �÷���, �������Ÿ��(constraint_type), ������׸���
--  ��ȸ�ϼ���.

SELECT * FROM USER_CONS_COLUMNS;
SELECT * FROM USER_CONSTRAINTS;

SELECT ucc.COLUMN_NAME,uc.CONSTRAINT_TYPE,uc.CONSTRAINT_NAME
FROM USER_CONS_COLUMNS ucc, USER_CONSTRAINTS uc
WHERE (ucc.CONSTRAINT_NAME = uc.CONSTRAINT_NAME) AND uc.TABLE_NAME = 'EMP';
