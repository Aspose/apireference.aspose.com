---
title: "PageBlendColorSpace.PageBlendColorSpaceOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageBlendColorSpace 기능 옵션을 설명합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pageblendcolorspace.pageblendcolorspaceoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageBlendColorSpace.PageBlendColorSpaceOption extends Option
```

PageBlendColorSpace 기능 옵션을 설명합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [ICCProfile](#ICCProfile) | 혼합에 사용되어야 하는 색 공간을 정의하는 ICC 프로파일을 지정합니다. |
| [sRGB](#sRGB) | 혼합을 위해 sRGB 색 공간을 사용해야 합니다. |
| [scRGB](#scRGB) | 혼합을 위해 scRGB 색 공간을 사용해야 합니다. |
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
### ICCProfile {#ICCProfile}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption ICCProfile
```


혼합에 사용해야 하는 색 공간을 정의하는 ICC 프로파일을 지정합니다. 참고: 이는 XPS 문서에만 적용되며 임의의 PrintTickets에서는 사용해서는 안 됩니다.

### sRGB {#sRGB}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption sRGB
```


혼합을 위해 sRGB 색 공간을 사용해야 합니다.

### scRGB {#scRGB}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption scRGB
```


혼합을 위해 scRGB 색 공간을 사용해야 합니다.

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

