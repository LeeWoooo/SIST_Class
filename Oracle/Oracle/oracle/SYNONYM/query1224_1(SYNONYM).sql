--�ý��� ������ ����
--������ �������� ����
SELECT * FROM DBA_ROLE_PRIVS
WHERE GRANTEE='SCOTT';

--������ ���� ����
SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE='SCOTT';
--�ó�Ի���
--CP_EMP4 ���̺��� SYNONYM�� CD4�� ����
CREATE SYNONYM CD4 FOR CP_EMP4;

--���� ����
GRANT CREATE SYNONYM TO scott;

SELECT * FROM CD4;
