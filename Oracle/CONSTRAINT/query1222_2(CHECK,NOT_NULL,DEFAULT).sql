--CHECK, NOT NULL, DEFAULT
--�̸�, ����, ����, �Է����� �����ϴ� ���̺��� ����
--�̸� �ʼ� �Է�
--������ ���� �Ǵ� ���� ���� �Է�
--���̴� null�� �ԷµǸ� 0�� �߰�
--�Է����� �����Ǹ� insert�ϴ� ������ ���� ���ڸ� �Է�
CREATE TABLE OTHER_CONSTRAINT(
NAME VARCHAR2(12) NOT NULL,
GENDER CHAR(6) CHECK(GENDER IN('����','����')),
AGE NUMBER(3) DEFAULT 0,
INPUT_DATE DATE DEFAULT SYSDATE
);

--�߰� ����
INSERT INTO OTHER_CONSTRAINT
(NAME,GENDER,AGE,INPUT_DATE)
VALUES
('�̿��','����',25,'1996-11-27');

INSERT INTO OTHER_CONSTRAINT
(NAME,GENDER)
VALUES
('�̿��','����');

select * from OTHER_CONSTRAINT;

--�߰� ����
INSERT INTO OTHER_CONSTRAINT
(NAME,GENDER,AGE,INPUT_DATE)
VALUES
('','����',25,'1996-11-27');

INSERT INTO OTHER_CONSTRAINT
(NAME,GENDER,AGE,INPUT_DATE)
VALUES
('�̿��','����',25,'1996-11-27');

--USER_CONSTAINTS : ���̺��� ������ ������� Ȯ�� DICTIONARY
--USER_CONS_COLUMNS : ���̺��� ������ �������column�� Ȯ���ϴ� DICTIONARY
--USER_TAB_COLS : ���̺��� �����ϴ� COLUMN��, DATATYPE, ũ��, DEFAULT ���� Ȯ���� �� �ִ� DICTIONARY

SELECT * FROM USER_TAB_COLS
WHERE TABLE_NAME ='OTHER_CONSTRAINT';

DROP TABLE OTHER_CONSTRAINT;
PURGE RECYCLEBIN;