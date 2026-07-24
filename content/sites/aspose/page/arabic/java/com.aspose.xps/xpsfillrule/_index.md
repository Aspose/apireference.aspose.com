---
title: "XpsFillRule"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "القيم الصالحة لخاصية FillRule لعناصر PathGeometry."
type: docs
weight: 59
url: /ar/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

القيم الصالحة لخاصية FillRule لعنصر PathGeometry.
## الحقول

| حقل | الوصف |
| --- | --- |
| [EvenOdd](#EvenOdd) | تحدد هذه القاعدة \\u201cinsideness\\u201d لنقطة على اللوحة عن طريق رسم شعاع من النقطة إلى اللانهاية في أي اتجاه وعدّ عدد القطاعات من الشكل المعطى التي يقطعها الشعاع. |
| [NonZero](#NonZero) | تحدد هذه القاعدة \\u201cinsideness\\u201d لنقطة على اللوحة عن طريق رسم شعاع من النقطة إلى اللانهاية في أي اتجاه ثم فحص الأماكن التي يقطع فيها قطاع من الشكل الشعاع. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EvenOdd {#EvenOdd}
```
public static final XpsFillRule EvenOdd
```


تحدد هذه القاعدة \\u201cinsideness\\u201d لنقطة على اللوحة عن طريق رسم شعاع من النقطة إلى اللانهاية في أي اتجاه وعدّ عدد القطاعات من الشكل المعطى التي يقطعها الشعاع. إذا كان هذا العدد فرديًا، تكون النقطة داخل الشكل؛ إذا كان زوجيًا، تكون النقطة خارج الشكل.

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


تحدد هذه القاعدة \\u201cinsideness\\u201d لنقطة على اللوحة عن طريق رسم شعاع من النقطة إلى اللانهاية في أي اتجاه ثم فحص الأماكن التي يقطع فيها قطاع من الشكل الشعاع. بدءًا من عدٍّ يساوي صفر، أضف واحدًا في كل مرة يقطع فيها قطاع الشعاع من اليسار إلى اليمين واطرح واحدًا في كل مرة يقطع فيها قطاع المسار الشعاع من اليمين إلى اليسار. بعد عدّ التقاطعات، إذا كانت النتيجة صفرًا فإن النقطة تكون خارج المسار؛ وإلا فهي داخل المسار.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsFillRule valueOf(String name)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String |  |

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule)
### values() {#values--}
```
public static XpsFillRule[] values()
```




**Returns:**
com.aspose.xps.XpsFillRule[]
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

