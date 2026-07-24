---
title: "PageResolution.PageResolutionOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageResolution 기능 옵션을 설명합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pageresolution.pageresolutionoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageResolution.IPageResolutionItem](../../com.aspose.xps.metadata/ipageresolutionitem)
```
public static final class PageResolution.PageResolutionOption extends Option implements PageResolution.IPageResolutionItem
```

PageResolution 기능 옵션을 설명합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)](#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | 새 인스턴스를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. |
| [add(PageResolution.IPageResolutionOptionItem[] items)](#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | 옵션에 IPageResolutionOptionItem 인스턴스 배열을 추가합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 요소 이름을 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setResolutionX(int resolutionX)](#setResolutionX-int-) | ResolutionX 점수 속성 값을 설정합니다. |
| [setResolutionY(int resolutionY)](#setResolutionY-int-) | ResolutionY 점수 속성 값을 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items) {#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| optionName | java.lang.String | 옵션 이름입니다. |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | IPageResolutionOptionItem 인스턴스의 임의 배열입니다. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. 각 항목은 ScoredProperty 또는 Property 인스턴스여야 합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 추가할 항목 목록. |

### add(PageResolution.IPageResolutionOptionItem[] items) {#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolution.PageResolutionOption add(PageResolution.IPageResolutionOptionItem[] items)
```


옵션에 IPageResolutionOptionItem 인스턴스 배열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | IPageResolutionOptionItem 인스턴스의 임의 배열입니다. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This options instance.
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




### setResolutionX(int resolutionX) {#setResolutionX-int-}
```
public PageResolution.PageResolutionOption setResolutionX(int resolutionX)
```


ResolutionX 점수 속성 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| resolutionX | int | ResolutionX 점수 속성 값입니다. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
### setResolutionY(int resolutionY) {#setResolutionY-int-}
```
public PageResolution.PageResolutionOption setResolutionY(int resolutionY)
```


ResolutionY 점수 속성 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| resolutionY | int | ResolutionY 점수 속성 값입니다. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
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

