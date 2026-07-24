---
title: "PageInputBin"
second_title: "Java için Aspose.Page API Referansı"
description: "Bir cihazda kurulu giriş bölmesini veya cihaz için desteklenen bölmelerin tam listesini açıklar."
type: docs
weight: 100
url: /tr/java/com.aspose.xps.metadata/pageinputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.InputBin](../../com.aspose.xps.metadata/inputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageInputBin extends InputBin implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Bir cihazda kurulu giriş kutusunu veya bir cihaz için desteklenen kutuların tam listesini tanımlar. Giriş kutusunun sayfa bazında belirtilmesine izin verir. JobInputBin, DocumentInputBin ve PageInputBin anahtar sözcükleri birbirini dışlar. Her ikisi de bir PrintTicket veya Print Capabilities belgesinde aynı anda belirtilmemelidir. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [PageInputBin(InputBin.IInputBinItem[] items)](#PageInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-) | Yeni bir örnek oluşturur. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Bu özelliğin öğe listesine bir öğe listesi ekler. |
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
### PageInputBin(InputBin.IInputBinItem[] items) {#PageInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-}
```
public PageInputBin(InputBin.IInputBinItem[] items)
```


Yeni bir örnek oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [IInputBinItem\[\]](../../com.aspose.xps.metadata/iinputbinitem) | Özellik için özel öğeler içeren bir dizi. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Bu özelliğin öğe listesine sonuna bir öğe listesi ekler. Her biri bir Feature, bir Option veya bir Property örneği olmalıdır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Eklenecek öğelerin listesi. |

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

