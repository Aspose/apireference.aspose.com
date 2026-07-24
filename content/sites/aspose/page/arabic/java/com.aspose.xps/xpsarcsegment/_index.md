---
title: "XpsArcSegment"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تجسد ميزات عنصر ArcSegment."
type: docs
weight: 13
url: /ar/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

فئة تُغلف ميزات عنصر ArcSegment. هذا العنصر يصف قوسًا إهليلجيًا.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ هذا القوس. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | يعيد نقطة النهاية للقوس الإهليلجي. |
| [getRotationAngle()](#getRotationAngle--) | يعيد القيمة التي تشير إلى كيفية دوران الإهليلج بالنسبة إلى نظام الإحداثيات الحالي. |
| [getSize()](#getSize--) | يعيد نصف القطر x و y للقوس الإهليلجي كزوج x,y. |
| [getSweepDirection()](#getSweepDirection--) | يعيد القيمة التي تحدد الاتجاه الذي يُرسم فيه القوس. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | يعيد القيمة التي تحدد ما إذا كان القوس يُرسم بزاوية انقضاض 180 درجة أو أكثر. |
| [isStroked()](#isStroked--) | يعيد القيمة التي تحدد ما إذا كان الحد لهذا الجزء من المسار مرسومًا. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | يضبط القيمة التي تحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | يضبط نقطة النهاية للقوس الإهليلجي. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | يضبط القيمة التي تشير إلى كيفية دوران الإهليلج بالنسبة لنظام الإحداثيات الحالي. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | يضبط نصفَي القطر x و y للقوس الإهليلجي كزوج x,y. |
| [setStroked(boolean value)](#setStroked-boolean-) | يضبط القيمة التي تحدد ما إذا كان الحد لهذا الجزء من المسار مرسومًا. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | يضبط القيمة التي تحدد الاتجاه الذي يُرسم فيه القوس. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


ينسخ هذا القوس.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


يعيد نقطة النهاية للقوس الإهليلجي.

**Returns:**
java.awt.geom.Point2D - نقطة النهاية للقوس الإهليلجي.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


يعيد القيمة التي تشير إلى كيفية دوران الإهليلج بالنسبة إلى نظام الإحداثيات الحالي.

**Returns:**
float - القيمة التي تشير إلى كيفية دوران الإهليلج بالنسبة لنظام الإحداثيات الحالي.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


يعيد نصف القطر x و y للقوس الإهليلجي كزوج x,y.

**Returns:**
java.awt.geom.Dimension2D - نصفَي القطر x و y للقوس الإهليلجي كزوج x,y.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


يعيد القيمة التي تحدد الاتجاه الذي يُرسم فيه القوس.

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


يعيد القيمة التي تحدد ما إذا كان القوس يُرسم بزاوية انقضاض 180 درجة أو أكثر.

**Returns:**
boolean - القيمة التي تحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


يعيد القيمة التي تحدد ما إذا كان الحد لهذا الجزء من المسار مرسومًا.

**Returns:**
boolean - القيمة التي تحدد ما إذا كان الحد لهذا الجزء من المسار مرسومًا.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


يضبط القيمة التي تحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | منطقي | القيمة التي تحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


يضبط نقطة النهاية للقوس الإهليلجي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Point2D | نقطة النهاية للقوس الإهليلجي. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


يضبط القيمة التي تشير إلى كيفية دوران الإهليلج بالنسبة لنظام الإحداثيات الحالي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | القيمة التي تشير إلى كيفية دوران الإهليلج بالنسبة لنظام الإحداثيات الحالي. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


يضبط نصفَي القطر x و y للقوس الإهليلجي كزوج x,y.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Dimension2D | نصف القطر x و y للقوس الإهليلجي كزوج x,y. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


يضبط القيمة التي تحدد ما إذا كان الحد لهذا الجزء من المسار مرسومًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | منطقي | القيمة التي تحدد ما إذا كان الحد لهذا الجزء من المسار مرسومًا. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


يضبط القيمة التي تحدد الاتجاه الذي يُرسم فيه القوس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | القيمة التي تحدد الاتجاه الذي يُرسم فيه القوس. |

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

