---
title: "XpsPathFigure"
second_title: "Java için Aspose.Page API Referansı"
description: "PathFigure öğesi özelliklerini kapsayan sınıf."
type: docs
weight: 41
url: /tr/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

PathFigure öğesi özelliklerini kapsayan sınıf. Bu öğe bir veya daha fazla çizgi ya da eğri segmentinden oluşur.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [add(T obj)](#add-T-) | Diziye yeni bir nesne ekler. |
| [deepClone()](#deepClone--) | Bu yol figürünü kopyalar. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Dizinin elemanına indeks i ile erişim sağlar. |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Alt yol segmentlerinin listesini döndürür. |
| [getStartPoint()](#getStartPoint--) | Yol şeklinin ilk segmenti için başlangıç noktasını döndürür. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Belirtilen konuma yeni bir nesneyi diziye ekler. |
| [isClosed()](#isClosed--) | Yol şeklinin kapalı olup olmadığını gösteren değeri döndürür. |
| [isFilled()](#isFilled--) | Yol şeklinin, içinde bulunduğu yol geometrisinin alanını hesaplarken kullanılıp kullanılmadığını gösteren değeri döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Diziden bir nesneyi kaldırır. |
| [removeAt(int index)](#removeAt-int-) | Belirtilen konumda diziden bir nesneyi kaldırır. |
| [setClosed(boolean value)](#setClosed-boolean-) | Yol şeklinin kapalı olup olmadığını gösteren değeri ayarlar. |
| [setFilled(boolean value)](#setFilled-boolean-) | Yol şeklinin, içinde bulunduğu yol geometrisinin alanını hesaplarken kullanılıp kullanılmadığını gösteren değeri ayarlar. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Yol şeklinin ilk segmenti için başlangıç noktasını ayarlar. |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Bu yol figürünü kopyalar.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Alt yol segmentlerinin listesini döndürür.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - Alt yol segmentlerinin listesi.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Yol şeklinin ilk segmenti için başlangıç noktasını döndürür.

**Returns:**
java.awt.geom.Point2D - Yol şeklinin ilk segmenti için başlangıç noktası.
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Yol şeklinin kapalı olup olmadığını gösteren değeri döndürür.

**Returns:**
boolean - Yol şeklinin kapalı olup olmadığını gösteren değer.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Yol şeklinin, içinde bulunduğu yol geometrisinin alanını hesaplarken kullanılıp kullanılmadığını gösteren değeri döndürür.

**Returns:**
boolean - Yol şeklinin, içinde bulunduğu yol geometrisinin alanını hesaplarken kullanılıp kullanılmadığını gösteren değer.
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Yol şeklinin kapalı olup olmadığını gösteren değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | boolean | Yol şeklinin kapalı olup olmadığını gösteren değer. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Yol şeklinin, içinde bulunduğu yol geometrisinin alanını hesaplarken kullanılıp kullanılmadığını gösteren değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | boolean | Yol şeklinin, içinde bulunduğu yol geometrisinin alanını hesaplarken kullanılıp kullanılmadığını gösteren değer. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Yol şeklinin ilk segmenti için başlangıç noktasını ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.awt.geom.Point2D | Yol figürünün ilk segmenti için başlangıç noktası. |

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

