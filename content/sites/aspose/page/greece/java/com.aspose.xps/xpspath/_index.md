---
title: "XpsPath"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου Path."
type: docs
weight: 40
url: /el/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου Path. Αυτό το στοιχείο είναι ο μοναδικός τρόπος προσθήκης διανυσματικών γραφικών και εικόνων σε μια σταθερή σελίδα. Ορίζει ένα μόνο διανυσματικό γραφικό που θα αποδοθεί σε μια σελίδα.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [deepClone()](#deepClone--) | Δημιουργεί κλώνο αυτού του μονοπατιού. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Παρέχει πρόσβαση στα παιδιά του στοιχείου με βάση το δείκτη i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Επιστρέφει τη γεωμετρία διαδρομής που περιορίζει την περιοχή απόδοσης του στοιχείου. |
| [getData()](#getData--) | Επιστρέφει τη γεωμετρία του μονοπατιού. |
| [getFill()](#getFill--) | Επιστρέφει το πινέλο που χρησιμοποιείται για τη βαφή της γεωμετρίας που καθορίζεται από την ιδιότητα Data του μονοπατιού. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Επιστρέφει το αντικείμενο-στόχο του υπερσυνδέσμου. |
| [getOpacity()](#getOpacity--) | Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του στοιχείου. |
| [getOpacityMask()](#getOpacityMask--) | Επιστρέφει το πινέλο που καθορίζει μια μάσκα τιμών άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως η ιδιότητα Opacity, αλλά επιτρέπει διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου. |
| [getRenderTransform()](#getRenderTransform--) | Επιστρέφει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα παιδικά στοιχεία (εφόσον υπάρχουν). |
| [getStroke()](#getStroke--) | Επιστρέφει το πινέλο που χρησιμοποιείται για το σχεδιασμό του περιγράμματος. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Επιστρέφει τον πίνακα που καθορίζει το μήκος των παύσεων και των κενών του περιγράμματος. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Επιστρέφει την τιμή που καθορίζει πώς σχεδιάζονται τα άκρα κάθε παύσης. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Επιστρέφει το σημείο εκκίνησης για την επανάληψη του μοτίβου του πίνακα παύσεων. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Επιστρέφει την τιμή που ορίζει το σχήμα του τέλους της τελευταίας παύσης σε ένα περίγραμμα. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Επιστρέφει την τιμή που ορίζει το σχήμα της αρχής της πρώτης παύσης σε ένα περίγραμμα. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Επιστρέφει τον λόγο μεταξύ του μέγιστου μήκους μύτης (miter) και του μισού του πάχους του περιγράμματος. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Επιστρέφει την τιμή που ορίζει το σχήμα της αρχής της πρώτης παύσης σε ένα περίγραμμα. |
| [getStrokeThickness()](#getStrokeThickness--) | Επιστρέφει το πάχος ενός περιγράμματος, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων (περιλαμβάνει τη μετασχηματισμό απόδοσης του μονοπατιού). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Υλοποίηση της διεπαφής Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Ορίζει τη γεωμετρία διαδρομής που περιορίζει την απεικόνιση της περιοχής του στοιχείου. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Ορίζει τη γεωμετρία του μονοπατιού. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Ορίζει το πινέλο που χρησιμοποιείται για τη βαφή της γεωμετρίας που καθορίζεται από την ιδιότητα Data του μονοπατιού. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Ορίζει το αντικείμενο προορισμού του υπερσυνδέσμου. |
| [setOpacity(float value)](#setOpacity-float-) | Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του στοιχείου. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Ορίζει το πινέλο που καθορίζει μια μάσκα τιμών άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως το χαρακτηριστικό Opacity, αλλά επιτρέπει διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Ορίζει τον αφινικό πίνακα μετασχηματισμού που δημιουργεί ένα νέο σύστημα συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα θυγατρικά στοιχεία (εφόσον υπάρχουν). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Ορίζει το πινέλο που χρησιμοποιείται για το σχεδιασμό του περιγράμματος. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Ορίζει τον πίνακα που καθορίζει το μήκος των παύσεων και των κενών του περιγράμματος. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Ορίζει την τιμή που καθορίζει πώς σχεδιάζονται τα άκρα κάθε παύσης. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Ορίζει το σημείο εκκίνησης για την επανάληψη του μοτίβου του πίνακα παύσεων. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Ορίζει την τιμή που ορίζει το σχήμα του τέλους της τελευταίας παύσης σε ένα περίγραμμα. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Ορίζει την τιμή που ορίζει το σχήμα της αρχής της πρώτης παύσης σε ένα περίγραμμα. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Ορίζει τον λόγο μεταξύ του μέγιστου μήκους μύτης (miter) και του μισού του πάχους του περιγράμματος. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Ορίζει την τιμή που ορίζει το σχήμα της αρχής της πρώτης παύσης σε ένα περίγραμμα. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Ορίζει το πάχος ενός περιγράμματος, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων (περιλαμβάνει τη μετασχηματισμό απόδοσης του μονοπατιού). |
| [size()](#size--) | Επιστρέφει τον αριθμό των θυγατρικών στοιχείων. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Δημιουργεί κλώνο αυτού του μονοπατιού.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Επιστρέφει τη γεωμετρία του μονοπατιού.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Επιστρέφει το πινέλο που χρησιμοποιείται για τη βαφή της γεωμετρίας που καθορίζεται από την ιδιότητα Data του μονοπατιού.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
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
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Επιστρέφει το πινέλο που χρησιμοποιείται για το σχεδιασμό του περιγράμματος.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Επιστρέφει τον πίνακα που καθορίζει το μήκος των παύσεων και των κενών του περιγράμματος.

**Returns:**
float[] - Ο πίνακας που καθορίζει το μήκος των παύσεων και των κενών του περιγράμματος.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Επιστρέφει την τιμή που καθορίζει πώς σχεδιάζονται τα άκρα κάθε παύσης.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Επιστρέφει το σημείο εκκίνησης για την επανάληψη του μοτίβου του πίνακα παύσεων. Εάν αυτή η τιμή παραλειφθεί, ο πίνακας παύσεων ευθυγραμμίζεται με το αρχικό σημείο του περιγράμματος.

**Returns:**
float - Το σημείο εκκίνησης για την επανάληψη του μοτίβου του πίνακα παύλων.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Επιστρέφει την τιμή που ορίζει το σχήμα του τέλους της τελευταίας παύσης σε ένα περίγραμμα.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Επιστρέφει την τιμή που ορίζει το σχήμα της αρχής της πρώτης παύσης σε ένα περίγραμμα.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Επιστρέφει το λόγο μεταξύ του μέγιστου μήκους μύτης και του μισού του πάχους του στίγματος. Αυτή η τιμή είναι σημαντική μόνο εάν το χαρακτηριστικό  StrokeLineJoin  καθορίζει  Miter .

**Returns:**
float - Ο λόγος μεταξύ του μέγιστου μήκους μύτης και του μισού του πάχους του στίγματος.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Επιστρέφει την τιμή που ορίζει το σχήμα της αρχής της πρώτης παύσης σε ένα περίγραμμα.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Επιστρέφει το πάχος ενός στίγματος, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων (περιλαμβάνει τον μετασχηματισμό απόδοσης του μονοπατιού). Το στίγμα σχεδιάζεται πάνω από το όριο της γεωμετρίας που καθορίζεται από την ιδιότητα Data του στοιχείου Path\u2019s. Το μισό του StrokeThickness εκτείνεται εκτός της γεωμετρίας που καθορίζεται από την ιδιότητα Data και το άλλο μισό εκτείνεται εντός της γεωμετρίας.

**Returns:**
float - Το πάχος ενός στίγματος.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
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

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Ορίζει τη γεωμετρία του μονοπατιού.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία της διαδρομής. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Ορίζει το πινέλο που χρησιμοποιείται για τη βαφή της γεωμετρίας που καθορίζεται από την ιδιότητα Data του μονοπατιού.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Το πινέλο που χρησιμοποιείται για το βάψιμο της καθορισμένης γεωμετρίας |

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

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Ορίζει το πινέλο που χρησιμοποιείται για το σχεδιασμό του περιγράμματος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Το πινέλο που χρησιμοποιείται για τη σχεδίαση του στίγματος. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Ορίζει τον πίνακα που καθορίζει το μήκος των παύσεων και των κενών του περιγράμματος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float[] | Ο πίνακας που καθορίζει το μήκος των παύλων και των κενών του περιγράμματος του στίγματος. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Ορίζει την τιμή που καθορίζει πώς σχεδιάζονται τα άκρα κάθε παύσης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | Η τιμή που καθορίζει πώς σχεδιάζονται τα άκρα κάθε παύλας. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Ορίζει το σημείο εκκίνησης για την επανάληψη του μοτίβου του πίνακα παύλων. Εάν αυτή η τιμή παραληφθεί, ο πίνακας παύλων ευθυγραμμίζεται με το αρχικό σημείο του στίγματος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Το σημείο εκκίνησης για την επανάληψη του μοτίβου του πίνακα παύλων. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Ορίζει την τιμή που ορίζει το σχήμα του τέλους της τελευταίας παύσης σε ένα περίγραμμα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Η τιμή που ορίζει το σχήμα του άκρου της τελευταίας παύλας σε ένα στίγμα. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Ορίζει την τιμή που ορίζει το σχήμα της αρχής της πρώτης παύσης σε ένα περίγραμμα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | Η τιμή που ορίζει το σχήμα της αρχής της πρώτης παύλας σε ένα στίγμα. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Ορίζει το λόγο μεταξύ του μέγιστου μήκους μύτης και του μισού του πάχους του στίγματος. Αυτή η τιμή είναι σημαντική μόνο εάν το χαρακτηριστικό  StrokeLineJoin  καθορίζει  Mither .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Ο λόγος μεταξύ του μέγιστου μήκους μύτης και του μισού του πάχους του στίγματος. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Ορίζει την τιμή που ορίζει το σχήμα της αρχής της πρώτης παύσης σε ένα περίγραμμα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Η τιμή που ορίζει το σχήμα της αρχής της πρώτης παύλας σε ένα στίγμα. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Ορίζει το πάχος ενός στίγματος, σε μονάδες του αποτελεσματικού χώρου συντεταγμένων (περιλαμβάνει τον μετασχηματισμό απόδοσης του μονοπατιού). Το στίγμα σχεδιάζεται πάνω από το όριο της γεωμετρίας που καθορίζεται από την ιδιότητα Data του στοιχείου Path\u2019s. Το μισό του StrokeThickness εκτείνεται εκτός της γεωμετρίας που καθορίζεται από την ιδιότητα Data και το άλλο μισό εκτείνεται εντός της γεωμετρίας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Το πάχος ενός στίγματος. |

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

