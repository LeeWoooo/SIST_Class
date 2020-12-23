--숙제 1
--아래 제시된 제약사항에 대하여 레코드를 저장할 수 있는 테이블 생성
--아이디 이름 나이 성별 주소 부서번호 이메일 입력일
--*컬럼에 설정해야 하는 제약사항.
-- 아이디는 null을 허용하지 않으며, 중복값을 저장할 수 없다.
-- 이름은 반드시 입력되어야한다.
-- 나이는 20~39살까지만 입력가능하다.
-- 성별은 'M' 또는 'F'만 입력가능해야한다.
-- 주소는 반드시 입력되어야한다.
-- 부서번호는 dept테이블에 deptno번에 해당하는 번호만 입력가능해야하며
-- dept테이블의 레코드가 삭제되면 같이 삭제 되어야한다.
-- 이메일을 없을 수도 있지만 있다면 유일해야한다.
-- 입력일은  입력되지 않는다면 추가되는 시점의 현재 날짜로입력되어야한다.

CREATE TABLE HOMEWORK_1222(
ID VARCHAR2(15),
NAME VARCHAR2(12) NOT NULL,
AGE NUMBER(2) CHECK(AGE BETWEEN 20 AND 39),
GENDER CHAR(1) CHECK(GENDER IN('M','F')),
ADDR VARCHAR2(100) NOT NULL,
DEPTNO NUMBER(2) CHECK(DEPTNO IN(10,20,30,40)),
EMAIL VARCHAR(30) UNIQUE,
INPUT_DATE DATE DEFAULT SYSDATE
);

SELECT * FROM HOMEWORK_1222;


--숙제 1. 제조국이 현대, 기아, BMW, BENZ인 모든 차량의 제조국, 제조사
--모델명, 옵션, 연식,입력일을 조회하세요.
--단, 입력일의 내림차순으로 정렬했을 때 3~5번째 레코드만 출력하고,
--옵션은 첫번째',' 까지만 출력합니다.
--입력일은 'mm-dd-yyyy' 의 형식으로 출력합니다.

SELECT COUNTRY,MAKER,MODEL,SUBSTR(CAR_OPTION,0,INSTR(CAR_OPTION,',')-1) CAR_OPTION,CAR_YEAR,TO_CHAR(HIREDATE,'mm-dd-yyyy') HIREDATE,SEQ
FROM

	(SELECT cct.COUNTRY,cct.MAKER,cmk.MODEL,cmd.CAR_OPTION,cmd.CAR_YEAR,cmd.HIREDATE,ROW_NUMBER()OVER(ORDER BY cmd.HIREDATE DESC) SEQ
	FROM CAR_COUNTRY cct, CAR_MAKER cmk, CAR_MODEL cmd
	WHERE (cmk.MAKER(+) = cct.MAKER AND cmd.MODEL(+) = cmk.MODEL) AND cct.MAKER IN('현대','기아','BMW','BENZ'))

WHERE SEQ BETWEEN 3 AND 5;



select * from CAR_COUNTRY;
select * from CAR_MAKER;
select * from CAR_MODEL;

SELECT COUNTRY,MAKER,MODEL,CAR_OPTION,CAR_YEAR,HD,SEQ

FROM
		(SELECT cct.COUNTRY COUNTRY ,cct.MAKER MAKER,cmk.MODEL MODEL,
		cmd.CAR_OPTION CAR_OPTION,cmd.CAR_YEAR CAR_YEAR,TO_CHAR(cmd.HIREDATE,'mm-dd-yyyy') HD,
		ROW_NUMBER()OVER(ORDER BY cmd.HIREDATE DESC) SEQ

		FROM CAR_COUNTRY cct
		LEFT JOIN CAR_MAKER cmk
		ON cmk.MAKER = cct.MAKER
		LEFT JOIN CAR_MODEL cmd
		ON cmd.MODEL = cmk.MODEL

		WHERE cct.MAKER IN('현대','기아','BMW','BENZ')
		)

WHERE SEQ BETWEEN 3 AND 5;


