---
title: "MoveTo"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar MoveTo-operation."
type: docs
weight: 65
url: /sv/java/com.aspose.font/moveto/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IPathSegment](../../com.aspose.font/ipathsegment)
```
public class MoveTo implements IPathSegment
```

Representerar MoveTo-operation.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [clone()](#clone--) | Skapar ett nytt objekt som är en kopia av den aktuella instansen. |
| [copy()](#copy--) | Skapar en kopia av segmentobjektet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getX()](#getX--) | Hämtar koordinat x. |
| [getY()](#getY--) | Hämtar koordinat y. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [shift(double dx, double dy)](#shift-double-double-) | Utför förskjutning med x- och y-koordinater. |
| [toString()](#toString--) |  |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transformerar koordinater med transformationsmatrisen. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Object clone()
```


Skapar ett nytt objekt som är en kopia av den aktuella instansen.

**Returns:**
java.lang.Object - Ett nytt objekt som är en kopia av denna instans.
### copy() {#copy--}
```
public IPathSegment copy()
```


Skapar en kopia av segmentobjektet.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Hämtar koordinat x.

**Returns:**
double - Koordinat x.
### getY() {#getY--}
```
public double getY()
```


Hämtar koordinat y.

**Returns:**
double - Koordinat y.
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


Utför förskjutning med x- och y-koordinater.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| dx | double | Värde dx. |
| dy | double | Värde dy. |

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


Transformerar koordinater med transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformationsmatris. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

