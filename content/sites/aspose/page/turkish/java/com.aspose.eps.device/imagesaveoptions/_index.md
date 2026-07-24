---
title: "ImageSaveOptions"
second_title: "Java için Aspose.Page API Referansı"
description: "Bu sınıf, dönüşüm sürecini yönetmek için gerekli seçenekleri içerir."
type: docs
weight: 10
url: /tr/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Bu sınıf, dönüşüm sürecini yönetmek için gerekli seçenekleri içerir.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | ImageSaveOptions sınıfının yeni bir örneğini, suppressErrors (true) ve debug (false) bayrakları için varsayılan değerlerle başlat. |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü formatı ile başlatır. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü boyutu ile başlatır. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü boyutu ve görüntü formatı ile başlatır. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü formatı ve suppressErrors bayrağı ile başlatır. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü boyutu ve suppressErrors bayrağı ile başlatır. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü boyutu, görüntü formatı ve suppressErrors bayrağı ile başlatır. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | ImageSaveOptions sınıfının yeni bir örneğini, debug (false) bayrağı için varsayılan değerlerle başlat. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini döndürür. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Non-TrueType fontların TTF olarak kaydedilmesinin gerekli olup olmadığını gösteren bayrağı alır. |
| [getExceptions()](#getExceptions--) | Kritik olmayan hataların bir listesini döndürür. |
| [getImageFormat()](#getImageFormat--) | Sonuç görüntüsü için bir görüntü formatı alır. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. |
| [getResolution()](#getResolution--) | Sonuç görüntüsünün çözünürlüğünü döndürür. |
| [getSize()](#getSize--) | Sayfa veya görüntünün boyutunu alır. |
| [getSmoothingMode()](#getSmoothingMode--) | Yumuşatma modunu alır. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Kütüphanenin görüntü parçalarını birleştirmeye çalışıp çalışmayacağını gösterir. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı alır. |
| [isSupressErrors()](#isSupressErrors--) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bir değeri döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini belirtir. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Non-TrueType fontların TTF olarak kaydedilip kaydedilmeyeceğini belirtir. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı belirtir. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Sonuç görüntüsü için bir görüntü formatı belirtir. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. |
| [setResolution(float resolution)](#setResolution-float-) | Sonuç görüntüsünün çözünürlüğünü belirtir. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Sayfa veya görüntünün boyutunu belirtir. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Yumuşatma modunu ayarlar. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Kütüphanenin görüntü parçalarını birleştirmeye çalışıp çalışmayacağını belirtir. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


ImageSaveOptions sınıfının yeni bir örneğini, suppressErrors (true) ve debug (false) bayrakları için varsayılan değerlerle başlat.

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü formatı ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Görüntünün formatı. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü boyutu ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Görüntü boyutu. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü boyutu ve görüntü formatı ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Görüntü boyutu. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Görüntünün formatı. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü formatı ve suppressErrors bayrağı ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Görüntünün formatı. |
| supressErrors | boolean | Doğru ise, dönüşüm kritik olmayan hatalara rağmen devam edecektir. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü boyutu ve suppressErrors bayrağı ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Görüntü boyutu. |
| supressErrors | boolean | Doğru ise, dönüşüm kritik olmayan hatalara rağmen devam edecektir. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


ImageSaveOptions sınıfının yeni bir örneğini belirtilen görüntü boyutu, görüntü formatı ve suppressErrors bayrağı ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Görüntü boyutu. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Görüntünün formatı. |
| supressErrors | boolean | Doğru ise, dönüşüm kritik olmayan hatalara rağmen devam edecektir. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


ImageSaveOptions sınıfının yeni bir örneğini, debug (false) bayrağı için varsayılan değerlerle başlat.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| supressErrors | boolean | Doğru ise, dönüşüm kritik olmayan hatalara rağmen devam edecektir. |

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
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Non-TrueType fontların TTF olarak kaydedilmesinin gerekli olup olmadığını gösteren bayrağı alır.

**Returns:**
boolean - Bayrak değeri.
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


Sonuç görüntüsü için bir görüntü formatı alır.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Returns:**
int - Bir görüntünün sıkıştırma seviyesini belirten değer.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Sonuç görüntüsünün çözünürlüğünü döndürür.

**Returns:**
float - Görüntünün çözünürlüğü.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Sayfa veya görüntünün boyutunu alır.

**Returns:**
java.awt.Dimension - Sayfa veya görüntünün bir boyutu.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Yumuşatma modunu alır.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Kütüphanenin görüntü parçacıklarını birleştirmeye çalışıp çalışmayacağını gösterir. Bu, kaynak bir PS/EPS dosyasındaki görüntü parçacıklara bölündüğünde kullanılır. Bu durumda bu bayrak olmadan parçacıklar arasında ince boşluklar kalır.

**Returns:**
boolean - bayrağın değeri.
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

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Non-TrueType fontların TTF olarak kaydedilip kaydedilmeyeceğini belirtir. Bu, PS'den PDF'ye dönüşümde ortaya çıkan belgenin boyutunu önemli ölçüde azaltır ve non-TrueType fontlarda büyük miktarda metin içeren PS dosyalarının herhangi bir çıktı formatına dönüşüm hızını artırır. Ancak PostSctipt dosyasını görüntüye dönüştürürken metinde küçük bir dikey kayma olur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | boolean | Bayrak değeri. |

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


Sonuç görüntüsü için bir görüntü formatı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Bir çıktı görüntü formatı. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Bir görüntünün sıkıştırma seviyesini belirten değer. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Sonuç görüntüsünün çözünürlüğünü belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| resolution | float | Görüntünün çözünürlüğü. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Sayfa veya görüntünün boyutunu belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Sayfa veya görüntünün boyutu. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Yumuşatma modunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | ayar için smoothingMode |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| supressErrors | boolean | Boolean değeri. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Kütüphanenin görüntü parçacıklarını birleştirmeye çalışıp çalışmayacağını belirtir. Bu, kaynak bir PS/EPS dosyasındaki görüntü parçacıklara bölündüğünde kullanılır. Bu durumda bu bayrak olmadan parçacıklar arasında ince boşluklar kalır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tryJoinImageFragments | boolean | bayrağın değeri. |

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

