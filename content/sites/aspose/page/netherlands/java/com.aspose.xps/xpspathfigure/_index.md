---
title: "XpsPathFigure"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het PathFigure-element omvat."
type: docs
weight: 41
url: /nl/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Klasse die de kenmerken van het PathFigure-element incapsuleert. Dit element bestaat uit een set van één of meer lijn- of krommesegmenten.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(T obj)](#add-T-) | Voegt een nieuw object toe aan de array. |
| [deepClone()](#deepClone--) | Kloont deze padfiguur. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Biedt toegang tot het element van de array via index i. |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Retourneert de lijst met onderliggende padsegmenten. |
| [getStartPoint()](#getStartPoint--) | Retourneert het startpunt voor het eerste segment van de padfiguur. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Voegt een nieuw object in de array in op de opgegeven positie. |
| [isClosed()](#isClosed--) | Retourneert de waarde die aangeeft of de padfiguur gesloten is. |
| [isFilled()](#isFilled--) | Retourneert de waarde die aangeeft of de padfiguur wordt gebruikt bij het berekenen van het gebied van de omvattende padgeometrie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Verwijdert een object uit de array. |
| [removeAt(int index)](#removeAt-int-) | Verwijdert een object uit de array op de opgegeven positie. |
| [setClosed(boolean value)](#setClosed-boolean-) | Stelt de waarde in die aangeeft of de padfiguur gesloten is. |
| [setFilled(boolean value)](#setFilled-boolean-) | Stelt de waarde in die aangeeft of de padfiguur wordt gebruikt bij het berekenen van het gebied van de omvattende padgeometrie. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Stelt het startpunt in voor het eerste segment van de padfiguur. |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Kloont deze padfiguur.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Retourneert de lijst met onderliggende padsegmenten.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - De lijst met onderliggende padsegmenten.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Retourneert het startpunt voor het eerste segment van de padfiguur.

**Returns:**
java.awt.geom.Point2D - Het startpunt voor het eerste segment van de padfiguur.
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Retourneert de waarde die aangeeft of de padfiguur gesloten is.

**Returns:**
boolean - De waarde die aangeeft of de padfiguur gesloten is.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Retourneert de waarde die aangeeft of de padfiguur wordt gebruikt bij het berekenen van het gebied van de omvattende padgeometrie.

**Returns:**
boolean - De waarde die aangeeft of de padfiguur wordt gebruikt bij het berekenen van het gebied van de omvattende padgeometrie.
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Stelt de waarde in die aangeeft of de padfiguur gesloten is.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De waarde die aangeeft of de padfiguur gesloten is. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Stelt de waarde in die aangeeft of de padfiguur wordt gebruikt bij het berekenen van het gebied van de omvattende padgeometrie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De waarde die aangeeft of de padfiguur wordt gebruikt bij het berekenen van het gebied van de omvattende padgeometrie. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Stelt het startpunt in voor het eerste segment van de padfiguur.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.awt.geom.Point2D | Het startpunt voor het eerste segment van de padfiguur. |

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

