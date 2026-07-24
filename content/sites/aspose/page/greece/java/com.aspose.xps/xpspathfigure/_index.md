---
title: "XpsPathFigure"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου PathFigure."
type: docs
weight: 41
url: /el/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Κλάση που ενσωματώνει χαρακτηριστικά του στοιχείου PathFigure. Αυτό το στοιχείο αποτελείται από ένα σύνολο ενός ή περισσότερων τμημάτων γραμμής ή καμπύλης.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(T obj)](#add-T-) | Προσθέτει ένα νέο αντικείμενο στον πίνακα. |
| [deepClone()](#deepClone--) | Κλωνοποιεί αυτήν τη μορφή διαδρομής. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Παρέχει πρόσβαση στο στοιχείο του πίνακα με βάση το δείκτη i. |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Επιστρέφει τη λίστα των θυγατρικών τμημάτων διαδρομής. |
| [getStartPoint()](#getStartPoint--) | Επιστρέφει το αρχικό σημείο για το πρώτο τμήμα της μορφής διαδρομής. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Εισάγει ένα νέο αντικείμενο στον πίνακα στη συγκεκριμένη θέση. |
| [isClosed()](#isClosed--) | Επιστρέφει την τιμή που υποδεικνύει εάν η μορφή διαδρομής είναι κλειστή. |
| [isFilled()](#isFilled--) | Επιστρέφει την τιμή που υποδεικνύει εάν η μορφή διαδρομής χρησιμοποιείται στον υπολογισμό της περιοχής της περιβάλλουσας γεωμετρίας διαδρομής. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Αφαιρεί ένα αντικείμενο από τον πίνακα. |
| [removeAt(int index)](#removeAt-int-) | Αφαιρεί ένα αντικείμενο από τον πίνακα στη συγκεκριμένη θέση. |
| [setClosed(boolean value)](#setClosed-boolean-) | Ορίζει την τιμή που υποδεικνύει εάν η μορφή διαδρομής είναι κλειστή. |
| [setFilled(boolean value)](#setFilled-boolean-) | Ορίζει την τιμή που υποδεικνύει εάν η μορφή διαδρομής χρησιμοποιείται στον υπολογισμό της περιοχής της περιβάλλουσας γεωμετρίας διαδρομής. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Ορίζει το αρχικό σημείο για το πρώτο τμήμα της μορφής διαδρομής. |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Κλωνοποιεί αυτήν τη μορφή διαδρομής.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Επιστρέφει τη λίστα των θυγατρικών τμημάτων διαδρομής.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - Η λίστα των θυγατρικών τμημάτων διαδρομής.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Επιστρέφει το αρχικό σημείο για το πρώτο τμήμα της μορφής διαδρομής.

**Returns:**
java.awt.geom.Point2D - Το αρχικό σημείο για το πρώτο τμήμα της μορφής διαδρομής.
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Επιστρέφει την τιμή που υποδεικνύει εάν η μορφή διαδρομής είναι κλειστή.

**Returns:**
boolean - Η τιμή που υποδεικνύει αν το σχήμα διαδρομής είναι κλειστό.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Επιστρέφει την τιμή που υποδεικνύει εάν η μορφή διαδρομής χρησιμοποιείται στον υπολογισμό της περιοχής της περιβάλλουσας γεωμετρίας διαδρομής.

**Returns:**
boolean - Η τιμή που υποδεικνύει αν το σχήμα διαδρομής χρησιμοποιείται στον υπολογισμό της περιοχής της περιβάλλουσας γεωμετρίας διαδρομής.
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Ορίζει την τιμή που υποδεικνύει εάν η μορφή διαδρομής είναι κλειστή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | boolean | Η τιμή που υποδεικνύει αν το σχήμα διαδρομής είναι κλειστό. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Ορίζει την τιμή που υποδεικνύει εάν η μορφή διαδρομής χρησιμοποιείται στον υπολογισμό της περιοχής της περιβάλλουσας γεωμετρίας διαδρομής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | boolean | Η τιμή που υποδεικνύει αν το σχήμα διαδρομής χρησιμοποιείται στον υπολογισμό της περιοχής της περιβάλλουσας γεωμετρίας διαδρομής. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Ορίζει το αρχικό σημείο για το πρώτο τμήμα της μορφής διαδρομής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.awt.geom.Point2D | Το αρχικό σημείο για το πρώτο τμήμα του σχήματος διαδρομής. |

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

