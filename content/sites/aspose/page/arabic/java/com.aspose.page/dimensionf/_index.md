---
title: "DimensionF"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة Dimension تُغلف العرض والارتفاع لمكوّن بدقة مفردة في كائن واحد."
type: docs
weight: 11
url: /ar/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

الفئة `Dimension` تغلف عرض وارتفاع مكوّن (بدقة مفردة) في كائن واحد.

عادةً ما تكون قيم `width` و `height` أعدادًا صحيحة غير سالبة. لا تمنع المُنشئات التي تسمح لك بإنشاء بُعد من تعيين قيمة سالبة لهذه الخصائص. إذا كانت قيمة `width` أو `height` سالبة، فإن سلوك بعض الطرق المعرفة بواسطة كائنات أخرى غير محدد.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [DimensionF()](#DimensionF--) | ينشئ نسخة من `Dimension` بعرض صفر وارتفاع صفر. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | ينشئ نسخة من `Dimension` يكون عرضها وارتفاعها نفس القيم للبعد المحدد. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | يبني كائن `Dimension` ويُهيئه بالعرض المحدد والارتفاع المحدد. |
## الحقول

| حقل | الوصف |
| --- | --- |
| [height](#height) | بعد الارتفاع؛ يمكن استخدام القيم السالبة. |
| [width](#width) | بعد العرض؛ يمكن استخدام القيم السالبة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | يتحقق مما إذا كان كائنان من النوع Dimension لهما قيم متساوية. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | يحصل على حجم كائن `Dimension` هذا. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | يرجع رمز التجزئة لهذا `Dimension`. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | يضبط حجم كائن `Dimension` هذا إلى الحجم المحدد. |
| [setSize(double width, double height)](#setSize-double-double-) | يضبط حجم كائن `Dimension` هذا إلى العرض والارتفاع المحددين بدقة مزدوجة. |
| [setSize(float width, float height)](#setSize-float-float-) | يضبط حجم كائن `Dimension` هذا إلى العرض والارتفاع المحددين. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | يرجع تمثيلًا نصيًا لقيم حقول `height` و `width` لكائن `Dimension` هذا. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


ينشئ نسخة من `Dimension` بعرض صفر وارتفاع صفر.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


ينشئ نسخة من `Dimension` يكون عرضها وارتفاعها نفس القيم للبعد المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | البُعد المحدد لقيم `width` و `height` |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


يبني كائن `Dimension` ويُهيئه بالعرض المحدد والارتفاع المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float | العرض المحدد |
| height | float | الارتفاع المحدد |

### height {#height}
```
public float height
```


بعد الارتفاع؛ يمكن استخدام القيم السالبة.

### width {#width}
```
public float width
```


بعد العرض؛ يمكن استخدام القيم السالبة.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


يتحقق مما إذا كان كائنان من النوع Dimension لهما قيم متساوية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | java.lang.Object |  |

**Returns:**
منطقي
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


يحصل على حجم هذا الكائن `Dimension`. تم تضمين هذه الطريقة للاكتمال، لتوازي طريقة `getSize` المعرفة بواسطة `Component`.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


يرجع رمز التجزئة لهذا `Dimension`.

**Returns:**
int - رمز تجزئة لهذا `Dimension`
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


يضبط حجم هذا الكائن `Dimension` إلى الحجم المحدد. تم تضمين هذه الطريقة للاكتمال، لتوازي طريقة `setSize` المعرفة بواسطة `Component`.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | الحجم الجديد لهذا الكائن `Dimension` |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


يضبط حجم هذا الكائن `Dimension` إلى العرض والارتفاع المحددين بدقة مزدوجة. لاحظ أنه إذا كان `width` أو `height` أكبر من `Integer.MAX_VALUE`، فسيتم إعادة تعيينهما إلى `Integer.MAX_VALUE`.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | double | العرض الجديد للكائن `Dimension` |
| height | double | الارتفاع الجديد للكائن `Dimension` |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


يضبط حجم هذا الكائن `Dimension` إلى العرض والارتفاع المحددين. تم تضمين هذه الطريقة للاكتمال، لتوازي طريقة `setSize` المعرفة بواسطة `Component`.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float | العرض الجديد لهذا الكائن `Dimension` |
| height | float | الارتفاع الجديد لهذا الكائن `Dimension` |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


يرجع تمثيلًا نصيًا لقيم حقول `height` و `width` لهذا الكائن `Dimension`. تم تصميم هذه الطريقة للاستخدام فقط لأغراض التصحيح، وقد يختلف المحتوى وتنسيق السلسلة المرتجعة بين التطبيقات. قد تكون السلسلة المرتجعة فارغة ولكن لا يمكن أن تكون `null`.

**Returns:**
java.lang.String - تمثيل نصي لهذا الكائن `Dimension`
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

