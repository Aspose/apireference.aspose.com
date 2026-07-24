---
title: "XpsRadialGradientBrush"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου ιδιότητας RadialGradientBrush."
type: docs
weight: 48
url: /el/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου ιδιότητας RadialGradientBrush. Αυτό το στοιχείο χρησιμοποιείται για να καθορίσει ένα radial gradient brush.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [deepClone()](#deepClone--) | Δημιουργεί αντίγραφο αυτού του radial gradient brush. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | Επιστρέφει το κεντρικό σημείο του radial gradient (δηλαδή, το κέντρο της έλλειψης). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Επιστρέφει τιμή που καθορίζει τη συνάρτηση gamma για την παρεμβολή χρώματος. |
| [getGradientOrigin()](#getGradientOrigin--) | Επιστρέφει το σημείο προέλευσης του radial gradient. |
| [getGradientStops()](#getGradientStops--) | Επιστρέφει λίστα από σημεία διακοπής gradient που αποτελούν το gradient. |
| [getOpacity()](#getOpacity--) | Επιστρέφει την τιμή που ορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |
| [getRadiusX()](#getRadiusX--) | Επιστρέφει την ακτίνα στη διάσταση x της έλλειψης που ορίζει το radial gradient. |
| [getRadiusY()](#getRadiusY--) | Επιστρέφει την ακτίνα στη διάσταση y της έλλειψης που ορίζει το radial gradient. |
| [getSpreadMethod()](#getSpreadMethod--) | Επιστρέφει τιμή που περιγράφει πώς πρέπει το brush να γεμίσει την περιοχή περιεχομένου εκτός της κύριας, αρχικής περιοχής gradient. |
| [getTransform()](#getTransform--) | Επιστρέφει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | Ορίζει το κεντρικό σημείο του radial gradient (δηλαδή, το κέντρο της έλλειψης). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Ορίζει τιμή που καθορίζει τη συνάρτηση gamma για την παρεμβολή χρώματος. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | Ορίζει το σημείο προέλευσης του radial gradient. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Ορίζει λίστα από σημεία διακοπής gradient που αποτελούν το gradient. |
| [setOpacity(float value)](#setOpacity-float-) | Ορίζει την τιμή που καθορίζει τη σταθερή διαφάνεια του γεμίσματος του πινέλου. |
| [setRadiusX(float value)](#setRadiusX-float-) | Ορίζει την ακτίνα στη διάσταση x της έλλειψης που ορίζει το radial gradient. |
| [setRadiusY(float value)](#setRadiusY-float-) | Ορίζει την ακτίνα στη διάσταση y της έλλειψης που ορίζει το radial gradient. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Ορίζει τιμή που περιγράφει πώς πρέπει το brush να γεμίσει την περιοχή περιεχομένου εκτός της κύριας, αρχικής περιοχής gradient. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ορίζει τον μετασχηματισμό πίνακα που εφαρμόζεται στο χώρο συντεταγμένων του πινέλου. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


Δημιουργεί αντίγραφο αυτού του radial gradient brush.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


Επιστρέφει το κεντρικό σημείο του radial gradient (δηλαδή, το κέντρο της έλλειψης).

**Returns:**
java.awt.geom.Point2D - Το κεντρικό σημείο του radial gradient.
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
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


Επιστρέφει το σημείο προέλευσης του radial gradient.

**Returns:**
java.awt.geom.Point2D - Το σημείο προέλευσης του radial gradient.
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
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


Επιστρέφει την ακτίνα στη διάσταση x της έλλειψης που ορίζει το radial gradient.

**Returns:**
float - Η ακτίνα στη διάσταση x της έλλειψης που ορίζει το radial gradient.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


Επιστρέφει την ακτίνα στη διάσταση y της έλλειψης που ορίζει το radial gradient.

**Returns:**
float - Η ακτίνα στη διάσταση y της έλλειψης που ορίζει το radial gradient.
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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


Ορίζει το κεντρικό σημείο του radial gradient (δηλαδή, το κέντρο της έλλειψης).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.awt.geom.Point2D | Το κεντρικό σημείο του radial gradient. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Ορίζει την τιμή που καθορίζει τη συνάρτηση γάμμα για την παρεμβολή χρώματος. Η ρύθμιση γάμμα δεν πρέπει να εφαρμόζεται στο στοιχείο άλφα, εάν έχει καθοριστεί.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Τιμή που καθορίζει τη συνάρτηση γάμμα για την παρεμβολή χρώματος. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


Ορίζει το σημείο προέλευσης του radial gradient.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.awt.geom.Point2D | Το αρχικό σημείο της ακτινικής διαβάθμισης. |

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

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


Ορίζει την ακτίνα στη διάσταση x της έλλειψης που ορίζει το radial gradient.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η ακτίνα στη διάσταση x της έλλειψης που ορίζει τη διαβάθμιση ακτινικής κλίμακας. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


Ορίζει την ακτίνα στη διάσταση y της έλλειψης που ορίζει το radial gradient.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η ακτίνα στη διάσταση y της έλλειψης που ορίζει τη διαβάθμιση ακτινικής κλίμακας. |

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

