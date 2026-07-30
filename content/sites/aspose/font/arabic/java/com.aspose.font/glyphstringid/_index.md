---
title: "GlyphStringId"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل معرّف حرف السلسلة."
type: docs
weight: 54
url: /ar/java/com.aspose.font/glyphstringid/
---
**Inheritance:**
java.lang.Object, [com.aspose.font/GlyphId](../../com.aspose.font/glyphid)
```
public class GlyphStringId extends GlyphId
```

يمثل معرّف حرف السلسلة.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [GlyphStringId(String value)](#GlyphStringId-java.lang.String-) | ينشئ كائن GlyphStringID جديد. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | يرجع صحيح إذا كانت معرفات السلسلة متساوية. |
| [getClass()](#getClass--) |  |
| [getNotDefId()](#getNotDefId--) | يحصل على معرف glyph غير معرف. |
| [getValue()](#getValue--) | يحصل على قيمة السلسلة. |
| [hashCode()](#hashCode--) | تنفيذ GetHashCode. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | يرجع صحيح إذا كان معرفا glyph متساويين. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | يرجع صحيح إذا كان معرفا glyph غير متساويين. |
| [setValue(String value)](#setValue-java.lang.String-) | يضبط قيمة السلسلة. |
| [toGlyphStringId()](#toGlyphStringId--) | تحويل GlyphId إلى GlyphStringId |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | تحويل افتراضي إلى GlyphUInt32Id. |
| [toString()](#toString--) | يعيد قيمة السلسلة للمعرف glyph id. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### GlyphStringId(String value) {#GlyphStringId-java.lang.String-}
```
public GlyphStringId(String value)
```


ينشئ كائن GlyphStringID جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | معرف الرمز. |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


يرجع صحيح إذا كانت معرفات السلسلة متساوية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | java.lang.Object | معرف سلسلة Glyph للمقارنة معه. |

**Returns:**
boolean - نتيجة المقارنة
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getNotDefId() {#getNotDefId--}
```
public static GlyphStringId getNotDefId()
```


يحصل على معرف glyph غير معرف.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - Not defined glyph id.
### getValue() {#getValue--}
```
public String getValue()
```


يحصل على قيمة السلسلة.

**Returns:**
java.lang.String - قيمة السلسلة.
### hashCode() {#hashCode--}
```
public int hashCode()
```


تنفيذ GetHashCode.

**Returns:**
int - قيمة التجزئة للكائن.
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
### setValue(String value) {#setValue-java.lang.String-}
```
public void setValue(String value)
```


يضبط قيمة السلسلة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | قيمة السلسلة. |

### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


تحويل GlyphId إلى GlyphStringId

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - this
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


تحويل افتراضي إلى GlyphUInt32Id. GlyphUInt32Id يتجاوز لإرجاع نسخة.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public String toString()
```


يعيد قيمة السلسلة للمعرف glyph id.

**Returns:**
java.lang.String - معرف Glyph.
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

