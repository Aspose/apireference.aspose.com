---
title: "XpsMatrix"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تغلف ميزات عنصر خاصية MatrixTransform."
type: docs
weight: 36
url: /ar/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

فئة تُجَمِّع ميزات عنصر خاصية MatrixTransform. هذا العنصر يعرّف تحويل مصفوفة إزاحة عشوائي يُستخدم لتعديل أنظمة إحداثيات العناصر.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ مصفوفة التحويل هذه. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | التنفيذ الفعلي. |
| [equals(Object obj)](#equals-java.lang.Object-) | يحدد ما إذا كان الكائن المحدد مساويًا لهذه الحالة. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | يحصل على العنصر M11. |
| [getM12()](#getM12--) | يحصل على العنصر M12. |
| [getM21()](#getM21--) | يحصل على العنصر M21. |
| [getM22()](#getM22--) | يحصل على العنصر M22. |
| [getM31()](#getM31--) | يحصل على العنصر M31. |
| [getM32()](#getM32--) | يحصل على العنصر M32. |
| [hashCode()](#hashCode--) | يعيد رمز تجزئة لهذا الكائن. |
| [isIdentity()](#isIdentity--) | يحصل على قيمة تشير إلى ما إذا كان هذا الكائن مصفوفة هوية. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | يضرب هذه المصفوفة في المصفوفة المحددة بواسطة  matrix  بترتيب افتراضي (Prepend). |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | يضرب هذه المصفوفة في المصفوفة المحددة بواسطة  matrix  بالترتيب المحدد بواسطة  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | ينفذ العامل ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | ينفذ العامل !. |
| [reset()](#reset--) | يعيد تعيين هذه المصفوفة إلى مصفوفة هوية. |
| [rotate(float angle)](#rotate-float-) | يطبق دورانًا باتجاه عقارب الساعة بمقدار  angle  على هذه المصفوفة بترتيب افتراضي (Prepend). |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | يطبق دورانًا باتجاه عقارب الساعة بمقدار  angle  على هذه المصفوفة بالترتيب المحدد بواسطة  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | يطبق دورانًا باتجاه عقارب الساعة بمقدار  angle  حول  pivot  على هذه المصفوفة بترتيب افتراضي (Prepend). |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | يطبق دورانًا باتجاه عقارب الساعة بمقدار  angle  حول  pivot  على هذه المصفوفة بالترتيب المحدد بواسطة  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | يطبق متجه المقياس المحدد (scaleX و scaleY) على هذه المصفوفة بترتيب افتراضي (Prepend). |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | يطبق متجه المقياس المحدد (scaleX و scaleY) على هذه المصفوفة بالترتيب المحدد بواسطة  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | يطبق التحويل المائل المحدد على هذه المصفوفة. |
| [toString()](#toString--) | يعيد تمثيل السلسلة لهذا الكائن  XpsMatrix . |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | يطبق التحويل المتجانس الممثل بهذه المصفوفة على مستطيل محدد. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | يطبق التحويل المتجانس الممثل بهذه المصفوفة على نقطة محددة. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | يطبق التحويل المتجانس الممثل بهذه المصفوفة على مصفوفة محددة من النقاط. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | يطبق التحويل المتجانس الممثل بهذه المصفوفة على جزء محدد من مصفوفة النقاط. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | يطبق متجه الإزاحة المحدد على هذه المصفوفة. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | يطبق متجه الإزاحة المحدد على هذه المصفوفة بالترتيب المحدد بواسطة  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


ينسخ مصفوفة التحويل هذه.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


التنفيذ الفعلي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | المصفوفة الأولى. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | المصفوفة الثانية. |

**Returns:**
منطقي - [true] إذا كانت المصفوفات متساوية
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


يحدد ما إذا كان الكائن المحدد مساويًا لهذه الحالة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | java.lang.Object | الكائن للمقارنة مع هذه الحالة. |

**Returns:**
منطقي - true إذا كان الكائن المحدد يساوي هذه الحالة؛ وإلا false. المعامل obj هو null.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


يحصل على العنصر M11.

**Returns:**
عائم - العنصر M11.
### getM12() {#getM12--}
```
public float getM12()
```


يحصل على العنصر M12.

**Returns:**
عائم - العنصر M12.
### getM21() {#getM21--}
```
public float getM21()
```


يحصل على العنصر M21.

**Returns:**
عائم - العنصر M21.
### getM22() {#getM22--}
```
public float getM22()
```


يحصل على العنصر M22.

**Returns:**
عائم - العنصر M22.
### getM31() {#getM31--}
```
public float getM31()
```


يحصل على العنصر M31.

**Returns:**
عائم - العنصر M31.
### getM32() {#getM32--}
```
public float getM32()
```


يحصل على العنصر M32.

**Returns:**
عائم - العنصر M32.
### hashCode() {#hashCode--}
```
public int hashCode()
```


يعيد رمز تجزئة لهذا الكائن.

**Returns:**
عدد صحيح - رمز تجزئة لهذه الحالة، مناسب للاستخدام في خوارزميات التجزئة وهياكل البيانات مثل جدول التجزئة.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


يحصل على قيمة تشير إلى ما إذا كان هذا الكائن مصفوفة هوية.

القيمة: True إذا كانت هذه الحالة مصفوفة هوية؛ وإلا false.

**Returns:**
منطقي - قيمة تشير إلى ما إذا كانت هذه الحالة مصفوفة هوية.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


يضرب هذه المصفوفة في المصفوفة المحددة بواسطة  matrix  بترتيب افتراضي (Prepend).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | المصفوفة. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


يضرب هذه المصفوفة في المصفوفة المحددة بواسطة  matrix  بالترتيب المحدد بواسطة  matrixOrder .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | المصفوفة. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | الترتيب. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


ينفذ العامل ==.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | المصفوفة الأولى. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | المصفوفة الثانية. |

**Returns:**
منطقي - نتيجة العامل.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


ينفذ العامل !=.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | المصفوفة الأولى. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | المصفوفة الثانية. |

**Returns:**
منطقي - نتيجة العامل.
### reset() {#reset--}
```
public void reset()
```


يعيد تعيين هذه المصفوفة إلى مصفوفة هوية.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


يطبق دورانًا باتجاه عقارب الساعة بمقدار  angle  على هذه المصفوفة بترتيب افتراضي (Prepend).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| angle | float | الزاوية. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


يطبق دورانًا باتجاه عقارب الساعة بمقدار  angle  على هذه المصفوفة بالترتيب المحدد بواسطة  matrixOrder .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| angle | float | الزاوية. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | الترتيب. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


يطبق دورانًا باتجاه عقارب الساعة بمقدار  angle  حول  pivot  على هذه المصفوفة بترتيب افتراضي (Prepend).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| angle | float | الزاوية. |
| محور | java.awt.geom.Point2D | نقطة المحور. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


يطبق دورانًا باتجاه عقارب الساعة بمقدار  angle  حول  pivot  على هذه المصفوفة بالترتيب المحدد بواسطة  matrixOrder .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| angle | float | الزاوية. |
| محور | java.awt.geom.Point2D | نقطة المحور. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | الترتيب. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


يطبق متجه المقياس المحدد (scaleX و scaleY) على هذه المصفوفة بترتيب افتراضي (Prepend).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| scaleX | float | المقياس x. |
| scaleY | float | المقياس y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


يطبق متجه المقياس المحدد (scaleX و scaleY) على هذه المصفوفة بالترتيب المحدد بواسطة  matrixOrder .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| scaleX | float | المقياس X. |
| scaleY | float | المقياس Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | الترتيب. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


يطبق التحويل المائل المحدد على هذه المصفوفة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| skewX | double | الانحراف السيني. |
| skewY | double | الانحراف الصادي. |

### toString() {#toString--}
```
public String toString()
```


يعيد تمثيل السلسلة لهذا الكائن  XpsMatrix .

**Returns:**
java.lang.String - تمثيل السلسلة
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


يطبق التحويل المتجانس الممثل بهذه المصفوفة على مستطيل محدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| مستطيل | java.awt.geom.Rectangle2D | المستطيل. |

**Returns:**
java.awt.geom.Rectangle2D - مستطيل محوّل
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


يطبق التحويل المتجانس الممثل بهذه المصفوفة على نقطة محددة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة | java.awt.geom.Point2D | النقطة. |

**Returns:**
java.awt.geom.Point2D - نقطة محوّلة
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


يطبق التحويل المتجانس الممثل بهذه المصفوفة على مصفوفة محددة من النقاط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | النقاط. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


يطبق التحويل المتجانس الممثل بهذه المصفوفة على جزء محدد من مصفوفة النقاط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | النقاط. |
| startIndex | int | فهرس البداية. |
| numberOfPoints | int | عدد النقاط. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


يطبق متجه الإزاحة المحدد على هذه المصفوفة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| offsetX | float | الإزاحة X. |
| offsetY | float | الإزاحة Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


يطبق متجه الإزاحة المحدد على هذه المصفوفة بالترتيب المحدد بواسطة  matrixOrder .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| offsetX | float | الإزاحة X. |
| offsetY | float | الإزاحة Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | الترتيب. |

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

