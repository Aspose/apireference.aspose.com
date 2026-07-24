---
title: "JobBindAllDocuments.BindingOption"
second_title: "Aspose.Page용 Java API 참조"
description: "JobBindAllDocuments 기능 옵션을 설명합니다."
type: docs
weight: 11
url: /ko/java/com.aspose.xps.metadata/jobbindalldocuments.bindingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobBindAllDocuments.BindingOption extends Option
```

JobBindAllDocuments 기능 옵션을 설명합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)](#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-) | 새 인스턴스를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| [Bale](#Bale) | 베일 제본을 지정합니다. |
| [BindBottom](#BindBottom) | 하단 가장자리를 따라 제본을 지정합니다. |
| [BindLeft](#BindLeft) | 왼쪽 가장자리를 따라 제본을 지정합니다. |
| [BindRight](#BindRight) | 오른쪽 가장자리를 따라 제본을 지정합니다. |
| [BindTop](#BindTop) | 상단 가장자리를 따라 제본을 지정합니다. |
| [Booklet](#Booklet) | 소책자 제본을 지정합니다. |
| [EdgeStitchBottom](#EdgeStitchBottom) | 하단 가장자리를 따라 가장자리 스티칭을 지정합니다. |
| [EdgeStitchLeft](#EdgeStitchLeft) | 왼쪽 가장자를 따라 가장자리 스티칭을 지정합니다. |
| [EdgeStitchRight](#EdgeStitchRight) | 오른쪽 가장자를 따라 가장자리 스티칭을 지정합니다. |
| [EdgeStitchTop](#EdgeStitchTop) | 상단 가장자를 따라 가장자리 스티칭을 지정합니다. |
| [Fold](#Fold) | 접힌 제본을 지정합니다. |
| [JogOffset](#JogOffset) | 조깅 오프셋 제본을 지정합니다. |
| [None](#None) | 제본 없음을 지정합니다. |
| [Trim](#Trim) | 트리밍 제본을 지정합니다. |
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
### BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items) {#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-}
```
public BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String | 옵션 이름. |
| items | [IBindingOptionItem\[\]](../../com.aspose.xps.metadata/ibindingoptionitem) | 법적 하위 항목들의 배열입니다. |

### Bale {#Bale}
```
public static final JobBindAllDocuments.BindingOption Bale
```


베일 제본을 지정합니다.

### BindBottom {#BindBottom}
```
public static final JobBindAllDocuments.BindingOption BindBottom
```


하단 가장자리를 따라 제본을 지정합니다.

### BindLeft {#BindLeft}
```
public static final JobBindAllDocuments.BindingOption BindLeft
```


왼쪽 가장자리를 따라 제본을 지정합니다.

### BindRight {#BindRight}
```
public static final JobBindAllDocuments.BindingOption BindRight
```


오른쪽 가장자리를 따라 제본을 지정합니다.

### BindTop {#BindTop}
```
public static final JobBindAllDocuments.BindingOption BindTop
```


상단 가장자리를 따라 제본을 지정합니다.

### Booklet {#Booklet}
```
public static final JobBindAllDocuments.BindingOption Booklet
```


소책자 제본을 지정합니다.

### EdgeStitchBottom {#EdgeStitchBottom}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchBottom
```


하단 가장자리를 따라 가장자리 스티칭을 지정합니다.

### EdgeStitchLeft {#EdgeStitchLeft}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchLeft
```


왼쪽 가장자를 따라 가장자리 스티칭을 지정합니다.

### EdgeStitchRight {#EdgeStitchRight}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchRight
```


오른쪽 가장자를 따라 가장자리 스티칭을 지정합니다.

### EdgeStitchTop {#EdgeStitchTop}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchTop
```


상단 가장자를 따라 가장자리 스티칭을 지정합니다.

### Fold {#Fold}
```
public static final JobBindAllDocuments.BindingOption Fold
```


접힌 제본을 지정합니다.

### JogOffset {#JogOffset}
```
public static final JobBindAllDocuments.BindingOption JogOffset
```


조깅 오프셋 제본을 지정합니다.

### None {#None}
```
public static final JobBindAllDocuments.BindingOption None
```


제본 없음을 지정합니다.

### Trim {#Trim}
```
public static final JobBindAllDocuments.BindingOption Trim
```


트리밍 제본을 지정합니다.

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

