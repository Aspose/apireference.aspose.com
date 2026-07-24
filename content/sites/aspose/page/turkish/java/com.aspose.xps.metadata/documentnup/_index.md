---
title: "DocumentNUp"
second_title: "Java için Aspose.Page API Referansı"
description: "Birden fazla mantıksal sayfanın tek bir fiziksel sayfaya çıktısını ve formatını açıklar."
type: docs
weight: 28
url: /tr/java/com.aspose.xps.metadata/documentnup/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentNUp extends NUp implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Birden fazla mantıksal sayfanın tek bir fiziksel sayfaya çıktısını ve formatını açıklar. Her belge ayrı ayrı derlenir.  DocumentNUp  ve  JobNUpAllDocumentsContiguously  karşılıklı olarak birbirini dışlar. Bu anahtar kelimeler arasındaki kısıtlama işleme kararını sürücü belirler. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [DocumentNUp(NUp.INUpItem[] items)](#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-) | Yeni bir örnek oluşturur. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Bu özelliğin öğe listesine bir öğe listesi ekler. |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | PagesPerSheet puanlanmış özelliği değeriyle bir seçenek ekler. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Elemanın adını alır. |
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


Yeni bir örnek oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [INUpItem\[\]](../../com.aspose.xps.metadata/inupitem) | Özellik için özel öğeler içeren bir dizi. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Bu özelliğin öğe listesine sonuna bir öğe listesi ekler. Her biri bir Feature, bir Option veya bir Property örneği olmalıdır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Eklenecek öğelerin listesi. |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public DocumentNUp addPagesPerSheetOption(int value)
```


PagesPerSheet puanlanmış özelliği değeriyle bir seçenek ekler. Fiziksel bir sayfa başına mantıksal sayfa sayısını belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
|  | değer | int | Bir |

```
PagesPerSheet
```

puanlı özellik değeri. Desteklenen küme, herhangi bir tamsayı kümesi olabilir; örn. \{1,2,4,6,8,9,16\}. |

**Returns:**
[DocumentNUp](../../com.aspose.xps.metadata/documentnup) - This feature instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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


Elemanın adını alır.

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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

