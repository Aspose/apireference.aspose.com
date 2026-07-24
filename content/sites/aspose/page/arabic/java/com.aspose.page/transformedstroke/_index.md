---
title: "TransformedStroke"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "خط يحتوي على تحويل."
type: docs
weight: 17
url: /ar/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

خط يحتوي على تحويل.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | ينشئ TransformedStroke بناءً على Stroke آخر و AffineTransform. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | يرسم الشكل المعطى باستخدام هذا الخط، مكوّنًا مخططًا. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | يحصل على الخط الأساسي. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | يحصل على تحويل. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


ينشئ TransformedStroke بناءً على Stroke آخر و AffineTransform.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القاعدة | java.awt.Stroke | قاعدة الخط. |
| في | java.awt.geom.AffineTransform | التحويل المتجانس. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


يرسم الشكل المعطى باستخدام هذا الخط، مكوّنًا مخططًا. يتم تشويه هذا المخطط بواسطة AffineTransform الخاص بنا مقارنةً بالمخطط الذي كان سيُعطى بواسطة الخط الأساسي، ولكن فقط من حيث التحجيم (أي سمك الخطوط)، حيث يتم إلغاء الترجمة والدوران بعد عملية الرسم.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| s | java.awt.Shape | كـ Shape لتخطيطه. |

**Returns:**
java.awt.Shape - مخطط الشكل.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


يحصل على الخط الأساسي.

**Returns:**
java.awt.Stroke - الخط الأساسي.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


يحصل على تحويل.

**Returns:**
java.awt.geom.AffineTransform - تحويل.
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

