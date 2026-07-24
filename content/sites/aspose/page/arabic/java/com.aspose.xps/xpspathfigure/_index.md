---
title: "XpsPathFigure"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تغلف ميزات عنصر PathFigure."
type: docs
weight: 41
url: /ar/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

فئة تُجَمِّع ميزات عنصر PathFigure. يتكون هذا العنصر من مجموعة من مقطع واحد أو أكثر من الخط أو المنحنى.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [add(T obj)](#add-T-) | يضيف كائنًا جديدًا إلى المصفوفة. |
| [deepClone()](#deepClone--) | ينسخ هذا الشكل PathFigure. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | يوفر الوصول إلى عنصر المصفوفة عبر الفهرس i. |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | إرجاع قائمة مقاطع المسار الفرعية. |
| [getStartPoint()](#getStartPoint--) | يرجع نقطة البداية للمقطع الأول من الشكل PathFigure. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | يدرج كائنًا جديدًا في المصفوفة في الموضع المحدد. |
| [isClosed()](#isClosed--) | يرجع القيمة التي تشير إلى ما إذا كان الشكل PathFigure مغلقًا. |
| [isFilled()](#isFilled--) | يرجع القيمة التي تشير إلى ما إذا كان الشكل PathFigure يُستخدم في حساب مساحة الهندسة المسار المحتوية. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | يزيل كائنًا من المصفوفة. |
| [removeAt(int index)](#removeAt-int-) | يزيل كائنًا من المصفوفة في الموضع المحدد. |
| [setClosed(boolean value)](#setClosed-boolean-) | يضبط القيمة التي تشير إلى ما إذا كان الشكل PathFigure مغلقًا. |
| [setFilled(boolean value)](#setFilled-boolean-) | يضبط القيمة التي تشير إلى ما إذا كان الشكل PathFigure يُستخدم في حساب مساحة الهندسة المسار المحتوية. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | يضبط نقطة البداية للمقطع الأول من الشكل PathFigure. |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


ينسخ هذا الشكل PathFigure.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


إرجاع قائمة مقاطع المسار الفرعية.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - قائمة مقاطع المسار الفرعية.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


يرجع نقطة البداية للمقطع الأول من الشكل PathFigure.

**Returns:**
java.awt.geom.Point2D - نقطة البداية للمقطع الأول من الشكل PathFigure.
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


يرجع القيمة التي تشير إلى ما إذا كان الشكل PathFigure مغلقًا.

**Returns:**
boolean - القيمة التي تشير إلى ما إذا كان شكل المسار مغلقًا.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


يرجع القيمة التي تشير إلى ما إذا كان الشكل PathFigure يُستخدم في حساب مساحة الهندسة المسار المحتوية.

**Returns:**
boolean - القيمة التي تشير إلى ما إذا كان شكل المسار يُستخدم في حساب مساحة الهندسة المتضمنة للمسار.
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


يضبط القيمة التي تشير إلى ما إذا كان الشكل PathFigure مغلقًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | منطقي | القيمة التي تشير إلى ما إذا كان شكل المسار مغلقًا. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


يضبط القيمة التي تشير إلى ما إذا كان الشكل PathFigure يُستخدم في حساب مساحة الهندسة المسار المحتوية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | منطقي | القيمة التي تشير إلى ما إذا كان شكل المسار يُستخدم في حساب مساحة الهندسة المتضمنة للمسار. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


يضبط نقطة البداية للمقطع الأول من الشكل PathFigure.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |

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

