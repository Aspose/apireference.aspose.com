---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Java için Aspose.Page API Referansı"
description: "PageMediaType özelliği seçeneklerini açıklar."
type: docs
weight: 13
url: /tr/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

PageMediaType özelliği seçeneklerini açıklar.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Yeni bir örnek oluşturur. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Bu seçenek örneğini kopyalar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [Archival](#Archival) | Arşiv kalitesinde medyayı belirtir. |
| [AutoSelect](#AutoSelect) | Medyanın otomatik olarak seçileceğini belirtir. |
| [BackPrintFilm](#BackPrintFilm) | Özel arka baskı film medyasını belirtir. |
| [Bond](#Bond) | Standart bağ medyasını belirtir. |
| [CardStock](#CardStock) | Standart karton medyasını belirtir. |
| [Continous](#Continous) | Sürekli besleme medyasını belirtir. |
| [EnvelopePlain](#EnvelopePlain) | Standart zarf medyasını belirtir. |
| [EnvelopeWindow](#EnvelopeWindow) | Pencereli zarf medyasını belirtir. |
| [Fabric](#Fabric) | Kumaş medyasını belirtir. |
| [HighResolution](#HighResolution) | Özel yüksek çözünürlüklü medyayı belirtir. |
| [Label](#Label) | Etiket medyasını belirtir. |
| [MultiLayerForm](#MultiLayerForm) | Ekli çok parçalı form medyasını belirtir. |
| [MultiPartForm](#MultiPartForm) | Ayrı çok parçalı form medyasını belirtir. |
| [None](#None) | Bilinmeyen veya listelenmemiş medyayı belirtir. |
| [Photographic](#Photographic) | Standart fotoğraf medyasını belirtir. |
| [PhotographicFilm](#PhotographicFilm) | Film fotoğraf medyasını belirtir. |
| [PhotographicGlossy](#PhotographicGlossy) | Parlak fotoğraf medyasını belirtir. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Yüksek parlaklıkta fotoğraf medyasını belirtir. |
| [PhotographicMatte](#PhotographicMatte) | Mat fotoğraf medyasını belirtir. |
| [PhotographicSatin](#PhotographicSatin) | Saten fotoğraf medyasını belirtir. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Yarı parlak fotoğraf medyasını belirtir. |
| [Plain](#Plain) | Standart kağıt medyasını belirtir. |
| [Screen](#Screen) | Sürekli biçimde bir çıktı ekranına çıkışı belirtir. |
| [ScreenPaged](#ScreenPaged) | Sayfalı biçimde bir çıktı ekranına çıkışı belirtir. |
| [Stationary](#Stationary) | Özel kırtasiye medyasını belirtir. |
| [TShirtTransfer](#TShirtTransfer) | Özel tişört transfer medyasını belirtir. |
| [TabStockFull](#TabStockFull) | Önceden kesilmemiş (tek sekmeli) sekme stok medyasını belirtir. |
| [TabStockPreCut](#TabStockPreCut) | Önceden kesilmiş (çoklu sekmeli) sekme stok medyasını belirtir. |
| [Transparency](#Transparency) | Şeffaf medyayı belirtir. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Bu seçeneğin öğe listesine bir öğe listesi ekler. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Seçeneğe IPageMediaTypeOptionItem örneklerinden oluşan bir dizi ekler. |
| [clone()](#clone--) | Bu seçenek örneğini kopyalar. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Elemanın adını alır. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Weight puanlı özellik değerini ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Yeni bir örnek oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| optionName | java.lang.String | Bir seçenek adı. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | IPageMediaTypeOptionItem örneklerinden oluşan keyfi bir dizi. |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Bu seçenek örneğini kopyalar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Klonlanacak bir örnek. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Arşiv kalitesinde medyayı belirtir.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Medyanın otomatik olarak seçileceğini belirtir.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Özel arka baskı film medyasını belirtir.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Standart bağ medyasını belirtir.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Standart karton medyasını belirtir.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Sürekli besleme medyasını belirtir.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Standart zarf medyasını belirtir.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Pencereli zarf medyasını belirtir.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Kumaş medyasını belirtir.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Özel yüksek çözünürlüklü medyayı belirtir.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Etiket medyasını belirtir.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Ekli çok parçalı form medyasını belirtir.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Ayrı çok parçalı form medyasını belirtir.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Bilinmeyen veya listelenmemiş medyayı belirtir.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Standart fotoğraf medyasını belirtir.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Film fotoğraf medyasını belirtir.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Parlak fotoğraf medyasını belirtir.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Yüksek parlaklıkta fotoğraf medyasını belirtir.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Mat fotoğraf medyasını belirtir.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Saten fotoğraf medyasını belirtir.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Yarı parlak fotoğraf medyasını belirtir.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Standart kağıt medyasını belirtir.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Sürekli biçimde bir çıktı ekranına çıkışı belirtir.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Sayfalı biçimde bir çıktı ekranına çıkışı belirtir.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Özel kırtasiye medyasını belirtir.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Özel tişört transfer medyasını belirtir.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Önceden kesilmemiş (tek sekmeli) sekme stok medyasını belirtir.

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Önceden kesilmiş (çoklu sekmeli) sekme stok medyasını belirtir.

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Şeffaf medyayı belirtir.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Bu seçeneğin öğe listesine bir öğe listesi ekler. Her biri bir ScoredProperty veya bir Property örneği olmalıdır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Eklenecek öğelerin listesi. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Seçeneğe IPageMediaTypeOptionItem örneklerinden oluşan bir dizi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | IPageMediaTypeOptionItem örneklerinden oluşan keyfi bir dizi. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Bu seçenek örneğini klonlar. Klonlama yapıcısına kısayol.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


Weight puanlı özellik değerini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ağırlık | int | A  Weight  puanlanmış özellik değeri. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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

