---
title: "XpsPathGeometry"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου ιδιότητας PathGeometry."
type: docs
weight: 42
url: /el/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Κλάση που ενσωματώνει τα χαρακτηριστικά του στοιχείου ιδιότητας PathGeometry. Αυτό το στοιχείο περιέχει ένα σύνολο σχημάτων διαδρομής που καθορίζονται είτε με το χαρακτηριστικό Figures είτε με ένα θυγατρικό στοιχείο PathFigure.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(T obj)](#add-T-) | Προσθέτει ένα νέο αντικείμενο στον πίνακα. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Προσθέτει ένα τμήμα διαδρομής στη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής. |
| [deepClone()](#deepClone--) | Κλωνοποιεί αυτή τη γεωμετρία διαδρομής. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Παρέχει πρόσβαση στο στοιχείο του πίνακα με βάση το δείκτη i. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Επιστρέφει την τιμή που καθορίζει πώς συνδυάζονται οι περιοχές τομής γεωμετρικών σχημάτων για να σχηματίσουν μια περιοχή. |
| [getPathFigures()](#getPathFigures--) | Επιστρέφει τη λίστα των θυγατρικών σχημάτων διαδρομής. |
| [getTransform()](#getTransform--) | Επιστρέφει τον πίνακα αφινικού μετασχηματισμού που καθορίζει τον τοπικό μετασχηματισμό πίνακα που εφαρμόζεται σε όλα τα θυγατρικά και απογόνους στοιχεία της γεωμετρίας διαδρομής πριν χρησιμοποιηθεί για γέμισμα, αποκοπή ή σχεδίαση. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Εισάγει ένα νέο αντικείμενο στον πίνακα στη συγκεκριμένη θέση. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Εισάγει ένα τμήμα διαδρομής στη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής στη θέση του δείκτη. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Αφαιρεί ένα αντικείμενο από τον πίνακα. |
| [removeAt(int index)](#removeAt-int-) | Αφαιρεί ένα αντικείμενο από τον πίνακα στη συγκεκριμένη θέση. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Αφαιρεί ένα τμήμα διαδρομής από τη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Αφαιρεί ένα τμήμα διαδρομής από τη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής στη θέση του δείκτη. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Ορίζει την τιμή που καθορίζει πώς συνδυάζονται οι περιοχές τομής γεωμετρικών σχημάτων για να σχηματίσουν μια περιοχή. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ορίζει τον πίνακα αφινικού μετασχηματισμού που καθορίζει τον τοπικό μετασχηματισμό πίνακα που εφαρμόζεται σε όλα τα θυγατρικά και απογόνους στοιχεία της γεωμετρίας διαδρομής πριν χρησιμοποιηθεί για γέμισμα, αποκοπή ή σχεδίαση. |
| [size()](#size--) | Επιστρέφει τον αριθμό των στοιχείων. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Προσθέτει ένα νέο αντικείμενο στον πίνακα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| obj | T | Το αντικείμενο προς προσθήκη. |

**Returns:**
T - Προστέθηκε αντικείμενο.
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Προσθέτει ένα τμήμα διαδρομής στη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Το τμήμα διαδρομής που θα προστεθεί. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Κλωνοποιεί αυτή τη γεωμετρία διαδρομής.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### get(int i) {#get-int-}
```
public T get(int i)
```


Παρέχει πρόσβαση στο στοιχείο του πίνακα με βάση το δείκτη i.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| i | int | Δείκτης του στοιχείου. |

**Returns:**
T - Το στοιχείο στη θέση i.
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


Επιστρέφει την τιμή που καθορίζει πώς συνδυάζονται οι περιοχές τομής γεωμετρικών σχημάτων για να σχηματίσουν μια περιοχή.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Επιστρέφει τη λίστα των θυγατρικών σχημάτων διαδρομής.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - Η λίστα των θυγατρικών σχημάτων διαδρομής.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Επιστρέφει τον πίνακα αφινικού μετασχηματισμού που καθορίζει τον τοπικό μετασχηματισμό πίνακα που εφαρμόζεται σε όλα τα θυγατρικά και απογόνους στοιχεία της γεωμετρίας διαδρομής πριν χρησιμοποιηθεί για γέμισμα, αποκοπή ή σχεδίαση.

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


Εισάγει ένα νέο αντικείμενο στον πίνακα στη συγκεκριμένη θέση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Η θέση για την εισαγωγή ενός αντικειμένου. |
| obj | T | Το αντικείμενο προς εισαγωγή. |

**Returns:**
T - Εισαχθέν αντικείμενο.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Εισάγει ένα τμήμα διαδρομής στη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής στη θέση του δείκτη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα τμήμα. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Ένα τμήμα διαδρομής που θα εισαχθεί. |

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


Αφαιρεί ένα αντικείμενο από τον πίνακα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| obj | T | Το αντικείμενο προς αφαίρεση. |

**Returns:**
T - Το αφαιρεθέν αντικείμενο.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Αφαιρεί ένα αντικείμενο από τον πίνακα στη συγκεκριμένη θέση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Η θέση στην οποία θα αφαιρεθεί ένα αντικείμενο. |

**Returns:**
T - Το αφαιρεθέν αντικείμενο.
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Αφαιρεί ένα τμήμα διαδρομής από τη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Το τμήμα διαδρομής που θα αφαιρεθεί. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Αφαιρεί ένα τμήμα διαδρομής από τη λίστα των θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής στη θέση του δείκτη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να αφαιρεθεί ένα τμήμα διαδρομής. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Ορίζει την τιμή που καθορίζει πώς συνδυάζονται οι περιοχές τομής γεωμετρικών σχημάτων για να σχηματίσουν μια περιοχή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | Η τιμή που καθορίζει πώς συνδυάζονται οι περιοχές τομής γεωμετρικών σχημάτων για να σχηματίσουν μια περιοχή. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Ορίζει τον πίνακα αφινικού μετασχηματισμού που καθορίζει τον τοπικό μετασχηματισμό πίνακα που εφαρμόζεται σε όλα τα θυγατρικά και απογόνους στοιχεία της γεωμετρίας διαδρομής πριν χρησιμοποιηθεί για γέμισμα, αποκοπή ή σχεδίαση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο αφινικός πίνακας μετασχηματισμού. |

### size() {#size--}
```
public int size()
```


Επιστρέφει τον αριθμό των στοιχείων.

**Returns:**
int - Ο αριθμός των στοιχείων.
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

