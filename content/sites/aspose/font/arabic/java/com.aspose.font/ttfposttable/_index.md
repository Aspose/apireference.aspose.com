---
title: "TtfPostTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول post لملف خط TTF."
type: docs
weight: 107
url: /ar/java/com.aspose.font/ttfposttable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfPostTable extends TtfTableBase
```

يمثل جدول "post" لملف خط TTF
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | يحصل على مصفوفة فهارس الرموز حسب اسم الرمز. |
| [getClass()](#getClass--) |  |
| [getFormat()](#getFormat--) | يحصل على التنسيق الثابت (الإصدار) لهذا الجدول. |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | يحصل على فهرس الرمز حسب اسم الرمز. |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | يحصل على اسم الرمز حسب فهرس الرمز. |
| [getItalicAngle()](#getItalicAngle--) | يحصل على fixed italicAngle الزاوية المائلة بالدرجات. |
| [getMaxMemType1()](#getMaxMemType1--) | يحصل على uint32 maxMemType1 الحد الأقصى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 1. |
| [getMaxMemType42()](#getMaxMemType42--) | يحصل على uint32 maxMemType42 الحد الأقصى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 42. |
| [getMinMemType1()](#getMinMemType1--) | يحصل على uint32 minMemType1 الحد الأدنى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 1. |
| [getMinMemType42()](#getMinMemType42--) | يحصل على uint32 minMemType42 الحد الأدنى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 42. |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTableFormat()](#getTableFormat--) | يحصل على fixed format (الإصدار) لهذا الجدول. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [getUnderlinePosition()](#getUnderlinePosition--) | يحصل على FWord underlinePosition موضع الخط السفلي. |
| [getUnderlineThickness()](#getUnderlineThickness--) | يحصل على FWord underlineThickness سمك الخط السفلي. |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | يشير إلى عدم توفير معلومات اسم PostScript للرموز في ملف الخط هذا. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | يحصل على uint32 isFixedPitch. 0 إذا كان الخط متباعدًا بنسبية، غير صفر إذا كان الخط غير متباعد بنسبية (أي ثابت العرض). |
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
### getAllGlyphIndexesForGlyphName(String glyphName) {#getAllGlyphIndexesForGlyphName-java.lang.String-}
```
public long[] getAllGlyphIndexesForGlyphName(String glyphName)
```


يحصل على مصفوفة فهارس الرموز حسب اسم الرمز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | java.lang.String | اسم الرمز |

**Returns:**
long[] - مصفوفة من فهارس الرموز
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFormat() {#getFormat--}
```
public float getFormat()
```


يحصل على التنسيق الثابت (الإصدار) لهذا الجدول.

**Returns:**
float - Fixed format (الإصدار) لهذا الجدول.
### getGlyphIndex(String glyphName) {#getGlyphIndex-java.lang.String-}
```
public long getGlyphIndex(String glyphName)
```


يحصل على فهرس الرمز حسب اسم الرمز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | java.lang.String | اسم الرمز. |

**Returns:**
long - فهرس الرمز. عندما لا يتم توفير معلومات اسم PostScript للرموز في ملف الخط هذا، يُرجع الفهرس 0، وهو الرمز غير المعرف أو الرمز \".notdef\".
### getGlyphName(long glyphIndex) {#getGlyphName-long-}
```
public String getGlyphName(long glyphIndex)
```


يحصل على اسم الرمز حسب فهرس الرمز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphIndex | long | فهرس الرمز. |

**Returns:**
java.lang.String - اسم الرمز. عندما لا يتم توفير معلومات اسم PostScript للرموز في ملف الخط هذا، يُرجع null.
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


يحصل على fixed italicAngle الزاوية المائلة بالدرجات.

**Returns:**
float - Fixed italicAngle الزاوية المائلة بالدرجات.
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


يحصل على uint32 maxMemType1 الحد الأقصى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 1.

**Returns:**
long - UInt32 maxMemType1 الحد الأقصى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 1.
### getMaxMemType42() {#getMaxMemType42--}
```
public long getMaxMemType42()
```


يحصل على uint32 maxMemType42 الحد الأقصى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 42.

**Returns:**
long - UInt32 maxMemType42 الحد الأقصى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 42.
### getMinMemType1() {#getMinMemType1--}
```
public long getMinMemType1()
```


يحصل على uint32 minMemType1 الحد الأدنى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 1.

**Returns:**
long - UInt32 minMemType1 الحد الأدنى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 1.
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


يحصل على uint32 minMemType42 الحد الأدنى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 42.

**Returns:**
long - UInt32 minMemType42 الحد الأدنى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كخط Type 42.
### getOffset() {#getOffset--}
```
public long getOffset()
```


يحصل على الإزاحة من بداية sfnt.

**Returns:**
long - إزاحة من بداية sfnt.
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


يحصل على fixed format (الإصدار) لهذا الجدول. استخدم الخصائص MajorNumber و MinorNUmber للكائن Version16Dot16 في التدوين السداسي عشري لتحديد الإصدار المستخدم.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
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
### getUnderlinePosition() {#getUnderlinePosition--}
```
public short getUnderlinePosition()
```


يحصل على FWord underlinePosition موضع الخط السفلي.

**Returns:**
short - FWord underlinePosition موضع الخط السفلي.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public short getUnderlineThickness()
```


يحصل على FWord underlineThickness سمك الخط السفلي.

**Returns:**
short - FWord underlineThickness سمك الخط السفلي.
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


يشير إلى عدم توفير معلومات اسم PostScript للرموز في ملف الخط هذا.

**Returns:**
boolean - True إذا لم يتم توفير معلومات اسم PostScript للرموز في ملف الخط هذا. False خلاف ذلك.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public long isFixedPitch()
```


يحصل على uint32 isFixedPitch. 0 إذا كان الخط متباعدًا بنسبية، غير صفر إذا كان الخط غير متباعد بنسبية (أي ثابت العرض).

**Returns:**
long - UInt32 isFixedPitch. 0 إذا كان الخط متباعدًا بنسبية، غير صفر إذا كان الخط غير متباعد بنسبية (أي ثابت العرض).
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

