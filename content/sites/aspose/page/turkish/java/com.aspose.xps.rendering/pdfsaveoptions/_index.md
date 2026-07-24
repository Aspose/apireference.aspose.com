---
title: "PdfSaveOptions"
second_title: "Java için Aspose.Page API Referansı"
description: "XPS-as-PDF kaydetme seçenekleri için sınıf."
type: docs
weight: 14
url: /tr/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

XPS-as-PDF kaydetme seçenekleri için sınıf.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Seçeneklerin yeni bir örneğini oluşturur. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini döndürür. |
| [getBatchSize()](#getBatchSize--) | Düğümden düğüme geçecek sayfaların bir bölümünün boyutunu döndürür. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Kaydedilmeden hemen önce bir XPS sayfasına yapılan değişiklikleri gerçekleştiren olay işleyicileri koleksiyonunu döndürür. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Non-TrueType fontların TTF olarak kaydedilmesinin gerekli olup olmadığını gösteren bayrağı alır. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Şifreleme ayrıntılarını döndürür. |
| [getExceptions()](#getExceptions--) | Kritik olmayan hataların bir listesini döndürür. |
| [getImageCompression()](#getImageCompression--) | Belgedeki tüm görüntüler için kullanılacak sıkıştırma tipini döndürür. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | PDF dosyası bir görüntüleyicide açıldığında belge taslağının hangi seviyeye kadar genişletileceğini alır. 1 - yalnızca birinci seviye taslak öğeleri gösterilir, 2 - birinci ve ikinci seviye taslak öğeleri gösterilir, vb. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Kaydedilecek belge taslak ağacının yüksekliğini alır. 0 - taslak ağacı dönüştürülmez, 1 - yalnızca birinci seviye taslak öğeleri dönüştürülür, vb. |
| [getPageNumbers()](#getPageNumbers--) | Render edilecek sayfa sayılarını içeren diziyi alır. |
| [getSize()](#getSize--) | Sayfa veya görüntünün boyutunu alır. |
| [getTextCompression()](#getTextCompression--) | Görseller dışındaki tüm içerik akışları için kullanılacak sıkıştırma tipini döndürür. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı alır. |
| [isSupressErrors()](#isSupressErrors--) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bir değeri döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | XPS'te, bazı metin öğeleri, yazı tipindeki herhangi bir karakter koduna karşılık gelmeyen alternatif glif formlarına referanslar içerebilir. |
| [preserveText(boolean value)](#preserveText-boolean-) | XPS'te, bazı metin öğeleri, yazı tipindeki herhangi bir karakter koduna karşılık gelmeyen alternatif glif formlarına referanslar içerebilir. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini belirtir. |
| [setBatchSize(int value)](#setBatchSize-int-) | Düğümden düğüme geçecek sayfaların bir bölümünün boyutunu ayarlar. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Non-TrueType fontların TTF olarak kaydedilip kaydedilmeyeceğini belirtir. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı belirtir. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Şifreleme ayrıntılarını ayarlar. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Belgedeki tüm görüntüler için kullanılacak sıkıştırma türünü ayarlar. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | PDF dosyası bir görüntüleyicide açıldığında belge taslağının hangi seviyeye kadar genişletileceğini ayarlar. 1 - yalnızca birinci seviye taslak öğeleri gösterilir, 2 - yalnızca birinci ve ikinci seviye taslak öğeleri gösterilir, vb. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Kaydedilecek belge taslak ağacının yüksekliğini ayarlar. 0 - taslak ağacı dönüştürülmez, 1 - yalnızca birinci seviye taslak öğeleri dönüştürülür, vb. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Render edilecek sayfa numaralarının dizisini ayarlar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Sayfa veya görüntünün boyutunu belirtir. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Görüntüler dışındaki tüm içerik akışları için kullanılacak sıkıştırma türünü ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Seçeneklerin yeni bir örneğini oluşturur.

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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - Bir XPS sayfası kaydedilmeden hemen önce sayfada değişiklik yapan olay işleyicileri koleksiyonu.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Şifreleme ayrıntılarını döndürür. Ayarlanmamışsa, şifreleme yapılmaz.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Kritik olmayan hataların bir listesini döndürür.

**Returns:**
java.util.List<java.lang.Exception> - İstisna listesi
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Belgedeki tüm görüntüler için kullanılacak sıkıştırma türünü döndürür. Varsayılan PdfImageCompression.Auto'dur.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Returns:**
int - Bir görüntünün sıkıştırma seviyesini belirten değer.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


PDF dosyası bir görüntüleyicide açıldığında belge taslağının hangi seviyeye kadar genişletileceğini alır. 1 - yalnızca birinci seviye taslak öğeleri gösterilir, 2 - birinci ve ikinci seviye taslak öğeleri gösterilir, vb.

**Returns:**
int - Taslak ağacı genişletme seviyesi.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Kaydedilecek belge taslak ağacının yüksekliğini alır. 0 - taslak ağacı dönüştürülmez, 1 - yalnızca birinci seviye taslak öğeleri dönüştürülür, vb. Varsayılan 10'dur.

**Returns:**
int - Taslak ağacı yüksekliği.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Render edilecek sayfa sayılarını içeren diziyi alır.

**Returns:**
int[] - Sayfa numaraları.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Sayfa veya görüntünün boyutunu alır.

**Returns:**
java.awt.Dimension - Sayfa veya görüntünün bir boyutu.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Görüntüler dışındaki tüm içerik akışları için kullanılacak sıkıştırma türünü döndürür. Varsayılan PdfTextCompression.Flate'dir.

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


XPS'de, bazı metin öğeleri, yazı tipindeki herhangi bir karakter koduna karşılık gelmeyen alternatif glif formlarına referanslar içerebilir. Bu bayrak true olarak ayarlanırsa, bu tür XPS öğelerindeki metin grafik şekillerine dönüştürülür. Ardından metin kendisi üstte şeffaf görünür. Bu, bu öğelerin metninin seçilebilir kalmasını sağlar. Ancak yan etkisi, çıktı dosyasının orijinalden çok daha büyük olabilmesidir. Bayrak false olarak ayarlanırsa, alternatif formlarda gösterilmesi gereken karakterler, alternatif glif formlarına eşlenebilen başka karakterlerle değiştirilir. Böylece metin hâlâ seçilebilir olsa da değiştirilir ve muhtemelen okunamaz hâle gelir.

**Returns:**
boolean - Bayrak değeri.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


XPS'de, bazı metin öğeleri, yazı tipindeki herhangi bir karakter koduna karşılık gelmeyen alternatif glif formlarına referanslar içerebilir. Bu bayrak true olarak ayarlanırsa, bu tür XPS öğelerindeki metin grafik şekillerine dönüştürülür. Ardından metin kendisi üstte şeffaf görünür. Bu, bu öğelerin metninin seçilebilir kalmasını sağlar. Ancak yan etkisi, çıktı dosyasının orijinalden çok daha büyük olabilmesidir. Bayrak false olarak ayarlanırsa, alternatif formlarda gösterilmesi gereken karakterler, alternatif glif formlarına eşlenebilen başka karakterlerle değiştirilir. Böylece metin hâlâ seçilebilir olsa da değiştirilir ve muhtemelen okunamaz hâle gelir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | boolean | Bayrak değeri. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Şifreleme ayrıntılarını ayarlar. Ayarlanmamışsa, şifreleme yapılmaz.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | Şifreleme ayrıntıları. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Belgedeki tüm görüntüler için kullanılacak sıkıştırma türünü ayarlar. Varsayılan PdfImageCompression.Auto'dur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Sıkıştırma türü. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Bir görüntünün sıkıştırma seviyesini belirten değer. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


PDF dosyası bir görüntüleyicide açıldığında belge taslağının hangi seviyeye kadar genişletileceğini ayarlar. 1 - yalnızca birinci seviye taslak öğeleri gösterilir, 2 - yalnızca birinci ve ikinci seviye taslak öğeleri gösterilir, vb.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Taslak ağacı genişletme seviyesi. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Kaydedilecek belge taslak ağacının yüksekliğini ayarlar. 0 - taslak ağacı dönüştürülmez, 1 - yalnızca birinci seviye taslak öğeleri dönüştürülür, vb.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Taslak ağacı yüksekliği. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Render edilecek sayfa numaralarının dizisini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int[] | Sayfa numaraları. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Sayfa veya görüntünün boyutunu belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Sayfa veya görüntünün boyutu. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| supressErrors | boolean | Boolean değeri. |

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Görüntüler dışındaki tüm içerik akışları için kullanılacak sıkıştırma türünü ayarlar. Varsayılan PdfTextCompression.Flate'dir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Sıkıştırma türü. |

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

