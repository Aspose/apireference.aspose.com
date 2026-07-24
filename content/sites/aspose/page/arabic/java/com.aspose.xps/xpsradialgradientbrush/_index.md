---
title: "XpsRadialGradientBrush"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تغلف ميزات عنصر خاصية RadialGradientBrush."
type: docs
weight: 48
url: /ar/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

فئة تضم خصائص عنصر RadialGradientBrush. يُستخدم هذا العنصر لتحديد فرشاة تدرج لوني شعاعي.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ هذه الفرشاة المتدرجة الشعاعية. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | يرجع نقطة المركز للتدرج الشعاعي (أي، مركز القطع الناقص). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | يرجع قيمة تحدد دالة غاما لاستيفاء اللون. |
| [getGradientOrigin()](#getGradientOrigin--) | يرجع نقطة الأصل للتدرج الشعاعي. |
| [getGradientStops()](#getGradientStops--) | يرجع قائمة بنقاط التوقف في التدرج التي تشكل التدرج. |
| [getOpacity()](#getOpacity--) | يعيد القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |
| [getRadiusX()](#getRadiusX--) | يرجع نصف القطر في البعد x للقطع الناقص الذي يحدد التدرج الشعاعي. |
| [getRadiusY()](#getRadiusY--) | يرجع نصف القطر في البعد y للقطع الناقص الذي يحدد التدرج الشعاعي. |
| [getSpreadMethod()](#getSpreadMethod--) | يرجع قيمة تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية. |
| [getTransform()](#getTransform--) | يعيد تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | يضبط نقطة المركز للتدرج الشعاعي (أي، مركز القطع الناقص). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | يضبط قيمة تحدد دالة غاما لاستيفاء اللون. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | يضبط نقطة الأصل للتدرج الشعاعي. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | يضبط قائمة بنقاط التوقف في التدرج التي تشكل التدرج. |
| [setOpacity(float value)](#setOpacity-float-) | يضبط القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |
| [setRadiusX(float value)](#setRadiusX-float-) | يضبط نصف القطر في البعد x للقطع الناقص الذي يحدد التدرج الشعاعي. |
| [setRadiusY(float value)](#setRadiusY-float-) | يضبط نصف القطر في البعد y للقطع الناقص الذي يحدد التدرج الشعاعي. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | يضبط قيمة تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | يضبط تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


ينسخ هذه الفرشاة المتدرجة الشعاعية.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


يرجع نقطة المركز للتدرج الشعاعي (أي، مركز القطع الناقص).

**Returns:**
java.awt.geom.Point2D - نقطة المركز للتدرج الشعاعي.
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
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


يرجع نقطة الأصل للتدرج الشعاعي.

**Returns:**
java.awt.geom.Point2D - نقطة الأصل للتدرج الشعاعي.
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
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


يرجع نصف القطر في البعد x للقطع الناقص الذي يحدد التدرج الشعاعي.

**Returns:**
float - نصف القطر في البعد x للقطع الناقص الذي يحدد التدرج الشعاعي.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


يرجع نصف القطر في البعد y للقطع الناقص الذي يحدد التدرج الشعاعي.

**Returns:**
float - نصف القطر في البعد y للقطع الناقص الذي يحدد التدرج الشعاعي.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


يرجع قيمة تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


يضبط نقطة المركز للتدرج الشعاعي (أي، مركز القطع الناقص).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Point2D | نقطة المركز للتدرج الشعاعي. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


يضبط القيمة التي تحدد دالة غاما لاستيفاء اللون. يجب عدم تطبيق تعديل غاما على مكون ألفا إذا تم تحديده.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | القيمة التي تحدد دالة غاما لاستيفاء اللون. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


يضبط نقطة الأصل للتدرج الشعاعي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Point2D | نقطة الأصل للتدرج الشعاعي. |

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

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


يضبط نصف القطر في البعد x للقطع الناقص الذي يحدد التدرج الشعاعي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | نصف القطر في البُعد السيني للإهليلج الذي يحدد التدرج الشعاعي. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


يضبط نصف القطر في البعد y للقطع الناقص الذي يحدد التدرج الشعاعي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | نصف القطر في البُعد الصادي للإهليلج الذي يحدد التدرج الشعاعي. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


يضبط قيمة تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | القيمة التي تصف كيفية ملء الفرشاة لمنطقة المحتوى خارج منطقة التدرج الأولية والبدائية. |

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

