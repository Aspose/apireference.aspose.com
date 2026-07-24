---
title: "JobCollateAllDocuments"
second_title: "Aspose.Page용 Java API 참조"
description: "출력의 정렬 특성을 설명합니다."
type: docs
weight: 47
url: /ko/java/com.aspose.xps.metadata/jobcollatealldocuments/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Collate](../../com.aspose.xps.metadata/collate)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobCollateAllDocuments extends Collate implements IJobPrintTicketItem
```

출력의 정렬 특성을 설명합니다. 각 개별 작업의 모든 문서가 정렬됩니다. DocumentCollate와 JobCollateAllDocuments는 상호 배타적입니다. 두 키워드 중 하나만 구현할지 여부에 대한 동작 및 구현은 드라이버에 맡겨집니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobcollatealldocuments
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [JobCollateAllDocuments(Collate.CollateOption[] options)](#JobCollateAllDocuments-com.aspose.xps.metadata.Collate.CollateOption...-) | 새 인스턴스를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. |
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
### JobCollateAllDocuments(Collate.CollateOption[] options) {#JobCollateAllDocuments-com.aspose.xps.metadata.Collate.CollateOption...-}
```
public JobCollateAllDocuments(Collate.CollateOption[] options)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [CollateOption\[\]](../../com.aspose.xps.metadata/collateoption) | 해당 기능에 특화된 옵션 배열입니다. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각 항목은 Feature, Option 또는 Property 인스턴스여야 합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | 추가할 항목 목록. |

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

