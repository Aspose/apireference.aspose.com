---
title: "DimensionF"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η κλάση Dimension περιλαμβάνει το πλάτος και το ύψος ενός στοιχείου σε μονή ακρίβεια σε ένα ενιαίο αντικείμενο."
type: docs
weight: 11
url: /el/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

Η κλάση `Dimension` περιλαμβάνει το πλάτος και το ύψος ενός στοιχείου (σε μονή ακρίβεια) σε ένα ενιαίο αντικείμενο.

Κανονικά οι τιμές του `width` και του `height` είναι μη-αρνητικοί ακέραιοι. Οι κατασκευαστές που σας επιτρέπουν να δημιουργήσετε μια διάσταση δεν εμποδίζουν τον ορισμό αρνητικής τιμής για αυτές τις ιδιότητες. Εάν η τιμή του `width` ή του `height` είναι αρνητική, η συμπεριφορά ορισμένων μεθόδων που ορίζονται από άλλα αντικείμενα είναι ακαθόριστη.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [DimensionF()](#DimensionF--) | Δημιουργεί ένα στιγμιότυπο του `Dimension` με πλάτος μηδέν και ύψος μηδέν. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Δημιουργεί ένα στιγμιότυπο του `Dimension` του οποίου το πλάτος και το ύψος είναι τα ίδια με αυτά της καθορισμένης διάστασης. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Δημιουργεί ένα `Dimension` και το αρχικοποιεί στο καθορισμένο πλάτος και καθορισμένο ύψος. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [height](#height) | Η διάσταση ύψους· μπορούν να χρησιμοποιηθούν αρνητικές τιμές. |
| [width](#width) | Η διάσταση πλάτους· μπορούν να χρησιμοποιηθούν αρνητικές τιμές. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Ελέγχει αν δύο αντικείμενα διάστασης έχουν ίσες τιμές. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Αποκτά το μέγεθος αυτού του αντικειμένου `Dimension`. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Επιστρέφει τον κωδικό κατακερματισμού για αυτό το `Dimension`. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Ορίζει το μέγεθος αυτού του αντικειμένου `Dimension` στο καθορισμένο μέγεθος. |
| [setSize(double width, double height)](#setSize-double-double-) | Ορίζει το μέγεθος αυτού του αντικειμένου `Dimension` στο καθορισμένο πλάτος και ύψος σε διπλή ακρίβεια. |
| [setSize(float width, float height)](#setSize-float-float-) | Ορίζει το μέγεθος αυτού του αντικειμένου `Dimension` στο καθορισμένο πλάτος και ύψος. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Επιστρέφει μια αναπαράσταση συμβολοσειράς των τιμών των πεδίων `height` και `width` αυτού του αντικειμένου `Dimension`. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Δημιουργεί ένα στιγμιότυπο του `Dimension` με πλάτος μηδέν και ύψος μηδέν.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Δημιουργεί ένα στιγμιότυπο του `Dimension` του οποίου το πλάτος και το ύψος είναι τα ίδια με αυτά της καθορισμένης διάστασης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | η καθορισμένη διάσταση για τις τιμές `width` και `height` |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Δημιουργεί ένα `Dimension` και το αρχικοποιεί στο καθορισμένο πλάτος και καθορισμένο ύψος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float | το καθορισμένο πλάτος |
| height | float | το καθορισμένο ύψος |

### height {#height}
```
public float height
```


Η διάσταση ύψους· μπορούν να χρησιμοποιηθούν αρνητικές τιμές.

### width {#width}
```
public float width
```


Η διάσταση πλάτους· μπορούν να χρησιμοποιηθούν αρνητικές τιμές.

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


Ελέγχει αν δύο αντικείμενα διάστασης έχουν ίσες τιμές.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
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


Λαμβάνει το μέγεθος αυτού του αντικειμένου `Dimension`. Αυτή η μέθοδος περιλαμβάνεται για πληρότητα, ώστε να είναι παράλληλη με τη μέθοδο `getSize` που ορίζεται από το `Component`.

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


Επιστρέφει τον κωδικό κατακερματισμού για αυτό το `Dimension`.

**Returns:**
int - ένας κωδικός κατακερματισμού για αυτό το `Dimension`
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


Ορίζει το μέγεθος αυτού του αντικειμένου `Dimension` στο καθορισμένο μέγεθος. Αυτή η μέθοδος περιλαμβάνεται για πληρότητα, ώστε να είναι παράλληλη με τη μέθοδο `setSize` που ορίζεται από το `Component`.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | το νέο μέγεθος για αυτό το αντικείμενο `Dimension` |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Ορίζει το μέγεθος αυτού του αντικειμένου `Dimension` στο καθορισμένο πλάτος και ύψος με διπλή ακρίβεια. Σημειώστε ότι εάν το `width` ή το `height` είναι μεγαλύτερα από το `Integer.MAX_VALUE`, θα επαναφερθούν στο `Integer.MAX_VALUE`.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | double | το νέο πλάτος για το αντικείμενο `Dimension` |
| height | double | το νέο ύψος για το αντικείμενο `Dimension` |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Ορίζει το μέγεθος αυτού του αντικειμένου `Dimension` στο καθορισμένο πλάτος και ύψος. Αυτή η μέθοδος περιλαμβάνεται για πληρότητα, ώστε να είναι παράλληλη με τη μέθοδο `setSize` που ορίζεται από το `Component`.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float | το νέο πλάτος για αυτό το αντικείμενο `Dimension` |
| height | float | το νέο ύψος για αυτό το αντικείμενο `Dimension` |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Επιστρέφει μια αναπαράσταση συμβολοσειράς των τιμών των πεδίων `height` και `width` αυτού του αντικειμένου `Dimension`. Αυτή η μέθοδος προορίζεται να χρησιμοποιείται μόνο για σκοπούς αποσφαλμάτωσης, και το περιεχόμενο και η μορφή της επιστρεφόμενης συμβολοσειράς μπορεί να διαφέρουν μεταξύ των υλοποιήσεων. Η επιστρεφόμενη συμβολοσειρά μπορεί να είναι κενή αλλά δεν μπορεί να είναι `null`.

**Returns:**
java.lang.String - μια αναπαράσταση συμβολοσειράς αυτού του αντικειμένου `Dimension`
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

