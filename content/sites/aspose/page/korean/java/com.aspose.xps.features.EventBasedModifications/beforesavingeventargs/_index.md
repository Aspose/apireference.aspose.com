---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page용 Java API 참조"
description: "다양한 저장 전 이벤트의 인수를 위한 기본 클래스를 정의합니다."
type: docs
weight: 11
url: /ko/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

다양한 저장 전 이벤트의 인수를 위한 기본 클래스를 정의합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | XPS 패키지 내 모든 문서에 대한 현재 절대 페이지 번호를 반환합니다. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | XPS 패키지 내 현재 문서 번호를 반환합니다. |
| [getElementAPI()](#getElementAPI--) | 저장될 요소의 수정 API를 반환합니다. |
| [getOutputPageNumber()](#getOutputPageNumber--) | 현재 출력 번호를 반환합니다. |
| [getRelativePageNumber()](#getRelativePageNumber--) | XPS 패키지 내 현재 문서에 상대적인 현재 페이지 번호를 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


XPS 패키지 내 모든 문서에 대한 현재 절대 페이지 번호를 반환합니다.

**Returns:**
int - XPS 패키지 내 모든 문서에 대한 현재 절대 페이지 번호.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


XPS 패키지 내 현재 문서 번호를 반환합니다.

**Returns:**
int - XPS 패키지 내 현재 문서 번호.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


저장될 요소의 수정 API를 반환합니다.

**Returns:**
T - 저장될 요소의 수정 API.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


현재 출력 번호를 반환합니다. **PageNumbers** 저장 옵션이 지정된 경우 **AbsolutePageNumber**와 다릅니다.

**Returns:**
int - 현재 출력 번호.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


XPS 패키지 내 현재 문서에 상대적인 현재 페이지 번호를 반환합니다.

**Returns:**
int - XPS 패키지 내 현재 문서에 상대적인 현재 페이지 번호.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

