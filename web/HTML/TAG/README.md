# Tag의 이해 와 사용


## Tag의 구조

<br />

<img src = https://user-images.githubusercontent.com/74294325/103719541-908e3300-500c-11eb-93c0-6f0c5674006b.PNG>


## TAG의 문법
```html
<Tag명 속성명1="속성값1" 속성명2="속성값2"> Contents </Tag명>
<!--EX-->
<a href="www.google.com">구글</a>
```
* 예제 code를 보면 a = Tag , href = 속성명 , "www.google.com" = 속성 값, 구글 = Contents

* 속성 값은 **" "를 사용하여 묶어서 사용한다, 속성은 Tag의 부가적인 정보가 들어온다.**

* 열리는 Tag가 있다면 닫히는 Tag가 있어야 한다.(Contents 앞이 열리는 tag 뒤가 닫히는 Tag)

    * 닫히는 Tag가 필요없는 Tag도 있다. 이런경우 <Tag명 /> 형식을 갇는다. (Contents가 없는 경우 동일)
    ```html
    <br /> <!--줄바꿈 Tag-->
    <input type="button"value="버튼" /> <!--버튼을 만들어 주는 Tag-->
    ```

* HTML은 대,소문자 구분이 없으며 **Compile을 과정이 없기 때문에 ERROR가 발생하지 않는다.**

    * 정의되지 않은 Tag를 사용하면 내용만 보여진다.

    * 닫는 Tag를 정의하지 않으면 시작tag부터 마지막까지 전부 적용된다.

<br />

---

<br />

## 줄 바꿈 &lt;br/&gt;

* &lt;br/&gt;은 텍스트 내의 줄바꿈(line-break)을 정의할 때 사용한다.

* HTML 소스 코드 내에서는 엔터(Enter)를 사용하여 줄바꿈을 실시하여도 브라우저 화면에 실제로 적용되지는 않는다. 그렇기에 따로 &lt;br/&gt;을 명시해야 한다.

* br 요소는 빈 태그(empty)로, 종료 태그가 존재하지 않습니다.
```html
Hello world <br />
Hi:)
```

<br />

---

<br />

## 문단 &lt;p&gt;

* 문단은 글에서 하나로 묵을수 있는 짧은 단위이며 p Tag를 이용한다.

* 브라우저는 자동으로 p tag 요소의 위쪽과 아래쪽에 약간의 여백을 추가한다.(줄바꿈이 일어난다.)
```html
<p>
    문단안에 들어갈 내용들
</p>
```

* 문단 서식 미리 정하기 &lt;pre&gt;

    * 띄어쓰기나 줄바꿈이 별도의 태그 없이 그대로 표현된다.

    ```html
    <pre>
        띄어쓰기 태그 없이       띄어쓰기  가능
        줄바꿈 태그 없이 줄바꿈 가능
    </pre>
    ```

<br/>

---

<br/>

## 서식

* HTML의 text의 특정부분에 다양한 효과를 주는 여러 태그

* 여러개의 Tag를 중첩하여 사용이 가능하다.

1. 강조 효과

    * HTML문서에서 text를 굵게 표현 할 때 사용.( &lt;b&gt;, &lt;string&gt;)
    ```html
    <b>단순히 글씨가 굵은 부분을 표현 할 때는 b Tag</b>
    <strong>중요한 부분이라는 것을 강조 할 때는 strong를 사용</strong>
    ```

2. 이탤릭 체

    ```html
    <i>글씨를 이텔릭 체로 변환 할 때는 i Tag <i> 
    <em>중요한 부분을 이텔릭체로 표현할 때 em Tag</em>
    ```

3. 하이라이팅 효과 (html5)

    * 지정한 text에 하이라이팅을 한다.

    ```html
    <mark>text에서 지정한 부분을 하이라이팅 할 때는 mark Tag</mark>
    ```

