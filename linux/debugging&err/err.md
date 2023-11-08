# 오류 처리
## 오류 번호
- 많은 라이브러리 함수들이 오류 발생 시 오류번호를 반환한다.<br>
- <errno.h> : 가장 최근의 오류값을 나타낸다
  - EBADF 잘못된 파일 기술자
  - EINPROGRESS 진행중인 오퍼레이션
  - EINVAL 잘못된 프로그램 인자
  - ENOENT 없는 파일 또는 디렉토리
  - ERANGE 결과값이 너무 큼
  - ETIMEDOUT 시간 초과된 오퍼레이션
### strerror 처리
발생 오류 번호 errno에 대해 strerror() 함수를 사용하여 오류 원인을 출력한다.
#### 형식
```
#include <string.h>
char *strerror(int errnum);
```
#### 기능
- 오류 원인을 설명하는 문자열을 출력한다.<br>
반환값<br>
- 인자 errnum에 해당하는 문자열을 만환하거나, 알지 못하는 오류인 경우 unknown error 메세지를 반환한다<br>
#### strerror 예제 프로그램
```
/* file name : strerror_use.c */
#include <stdio.h>
#include<stdlib.h>
#include<string.h>
#include<errno.h>

void main(int argc, char *argv[]){
  FILE *f;
  if (argc<2){
    printf("Usage:strerror_use nofilename\n");
    exit(1);
  }
  if((f=fopen(argv[1],"r"))==NULL){
    printf("Cannot open a file \"%s\"...(error message: %s)\n", argv[1],strerror(errno));
    exit(1);
  }
  printf("Open a file \"%s\".\n", argv[1]);
  fclose(f);
}
```
#### 실행 결과
```
$ strerror_use filename
Cannot open a file "nofilename"...(error message:No such file or directory)
```
### perrno 처리
가장 최근의 오류 원인을 문자열로 출력해 준다.<br>
perror() 함수 사용 시 오류 발생 함수를 사용하여 오류 발생 지점을 명시하는 것이 좋다.<br>
#### 형식
```
#include <stdio.h>
void perror(const char *s);
```
#### 기능
문자열 s가 NULL이 아니면 문자열 s 다음에 ":" 와 가장 최근의 오류 원인을 설명하는 문자열을 함께 출력한다.<br>
문자열 s가 NULL이 아니면 가장 최근의 오류 원인을 설명하는 문자열만 출력한다.
#### perror 예제 프로그램
```
/* file name : perror_use.c */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

void main(int argc, char *argv[]){
  FILE *f;
  if (argc<2){
    printf("Usage:perror_use nofilename\n");
    exit(1);
  }
  if((f=fopne(argv[1],"r"))==NULL){
    perror("fopen"); //perror(NULL)로 대체하여 실행해 보자.
    exit(1);
  }
  printf("Open a file \"%s\".\n",argv[1]);
  fclose(f);
}
```
#### 실행 결과
```
$ perror_use nofilename
fopen: No such file or directory
```
### 조건부 오류 처리
특정 수식을 이용한 오류 조건을 검사하여 거짓이면 오류 메세지를 출력하고 프로그램 종료한다<br>
#### 형식
```
#include <assert.h>
void assert(int expression);
```
#### 기능
만약 수식 expression이 거짓이면, 표준 출력 stdout으로 오류 메시지를 출력하고 abort()를 호출해 프로그램을 종료한다.<br>
만약 NBEBUG가 정의되어 있으면 실행하지 않는다.<br>
#### 조건부 종료 예제 프로그램
```
/* file name : assert_test.c */
#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

void foo(int num){
  assert( ((num>=0 && (num<=100)) );
  printf("foo:num=%d\n",num);
}
main(int argc, char *argv[]){
  int num;
  if (argc<2){
    fprintf(stderr, "Usage:assert_test aNumber\n(0<= aNumber<=100)\n");
    exit(1);
  }
  num=atoi(argv[1]);
  foo(num);
}
```
#### 실행 결과
```
$ assert_test 10
foo:num=10
$assert_test 1234
assert_test:assert_test.c:12:foo:Assertion `((num>=0 && (num<=100))` failed.
```
