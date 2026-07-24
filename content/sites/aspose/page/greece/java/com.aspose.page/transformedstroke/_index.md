---
title: "TransformedStroke"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Μία γραμμή που περιλαμβάνει μετασχηματισμό."
type: docs
weight: 17
url: /el/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Μία γραμμή που περιλαμβάνει μετασχηματισμό.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Δημιουργεί ένα TransformedStroke βασισμένο σε άλλο Stroke και σε ένα AffineTransform. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Σχεδιάζει το δεδομένο Shape με αυτό το stroke, δημιουργώντας ένα περίγραμμα. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Λαμβάνει το βασικό stroke. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Λαμβάνει έναν μετασχηματισμό. |
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


Δημιουργεί ένα TransformedStroke βασισμένο σε άλλο Stroke και σε ένα AffineTransform.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| base | java.awt.Stroke | Η βάση του stroke. |
| at | java.awt.geom.AffineTransform | Ο affine μετασχηματισμός. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Σχεδιάζει το δεδομένο Shape με αυτό το stroke, δημιουργώντας ένα περίγραμμα. Αυτό το περίγραμμα παραμορφώνεται από το AffineTransform μας σε σχέση με το περίγραμμα που θα παρείχε το base stroke, αλλά μόνο ως προς την κλιμάκωση (δηλαδή το πάχος των γραμμών), καθώς η μετάθεση και η περιστροφή αναιρούνται μετά το σχεδιασμό.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| s | java.awt.Shape | Ως shape προς περιγράψιμο. |

**Returns:**
java.awt.Shape - Ένα περίγραμμα του shape.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Λαμβάνει το βασικό stroke.

**Returns:**
java.awt.Stroke - Βασικό stroke.
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


Λαμβάνει έναν μετασχηματισμό.

**Returns:**
java.awt.geom.AffineTransform - Ένας μετασχηματισμός.
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
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

