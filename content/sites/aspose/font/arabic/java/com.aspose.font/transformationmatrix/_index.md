---
title: "TransformationMatrix"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل مصفوفة 3x3  A   B   0   C   D   0   TX  TY  1 ."
type: docs
weight: 78
url: /ar/java/com.aspose.font/transformationmatrix/
---
**Inheritance:**
java.lang.Object
```
public class TransformationMatrix
```

يمثل مصفوفة 3x3 | A B 0 | | C D 0 | | TX TY 1 |. يحول الإحداثيات بالطريقة التالية: x1 = A\*x + C\*y + TX y1 = B\*x + D\*y + TY.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix--) | ينشئ مصفوفة قياسية 1 إلى 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] |
| [TransformationMatrix(double[] matrixArray)](#TransformationMatrix-double---) | يقبل مصفوفة تحويل بالتمثيل الصفيفي التالي: [ A B C D TX TY ] |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | يوفر وصولًا إلى المصفوفة الأساسية. |
| [getA()](#getA--) | يحصل على قيمة مصفوفة التحويل A. |
| [getB()](#getB--) | يحصل على قيمة مصفوفة التحويل B. |
| [getC()](#getC--) | يحصل على قيمة مصفوفة التحويل C. |
| [getClass()](#getClass--) |  |
| [getD()](#getD--) | يحصل على قيمة مصفوفة التحويل D. |
| [getTX()](#getTX--) | يحصل على قيمة مصفوفة التحويل TX. |
| [getTY()](#getTY--) | يحصل على قيمة مصفوفة التحويل TY. |
| [hashCode()](#hashCode--) |  |
| [multiply(TransformationMatrix matrix)](#multiply-com.aspose.font.TransformationMatrix-) | يضرب مع مصفوفة تحويل أخرى. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(double x, double y, double[] x1, double[] y1)](#scale-double-double-double---double---) | يقوم بتحجيم x و y باستخدام مصفوفة التحويل: x1 = A\*x + C\*y; y1 = B\*x + D\*y. |
| [setA(double value)](#setA-double-) | يضبط قيمة مصفوفة التحويل A. |
| [setB(double value)](#setB-double-) | يضبط قيمة مصفوفة التحويل B. |
| [setC(double value)](#setC-double-) | يضبط قيمة مصفوفة التحويل C. |
| [setD(double value)](#setD-double-) | يضبط قيمة مصفوفة التحويل D. |
| [setTX(double value)](#setTX-double-) | يضبط قيمة مصفوفة التحويل TX. |
| [setTY(double value)](#setTY-double-) | يضبط قيمة مصفوفة التحويل TY. |
| [toArray()](#toArray--) | يخصص مصفوفة جديدة، ينسخ مصفوفة التحويل ويعيدها. |
| [toString()](#toString--) |  |
| [transform(double x, double y, double[] x1, double[] y1)](#transform-double-double-double---double---) | يحول x و y باستخدام مصفوفة التحويل: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY. |
| [unScale(double x1, double y1, double[] x, double[] y)](#unScale-double-double-double---double---) | يعيد تحجيم x1 و y1 ويعيد x و y قبل مصفوفة التحويل. |
| [unTransform(double x1, double y1, double[] x, double[] y)](#unTransform-double-double-double---double---) | يعيد تحويل x1 و y1 ويعيد x و y قبل مصفوفة التحويل. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformationMatrix() {#TransformationMatrix--}
```
public TransformationMatrix()
```


ينشئ مصفوفة قياسية 1 إلى 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]

### TransformationMatrix(double[] matrixArray) {#TransformationMatrix-double---}
```
public TransformationMatrix(double[] matrixArray)
```


يقبل مصفوفة تحويل بالتمثيل الصفيفي التالي: [ A B C D TX TY ]

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| matrixArray | double[] | مصفوفة تحتوي على قيم مصفوفة التحويل، يجب أن تحتوي على 6 عناصر. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public double get(int index)
```


يوفر وصولًا إلى المصفوفة الأساسية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الفهرس في مصفوفة مصفوفة التحويل. |

**Returns:**
double - العنصر في المصفوفة الأساسية حسب الفهرس.
### getA() {#getA--}
```
public double getA()
```


يحصل على قيمة مصفوفة التحويل A.

**Returns:**
double - قيمة في مصفوفة التحويل.
### getB() {#getB--}
```
public double getB()
```


يحصل على قيمة مصفوفة التحويل B.

**Returns:**
double - قيمة B في مصفوفة التحويل.
### getC() {#getC--}
```
public double getC()
```


يحصل على قيمة مصفوفة التحويل C.

**Returns:**
double - قيمة C في مصفوفة التحويل.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getD() {#getD--}
```
public double getD()
```


يحصل على قيمة مصفوفة التحويل D.

**Returns:**
double - قيمة D في مصفوفة التحويل.
### getTX() {#getTX--}
```
public double getTX()
```


يحصل على قيمة مصفوفة التحويل TX.

**Returns:**
double - قيمة TX في مصفوفة التحويل.
### getTY() {#getTY--}
```
public double getTY()
```


يحصل على قيمة مصفوفة التحويل TY.

**Returns:**
double - قيمة TY في مصفوفة التحويل.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### multiply(TransformationMatrix matrix) {#multiply-com.aspose.font.TransformationMatrix-}
```
public TransformationMatrix multiply(TransformationMatrix matrix)
```


يضرب مع مصفوفة تحويل أخرى. لا يغيّر مصفوفة التحويل الأصلية، ويعيد كائن TransformationMatrix جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | مصفوفة التحويل للضرب معها. |

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - New TransformationMatrix object.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### scale(double x, double y, double[] x1, double[] y1) {#scale-double-double-double---double---}
```
public void scale(double x, double y, double[] x1, double[] y1)
```


يقوم بتحجيم x و y باستخدام مصفوفة التحويل: x1 = A\*x + C\*y; y1 = B\*x + D\*y.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | double | الإحداثي x الأصلي |
| y | double | الإحداثي y الأصلي. |
| x1 | double[] | الإحداثي x بعد التحجيم. |
| y1 | double[] | الإحداثي y بعد التحجيم. |

### setA(double value) {#setA-double-}
```
public void setA(double value)
```


يضبط قيمة مصفوفة التحويل A.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة A في مصفوفة التحويل. |

### setB(double value) {#setB-double-}
```
public void setB(double value)
```


يضبط قيمة مصفوفة التحويل B.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة B في مصفوفة التحويل. |

### setC(double value) {#setC-double-}
```
public void setC(double value)
```


يضبط قيمة مصفوفة التحويل C.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة C في مصفوفة التحويل. |

### setD(double value) {#setD-double-}
```
public void setD(double value)
```


يضبط قيمة مصفوفة التحويل D.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة D في مصفوفة التحويل. |

### setTX(double value) {#setTX-double-}
```
public void setTX(double value)
```


يضبط قيمة مصفوفة التحويل TX.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة مصفوفة التحويل TX. |

### setTY(double value) {#setTY-double-}
```
public void setTY(double value)
```


يضبط قيمة مصفوفة التحويل TY.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة مصفوفة التحويل TY. |

### toArray() {#toArray--}
```
public double[] toArray()
```


يخصص مصفوفة جديدة، ينسخ مصفوفة التحويل ويعيدها.

**Returns:**
double[] - مصفوفة التحويل في شكل مصفوفة.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(double x, double y, double[] x1, double[] y1) {#transform-double-double-double---double---}
```
public void transform(double x, double y, double[] x1, double[] y1)
```


يحول x و y باستخدام مصفوفة التحويل: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | double | الإحداثي x الأصلي. |
| y | double | الإحداثي y الأصلي. |
| x1 | double[] | الإحداثي x المحوَّل. |
| y1 | double[] | الإحداثي y المحوَّل. |

### unScale(double x1, double y1, double[] x, double[] y) {#unScale-double-double-double---double---}
```
public void unScale(double x1, double y1, double[] x, double[] y)
```


يعيد تحجيم x1 و y1 ويعيد x و y قبل مصفوفة التحويل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x1 | double | الإحداثي x1 |
| y1 | double | الإحداثي y1 |
| x | double[] | الإحداثي x معاد تحجيمه. |
| y | double[] | الإحداثي y معاد تحجيمه. |

### unTransform(double x1, double y1, double[] x, double[] y) {#unTransform-double-double-double---double---}
```
public void unTransform(double x1, double y1, double[] x, double[] y)
```


يعيد تحويل x1 و y1 ويعيد x و y قبل مصفوفة التحويل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x1 | double | الإحداثي x1. |
| y1 | double | الإحداثي y1. |
| x | double[] | الإحداثي x معاد تحويله. |
| y | double[] | الإحداثي y معاد تحويله. |

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

