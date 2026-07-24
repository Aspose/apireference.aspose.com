---
title: "XpsArcSegment"
second_title: "Java için Aspose.Page API Referansı"
description: "ArcSegment öğesinin özelliklerini kapsülleyen sınıf."
type: docs
weight: 13
url: /tr/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Sınıf, ArcSegment öğesi özelliklerini kapsüller. Bu öğe eliptik bir yay tanımlar.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [deepClone()](#deepClone--) | Bu yay segmentini klonlar. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Eliptik yayının son noktasını döndürür. |
| [getRotationAngle()](#getRotationAngle--) | Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösteren değeri döndürür. |
| [getSize()](#getSize--) | Eliptik yayının x ve y yarıçapını x,y çifti olarak döndürür. |
| [getSweepDirection()](#getSweepDirection--) | Yayın çizildiği yönü belirten değeri döndürür. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Yayın 180 veya daha fazla bir süpürme ile çizilip çizilmediğini belirleyen değeri döndürür. |
| [isStroked()](#isStroked--) | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirten değeri döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Yayın 180 veya daha fazla bir süpürme ile çizilip çizilmediğini belirleyen değeri ayarlar. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Eliptik yayının son noktasını ayarlar. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösteren değeri ayarlar. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Eliptik yayının x ve y yarıçapını x,y çifti olarak ayarlar. |
| [setStroked(boolean value)](#setStroked-boolean-) | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirten değeri ayarlar. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Yayın çizildiği yönü belirten değeri ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Bu yay segmentini klonlar.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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


Eliptik yayının son noktasını döndürür.

**Returns:**
java.awt.geom.Point2D - Eliptik yayının son noktası.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösteren değeri döndürür.

**Returns:**
float - Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösteren değer.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Eliptik yayının x ve y yarıçapını x,y çifti olarak döndürür.

**Returns:**
java.awt.geom.Dimension2D - Eliptik yayının x ve y yarıçapı x,y çifti olarak.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Yayın çizildiği yönü belirten değeri döndürür.

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


Yayın 180 veya daha fazla bir süpürme ile çizilip çizilmediğini belirleyen değeri döndürür.

**Returns:**
boolean - Yayı 180 veya daha fazla bir süpürme ile çizilip çizilmediğini belirleyen değer.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Bu yol segmentinin çizgisinin çizilip çizilmediğini belirten değeri döndürür.

**Returns:**
boolean - Bu yol segmentinin çizgisinin çizilip çizilmediğini belirten değer.
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


Yayın 180 veya daha fazla bir süpürme ile çizilip çizilmediğini belirleyen değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | boolean | Yayın 180 veya daha fazla bir süpürme ile çizilip çizilmediğini belirleyen değer. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Eliptik yayının son noktasını ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.awt.geom.Point2D | Eliptik yayının uç noktası. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösteren değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösteren değer. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Eliptik yayının x ve y yarıçapını x,y çifti olarak ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.awt.geom.Dimension2D | Eliptik yayının x ve y yarıçapı, x,y çifti olarak. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Bu yol segmentinin çizgisinin çizilip çizilmediğini belirten değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | boolean | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirten değer. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Yayın çizildiği yönü belirten değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Yayın çizildiği yönü belirten değer. |

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

