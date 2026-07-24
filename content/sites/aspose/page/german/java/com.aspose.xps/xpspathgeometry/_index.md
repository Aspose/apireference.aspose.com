---
title: "XpsPathGeometry"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die PathGeometry-Property-Element-Merkmale kapselt."
type: docs
weight: 42
url: /de/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Klasse, die die Eigenschaften des PathGeometry-Elementes kapselt. Dieses Element enthält eine Menge von Pfadfiguren, die entweder über das Attribut Figures oder über ein untergeordnetes PathFigure-Element angegeben werden.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(T obj)](#add-T-) | Fügt ein neues Objekt zum Array hinzu. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Fügt ein Pfadsegment zur Liste der untergeordneten Segmente der letzten Pfadfigur hinzu. |
| [deepClone()](#deepClone--) | Klonen dieser Pfadgeometrie. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Stellt Zugriff auf das Element des Arrays über den Index i bereit. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Gibt den Wert zurück, der angibt, wie die sich überschneidenden Bereiche geometrischer Formen kombiniert werden, um eine Region zu bilden. |
| [getPathFigures()](#getPathFigures--) | Gibt die Liste der untergeordneten Pfadfiguren zurück. |
| [getTransform()](#getTransform--) | Gibt die affine Transformationsmatrix zurück, die die lokale Matrixtransformation festlegt, die auf alle untergeordneten und nachfolgenden Elemente der Pfadgeometrie angewendet wird, bevor sie zum Füllen, Beschneiden oder Konturieren verwendet wird. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Fügt ein neues Objekt an der angegebenen Position in das Array ein. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Fügt ein Pfadsegment an der Indexposition in die Liste der untergeordneten Segmente der letzten Pfadfigur ein. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Entfernt ein Objekt aus dem Array. |
| [removeAt(int index)](#removeAt-int-) | Entfernt ein Objekt an der angegebenen Position aus dem Array. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Entfernt ein Pfadsegment aus der Liste der untergeordneten Segmente der letzten Pfadfigur. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Entfernt ein Pfadsegment an der Indexposition aus der Liste der untergeordneten Segmente der letzten Pfadfigur. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Legt den Wert fest, der angibt, wie die sich überschneidenden Bereiche geometrischer Formen kombiniert werden, um eine Region zu bilden. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Legt die affine Transformationsmatrix fest, die die lokale Matrixtransformation definiert, die auf alle untergeordneten und nachfolgenden Elemente der Pfadgeometrie angewendet wird, bevor sie zum Füllen, Beschneiden oder Konturieren verwendet wird. |
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
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Fügt ein Pfadsegment zur Liste der untergeordneten Segmente der letzten Pfadfigur hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Das hinzuzufügende Pfadsegment. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Klonen dieser Pfadgeometrie.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Gibt den Wert zurück, der angibt, wie die sich überschneidenden Bereiche geometrischer Formen kombiniert werden, um eine Region zu bilden.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Gibt die Liste der untergeordneten Pfadfiguren zurück.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - Die Liste der untergeordneten Pfadfiguren.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Gibt die affine Transformationsmatrix zurück, die die lokale Matrixtransformation festlegt, die auf alle untergeordneten und nachfolgenden Elemente der Pfadgeometrie angewendet wird, bevor sie zum Füllen, Beschneiden oder Konturieren verwendet wird.

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


Fügt ein neues Objekt an der angegebenen Position in das Array ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Die Position, an der ein Objekt eingefügt werden soll. |
| obj | T | Das einzufügende Objekt. |

**Returns:**
T - Eingefügtes Objekt.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Fügt ein Pfadsegment an der Indexposition in die Liste der untergeordneten Segmente der letzten Pfadfigur ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Segment eingefügt werden soll. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Ein einzufügendes Pfadsegment. |

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
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Entfernt ein Pfadsegment aus der Liste der untergeordneten Segmente der letzten Pfadfigur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Das zu entfernende Pfadsegment. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Entfernt ein Pfadsegment an der Indexposition aus der Liste der untergeordneten Segmente der letzten Pfadfigur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Pfadsegment entfernt werden soll. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Legt den Wert fest, der angibt, wie die sich überschneidenden Bereiche geometrischer Formen kombiniert werden, um eine Region zu bilden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | Der Wert, der angibt, wie die sich überschneidenden Bereiche geometrischer Formen kombiniert werden, um eine Region zu bilden. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Legt die affine Transformationsmatrix fest, die die lokale Matrixtransformation definiert, die auf alle untergeordneten und nachfolgenden Elemente der Pfadgeometrie angewendet wird, bevor sie zum Füllen, Beschneiden oder Konturieren verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die affine Transformationsmatrix. |

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

