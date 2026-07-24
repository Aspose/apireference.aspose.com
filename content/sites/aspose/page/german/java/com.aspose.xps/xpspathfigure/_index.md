---
title: "XpsPathFigure"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die PathFigure-Element-Merkmale kapselt."
type: docs
weight: 41
url: /de/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Klasse, die die Eigenschaften des PathFigure-Elements kapselt. Dieses Element besteht aus einer Menge von einem oder mehreren Linien- oder Kurvensegmenten.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(T obj)](#add-T-) | Fügt ein neues Objekt zum Array hinzu. |
| [deepClone()](#deepClone--) | Kloniert dieses PathFigure. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Stellt Zugriff auf das Element des Arrays über den Index i bereit. |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Gibt die Liste der untergeordneten Pfadsegmente zurück. |
| [getStartPoint()](#getStartPoint--) | Gibt den Startpunkt für das erste Segment des PathFigure zurück. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Fügt ein neues Objekt an der angegebenen Position in das Array ein. |
| [isClosed()](#isClosed--) | Gibt den Wert zurück, der angibt, ob das PathFigure geschlossen ist. |
| [isFilled()](#isFilled--) | Gibt den Wert zurück, der angibt, ob das PathFigure bei der Berechnung der Fläche der enthaltenden Pfadgeometrie verwendet wird. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Entfernt ein Objekt aus dem Array. |
| [removeAt(int index)](#removeAt-int-) | Entfernt ein Objekt an der angegebenen Position aus dem Array. |
| [setClosed(boolean value)](#setClosed-boolean-) | Setzt den Wert, der angibt, ob das PathFigure geschlossen ist. |
| [setFilled(boolean value)](#setFilled-boolean-) | Setzt den Wert, der angibt, ob das PathFigure bei der Berechnung der Fläche der enthaltenden Pfadgeometrie verwendet wird. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Setzt den Startpunkt für das erste Segment des PathFigure. |
| [size()](#size--) | Gibt die Anzahl der Elemente zurück. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Fügt ein neues Objekt zum Array hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T | Das hinzuzufügende Objekt. |

**Returns:**
T - Hinzugefügtes Objekt.
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Kloniert dieses PathFigure.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### get(int i) {#get-int-}
```
public T get(int i)
```


Stellt Zugriff auf das Element des Arrays über den Index i bereit.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| i | int | Index des Elements. |

**Returns:**
T - Das Element an Position i.
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


Gibt die Liste der untergeordneten Pfadsegmente zurück.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - Die Liste der untergeordneten Pfadsegmente.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Gibt den Startpunkt für das erste Segment des PathFigure zurück.

**Returns:**
java.awt.geom.Point2D - Der Startpunkt für das erste Segment des PathFigure.
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


Fügt ein neues Objekt an der angegebenen Position in das Array ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Die Position, an der ein Objekt eingefügt werden soll. |
| obj | T | Das einzufügende Objekt. |

**Returns:**
T - Eingefügtes Objekt.
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Gibt den Wert zurück, der angibt, ob das PathFigure geschlossen ist.

**Returns:**
boolean - Der Wert, der angibt, ob die Pfadfigur geschlossen ist.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Gibt den Wert zurück, der angibt, ob das PathFigure bei der Berechnung der Fläche der enthaltenden Pfadgeometrie verwendet wird.

**Returns:**
boolean - Der Wert, der angibt, ob die Pfadfigur bei der Berechnung der Fläche der enthaltenden Pfadgeometrie verwendet wird.
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


Entfernt ein Objekt aus dem Array.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T | Das zu entfernende Objekt. |

**Returns:**
T - Entferntes Objekt.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Entfernt ein Objekt an der angegebenen Position aus dem Array.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Die Position, an der ein Objekt entfernt wird. |

**Returns:**
T - Entferntes Objekt.
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Setzt den Wert, der angibt, ob das PathFigure geschlossen ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Der Wert, der angibt, ob die Pfadfigur geschlossen ist. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Setzt den Wert, der angibt, ob das PathFigure bei der Berechnung der Fläche der enthaltenden Pfadgeometrie verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Der Wert, der angibt, ob die Pfadfigur bei der Berechnung der Fläche der enthaltenden Pfadgeometrie verwendet wird. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Setzt den Startpunkt für das erste Segment des PathFigure.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.awt.geom.Point2D | Der Startpunkt für das erste Segment der Pfadfigur. |

### size() {#size--}
```
public int size()
```


Gibt die Anzahl der Elemente zurück.

**Returns:**
int - Die Anzahl der Elemente.
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