4. 삭제 효과

    * text 중앙에 가로줄을 만들어 텍스트를 지운것 같은 효과
    
    ```html
    <del> 지운것 처럼 표현 할 때는 del Tag</del>
    ```

5. 삽입 효과

    * text밑에 가로줄을 만들어 빈칸에 text를 삽입한 효과를 얻을 수 있다.

    ```html
    <ins> text에 밑줄을 만드는 ins Tag </ins>
    ```

6. 글자를 크게 하는 효과 , 글자를 작게 하는 효과 

    * &lt;big&gt;는 HTML5에서 지원하지 않는다.

    ```html
    <big>글자를 크게 할 부분</big>
    <small>글자를 작게할 부분</small>
    ```

7. 윗첨자, 아랫첨자

    ```html
    <sup>윗첨자내용</sup>
    <sub>아랫첨자내용</sub>
    ```


<br>

---

<br>

## 글 제목 Tag (heading)

* 태그를 사용하면 줄이 변경된다.

* 태그는 &lt;h1&gt;부터 &lt;h6&gt;까지 제공된다. (숫자가 작아질 수록 글자는 작아진다.)

* 주로 목차를 만들 때 사용한다.

    ```html
    <h1>안녕하세요:)</h1>
	<h2>안녕하세요:)</h2>
	<h3>안녕하세요:)</h3>
	<h4>안녕하세요:)</h4>
	<h5>안녕하세요:)</h5>
	<h6>안녕하세요:)</h6>
    ```

<br>

---

<br>

## 글꼴 Tag 

* 속성이 있는 Tag이다. (값을 사용자가 입력하여 다양한 형태의 Tag를 사용할 수 있다.)

* HTML5에서 지원하지 않으며 대부분 글자의 속성들은 CSS를 이용하여 정의한다.

