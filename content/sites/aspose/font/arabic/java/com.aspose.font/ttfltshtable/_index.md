---
title: "TtfLtshTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول العتبة الخطية لملف خط TTF."
type: docs
weight: 103
url: /ar/java/com.aspose.font/ttfltshtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfLtshTable extends TtfTableBase
```

يمثل جدول العتبة الخطية لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNumGlyphs()](#getNumGlyphs--) | يحصل على عدد الرموز (من "numGlyphs" في جدول 'maxp'). |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [getVersion()](#getVersion--) | يحصل على نسخة الجدول. |
| [getYPel(int glyphNum)](#getYPel-int-) | يعيد ارتفاع الـ pel العمودي للglyph/zero إذا كان رقم glyph غير صحيح. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


يحصل على عدد الرموز (من "numGlyphs" في جدول 'maxp').

**Returns:**
int - عدد الرموز (من "numGlyphs" في جدول 'maxp').
### getOffset() {#getOffset--}
```
public long getOffset()
```


يحصل على الإزاحة من بداية sfnt.

**Returns:**
long - إزاحة من بداية sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


يحصل على علامة الجدول.

**Returns:**
java.lang.String - علامة الجدول.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


مرجع إلى مستودع جدول TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public int getVersion()
```


يحصل على نسخة الجدول.

**Returns:**
int - إصدار الجدول.
### getYPel(int glyphNum) {#getYPel-int-}
```
public byte getYPel(int glyphNum)
```


يعيد ارتفاع الـ pel العمودي للglyph/zero إذا كان رقم glyph غير صحيح.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphNum | int | رقم رمز (فهرس). |

**Returns:**
byte - ارتفاع الـ pel العمودي للglyph/zero إذا كان رقم glyph غير صحيح.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

