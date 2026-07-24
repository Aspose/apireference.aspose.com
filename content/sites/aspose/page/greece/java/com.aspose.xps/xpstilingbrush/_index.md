---
title: "XpsTilingBrush"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που περιλαμβάνει κοινά χαρακτηριστικά των στοιχείων βουρτσών επικάλυψης VisualBrush και ImageBrush."
type: docs
weight: 51
url: /el/java/com.aspose.xps/xpstilingbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsTilingBrush extends XpsTransformableBrush
```

Κλάση που ενσωματώνει τις κοινές δυνατότητες των στοιχείων πινέλων επικάλυψης (VisualBrush και ImageBrush).
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |
| [getTileMode()](#getTileMode--) | Επιστρέφει την τιμή που καθορίζει πώς εκτελείται η επικάλυψη στην γεμάτη γεωμετρία. |
| [getTransform()](#getTransform--) | Επιστρέφει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |
| [getViewbox()](#getViewbox--) | Επιστρέφει την περιοχή του πηγαίου περιεχομένου του πινέλου που πρέπει να χαρτογραφηθεί στην προβολική περιοχή. |
| [getViewport()](#getViewport--) | Επιστρέφει τη θέση και τις διαστάσεις του πρώτου πλακιδίου του πινέλου. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Ορίζει την τιμή που καθορίζει πώς εκτελείται η επικάλυψη στην γεμάτη γεωμετρία. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ορίζει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Ορίζει την περιοχή του πηγαίου περιεχομένου του πινέλου που πρέπει να χαρτογραφηθεί στην προβολική περιοχή. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Ορίζει τη θέση και τις διαστάσεις του πρώτου πλακιδίου του πινέλου. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου.

**Returns:**
float - Τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Επιστρέφει την τιμή που καθορίζει πώς εκτελείται η επικάλυψη στην γεμάτη γεωμετρία.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Επιστρέφει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. Η ιδιότητα Transform συνδέεται με τον τρέχοντα αποτελεσματικό μετασχηματισμό απόδοσης για να παραχθεί ένας αποτελεσματικός μετασχηματισμός απόδοσης τοπικός στο πινέλο. Η προβολική περιοχή για το πινέλο μετασχηματίζεται χρησιμοποιώντας τον τοπικό αποτελεσματικό μετασχηματισμό απόδοσης.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Επιστρέφει την περιοχή του πηγαίου περιεχομένου του πινέλου που πρέπει να χαρτογραφηθεί στην προβολική περιοχή.

**Returns:**
java.awt.geom.Rectangle2D - Η περιοχή του πηγαίου περιεχομένου του πινέλου που πρέπει να χαρτογραφηθεί στην προβολική περιοχή.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Επιστρέφει τη θέση και τις διαστάσεις του πρώτου πλακιδίου του πινέλου. Τα επόμενα πλακίδια τοποθετούνται σχετικά με αυτό το πλακίδιο, όπως ορίζεται από τη λειτουργία πλακιδίων.

**Returns:**
java.awt.geom.Rectangle2D - Η θέση και οι διαστάσεις του πρώτου πλακιδίου του πινέλου.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Ορίζει την τιμή που καθορίζει πώς εκτελείται η επικάλυψη στην γεμάτη γεωμετρία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Τιμή που καθορίζει πώς εκτελείται η επικάλυψη στην γεμάτη γεωμετρία. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Ορίζει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. Η ιδιότητα Transform συνδέεται με τον τρέχοντα αποτελεσματικό μετασχηματισμό απόδοσης για να παραχθεί ένας αποτελεσματικός μετασχηματισμός απόδοσης τοπικός στο πινέλο. Η προβολική περιοχή για το πινέλο μετασχηματίζεται χρησιμοποιώντας τον τοπικό αποτελεσματικό μετασχηματισμό απόδοσης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο μετασχηματισμός πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Ορίζει την περιοχή του πηγαίου περιεχομένου του πινέλου που πρέπει να χαρτογραφηθεί στην προβολική περιοχή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.awt.geom.Rectangle2D | Η περιοχή του πηγαίου περιεχομένου του πινέλου που πρέπει να χαρτογραφηθεί στην προβολική περιοχή. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Ορίζει τη θέση και τις διαστάσεις του πρώτου πλακιδίου του πινέλου. Τα επόμενα πλακίδια τοποθετούνται σχετικά με αυτό το πλακίδιο, όπως ορίζεται από τη λειτουργία πλακιδίων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.awt.geom.Rectangle2D | Η θέση και οι διαστάσεις του πρώτου πλακιδίου πινέλου. |

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

