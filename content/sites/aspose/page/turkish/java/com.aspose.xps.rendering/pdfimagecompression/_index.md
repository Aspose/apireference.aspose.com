---
title: "PdfImageCompression"
second_title: "Java için Aspose.Page API Referansı"
description: "PDF dosyasındaki görüntülere uygulanan sıkıştırma türünü belirtir."
type: docs
weight: 22
url: /tr/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

PDF dosyasındaki görüntülere uygulanan sıkıştırma türünü belirtir.
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [Auto](#Auto) | Her görüntü için en uygun sıkıştırmayı otomatik olarak seçer. |
| [Flate](#Flate) | Flate sıkıştırması. |
| [Jpeg](#Jpeg) | JPEG sıkıştırması. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | Tahminci seçimi, işlemi hızlandırmak için PNG Paeth tahmincisine sınırlıdır. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | Tahminci seçimi daha karmaşıktır ve daha küçük görüntü boyutlarıyla sonuçlanmalı, ancak daha fazla zaman alır. |
| [None](#None) | Ham görüntü baytlarını kaydeder, bu da daha büyük PDF dosya boyutlarına yol açar. |
| [Rle](#Rle) | Run Length sıkıştırması. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


Her görüntü için en uygun sıkıştırmayı otomatik olarak seçer.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate sıkıştırması.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG sıkıştırması. Şeffaflığı desteklemez.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


Tahminci seçimi, süreci hızlandırmak için PNG Paeth tahmincisine sınırlıdır. Pratikte şaşırtıcı derecede iyi çalışır. LzwOptimizedPredictor'dan daha iyidir.

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


Tahminci seçimi daha karmaşıktır ve daha küçük görüntü boyutlarıyla sonuçlanmalı, ancak daha fazla zaman alır.

### None {#None}
```
public static final PdfImageCompression None
```


Ham görüntü baytlarını kaydeder, bu da daha büyük PDF dosya boyutlarına yol açar.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Run Length sıkıştırması.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | java.lang.String |  |

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression)
### values() {#values--}
```
public static PdfImageCompression[] values()
```




**Returns:**
com.aspose.xps.rendering.PdfImageCompression[]
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

