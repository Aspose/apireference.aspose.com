---
title: "PageMediaColor.PageMediaColorOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageMediaColor 기능 옵션을 설명합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pagemediacolor.pagemediacoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageMediaColor.PageMediaColorOption extends Option
```

PageMediaColor 기능 옵션을 설명합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [Black](#Black) | 검정. |
| [Blue](#Blue) | 파랑. |
| [Brown](#Brown) | 갈색. |
| [Gold](#Gold) | 금색. |
| [GoldenRod](#GoldenRod) | 골든로드. |
| [Gray](#Gray) | 회색. |
| [Green](#Green) | 녹색. |
| [Ivory](#Ivory) | 아이보리. |
| [NoColor](#NoColor) | 색 없음. |
| [Orange](#Orange) | 주황색. |
| [Pink](#Pink) | 핑크. |
| [Red](#Red) | 빨간색. |
| [Silver](#Silver) | 은색. |
| [Turquoise](#Turquoise) | 청록색. |
| [Violet](#Violet) | 보라색. |
| [White](#White) | 흰색. |
| [Yellow](#Yellow) | 노란색. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getCustom(String mediaColorsRGB)](#getCustom-java.lang.String-) | 사용자 지정 페이지 색상을 지정합니다. |
| [getName()](#getName--) | 요소 이름을 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Black {#Black}
```
public static PageMediaColor.PageMediaColorOption Black
```


검정.

### Blue {#Blue}
```
public static PageMediaColor.PageMediaColorOption Blue
```


파랑.

### Brown {#Brown}
```
public static PageMediaColor.PageMediaColorOption Brown
```


갈색.

### Gold {#Gold}
```
public static PageMediaColor.PageMediaColorOption Gold
```


금색.

### GoldenRod {#GoldenRod}
```
public static PageMediaColor.PageMediaColorOption GoldenRod
```


골든로드.

### Gray {#Gray}
```
public static PageMediaColor.PageMediaColorOption Gray
```


회색.

### Green {#Green}
```
public static PageMediaColor.PageMediaColorOption Green
```


녹색.

### Ivory {#Ivory}
```
public static PageMediaColor.PageMediaColorOption Ivory
```


아이보리.

### NoColor {#NoColor}
```
public static PageMediaColor.PageMediaColorOption NoColor
```


색 없음.

### Orange {#Orange}
```
public static PageMediaColor.PageMediaColorOption Orange
```


주황색.

### Pink {#Pink}
```
public static PageMediaColor.PageMediaColorOption Pink
```


핑크.

### Red {#Red}
```
public static PageMediaColor.PageMediaColorOption Red
```


빨간색.

### Silver {#Silver}
```
public static PageMediaColor.PageMediaColorOption Silver
```


은색.

### Turquoise {#Turquoise}
```
public static PageMediaColor.PageMediaColorOption Turquoise
```


청록색.

### Violet {#Violet}
```
public static PageMediaColor.PageMediaColorOption Violet
```


보라색.

### White {#White}
```
public static PageMediaColor.PageMediaColorOption White
```


흰색.

### Yellow {#Yellow}
```
public static PageMediaColor.PageMediaColorOption Yellow
```


노란색.

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
### getCustom(String mediaColorsRGB) {#getCustom-java.lang.String-}
```
public static PageMediaColor.PageMediaColorOption getCustom(String mediaColorsRGB)
```


사용자 지정 페이지 색상을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| mediaColorsRGB | java.lang.String | 페이지 색상. |

**Returns:**
[PageMediaColorOption](../../com.aspose.xps.metadata/pagemediacoloroption) - The option element for a custom color.
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

