---
title: "XpsCanvas"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تجسد ميزات عنصر Canvas."
type: docs
weight: 16
url: /ar/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

فئة تُجَمِّع ميزات عنصر Canvas. هذا العنصر يجمع العناصر معًا. على سبيل المثال، يمكن تجميع عناصر Glyphs و Path في Canvas لتحديدها كوحدة (كوجهة رابط تشعبي) أو لتطبيق قيمة خاصية مركبة على كل عنصر فرعي وسلف.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | يضيف عنصرًا إلى قائمة العناصر الفرعية لهذا الـ canvas. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | يدرج عنصرًا في قائمة العناصر الفرعية لهذا الـ canvas في موضع الفهرس. |
| [addCanvas()](#addCanvas--) | يضيف canvas جديدًا إلى قائمة العناصر الفرعية لهذا الـ canvas. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | يضيف glyphs جديدة إلى قائمة العناصر الفرعية لهذا الـ canvas. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | يضيف path جديدًا إلى قائمة العناصر الفرعية لهذا الـ canvas. |
| [deepClone()](#deepClone--) | ينسخ هذا الـ canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | يوفر وصولاً إلى أبناء العنصر حسب الفهرس i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | يعيد هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |
| [getEdgeMode()](#getEdgeMode--) | يعيد القيمة التي تتحكم في كيفية عرض حواف الـ paths داخل الـ canvas. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | يعيد كائن هدف الارتباط التشعبي. |
| [getOpacity()](#getOpacity--) | يعيد القيمة التي تحدد الشفافية الموحدة للعنصر. |
| [getOpacityMask()](#getOpacityMask--) | يعيد الفرشاة التي تحدد قناع قيم ألفا المطبقة على العنصر بنفس طريقة خاصية الشفافية (Opacity)، ولكن تسمح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [getRenderTransform()](#getRenderTransform--) | يعيد مصفوفة التحويل المتجانس التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | يدرج canvas جديدًا في قائمة العناصر الفرعية لهذا الـ canvas في موضع الفهرس. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | يدرج glyphs جديدة في قائمة العناصر الفرعية لهذا الـ canvas في موضع الفهرس. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | يدرج path جديدًا في قائمة العناصر الفرعية لهذا الـ canvas في موضع الفهرس. |
| [iterator()](#iterator--) | تنفيذ واجهة Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | يضبط هندسة المسار التي تحدّ المنطقة المرسومة للعنصر. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | يضبط القيمة التي تتحكم في كيفية عرض حواف الـ paths داخل الـ canvas. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | يضبط كائن هدف الارتباط التشعبي. |
| [setOpacity(float value)](#setOpacity-float-) | يضبط القيمة التي تحدد الشفافية المتساوية للعنصر. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | يضبط الفرشاة التي تحدد قناعًا لقيم ألفا يُطبق على العنصر بنفس طريقة خاصية Opacity، مع السماح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | يضبط مصفوفة التحويل الأفيني التي تُنشئ إطار إحداثيات جديد لجميع خصائص العنصر ولكل العناصر الفرعية (إن وجدت). |
| [size()](#size--) | يعيد عدد العناصر الفرعية. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


يضيف عنصرًا إلى قائمة العناصر الفرعية لهذا الـ canvas.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| عنصر | T | العنصر المراد إضافته. |

**Returns:**
T - العنصر المضاف.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


يدرج عنصرًا في قائمة العناصر الفرعية لهذا الـ canvas في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج العنصر فيه. |
| عنصر | T | العنصر المراد إدراجه. |

**Returns:**
T - العنصر المُدرج.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


يضيف canvas جديدًا إلى قائمة العناصر الفرعية لهذا الـ canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


يضيف glyphs جديدة إلى قائمة العناصر الفرعية لهذا الـ canvas.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontFamily | java.lang.String | عائلة الخط. |
| fontSize | float | حجم الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي T الأصلي للـ Glyphs. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


يضيف path جديدًا إلى قائمة العناصر الفرعية لهذا الـ canvas.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


ينسخ هذا الـ canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


يعيد القيمة التي تتحكم في كيفية عرض حواف الـ paths داخل الـ canvas.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


يدرج canvas جديدًا في قائمة العناصر الفرعية لهذا الـ canvas في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج لوحة رسم جديدة فيه. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


يدرج glyphs جديدة في قائمة العناصر الفرعية لهذا الـ canvas في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج رموز جديدة فيه. |
| fontFamily | java.lang.String | عائلة الخط. |
| fontSize | float | حجم الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي T الأصلي للـ Glyphs. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


يدرج path جديدًا في قائمة العناصر الفرعية لهذا الـ canvas في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج مسار جديد فيه. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


يضبط القيمة التي تتحكم في كيفية عرض حواف الـ paths داخل الـ canvas.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | وضعية عرض الحافة. |

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

