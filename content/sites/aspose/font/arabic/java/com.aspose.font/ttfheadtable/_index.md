---
title: "TtfHeadTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول الرأس لملف الخط TTF."
type: docs
weight: 99
url: /ar/java/com.aspose.font/ttfheadtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHeadTable extends TtfTableBase
```

يمثل جدول "head" لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | يحصل على uint32 checkSumAdjustment. |
| [getClass()](#getClass--) |  |
| [getCreated()](#getCreated--) | يحصل على longDateTime تاريخ إنشائي دولي. |
| [getFlags()](#getFlags--) | يحصل على uint16 flags. |
| [getFontDirectionHint()](#getFontDirectionHint--) | يحصل على int16 fontDirectionHint. 0 رموز مختلطة الاتجاه؛ 1 رموز من اليسار إلى اليمين فقط؛ 2 مثل 1 ولكن يحتوي أيضًا على محايد؛ -1 رموز من اليمين إلى اليسار فقط؛ -2 مثل -1 ولكن يحتوي أيضًا على محايد. |
| [getFontRevision()](#getFontRevision--) | احصل على fixed fontRevision الذي يحدده صانع الخط. |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | يحصل على int16 glyphDataFormat 0 للتنسيق الحالي. |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | يحصل على int16 indexToLocFormat 0 للإزاحات القصيرة، 1 للطويلة. |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | يحصل على uint16 lowestRecPPEM أصغر حجم قابل للقراءة بالبكسل. |
| [getMacStyle()](#getMacStyle--) | يحصل على uint16 macStyle. |
| [getMagicNumber()](#getMagicNumber--) | يحصل على uint32 magicNumber المحدد إلى 0x5F0F3CF5. |
| [getModified()](#getModified--) | يحصل على longDateTime تاريخ تعديل دولي. |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [getUnitsPerEM()](#getUnitsPerEM--) | يحصل على uint16 unitsPerEM النطاق من 64 إلى 16384. |
| [getVersion()](#getVersion--) | الإصدار Fixed 0x00010000 إذا (الإصدار 1.0). |
| [getXMax()](#getXMax--) | يحصل على FWord xMax لجميع صناديق حدود الرموز. |
| [getXMin()](#getXMin--) | يحصل على FWord xMin لجميع صناديق حدود الرموز. |
| [getYMax()](#getYMax--) | يحصل على FWord yMax لجميع صناديق حدود الرموز. |
| [getYMin()](#getYMin--) | يحصل على FWord yMin لجميع صناديق حدود الرموز. |
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
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


يحصل على uint32 checkSumAdjustment. لحسابه: اضبطه إلى 0، احسب المجموع الاختباري لجدول 'head' وضعه في دليل الجدول، اجمع الخط بالكامل كـ uint32، ثم خزن B1B0AFBA - المجموع. المجموع الاختباري لجدول 'head' لن يكون خاطئًا. هذا مقبول.

**Returns:**
long - Uint32 checkSumAdjustment.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreated() {#getCreated--}
```
public Date getCreated()
```


يحصل على longDateTime تاريخ إنشائي دولي.

**Returns:**
java.util.Date - LongDateTime تاريخ إنشائي دولي.
### getFlags() {#getFlags--}
```
public int getFlags()
```


يحصل على uint16 flags.

**Returns:**
int - UInt16 flags.
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


يحصل على int16 fontDirectionHint. 0 رموز مختلطة الاتجاه؛ 1 رموز من اليسار إلى اليمين فقط؛ 2 مثل 1 ولكن يحتوي أيضًا على محايد؛ -1 رموز من اليمين إلى اليسار فقط؛ -2 مثل -1 ولكن يحتوي أيضًا على محايد.

**Returns:**
short - Int16 fontDirectionHint.
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


احصل على fixed fontRevision الذي يحدده صانع الخط.

**Returns:**
float - Fixed fontRevision المحدد من قبل صانع الخط.
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


يحصل على int16 glyphDataFormat 0 للتنسيق الحالي.

**Returns:**
short - Int16 glyphDataFormat 0 للتنسيق الحالي.
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


يحصل على int16 indexToLocFormat 0 للإزاحات القصيرة، 1 للطويلة.

**Returns:**
short - Int16 indexToLocFormat 0 للإزاحات القصيرة، 1 للطويلة.
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


يحصل على uint16 lowestRecPPEM أصغر حجم قابل للقراءة بالبكسل.

**Returns:**
int - UInt16 lowestRecPPEM أصغر حجم قابل للقراءة بالبكسل.
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


يحصل على uint16 macStyle.

**Returns:**
int - UInt16 macStyle.
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


يحصل على uint32 magicNumber المحدد إلى 0x5F0F3CF5.

**Returns:**
long - UInt32 magicNumber تم تعيينه إلى 0x5F0F3CF5.
### getModified() {#getModified--}
```
public Date getModified()
```


يحصل على longDateTime تاريخ تعديل دولي.

**Returns:**
java.util.Date - LongDateTime تاريخ دولي معدل.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


يحصل على uint16 unitsPerEM النطاق من 64 إلى 16384.

**Returns:**
long - UInt16 unitsPerEM النطاق من 64 إلى 16384.
### getVersion() {#getVersion--}
```
public float getVersion()
```


الإصدار Fixed 0x00010000 إذا (الإصدار 1.0).

**Returns:**
float - الإصدار الثابت 0x00010000 إذا (الإصدار 1.0).
### getXMax() {#getXMax--}
```
public short getXMax()
```


يحصل على FWord xMax لجميع صناديق حدود الرموز.

**Returns:**
short - FWord xMax لجميع صناديق حدود الحرف.
### getXMin() {#getXMin--}
```
public short getXMin()
```


يحصل على FWord xMin لجميع صناديق حدود الرموز.

**Returns:**
short - FWord xMin لجميع صناديق حدود الحرف.
### getYMax() {#getYMax--}
```
public short getYMax()
```


يحصل على FWord yMax لجميع صناديق حدود الرموز.

**Returns:**
short - FWord yMax لجميع صناديق حدود الحرف.
### getYMin() {#getYMin--}
```
public short getYMin()
```


يحصل على FWord yMin لجميع صناديق حدود الرموز.

**Returns:**
short - FWord yMin لجميع صناديق حدود الحرف.
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

