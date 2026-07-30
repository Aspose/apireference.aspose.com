---
title: "CffUpdateStringIndexStrategy"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يحدد كيفية إضافة السلاسل إلى تخزين CFF String INDEX."
type: docs
weight: 134
url: /ar/java/com.aspose.font/cffupdatestringindexstrategy/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum CffUpdateStringIndexStrategy extends Enum<CffUpdateStringIndexStrategy>
```

يحدد كيفية إضافة السلاسل إلى تخزين CFF String INDEX. عندما نحاول إضافة سلسلة إلى CFF String INDEX، قد يحدث أن تكون هذه السلسلة موجودة بالفعل في String INDEX. باستخدام الخيار SearchForDuplicates يمكننا فرض البحث في String INDEX لاكتشاف ما إذا كانت هذه السلسلة موجودة أم لا. هذا النهج يوفر مساحة في بنية String INDEX، لكنه يتطلب وقتًا أكبر لإضافة السلسلة.
## الحقول

| حقل | الوصف |
| --- | --- |
| [AddStringAsIs](#AddStringAsIs) | يحدد أنه لا يجب إجراء أي فحوصات للتكرارات عند إضافة سلسلة. |
| [SearchForDuplicates](#SearchForDuplicates) | يحدد أن البحث عن السلسلة التي سيتم إضافتها يجب أن يتم في بنية String INDEX لتجنب إضافة التكرارات. |
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
### AddStringAsIs {#AddStringAsIs}
```
public static final CffUpdateStringIndexStrategy AddStringAsIs
```


يحدد أنه لا يجب إجراء أي فحوصات للتكرارات عند إضافة سلسلة. هذا النهج يعمل بشكل أسرع، لكنه قد يؤدي إلى استخدام غير فعال للذاكرة في String INDEX.

### SearchForDuplicates {#SearchForDuplicates}
```
public static final CffUpdateStringIndexStrategy SearchForDuplicates
```


يحدد أن البحث عن السلسلة التي سيتم إضافتها يجب أن يتم في بنية String INDEX لتجنب إضافة التكرارات.

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
boolean
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
public static CffUpdateStringIndexStrategy valueOf(String name)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String |  |

**Returns:**
[CffUpdateStringIndexStrategy](../../com.aspose.font/cffupdatestringindexstrategy)
### values() {#values--}
```
public static CffUpdateStringIndexStrategy[] values()
```




**Returns:**
com.aspose.font.CffUpdateStringIndexStrategy[]
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

