---
title: "DocumentUtils"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αυτή η κλάση παρέχει βοηθητικά εργαλεία πέρα από το επίσημο API χειρισμού XPS."
type: docs
weight: 10
url: /el/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Αυτή η κλάση παρέχει βοηθητικά εργαλεία πέρα από το επίσημο API χειρισμού XPS.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει έναν κύκλο. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα κυκλικό τμήμα μεταξύ δύο γωνιών. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει μια έλλειψη. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Δημιουργεί μια ορθογώνια διαδρομή γεμάτη με εικόνα. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Δημιουργεί μια ορθογώνια διαδρομή γεμάτη με εικόνα. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα τμήμα κύκλου μεταξύ δύο ακτινικών ακτίνων. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα ορθογώνιο. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα κανονικό n-γωνικό πολύγωνο περιγεγραμμένο γύρω από έναν κύκλο. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα κανονικό n-γωνικό πολύγωνο εγγεγραμμένο σε έναν κύκλο. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### createCircle(Point2D center, float radius) {#createCircle-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createCircle(Point2D center, float radius)
```


Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει έναν κύκλο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Το κεντρικό σημείο του κύκλου. |
| radius | float | Η ακτίνα του κύκλου. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα κυκλικό τμήμα μεταξύ δύο γωνιών.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Το κέντρο του κύκλου. |
| radius | float | Η ακτίνα του κύκλου. |
| startAngle | float | Η γωνία (μοίρες) της αρχικής ακτίνας. |
| endAngle | float | Η γωνία (μοίρες) της τελικής ακτίνας. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει μια έλλειψη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Το κεντρικό σημείο του έλλειψης. |
| radiusX | float | Η οριζόντια ακτίνα του έλλειψης. |
| radiusY | float | Η κάθετη ακτίνα του έλλειψης. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Δημιουργεί μια ορθογώνια διαδρομή γεμάτη με εικόνα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fileName | java.lang.String | Το όνομα του αρχείου εικόνας. |
| imageBox | java.awt.geom.Rectangle2D | Το πλαίσιο εικόνας για να γεμίσει με την εικόνα. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Δημιουργεί μια ορθογώνια διαδρομή γεμάτη με εικόνα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fileName | java.lang.String | Το όνομα του αρχείου εικόνας. |
| imageBox | java.awt.geom.Rectangle2D | Το πλαίσιο εικόνας για να γεμίσει με την εικόνα. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Λειτουργία προσαρμογής εικόνας. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα τμήμα κύκλου μεταξύ δύο ακτινικών ακτίνων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Το κέντρο του κύκλου. |
| radius | float | Η ακτίνα του κύκλου. |
| startAngle | float | Η γωνία (μοίρες) της αρχικής ακτίνας. |
| endAngle | float | Η γωνία (μοίρες) της τελικής ακτίνας. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα ορθογώνιο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | Το ορθογώνιο. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα κανονικό n-γωνικό πολύγωνο περιγεγραμμένο γύρω από έναν κύκλο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| n | int | Ο αριθμός των κορυφών. |
| center | java.awt.geom.Point2D | Το κέντρο του κύκλου. |
| radius | float | Η ακτίνα του κύκλου. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Δημιουργεί μια γεωμετρία διαδρομής που αντιπροσωπεύει ένα κανονικό n-γωνικό πολύγωνο εγγεγραμμένο σε έναν κύκλο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| n | int | Ο αριθμός των κορυφών. |
| center | java.awt.geom.Point2D | Το κέντρο του κύκλου. |
| radius | float | Η ακτίνα του κύκλου. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
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