* 사용법

    ```html
    <font size="크기" face="글꼴" color="색"> contents </font>
    ```

    * 크기 : 1~10 지정
    * 글꼴 : 모든 글꼴
    * 색 : RGB 지원 (16진수를 사용하여 색을 표현 -> #000000~#FFFFFF , 영어 단어를 이용하여 색을 표현)

<br>

---

<br>


## 수평 가로 구분선

* 단락을 나누거나 내용상의 구분이 필요할 때, 분위기 전환용으로 사용한다.

* 가로선이 삽입 되면서 줄이 변경된다.

* Browser마다 다르게 보여진다. **주로 사용자에게 보여주지 않고 소스를 구분하는 의미적인 형태로 사용**

* 문법
    
    ```html
    <hr width="넓이" size="두께" color="색">
    ```

    * 넓이 

        * %n : 가변길이(Browser의 크기에 따라 변경된다.)
        * 숫자값px : 고정길이(Browser 크기에 따라 변경되지 않는다.)

<br/>

---

<br/>

## 목록 Tag

* 연관되어 있는 항목들을 나열할 때 사용한다.

* **CSS와 함께 사용해서 메뉴로도 사용된다.**

* **중첩해서 사용이 가능하다.**

* &lt;li&gt;를 사용하면 줄이 변경된다.

### ul(unoreder list) 문법

* 순서가 없는 Data를 보여줄 때 사용한다.

* 문법
    ```html
    <ul type="속성값">
        <li>contents1</li>
        <li>contents2</li>
        <li>contents3</li>
    </ul>
    ```
    * disc , circle, square


### ol(order list)

* 순서가 있는 Data를 번호,기호를 붙여 보여줄 때 사용

* 문법 

    ```html
    <ol type="속성값" start="시작값" reverse>
        <li>contents1</li>
        <li>contents2</li>
        <li>contents3</li>
    </ol>
    ```   

    * type의 속성값으로 숫자(1),대문자(A),소문자(a),로마자(i, I)
    * start의 속성값으로 시작할 순번을 지정할 수 있다.
    * reversed : 항목을 역순으로 표시한다.

### dl(설명 목록)

* 대상에 대해 들여쓰기로 설명을 제공할 때.

* 문법

    ```html
    <dl>
        <dt>제목</dt>
        <dd>설명</dd>
    </dl>
    ```
    
    * 설명 부분은 들여쓰기가 되어서 표현이 된다.


<br>

---

<br>

## 경로

* 경로란 문서에서 다른 문서로 link하거나 문서 내에 그림 또는 각종 파일을 넣을 때 사용한다.

* 상대경로 
    * 루트 디렉토리를 포함하지 않는 주소를 의미하며 **현재참조하고 있는 문서가 항상 기준이다.**
    * 서버 주소가 달라지더라도 이전서버에서의 디렉토리 구조만 같다면 경로를 수정하지 않아도 된다.

* 절대경로 
    * 루트 디렉토리를 포함한 주소를 갖는 경로
    * 컴퓨터 상의 디렉토리에는 c:\를 항상 포함하여야 하며 URL일 경우 http://로 시작된다.
    * 일반적으로 다른 사람이 만들어놓은 문서나 파일을 연결할 때 사용한다.
    * 서버 주소가 달라진다면 절대 경로로 설정된 모든 주소들은 수정해야 한다.

* 절대경로는 DNS 조회를 통해 파일을 찾기 때문에 상대경로에 비해 파일의 로딩속도가 느리다.

| 구분 | 기호 | 설명 |
| :---: | :---: | :---: |
| 상대경로 | ../ | 부모 디렉토리 |
| 상대경로 | ./ | 현재 디렉토리
| 상대경로 | 없음 | 현재 디렉토리 기호는 생략 할 수 있다.
| 절대경로 | / | 루트 디렉토리(최상위 디렉토리)
| 절대경로 | URL | URL을 사용

### 절대 경로, 상대 경로 사용

* 절대경로는 외부의 파일을 불러 올 때 사용.

* 상대경로는 내부의 파일을 불러 올 때 사용.

<br>

---

<br>

## 이미지 Tag

* img Tag를 이용하여 image를 삽입한다.

* 문법
    ```html
    <img src="이미지가 위치하는 경로" title="풍선도움말" alt="대체텍스트" width="폭" height="높이" longdec="링크"/>
    ```
    * src : source의 약자로 이미지가 위치하는 경로를 기술 (절대경로,상대경로,URL이 사용이 가능하다.) -> 주로 URL을 사용
    * title : 롤오버(마우스를 올렸을 때)를 했을 때 툴팁으로 사용
    * alt : 이미지가 로딩되기 전이나, 이미지가 로딩할 수 없는 경우 이미지의 위치에 텍스트를 표시한다.<br>
    * width, height : 이미지 크기 (이미지가 로딩되기 전까지는 browser는 이미지의 크기를 알 수 없기에 지정해서 사용)
    * longdesc : 이미지와 관련된 링크 (이미지에 대한 자세한 설명)

* **a tag로 감싸면 image를 클릭했을 경우 지정한 URL로 이동하게 할 수 있다.**

* 경로의 사용

    * 상대경로
        * 장점 : 경로를 짧게 기술할 수 있다.
        * 단점 : HTML의 파일의 위치가 변경된다면 모든 경로를 그 위치에 맞게 변경해야 한다.

    * URL

        * 장점 : HTML파일의 위치가 변경되더라도 경로 수정을 할 필요가 없다.
        * 단점 : 경로를 길게 기술한다.

<br>

---

<br>

## 링크

* HTML문서에서 다른 HTML문서로 이동할 수 있는 수단을 의미한다.

* 문법
    ```html
    <a href="URL" title="설명" target="문서가 로드될 프레임">링크이름</a>
    ```
    * href : 링크이름과 연결되어 있는 리소스(resource)의 주소(절대경로,상대경로,URL이 사용이 가능하다.) -> 주로 URL을 사용
    * title : 연결되어 있는 리소스에 대한 설명, 롤오버(마우스를 올렸을 때)를 했을 때 툴팁으로 사용
    * target : 문서가 로드될 대상으로 아래와 같은 것들이 있다.

        * _self: 현재의 문서가 로드된 프래임, 현재문서가 사라짐
        * _blank: 새로운 창(탭)을 띄우고 거기서 문서를 로드
        * _parent: 현재 문서가 frame나 iframe에 로드된 경우 현재 문서를 로드한 프래임에 문서롤 로드
        * 프레임 이름

    * 크롤러(검색엔진과 같은 시스템)에서 중요하게 해석하는 것이 링크인데 속성값을 잘 정의해 두면 사용자에게 정보를 제공하기 유리하다.

* 어떤 URL로 이동하고 URL의 특정 부분으로 이동할 때 북마크 기능을 이용한다.
    ```html
    <a href="URL#북마크 할 tag의 이름" title="설명" target="문서가 로드될 프레임">링크이름</a>
    ```

    * 자기 자신의 HTML중 특정 지역으로도 이동이 가능하다. (Name or id 속성값을 이용하여)

* 경로의 사용

    * 상대경로 : 웹 서버내의 페이지로만 이동이 가능하다.
    * URL : 다른 웹서버에 존재하는 페이지로도 이동이 가능하다.

* 메일보내기

    ```html
    <a href="mailto:받을사람의 메일주소">클릭할 이름</a>
    ```

* 전화걸기

    ```html
    <a href="tel:전화를 걸 번호">클릭할 이름</a>


<br>

---

<br>

## 프레임

* 하나의 문서에 또다른 문서를 로드할 수 있는 기법

    * 프레임 : 웹 브라우저 전체를 나눠서 페이지를 보여줄 때 사용.(페이지의 전체 디자인을 설정) -> 사용하지 않고 div를 이용한다.

    * 아이프레임 : 문서 한가운데에 자신이 원하는 공간에 특정 문서를 넣는것을 이야기한다.

        * iframe은 기본적으로 다른 도메인의 url를 호출할 수 있다. 막혀 있다면 iframe에서 호출하는 url이 서버쪽에서 referer를 체크해서 거부하고 있을 것이다.
        
        * referer를 체크하는 부분에서 처리해서 사용


<br>

## 아이프레임(iframe)

* 문서 한가운데에 자신이 원하는 공간에 특정 문서를 넣는것.

* 문법
    ```html
    <iframe name="frame의 이름" src="URL" scrolling="스크롤바의허용여부">
    iframe을 지원하지 않는 URL일 경우 대체 정보를 제공
    </iframe>
    ```
    * name : frame의 이름을 지정
    * src : 불러올 페이지의 URL
    * scrolling : 스크롤 바의 허용여부

        * auto : 스크롤바가 필요한 경우만 스크롤 바를 노출 (default값)
        * yes : 스크롤바를 허용, 스크롤바가 필요 없는 경우에도 노출
        * no : 스크롤 바를 허용하지 않음.

    * 추가로 width, heigth, framebolder를 지정할 수 있지만 대부분 css에서 관리

    * youtube를 삽입하거나 facebook의 좋아요 버튼, 등을 가져와서 특정부분만 보여줄 수 있다.

    * a 태그에서 target을 iframe의 이름으로 잡게되면 링크로 연결된 HTML이 iframe에 표시된다. 

<br>

---

<br>

## MAP

* 이미지를 자르지 않고 특정 위치에 link를 걸 때 사용한다.

* 문법

    1. map 설정( 이름과 아이디를 같은 값으로 둘 다 부여하는 이유는 Browser마다 id만 읽거나 name만 읽는 경우가 있기 때문 )
    ```html
    <map name="map의 이름" id="map의 id">
        <area shape="형태" coords="좌표" title="툴팁 text" href="링크" target="문서가 로드될 프레임">
    </map>
    ```


    2. image에 map사용 속성을 설정한다.
    ```html
        <img src="이미지URL" usemap="#map의 이름">
    ```

* 형태의 사용.

    ```html
    <!--rect-->
    coords="x1,y1,x2,y2
    <!--circle-->
    coords="x1,y1,r"
    ```

    * rect는 좌 상단 점 죄표와 우 하단 좌표를 입력해 그 범위에 해당하는 사각형을 만든다.

    * circle는 입력한 좌표를 기준으로 반지름 r에 해당하는 원을 만든다.

<br>

---

<br>

## 띄어쓰기

* Html에서는 space를 이용하면 한칸 띄어쓰기가 가능하다 하지만 한칸 이상의 띄어쓰기는 불가능하다.

* 강제로 띄어쓰기를 사용할때 &nbsp + ; 을 이용한다.

```html
hello &nbsp; world!
```

<br>

## 이스케이핑

* HTML의 Tag나 특정문자를 해석하지 않고 표기된 그대로 화면에 표시하기 위해 사용한다.

```html
&amp; -> &
&lt; -> <
&gt; -> >
&quot; -> "
&apos; -> '
&copy; -> ⓒ

//ex
<br />을 그대로 표기해야 할 경우
&lt;br /&gt;
```

[escape를 해주는 페이지](http://www.htmlescape.net/htmlescape_tool.html)

<br>

---

<br>

## TABLE

* 데이터를 읽기 좋게 만들어 제공하기 위해 사용한다.

* 문법
    ```html
    <table>
        <caption>table명</caption>
        <tr>
            <th>column1</th><th>column2</th>,,,
        </tr>
        <tr>
            <td>Data1</td><td>Data2</td>,,,
        </tr>
    </table>
    ```
    * &lt;tr&gt; Tag는 테이블에서 열을 구분한다.
    * &lt;th&gt; Tag는 각 column의 제먹을 나타내 주며 모든 내용은 자동으로 굵은 글씨에 가운데 정렬이다.
    * &lt;td&gt; Tag는 테이블의 열을 각각 cell으로 나눈다.

* CSS의 border속성을 이용하여 테이블의 테이블을 표현할 수 있다.
<br />(border을 사용하지 않으면 빈 테두리가 default값이다.)

* 테이블의 열을 합칠 때 rowspan을 사용

* 테이블의 행을 합칠 때 colspan을 사용

* &lt;caption&gt;태그를 사용하면 테이블 상단 중앙에 제목이나 짧은 설명을 붙일 수 있다.

* &lt;figure&gt; 태그와 &lt;figcaption&gt;로 테이블에 대한 설명을 붙일 수 있다.

<br>

---

<br>

## Marquee(흘러가는 글자)

* 글자나 이미지가 지정한 방향으로 흐르게 할 수 있다.

* 문법

    ```html
    <marquee scrollamount="속도" direction="방향" behavior="동작">내용</marquee>
    ```

    * 방향 : left, right, up, down (up, down은 높이 값이 있어야한다.)
    * 동작 : slide(종료지점에서 정지), alternate(왔다가 갔다가 반복)

<br>

---

<br>


## Media 태그

* 음악, 동영상을 재생하는 태그

* HTML 4.01에서는 &lt;embed&gt; 태그를 사용하여 음악, 동영상을 하나의 태그로 재생.

* HTML5에서는 &lt;audio&gt;, &lt;video&gt;를 사용하여 음악과 동영상을 구분하여 보여준다.

* 음악파일은 모든 브라우저가 재생가능하지만, 동영상은 브라우저마다 지원하는 코덱이 다르다.

* 문법

    1. embed문법

    ```html
    <embed type="타입" src="경로" width="넓이" height="높이" autoplay="자동재생여부">
    ```

    2. video문법

    ```html
    <video src="비디오 파일이 경로" width="넓이" height="높이" controls="controls" muted="muted"
    poster="비디오 파일이 로딩되기 전까지 보여줄 이미지 파일" loop="반복여뷰">text</video>

    <!-- (브라우저의 코델이 비디오파일을 지원하지 않는 경우에는 )-->
    <video>
        <source src="비디오 파일 경로">  <!--1번파일이 실행되지 않으면 이하 지정한 파일이 실행-->
        <source src="비디오 파일 경로">
    </video>
    ```


    3. audio문법

    ```html
    <audio src="오디오 파일의 경로" autoplay="autoplay" controls="controls" preload="다운로드의 여부">


<br>

---

<br>

## 영역태그

* div와 span이 있다.

* div : block level의 요소로 브라우저의 width의 100%가 기본설정이다.

* span : inline-block의 요소로 자신이 가지고 있는 content의 크기만큼만 width로 설정된다.

* 영역을 확인하고 싶을 때는 요소의 배경색을 설정해서 확인해 보는 것이 가장 직관적이다.

<br>

---

<br>


## 레이아웃

* 레이아웃이란 특정 공간에 여러 구성요소를 보기 좋게 효과적으로 배치하는 작업을 말한다.

* HTML에서 레이아웃을 작성하는 방법

    1. div요소를 이용한 레이아웃

    2. HTML5 레이아웃

    3. table 요소를 이용한 레이아웃 (테이블 요소를 이용하여 레이아웃을 구성하는 것 현재는 거의 사용하지 않음.)

* div요소는 CSS에서 스타일을 손쉽게 적용할 수 있도록 도와준다. 

* HTML5 레이아웃 (시맨틱 태그)

    * 기본적인 구성

    <img src = https://user-images.githubusercontent.com/74294325/103472700-d3b19180-4dd3-11eb-98f6-90b5c0ffa406.JPG>

    * header : HTML 문서나 section부분에 대한 header을 정의한다.(여러개 존재 가능)

    * nav : HTML 문서 사이를 탐색할 수 있는 링크의 집합(문서 내의 모든 링크가 nav에 포함되는 것은 아니다.)

    * section : 제목을 가지고 있으며 HTML 문서의 전체적인 내용과 관련이 있는 contents의 집합

    * article : HTML 문서에서 독립적인 기사 부분을 정의한다.

    * figure : HTML 문서에서 그래픽과 비디오 등의 독립적인 contents를 정의

    * figcaption : figure과 같은 요소의 설명을 정의

    * footer : HTML의 가장 아래 위치하며 사이트의 작성자나 저작권,연락처 등을 명시하는 영역


<br>

---

<br>

## Meta

* HTML 문서에 대한 정보(data)로 웹 브라우저에는 직접적으로 표현되지 않는 정보를 의미.

* 문자의 charset을 설정하거나 html에 필요한 정보들이 담겨있다.

* metadata에는 &lt;title&gt;, &lt;style&gt;, &lt;meta&gt;, &lt;link&gt;, &lt;script&gt;, &lt;base&gt;태그 등을 이용하여 표현할 수 있다.

* 문법
```html
<meta name="" content=""/>

<!--ex-->
<meta name="description" content="문서에대한 설명"/>
<meta name="keyword" content="주요 키워드,주요 키워드,,"/>

<!--ex) 초를 설정하여 설정한 초가 지나면 지정한 url로 이동하게 하는 meta data-->
<meta http-equiv="refresh" content="초;url=이동할 페이지의 url"/> 

<!--ex) 다양한 device에서 페이지가 잘 보이도록 설정.-->
<meta name="viewport" content="width=device-width,initial-scale=1.0, user-scalable=no"/>
```

### Character set

* 웹 브라우저가 HTML 문서를 정확하게 나타내기 위해 해당 문서가 어떠한 문자셋을 사용하는지 지정.

* &lt;head&gt; Tag내에서 명시한다.

* 문법

    ```html
    <meta charset="UTF-8"> <!--HTML5의 문자셋 지정-->
    ```

---