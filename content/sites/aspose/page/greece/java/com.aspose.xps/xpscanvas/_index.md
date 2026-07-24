---
title: "XpsCanvas"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει χαρακτηριστικά του στοιχείου Canvas."
type: docs
weight: 16
url: /el/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Κλάση που ενσωματώνει χαρακτηριστικά στοιχείου Canvas. Αυτό το στοιχείο ομαδοποιεί στοιχεία μαζί. Για παράδειγμα, τα στοιχεία Glyphs και Path μπορούν να ομαδοποιηθούν σε ένα canvas ώστε να ταυτοποιηθούν ως μονάδα (ως προορισμός υπερσύνδεσης) ή για να εφαρμοστεί μια σύνθετη τιμή ιδιότητας σε κάθε παιδί και προγονικό στοιχείο.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Προσθέτει ένα στοιχείο στη λίστα παιδιών αυτού του canvas. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Εισάγει ένα στοιχείο στη λίστα παιδιών αυτού του canvas στη θέση  index  θέση. |
| [addCanvas()](#addCanvas--) | Προσθέτει ένα νέο canvas στη λίστα παιδιών αυτού του canvas. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Προσθέτει νέα glyphs στη λίστα παιδιών αυτού του canvas. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Προσθέτει ένα νέο path στη λίστα παιδιών αυτού του canvas. |
| [deepClone()](#deepClone--) | Κλωνοποιεί αυτό το canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Παρέχει πρόσβαση στα παιδιά του στοιχείου με βάση το δείκτη i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Επιστρέφει τη γεωμετρία διαδρομής που περιορίζει την περιοχή απόδοσης του στοιχείου. |
| [getEdgeMode()](#getEdgeMode--) | Επιστρέφει την τιμή που ελέγχει πώς αποδίδονται οι άκρες των paths μέσα στο canvas. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Επιστρέφει το αντικείμενο-στόχο του υπερσυνδέσμου. |
| [getOpacity()](#getOpacity--) | Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του στοιχείου. |
| [getOpacityMask()](#getOpacityMask--) | Επιστρέφει το πινέλο που καθορίζει μια μάσκα τιμών άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως η ιδιότητα Opacity, αλλά επιτρέπει διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου. |
| [getRenderTransform()](#getRenderTransform--) | Επιστρέφει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα παιδικά στοιχεία (εφόσον υπάρχουν). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Εισάγει ένα νέο canvas στη λίστα παιδιών αυτού του canvas στη θέση  index  θέση. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Εισάγει νέα glyphs στη λίστα παιδιών αυτού του canvas στη θέση  index  θέση. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Εισάγει ένα νέο path στη λίστα παιδιών αυτού του canvas στη θέση  index  θέση. |
| [iterator()](#iterator--) | Υλοποίηση της διεπαφής Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Ορίζει τη γεωμετρία διαδρομής που περιορίζει την απεικόνιση της περιοχής του στοιχείου. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Ορίζει την τιμή που ελέγχει πώς αποδίδονται οι άκρες των paths μέσα στο canvas. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Ορίζει το αντικείμενο προορισμού του υπερσυνδέσμου. |
| [setOpacity(float value)](#setOpacity-float-) | Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του στοιχείου. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Ορίζει το πινέλο που καθορίζει μια μάσκα τιμών άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως το χαρακτηριστικό Opacity, αλλά επιτρέπει διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Ορίζει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα θυγατρικά στοιχεία (εφόσον υπάρχουν). |
| [size()](#size--) | Επιστρέφει τον αριθμό των θυγατρικών στοιχείων. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Προσθέτει ένα στοιχείο στη λίστα παιδιών αυτού του canvas.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| στοιχείο | T | Το στοιχείο προς προσθήκη. |

**Returns:**
T - Προστέθηκε στοιχείο.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Εισάγει ένα στοιχείο στη λίστα παιδιών αυτού του canvas στη θέση  index  θέση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα στοιχείο. |
| στοιχείο | T | Το στοιχείο για εισαγωγή. |

**Returns:**
T - Εισαχθέν στοιχείο.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Προσθέτει ένα νέο canvas στη λίστα παιδιών αυτού του canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Προσθέτει νέα glyphs στη λίστα παιδιών αυτού του canvas.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fontFamily | java.lang.String | Οικογένεια γραμματοσειράς. |
| fontSize | float | Μέγεθος γραμματοσειράς. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Στυλ γραμματοσειράς. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη T προέλευσης των glyphs. |
| unicodeString | java.lang.String | Συμβολοσειρά για εκτύπωση. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Προσθέτει ένα νέο path στη λίστα παιδιών αυτού του canvas.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία της διαδρομής. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Κλωνοποιεί αυτό το canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
public XpsContentElement get(int i)
```


Παρέχει πρόσβαση στα παιδιά του στοιχείου με βάση το δείκτη i.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| i | int | Δείκτης του θυγατρικού στοιχείου. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Επιστρέφει τη γεωμετρία διαδρομής που περιορίζει την περιοχή απόδοσης του στοιχείου.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Επιστρέφει την τιμή που ελέγχει πώς αποδίδονται οι άκρες των paths μέσα στο canvas.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Επιστρέφει το αντικείμενο-στόχο του υπερσυνδέσμου.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του στοιχείου.

**Returns:**
float - Η τιμή που καθορίζει τη σταθερή διαφάνεια του στοιχείου.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Επιστρέφει το πινέλο που καθορίζει μια μάσκα τιμών άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως η ιδιότητα Opacity, αλλά επιτρέπει διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Επιστρέφει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα παιδικά στοιχεία (εφόσον υπάρχουν).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Εισάγει ένα νέο canvas στη λίστα παιδιών αυτού του canvas στη θέση  index  θέση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένας νέος καμβάς. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Εισάγει νέα glyphs στη λίστα παιδιών αυτού του canvas στη θέση  index  θέση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθούν νέα γλύφια. |
| fontFamily | java.lang.String | Οικογένεια γραμματοσειράς. |
| fontSize | float | Μέγεθος γραμματοσειράς. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Στυλ γραμματοσειράς. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη T προέλευσης των glyphs. |
| unicodeString | java.lang.String | Συμβολοσειρά για εκτύπωση. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Εισάγει ένα νέο path στη λίστα παιδιών αυτού του canvas στη θέση  index  θέση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα νέο μονοπάτι. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία της διαδρομής. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Υλοποίηση της διεπαφής Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Επιστρέφει τον απαριθμητή για τη λίστα.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Ορίζει τη γεωμετρία διαδρομής που περιορίζει την απεικόνιση της περιοχής του στοιχείου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία διαδρομής που περιορίζει την απεικόνιση της περιοχής του στοιχείου. |

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Ορίζει την τιμή που ελέγχει πώς αποδίδονται οι άκρες των paths μέσα στο canvas.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | Η λειτουργία απόδοσης άκρων. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Ορίζει το αντικείμενο προορισμού του υπερσυνδέσμου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Αντικείμενο προορισμού υπερσυνδέσμου. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του στοιχείου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η τιμή που καθορίζει τη σταθερή διαφάνεια του στοιχείου. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Ορίζει το πινέλο που καθορίζει μια μάσκα τιμών άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως το χαρακτηριστικό Opacity, αλλά επιτρέπει διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Το πινέλο που καθορίζει μια μάσκα. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Ορίζει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα θυγατρικά στοιχεία (εφόσον υπάρχουν).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο αφινικός πίνακας μετασχηματισμού. |

### size() {#size--}
```
public int size()
```


Επιστρέφει τον αριθμό των θυγατρικών στοιχείων.

**Returns:**
int - Ο αριθμός των θυγατρικών στοιχείων.
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

