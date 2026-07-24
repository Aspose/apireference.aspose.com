---
title: "JobDeviceLanguage"
second_title: "Java için Aspose.Page API Referansı"
description: "Sürücünden fiziksel cihaza veri gönderimi için desteklenen cihaz dillerini açıklar."
type: docs
weight: 50
url: /tr/java/com.aspose.xps.metadata/jobdevicelanguage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobDeviceLanguage extends Feature implements IJobPrintTicketItem
```

Sürücünün fiziksel cihaza veri gönderirken desteklediği cihaz dillerini açıklar. Bu genellikle "Page Description Language" (Sayfa Tanımlama Dili) olarak adlandırılır. Bu anahtar kelime, sürücü ve fiziksel cihaz tarafından desteklenen sayfa tanımlama dilinin ne olduğunu tanımlar. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobdevicelanguage
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [JobDeviceLanguage(JobDeviceLanguage.JobDeviceLanguageOption[] options)](#JobDeviceLanguage-com.aspose.xps.metadata.JobDeviceLanguage.JobDeviceLanguageOption...-) | Yeni bir örnek oluşturur. |
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
### JobDeviceLanguage(JobDeviceLanguage.JobDeviceLanguageOption[] options) {#JobDeviceLanguage-com.aspose.xps.metadata.JobDeviceLanguage.JobDeviceLanguageOption...-}
```
public JobDeviceLanguage(JobDeviceLanguage.JobDeviceLanguageOption[] options)
```


Yeni bir örnek oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| options | [JobDeviceLanguageOption\[\]](../../com.aspose.xps.metadata/jobdevicelanguageoption) | Özelliğe özgü seçeneklerin bir dizisi. |

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

