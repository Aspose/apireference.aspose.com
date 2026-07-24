---
title: "XpsContentElement"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يحتوي على ميزات عناصر محتوى XPS Canvas Path و Glyphs."
type: docs
weight: 18
url: /ar/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

تجسد ميزات عناصر محتوى XPS: Canvas و Path و Glyphs.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | يوفر وصولاً إلى أبناء العنصر حسب الفهرس i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | يعيد هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | يعيد كائن هدف الارتباط التشعبي. |
| [getOpacity()](#getOpacity--) | يعيد القيمة التي تحدد الشفافية الموحدة للعنصر. |
| [getOpacityMask()](#getOpacityMask--) | يعيد الفرشاة التي تحدد قناع قيم ألفا المطبقة على العنصر بنفس طريقة خاصية الشفافية (Opacity)، ولكن تسمح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [getRenderTransform()](#getRenderTransform--) | يعيد مصفوفة التحويل المتجانس التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | تنفيذ واجهة Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | يضبط هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | يضبط كائن هدف الارتباط التشعبي. |
| [setOpacity(float value)](#setOpacity-float-) | يضبط القيمة التي تحدد الشفافية المتساوية للعنصر. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | يضبط الفرشاة التي تحدد قناعًا لقيم ألفا يُطبق على العنصر بنفس طريقة خاصية Opacity، مع السماح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | يضبط مصفوفة التحويل الأفيني التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت). |
| [size()](#size--) | يعيد عدد العناصر الفرعية. |
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