--숙제2. 차량옵션에 'ABS' 기능이 있는 차량의 제조국, 제조사,모델명,
-- 연식, 가격, 입력일, 이미지명을 조회하세요.
-- 단, 가격의 오름차순으로 정렬하되 가격이 같다면 연식의 내림차순으로
-- 정렬했을 때 2~7번째 레코드만 출력합니다.
-- 연식과 가격에는 3자리 마다 ','를 넣어 출력하고, 옵션은 'ABS' 까지만
-- 출력합니다. 이미지명은 처음부터 '.'까지만 출력합니다.
-- 옵션과 이미지명은 모두 대문자로 출력합니다.
SELECT COUNTRY,MAKER,MODEL,TO_CHAR(CAR_YEAR,'9,999') CAR_YEAR,TO_CHAR(PRICE,'9,999') PRICE,
HIREDATE,UPPER(SUBSTR(CAR_IMG,0,INSTR(CAR_IMG,'.')-1)) CAR_IMG,UPPER(SUBSTR(CAR_OPTION,0,INSTR(CAR_OPTION,'ABS')+2)) CAR_OPTION,SEQ
FROM
		(SELECT cct.COUNTRY,cct.MAKER,cmk.MODEL,cmd.CAR_YEAR,cmd.PRICE,cmd.HIREDATE,cmd.CAR_IMG,cmd.CAR_OPTION,
		ROW_NUMBER()OVER(ORDER BY cmd.PRICE ASC,cmd.CAR_YEAR DESC) SEQ
		FROM CAR_COUNTRY cct, CAR_MAKER cmk, CAR_MODEL cmd
		WHERE (cmk.MAKER = cct.MAKER AND cmd.MODEL = cmk.MODEL) AND cmd.CAR_OPTION LIKE '%ABS%')
WHERE SEQ BETWEEN 2 AND 7;



SELECT COUNTRY,MAKER,MODEL,CAR_YEAR,PRICE,HD,IMG,CAR_OPTION,SEQ

FROM

		(SELECT cct.COUNTRY COUNTRY, cct.MAKER MAKER, cmk.MODEL MODEL, TO_CHAR(cmd.CAR_YEAR,'9,999') CAR_YEAR,
		TO_CHAR(cmd.PRICE,'9,999') PRICE, cmd.HIREDATE HD,UPPER(SUBSTR(cmd.CAR_IMG,0,INSTR(cmd.CAR_IMG,'.')-1))IMG,
		UPPER(cmd.CAR_OPTION) CAR_OPTION,
		ROW_NUMBER()OVER(ORDER BY PRICE ASC, HIREDATE DESC) SEQ

		FROM  CAR_COUNTRY cct , CAR_MAKER cmk , CAR_MODEL cmd

		WHERE (cmk.MAKER = cct.MAKER AND cmd.MODEL = cmk.MODEL) AND cmd.CAR_OPTION LIKE '%ABS%'
		)

WHERE SEQ BETWEEN 2 AND 7;



--숙제3. 사원번호,사원명,연봉, 보너스, 실수령액, 입사일,부서번호,부서명, 위치,
--우편번호,시도,구군,동, 번지를 조회하세요.
--단. 사원명을 오름차순으로 정렬했을 때 3~6번째 레코드만 출력합니다.
--사원명은 첫글자만 대문자로 출력합니다.
--연봉은 전체 7자리로 맞춰 ','를 넣어 출력하되 7자리가 되지 않는 연봉은
--0을 넣어 출력하세요.
--우편번호는 '-'뒤로 부터만 출력합니다.
--번지가 없다면 '번지없음'을 출력합니다.
select * from ZIPCODE;

SELECT EMPNO,INITCAP(ENAME),TO_CHAR(SAL,'0,000,000') SAL,NVL(COMM,0) COMM,((SAL+NVL(COMM,0))*(1-0.033)) TOTAL_MONEY,
HIREDATE,DEPTNO,DNAME,LOC,SUBSTR(ZIPCODE,INSTR(ZIPCODE,'-')+1) ZIPCODE,SIDO,GUGUN,DONG,NVL(BUNJI,'번지없음') BUNJI ,SEQ
FROM
		(SELECT e.EMPNO,e.ENAME,e.SAL,e.COMM,e.HIREDATE,d.DEPTNO,d.DNAME,d.LOC,
		z.ZIPCODE,z.SIDO,z.GUGUN,z.DONG,z.BUNJI,ROW_NUMBER()OVER(ORDER BY e.ENAME) SEQ
		FROM DEPT d, EMP e, ZIPCODE z
		WHERE (e.DEPTNO = d.DEPTNO AND z.SEQ = e.EMPNO))
WHERE SEQ BETWEEN 3 AND 6;



SELECT EMPNO,ENAME,SAL,COMM,REAL_MONEY,DEPTNO,DNAME,LOC,ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ

