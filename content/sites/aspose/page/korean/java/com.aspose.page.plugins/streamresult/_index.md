---
title: "StreamResult"
second_title: "Aspose.Page용 Java API 참조"
description: "스트림 형태의 작업 결과를 나타냅니다."
type: docs
weight: 18
url: /ko/java/com.aspose.page.plugins/streamresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StreamResult implements IOperationResult
```

스트림 형태의 작업 결과를 나타냅니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [StreamResult(OutputStream stream)](#StreamResult-java.io.OutputStream-) | 지정된 스트림 객체를 사용하여 새 인스턴스를 초기화합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | 원시 데이터를 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | 결과가 바이트 배열인지 여부를 나타냅니다. |
| [isFile()](#isFile--) | 결과가 출력 파일 경로인지 여부를 나타냅니다. |
| [isStream()](#isStream--) | 결과가 출력 파일 경로인지 여부를 나타냅니다. |
| [isString()](#isString--) | 결과가 문자열인지 여부를 나타냅니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | 결과를 파일로 변환을 시도합니다. |
| [toStream()](#toStream--) | 결과를 스트림 객체로 변환을 시도합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamResult(OutputStream stream) {#StreamResult-java.io.OutputStream-}
```
public StreamResult(OutputStream stream)
```


지정된 스트림 객체를 사용하여 새 인스턴스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.OutputStream | 스트림 객체 |

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
### getData() {#getData--}
```
public final Object getData()
```


원시 데이터를 가져옵니다.

**Returns:**
java.lang.Object - 출력 데이터를 나타내는 객체.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


결과가 바이트 배열인지 여부를 나타냅니다.

**Returns:**
boolean - 결과가 바이트 배열이면 true; 그렇지 않으면 false.
### isFile() {#isFile--}
```
public final boolean isFile()
```


결과가 출력 파일 경로인지 여부를 나타냅니다.

**Returns:**
boolean - 결과가 파일이면 true; 그렇지 않으면 false.
### isStream() {#isStream--}
```
public final boolean isStream()
```


결과가 출력 파일 경로인지 여부를 나타냅니다.

**Returns:**
boolean - 결과가 스트림 객체이면 true; 그렇지 않으면 false.
### isString() {#isString--}
```
public final boolean isString()
```


결과가 문자열인지 여부를 나타냅니다.

**Returns:**
boolean - 결과가 문자열이면 true; 그렇지 않으면 false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


결과를 파일로 변환을 시도합니다.

**Returns:**
java.lang.String - 결과가 파일인 경우 출력 파일 경로를 나타내는 문자열; 그렇지 않으면 null.
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


결과를 스트림 객체로 변환을 시도합니다.

**Returns:**
java.io.OutputStream - 결과가 스트림인 경우 출력 데이터를 나타내는 스트림 객체; 그렇지 않으면 null.
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

