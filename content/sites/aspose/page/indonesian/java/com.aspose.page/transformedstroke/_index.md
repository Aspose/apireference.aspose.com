---
title: "TransformedStroke"
second_title: "Aspose.Page for Java Referensi API"
description: "Garis yang berisi transformasi."
type: docs
weight: 17
url: /id/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Garis yang berisi transformasi.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Membuat TransformedStroke berdasarkan Stroke lain dan AffineTransform. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Menggambar Shape yang diberikan dengan stroke ini, menghasilkan sebuah outline. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Mendapatkan stroke dasar. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Mendapatkan transformasi. |
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


Membuat TransformedStroke berdasarkan Stroke lain dan AffineTransform.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dasar | java.awt.Stroke | Dasar stroke. |
| pada | java.awt.geom.AffineTransform | Transformasi affine. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Menggambar Shape yang diberikan dengan stroke ini, menghasilkan sebuah outline. Outline ini terdistorsi oleh AffineTransform kami relatif terhadap outline yang akan dihasilkan oleh stroke dasar, tetapi hanya dalam hal skala (misalnya ketebalan garis), karena translasi dan rotasi dibatalkan setelah proses stroking.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | java.awt.Shape | Sebagai shape yang akan di-outline. |

**Returns:**
java.awt.Shape - Sebuah outline dari shape.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Mendapatkan stroke dasar.

**Returns:**
java.awt.Stroke - Stroke dasar.
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


Mendapatkan transformasi.

**Returns:**
java.awt.geom.AffineTransform - Sebuah transformasi.
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
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

