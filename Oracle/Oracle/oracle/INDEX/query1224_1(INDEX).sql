--INDEX ��ȸ
SELECT * FROM USER_INDEXES
WHERE TABLE_NAME = 'CP_EMP4';

--REBUILD
ALTER INDEX PK_EMP REBUILD;

--INDEX ����
--CP_EMP4���̺��� �����ȣ column�� INDEX�� ����
select * from CP_EMP4;
CREATE UNIQUE INDEX IDX_CP_EMP4 ON CP_EMP4(EMPNO);

-- INDEX HINT : /*+HINT*/
SELECT /*+ EMPNO */EMPNO,ENAME,JOB
FROM CP_EMP4
WHERE EMPNO = '7902';

--INDEX ����
DROP INDEX IDX_CP_EMP4;

--�ε����� ����Ͽ� ������ ȿ���� ���� ��
--column�� INDEX�� �ο��ϰ� �˻����ǿ� "column>0"�� ����ϸ� 
--index�� ����� ���� ����