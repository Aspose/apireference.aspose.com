---
title: "JobPrintTicket"
second_title: "Aspose.Page용 Java API 참조"
description: "작업 수준 인쇄 티켓을 캡슐화하는 클래스입니다."
type: docs
weight: 70
url: /ko/java/com.aspose.xps.metadata/jobprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class JobPrintTicket extends PrintTicket
```

작업 수준 인쇄 티켓을 캡슐화하는 클래스입니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [JobPrintTicket(IJobPrintTicketItem[] items)](#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-) | 작업 수준의 인쇄 티켓 인스턴스를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(IJobPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IJobPrintTicketItem...-) | 이 PrintTicket 항목 목록 끝에 항목 배열을 추가합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | 인쇄 티켓 항목 이름 반복자를 반환합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | 이 PrintTicket 항목 목록에서 항목을 제거합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JobPrintTicket(IJobPrintTicketItem[] items) {#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public JobPrintTicket(IJobPrintTicketItem[] items)
```


작업 수준의 인쇄 티켓 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | 임의의 IJobPrintTicketItem 인스턴스 배열입니다. 각 인스턴스는 Feature, ParameterInit 또는 Property 인스턴스가 될 수 있습니다. |

### add(IJobPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public void add(IJobPrintTicketItem[] items)
```


이 PrintTicket 항목 목록 끝에 항목 배열을 추가합니다. 각 항목은 Feature, ParameterInit 또는 Property 인스턴스일 수 있습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | 추가할 항목 배열입니다. |

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
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


인쇄 티켓 항목 이름 반복자를 반환합니다.

**Returns:**
java.util.Iterator<java.lang.String> - 목록에 대한 반복자를 반환합니다.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


이 PrintTicket 항목 목록에서 항목을 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String[] | 항목 이름 배열입니다. |

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

