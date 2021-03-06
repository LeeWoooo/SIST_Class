--입사년을 받아 해당 년도에 입사한 사원의 부서번호,부서명,위치.사원번호.사원명,입사일조회

CREATE OR REPLACE PROCEDURE SELECT_PROC(IN_HIREDATE VARCHAR2,
CUR_EMP OUT SYS_REFCURSOR, ERRM OUT VARCHAR2)
IS

BEGIN

	ERRM := '문제없음';

	OPEN CUR_EMP FOR

		SELECT D.DEPTNO, D.DNAME, D.LOC, E.EMPNO, E.ENAME, TO_CHAR(E.HIREDATE,'yyyy-mm') HIREDATE
		FROM DEPT D, EMP E
		WHERE (E.DEPTNO = D.DEPTNO) AND TO_CHAR(HIREDATE,'yyyy') = IN_HIREDATE;


	EXCEPTION
	WHEN OTHERS THEN
		ERRM := SQLERRM||'문제가 발생하였습니다';
END;
/

----바인드 변수 선언
--VAR CUR REFCURSOR;
--VAR MSG VARCHAR2(300);
--VAR;
--
----실행
--EXECUTE SELECT_PROC('1987',:CUR, :MSG);
--
--
----출력
--
--PRINT CUR;
