---
title: "JobInputBin"
second_title: "Java için Aspose.Page API Referansı"
description: "Bir cihazda kurulu giriş bölmesini veya cihaz için desteklenen bölmelerin tam listesini açıklar."
type: docs
weight: 57
url: /tr/java/com.aspose.xps.metadata/jobinputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.InputBin](../../com.aspose.xps.metadata/inputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobInputBin extends InputBin implements IJobPrintTicketItem
```

Bir cihazda kurulu giriş kutusunu veya bir cihaz için desteklenen kutuların tam listesini açıklar. İş bazında giriş kutusunun belirtilmesine izin verir. JobInputBin, DocumentInputBin ve PageInputBin anahtar kelimeleri birbirini dışlar. Bunların ikisi de bir PrintTicket veya Print Capabilities belgesinde aynı anda belirtilmemelidir. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [JobInputBin(InputBin.IInputBinItem[] items)](#JobInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-) | Yeni bir örnek oluşturur. |
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
### JobInputBin(InputBin.IInputBinItem[] items) {#JobInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-}
```
public JobInputBin(InputBin.IInputBinItem[] items)
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

