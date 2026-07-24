---
title: "XpsTransformableBrush"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang menginkapsulasi fitur umum elemen kuas yang dapat diubah kecuali SolidColorBrush."
type: docs
weight: 52
url: /id/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

Kelas yang mengenkapsulasi fitur umum elemen kuas yang dapat ditransformasi (semua kecuali SolidColorBrush).
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Mengembalikan nilai yang mendefinisikan transparansi seragam dari isian kuas. |
| [getTransform()](#getTransform--) | Mengembalikan transformasi matriks yang diterapkan pada ruang koordinat kuas. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Mengatur nilai yang mendefinisikan transparansi seragam dari isian kuas. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Mengatur transformasi matriks yang diterapkan pada ruang koordinat kuas. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Mengembalikan nilai yang mendefinisikan transparansi seragam dari isian kuas.

**Returns:**
float - Nilai yang mendefinisikan transparansi seragam dari isian kuas.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Mengembalikan transformasi matriks yang diterapkan pada ruang koordinat kuas. Properti Transform digabungkan dengan transformasi render efektif saat ini untuk menghasilkan transformasi render efektif yang lokal pada kuas. Viewport untuk kuas ditransformasikan menggunakan transformasi render efektif lokal.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Mengatur nilai yang mendefinisikan transparansi seragam dari isian kuas.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Nilai yang mendefinisikan transparansi seragam dari isian kuas. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Mengatur transformasi matriks yang diterapkan pada ruang koordinat kuas. Properti Transform digabungkan dengan transformasi render efektif saat ini untuk menghasilkan transformasi render efektif yang lokal pada kuas. Viewport untuk kuas ditransformasikan menggunakan transformasi render efektif lokal.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Transformasi matriks yang diterapkan pada ruang koordinat kuas. |

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

