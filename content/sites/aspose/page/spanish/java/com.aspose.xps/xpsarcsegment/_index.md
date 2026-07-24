---
title: "XpsArcSegment"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características del elemento ArcSegment."
type: docs
weight: 13
url: /es/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Clase que encapsula las características del elemento ArcSegment. Este elemento describe un arco elíptico.
## Métodos

| Método | Descripción |
| --- | --- |
| [deepClone()](#deepClone--) | Clona este segmento de arco. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Devuelve el punto final del arco elíptico. |
| [getRotationAngle()](#getRotationAngle--) | Devuelve el valor que indica cómo está rotada la elipse respecto al sistema de coordenadas actual. |
| [getSize()](#getSize--) | Devuelve el radio x e y del arco elíptico como un par x,y. |
| [getSweepDirection()](#getSweepDirection--) | Devuelve el valor que especifica la dirección en la que se dibuja el arco. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Devuelve el valor que determina si el arco se dibuja con un barrido de 180 grados o más. |
| [isStroked()](#isStroked--) | Devuelve el valor que indica si el trazo para este segmento de la ruta se dibuja. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Establece el valor que determina si el arco se dibuja con un barrido de 180 grados o más. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Establece el punto final del arco elíptico. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Establece el valor que indica cómo está rotada la elipse respecto al sistema de coordenadas actual. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Establece el radio x e y del arco elíptico como un par x,y. |
| [setStroked(boolean value)](#setStroked-boolean-) | Establece el valor que indica si el trazo para este segmento de la ruta se dibuja. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Establece el valor que especifica la dirección en la que se dibuja el arco. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Clona este segmento de arco.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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


Devuelve el punto final del arco elíptico.

**Returns:**
java.awt.geom.Point2D - El punto final del arco elíptico.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Devuelve el valor que indica cómo está rotada la elipse respecto al sistema de coordenadas actual.

**Returns:**
float - El valor que indica cómo se rota la elipse respecto al sistema de coordenadas actual.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Devuelve el radio x e y del arco elíptico como un par x,y.

**Returns:**
java.awt.geom.Dimension2D - El radio x e y del arco elíptico como un par x,y.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Devuelve el valor que especifica la dirección en la que se dibuja el arco.

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


Devuelve el valor que determina si el arco se dibuja con un barrido de 180 grados o más.

**Returns:**
boolean - El valor que determina si el arco se dibuja con un barrido de 180 grados o más.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Devuelve el valor que indica si el trazo para este segmento de la ruta se dibuja.

**Returns:**
boolean - El valor que indica si el trazo para este segmento de la ruta se dibuja.
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


Establece el valor que determina si el arco se dibuja con un barrido de 180 grados o más.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | boolean | El valor que determina si el arco se dibuja con un barrido de 180 grados o más. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Establece el punto final del arco elíptico.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.awt.geom.Point2D | El punto final del arco elíptico. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Establece el valor que indica cómo está rotada la elipse respecto al sistema de coordenadas actual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | El valor que indica cómo se rota la elipse respecto al sistema de coordenadas actual. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Establece el radio x e y del arco elíptico como un par x,y.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.awt.geom.Dimension2D | El radio x e y del arco elíptico como un par x,y. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Establece el valor que indica si el trazo para este segmento de la ruta se dibuja.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | boolean | El valor que indica si el trazo para este segmento de la ruta se dibuja. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Establece el valor que especifica la dirección en la que se dibuja el arco.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | El valor que especifica la dirección en la que se dibuja el arco. |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

