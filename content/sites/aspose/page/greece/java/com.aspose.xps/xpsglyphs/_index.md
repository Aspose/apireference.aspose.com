---
title: "XpsGlyphs"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει χαρακτηριστικά του στοιχείου Glyphs."
type: docs
weight: 25
url: /el/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Κλάση που περιλαμβάνει χαρακτηριστικά του στοιχείου Glyphs. Αυτό το στοιχείο αντιπροσωπεύει μια ακολουθία ομοιόμορφα μορφοποιημένου κειμένου από μια μοναδική γραμματοσειρά. Παρέχει τις πληροφορίες που απαιτούνται για ακριβή απόδοση και υποστηρίζει λειτουργίες αναζήτησης και επιλογής σε καταναλωτές προβολής.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [deepClone()](#deepClone--) | Κλωνοποιήστε αυτά τα glyphs. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Παρέχει πρόσβαση στα παιδιά του στοιχείου με βάση το δείκτη i. |
| [getBidiLevel()](#getBidiLevel--) | Επιστρέφει την τιμή που καθορίζει το επίπεδο ένθεσης διπλής κατεύθυνσης του αλγορίθμου Unicode. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Επιστρέφει τη γεωμετρία διαδρομής που περιορίζει την περιοχή απόδοσης του στοιχείου. |
| [getFill()](#getFill--) | Επιστρέφει τη βούρτσα που χρησιμοποιείται για τη γέμιση του σχήματος των αποδομένων glyphs. |
| [getFont()](#getFont--) | Επιστρέφει τον πόρο γραμματοσειράς για τη γραμματοσειρά TrueType που χρησιμοποιείται για τη στοιχειοθέτηση του κειμένου των στοιχείων. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Επιστρέφει το μέγεθος γραμματοσειράς σε μονάδες επιφάνειας σχεδίασης, εκφρασμένο ως δεκαδικός αριθμός στις μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Επιστρέφει το αντικείμενο-στόχο του υπερσυνδέσμου. |
| [getOpacity()](#getOpacity--) | Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του στοιχείου. |
| [getOpacityMask()](#getOpacityMask--) | Επιστρέφει το πινέλο που καθορίζει μια μάσκα τιμών άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως η ιδιότητα Opacity, αλλά επιτρέπει διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου. |
| [getOriginX()](#getOriginX--) | Επιστρέφει τη συντεταγμένη x του πρώτου glyph στην ακολουθία, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [getOriginY()](#getOriginY--) | Επιστρέφει τη συντεταγμένη y του πρώτου glyph στην ακολουθία, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [getRenderTransform()](#getRenderTransform--) | Επιστρέφει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα παιδικά στοιχεία (εφόσον υπάρχουν). |
| [getStyleSimulations()](#getStyleSimulations--) | Επιστρέφει την τιμή που καθορίζει μια προσομοίωση στυλ. |
| [getUnicodeString()](#getUnicodeString--) | Επιστρέφει τη συμβολοσειρά κειμένου που αποδίδεται από το στοιχείο Glyphs. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Επιστρέφει την τιμή που υποδεικνύει ότι ένα glyph είναι περιστραμμένο στο πλάι, με το αρχικό σημείο να ορίζεται ως το επάνω κέντρο του μη περιστραμμένου glyph. |
| [iterator()](#iterator--) | Υλοποίηση της διεπαφής Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Ορίζει την τιμή που καθορίζει το επίπεδο ένθεσης διπλής κατεύθυνσης του αλγορίθμου Unicode. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Ορίζει τη γεωμετρία διαδρομής που περιορίζει την απεικόνιση της περιοχής του στοιχείου. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Ορίζει τη βούρτσα που χρησιμοποιείται για τη γέμιση του σχήματος των αποδομένων glyphs. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Ορίζει το μέγεθος γραμματοσειράς σε μονάδες επιφάνειας σχεδίασης, εκφρασμένο ως δεκαδικός αριθμός στις μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Ορίζει το αντικείμενο προορισμού του υπερσυνδέσμου. |
| [setOpacity(float value)](#setOpacity-float-) | Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του στοιχείου. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Ορίζει το πινέλο που καθορίζει μια μάσκα τιμών άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως το χαρακτηριστικό Opacity, αλλά επιτρέπει διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου. |
| [setOriginX(float value)](#setOriginX-float-) | Ορίζει τη συντεταγμένη x του πρώτου glyph στην ακολουθία, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [setOriginY(float value)](#setOriginY-float-) | Ορίζει τη συντεταγμένη y του πρώτου glyph στην ακολουθία, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Ορίζει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα θυγατρικά στοιχεία (εφόσον υπάρχουν). |
| [setSideways(boolean value)](#setSideways-boolean-) | Ορίζει την τιμή που υποδεικνύει ότι ένα glyph είναι περιστραμμένο στο πλάι, με το αρχικό σημείο να ορίζεται ως το επάνω κέντρο του μη περιστραμμένου glyph. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Ορίζει την τιμή που καθορίζει μια προσομοίωση στυλ. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Ορίζει τη συμβολοσειρά κειμένου που αποδίδεται από το στοιχείο Glyphs. |
| [size()](#size--) | Επιστρέφει τον αριθμό των θυγατρικών στοιχείων. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Κλωνοποιήστε αυτά τα glyphs.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Επιστρέφει την τιμή που καθορίζει το επίπεδο ένθεσης διπλής κατεύθυνσης του αλγορίθμου Unicode. Οι ζυγές τιμές υποδηλώνουν διάταξη αριστερά προς δεξιά, οι περιττές τιμές υποδηλώνουν διάταξη δεξιά προς αριστερά. Η διάταξη δεξιά προς αριστερά τοποθετεί το αρχικό σημείο της ακολουθίας στη δεξιά πλευρά του πρώτου glyph, με θετικά πλάτη προόδου (που αντιπροσωπεύουν προόδους προς τα αριστερά) να τοποθετούν τα επόμενα glyph στα αριστερά του προηγούμενου glyph.

**Returns:**
int - Η τιμή που καθορίζει το επίπεδο ένθεσης διπλής κατεύθυνσης του αλγορίθμου Unicode.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Επιστρέφει τη βούρτσα που χρησιμοποιείται για τη γέμιση του σχήματος των αποδομένων glyphs.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Επιστρέφει τον πόρο γραμματοσειράς για τη γραμματοσειρά TrueType που χρησιμοποιείται για τη στοιχειοθέτηση του κειμένου των στοιχείων.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Επιστρέφει το μέγεθος γραμματοσειράς σε μονάδες επιφάνειας σχεδίασης, εκφρασμένο ως δεκαδικός αριθμός στις μονάδες του αποτελεσματικού χώρου συντεταγμένων.

**Returns:**
float - Το μέγεθος γραμματοσειράς.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Επιστρέφει τη συντεταγμένη x του πρώτου glyph στην ακολουθία, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων.

**Returns:**
float - Η συντεταγμένη x του πρώτου γλύφου στη σειρά, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Επιστρέφει τη συντεταγμένη y του πρώτου glyph στην ακολουθία, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων.

**Returns:**
float - Η συντεταγμένη y του πρώτου γλύφου στη σειρά, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Επιστρέφει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα παιδικά στοιχεία (εφόσον υπάρχουν).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Επιστρέφει την τιμή που καθορίζει μια προσομοίωση στυλ.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Επιστρέφει τη συμβολοσειρά κειμένου που αποδίδεται από το στοιχείο Glyphs. Το κείμενο καθορίζεται ως σημεία κώδικα Unicode.

**Returns:**
java.lang.String - Η συμβολοσειρά κειμένου που αποδίδεται από το στοιχείο Glyphs.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Επιστρέφει την τιμή που υποδεικνύει ότι ένα glyph είναι περιστραμμένο στο πλάι, με το αρχικό σημείο να ορίζεται ως το επάνω κέντρο του μη περιστραμμένου glyph.

**Returns:**
boolean - Η τιμή που υποδεικνύει ότι ένας γλύφος είναι στραμμένος στην πλευρά του.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Ορίζει την τιμή που καθορίζει το επίπεδο ένθεσης διπλής κατεύθυνσης του αλγορίθμου Unicode. Οι ζυγές τιμές υποδηλώνουν διάταξη αριστερά προς δεξιά, οι περιττές τιμές υποδηλώνουν διάταξη δεξιά προς αριστερά. Η διάταξη δεξιά προς αριστερά τοποθετεί την αρχή της σειράς στη δεξιά πλευρά του πρώτου γλύφου, με θετικά πλάτη προόδου (που αντιπροσωπεύουν προόδους προς τα αριστερά) να τοποθετούν τους επόμενους γλύφους στα αριστερά του προηγούμενου γλύφου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή που καθορίζει το επίπεδο ένθεσης διπλής κατεύθυνσης του αλγορίθμου Unicode. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Ορίζει τη γεωμετρία διαδρομής που περιορίζει την απεικόνιση της περιοχής του στοιχείου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία διαδρομής που περιορίζει την απεικόνιση της περιοχής του στοιχείου. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Ορίζει τη βούρτσα που χρησιμοποιείται για τη γέμιση του σχήματος των αποδομένων glyphs.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Το πινέλο που χρησιμοποιείται για τη γέμιση του σχήματος των αποδιδόμενων γλύφων. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Ορίζει το μέγεθος γραμματοσειράς σε μονάδες επιφάνειας σχεδίασης, εκφρασμένο ως δεκαδικός αριθμός στις μονάδες του αποτελεσματικού χώρου συντεταγμένων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Το μέγεθος γραμματοσειράς. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Ορίζει τη συντεταγμένη x του πρώτου glyph στην ακολουθία, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η συντεταγμένη x του πρώτου γλύφου στη σειρά, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Ορίζει τη συντεταγμένη y του πρώτου glyph στην ακολουθία, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η συντεταγμένη y του πρώτου γλύφου στη σειρά, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Ορίζει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα θυγατρικά στοιχεία (εφόσον υπάρχουν).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο αφινικός πίνακας μετασχηματισμού. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Ορίζει την τιμή που υποδεικνύει ότι ένα glyph είναι περιστραμμένο στο πλάι, με το αρχικό σημείο να ορίζεται ως το επάνω κέντρο του μη περιστραμμένου glyph.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | boolean | Η τιμή που υποδεικνύει ότι ένας γλύφος είναι στραμμένος στην πλευρά του. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Ορίζει την τιμή που καθορίζει μια προσομοίωση στυλ.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | Η τιμή που καθορίζει μια προσομοίωση στυλ. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Ορίζει τη συμβολοσειρά κειμένου που αποδίδεται από το στοιχείο Glyphs. Το κείμενο καθορίζεται ως σημεία κώδικα Unicode.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.lang.String | Η συμβολοσειρά κειμένου που αποδίδεται από το στοιχείο Glyphs. |

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

