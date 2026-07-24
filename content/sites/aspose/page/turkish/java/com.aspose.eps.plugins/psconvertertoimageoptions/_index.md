---
title: "PsConverterToImageOptions"
second_title: "Java için Aspose.Page API Referansı"
description: "Eklenti için PS/EPS'den Görüntüye dönüştürücü seçeneklerini temsil eder."
type: docs
weight: 12
url: /tr/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

PS/EPS'den Görüntü dönüştürücüsü seçeneklerini [PsConverter](../../com.aspose.eps.plugins/psconverter) eklentisi için temsil eder.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) nesnesinin yeni bir örneğini başlatır. |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) nesnesinin yeni bir örneğini görüntü formatı ile başlatır. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) nesnesinin yeni bir örneğini oluşan görüntünün boyutu ile başlatır. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) nesnesinin yeni bir örneğini görüntü formatı ile başlatır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | PsConverter eklentisi veri koleksiyonuna yeni bir veri kaynağı ekler. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | PsConverterOptions eklentisi veri koleksiyonuna yeni bir veri kaynağı ekler. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini döndürür. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | PsConverterOptions eklentisi veri koleksiyonunu döndürür. |
| [getExceptions()](#getExceptions--) | Kritik olmayan hataların bir listesini döndürür. |
| [getImageFormat()](#getImageFormat--) | Görüntü formatını alır. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. |
| [getOperationName()](#getOperationName--) | İşlem adını döndürür. |
| [getResolution()](#getResolution--) | Görüntü çözünürlüğünü alır. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Kaydetme işlem sonuçları için eklenen hedeflerin koleksiyonunu alır. |
| [getSize()](#getSize--) | Sonuç görüntüsünün boyutunu alır. |
| [getSmoothingMode()](#getSmoothingMode--) | Görüntü oluşturma için yumuşatma modunu alır. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı alır. |
| [isSupressErrors()](#isSupressErrors--) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bir değeri döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini belirtir. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı belirtir. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Görüntü formatını alır. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. |
| [setResolution(int resolution)](#setResolution-int-) | Görüntü çözünürlüğünü ayarlar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Sonuç görüntüsünün boyutunu ayarlar. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Görüntü oluşturma için yumuşatma modunu ayarlar. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


[PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) nesnesinin yeni bir örneğini başlatır.

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


[PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) nesnesinin yeni bir örneğini görüntü formatı ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Oluşan görüntünün bir formatı. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


[PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) nesnesinin yeni bir örneğini oluşan görüntünün boyutu ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Oluşan görüntünün bir boyutu. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


[PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) nesnesinin yeni bir örneğini görüntü formatı ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Oluşan görüntünün bir formatı. |
| size | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


PsConverter eklentisi veri koleksiyonuna yeni bir veri kaynağı ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Eklenecek veri kaynağı. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


PsConverterOptions eklentisi veri koleksiyonuna yeni bir veri kaynağı ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Kaydetme işlemi sonuçları için veri kaynağı (dosya veya akış). |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini döndürür. Varsayılan klasör, işletim sisteminin iç ihtiyaçları için fontları bulduğu standart font klasörüdür.

**Returns:**
java.lang.String[] - Font klasörlerinin bir dizisi.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


PsConverterOptions eklentisi veri koleksiyonunu döndürür.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Kritik olmayan hataların bir listesini döndürür.

**Returns:**
java.util.List<java.lang.Exception> - İstisna listesi
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Görüntü formatını alır.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Returns:**
int - Bir görüntünün sıkıştırma seviyesini belirten değer.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


İşlem adını döndürür.

**Returns:**
java.lang.String
### getResolution() {#getResolution--}
```
public int getResolution()
```


Görüntü çözünürlüğünü alır.

**Returns:**
int - Bir görüntü çözünürlüğü.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Kaydetme işlem sonuçları için eklenen hedeflerin koleksiyonunu alır.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Sonuç görüntüsünün boyutunu alır.

**Returns:**
java.awt.Dimension - Bir görüntü boyutu.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Görüntü oluşturma için yumuşatma modunu alır.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı alır.

**Returns:**
boolean - debug değeri.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bir değeri döndürür.

**Returns:**
boolean - boolean değeri
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini belirtir. Varsayılan klasör, işletim sisteminin iç ihtiyaçları için fontları bulduğu standart font klasörüdür.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Font klasörlerinin bir dizisi. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| hata ayıklama | boolean | Boolean değeri. |

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Görüntü formatını alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Oluşan görüntünün bir formatı. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Bir görüntünün sıkıştırma seviyesini belirten değer. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Görüntü çözünürlüğünü ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| resolution | int | Ortaya çıkan görüntünün çözünürlüğü. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Sonuç görüntüsünün boyutunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Ortaya çıkan görüntünün boyutu. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Görüntü oluşturma için yumuşatma modunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Yumuşatma modu. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| supressErrors | boolean | Boolean değeri. |

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

