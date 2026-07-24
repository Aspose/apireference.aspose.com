---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageOutputQuality 기능 옵션을 정의합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

PageOutputQuality 기능 옵션을 정의합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [Automatic](#Automatic) | 자동 출력 의도를 지정합니다(클라이언트가 최적 설정을 자동으로 선택하도록 허용). |
| [Draft](#Draft) | 초안 출력 의도를 지정합니다(초안 품질의 텍스트와 그래픽에 균형). |
| [Fax](#Fax) | 팩스 출력 의도를 지정합니다(표준 팩스 품질에 균형). |
| [High](#High) | 고품질 출력 의도를 지정합니다(고품질 텍스트와 그래픽에 균형). |
| [Normal](#Normal) | 일반 출력에 대한 의도를 지정합니다(텍스트와 그래픽의 품질이 좋도록 균형을 맞춤). |
| [Photographic](#Photographic) | 사진 출력에 대한 의도를 지정합니다(이미지는 최고 품질이어야 합니다). |
| [Text](#Text) | 텍스트 전용 출력에 대한 의도를 지정합니다(그래픽은 제대로 출력되지 않거나 전혀 출력되지 않을 수 있습니다). |
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
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


자동 출력 의도를 지정합니다(클라이언트가 최적 설정을 자동으로 선택하도록 허용).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


초안 출력 의도를 지정합니다(초안 품질의 텍스트와 그래픽에 균형).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


팩스 출력 의도를 지정합니다(표준 팩스 품질에 균형).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


고품질 출력 의도를 지정합니다(고품질 텍스트와 그래픽에 균형).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


일반 출력에 대한 의도를 지정합니다(텍스트와 그래픽의 품질이 좋도록 균형을 맞춤).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


사진 출력에 대한 의도를 지정합니다(이미지는 최고 품질이어야 합니다).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


텍스트 전용 출력에 대한 의도를 지정합니다(그래픽은 제대로 출력되지 않거나 전혀 출력되지 않을 수 있습니다).

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

