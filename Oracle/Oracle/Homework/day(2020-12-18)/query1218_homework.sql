--���� 1
--�Ʒ��� �����͸� �߰��� �� �ִ� ���̺��� ����� �����͸� �߰�
--column��,��������,ũ��� �Է°��� �����Ͽ� ����

CREATE TABLE HOMEWORK(
NAME CHAR(9),
AGE NUMBER(2),
GENDER NUMBER (1),
BLOODTYPE CHAR(1),
EMAIL VARCHAR(40));

INSERT INTO HOMEWORK
(NAME,AGE,GENDER,BLOODTYPE,EMAIL)
VALUES
('������', 22,2,'A','kim@test.com');

commit;

INSERT INTO HOMEWORK
(NAME,AGE,GENDER,BLOODTYPE,EMAIL)
VALUES
('������',23,1,'B','hyunkyu@test.com');

commit;

INSERT INTO HOMEWORK
(NAME,AGE,GENDER,BLOODTYPE,EMAIL)
VALUES
('������',27,2,'A','nam@eun.co.kr');

commit;

INSERT INTO HOMEWORK
(NAME,AGE,GENDER,BLOODTYPE,EMAIL)
VALUES
('������',24,2,'B','moon@sist.co.kr');

commit;

INSERT INTO HOMEWORK
(NAME,AGE,GENDER,BLOODTYPE,EMAIL)
VALUES
('�κ���',25,1,'A','kwon@daum.net');

commit;

INSERT INTO HOMEWORK
(NAME,AGE,GENDER,BLOODTYPE,EMAIL)
VALUES
('�ڱ���',25,1,'A','park_ki@eun.co.kr');

commit;

select * from HOMEWORK;

--���� 2
--���� ���̺��� ����Ͽ� �̸�,����,����,�¾ �ظ� ��ȸ
--����1�� ����, 2�� ���ڷ� ��ȸ
--�¾�ش� ����-����+1�ο���.
SELECT NAME, AGE,
DECODE(GENDER,1,'����',2,'����') GENDER,
(TO_CHAR(SYSDATE,'yyyy')-AGE+1) BORNYEAR
FROM HOMEWORK;


--���� 3
--���� ���̺��� ����ؼ� �̸�,�����ּ�,������ �ּҸ� ��ȸ
SELECT NAME,
SUBSTR(EMAIL,1,INSTR(EMAIL,'@')-1) EMAIL,
SUBSTR(EMAIL,INSTR(EMAIL,'@')+1) DOMAIN
FROM HOMEWORK;

--���� 4
--�������� �̸� ���� ���̼����� ��ȸ�ϼ���.
--������ ������ �ߺ����� �ʽ��ϴ�.
SELECT BLOODTYPE,NAME,AGE,
ROW_NUMBER()OVER(PARTITION BY BLOODTYPE ORDER BY AGE DESC) AGERANK
FROM HOMEWORK;


--���� 5
--�������� �ο���,�������� ��ճ��� �ְ��̸� ��ȸ
--�� �������� �Ұ谡 ������ ����� ��µǵ��� ����
SELECT BLOODTYPE,NAME,COUNT(NAME),TRUNC(AVG(AGE)) "AVG(AGE)",MAX(AGE)
FROM HOMEWORK
GROUP BY ROLLUP(BLOODTYPE,NAME);
