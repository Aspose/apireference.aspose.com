---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Java için Aspose.Page API Referansı"
description: "PageOutputQuality özelliği seçeneklerini tanımlar."
type: docs
weight: 10
url: /tr/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

PageOutputQuality özelliği seçeneklerini tanımlar.
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [Automatic](#Automatic) | Otomatik çıktı amacı belirler (istemcinin en iyi ayarları otomatik olarak seçmesine izin verir). |
| [Draft](#Draft) | Taslak çıktı amacı belirler (taslak kalite metin ve grafikler için dengelenmiş). |
| [Fax](#Fax) | Faks çıktısı amacı belirler (standart faks kalitesi için dengelenmiş). |
| [High](#High) | Yüksek kalite çıktı amacı belirler (yüksek kalite metin ve grafikler için dengelenmiş). |
| [Normal](#Normal) | Normal çıktı amacı belirler (iyi kalite metin ve grafikler için dengelenmiş). |
| [Photographic](#Photographic) | Fotoğrafik çıktı amacı belirler (görüntüler en yüksek kaliteye sahip olmalıdır). |
| [Text](#Text) | Yalnızca metin çıktısı amacı belirler (grafikler kötü çıkabilir veya hiç çıkmayabilir). |
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
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


Otomatik çıktı amacı belirler (istemcinin en iyi ayarları otomatik olarak seçmesine izin verir).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


Taslak çıktı amacı belirler (taslak kalite metin ve grafikler için dengelenmiş).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


Faks çıktısı amacı belirler (standart faks kalitesi için dengelenmiş).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


Yüksek kalite çıktı amacı belirler (yüksek kalite metin ve grafikler için dengelenmiş).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


Normal çıktı amacı belirler (iyi kalite metin ve grafikler için dengelenmiş).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


Fotoğrafik çıktı amacı belirler (görüntüler en yüksek kaliteye sahip olmalıdır).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


Yalnızca metin çıktısı amacı belirler (grafikler kötü çıkabilir veya hiç çıkmayabilir).

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

