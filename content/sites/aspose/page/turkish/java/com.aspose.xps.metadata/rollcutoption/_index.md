---
title: "RollCut.RollCutOption"
second_title: "Java için Aspose.Page API Referansı"
description: "JobRollCutAtEndOfJob ve DocumentRollCut özellik seçeneklerini açıklar."
type: docs
weight: 10
url: /tr/java/com.aspose.xps.metadata/rollcut.rollcutoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class RollCut.RollCutOption extends Option
```

JobRollCutAtEndOfJob ve DocumentRollCut özellik seçeneklerini açıklar.
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [Banner](#Banner) | Afiş ( sadece DocumentRollCut ) için kesme yöntemini belirtir. |
| [CutSheetAtImageEdge](#CutSheetAtImageEdge) | Görüntünün kenarında kesmeyi belirtir. |
| [CutSheetAtStandardMediaSize](#CutSheetAtStandardMediaSize) | Standart medya boyutu için kesmeyi belirtir. |
| [None](#None) | İş için roll kesme yapılmadığını belirtir. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Bu seçeneğin öğe listesine bir öğe listesi ekler. |
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
### Banner {#Banner}
```
public static RollCut.RollCutOption Banner
```


Afiş ( sadece DocumentRollCut ) için kesme yöntemini belirtir.

### CutSheetAtImageEdge {#CutSheetAtImageEdge}
```
public static RollCut.RollCutOption CutSheetAtImageEdge
```


Görüntünün kenarında kesmeyi belirtir.

### CutSheetAtStandardMediaSize {#CutSheetAtStandardMediaSize}
```
public static RollCut.RollCutOption CutSheetAtStandardMediaSize
```


Standart medya boyutu için kesmeyi belirtir.

### None {#None}
```
public static RollCut.RollCutOption None
```


İş için roll kesme yapılmadığını belirtir.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Bu seçeneğin öğe listesine bir öğe listesi ekler. Her biri bir ScoredProperty veya bir Property örneği olmalıdır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Eklenecek öğelerin listesi. |

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

