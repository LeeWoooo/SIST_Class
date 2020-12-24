--column����

CREATE TABLE UNIQUE_COLUMN(
NAME VARCHAR2(30),
AGE NUMBER(3),
EMAIL VARCHAR2(50) CONSTRAINT UK_EMAIL UNIQUE,
ADDR VARCHAR2(100)
);

SELECT * FROM USER_CONSTRAINTS;

DROP TABLE UNIQUE_COLUMN;

PURGE RECYCLEBIN;

--table����

CREATE TABLE UNIQUE_TABLE(
NAME VARCHAR2(15),
PHONE VARCHAR2(14),
CONSTRAINT UK_PHONE UNIQUE(PHONE)
);

SELECT * FROM USER_CONSTRAINTS;


--����
--���� �����Ͱ� �ԷµǴ� ���
INSERT INTO UNIQUE_COLUMN(NAME, AGE, EMAIL, ADDR)
VALUES
('�̿��',25,'lee@test.com','����� ������');

select * from UNIQUE_COLUMN;

--unique �� ������ column�� ���� �ٸ���
INSERT INTO UNIQUE_COLUMN(NAME, AGE, EMAIL, ADDR)
VALUES
('�̿��',25,'lee2@test.com','����� ������');


--null�� �ԷµǴ� ���
INSERT INTO UNIQUE_COLUMN(NAME, AGE, EMAIL, ADDR)
VALUES
('�̿��',25,'','����� ������');

select * from UNIQUE_COLUMN;


--����
--���� �ߺ� �Ǿ �ԷµǾ��� ���
INSERT INTO UNIQUE_COLUMN(NAME, AGE, EMAIL, ADDR)
VALUES
('�̿��',25,'lee2@test.com','����� ������');
