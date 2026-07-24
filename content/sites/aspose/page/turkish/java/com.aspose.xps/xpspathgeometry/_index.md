---
title: "XpsPathGeometry"
second_title: "Java için Aspose.Page API Referansı"
description: "PathGeometry özellik öğesi özelliklerini kapsayan sınıf."
type: docs
weight: 42
url: /tr/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

PathGeometry özellik öğesi özelliklerini kapsayan sınıf. Bu öğe, Figures özniteliğiyle ya da bir alt PathFigure öğesiyle belirtilen bir dizi yol figürü içerir.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [add(T obj)](#add-T-) | Diziye yeni bir nesne ekler. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Son yol figürünün alt segmentler listesine bir yol segmenti ekler. |
| [deepClone()](#deepClone--) | Bu yol geometrisini klonlar. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Dizinin elemanına indeks i ile erişim sağlar. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Geometrik şekillerin kesişen alanlarının bir bölge oluşturmak için nasıl birleştirileceğini belirten değeri döndürür. |
| [getPathFigures()](#getPathFigures--) | Alt yol şekillerinin listesini döndürür. |
| [getTransform()](#getTransform--) | Dolgu, kırpma veya kenarlama için kullanılmadan önce yol geometrisinin tüm alt ve türemiş öğelerine uygulanan yerel matris dönüşümünü belirleyen afin dönüşüm matrisini döndürür. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Belirtilen konuma yeni bir nesneyi diziye ekler. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Son yol şeklinin alt segmentler listesine  index  konumunda bir yol segmenti ekler. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Diziden bir nesneyi kaldırır. |
| [removeAt(int index)](#removeAt-int-) | Belirtilen konumda diziden bir nesneyi kaldırır. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Son yol figürünün alt segmentler listesinden bir yol segmentini kaldırır. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Son yol şeklinin alt segmentler listesinden  index  konumunda bir yol segmentini kaldırır. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Geometrik şekillerin kesişen alanlarının bir bölge oluşturmak için nasıl birleştirileceğini belirten değeri ayarlar. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Dolgu, kırpma veya kenarlama için kullanılmadan önce yol geometrisinin tüm alt ve türemiş öğelerine uygulanan yerel matris dönüşümünü belirleyen afin dönüşüm matrisini ayarlar. |
| [size()](#size--) | Öğe sayısını döndürür. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Diziye yeni bir nesne ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T | Eklenecek nesne. |

**Returns:**
T - Eklenen nesne.
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Son yol figürünün alt segmentler listesine bir yol segmenti ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Eklenecek yol segmenti. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Bu yol geometrisini klonlar.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### get(int i) {#get-int-}
```
public T get(int i)
```


Dizinin elemanına indeks i ile erişim sağlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| i | int | Öğenin indeksi. |

**Returns:**
T - i konumundaki eleman.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Geometrik şekillerin kesişen alanlarının bir bölge oluşturmak için nasıl birleştirileceğini belirten değeri döndürür.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Alt yol şekillerinin listesini döndürür.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - Alt yol şekillerinin listesi.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Dolgu, kırpma veya kenarlama için kullanılmadan önce yol geometrisinin tüm alt ve türemiş öğelerine uygulanan yerel matris dönüşümünü belirleyen afin dönüşüm matrisini döndürür.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Belirtilen konuma yeni bir nesneyi diziye ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Nesnenin ekleneceği konum. |
| obj | T | Eklenecek nesne. |

**Returns:**
T - Ekleilen nesne.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Son yol şeklinin alt segmentler listesine  index  konumunda bir yol segmenti ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Segmentin eklenmesi gereken konum. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Eklenecek bir yol segmenti. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Diziden bir nesneyi kaldırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T | Kaldırılacak nesne. |

**Returns:**
T - Kaldırılan nesne.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Belirtilen konumda diziden bir nesneyi kaldırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Nesnenin kaldırılacağı konum. |

**Returns:**
T - Kaldırılan nesne.
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Son yol figürünün alt segmentler listesinden bir yol segmentini kaldırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Kaldırılacak yol segmenti. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Son yol şeklinin alt segmentler listesinden  index  konumunda bir yol segmentini kaldırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Bir yol segmentinin kaldırılması gereken konum. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Geometrik şekillerin kesişen alanlarının bir bölge oluşturmak için nasıl birleştirileceğini belirten değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | Geometrik şekillerin kesişen alanlarının bir bölge oluşturmak için nasıl birleştirileceğini belirten değer. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Dolgu, kırpma veya kenarlama için kullanılmadan önce yol geometrisinin tüm alt ve türemiş öğelerine uygulanan yerel matris dönüşümünü belirleyen afin dönüşüm matrisini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Afin dönüşüm matrisi. |

### size() {#size--}
```
public int size()
```


Öğe sayısını döndürür.

**Returns:**
int - Eleman sayısı.
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

