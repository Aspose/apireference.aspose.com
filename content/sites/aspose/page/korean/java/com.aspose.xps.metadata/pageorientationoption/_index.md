---
title: "PageOrientation.PageOrientationOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageOrientation 기능 옵션을 설명합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pageorientation.pageorientationoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOrientation.PageOrientationOption extends Option
```

PageOrientation 기능 옵션을 설명합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [Landscape](#Landscape) | 내용이 표준(세로) 방향에 비해 페이지에서 90도 반시계 방향으로 회전됩니다. |
| [Portrait](#Portrait) | 표준 방향. |
| [ReverseLandscape](#ReverseLandscape) | 내용이 페이지에서 표준(세로) 방향에 대해 270도 반시계 방향으로 회전되었습니다. |
| [ReversePortrait](#ReversePortrait) | 내용이 페이지에서 표준(세로) 방향에 대해 180도 회전되었습니다. |
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
### Landscape {#Landscape}
```
public static final PageOrientation.PageOrientationOption Landscape
```


내용이 표준(세로) 방향에 비해 페이지에서 90도 반시계 방향으로 회전됩니다.

### Portrait {#Portrait}
```
public static final PageOrientation.PageOrientationOption Portrait
```


표준 방향.

### ReverseLandscape {#ReverseLandscape}
```
public static final PageOrientation.PageOrientationOption ReverseLandscape
```


내용이 페이지에서 표준(세로) 방향에 대해 270도 반시계 방향으로 회전되었습니다.

### ReversePortrait {#ReversePortrait}
```
public static final PageOrientation.PageOrientationOption ReversePortrait
```


내용이 페이지에서 표준(세로) 방향에 대해 180도 회전되었습니다.

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

