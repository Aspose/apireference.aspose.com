---
title: "SaveOptions"
second_title: "Java için Aspose.Page API Referansı"
description: "Bu sınıf, dönüşüm sürecini yönetmek için gerekli seçenekleri içerir."
type: docs
weight: 16
url: /tr/java/com.aspose.page/saveoptions/
---
**Inheritance:**
java.lang.Object
```
public class SaveOptions
```

Bu sınıf, dönüşüm sürecini yönetmek için gerekli seçenekleri içerir.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [SaveOptions()](#SaveOptions--) | Yeni SaveOptions örneğini, suppressErrors (true) ve debug (false) bayrakları için varsayılan değerlerle başlat. |
| [SaveOptions(boolean supressErrors)](#SaveOptions-boolean-) | Yeni SaveOptions örneğini, debug (false) bayrağı için varsayılan değerle başlat. |
| [SaveOptions(Dimension size)](#SaveOptions-java.awt.Dimension-) | Belirtilen boyutla yeni SaveOptions örneğini başlatır. |
| [SaveOptions(boolean supressErrors, Dimension size)](#SaveOptions-boolean-java.awt.Dimension-) | Bayrak debug için varsayılan değer (false) ve belirtilen boyutla yeni SaveOptions örneğini başlat. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini döndürür. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Non-TrueType fontların TTF olarak kaydedilmesinin gerekli olup olmadığını gösteren bayrağı alır. |
| [getExceptions()](#getExceptions--) | Kritik olmayan hataların bir listesini döndürür. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. |
| [getSize()](#getSize--) | Sayfa veya görüntünün boyutunu alır. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı alır. |
| [isSupressErrors()](#isSupressErrors--) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bir değeri döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Dönüştürücünün girdi belgesi için fontları bulması gereken ek font klasörlerini belirtir. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Non-TrueType fontların TTF olarak kaydedilip kaydedilmeyeceğini belirtir. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Dönüşüm sırasında uyarı ve mesajların çıktısına izin veren bayrağı belirtir. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Sayfa veya görüntünün boyutunu belirtir. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Hataların dönüşüm sırasında bastırılıp bastırılmayacağını gösteren bayrağı belirtir. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### SaveOptions() {#SaveOptions--}
```
public SaveOptions()
```


Yeni SaveOptions örneğini, suppressErrors (true) ve debug (false) bayrakları için varsayılan değerlerle başlat.

### SaveOptions(boolean supressErrors) {#SaveOptions-boolean-}
```
public SaveOptions(boolean supressErrors)
```


Yeni SaveOptions örneğini, debug (false) bayrağı için varsayılan değerle başlat.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| supressErrors | boolean | Doğru ise, dönüşüm kritik olmayan hatalara rağmen devam edecektir. |

### SaveOptions(Dimension size) {#SaveOptions-java.awt.Dimension-}
```
public SaveOptions(Dimension size)
```


Belirtilen boyutla yeni SaveOptions örneğini başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension | Boyut. |

### SaveOptions(boolean supressErrors, Dimension size) {#SaveOptions-boolean-java.awt.Dimension-}
```
public SaveOptions(boolean supressErrors, Dimension size)
```


Bayrak debug için varsayılan değer (false) ve belirtilen boyutla yeni SaveOptions örneğini başlat.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| supressErrors | boolean | Doğru ise, dönüşüm kritik olmayan hatalara rağmen devam edecektir. |
| size | java.awt.Dimension | Boyut. |

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
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Returns:**
int - Bir görüntünün sıkıştırma seviyesini belirten değer.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Sayfa veya görüntünün boyutunu alır.

**Returns:**
java.awt.Dimension - Sayfa veya görüntünün bir boyutu.
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

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Bir görüntünün sıkıştırma seviyesini belirten değer. |

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

