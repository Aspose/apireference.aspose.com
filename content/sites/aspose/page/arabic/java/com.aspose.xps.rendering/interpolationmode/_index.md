---
title: "InterpolationMode"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يحدد الخوارزمية المستخدمة عند تحجيم أو تدوير الصور."
type: docs
weight: 20
url: /ar/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

يحدد الخوارزمية المستخدمة عند تحجيم أو تدوير الصور.
## الحقول

| حقل | الوصف |
| --- | --- |
| [Bicubic](#Bicubic) | يحدد الاستيفاء الثنائي المكعب. |
| [Bilinear](#Bilinear) | يحدد الاستيفاء الثنائي الخطي. |
| [Default](#Default) | يحدد الوضع الافتراضي. |
| [High](#High) | يحدد الاستيفاء عالي الجودة. |
| [HighQualityBicubic](#HighQualityBicubic) | يحدد استيفاء عالي الجودة، ثنائي مكعب. |
| [HighQualityBilinear](#HighQualityBilinear) | يحدد استيفاء عالي الجودة، ثنائي خطي. |
| [Low](#Low) | يحدد الاستيفاء منخفض الجودة. |
| [NearestNeighbor](#NearestNeighbor) | يحدد استيفاء أقرب جار. |
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
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


يحدد الاستيفاء الثنائي المكعب. لا يتم إجراء أي تصفية مسبقة. هذا الوضع غير مناسب لتصغير الصورة إلى أقل من 25٪ من حجمها الأصلي.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


يحدد الاستيفاء الثنائي الخطي. لا يتم إجراء أي تصفية مسبقة. هذا الوضع غير مناسب لتصغير الصورة إلى أقل من 50٪ من حجمها الأصلي.

### Default {#Default}
```
public static final InterpolationMode Default
```


يحدد الوضع الافتراضي.

### High {#High}
```
public static final InterpolationMode High
```


يحدد الاستيفاء عالي الجودة.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


يحدد استيفاء عالي الجودة، ثنائي مكعب. يتم إجراء تصفية مسبقة لضمان تصغير عالي الجودة. هذا الوضع ينتج أعلى جودة للصور المحوّلة.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


يحدد استيفاء عالي الجودة، ثنائي خطي. يتم إجراء تصفية مسبقة لضمان تصغير عالي الجودة.

### Low {#Low}
```
public static final InterpolationMode Low
```


يحدد الاستيفاء منخفض الجودة.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


يحدد استيفاء أقرب جار.

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
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String |  |

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode)
### values() {#values--}
```
public static InterpolationMode[] values()
```




**Returns:**
com.aspose.xps.rendering.InterpolationMode[]
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

