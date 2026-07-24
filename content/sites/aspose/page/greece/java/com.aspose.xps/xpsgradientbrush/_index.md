---
title: "XpsGradientBrush"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει κοινά χαρακτηριστικά των στοιχείων LinerGradientBrush και RadialGradientBrush."
type: docs
weight: 26
url: /el/java/com.aspose.xps/xpsgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsGradientBrush extends XpsTransformableBrush
```

Κλάση που ενσωματώνει κοινά χαρακτηριστικά των στοιχείων LinerGradientBrush και RadialGradientBrush.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Επιστρέφει τιμή που καθορίζει τη συνάρτηση gamma για την παρεμβολή χρώματος. |
| [getGradientStops()](#getGradientStops--) | Επιστρέφει λίστα από σημεία διακοπής gradient που αποτελούν το gradient. |
| [getOpacity()](#getOpacity--) | Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |
| [getSpreadMethod()](#getSpreadMethod--) | Επιστρέφει τιμή που περιγράφει πώς πρέπει το brush να γεμίσει την περιοχή περιεχομένου εκτός της κύριας, αρχικής περιοχής gradient. |
| [getTransform()](#getTransform--) | Επιστρέφει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Ορίζει τιμή που καθορίζει τη συνάρτηση gamma για την παρεμβολή χρώματος. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Ορίζει λίστα από σημεία διακοπής gradient που αποτελούν το gradient. |
| [setOpacity(float value)](#setOpacity-float-) | Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Ορίζει τιμή που περιγράφει πώς πρέπει το brush να γεμίσει την περιοχή περιεχομένου εκτός της κύριας, αρχικής περιοχής gradient. |
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Επιστρέφει τιμή που καθορίζει τη συνάρτηση gamma για την παρεμβολή χρώματος. Η ρύθμιση gamma δεν πρέπει να εφαρμόζεται στο συστατικό alpha, εάν καθοριστεί.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Επιστρέφει λίστα από σημεία διακοπής gradient που αποτελούν το gradient.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Λίστα από σημεία διακοπής gradient που αποτελούν το gradient.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου.

**Returns:**
float - Τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Επιστρέφει τιμή που περιγράφει πώς πρέπει το brush να γεμίσει την περιοχή περιεχομένου εκτός της κύριας, αρχικής περιοχής gradient.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Ορίζει την τιμή που καθορίζει τη συνάρτηση γάμμα για την παρεμβολή χρώματος. Η ρύθμιση γάμμα δεν πρέπει να εφαρμόζεται στο στοιχείο άλφα, εάν έχει καθοριστεί.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Τιμή που καθορίζει τη συνάρτηση γάμμα για την παρεμβολή χρώματος. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Ορίζει λίστα από σημεία διακοπής gradient που αποτελούν το gradient.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.util.List<com.aspose.xps.XpsGradientStop> | Λίστα σημείων διαβάθμισης που αποτελούν τη διαβάθμιση. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Ορίζει τιμή που περιγράφει πώς πρέπει το brush να γεμίσει την περιοχή περιεχομένου εκτός της κύριας, αρχικής περιοχής gradient.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Τιμή που περιγράφει πώς πρέπει το πινέλο να γεμίσει την περιοχή περιεχομένου εκτός της κύριας, αρχικής περιοχής διαβάθμισης. |

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

