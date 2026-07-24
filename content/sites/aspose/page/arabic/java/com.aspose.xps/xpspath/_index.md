---
title: "XpsPath"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تغلف ميزات عنصر Path."
type: docs
weight: 40
url: /ar/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

فئة تُجسّد ميزات عنصر Path. هذا العنصر هو الوسيلة الوحيدة لإضافة الرسومات المتجهية والصور إلى صفحة ثابتة. يحدد رسماً متجهياً واحداً ليتم عرضه على الصفحة.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ هذا المسار. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | يوفر وصولاً إلى أبناء العنصر حسب الفهرس i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | يعيد هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |
| [getData()](#getData--) | يرجع هندسة المسار. |
| [getFill()](#getFill--) | يرجع الفرشاة المستخدمة لطلاء الهندسة المحددة بواسطة خاصية Data للمسار. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | يعيد كائن هدف الارتباط التشعبي. |
| [getOpacity()](#getOpacity--) | يعيد القيمة التي تحدد الشفافية الموحدة للعنصر. |
| [getOpacityMask()](#getOpacityMask--) | يعيد الفرشاة التي تحدد قناع قيم ألفا المطبقة على العنصر بنفس طريقة خاصية الشفافية (Opacity)، ولكن تسمح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [getRenderTransform()](#getRenderTransform--) | يعيد مصفوفة التحويل المتجانس التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت). |
| [getStroke()](#getStroke--) | يرجع الفرشاة المستخدمة لرسم الخط. |
| [getStrokeDashArray()](#getStrokeDashArray--) | يرجع المصفوفة التي تحدد طول الشرطات والفجوات في خط الحدود. |
| [getStrokeDashCap()](#getStrokeDashCap--) | يرجع القيمة التي تحدد كيفية رسم نهايات كل شرطة. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | يرجع نقطة البداية لتكرار نمط مصفوفة الشرطات. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | يرجع القيمة التي تحدد شكل نهاية آخر شرطة في الخط. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | يرجع القيمة التي تحدد شكل بداية أول شرطة في الخط. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | يرجع النسبة بين الحد الأقصى لطول الميتر ونصف سمك الخط. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | يرجع القيمة التي تحدد شكل بداية أول شرطة في الخط. |
| [getStrokeThickness()](#getStrokeThickness--) | يرجع سمك الخط، بوحدات الفضاء الإحداثي الفعّال (يشمل تحويل العرض للمسار). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | تنفيذ واجهة Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | يضبط هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | يضبط هندسة المسار. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | يضبط الفرشاة المستخدمة لطلاء الهندسة المحددة بواسطة خاصية Data للمسار. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | يضبط كائن هدف الارتباط التشعبي. |
| [setOpacity(float value)](#setOpacity-float-) | يضبط القيمة التي تحدد الشفافية المتساوية للعنصر. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | يضبط الفرشاة التي تحدد قناعًا لقيم ألفا يُطبق على العنصر بنفس طريقة خاصية Opacity، مع السماح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | يضبط مصفوفة التحويل الأفيني التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | يضبط الفرشاة المستخدمة لرسم الخط. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | يضبط المصفوفة التي تحدد طول الشرطات والفجوات في خط الحدود. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | يضبط القيمة التي تحدد كيفية رسم نهايات كل شرطة. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | يضبط نقطة البداية لتكرار نمط مصفوفة الشرطات. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | يضبط القيمة التي تحدد شكل نهاية آخر شرطة في الخط. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | يضبط القيمة التي تحدد شكل بداية أول شرطة في الخط. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | يضبط النسبة بين الحد الأقصى لطول الميتر ونصف سمك الخط. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | يضبط القيمة التي تحدد شكل بداية أول شرطة في الخط. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | يضبط سمك الخط، بوحدات الفضاء الإحداثي الفعّال (يشمل تحويل العرض للمسار). |
| [size()](#size--) | يعيد عدد العناصر الفرعية. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


ينسخ هذا المسار.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


يوفر وصولاً إلى أبناء العنصر حسب الفهرس i.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int | فهرس العنصر الفرعي. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


يعيد هندسة المسار التي تحدّ المنطقة المرسومة للعنصر.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


يرجع هندسة المسار.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


يرجع الفرشاة المستخدمة لطلاء الهندسة المحددة بواسطة خاصية Data للمسار.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


يعيد كائن هدف الارتباط التشعبي.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


يعيد القيمة التي تحدد الشفافية الموحدة للعنصر.

**Returns:**
float - القيمة التي تحدد الشفافية المتساوية للعنصر.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


يعيد الفرشاة التي تحدد قناع قيم ألفا المطبقة على العنصر بنفس طريقة خاصية الشفافية (Opacity)، ولكن تسمح بقيم ألفا مختلفة لمناطق مختلفة من العنصر.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


يعيد مصفوفة التحويل المتجانس التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


يرجع الفرشاة المستخدمة لرسم الخط.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


يرجع المصفوفة التي تحدد طول الشرطات والفجوات في خط الحدود.

**Returns:**
float[] - المصفوفة التي تحدد طول الشرطات والفجوات في خط الحدود.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


يرجع القيمة التي تحدد كيفية رسم نهايات كل شرطة.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


يرجع نقطة البداية لتكرار نمط مصفوفة الشرطات. إذا تم حذف هذه القيمة، فإن مصفوفة الشرطات تُحاذى مع أصل الخط.

**Returns:**
float - نقطة البداية لتكرار نمط مصفوفة الشرطات.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


يرجع القيمة التي تحدد شكل نهاية آخر شرطة في الخط.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


يرجع القيمة التي تحدد شكل بداية أول شرطة في الخط.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


يعيد النسبة بين الحد الأقصى لطول الميتر ونصف سمك الخط. هذه القيمة ذات أهمية فقط إذا كان السمة StrokeLineJoin تحدد Miter.

**Returns:**
float - النسبة بين الحد الأقصى لطول الميتر ونصف سمك الخط.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


يرجع القيمة التي تحدد شكل بداية أول شرطة في الخط.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


يعيد سمك الخط، بوحدات مساحة الإحداثيات الفعّالة (تشمل تحويل العرض للمسار). يتم رسم الخط فوق حد الشكل المحدد بخصيصة Data لعنصر Path element\\u2019s Data property. نصف قيمة StrokeThickness يمتد خارج الشكل المحدد بخصيصة Data والنصف الآخر يمتد داخل الشكل.

**Returns:**
float - سمك الخط.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


تنفيذ واجهة Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - يعيد المُعدِّد للقائمة.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


يضبط هندسة المسار التي تحدّ المنطقة المرسومة للعنصر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


يضبط هندسة المسار.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


يضبط الفرشاة المستخدمة لطلاء الهندسة المحددة بواسطة خاصية Data للمسار.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | الفرشاة المستخدمة لطلاء الشكل المحدد |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


يضبط كائن هدف الارتباط التشعبي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | كائن هدف الارتباط التشعبي. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


يضبط القيمة التي تحدد الشفافية المتساوية للعنصر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | القيمة التي تحدد الشفافية المتساوية للعنصر. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


يضبط الفرشاة التي تحدد قناعًا لقيم ألفا يُطبق على العنصر بنفس طريقة خاصية Opacity، مع السماح بقيم ألفا مختلفة لمناطق مختلفة من العنصر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | الفرشاة التي تحدد قناعًا. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


يضبط مصفوفة التحويل الأفيني التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | مصفوفة التحويل الأفيني. |

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


يضبط الفرشاة المستخدمة لرسم الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | الفرشاة المستخدمة لرسم الخط. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


يضبط المصفوفة التي تحدد طول الشرطات والفجوات في خط الحدود.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float[] | المصفوفة التي تحدد طول الشرطات والفجوات لخط الحدود. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


يضبط القيمة التي تحدد كيفية رسم نهايات كل شرطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | القيمة التي تحدد كيفية رسم نهايات كل شرطة. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


يضبط نقطة البداية لتكرار نمط مصفوفة الشرطات. إذا تم حذف هذه القيمة، فإن مصفوفة الشرطات تُحاذى مع أصل الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | نقطة البداية لتكرار نمط مصفوفة الشرطات. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


يضبط القيمة التي تحدد شكل نهاية آخر شرطة في الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | القيمة التي تحدد شكل نهاية آخر شرطة في الخط. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


يضبط القيمة التي تحدد شكل بداية أول شرطة في الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | القيمة التي تحدد شكل بداية أول شرطة في الخط. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


يضبط النسبة بين الحد الأقصى لطول الميتر ونصف سمك الخط. هذه القيمة ذات أهمية فقط إذا كان السمة StrokeLineJoin تحدد Miter.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | النسبة بين الحد الأقصى لطول الميتر ونصف سمك الخط. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


يضبط القيمة التي تحدد شكل بداية أول شرطة في الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | القيمة التي تحدد شكل بداية أول شرطة في الخط. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


يضبط سمك الخط، بوحدات مساحة الإحداثيات الفعّالة (تشمل تحويل العرض للمسار). يتم رسم الخط فوق حد الشكل المحدد بخصيصة Data لعنصر Path element\\u2019s Data property. نصف قيمة StrokeThickness يمتد خارج الشكل المحدد بخصيصة Data والنصف الآخر يمتد داخل الشكل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | سمك الخط. |

### size() {#size--}
```
public int size()
```


يعيد عدد العناصر الفرعية.

**Returns:**
int - عدد العناصر الفرعية.
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

