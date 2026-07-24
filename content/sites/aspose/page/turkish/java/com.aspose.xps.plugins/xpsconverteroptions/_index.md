---
title: "XpsConverterOptions"
second_title: "Java için Aspose.Page API Referansı"
description: "Eklenti için seçeneklerin temel sınıfını temsil eder."
type: docs
weight: 11
url: /tr/java/com.aspose.xps.plugins/xpsconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class XpsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

Eklenti için [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) seçeneklerinin temel sınıfını temsil eder.
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
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Kaydetme işlem sonuçları için eklenen hedeflerin koleksiyonunu alır. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Bir görüntünün sıkıştırma seviyesini belirten değeri ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
public String getOperationName()
```


İşlem adını döndürür.

**Returns:**
java.lang.String
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

