---
title: "XpsArcSegment"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει χαρακτηριστικά του στοιχείου ArcSegment."
type: docs
weight: 13
url: /el/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου ArcSegment. Αυτό το στοιχείο περιγράφει μια ελλειπτική τόξο.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [deepClone()](#deepClone--) | Δημιουργεί κλώνο αυτού του τμήματος ArcSegment. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Επιστρέφει το σημείο άκρου της ελλειπτικής τόξου. |
| [getRotationAngle()](#getRotationAngle--) | Επιστρέφει την τιμή που υποδεικνύει πώς η έλλειψη περιστρέφεται σε σχέση με το τρέχον σύστημα συντεταγμένων. |
| [getSize()](#getSize--) | Επιστρέφει την ακτίνα x και y της ελλειπτικής τόξου ως ζεύγος x,y. |
| [getSweepDirection()](#getSweepDirection--) | Επιστρέφει την τιμή που καθορίζει την κατεύθυνση με την οποία σχεδιάζεται η τόξο. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Επιστρέφει την τιμή που καθορίζει εάν η τόξο σχεδιάζεται με εκτενόμενη γωνία 180 ή μεγαλύτερη. |
| [isStroked()](#isStroked--) | Επιστρέφει την τιμή που καθορίζει αν το περίγραμμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Ορίζει την τιμή που καθορίζει εάν το τόξο σχεδιάζεται με σάρωση 180 μοιρών ή μεγαλύτερη. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Ορίζει το σημείο τερματισμού του ελλειπτικού τόξου. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Ορίζει την τιμή που υποδεικνύει πώς περιστρέφεται η έλλειψη σε σχέση με το τρέχον σύστημα συντεταγμένων. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Ορίζει την ακτίνα x και y του ελλειπτικού τόξου ως ζεύγος x,y. |
| [setStroked(boolean value)](#setStroked-boolean-) | Ορίζει την τιμή που καθορίζει αν το περίγραμμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Ορίζει την τιμή που καθορίζει την κατεύθυνση με την οποία σχεδιάζεται το τόξο. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Δημιουργεί κλώνο αυτού του τμήματος ArcSegment.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


Επιστρέφει το σημείο άκρου της ελλειπτικής τόξου.

**Returns:**
java.awt.geom.Point2D - Το σημείο τερματισμού του ελλειπτικού τόξου.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Επιστρέφει την τιμή που υποδεικνύει πώς η έλλειψη περιστρέφεται σε σχέση με το τρέχον σύστημα συντεταγμένων.

**Returns:**
float - Η τιμή που υποδεικνύει πώς περιστρέφεται η έλλειψη σε σχέση με το τρέχον σύστημα συντεταγμένων.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Επιστρέφει την ακτίνα x και y της ελλειπτικής τόξου ως ζεύγος x,y.

**Returns:**
java.awt.geom.Dimension2D - Η ακτίνα x και y του ελλειπτικού τόξου ως ζεύγος x,y.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Επιστρέφει την τιμή που καθορίζει την κατεύθυνση με την οποία σχεδιάζεται η τόξο.

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


Επιστρέφει την τιμή που καθορίζει εάν η τόξο σχεδιάζεται με εκτενόμενη γωνία 180 ή μεγαλύτερη.

**Returns:**
boolean - Η τιμή που καθορίζει εάν το τόξο σχεδιάζεται με σάρωση 180 μοιρών ή μεγαλύτερη.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Επιστρέφει την τιμή που καθορίζει αν το περίγραμμα για αυτό το τμήμα της διαδρομής σχεδιάζεται.

**Returns:**
boolean - Η τιμή που καθορίζει αν το περίγραμμα για αυτό το τμήμα της διαδρομής σχεδιάζεται.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


Ορίζει την τιμή που καθορίζει εάν το τόξο σχεδιάζεται με σάρωση 180 μοιρών ή μεγαλύτερη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | boolean | Η τιμή που καθορίζει εάν το τόξο σχεδιάζεται με σάρωση 180 μοιρών ή μεγαλύτερη. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Ορίζει το σημείο τερματισμού του ελλειπτικού τόξου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.awt.geom.Point2D | Το σημείο τερματισμού του ελλειπτικού τόξου. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Ορίζει την τιμή που υποδεικνύει πώς περιστρέφεται η έλλειψη σε σχέση με το τρέχον σύστημα συντεταγμένων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η τιμή που υποδεικνύει πώς περιστρέφεται η έλλειψη σε σχέση με το τρέχον σύστημα συντεταγμένων. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Ορίζει την ακτίνα x και y του ελλειπτικού τόξου ως ζεύγος x,y.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.awt.geom.Dimension2D | Η ακτίνα x και y της ελλειπτικής τόξου ως ζεύγος x,y. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Ορίζει την τιμή που καθορίζει αν το περίγραμμα για αυτό το τμήμα της διαδρομής σχεδιάζεται.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | boolean | Η τιμή που καθορίζει αν το περίγραμμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Ορίζει την τιμή που καθορίζει την κατεύθυνση με την οποία σχεδιάζεται το τόξο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Η τιμή που καθορίζει την κατεύθυνση με την οποία σχεδιάζεται το τόξο. |

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

