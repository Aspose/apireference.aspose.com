---
title: "XpsTransformableBrush"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει κοινά χαρακτηριστικά των στοιχείων μετασχηματιζόμενων πινέλων, εκτός από το SolidColorBrush."
type: docs
weight: 52
url: /el/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

Κλάση που ενσωματώνει τις κοινές δυνατότητες των στοιχείων πινέλων μετασχηματισμού (όλα εκτός από SolidColorBrush).
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |
| [getTransform()](#getTransform--) | Επιστρέφει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ορίζει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |
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
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Επιστρέφει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. Η ιδιότητα Transform συνδέεται με τον τρέχοντα αποτελεσματικό μετασχηματισμό απόδοσης για να παραχθεί ένας αποτελεσματικός μετασχηματισμός απόδοσης τοπικός στο πινέλο. Η προβολική περιοχή για το πινέλο μετασχηματίζεται χρησιμοποιώντας τον τοπικό αποτελεσματικό μετασχηματισμό απόδοσης.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Ορίζει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. Η ιδιότητα Transform συνδέεται με τον τρέχοντα αποτελεσματικό μετασχηματισμό απόδοσης για να παραχθεί ένας αποτελεσματικός μετασχηματισμός απόδοσης τοπικός στο πινέλο. Η προβολική περιοχή για το πινέλο μετασχηματίζεται χρησιμοποιώντας τον τοπικό αποτελεσματικό μετασχηματισμό απόδοσης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Ο μετασχηματισμός πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |

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

