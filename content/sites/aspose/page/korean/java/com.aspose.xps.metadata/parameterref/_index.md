---
title: "ParameterRef"
second_title: "Aspose.Page용 Java API 참조"
description: "공통 PrintTicket 매개변수 참조를 구현하는 클래스."
type: docs
weight: 140
url: /ko/java/com.aspose.xps.metadata/parameterref/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem)
```
public class ParameterRef extends PrintTicketElement implements IPrintTicketItem
```

공통 PrintTicket 매개변수 참조를 구현하는 클래스입니다. ParameterRef 요소는 ParameterInit 요소에 대한 참조를 정의합니다. ParameterRef 요소를 포함하는 ScoredProperty 요소는 명시적으로 설정된 Value 요소를 갖지 않습니다. 대신 ScoredProperty 요소는 ParameterRef 요소가 참조하는 ParameterInit 요소로부터 값을 받습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterref
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [ParameterRef(String name)](#ParameterRef-java.lang.String-) | 새 인스턴스를 생성합니다. |
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
### ParameterRef(String name) {#ParameterRef-java.lang.String-}
```
public ParameterRef(String name)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String | 매개변수 이름입니다. |

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

