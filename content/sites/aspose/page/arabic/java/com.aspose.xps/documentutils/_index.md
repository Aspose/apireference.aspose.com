---
title: "DocumentUtils"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "هذه الفئة توفر أدوات تتجاوز واجهة برمجة التطبيقات الرسمية لتعامل XPS."
type: docs
weight: 10
url: /ar/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

هذه الفئة توفر أدوات تتجاوز واجهة برمجة التطبيقات الرسمية لتعامل XPS.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | ينشئ هندسة مسار تمثل دائرة. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | ينشئ هندسة مسار تمثل قطاعًا دائريًا بين زاويتين. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | ينشئ هندسة مسار تمثل قطعًا ناقصًا. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | ينشئ مسارًا مستطيلًا مملوءًا بصورة. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | ينشئ مسارًا مستطيلًا مملوءًا بصورة. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | ينشئ هندسة مسار تمثل شريحة دائرة بين شعاعين شعاعيين. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | ينشئ هندسة مسار تمثل مستطيلًا. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | ينشئ هندسة مسار تمثل مضلعًا منتظمًا n-زاوية محاطًا بدائرة. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | ينشئ هندسة مسار تمثل مضلعًا منتظمًا n-زاوية داخل دائرة. |
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


ينشئ هندسة مسار تمثل دائرة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| center | java.awt.geom.Point2D | نقطة مركز الدائرة. |
| نصف القطر | float | نصف قطر الدائرة. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


ينشئ هندسة مسار تمثل قطاعًا دائريًا بين زاويتين.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| center | java.awt.geom.Point2D | مركز الدائرة. |
| نصف القطر | float | نصف قطر الدائرة. |
| startAngle | float | زاوية (بالدرجات) الشعاع الابتدائي. |
| endAngle | float | زاوية (بالدرجات) الشعاع النهائي. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


ينشئ هندسة مسار تمثل قطعًا ناقصًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| center | java.awt.geom.Point2D | نقطة المركز للإهليلج. |
| radiusX | float | نصف القطر الأفقي للإهليلج. |
| radiusY | float | نصف القطر العمودي للإهليلج. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


ينشئ مسارًا مستطيلًا مملوءًا بصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fileName | java.lang.String | اسم ملف الصورة. |
| imageBox | java.awt.geom.Rectangle2D | صندوق الصورة لملئه بالصورة. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


ينشئ مسارًا مستطيلًا مملوءًا بصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fileName | java.lang.String | اسم ملف الصورة. |
| imageBox | java.awt.geom.Rectangle2D | صندوق الصورة لملئه بالصورة. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | وضع ملاءمة الصورة. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


ينشئ هندسة مسار تمثل شريحة دائرة بين شعاعين شعاعيين.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| center | java.awt.geom.Point2D | مركز الدائرة. |
| نصف القطر | float | نصف قطر الدائرة. |
| startAngle | float | زاوية (بالدرجات) الشعاع الابتدائي. |
| endAngle | float | زاوية (بالدرجات) الشعاع النهائي. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


ينشئ هندسة مسار تمثل مستطيلًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | المستطيل. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


ينشئ هندسة مسار تمثل مضلعًا منتظمًا n-زاوية محاطًا بدائرة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| n | int | عدد الرؤوس. |
| center | java.awt.geom.Point2D | مركز الدائرة. |
| نصف القطر | float | نصف قطر الدائرة. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


ينشئ هندسة مسار تمثل مضلعًا منتظمًا n-زاوية داخل دائرة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| n | int | عدد الرؤوس. |
| center | java.awt.geom.Point2D | مركز الدائرة. |
| نصف القطر | float | نصف قطر الدائرة. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

