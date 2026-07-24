---
title: "XpsMatrix"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου ιδιότητας MatrixTransform."
type: docs
weight: 36
url: /el/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Κλάση που ενσωματώνει χαρακτηριστικά στοιχείου ιδιότητας MatrixTransform. Αυτό το στοιχείο ορίζει μια αυθαίρετη γραμμική μετασχηματιστική μήτρα που χρησιμοποιείται για τη διαχείριση των συστημάτων συντεταγμένων των στοιχείων.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [deepClone()](#deepClone--) | Κλωνοποιεί αυτή τη μήτρα μετασχηματισμού. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Η πραγματική υλοποίηση. |
| [equals(Object obj)](#equals-java.lang.Object-) | Καθορίζει εάν το συγκεκριμένο  object  είναι ίσο με αυτήν την παρουσία. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Λαμβάνει το στοιχείο M11. |
| [getM12()](#getM12--) | Λαμβάνει το στοιχείο M12. |
| [getM21()](#getM21--) | Λαμβάνει το στοιχείο M21. |
| [getM22()](#getM22--) | Λαμβάνει το στοιχείο M22. |
| [getM31()](#getM31--) | Λαμβάνει το στοιχείο M31. |
| [getM32()](#getM32--) | Λαμβάνει το στοιχείο M32. |
| [hashCode()](#hashCode--) | Επιστρέφει έναν κωδικό κατακερματισμού για αυτό το αντικείμενο. |
| [isIdentity()](#isIdentity--) | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το αντικείμενο είναι identity matrix. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Πολλαπλασιάζει αυτόν τον πίνακα με τον πίνακα που καθορίζεται από το  matrix  με προεπιλεγμένη (Prepend) σειρά. |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Πολλαπλασιάζει αυτόν τον πίνακα με τον πίνακα που καθορίζεται από το  matrix  με τη σειρά που καθορίζεται από το  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Υλοποιεί τον τελεστή ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Υλοποιεί τον τελεστή !. |
| [reset()](#reset--) | Επαναφέρει αυτόν τον Matrix σε identity matrix. |
| [rotate(float angle)](#rotate-float-) | Εφαρμόζει δεξιόστροφη περιστροφή κατά  angle  σε αυτόν τον Matrix με προεπιλεγμένη (Prepend) σειρά. |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Εφαρμόζει δεξιόστροφη περιστροφή κατά  angle  σε αυτόν τον Matrix με τη σειρά που καθορίζεται από το  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Εφαρμόζει δεξιόστροφη περιστροφή κατά  angle  γύρω από το  pivot  σε αυτόν τον Matrix με προεπιλεγμένη (Prepend) σειρά. |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Εφαρμόζει δεξιόστροφη περιστροφή κατά  angle  γύρω από το  pivot  σε αυτόν τον Matrix με τη σειρά που καθορίζεται από το  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτόν τον Matrix με προεπιλεγμένη (Prepend) σειρά. |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτόν τον Matrix με τη σειρά που καθορίζεται από το  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | Εφαρμόζει την καθορισμένη παραμόρφωση skew σε αυτόν τον Matrix. |
| [toString()](#toString--) | Επιστρέφει την αναπαράσταση συμβολοσειράς αυτής της  XpsMatrix  παρουσίας. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Εφαρμόζει τον affine μετασχηματισμό που αναπαριστάται από αυτόν τον Matrix σε ένα καθορισμένο ορθογώνιο. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Εφαρμόζει τον affine μετασχηματισμό που αναπαριστάται από αυτόν τον Matrix σε ένα καθορισμένο σημείο. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Εφαρμόζει τον affine μετασχηματισμό που αναπαριστάται από αυτόν τον Matrix σε έναν καθορισμένο πίνακα σημείων. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Εφαρμόζει τον affine μετασχηματισμό που αναπαριστάται από αυτόν τον Matrix σε ένα καθορισμένο τμήμα πίνακα σημείων. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτόν τον Matrix. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτόν τον Matrix με τη σειρά που καθορίζεται από το  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Κλωνοποιεί αυτή τη μήτρα μετασχηματισμού.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


Η πραγματική υλοποίηση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο πρώτος matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο δεύτερος matrix. |

**Returns:**
boolean - [true] εάν οι πίνακες είναι ίσοι
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Καθορίζει εάν το συγκεκριμένο  object  είναι ίσο με αυτήν την παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| obj | java.lang.Object | Το αντικείμενο για σύγκριση με αυτήν την παρουσία. |

**Returns:**
boolean - true εάν το καθορισμένο αντικείμενο είναι ίσο με αυτήν την παρουσία· διαφορετικά, false. Η παράμετρος obj είναι null.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


Λαμβάνει το στοιχείο M11.

**Returns:**
float - Το στοιχείο M11.
### getM12() {#getM12--}
```
public float getM12()
```


Λαμβάνει το στοιχείο M12.

**Returns:**
float - Το στοιχείο M12.
### getM21() {#getM21--}
```
public float getM21()
```


Λαμβάνει το στοιχείο M21.

**Returns:**
float - Το στοιχείο M21.
### getM22() {#getM22--}
```
public float getM22()
```


Λαμβάνει το στοιχείο M22.

**Returns:**
float - Το στοιχείο M22.
### getM31() {#getM31--}
```
public float getM31()
```


Λαμβάνει το στοιχείο M31.

**Returns:**
float - Το στοιχείο M31.
### getM32() {#getM32--}
```
public float getM32()
```


Λαμβάνει το στοιχείο M32.

**Returns:**
float - Το στοιχείο M32.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Επιστρέφει έναν κωδικό κατακερματισμού για αυτό το αντικείμενο.

**Returns:**
int - Ένας κώδικας κατακερματισμού για αυτήν την παρουσία, κατάλληλος για χρήση σε αλγορίθμους κατακερματισμού και δομές δεδομένων όπως ένας πίνακας κατακερματισμού.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το αντικείμενο είναι identity matrix.

Τιμή: True εάν αυτή η παρουσία είναι μοναδιαίος πίνακας· διαφορετικά, false.

**Returns:**
boolean - Μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι μοναδιαίος πίνακας.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Πολλαπλασιάζει αυτόν τον πίνακα με τον πίνακα που καθορίζεται από το  matrix  με προεπιλεγμένη (Prepend) σειρά.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο πίνακας. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Πολλαπλασιάζει αυτόν τον πίνακα με τον πίνακα που καθορίζεται από το  matrix  με τη σειρά που καθορίζεται από το  matrixOrder .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο πίνακας. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Η σειρά. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


Υλοποιεί τον τελεστή ==.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο πρώτος matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο δεύτερος matrix. |

**Returns:**
boolean - Το αποτέλεσμα του τελεστή.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Υλοποιεί τον τελεστή !=.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο πρώτος matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο δεύτερος matrix. |

**Returns:**
boolean - Το αποτέλεσμα του τελεστή.
### reset() {#reset--}
```
public void reset()
```


Επαναφέρει αυτόν τον Matrix σε identity matrix.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Εφαρμόζει δεξιόστροφη περιστροφή κατά  angle  σε αυτόν τον Matrix με προεπιλεγμένη (Prepend) σειρά.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| angle | float | Η γωνία. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Εφαρμόζει δεξιόστροφη περιστροφή κατά  angle  σε αυτόν τον Matrix με τη σειρά που καθορίζεται από το  matrixOrder .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| angle | float | Η γωνία. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Η σειρά. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Εφαρμόζει δεξιόστροφη περιστροφή κατά  angle  γύρω από το  pivot  σε αυτόν τον Matrix με προεπιλεγμένη (Prepend) σειρά.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| angle | float | Η γωνία. |
| αξονικό σημείο | java.awt.geom.Point2D | Το σημείο άξονα. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Εφαρμόζει δεξιόστροφη περιστροφή κατά  angle  γύρω από το  pivot  σε αυτόν τον Matrix με τη σειρά που καθορίζεται από το  matrixOrder .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| angle | float | Η γωνία. |
| αξονικό σημείο | java.awt.geom.Point2D | Το σημείο άξονα. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Η σειρά. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτόν τον Matrix με προεπιλεγμένη (Prepend) σειρά.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| scaleX | float | Η κλίμακα x. |
| scaleY | float | Η κλίμακα y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτόν τον Matrix με τη σειρά που καθορίζεται από το  matrixOrder .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| scaleX | float | Η κλίμακα X. |
| scaleY | float | Η κλίμακα Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Η σειρά. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Εφαρμόζει την καθορισμένη παραμόρφωση skew σε αυτόν τον Matrix.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| skewX | double | Η κλίση x. |
| skewY | double | Η κλίση y. |

### toString() {#toString--}
```
public String toString()
```


Επιστρέφει την αναπαράσταση συμβολοσειράς αυτής της  XpsMatrix  παρουσίας.

**Returns:**
java.lang.String - Αναπαράσταση συμβολοσειράς
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Εφαρμόζει τον affine μετασχηματισμό που αναπαριστάται από αυτόν τον Matrix σε ένα καθορισμένο ορθογώνιο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ορθογώνιο | java.awt.geom.Rectangle2D | Το ορθογώνιο. |

**Returns:**
java.awt.geom.Rectangle2D - Μετασχηματισμένο ορθογώνιο
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Εφαρμόζει τον affine μετασχηματισμό που αναπαριστάται από αυτόν τον Matrix σε ένα καθορισμένο σημείο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| σημείο | java.awt.geom.Point2D | Το σημείο. |

**Returns:**
java.awt.geom.Point2D - Μετασχηματισμένο σημείο
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Εφαρμόζει τον affine μετασχηματισμό που αναπαριστάται από αυτόν τον Matrix σε έναν καθορισμένο πίνακα σημείων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Τα σημεία. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Εφαρμόζει τον affine μετασχηματισμό που αναπαριστάται από αυτόν τον Matrix σε ένα καθορισμένο τμήμα πίνακα σημείων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Τα σημεία. |
| startIndex | int | Ο αρχικός δείκτης. |
| numberOfPoints | int | Ο αριθμός των σημείων. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτόν τον Matrix.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| offsetX | float | Η μετατόπιση X. |
| offsetY | float | Η μετατόπιση Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτόν τον Matrix με τη σειρά που καθορίζεται από το  matrixOrder .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| offsetX | float | Η μετατόπιση X. |
| offsetY | float | Η μετατόπιση Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Η σειρά. |

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

