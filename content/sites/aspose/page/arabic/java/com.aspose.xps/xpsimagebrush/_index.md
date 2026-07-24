---
title: "XpsImageBrush"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تجسد ميزات عنصر خاصية ImageBrush."
type: docs
weight: 33
url: /ar/java/com.aspose.xps/xpsimagebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsImageBrush extends XpsTilingBrush
```

فئة تُغَلِّف ميزات عنصر خاصية ImageBrush. يُستخدم هذا العنصر لملء منطقة بصورة.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ فرشاة الصورة هذه. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getImage()](#getImage--) | يعيد مورد الصورة المستخدم للفرشاة. |
| [getImageSource()](#getImageSource--) | يعيد عنوان URI لمورد الصورة. |
| [getOpacity()](#getOpacity--) | يعيد القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |
| [getTileMode()](#getTileMode--) | يعيد القيمة التي تحدد كيفية تنفيذ التبليط في الهندسة المملوءة. |
| [getTransform()](#getTransform--) | يعيد تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |
| [getViewbox()](#getViewbox--) | يعيد المنطقة من محتوى المصدر للفرشاة التي سيتم تعيينها إلى نافذة العرض. |
| [getViewport()](#getViewport--) | يعيد الموضع والأبعاد للقطعة الأولى للفرشاة. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | يضبط القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | يضبط القيمة التي تحدد كيفية تنفيذ التبليط في الهندسة المملوءة. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | يضبط تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | يضبط المنطقة من محتوى المصدر للفرشاة التي سيتم تعيينها إلى نافذة العرض. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | يضبط الموضع والأبعاد للقطعة الأولى للفرشاة. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsImageBrush deepClone()
```


ينسخ فرشاة الصورة هذه.

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - Clone of this image brush.
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
### getImage() {#getImage--}
```
public XpsImage getImage()
```


يعيد مورد الصورة المستخدم للفرشاة.

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - Image resource used to for the brush.
### getImageSource() {#getImageSource--}
```
public String getImageSource()
```


يعيد عنوان URI لمورد الصورة.

**Returns:**
java.lang.String - عنوان URI لمورد الصورة.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


يعيد القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة.

**Returns:**
float - القيمة التي تحدد الشفافية الموحدة لتعبئة الفرشاة.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


يعيد القيمة التي تحدد كيفية تنفيذ التبليط في الهندسة المملوءة.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


يعيد تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. يتم ربط خاصية Transform مع تحويل العرض الفعلي الحالي لإنتاج تحويل عرض فعال محلي للفرشاة. يتم تحويل نافذة العرض للفرشاة باستخدام تحويل العرض الفعال المحلي.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


يعيد المنطقة من محتوى المصدر للفرشاة التي سيتم تعيينها إلى نافذة العرض.

**Returns:**
java.awt.geom.Rectangle2D - المنطقة من محتوى المصدر للفرشاة التي سيتم تعيينها إلى نافذة العرض.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


يعيد الموضع والأبعاد للقطعة الأولى للفرشاة. يتم وضع القطع اللاحقة نسبياً إلى هذه القطعة، كما هو محدد بوضعية التبليط.

**Returns:**
java.awt.geom.Rectangle2D - الموضع والأبعاد للقطعة الأولى للفرشاة.
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

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


يضبط القيمة التي تحدد كيفية تنفيذ التبليط في الهندسة المملوءة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | القيمة التي تحدد كيفية تنفيذ التبليط في الهندسة المملوءة. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


يضبط تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. يتم ربط خاصية Transform مع تحويل العرض الفعلي الحالي لإنتاج تحويل عرض فعال محلي للفرشاة. يتم تحويل نافذة العرض للفرشاة باستخدام تحويل العرض الفعال المحلي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | تحويل المصفوفة المطبق على مساحة إحداثيات الفرشاة. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


يضبط المنطقة من محتوى المصدر للفرشاة التي سيتم تعيينها إلى نافذة العرض.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Rectangle2D | المنطقة من محتوى المصدر للفرشاة التي سيتم تعيينها إلى نافذة العرض. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


يضبط الموضع والأبعاد للقطعة الأولى للفرشاة. يتم وضع القطع اللاحقة نسبياً إلى هذه القطعة، كما هو محدد بوضعية التبليط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Rectangle2D | موضع وأبعاد بلاطة الفرشاة الأولى. |

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

