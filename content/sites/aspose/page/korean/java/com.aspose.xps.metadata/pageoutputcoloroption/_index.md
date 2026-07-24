---
title: "PageOutputColor.PageOutputColorOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageOutputColor 기능 옵션을 설명합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pageoutputcolor.pageoutputcoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageOutputColor.IPageOutputColorItem](../../com.aspose.xps.metadata/ipageoutputcoloritem)
```
public static final class PageOutputColor.PageOutputColorOption extends Option implements PageOutputColor.IPageOutputColorItem
```

PageOutputColor 기능 옵션을 설명합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)](#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | 새 인스턴스를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Color(int deviceBitsPerPixel, int driverBitsPerPixel)](#Color-int-int-) | 출력이 컬러여야 함을 지정합니다. |
| [Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)](#Grayscale-int-int-) | 출력이 그레이스케일이어야 함을 지정합니다. |
| [Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)](#Monochrome-int-int-) | 출력이 단색(검정)이어야 함을 지정합니다. |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. |
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | 옵션에 IPageOutputColorOptionItem 인스턴스 배열을 추가합니다. |
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
### PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items) {#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| optionName | java.lang.String | 옵션 이름입니다. |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | 임의의 IPageOutputColorOptionItem 인스턴스 배열입니다. |

### Color(int deviceBitsPerPixel, int driverBitsPerPixel) {#Color-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Color(int deviceBitsPerPixel, int driverBitsPerPixel)
```


출력이 컬러여야 함을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| deviceBitsPerPixel | int | 프린터가 지원하는 컬러 데이터의 픽셀당 비트 수를 나타내는 DeviceBitsPerPixel 점수 속성 값입니다. |
| driverBitsPerPixel | int | 코어 드라이버가 비트맵 렌더링 버퍼에 사용할 픽셀당 비트 수를 나타내는 DriverBitsPerPixel 점수 속성 값입니다. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel) {#Grayscale-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)
```


출력이 그레이스케일이어야 함을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| deviceBitsPerPixel | int | 프린터가 지원하는 컬러 데이터의 픽셀당 비트 수를 나타내는 DeviceBitsPerPixel 점수 속성 값입니다. |
| driverBitsPerPixel | int | 코어 드라이버가 비트맵 렌더링 버퍼에 사용할 픽셀당 비트 수를 나타내는 DriverBitsPerPixel 점수 속성 값입니다. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel) {#Monochrome-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)
```


출력이 단색(검정)이어야 함을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| deviceBitsPerPixel | int | 프린터가 지원하는 컬러 데이터의 픽셀당 비트 수를 나타내는 DeviceBitsPerPixel 점수 속성 값입니다. |
| driverBitsPerPixel | int | 코어 드라이버가 비트맵 렌더링 버퍼에 사용할 픽셀당 비트 수를 나타내는 DriverBitsPerPixel 점수 속성 값입니다. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. 각 항목은 ScoredProperty 또는 Property 인스턴스여야 합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 추가할 항목 목록. |

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```


옵션에 IPageOutputColorOptionItem 인스턴스 배열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | 임의의 IPageOutputColorOptionItem 인스턴스 배열입니다. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
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

