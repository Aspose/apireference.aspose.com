---
title: "DimensionF"
second_title: "Aspose.Page for Java API-Referenz"
description: "Die Dimension-Klasse kapselt die Breite und Höhe einer Komponente in einfacher Genauigkeit in einem einzigen Objekt."
type: docs
weight: 11
url: /de/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

Die `Dimension`-Klasse kapselt die Breite und Höhe einer Komponente (in einfacher Genauigkeit) in einem einzigen Objekt.

Normalerweise sind die Werte von `width` und `height` nicht-negative Ganzzahlen. Die Konstruktoren, die es Ihnen ermöglichen, eine Dimension zu erstellen, verhindern nicht, dass Sie einen negativen Wert für diese Eigenschaften festlegen. Wenn der Wert von `width` oder `height` negativ ist, ist das Verhalten einiger von anderen Objekten definierter Methoden undefiniert.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [DimensionF()](#DimensionF--) | Erstellt eine Instanz von `Dimension` mit einer Breite von null und einer Höhe von null. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Erstellt eine Instanz von `Dimension`, deren Breite und Höhe mit denen der angegebenen Dimension übereinstimmen. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Konstruiert ein `Dimension` und initialisiert es mit der angegebenen Breite und der angegebenen Höhe. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [height](#height) | Die Höhen-Dimension; negative Werte können verwendet werden. |
| [width](#width) | Die Breiten-Dimension; negative Werte können verwendet werden. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Überprüft, ob zwei Dimension-Objekte gleiche Werte haben. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Ermittelt die Größe dieses `Dimension`-Objekts. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Gibt den Hashcode für dieses `Dimension` zurück. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Setzt die Größe dieses `Dimension`-Objekts auf die angegebene Größe. |
| [setSize(double width, double height)](#setSize-double-double-) | Setzt die Größe dieses `Dimension`-Objekts auf die angegebene Breite und Höhe in Doppelpräzision. |
| [setSize(float width, float height)](#setSize-float-float-) | Setzt die Größe dieses `Dimension`-Objekts auf die angegebene Breite und Höhe. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Gibt eine Zeichenkettenrepräsentation der Werte der Felder `height` und `width` dieses `Dimension`-Objekts zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Erstellt eine Instanz von `Dimension` mit einer Breite von null und einer Höhe von null.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Erstellt eine Instanz von `Dimension`, deren Breite und Höhe mit denen der angegebenen Dimension übereinstimmen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | die angegebene Dimension für die Werte von `width` und `height` |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Konstruiert ein `Dimension` und initialisiert es mit der angegebenen Breite und der angegebenen Höhe.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float | die angegebene Breite |
| Höhe | float | die angegebene Höhe |

### height {#height}
```
public float height
```


Die Höhen-Dimension; negative Werte können verwendet werden.

### width {#width}
```
public float width
```


Die Breiten-Dimension; negative Werte können verwendet werden.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Überprüft, ob zwei Dimension-Objekte gleiche Werte haben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


Ermittelt die Größe dieses `Dimension`-Objekts. Diese Methode ist zur Vollständigkeit enthalten, um die von `Component` definierte Methode `getSize` zu spiegeln.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt den Hashcode für dieses `Dimension` zurück.

**Returns:**
int - ein Hashcode für dieses `Dimension`
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Setzt die Größe dieses `Dimension`-Objekts auf die angegebene Größe. Diese Methode ist zur Vollständigkeit enthalten, um die von `Component` definierte Methode `setSize` zu spiegeln.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | die neue Größe für dieses `Dimension`-Objekt |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Setzt die Größe dieses `Dimension`-Objekts auf die angegebene Breite und Höhe in Doppelpräzision. Hinweis: Wenn `width` oder `height` größer als `Integer.MAX_VALUE` sind, werden sie auf `Integer.MAX_VALUE` zurückgesetzt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | double | die neue Breite für das `Dimension`-Objekt |
| Höhe | double | die neue Höhe für das `Dimension`-Objekt |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Setzt die Größe dieses `Dimension`-Objekts auf die angegebene Breite und Höhe. Diese Methode ist zur Vollständigkeit enthalten, um die von `Component` definierte Methode `setSize` zu spiegeln.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float | die neue Breite für dieses `Dimension`-Objekt |
| Höhe | float | die neue Höhe für dieses `Dimension`-Objekt |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Gibt eine Zeichenkettenrepräsentation der Werte der Felder `height` und `width` dieses `Dimension`-Objekts zurück. Diese Methode ist ausschließlich für Debugging-Zwecke gedacht, und Inhalt sowie Format der zurückgegebenen Zeichenkette können zwischen Implementierungen variieren. Die zurückgegebene Zeichenkette kann leer sein, darf jedoch nicht `null` sein.

**Returns:**
java.lang.String - eine Zeichenkettenrepräsentation dieses `Dimension`-Objekts
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

