---
title: "PageScaling.PageScalingOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageScaling 기능 옵션을 설명합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

PageScaling 기능 옵션을 설명합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [Custom](#Custom) | Application Media Size에 사용자 정의 스케일링을 적용하도록 지정합니다. |
| [CustomSquare](#CustomSquare) | Application Media Size에 사용자 정의 정사각형 스케일링을 적용하도록 지정합니다. |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | 응용 프로그램 블리드 크기를 PageImageableSize에 비율을 유지하면서 스케일링하도록 지정합니다. |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | 응용 프로그램 콘텐츠 크기를 PageImageableSize에 비율을 유지하면서 스케일링하도록 지정합니다. |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | 응용 프로그램 미디어 크기를 PageImageableSize에 비율을 유지하면서 스케일링하도록 지정합니다. |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | 응용 프로그램 미디어 크기를 PageMediaSize에 비율을 유지하면서 스케일링하도록 지정합니다. |
| [None](#None) | 스케일링을 적용하지 않도록 지정합니다. |
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
### Custom {#Custom}
```
public static PageScaling.PageScalingOption Custom
```


Application Media Size에 사용자 정의 스케일링을 적용하도록 지정합니다.

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


Application Media Size에 사용자 정의 정사각형 스케일링을 적용하도록 지정합니다.

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```


응용 프로그램 블리드 크기를 PageImageableSize에 비율을 유지하면서 스케일링하도록 지정합니다.

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```


응용 프로그램 콘텐츠 크기를 PageImageableSize에 비율을 유지하면서 스케일링하도록 지정합니다.

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```


응용 프로그램 미디어 크기를 PageImageableSize에 비율을 유지하면서 스케일링하도록 지정합니다.

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```


응용 프로그램 미디어 크기를 PageMediaSize에 비율을 유지하면서 스케일링하도록 지정합니다.

### None {#None}
```
public static PageScaling.PageScalingOption None
```


스케일링을 적용하지 않도록 지정합니다.

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

