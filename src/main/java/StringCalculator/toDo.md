# 문자열 덧셈 계산기
## 문자열을 구분자로 분리하기
### 커스텀 구분자와 기본 구분자 (StringSeparator)
* 커스텀 구분자가 있는지 없는지 검사하는 메소드 (checkCustomDelimiter)
* 커스텀 구분자가 있으면 /n뒤의 문자열을 커스텀 구분자로 split 메소드 (splitCustomDelimiter)
* 커스텀 구분자가 없으면 , or :로 나누는 메소드 (splitDefaultDelimiter)
### 만약 빈 문자열이면 0을 반환 (StringChecker)
* 문자열이 비어 있는지 검사하는 메소드 (isEmptyString) 
### 사용자가 만약 숫자 이외의 값이나 음수를 넣으면 exception 발생
* 문자열이 숫자 이외의 값이나 음수를 갖는지 검사하는 메소드 (isCollectString)