---
title: "LineTo"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die LineTo-Operation dar."
type: docs
weight: 61
url: /de/java/com.aspose.font/lineto/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IPathSegment](../../com.aspose.font/ipathsegment)
```
public class LineTo implements IPathSegment
```

Stellt die LineTo-Operation dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) | Erstellt ein neues Objekt, das eine Kopie der aktuellen Instanz ist. |
| [copy()](#copy--) | Erstellt eine Kopie des Segmentobjekts. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getX()](#getX--) | Liefert die x‑Koordinate. |
| [getY()](#getY--) | Liefert die y‑Koordinate. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [shift(double dx, double dy)](#shift-double-double-) | Führt Verschiebung um x- und y-Koordinaten durch. |
| [toString()](#toString--) |  |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transformiert Koordinaten mit der Transformationsmatrix. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Object clone()
```


Erstellt ein neues Objekt, das eine Kopie der aktuellen Instanz ist.

**Returns:**
java.lang.Object – Ein neues Objekt, das eine Kopie dieser Instanz ist.
### copy() {#copy--}
```
public IPathSegment copy()
```


Erstellt eine Kopie des Segmentobjekts.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
### getX() {#getX--}
```
public double getX()
```


Liefert die x‑Koordinate.

**Returns:**
double - Koordinate x.
### getY() {#getY--}
```
public double getY()
```


Liefert die y‑Koordinate.

**Returns:**
double - Koordinate y.
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




### shift(double dx, double dy) {#shift-double-double-}
```
public void shift(double dx, double dy)
```


Führt Verschiebung um x- und y-Koordinaten durch.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dx | double | Wert dx. |
| dy | double | Wert dy. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public void transform(TransformationMatrix matrix)
```


Transformiert Koordinaten mit der Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformationsmatrix. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

