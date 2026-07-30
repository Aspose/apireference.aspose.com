---
title: "TtfOs2Table"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول OS/2 لملف الخط TTF."
type: docs
weight: 106
url: /ar/java/com.aspose.font/ttfos2table/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfOs2Table extends TtfTableBase
```

يمثل جدول "OS/2" لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAchVendId()](#getAchVendId--) | يحصل على قيمة AchVendId. |
| [getClass()](#getClass--) |  |
| [getFSSelection()](#getFSSelection--) | يحتوي على معلومات تتعلق بطبيعة أنماط الخط. |
| [getFSType()](#getFSType--) | يحصل على قيمة FSType. |
| [getLicenseFlags()](#getLicenseFlags--) | يحصل على العلامات المضمنة (fsType) في تمثيل الكائن. |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getPanose()](#getPanose--) | تُستخدم سلسلة الأرقام المكوّنة من 10 بايتات هذه لوصف الخصائص البصرية للخط المعطى. |
| [getSCapHeight()](#getSCapHeight--) | يحصل على قيمة SCapHeight. |
| [getSFamilyClass()](#getSFamilyClass--) | هذا المعامل هو تصنيف لتصميم عائلة الخط. |
| [getSTypoAscender()](#getSTypoAscender--) | يحصل على قيمة STypoAscender. |
| [getSTypoDescender()](#getSTypoDescender--) | يحصل على قيمة STypoDescender. |
| [getSTypoLineGap()](#getSTypoLineGap--) | يحصل على قيمة STypoLineGap. |
| [getSXHeight()](#getSXHeight--) | يحصل على قيمة SXHeight. |
| [getSupportedTableVersions()](#getSupportedTableVersions--) | يحصل على الإصدارات المدعومة لجدول OS/2. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [getULCodePageRange()](#getULCodePageRange--) | يحصل على قيمة ULCodePageRange. |
| [getULUnicodeRange()](#getULUnicodeRange--) | يحصل على قيمة ULUnicodeRange. |
| [getUSBreakChar()](#getUSBreakChar--) | يحصل على قيمة USBreakChar. |
| [getUSDefaultChar()](#getUSDefaultChar--) | يحصل على قيمة USDefaultChar. |
| [getUSFirstCharIndex()](#getUSFirstCharIndex--) | يحصل على قيمة USFirstCharIndex. |
| [getUSLastCharIndex()](#getUSLastCharIndex--) | يحصل على قيمة USLastCharIndex. |
| [getUSLowerOpticalPointSize()](#getUSLowerOpticalPointSize--) | يحصل على قيمة USLowerOpticalPointSize. |
| [getUSMaxContext()](#getUSMaxContext--) | يحصل على قيمة USMaxContext. |
| [getUSUpperOpticalPointSize()](#getUSUpperOpticalPointSize--) | يحصل على قيمة USUpperOpticalPointSize. |
| [getUSWeightClass()](#getUSWeightClass--) | يشير إلى الوزن البصري (درجة السواد أو سمك الخطوط) للأحرف في الخط. |
| [getUSWidthClass()](#getUSWidthClass--) | يشير إلى تغيير نسبي عن نسبة العرض إلى الارتفاع الطبيعية كما يحددها مصمم الخط للرموز في الخط. |
| [getUSWinAscent()](#getUSWinAscent--) | يحصل على قيمة USWinAscent. |
| [getUSWinDescent()](#getUSWinDescent--) | يحصل على قيمة USWinDescent. |
| [getVersion()](#getVersion--) | يحصل على قيمة Version. |
| [getXAvgCharWidth()](#getXAvgCharWidth--) | يحصل على معامل متوسط عرض الحرف. |
| [getYStrikeoutPosition()](#getYStrikeoutPosition--) | يحصل على قيمة YStrikeoutPosition. |
| [getYStrikeoutSize()](#getYStrikeoutSize--) | يحصل على قيمة YStrikeoutSize. |
| [getYSubscriptXOffset()](#getYSubscriptXOffset--) | يحصل على قيمة YSubscriptXOffset. |
| [getYSubscriptXSize()](#getYSubscriptXSize--) | يحصل على قيمة YSubscriptXSize. |
| [getYSubscriptYOffset()](#getYSubscriptYOffset--) | يحصل على قيمة YSubscriptYOffset. |
| [getYSubscriptYSize()](#getYSubscriptYSize--) | يحصل على قيمة YSubscriptYSize. |
| [getYSuperscriptXOffset()](#getYSuperscriptXOffset--) | يحصل على قيمة YSuperscriptXOffset. |
| [getYSuperscriptXSize()](#getYSuperscriptXSize--) | يحصل على قيمة YSuperscriptXSize. |
| [getYSuperscriptYOffset()](#getYSuperscriptYOffset--) | يحصل على قيمة YSuperscriptYOffset. |
| [getYSuperscriptYSize()](#getYSuperscriptYSize--) | يحصل على قيمة YSuperscriptYSize. |
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
### getAchVendId() {#getAchVendId--}
```
public byte[] getAchVendId()
```


يحصل على قيمة AchVendId.

**Returns:**
byte[] - قيمة AchVendId.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFSSelection() {#getFSSelection--}
```
public int getFSSelection()
```


يحتوي على معلومات تتعلق بطبيعة أنماط الخط.

> ```
> 0	bit 1	ITALIC	Font contains Italic characters, otherwise they are upright.
>  1	 	    UNDERSCORE	Characters are underscored.
>  2	 	    NEGATIVE	Characters have their foreground and background reversed.
>  3	 	    OUTLINED	Outline (hollow) characters, otherwise they are solid.
>  4	 	    STRIKEOUT	Characters are overstruck.
>  5	bit 0	BOLD	Characters are emboldened.
>  6	 	    REGULAR	Characters are in the standard weight/style for the font.
> ```

**Returns:**
int - المعلومات.
### getFSType() {#getFSType--}
```
public int getFSType()
```


يحصل على قيمة FSType.

--------------------

يشير إلى حقوق ترخيص تضمين الخط للخط.

**Returns:**
int - قيمة FSType.
### getLicenseFlags() {#getLicenseFlags--}
```
public LicenseFlags getLicenseFlags()
```


يحصل على العلامات المضمنة (fsType) في تمثيل الكائن.

**Returns:**
[LicenseFlags](../../com.aspose.font/licenseflags) - Embedded flags.
### getOffset() {#getOffset--}
```
public long getOffset()
```


يحصل على الإزاحة من بداية sfnt.

**Returns:**
long - إزاحة من بداية sfnt.
### getPanose() {#getPanose--}
```
public byte[] getPanose()
```


يتم استخدام سلسلة الأرقام المكونة من 10 بايت هذه لوصف الخصائص البصرية لنوع خط معين. تُستخدم هذه الخصائص بعد ذلك لربط الخط بخطوط أخرى ذات مظهر مشابه ولكن بأسماء مختلفة.

**Returns:**
byte[] - الخصائص البصرية لنوع خط معين.
### getSCapHeight() {#getSCapHeight--}
```
public short getSCapHeight()
```


يحصل على قيمة SCapHeight.

**Returns:**
short - قيمة SCapHeight.
### getSFamilyClass() {#getSFamilyClass--}
```
public short getSFamilyClass()
```


هذا المعامل هو تصنيف لتصميم عائلة الخط. فئة الخط والفئة الفرعية للخط هي قيم مسجلة تُعيّنها IBM لكل عائلة خط. يُقصد من هذا المعامل استخدامها لاختيار خط بديل عندما لا يكون الخط المطلوب متاحًا.

**Returns:**
short - تصنيف تصميم عائلة الخط.
### getSTypoAscender() {#getSTypoAscender--}
```
public short getSTypoAscender()
```


يحصل على قيمة STypoAscender.

**Returns:**
short - قيمة STypoAscender.
### getSTypoDescender() {#getSTypoDescender--}
```
public short getSTypoDescender()
```


يحصل على قيمة STypoDescender.

**Returns:**
short - قيمة STypoDescender.
### getSTypoLineGap() {#getSTypoLineGap--}
```
public short getSTypoLineGap()
```


يحصل على قيمة STypoLineGap.

**Returns:**
short - قيمة STypoLineGap.
### getSXHeight() {#getSXHeight--}
```
public short getSXHeight()
```


يحصل على قيمة SXHeight.

**Returns:**
short - قيمة SXHeight.
### getSupportedTableVersions() {#getSupportedTableVersions--}
```
public int[] getSupportedTableVersions()
```


يحصل على الإصدارات المدعومة لجدول OS/2.

**Returns:**
int[] - الإصدارات المدعومة لجدول OS/2.
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
### getULCodePageRange() {#getULCodePageRange--}
```
public long[] getULCodePageRange()
```


يحصل على قيمة ULCodePageRange.

**Returns:**
long[] - قيمة ULCodePageRange.
### getULUnicodeRange() {#getULUnicodeRange--}
```
public long[] getULUnicodeRange()
```


يحصل على قيمة ULUnicodeRange.

**Returns:**
long[] - قيمة ULUnicodeRange.
### getUSBreakChar() {#getUSBreakChar--}
```
public int getUSBreakChar()
```


يحصل على قيمة USBreakChar.

**Returns:**
int - قيمة USBreakChar.
### getUSDefaultChar() {#getUSDefaultChar--}
```
public int getUSDefaultChar()
```


يحصل على قيمة USDefaultChar.

**Returns:**
int - قيمة USDefaultChar.
### getUSFirstCharIndex() {#getUSFirstCharIndex--}
```
public int getUSFirstCharIndex()
```


يحصل على قيمة USFirstCharIndex.

**Returns:**
int - قيمة USFirstCharIndex.
### getUSLastCharIndex() {#getUSLastCharIndex--}
```
public int getUSLastCharIndex()
```


يحصل على قيمة USLastCharIndex.

**Returns:**
int - قيمة USLastCharIndex.
### getUSLowerOpticalPointSize() {#getUSLowerOpticalPointSize--}
```
public int getUSLowerOpticalPointSize()
```


يحصل على قيمة USLowerOpticalPointSize.

**Returns:**
int - قيمة USLowerOpticalPointSize.
### getUSMaxContext() {#getUSMaxContext--}
```
public int getUSMaxContext()
```


يحصل على قيمة USMaxContext.

**Returns:**
int - قيمة UsMaxContext.
### getUSUpperOpticalPointSize() {#getUSUpperOpticalPointSize--}
```
public int getUSUpperOpticalPointSize()
```


يحصل على قيمة USUpperOpticalPointSize.

**Returns:**
int - قيمة USUpperOpticalPointSize.
### getUSWeightClass() {#getUSWeightClass--}
```
public int getUSWeightClass()
```


يشير إلى الوزن البصري (درجة السواد أو سمك الخطوط) للأحرف في الخط.

**Returns:**
int - الوزن البصري (درجة السواد أو سمك الخطوط) للأحرف في الخط.
### getUSWidthClass() {#getUSWidthClass--}
```
public int getUSWidthClass()
```


يشير إلى تغيير نسبي عن نسبة العرض إلى الارتفاع الطبيعية كما يحددها مصمم الخط للرموز في الخط.

**Returns:**
int - تغيير نسبي عن نسبة الأبعاد الطبيعية (العرض إلى الارتفاع) كما حددها مصمم الخط للرموز في الخط.
### getUSWinAscent() {#getUSWinAscent--}
```
public int getUSWinAscent()
```


يحصل على قيمة USWinAscent.

**Returns:**
int - قيمة USWinAscent.
### getUSWinDescent() {#getUSWinDescent--}
```
public int getUSWinDescent()
```


يحصل على قيمة USWinDescent.

**Returns:**
int - قيمة USWinDescent.
### getVersion() {#getVersion--}
```
public int getVersion()
```


يحصل على قيمة Version.

**Returns:**
int - قيمة Version.
### getXAvgCharWidth() {#getXAvgCharWidth--}
```
public short getXAvgCharWidth()
```


يحصل على معامل متوسط عرض الحرف.

**Returns:**
short - معامل عرض الحرف المتوسط.
### getYStrikeoutPosition() {#getYStrikeoutPosition--}
```
public short getYStrikeoutPosition()
```


يحصل على قيمة YStrikeoutPosition.

**Returns:**
short - قيمة YStrikeoutPosition.
### getYStrikeoutSize() {#getYStrikeoutSize--}
```
public short getYStrikeoutSize()
```


يحصل على قيمة YStrikeoutSize.

**Returns:**
short - قيمة YStrikeoutSize.
### getYSubscriptXOffset() {#getYSubscriptXOffset--}
```
public short getYSubscriptXOffset()
```


يحصل على قيمة YSubscriptXOffset.

**Returns:**
short - قيمة YSubscriptXOffset.
### getYSubscriptXSize() {#getYSubscriptXSize--}
```
public short getYSubscriptXSize()
```


يحصل على قيمة YSubscriptXSize.

**Returns:**
short - قيمة YSubscriptXSize.
### getYSubscriptYOffset() {#getYSubscriptYOffset--}
```
public short getYSubscriptYOffset()
```


يحصل على قيمة YSubscriptYOffset.

**Returns:**
short - قيمة YSubscriptYOffset.
### getYSubscriptYSize() {#getYSubscriptYSize--}
```
public short getYSubscriptYSize()
```


يحصل على قيمة YSubscriptYSize.

**Returns:**
short - قيمة YSubscriptYSize.
### getYSuperscriptXOffset() {#getYSuperscriptXOffset--}
```
public short getYSuperscriptXOffset()
```


يحصل على قيمة YSuperscriptXOffset.

**Returns:**
short - قيمة YSuperscriptXOffset.
### getYSuperscriptXSize() {#getYSuperscriptXSize--}
```
public short getYSuperscriptXSize()
```


يحصل على قيمة YSuperscriptXSize.

**Returns:**
short - قيمة YSuperscriptXSize.
### getYSuperscriptYOffset() {#getYSuperscriptYOffset--}
```
public short getYSuperscriptYOffset()
```


يحصل على قيمة YSuperscriptYOffset.

**Returns:**
short - قيمة YSuperscriptYOffset.
### getYSuperscriptYSize() {#getYSuperscriptYSize--}
```
public short getYSuperscriptYSize()
```


يحصل على قيمة YSuperscriptYSize.

**Returns:**
قصير - قيمة YSuperscriptYSize.
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

