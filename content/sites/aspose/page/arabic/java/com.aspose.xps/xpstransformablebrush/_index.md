---
title: "XpsTransformableBrush"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تُجَمِّع الميزات المشتركة لعناصر الفرش القابلة للتحويل جميعها باستثناء SolidColorBrush."
type: docs
weight: 52
url: /ar/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

فئة تغلف الميزات المشتركة لعناصر الفرش القابلة للتحويل (جميعها باستثناء SolidColorBrush).
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | يعيد القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |
| [getTransform()](#getTransform--) | يعيد تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | يضبط القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | يضبط تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


يعيد القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة.

**Returns:**
float - القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


يضبط القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |

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

