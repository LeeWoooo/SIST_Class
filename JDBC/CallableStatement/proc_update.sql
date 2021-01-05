--1. ���ν��� �ڵ�  �����ȣ ����� ������ �Է¹޾� �ش����� ����� ������ ����
-- * update, delete, select ����ϴ� column��� in parameter���� �ٸ��� �����ؾ� �Ѵ�.
CREATE OR REPLACE PROCEDURE UPDATE_PROC(IN_EMPNO NUMBER, IN_ENAME VARCHAR2, IN_SAL NUMBER, CNT OUT NUMBER, MSG OUT VARCHAR2)
IS

BEGIN

	UPDATE TEST_PROC
	SET ENAME = IN_ENAME, SAL=IN_SAL
	WHERE EMPNO = IN_EMPNO;

	CNT := SQL%ROWCOUNT;

	if CNT != 0 THEN
		MSG := IN_EMPNO||'�� ��������� ����Ǿ����ϴ�.';
		COMMIT;
	ELSE
		MSG := IN_EMPNO||'�� ����� �������� �ʽ��ϴ�.';
	END IF;

	EXCEPTION
	WHEN OTHERS THEN
		MSG := SQLERRM||'������ �߻��߽��ϴ�.';

END;
/

--2. ���� proc_update.sql
--
--3. ������ sql>@���ϸ�.sql (show error ������ ���� Ȯ��)
--SELECT * FROM USER_PROCEDURES;
--
--4. ���ε� ����
--VAR CNT NUMBER;
--VAR MSG VARCHAR2(300);
--
--VAR;
--5. ���� (��������)
--EXECUTE UPDATE_PROC(1,'���',3100, :CNT, :MSG);
--
--6. ���ε� ������ �� ���
--SELECT * FROM TEST_PROC;
--
--PRINT CNT;
--PRINT MSG;
