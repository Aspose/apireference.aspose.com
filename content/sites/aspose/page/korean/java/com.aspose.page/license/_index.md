---
title: "라이선스"
second_title: "Aspose.Page용 Java API 참조"
description: "구성 요소에 대한 라이선스 부여 메서드를 제공합니다."
type: docs
weight: 14
url: /ko/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

구성 요소에 대한 라이선스 부여 메서드를 제공합니다.

이 예제에서는 구성 요소가 포함된 폴더, 호출 어셈블리가 포함된 폴더, 진입 어셈블리 폴더에서 MyLicense.lic 라는 라이선스 파일을 찾은 다음 호출 어셈블리의 임베디드 리소스에서 찾으려고 시도합니다.

License license = new License();
license.setLicense(\"MyLicense.lic\");
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [License()](#License--) | 이 클래스의 새 인스턴스를 초기화합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | 기본적으로 우리는 기본 JDK 보안을 사용합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | 기본적으로 우리는 기본 JRE 보안을 사용합니다. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | 구성 요소에 라이선스를 적용합니다. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | 구성 요소에 라이선스를 적용합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


이 클래스의 새 인스턴스를 초기화합니다.

이 예제에서는 구성 요소가 포함된 폴더, 호출 어셈블리가 포함된 폴더, 진입 어셈블리 폴더에서 MyLicense.lic 라는 라이선스 파일을 찾은 다음 호출 어셈블리의 임베디드 리소스에서 찾으려고 시도합니다.

License license = new License();
license.setLicense(\"MyLicense.lic\");

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


기본적으로 우리는 기본 JDK 보안을 사용합니다. 기본값 == false. 경우에 따라 맞춤형 Java 환경이 필요한 알고리즘을 지원하지 못할 수 있으므로 내부 내장 FIPS 보안을 사용하는 것을 권장합니다.

**Returns:**
boolean - boolean 값
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setInternalFIPSSecurity(boolean internalFIPSSecurity) {#setInternalFIPSSecurity-boolean-}
```
public static void setInternalFIPSSecurity(boolean internalFIPSSecurity)
```


기본적으로 우리는 기본 JRE 보안을 사용합니다. 기본값 == false. 경우에 따라 맞춤형 Java 환경이 필요한 알고리즘을 지원하지 못할 수 있으므로 내부 내장 FIPS 보안을 사용하는 것을 권장합니다.

또한 참고: 일부 운영 체제에서 JVM SecureRandom 알고리즘에 따르면 /dev/random은 결과를 반환하기 전에 호스트 머신에서 일정량의 \u201cnoise\u201d가 생성되기를 기다립니다. Oracle\u2019s JVM에서 난수 생성을 위해 사용되는 라이브러리는 UNIX 플랫폼에서 기본적으로 /dev/random에 의존합니다. /dev/random이 더 안전하지만 기본 JVM 구성에서 지연이 발생하면 /dev/urandom을 사용하거나 /dev/random에 대한 엔트로피를 생성하는 장치를 추가하는 것이 권장됩니다.

다음 Java 옵션은 지연을 방지하고 securerandom.source 설정을 재정의하는 데 도움이 됩니다. -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| internalFIPSSecurity | boolean | 불리언 값 |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


구성 요소에 라이선스를 적용합니다.

라이선스를 포함하는 스트림.

이 메서드를 사용하여 스트림에서 라이선스를 로드합니다.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.InputStream | 라이선스 스트림 |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


구성 요소에 라이선스를 적용합니다.

다음 위치에서 라이선스를 찾으려고 시도합니다:

1. 명시적 경로.

2. 구성 요소 JAR 파일이 있는 폴더.

이 예제에서는 구성 요소가 포함된 폴더, 호출 어셈블리가 포함된 폴더, 진입 어셈블리 폴더에서 MyLicense.lic 라는 라이선스 파일을 찾은 다음 호출 어셈블리의 임베디드 리소스에서 찾으려고 시도합니다.

License license = new License();
license.setLicense(\"MyLicense.lic\");

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| licenseName | java.lang.String | 전체 파일 이름이거나 짧은 파일 이름, 혹은 임베디드 리소스 이름이 될 수 있습니다. 빈 문자열을 사용하면 평가 모드로 전환됩니다. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

