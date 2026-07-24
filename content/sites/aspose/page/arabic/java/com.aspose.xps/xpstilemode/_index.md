---
title: "XpsTileMode"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "القيم الصالحة لخاصية TileMode لفرش التبليط."
type: docs
weight: 66
url: /ar/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

القيم الصالحة لخاصية TileMode لفرش التبليط.
## الحقول

| حقل | الوصف |
| --- | --- |
| [FlipX](#FlipX) | ترتيب البلاط مشابه لوضع Tile، لكن الأعمدة المتناوبة من البلاط تُقلب أفقيًا. |
| [FlipXY](#FlipXY) | ترتيب البلاط مشابه لوضع Tile، لكن الأعمدة المتناوبة من البلاط تُقلب أفقيًا والصفوف المتناوبة تُقلب عموديًا. |
| [FlipY](#FlipY) | ترتيب البلاط مشابه لوضع Tile، لكن الصفوف المتناوبة من البلاط تُقلب عموديًا. |
| [None](#None) | في هذا الوضع، يُرسم البلاط الأساسي الوحيد فقط. |
| [Tile](#Tile) | في هذا الوضع، يُرسم البلاط الأساسي وتُملأ المنطقة المتبقية بتكرار البلاط الأساسي بحيث يلتصق الحافة اليمنى لكل بلاط بالحد الأيسر للبلاط التالي، وتلتحق الحافة السفلية لكل بلاط بالحد العلوي للبلاط التالي. |
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
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


ترتيب البلاط مشابه لوضع Tile، لكن الأعمدة المتناوبة من البلاط تُقلب أفقيًا. يُوضع البلاط الأساسي كما هو محدد في مساحة العرض. تُقلب البلاطات في الأعمدة إلى اليسار واليمين من هذا البلاط أفقيًا.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


ترتيب البلاط مشابه لوضع Tile، لكن الأعمدة المتناوبة من البلاط تُقلب أفقيًا والصفوف المتناوبة تُقلب عموديًا. يُوضع البلاط الأساسي كما هو محدد في مساحة العرض.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


ترتيب البلاط مشابه لوضع Tile، لكن الصفوف المتناوبة من البلاط تُقلب عموديًا. يُوضع البلاط الأساسي كما هو محدد في مساحة العرض. تُقلب الصفوف فوق وتحت عموديًا.

### None {#None}
```
public static final XpsTileMode None
```


في هذا الوضع، يُرسم البلاط الأساسي الوحيد فقط. تُترك المنطقة المتبقية شفافة.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


في هذا الوضع، يُرسم البلاط الأساسي وتُملأ المنطقة المتبقية بتكرار البلاط الأساسي بحيث يلتصق الحافة اليمنى لكل بلاط بالحد الأيسر للبلاط التالي، وتلتحق الحافة السفلية لكل بلاط بالحد العلوي للبلاط التالي.

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
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
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

