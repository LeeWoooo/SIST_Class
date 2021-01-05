--��� ��ȣ�� �Է¹޾� �ش� ����� ����
--1. ���ν��� �ۼ�
CREATE OR REPLACE PROCEDURE DELETE_PROC(IN_EMPNO NUMBER, CNT OUT NUMBER, MSG OUT VARCHAR2)
IS

BEGIN

	DELETE FROM TEST_PROC
	WHERE EMPNO = IN_EMPNO;

	-- ���� �������� ������ ���� ���� �Ͻ��� Ŀ��(SQL)�� �Ӽ�(ROWCOUNT)�� ����Ͽ� ���� �� �ִ�.
	CNT :=SQL%ROWCOUNT; --�Ͻ��� Ŀ�� + ������ ���� ��

	IF CNT != 0 THEN
		MSG := IN_EMPNO||'�� ����� ������ �����Ǿ����ϴ�.';
	ELSE
	  MSG := IN_EMPNO||'�� ����� �������� �ʽ��ϴ�.';
		COMMIT;
	END IF;

	EXCEPTION
	WHEN OTHERS THEN
		MSG := SQLCODE||'QUERY ���� �� ������ �߻��߽��ϴ�.';
END;
/

----2. ���� : proc_delete.sql
--
----3. ������
--SELECT * FROM USER_PROCEDURES;
--
----4. ���ε� ���� ����
--VAR CNT NUMBER;
--VAR MSG VARCHAR2(200);
--
--VAR;
----5. ����
--EXECUTE DELETE_PROC(1 , :CNT, :MSG);
--
----6. ���ε� ���� �� ���
--PRINT CNT;
--PRINT MSG;
