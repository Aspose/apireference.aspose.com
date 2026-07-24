---
title: "XpsLinearGradientBrush"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تجسد ميزات عنصر خاصية LinearGradientBrush."
type: docs
weight: 34
url: /ar/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

فئة تُجَمِّع ميزات عنصر خاصية LinearGradientBrush. يُستخدم هذا العنصر لتحديد فرشاة تدرج خطي على طول متجه.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ هذه فرشاة التدرج الخطي. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | يرجع قيمة تحدد دالة غاما لاستيفاء اللون. |
| [getEndPoint()](#getEndPoint--) | يرجع نقطة النهاية للتدرج الخطي. |
| [getGradientStops()](#getGradientStops--) | يرجع قائمة بنقاط التوقف في التدرج التي تشكل التدرج. |
| [getOpacity()](#getOpacity--) | يعيد القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |
| [getSpreadMethod()](#getSpreadMethod--) | يرجع قيمة تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية. |
| [getStartPoint()](#getStartPoint--) | يرجع نقطة البداية للتدرج الخطي. |
| [getTransform()](#getTransform--) | يعيد تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | يضبط قيمة تحدد دالة غاما لاستيفاء اللون. |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | يرجع/يضبط نقطة النهاية للتدرج الخطي. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | يضبط قائمة بنقاط التوقف في التدرج التي تشكل التدرج. |
| [setOpacity(float value)](#setOpacity-float-) | يضبط القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | يضبط قيمة تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | يضبط نقطة البداية للتدرج الخطي. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | يضبط تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


ينسخ هذه فرشاة التدرج الخطي.

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


يرجع قيمة تحدد دالة غاما لاستيفاء اللون. لا ينبغي تطبيق تعديل غاما على مكوّن ألفا إذا تم تحديده.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


يرجع نقطة النهاية للتدرج الخطي.

**Returns:**
java.awt.geom.Point2D - نقطة النهاية للتدرج الخطي.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


يرجع قائمة بنقاط التوقف في التدرج التي تشكل التدرج.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - قائمة بنقاط التوقف في التدرج التي تشكل التدرج.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


يعيد القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة.

**Returns:**
float - القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


يرجع قيمة تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


يرجع نقطة البداية للتدرج الخطي.

**Returns:**
java.awt.geom.Point2D - نقطة البداية للتدرج الخطي.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


يعيد تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. يتم ربط خاصية Transform مع تحويل العرض الفعلي الحالي لإنتاج تحويل عرض فعال محلي للفرشاة. يتم تحويل نافذة العرض للفرشاة باستخدام تحويل العرض الفعال المحلي.

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


يضبط القيمة التي تحدد دالة غاما لاستيفاء اللون. يجب عدم تطبيق تعديل غاما على مكون ألفا إذا تم تحديده.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | القيمة التي تحدد دالة غاما لاستيفاء اللون. |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


يرجع/يضبط نقطة النهاية للتدرج الخطي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Point2D | نقطة النهاية للتدرج الخطي. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


يضبط قائمة بنقاط التوقف في التدرج التي تشكل التدرج.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.util.List<com.aspose.xps.XpsGradientStop> | قائمة نقاط التدرج التي تشكل التدرج. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


يضبط القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


يضبط قيمة تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | القيمة التي تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية والبدائية. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


يضبط نقطة البداية للتدرج الخطي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Point2D | نقطة البداية للتدرج الخطي. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


يضبط تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. يتم ربط خاصية Transform مع تحويل العرض الفعلي الحالي لإنتاج تحويل عرض فعال محلي للفرشاة. يتم تحويل نافذة العرض للفرشاة باستخدام تحويل العرض الفعال المحلي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |

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

