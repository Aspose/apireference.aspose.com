---
title: "PageColorManagement.PageColorManagementOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageColorManagement 기능 옵션을 설명합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pagecolormanagement.pagecolormanagementoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageColorManagement.PageColorManagementOption extends Option
```

PageColorManagement 기능 옵션을 설명합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [Device](#Device) | 응용 프로그램이 색 관리를 수행하지 않았으며 장치가 색 관리를 결정합니다. |
| [Driver](#Driver) | 응용 프로그램이 색 관리를 수행하지 않았으며 드라이버가 색 관리를 결정합니다. |
| [None](#None) | 응용 프로그램이 대상 프로필에 대한 색 관리를 수행했습니다. |
| [System](#System) | 색 관리는 시스템에 의해 수행됩니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. |
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
### Device {#Device}
```
public static PageColorManagement.PageColorManagementOption Device
```


응용 프로그램이 색 관리를 수행하지 않았으며 장치가 색 관리를 결정합니다.

### Driver {#Driver}
```
public static PageColorManagement.PageColorManagementOption Driver
```


응용 프로그램이 색 관리를 수행하지 않았으며 드라이버가 색 관리를 결정합니다.

### None {#None}
```
public static PageColorManagement.PageColorManagementOption None
```


응용 프로그램이 대상 프로필에 대한 색 관리를 수행했습니다.

### System {#System}
```
public static PageColorManagement.PageColorManagementOption System
```


색 관리는 시스템에 의해 수행됩니다. XPSDrv 인쇄 드라이버로 인쇄할 때는 사용하지 마십시오.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. 각 항목은 ScoredProperty 또는 Property 인스턴스여야 합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 추가할 항목 목록. |

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

