DBMS ( Database Management System)
===

## Data

- Data

    - 수, 단어, 영상 등의 형태로 된 의미의 단위.

    - 연구나 조사의 바탕이 되는 재료.

    - Data를 사용할 수 있도록, 의미있게 정리하면 정보가 된다.(Database)

---

## DataBase

- DataBase

    - 여러 사람이 공유하고 사용할 목적으로 관리되는 정보의 모임.

    - `자료의 중복을 없애고` 구조화하여 처리를 효율적으로 하기 위해서 관련성을 가지며 기억시켜 놓은 데이터의 집합이다.

    - `정의`

        - 통합된 데이터 : 자료의 중복을 배제한 Data의 모임

        - 공용 데이터 : 여러 응용 시스템들이 공동으로 소유하고 유지하는 자료.

        - 운영 데이터 : 조직의 운영에 기본적으로 반드시 필요한 Data를 저장

        - 저장 데이터 : 컴퓨터가 접근 가능한 저장 매체에 저장.

    - `특징`

        - 실시간 접근성 : 질의(Query)에 대한 실시간 처리와 응답.

        - 계속적인 변화 : 갱신, 삽입, 삭제 등의 동적인 특징

        - 동시 공용 : 여러 사용자가 동시에 사용한다.

        - 내용에 의한 참조 : 위치나 주소가 아닌 값에 따라 참조한다.

        
---

## DBMS

- `사용자와 데이터베이스 사이에서 사용자의 요구에 따라 정보를 생성해주고, 데이터베이스를 관리해주는 소프트웨어.`

- DBMS는 기존의 파일 시스템이 갖는 데이터의 종속성과 중복성의 문제를 해결하기 위해 제안된 시스템으로 모든 응용 프로그램들이 데이터베이스를 공용할 수 있도록 관리해 준다.

- 관계형 데이터 베이스는 가장 대표적인 데이터베이스 시스템이다. 2차원 구조의 모델의 기반으로 하여 질의어를 사용해서 데이터에 접근하는 방법입니다 (SQL을 이용한다, DBMS마다 SQL은 다를 수 있다.)

    - RDBMS : Table을 생성하여 관계를 설정하고 데이터를 저장 조작하는 DBMS라고 한다.

- 과거의 Data를 가지고 미래를 예측하기 위해 사용한다. (정보를 관리할 때 사용한다.)

- `DBMS의 필수기능`

    - 정의

        - 모든 응용 프로그램들이 요구하는 데이터 구조를 지원하기 위해 데이터베이스에 저장될 데이터의 형(Type)과 구조에 대한 정의, 이용 방식, 제약 조건 등을 명시하는 기능이다.

        - 데이터와 데이터의 관계를 명확하게 명세할 수 있어야 하며 원하는 데이터 연산은 무엇이든 명세할 수 있어야 한다.

    - 조작

        - 데이터 검색 갱신 삽입 삭제 등을 체계적으로 처리하기 위해 사용자와 데이터베이스 사이의 인터페이스 수단을 제공하는 기능이다.

    - 제어

        - 데이터베이스를 접근하는 갱신 삽입 삭제 작업이 정확하게 수행되어 데이터의 무결성이 유지되도록 해야한다.

        - 정당한 사용자가 허가된 데이터만 접근할 수 있도록 보안을 유지하고 권한을 검사할 수 있어야한다.

- DDL, DCL, DML

    * DDL(Data Definition Language)

        * 데이터베이스 스키마를 정의하는데 사용한다. 데이터 정의어로 문장이 입력되면 DBMS는 사용자가 정의한 스키마에 대한 명세를 시스템 카탈로그에 저장한다.

        * 객체(table, index, sequence, view)를 생성하거나 삭제, 조작할 때 사용하는 SQL문

        * CREATE, ALTER, DROP, TRUNCATE

    * DCL (Data Control Language)

        * 데이터를 제어할 때 사용하는 SQL문

        * COMMIT, ROLLBACK, GRANT, REVOKE 

    * DML (Data Manipulation Language)

        * 데이터베이스 내의 원하는 데이터를 검색하고 수정하고 삽입하고 삭제하는데 사용함.

        * 테이블을 조작할 때 사용하는 SQL문

        * INSERT INTO, UPDATE SET, DELETE FROM, SELECT FROM WHERE

---

## ORACLE

* 간단한 오라클의 구조

    <img src = https://user-images.githubusercontent.com/74294325/102060341-67c3b500-3e35-11eb-840a-eb8d6f2ace35.png>

    * File 영역 - 영속성이 있으며 file이 실제 저장되는 공간이다.

    * Server Instance - file영역을 사용하여 사용자에게 입력된 SQL문을 사용하여 접속자 세션을 관리(Memory)

    * Client Process - 사용자가 DBMS가 DB SERVER에 접근하여 DBMS를 사용.

    * SERVER Process - 접속자를 받고 접속자를 관리하여 Server Instance에 연결하여 사용자를 인증한다.

    * 사용자가 접속하면 Sever Process가 받아서 Server Instance의 공유 풀에서 인증을 하고 File영역에 .DBF에서 사용자의 정보를 비교한 후 인증이 되면 Server Instance에 접속자 세션에서 memory가 할당된다. 그 후 Client Process에서 할당된 memory를 사용한다.

    * 한번 실행한 SQL문은 Memory에 올라가 있어서 추후 사용할 때는 HDD가 아닌 Memory에서 가져온다.


---

## EDIT

* SQLplus에서 제공하는 편집기이다.

* 사용하는 sql문을 저장하기위해 주로 사용되며 지정된 경로에 파일을 생성한다.

* 사용예제

    * EDIT로 SQL작성

        <img src = https://user-images.githubusercontent.com/74294325/102155332-b5d0cb00-3ebe-11eb-8698-7249a32ab08a.png>


    * 결과

        <img src = https://user-images.githubusercontent.com/74294325/102155378-ce40e580-3ebe-11eb-87c2-6abc03007653.png>

---


## 주석 (Comment)

* 한 줄 주석은 -- (--뒤에만 주석이 되는 것이 아니라 --앞 내용도 주석이 된다.) 

    * 되도록 한 줄 주석은 주석으로 표시되어야 할 내용만 그 줄에 표기한다.

* 여러줄 주석은 /* 주석내용 */

    ```
    -- 한줄 주석의 내용.
    한줄 주석 내용 --

    /*
    여러줄 주석
    */
    ```
---

* 수업진행 순서.

    * DB조작,Table 생성, DATAType, insert, select, update, delete, commit, rollback, savepoint, `truncate`, drop, show, purge, flashback, `select`, function, subquery, union, constraint, alter, `join`, sequence, index, grant, revoke, view, synonym 