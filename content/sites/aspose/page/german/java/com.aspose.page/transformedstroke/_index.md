---
title: "TransformedStroke"
second_title: "Aspose.Page for Java API-Referenz"
description: "Ein Strich, der eine Transformation enthält."
type: docs
weight: 17
url: /de/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Ein Strich, der eine Transformation enthält.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Erstellt ein TransformedStroke basierend auf einem anderen Stroke und einem AffineTransform. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Striche die gegebene Shape mit diesem stroke und erzeugt eine Kontur. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Gibt den Basis-Stroke zurück. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Gibt eine Transformation zurück. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


Erstellt ein TransformedStroke basierend auf einem anderen Stroke und einem AffineTransform.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| base | java.awt.Stroke | Der stroke base. |
| at | java.awt.geom.AffineTransform | Die affine Transformation. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Striche die gegebene Shape mit diesem stroke, erzeugt eine Kontur. Diese Kontur wird durch unser AffineTransform relativ zu der Kontur verzerrt, die durch den base stroke erzeugt würde, jedoch nur hinsichtlich der Skalierung (d. h. der Linienstärke), da translation und rotation nach dem stroking rückgängig gemacht werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | java.awt.Shape | Als Shape, das konturiert werden soll. |

**Returns:**
java.awt.Shape - Eine Kontur der Shape.
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
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Gibt den Basis-Stroke zurück.

**Returns:**
java.awt.Stroke - Basis-Stroke.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Gibt eine Transformation zurück.

**Returns:**
java.awt.geom.AffineTransform - Eine Transformation.
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

