---
title: "XpsPathGeometry"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het PathGeometry-eigenschapselement omvat."
type: docs
weight: 42
url: /nl/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Klasse die de eigenschappen van het PathGeometry-eigenschapselement incapsuleert. Dit element bevat een set padfiguren die zijn opgegeven via het attribuut Figures of via een onderliggend PathFigure-element.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(T obj)](#add-T-) | Voegt een nieuw object toe aan de array. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Voegt een padsegment toe aan de lijst met onderliggende segmenten van de laatste padfiguur. |
| [deepClone()](#deepClone--) | Kopieert deze padgeometrie. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Biedt toegang tot het element van de array via index i. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Retourneert de waarde die specificeert hoe de overlappende gebieden van geometrische vormen worden gecombineerd tot een regio. |
| [getPathFigures()](#getPathFigures--) | Retourneert de lijst met onderliggende padfiguren. |
| [getTransform()](#getTransform--) | Retourneert de affiene transformatiematrix die de lokale matrixtransformatie vastlegt die wordt toegepast op alle onderliggende en afgeleide elementen van de padgeometrie voordat deze wordt gebruikt voor vullen, bijsnijden of stroken. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Voegt een nieuw object in de array in op de opgegeven positie. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Voegt een padsegment in de lijst met onderliggende segmenten van de laatste padfiguur in op indexpositie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Verwijdert een object uit de array. |
| [removeAt(int index)](#removeAt-int-) | Verwijdert een object uit de array op de opgegeven positie. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Verwijdert een padsegment uit de lijst met onderliggende segmenten van de laatste padfiguur. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Verwijdert een padsegment uit de lijst met onderliggende segmenten van de laatste padfiguur op indexpositie. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Stelt de waarde in die specificeert hoe de overlappende gebieden van geometrische vormen worden gecombineerd tot een regio. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Stelt de affiene transformatiematrix in die de lokale matrixtransformatie vastlegt die wordt toegepast op alle onderliggende en afgeleide elementen van de padgeometrie voordat deze wordt gebruikt voor vullen, bijsnijden of stroken. |
| [size()](#size--) | Retourneert het aantal elementen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Voegt een nieuw object toe aan de array.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T | Het object om toe te voegen. |

**Returns:**
T - Toegevoegd object.
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Voegt een padsegment toe aan de lijst met onderliggende segmenten van de laatste padfiguur.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Het padsegment dat moet worden toegevoegd. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Kopieert deze padgeometrie.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int i) {#get-int-}
```
public T get(int i)
```


Biedt toegang tot het element van de array via index i.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| i | int | Index van het element. |

**Returns:**
T - Het element op positie i.
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


Retourneert de waarde die specificeert hoe de overlappende gebieden van geometrische vormen worden gecombineerd tot een regio.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Retourneert de lijst met onderliggende padfiguren.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - De lijst met onderliggende padfiguren.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Retourneert de affiene transformatiematrix die de lokale matrixtransformatie vastlegt die wordt toegepast op alle onderliggende en afgeleide elementen van de padgeometrie voordat deze wordt gebruikt voor vullen, bijsnijden of stroken.

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


Voegt een nieuw object in de array in op de opgegeven positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | De positie om een object in te voegen. |
| obj | T | Het object om in te voegen. |

**Returns:**
T - Ingevoegd object.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Voegt een padsegment in de lijst met onderliggende segmenten van de laatste padfiguur in op indexpositie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een segment moet worden ingevoegd. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Een padsegment dat moet worden ingevoegd. |

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


Verwijdert een object uit de array.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T | Het object om te verwijderen. |

**Returns:**
T - Verwijderd object.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Verwijdert een object uit de array op de opgegeven positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | De positie waarop een object moet worden verwijderd. |

**Returns:**
T - Verwijderd object.
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Verwijdert een padsegment uit de lijst met onderliggende segmenten van de laatste padfiguur.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Het padsegment dat moet worden verwijderd. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Verwijdert een padsegment uit de lijst met onderliggende segmenten van de laatste padfiguur op indexpositie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een padsegment moet worden verwijderd. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Stelt de waarde in die specificeert hoe de overlappende gebieden van geometrische vormen worden gecombineerd tot een regio.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | De waarde die specificeert hoe de overlappende gebieden van geometrische vormen worden gecombineerd tot een regio. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Stelt de affiene transformatiematrix in die de lokale matrixtransformatie vastlegt die wordt toegepast op alle onderliggende en afgeleide elementen van de padgeometrie voordat deze wordt gebruikt voor vullen, bijsnijden of stroken.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De affiene transformatiematrix. |

### size() {#size--}
```
public int size()
```


Retourneert het aantal elementen.

**Returns:**
int - Het aantal elementen.
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

