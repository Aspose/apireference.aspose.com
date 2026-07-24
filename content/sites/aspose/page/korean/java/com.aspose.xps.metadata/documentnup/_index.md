---
title: "DocumentNUp"
second_title: "Aspose.Page용 Java API 참조"
description: "여러 논리 페이지를 하나의 물리 시트에 출력하고 포맷하는 방식을 설명합니다."
type: docs
weight: 28
url: /ko/java/com.aspose.xps.metadata/documentnup/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentNUp extends NUp implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

여러 논리 페이지를 하나의 물리 시트에 출력 및 형식화하는 방법을 설명합니다. 각 문서는 별도로 컴파일됩니다. DocumentNUp와 JobNUpAllDocumentsContiguously는 상호 배타적입니다. 이러한 키워드 간 제약 처리 여부는 드라이버가 결정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [DocumentNUp(NUp.INUpItem[] items)](#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-) | 새 인스턴스를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | PagesPerSheet 스코어드 속성 값을 사용하여 옵션을 추가합니다. |
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
### DocumentNUp(NUp.INUpItem[] items) {#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-}
```
public DocumentNUp(NUp.INUpItem[] items)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [INUpItem\[\]](../../com.aspose.xps.metadata/inupitem) | 해당 기능에 특화된 항목들의 배열입니다. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각 항목은 Feature, Option 또는 Property 인스턴스여야 합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | 추가할 항목 목록. |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public DocumentNUp addPagesPerSheetOption(int value)
```


PagesPerSheet 스코어드 속성 값을 사용하여 옵션을 추가합니다. 물리적 시트당 논리 페이지 수를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
|  | 값 | int | A |

```
PagesPerSheet
```

점수 속성 값. 지원되는 집합은 정수 집합이면 언제든지 가능합니다. 예: \{1,2,4,6,8,9,16\}. |

**Returns:**
[DocumentNUp](../../com.aspose.xps.metadata/documentnup) - This feature instance.
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

