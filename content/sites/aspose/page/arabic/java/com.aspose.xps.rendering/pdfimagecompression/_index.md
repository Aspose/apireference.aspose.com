---
title: "PdfImageCompression"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يحدد نوع الضغط المطبق على الصور في ملف PDF."
type: docs
weight: 22
url: /ar/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

يحدد نوع الضغط المطبق على الصور في ملف PDF.
## الحقول

| حقل | الوصف |
| --- | --- |
| [Auto](#Auto) | يختار تلقائيًا أكثر ضغط ملائم لكل صورة. |
| [Flate](#Flate) | ضغط Flate. |
| [Jpeg](#Jpeg) | ضغط JPEG. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | اختيار المتنبئ مقيد بـ PNG Paeth لتسريع العملية. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | اختيار المتنبئ أكثر تعقيدًا ويجب أن ينتج أحجام صور أصغر لكنه يستغرق وقتًا أطول. |
| [None](#None) | يحفظ بايتات الصورة الخام مما يؤدي إلى أحجام ملفات PDF أكبر. |
| [Rle](#Rle) | ضغط Run Length. |
## الطرق

| طريقة | الوصف |
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


يختار تلقائيًا أكثر ضغط ملائم لكل صورة.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


ضغط Flate.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


ضغط JPEG. لا يدعم الشفافية.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


اختيار المتنبئ مقيد بـ PNG Paeth لتسريع العملية. في الواقع يؤدي بشكل مفاجئ جيد. أفضل من LzwOptimizedPredictor .

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


اختيار المتنبئ أكثر تعقيدًا ويجب أن ينتج أحجام صور أصغر لكنه يستغرق وقتًا أطول.

### None {#None}
```
public static final PdfImageCompression None
```


يحفظ بايتات الصورة الخام مما يؤدي إلى أحجام ملفات PDF أكبر.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


ضغط Run Length.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String |  |

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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

