---
title: "XpsConverter"
second_title: "Java için Aspose.Page API Referansı"
description: "XpsConverter eklentisini temsil eder."
type: docs
weight: 10
url: /tr/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

XpsConverter eklentisini temsil eder.

Bu örnek, XPS belgesini PDF belgesine nasıl dönüştüreceğinizi gösterir.

// XpsConverter oluştur XpsConverter converter = new XpsConverter(); // XpsConverterToPdfOptions nesnesi oluştur ve çıktı veri tipini dosya olarak ayarla XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // giriş dosya yolunu ekle opt.addDataSource(new FileDataSource(inputPath)); // çıktı dosya yolunu ayarla opt.addSaveDataSource(new FileDataSource(outputPath)); // dönüşüm sürecini başlat ResultContainer results = converter.process(opt);

Bu örnek, XPS belgesini dosya çıktısı ile görüntüye nasıl dönüştüreceğinizi gösterir.

// XpsConverter oluştur XpsConverter converter = new XpsConverter(); // JPEG hedef görüntü formatı ile XpsConverterToImageOptions oluştur. Oluşan görüntünün varsayılan formatı PNG'dir. // Ayrıca oluşan görüntünün boyutunu, çözünürlüğünü, yumuşatma modunu ve JPEG sonuç formatı için JPEG kalite seviyesini ayarlayabiliriz. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // giriş dosya yolunu ekle opt.addDataSource(new FileDataSource(inputPath)); // giriş XPS dosyası çok sayfalı ise sonuçlar şu adla bir dizi görüntü dosyası olur: [\"outputPath\" uzantısız][sayfaNumarası 0'dan başlar].[\"outputPath\" uzantısı] opt.addSaveDataSource(new FileDataSource(outputPath)); // dönüşüm sürecini başlat converter.process(opt);

Bu örnek, XPS belgesini bayt dizileri çıktısı ile görüntüye nasıl dönüştüreceğinizi gösterir.

Bayt dizileri çıktı veri kaynağında (byte [][]) bir bayt dizisi bir sayfanın görüntüsünü içerir. Böylece, tek sayfalı belgeler için sonuç [1][] dizisi, çok sayfalı belgeler için ise [giriş XPS belgesindeki sayfa sayısı][] dizisi içerir. // XpsConverter oluştur XpsConverter converter = new XpsConverter(); // JPEG hedef görüntü formatı ile XpsConverterToImageOptions oluştur. Oluşan görüntünün varsayılan formatı PNG'dir. // Ayrıca oluşan görüntünün boyutunu, çözünürlüğünü, yumuşatma modunu ve JPEG sonuç formatı için JPEG kalite seviyesini ayarlayabiliriz. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // giriş dosya yolunu ekle opt.addDataSource(new FileDataSource(inputPath)); // giriş XPS dosyası çok sayfalı ise sonuçlar şu adla bir dizi görüntü dosyası olur: [\"outputPath\" uzantısız][sayfaNumarası 1'den başlar].[\"outputPath\" uzantısı] opt.addSaveDataSource(new ByteArrayDataSource()); // dönüşüm sürecini başlat converter.process(opt); // oluşan bayt dizilerini al byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [dispose()](#dispose--) | IDisposable uygulaması. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Belirtilen parametrelerle XpsConverter işleme başlatır. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverter() {#XpsConverter--}
```
public XpsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


IDisposable uygulaması.

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




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


Belirtilen parametrelerle XpsConverter işleme başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | XpsConverter için talimatları içeren bir seçenek nesnesi. |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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

