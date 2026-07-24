---
title: "ImageSaveOptions"
second_title: "Java için Aspose.Page API Referansı"
description: "XPS-as-image kaydetme seçenekleri için temel sınıf."
type: docs
weight: 11
url: /tr/java/com.aspose.xps.rendering/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public abstract class ImageSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IPipelineOptions, IEventBasedModificationOptions
```

XPS-as-image kaydetme seçenekleri için temel sınıf.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Seçeneklerin yeni bir örneğini oluşturur |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini döndürür. |
| [getBatchSize()](#getBatchSize--) | Düğümden düğüme geçecek sayfaların bir bölümünün boyutunu döndürür. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Kaydedilmeden hemen önce bir XPS sayfasına yapılan değişiklikleri gerçekleştiren olay işleyicileri koleksiyonunu döndürür. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Non-TrueType fontların TTF olarak kaydedilmesinin gerekli olup olmadığını gösteren bayrağı alır. |
| [getExceptions()](#getExceptions--) | Kritik olmayan hataların bir listesini döndürür. |
| [getImageSize()](#getImageSize--) | Çıktı görüntülerinin boyutunu piksel olarak alır. |
| [getInterpolationMode()](#getInterpolationMode--) | Enterpolasyon modunu alır. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. |
| [getPageNumbers()](#getPageNumbers--) | Render edilecek sayfa sayılarını içeren diziyi alır. |
| [getResolution()](#getResolution--) | Görüntü çözünürlüğünü alır. |
| [getSize()](#getSize--) | Sayfa veya görüntünün boyutunu alır. |
| [getSmoothingMode()](#getSmoothingMode--) | Yumuşatma modunu alır. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Metin render ipucunu alır. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı alır. |
| [isSupressErrors()](#isSupressErrors--) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bir değeri döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini belirtir. |
| [setBatchSize(int value)](#setBatchSize-int-) | Düğümden düğüme geçecek sayfaların bir bölümünün boyutunu ayarlar. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Non-TrueType fontların TTF olarak kaydedilip kaydedilmeyeceğini belirtir. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı belirtir. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Çıktı görüntülerinin boyutunu piksel olarak ayarlar. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Enterpolasyon modunu ayarlar. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Render edilecek sayfa numaralarının dizisini ayarlar. |
| [setResolution(float value)](#setResolution-float-) | Görüntü çözünürlüğünü ayarlar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Sayfa veya görüntünün boyutunu belirtir. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Yumuşatma modunu ayarlar. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Metin renderleme ipucunu ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Seçeneklerin yeni bir örneğini oluşturur

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Düğümden düğüme geçecek sayfaların bir bölümünün boyutunu döndürür.

**Returns:**
int - Düğümden düğüme geçecek sayfa bölümünün boyutu.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Kaydedilmeden hemen önce bir XPS sayfasına yapılan değişiklikleri gerçekleştiren olay işleyicileri koleksiyonunu döndürür.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Çıktı görüntülerinin boyutunu piksel olarak alır.

**Returns:**
java.awt.Dimension - Çıktı görüntülerinin piksel cinsinden boyutu.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Enterpolasyon modunu alır.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Returns:**
int - Bir görüntünün sıkıştırma seviyesini belirten değer.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Render edilecek sayfa sayılarını içeren diziyi alır.

**Returns:**
int[] - Sayfa numaraları.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Görüntü çözünürlüğünü alır.

**Returns:**
float - Görüntü çözünürlüğü.
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Metin render ipucunu alır.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Düğümden düğüme geçecek sayfaların bir bölümünün boyutunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Düğümden düğüme geçecek sayfa bölümünün boyutu. |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Çıktı görüntülerinin boyutunu piksel olarak ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.awt.Dimension | Çıktı görüntülerinin piksel cinsinden boyutu. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Enterpolasyon modunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | Enterpolasyon modu. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Bir görüntünün sıkıştırma seviyesini belirten değer. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Render edilecek sayfa numaralarının dizisini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int[] | Sayfa numaraları. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Görüntü çözünürlüğünü ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Görüntü çözünürlüğü. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Sayfa veya görüntünün boyutunu belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Sayfa veya görüntünün boyutu. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Yumuşatma modunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Yumuşatma modu. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| supressErrors | boolean | Boolean değeri. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Metin renderleme ipucunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | Metin renderleme ipucu. |

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

