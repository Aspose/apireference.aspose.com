---
title: "XpsPathGeometry"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in funktioner för PathGeometry-egenskapselement."
type: docs
weight: 42
url: /sv/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Klass som inkapslar PathGeometry-egenskapselementfunktioner. Detta element innehåller en uppsättning path-figurer som anges antingen med attributet Figures eller med ett barn-PathFigure-element.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(T obj)](#add-T-) | Lägger till ett nytt objekt i arrayen. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Lägger till ett sökvägssegment till listan över barnsegment för den sista pah-figuren. |
| [deepClone()](#deepClone--) | Klonar denna sökvägsgeometri. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Tillhandahåller åtkomst till arrayens element via index  i . |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Returnerar värdet som specificerar hur de skärande områdena av geometriska former kombineras för att bilda en region. |
| [getPathFigures()](#getPathFigures--) | Returnerar listan över barn-sökvägsfigurer. |
| [getTransform()](#getTransform--) | Returnerar den affina transformationsmatrisen som etablerar den lokala matrisomvandlingen som tillämpas på alla barn- och efterkommande element i sökvägsgeometrin innan den används för fyllning, beskärning eller streckning. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Infogar ett nytt objekt i arrayen på angiven position. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Infogar ett sökvägssegment i listan över barnsegment för den sista sökvägsfiguren på indexpositionen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Tar bort ett objekt från arrayen. |
| [removeAt(int index)](#removeAt-int-) | Tar bort ett objekt från arrayen på angiven position. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Tar bort ett sökvägssegment från listan över barnsegment för den sista sökvägsfiguren. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Tar bort ett sökvägssegment från listan över barnsegment för den sista sökvägsfiguren på indexpositionen. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Ställer in värdet som specificerar hur de skärande områdena av geometriska former kombineras för att bilda en region. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ställer in den affina transformationsmatrisen som etablerar den lokala matrisomvandlingen som tillämpas på alla barn- och efterkommande element i sökvägsgeometrin innan den används för fyllning, beskärning eller strocking. |
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
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Lägger till ett sökvägssegment till listan över barnsegment för den sista pah-figuren.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Sökvägssegmentet som ska läggas till. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Klonar denna sökvägsgeometri.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Returnerar värdet som specificerar hur de skärande områdena av geometriska former kombineras för att bilda en region.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Returnerar listan över barn-sökvägsfigurer.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - Listan över barn-sökvägsfigurer.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returnerar den affina transformationsmatrisen som etablerar den lokala matrisomvandlingen som tillämpas på alla barn- och efterkommande element i sökvägsgeometrin innan den används för fyllning, beskärning eller streckning.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
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
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Infogar ett sökvägssegment i listan över barnsegment för den sista sökvägsfiguren på indexpositionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett segment ska infogas. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Ett sökvägssegment att infoga. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
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
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Tar bort ett sökvägssegment från listan över barnsegment för den sista sökvägsfiguren.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Sökvägssegmentet som ska tas bort. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Tar bort ett sökvägssegment från listan över barnsegment för den sista sökvägsfiguren på indexpositionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett sökvägssegment ska tas bort. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Ställer in värdet som specificerar hur de skärande områdena av geometriska former kombineras för att bilda en region.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | Värdet som specificerar hur de överlappande områdena av geometriska former kombineras för att bilda en region. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Ställer in den affina transformationsmatrisen som etablerar den lokala matrisomvandlingen som tillämpas på alla barn- och efterkommande element i sökvägsgeometrin innan den används för fyllning, beskärning eller strocking.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den affina transformationsmatrisen. |

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

