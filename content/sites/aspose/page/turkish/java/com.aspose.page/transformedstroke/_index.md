---
title: "TransformedStroke"
second_title: "Java için Aspose.Page API Referansı"
description: "Dönüşüm içeren bir çizgi."
type: docs
weight: 17
url: /tr/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Dönüşüm içeren bir çizgi.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Başka bir Stroke ve bir AffineTransform üzerine dayalı bir TransformedStroke oluşturur. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Verilen Shape'i bu stroke ile çizer, bir kontur oluşturur. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Temel stroke'ı alır. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Bir dönüşüm alır. |
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


Başka bir Stroke ve bir AffineTransform üzerine dayalı bir TransformedStroke oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| taban | java.awt.Stroke | Stroke tabanı. |
| de | java.awt.geom.AffineTransform | Affine dönüşüm. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Verilen Shape'i bu stroke ile çizer, bir kontur oluşturur. Bu kontur, base stroke tarafından verilecek kontura göre, yalnızca ölçekleme (yani çizgi kalınlığı) açısından, AffineTransform tarafından bozulur; çünkü çeviri ve döndürme, çizmeyi takiben geri alınır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | java.awt.Shape | Kontur oluşturulacak shape olarak. |

**Returns:**
java.awt.Shape - Şeklin bir konturu.
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
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Temel stroke'ı alır.

**Returns:**
java.awt.Stroke - Temel stroke.
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


Bir dönüşüm alır.

**Returns:**
java.awt.geom.AffineTransform - Bir dönüşüm.
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

