---
title: "GlyphId"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل معرفات الحروف المتاحة في الخط."
type: docs
weight: 50
url: /ar/java/com.aspose.font/glyphid/
---
**Inheritance:**
java.lang.Object
```
public abstract class GlyphId
```

يمثل معرفات الحروف المتاحة في الخط. معرف الحرف هو رقم فريد للحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم حرف، وهو مثال من الفئة ( GlyphStringId ). معرف TTF هو فهرس عدد صحيح، وهو مثال من الفئة ( GlyphUInt32Id ).
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | يرجع صحيح إذا كان معرفا glyph غير متساويين. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | يعيد قيمة التجزئة (hashcode) للكائن. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | يرجع صحيح إذا كان معرفا glyph متساويين. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | يرجع صحيح إذا كان معرفا glyph غير متساويين. |
| [toGlyphStringId()](#toGlyphStringId--) | تحويل افتراضي إلى GlyphStringId. |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | تحويل افتراضي إلى GlyphUInt32Id. |
| [toString()](#toString--) | يعيد تمثيلًا نصيًا لمعرفة الحرف. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


يرجع صحيح إذا كان معرفا glyph غير متساويين.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | java.lang.Object | معرف الحرف للمقارنة به. |

**Returns:**
boolean - نتيجة المقارنة.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


يعيد قيمة التجزئة (hashcode) للكائن.

**Returns:**
int - قيمة التجزئة (hashcode) للكائن.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(GlyphId obj1, Object obj2) {#op-Equality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Equality(GlyphId obj1, Object obj2)
```


يرجع صحيح إذا كان معرفا glyph متساويين.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | المعرف glyph الأول للمقارنة. |
| obj2 | java.lang.Object | المعرف glyph الثاني للمقارنة. |

**Returns:**
boolean - نتيجة المقارنة.
### op_Inequality(GlyphId obj1, Object obj2) {#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Inequality(GlyphId obj1, Object obj2)
```


يرجع صحيح إذا كان معرفا glyph غير متساويين.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | المعرف glyph الأول للمقارنة. |
| obj2 | java.lang.Object | المعرف glyph الثاني للمقارنة. |

**Returns:**
boolean - نتيجة المقارنة.
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


تحويل افتراضي إلى GlyphStringId. GlyphStringId يتجاوز لإرجاع نسخة.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


تحويل افتراضي إلى GlyphUInt32Id. GlyphUInt32Id يتجاوز لإرجاع نسخة.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public abstract String toString()
```


يعيد تمثيلًا نصيًا لمعرفة الحرف.

**Returns:**
java.lang.String - معرف الحرف
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

