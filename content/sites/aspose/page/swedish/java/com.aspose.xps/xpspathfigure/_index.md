---
title: "XpsPathFigure"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in PathFigure-elementfunktioner."
type: docs
weight: 41
url: /sv/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Klass som inkapslar PathFigure-elementfunktioner. Detta element består av en uppsättning av en eller flera linje- eller kurvsegment.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(T obj)](#add-T-) | Lägger till ett nytt objekt i arrayen. |
| [deepClone()](#deepClone--) | Klonar denna path‑figur. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Tillhandahåller åtkomst till arrayens element via index  i . |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Returnerar listan med underordnade path‑segment. |
| [getStartPoint()](#getStartPoint--) | Returnerar startpunkten för den första segmentet i path‑figuren. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Infogar ett nytt objekt i arrayen på angiven position. |
| [isClosed()](#isClosed--) | Returnerar värdet som indikerar om path‑figuren är sluten. |
| [isFilled()](#isFilled--) | Returnerar värdet som indikerar om path‑figuren används vid beräkning av området för den omgivande path‑geometrin. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Tar bort ett objekt från arrayen. |
| [removeAt(int index)](#removeAt-int-) | Tar bort ett objekt från arrayen på angiven position. |
| [setClosed(boolean value)](#setClosed-boolean-) | Ställer in värdet som indikerar om path‑figuren är sluten. |
| [setFilled(boolean value)](#setFilled-boolean-) | Ställer in värdet som indikerar om path‑figuren används vid beräkning av området för den omgivande path‑geometrin. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Ställer in startpunkten för den första segmentet i path‑figuren. |
| [size()](#size--) | Returnerar antalet element. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Lägger till ett nytt objekt i arrayen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj | T | Objektet att lägga till. |

**Returns:**
T - Tillagt objekt.
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Klonar denna path‑figur.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### get(int i) {#get-int-}
```
public T get(int i)
```


Tillhandahåller åtkomst till arrayens element via index  i .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| i | int | Index för elementet. |

**Returns:**
T - Elementet på position i.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Returnerar listan med underordnade path‑segment.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - Listan över underordnade bansegment.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Returnerar startpunkten för den första segmentet i path‑figuren.

**Returns:**
java.awt.geom.Point2D - Startpunkten för det första segmentet i banfiguren.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Infogar ett nytt objekt i arrayen på angiven position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Positionen där ett objekt ska infogas. |
| obj | T | Objektet som ska infogas. |

**Returns:**
T - Infogat objekt.
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Returnerar värdet som indikerar om path‑figuren är sluten.

**Returns:**
boolean - Värdet som indikerar om banfiguren är sluten.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Returnerar värdet som indikerar om path‑figuren används vid beräkning av området för den omgivande path‑geometrin.

**Returns:**
boolean - Värdet som indikerar om banfiguren används vid beräkning av området för den omgivande bangeometrin.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Tar bort ett objekt från arrayen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj | T | Objektet som ska tas bort. |

**Returns:**
T - Borttaget objekt.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Tar bort ett objekt från arrayen på angiven position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Positionen där ett objekt ska tas bort. |

**Returns:**
T - Borttaget objekt.
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Ställer in värdet som indikerar om path‑figuren är sluten.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | boolean | Värdet som indikerar om banfiguren är sluten. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Ställer in värdet som indikerar om path‑figuren används vid beräkning av området för den omgivande path‑geometrin.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | boolean | Värdet som indikerar om banfiguren används vid beräkning av området för den omgivande bangeometrin. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Ställer in startpunkten för den första segmentet i path‑figuren.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |

### size() {#size--}
```
public int size()
```


Returnerar antalet element.

**Returns:**
int - Antalet element.
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

