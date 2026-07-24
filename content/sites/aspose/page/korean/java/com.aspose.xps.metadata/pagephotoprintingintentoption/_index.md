---
title: "PagePhotoPrintingIntent.PagePhotoPrintingIntentOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PagePhotoPrintingIntent 기능 옵션을 정의합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps.metadata/pagephotoprintingintent.pagephotoprintingintentoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PagePhotoPrintingIntent.PagePhotoPrintingIntentOption extends Option
```

PagePhotoPrintingIntent 기능 옵션을 정의합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [None](#None) | Photoprinting Intent 없음 (응용 프로그램이 의도 해석을 지정하지 않도록 허용합니다. |
| [PhotoBest](#PhotoBest) | 최고 품질 포토프린팅 (주로 마케팅 목적을 위해 제공되며, 장치의 최고 기능을 활용합니다) |
| [PhotoDraft](#PhotoDraft) | 초안 품질 포토프린팅 (빠르고 잉크 사용량이 적은 인쇄로, 교정 용도에 적합합니다) |
| [PhotoStandard](#PhotoStandard) | 표준 품질 포토프린팅 (표준 사진 인쇄를 위한 OEM 권장 설정) |
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
### None {#None}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption None
```


Photoprinting Intent 없음 (응용 프로그램이 의도 해석을 지정하지 않도록 허용합니다. PrintTicket 설정은 변경되지 않아야 합니다)

### PhotoBest {#PhotoBest}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoBest
```


최고 품질 포토프린팅 (주로 마케팅 목적을 위해 제공되며, 장치의 최고 기능을 활용합니다)

### PhotoDraft {#PhotoDraft}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoDraft
```


초안 품질 포토프린팅 (빠르고 잉크 사용량이 적은 인쇄로, 교정 용도에 적합합니다)

### PhotoStandard {#PhotoStandard}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoStandard
```


표준 품질 포토프린팅 (표준 사진 인쇄를 위한 OEM 권장 설정)

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

