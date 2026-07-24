---
title: "XpsConverterToPdfOptions"
second_title: "Java için Aspose.Page API Referansı"
description: "Eklenti için XPS'den PDF'ye dönüştürücü seçeneklerini temsil eder."
type: docs
weight: 13
url: /tr/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Eklenti için [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) XPS'den PDF'ye dönüştürücü seçeneklerini temsil eder.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) nesnesinin yeni bir örneğini başlatır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | XpsConverter eklentisi veri koleksiyonuna yeni bir veri kaynağı ekler. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | XpsConverterOptions eklentisi veri koleksiyonuna yeni bir veri kaynağı ekler. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | XpsConverterOptions eklentisi veri koleksiyonunu döndürür. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Bir görüntünün sıkıştırma seviyesini belirten değeri döndürür. |
| [getOperationName()](#getOperationName--) | İşlem adını döndürür. |
| [getPageNumbers()](#getPageNumbers--) | Dönüştürülecek XPS belgesindeki sayfa numaralarının dizisini alır. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Kaydetme işlem sonuçları için eklenen hedeflerin koleksiyonunu alır. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Dönüştürülecek XPS belgesindeki sayfa numaralarının dizisini ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


[XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) nesnesinin yeni bir örneğini başlatır.

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


XpsConverter eklentisi veri koleksiyonuna yeni bir veri kaynağı ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Eklenecek veri kaynağı. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


XpsConverterOptions eklentisi veri koleksiyonuna yeni bir veri kaynağı ekler.

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


XpsConverterOptions eklentisi veri koleksiyonunu döndürür.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Dönüştürülecek XPS belgesindeki sayfa numaralarının dizisini alır.

**Returns:**
int[] - XPS belgesindeki sayfa numaralarının bir dizisi.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Kaydetme işlem sonuçları için eklenen hedeflerin koleksiyonunu alır.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa, sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahiptir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Bir görüntünün sıkıştırma seviyesini belirten değer. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Dönüştürülecek XPS belgesindeki sayfa numaralarının dizisini ayarlar. Ayarlanmamışsa tüm sayfalar dönüştürülecektir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pageNumbers | int[] | XPS belgesindeki sayfa numaralarının bir dizisi. |

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

