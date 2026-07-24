---
title: "ParameterInit"
second_title: "Aspose.Page용 Java API 참조"
description: "인쇄 티켓 매개변수 초기화기를 구현하는 클래스."
type: docs
weight: 139
url: /ko/java/com.aspose.xps.metadata/parameterinit/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem)
```
public class ParameterInit extends PrintTicketElement implements IPrintTicketItem
```

프린트 티켓 매개변수 초기화자를 구현하는 클래스. 공통 PrintTicket 매개변수 초기화자를 구현하는 클래스. 모든 스키마 정의 매개변수 초기화자의 기본 클래스.  ParameterDef  요소의 인스턴스에 대한 값을 정의합니다.  ParameterInit  요소는  ParameterRef  요소가 만든 참조의 대상입니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterinit
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [ParameterInit(String name, Value value)](#ParameterInit-java.lang.String-com.aspose.xps.metadata.Value-) | 새 인스턴스를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 요소 이름을 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ParameterInit(String name, Value value) {#ParameterInit-java.lang.String-com.aspose.xps.metadata.Value-}
```
public ParameterInit(String name, Value value)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String | 매개변수 이름입니다. |
| value | [Value](../../com.aspose.xps.metadata/value) | 매개변수 값입니다. |

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
### getName() {#getName--}
```
public String getName()
```


요소 이름을 가져옵니다.

**Returns:**
java.lang.String
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

