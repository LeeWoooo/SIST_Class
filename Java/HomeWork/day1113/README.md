Work(2020.11.13)
===
Work내용
-

## 1.문자열을 입력받고, String[]을 반환하는 method를 만들어라

- 아래와같은 Data를 argument로 입력한다.(반드시 아래와 같을 것.)
- "봉천, 신림,신대방,대림.신도림, 문래,영등포구청, 당산,합정, 홍대 입구"

## 2.실행내용

### 2-1 신대방역 ,뒤에 "구로디지털 단지" 역을 추가 한다. 
- 추가된 후 데이터형태 ("봉천, 신림,신대방,구로디지털 단지,대림.신도림, 문래,영등포구청, 당산,합정, 홍대 입구")

## 2-2 데이터 사이에 존재하는 공백을 제거한다.
- 공백제거후 데이터 형태 ("봉천,신림,신대방,구로디지털단지,대림.신도림,문래,영등포구청,당산,합정,홍대입구")

### 2-3 입력데이터를 거꾸로 배열에 넣어 반환한다.
- 배열에 들어있는 형태 ("홍대입구,합정,당산,영등포구청,문래,신도림,대림,구로디지털단지,신대방,신림,봉천")

## 3.출력

* 배열을 입력받아 아래와 같이 출력한다. 
* 출력양식
    >역명<br>
    ====<br>
    홍대입구<br>
    .<br>
    .<br>
    봉천<br>
    =======

#### 과제 완료 [code](https://github.com/LeeWoooo/SIST_Class/blob/master/Java/HomeWork/day1113/Work1113.java)

### 2020.11.16 code 수정

* 기존 코드

    ```java
    //2. 신대방역 뒤에 "구로디지털 단지"를 추가 하기 위해 삽입할 위치의 index를 구한다.
		@SuppressWarnings("unused")
		int index = station.indexOf("방");
		System.out.println(index);
		
		//3. "구로디지털 단지"의 공백을 제거후 정거장 문자열에 삽입한다.
		sb.insert(10, "구로디지털 단지,".replace(" ", ""));
		System.out.println(sb);
    ```



* 수정 코드
    ```java
    //2. 신대방역 뒤에 "구로디지털 단지"를 추가 하기 위해 삽입할 위치의 index를 구한다.
		int index = (station.indexOf("신대방"))+3;
		//수정(11.16) index를 찾을때 "방"으로 찾았었는데 신대방 역이 나오기전 방이 들어간 역 이름이 나오면
		//원하고자 하는 출력형식을 얻을 수 없기에 더 명확히 지정
		System.out.println(index);
		
		//3. "구로디지털 단지"의 공백을 제거후 정거장 문자열에 삽입한다.
		sb.insert(index, "구로디지털 단지,".replace(" ", "")); 
		//수정 (11.16)구한 index를 값으로 지정하는 것이 아닌 변수로 지정하여 동적인 코드로 변경.
		System.out.println(sb);
        ```
        