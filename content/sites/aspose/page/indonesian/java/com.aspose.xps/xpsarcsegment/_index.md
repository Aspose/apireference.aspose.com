---
title: "XpsArcSegment"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen ArcSegment."
type: docs
weight: 13
url: /id/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Kelas yang mengenkapsulasi fitur elemen ArcSegment. Elemen ini menggambarkan sebuah busur elips.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [deepClone()](#deepClone--) | Mengkloning segmen busur ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Mengembalikan titik akhir busur elips. |
| [getRotationAngle()](#getRotationAngle--) | Mengembalikan nilai yang menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini. |
| [getSize()](#getSize--) | Mengembalikan radius x dan y dari busur elips sebagai pasangan x,y. |
| [getSweepDirection()](#getSweepDirection--) | Mengembalikan nilai yang menentukan arah menggambar busur. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Mengembalikan nilai yang menentukan apakah busur digambar dengan sweep 180 atau lebih. |
| [isStroked()](#isStroked--) | Mengembalikan nilai yang menentukan apakah goresan untuk segmen jalur ini digambar. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Mengatur nilai yang menentukan apakah busur digambar dengan sapuan 180 derajat atau lebih. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Mengatur titik akhir busur elips. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Mengatur nilai yang menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Mengatur radius x dan y dari busur elips sebagai pasangan x,y. |
| [setStroked(boolean value)](#setStroked-boolean-) | Menetapkan nilai yang menentukan apakah goresan untuk segmen jalur ini digambar. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Mengatur nilai yang menentukan arah di mana busur digambar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Mengkloning segmen busur ini.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


Mengembalikan titik akhir busur elips.

**Returns:**
java.awt.geom.Point2D - Titik akhir busur elips.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Mengembalikan nilai yang menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini.

**Returns:**
float - Nilai yang menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Mengembalikan radius x dan y dari busur elips sebagai pasangan x,y.

**Returns:**
java.awt.geom.Dimension2D - Radius x dan y dari busur elips sebagai pasangan x,y.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Mengembalikan nilai yang menentukan arah menggambar busur.

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


Mengembalikan nilai yang menentukan apakah busur digambar dengan sweep 180 atau lebih.

**Returns:**
boolean - Nilai yang menentukan apakah busur digambar dengan sapuan 180 derajat atau lebih.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Mengembalikan nilai yang menentukan apakah goresan untuk segmen jalur ini digambar.

**Returns:**
boolean - Nilai yang menentukan apakah goresan untuk segmen jalur ini digambar.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


Mengatur nilai yang menentukan apakah busur digambar dengan sapuan 180 derajat atau lebih.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | boolean | Nilai yang menentukan apakah busur digambar dengan sapuan 180 derajat atau lebih. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Mengatur titik akhir busur elips.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.awt.geom.Point2D | Titik akhir busur elips. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Mengatur nilai yang menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Nilai yang menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Mengatur radius x dan y dari busur elips sebagai pasangan x,y.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.awt.geom.Dimension2D | Radius x dan y dari busur elips sebagai pasangan x,y. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Menetapkan nilai yang menentukan apakah goresan untuk segmen jalur ini digambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | boolean | Nilai yang menentukan apakah goresan untuk segmen jalur ini digambar. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Mengatur nilai yang menentukan arah di mana busur digambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Nilai yang menentukan arah di mana busur digambar. |

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