FROM
		(SELECT e.EMPNO EMPNO,INITCAP(e.ENAME) ENAME,TO_CHAR(e.SAL,'0,000,000') SAL,
		NVL(e.COMM,0) COMM, (e.SAL+NVL(e.COMM,0))*(1-0.033) REAL_MONEY,
		e.DEPTNO DEPTNO,d.DNAME DNAME,d.LOC LOC,SUBSTR(z.ZIPCODE,INSTR(ZIPCODE,'-')+1) ZIPCODE,
		z.SIDO SIDO,z.GUGUN GUGUN,z.DONG DONG,NVL(z.BUNJI,'번지없음') BUNJI,ROW_NUMBER()OVER(ORDER BY e.ENAME ASC) SEQ

		FROM DEPT d, EMP e, ZIPCODE z
		WHERE(e.DEPTNO = d.DEPTNO AND z.SEQ = e.EMPNO)
		)

WHERE SEQ BETWEEN 3 AND 6;


--숙제 4.사원테이블에서  사원명이 'ADAMS' 인 사원보다 연봉을 많이 받는
--사원의 사원번호, 사원명, 연봉,부서번호,부서명,위치,우편번호,시도,구군,
--차량모델명, 연식,가격,옵션, 입력일을 조회하세요.
--단. 우편번호의 seq와 차량의 연식을 조인 조건으로 사용하여 조인할 것.
--차량 모델명을 내림차순으로 정렬하고, 차량모델이 같다면 년식의
--내림차순으로 정렬하여 1~4번째 레코드만 출력합니다.


SELECT ROWNUM EMPNO,ENAME,SAL,DEPTNO,DNAME,LOC,ZIPCODE,SIDO,GUGUN,MODEL,CAR_YEAR,PRICE,CAR_OPTION,HIREDATE
FROM
		(SELECT e.EMPNO,e.ENAME,e.SAL,d.DEPTNO,d.DNAME,d.LOC,z.ZIPCODE,z.SIDO,z.GUGUN,
		c_mod.MODEL,c_mod.CAR_YEAR,c_mod.PRICE,c_mod.CAR_OPTION,c_mod.HIREDATE
		FROM EMP e, DEPT d , ZIPCODE z ,CAR_MODEL c_mod
		WHERE (e.DEPTNO = d.DEPTNO AND z.SEQ = e.EMPNO AND z.SEQ = c_mod.CAR_YEAR) AND SAL > (SELECT SAL FROM EMP WHERE ENAME = 'ADAMS')
		ORDER BY c_mod.MODEL DESC , c_mod.CAR_YEAR DESC)
WHERE ROWNUM BETWEEN 1 AND 4; --ROWNUM은 1부터는 조회가 가능합니다.


SELECT EMPNO,ENAME,SAL,DEPTNO,LOC,DNAME,ZIPCODE,SIDO,GUGUN,MODEL,CAR_YEAR,PRICE,CAR_OPTION,HD,SEQ
FROM

(SELECT e1.EMPNO EMPNO,e1.ENAME ENAME,e1.SAL SAL,e1.DEPTNO DEPTNO,d.LOC LOC,d.DNAME DNAME,
z.ZIPCODE ZIPCODE,z.SIDO SIDO,z.GUGUN GUGUN,
cmd.MODEL MODEL,cmd.CAR_YEAR CAR_YEAR,cmd.PRICE PRICE, cmd.CAR_OPTION CAR_OPTION,cmd.HIREDATE HD,
ROW_NUMBER()OVER(ORDER BY cmd.MODEL DESC,cmd.HIREDATE DESC) SEQ
FROM
	(SELECT e.EMPNO EMPNO,e.ENAME ENAME,e.SAL SAL,e.DEPTNO DEPTNO
	FROM EMP e, EMP e2
	WHERE (e.SAL > e2.SAL) AND e2.ENAME = 'ADAMS') e1,
	DEPT d,
	ZIPCODE z,
	CAR_MODEL cmd
WHERE (e1.DEPTNO = d.DEPTNO AND z.SEQ = e1.EMPNO AND z.SEQ = cmd.CAR_YEAR));



--숙제 5. 차량테이블에서 차량모델별, 보유차량수, 총가격, 평균가격,
--최고가격,최저가격을 조회하세요.


SELECT MODEL,CAR_YEAR,COUNT(MODEL) CNT,SUM(PRICE) PRICE_SUM,TRUNC(AVG(PRICE)) PRICE_AVG,MAX(PRICE),MIN(PRICE)
FROM CAR_MODEL
GROUP BY ROLLUP(MODEL,CAR_YEAR);



