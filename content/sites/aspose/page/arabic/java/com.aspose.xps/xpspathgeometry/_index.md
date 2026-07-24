---
title: "XpsPathGeometry"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تغلف ميزات عنصر خاصية PathGeometry."
type: docs
weight: 42
url: /ar/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

فئة تُغلف ميزات عنصر خاصية PathGeometry. يحتوي هذا العنصر على مجموعة من أشكال المسار المحددة إما بصفة Figures أو بعنصر PathFigure فرعي.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [add(T obj)](#add-T-) | يضيف كائنًا جديدًا إلى المصفوفة. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | يضيف مقطع مسار إلى قائمة المقاطع الفرعية للشكل الأخير. |
| [deepClone()](#deepClone--) | ينسخ هذا الشكل الهندسي للمسار. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | يوفر الوصول إلى عنصر المصفوفة عبر الفهرس i. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | يعيد القيمة التي تحدد كيفية دمج المناطق المتقاطعّة للأشكال الهندسية لتشكيل منطقة. |
| [getPathFigures()](#getPathFigures--) | يعيد قائمة أشكال المسار الفرعية. |
| [getTransform()](#getTransform--) | يعيد مصفوفة التحويل المتجانس التي تُنشئ التحويل المحلي للمصفوفة والذي يُطبق على جميع العناصر الفرعية والتابعة لشكل المسار قبل استخدامه في التعبئة أو القص أو التحديد. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | يدرج كائنًا جديدًا في المصفوفة في الموضع المحدد. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | يدرج مقطع مسار إلى قائمة المقاطع الفرعية للشكل الأخير في موضع الفهرس. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | يزيل كائنًا من المصفوفة. |
| [removeAt(int index)](#removeAt-int-) | يزيل كائنًا من المصفوفة في الموضع المحدد. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | يزيل مقطع مسار من قائمة المقاطع الفرعية للشكل الأخير. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | يزيل مقطع مسار من قائمة المقاطع الفرعية للشكل الأخير في موضع الفهرس. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | يضبط القيمة التي تحدد كيفية دمج المناطق المتقاطعّة للأشكال الهندسية لتشكيل منطقة. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | يضبط مصفوفة التحويل المتجانس التي تُنشئ التحويل المحلي للمصفوفة والذي يُطبق على جميع العناصر الفرعية والتابعة لشكل المسار قبل استخدامه في التعبئة أو القص أو التحديد. |
| [size()](#size--) | يرجع عدد العناصر. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


يضيف كائنًا جديدًا إلى المصفوفة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | T | الكائن المراد إضافته. |

**Returns:**
T - الكائن المضاف.
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


يضيف مقطع مسار إلى قائمة المقاطع الفرعية للشكل الأخير.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | مقطع المسار المراد إضافته. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


ينسخ هذا الشكل الهندسي للمسار.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
public T get(int i)
```


يوفر الوصول إلى عنصر المصفوفة عبر الفهرس i.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int | فهرس العنصر. |

**Returns:**
T - العنصر في الموضع i.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


يعيد القيمة التي تحدد كيفية دمج المناطق المتقاطعّة للأشكال الهندسية لتشكيل منطقة.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


يعيد قائمة أشكال المسار الفرعية.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - قائمة أشكال المسار الفرعية.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


يعيد مصفوفة التحويل المتجانس التي تُنشئ التحويل المحلي للمصفوفة والذي يُطبق على جميع العناصر الفرعية والتابعة لشكل المسار قبل استخدامه في التعبئة أو القص أو التحديد.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


يدرج كائنًا جديدًا في المصفوفة في الموضع المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يُدرج فيه الكائن. |
| كائن | T | الكائن المراد إدراجه. |

**Returns:**
T - الكائن المُدرج.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


يدرج مقطع مسار إلى قائمة المقاطع الفرعية للشكل الأخير في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج المقطع فيه. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | مقطع مسار ليتم إدراجه. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


يزيل كائنًا من المصفوفة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | T | الكائن المراد إزالته. |

**Returns:**
T - الكائن المُزال.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


يزيل كائنًا من المصفوفة في الموضع المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يُزال فيه الكائن. |

**Returns:**
T - الكائن المُزال.
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


يزيل مقطع مسار من قائمة المقاطع الفرعية للشكل الأخير.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | مقطع المسار المراد إزالته. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


يزيل مقطع مسار من قائمة المقاطع الفرعية للشكل الأخير في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إزالة مقطع المسار منه. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


يضبط القيمة التي تحدد كيفية دمج المناطق المتقاطعّة للأشكال الهندسية لتشكيل منطقة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | القيمة التي تحدد كيفية دمج المناطق المتقاطعّة للأشكال الهندسية لتشكيل منطقة. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


يضبط مصفوفة التحويل المتجانس التي تُنشئ التحويل المحلي للمصفوفة والذي يُطبق على جميع العناصر الفرعية والتابعة لشكل المسار قبل استخدامه في التعبئة أو القص أو التحديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | مصفوفة التحويل الأفيني. |

### size() {#size--}
```
public int size()
```


يرجع عدد العناصر.

**Returns:**
int - عدد العناصر.
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

