---
title: "TtfMaxpTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول maxp لملف الخط TTF"
type: docs
weight: 104
url: /ar/java/com.aspose.font/ttfmaxptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfMaxpTable extends TtfTableBase
```

يمثل جدول "maxp" لملف خط TTF
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxComponentContours()](#getMaxComponentContours--) | يحصل على uint16 maxComponentContours الخطوط في الحرف المركب. |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | يحصل على uint16 maxComponentDepth مستويات التكرار، تُضبط إلى 0 إذا كان الخط يحتوي فقط على حروف بسيطة. |
| [getMaxComponentElements()](#getMaxComponentElements--) | يحصل على uint16 maxComponentElements عدد الحروف المشار إليها في المستوى الأعلى. |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | يحصل على uint16 maxComponentPoints النقاط في الحرف المركب. |
| [getMaxContours()](#getMaxContours--) | يحصل على uint16 maxContours الخطوط في الحرف غير المركب. |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | يحصل على uint16 maxFunctionDefs عدد الـ FDEFs. |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | يحصل على uint16 maxInstructionDefs عدد الـ IDEFs. |
| [getMaxPoints()](#getMaxPoints--) | يحصل على uint16 maxPoints النقاط في الحرف غير المركب. |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | يحصل على uint16 maxSizeOfInstructions عدد البايتات لتعليمات الحرف. |
| [getMaxStackElements()](#getMaxStackElements--) | يحصل على uint16 maxStackElements أقصى عمق للمكدس. |
| [getMaxStorage()](#getMaxStorage--) | يحصل على uint16 maxStorage عدد مواقع مساحة التخزين. |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | يحصل على uint16 maxTwilightPoints النقاط المستخدمة في منطقة الشفق (Z0). |
| [getMaxZones()](#getMaxZones--) | يحصل على uint16 maxZones مُضبط إلى 2. |
| [getNumGlyphs()](#getNumGlyphs--) | يحصل على uint16 numGlyphs عدد الحروف في الخط. |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTableVersion()](#getTableVersion--) | يحصل على نسخة التنسيق. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [getVersion()](#getVersion--) | يحصل على الإصدار الثابت 0x00010000 إذا (الإصدار 1.0). |
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
### getMaxComponentContours() {#getMaxComponentContours--}
```
public int getMaxComponentContours()
```


يحصل على uint16 maxComponentContours الخطوط في الحرف المركب.

**Returns:**
int - UInt16 maxComponentContours الخطوط في الحرف المركب.
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


يحصل على uint16 maxComponentDepth مستويات التكرار، تُضبط إلى 0 إذا كان الخط يحتوي فقط على حروف بسيطة.

**Returns:**
int - Uint16 maxComponentDepth مستويات التكرار، تُضبط إلى 0 إذا كان الخط يحتوي فقط على حروف بسيطة.
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


يحصل على uint16 maxComponentElements عدد الحروف المشار إليها في المستوى الأعلى.

**Returns:**
int - UInt16 maxComponentElements عدد الحروف المشار إليها في المستوى الأعلى.
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


يحصل على uint16 maxComponentPoints النقاط في الحرف المركب.

**Returns:**
int - UInt16 maxComponentPoints النقاط في الحرف المركب.
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


يحصل على uint16 maxContours الخطوط في الحرف غير المركب.

**Returns:**
int - UInt16 maxContours الخطوط في الحرف غير المركب.
### getMaxFunctionDefs() {#getMaxFunctionDefs--}
```
public int getMaxFunctionDefs()
```


يحصل على uint16 maxFunctionDefs عدد الـ FDEFs.

**Returns:**
int - UInt16 maxFunctionDefs عدد الـ FDEFs.
### getMaxInstructionDefs() {#getMaxInstructionDefs--}
```
public int getMaxInstructionDefs()
```


يحصل على uint16 maxInstructionDefs عدد الـ IDEFs.

**Returns:**
int - UInt16 maxInstructionDefs عدد الـ IDEFs.
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


يحصل على uint16 maxPoints النقاط في الحرف غير المركب.

**Returns:**
int - UInt16 maxPoints النقاط في الحرف غير المركب.
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


يحصل على uint16 maxSizeOfInstructions عدد البايتات لتعليمات الحرف.

**Returns:**
int - UInt16 maxSizeOfInstructions عدد البايتات لتعليمات الحرف.
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


يحصل على uint16 maxStackElements أقصى عمق للمكدس.

**Returns:**
int - UInt16 maxStackElements أقصى عمق للمكدس.
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


يحصل على uint16 maxStorage عدد مواقع مساحة التخزين.

**Returns:**
int - UInt16 maxStorage عدد مواقع مساحة التخزين.
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


يحصل على uint16 maxTwilightPoints النقاط المستخدمة في منطقة الشفق (Z0).

**Returns:**
int - UInt16 maxTwilightPoints النقاط المستخدمة في منطقة الشفق (Z0).
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


يحصل على uint16 maxZones مُضبط إلى 2.

**Returns:**
int - Uint16 maxZones تُضبط إلى 2.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


يحصل على uint16 numGlyphs عدد الحروف في الخط.

**Returns:**
int - UInt16 numGlyphs عدد الحروف في الخط.
### getOffset() {#getOffset--}
```
public long getOffset()
```


يحصل على الإزاحة من بداية sfnt.

**Returns:**
long - إزاحة من بداية sfnt.
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


يحصل على إصدار التنسيق. استخدم الخصائص MajorNumber و MinorNUmber للكائن Version16Dot16 في التدوين الست عشري لتحديد الإصدار المستخدم.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
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
public float getVersion()
```


يحصل على الإصدار الثابت 0x00010000 إذا (الإصدار 1.0). مهمل، استخدم الخاصية TableVersion بدلاً من ذلك.

**Returns:**
float - الإصدار الثابت 0x00010000 إذا (الإصدار 1.0).
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

