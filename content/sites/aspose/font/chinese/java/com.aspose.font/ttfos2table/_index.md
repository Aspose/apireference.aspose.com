---
title: "TtfOs2Table"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的 OS/2 表。"
type: docs
weight: 106
url: /zh/java/com.aspose.font/ttfos2table/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfOs2Table extends TtfTableBase
```

表示 "OS/2" 表的 TTF 字体文件。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAchVendId()](#getAchVendId--) | 获取 AchVendId 值。 |
| [getClass()](#getClass--) |  |
| [getFSSelection()](#getFSSelection--) | 包含有关字体模式性质的信息。 |
| [getFSType()](#getFSType--) | 获取 FSType 值。 |
| [getLicenseFlags()](#getLicenseFlags--) | 获取对象表示中的嵌入标志（fsType）。 |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getPanose()](#getPanose--) | 这串 10 字节的数字用于描述给定字体的视觉特性。 |
| [getSCapHeight()](#getSCapHeight--) | 获取 SCapHeight 值。 |
| [getSFamilyClass()](#getSFamilyClass--) | 此参数是字体族设计的分类。 |
| [getSTypoAscender()](#getSTypoAscender--) | 获取 STypoAscender 值。 |
| [getSTypoDescender()](#getSTypoDescender--) | 获取 STypoDescender 值。 |
| [getSTypoLineGap()](#getSTypoLineGap--) | 获取 STypoLineGap 值。 |
| [getSXHeight()](#getSXHeight--) | 获取 SXHeight 值。 |
| [getSupportedTableVersions()](#getSupportedTableVersions--) | 获取 OS/2 表的受支持版本。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [getULCodePageRange()](#getULCodePageRange--) | 获取 ULCodePageRange 值。 |
| [getULUnicodeRange()](#getULUnicodeRange--) | 获取 ULUnicodeRange 值。 |
| [getUSBreakChar()](#getUSBreakChar--) | 获取 USBreakChar 值。 |
| [getUSDefaultChar()](#getUSDefaultChar--) | 获取 USDefaultChar 值。 |
| [getUSFirstCharIndex()](#getUSFirstCharIndex--) | 获取 USFirstCharIndex 值。 |
| [getUSLastCharIndex()](#getUSLastCharIndex--) | 获取 USLastCharIndex 值。 |
| [getUSLowerOpticalPointSize()](#getUSLowerOpticalPointSize--) | 获取 USLowerOpticalPointSize 值。 |
| [getUSMaxContext()](#getUSMaxContext--) | 获取 USMaxContext 值。 |
| [getUSUpperOpticalPointSize()](#getUSUpperOpticalPointSize--) | 获取 USUpperOpticalPointSize 值。 |
| [getUSWeightClass()](#getUSWeightClass--) | 指示字体中字符的视觉粗细（黑度或笔画粗细的程度）。 |
| [getUSWidthClass()](#getUSWidthClass--) | 指示相对于正常宽高比（宽度与高度的比例）的相对变化，该比例由字体设计师为字体中的字形指定。 |
| [getUSWinAscent()](#getUSWinAscent--) | 获取 USWinAscent 值。 |
| [getUSWinDescent()](#getUSWinDescent--) | 获取 USWinDescent 值。 |
| [getVersion()](#getVersion--) | 获取 Version 值。 |
| [getXAvgCharWidth()](#getXAvgCharWidth--) | 获取 Average Character Width 参数。 |
| [getYStrikeoutPosition()](#getYStrikeoutPosition--) | 获取 YStrikeoutPosition 值。 |
| [getYStrikeoutSize()](#getYStrikeoutSize--) | 获取 YStrikeoutSize 值。 |
| [getYSubscriptXOffset()](#getYSubscriptXOffset--) | 获取 YSubscriptXOffset 值。 |
| [getYSubscriptXSize()](#getYSubscriptXSize--) | 获取 YSubscriptXSize 值。 |
| [getYSubscriptYOffset()](#getYSubscriptYOffset--) | 获取 YSubscriptYOffset 值。 |
| [getYSubscriptYSize()](#getYSubscriptYSize--) | 获取 YSubscriptYSize 值。 |
| [getYSuperscriptXOffset()](#getYSuperscriptXOffset--) | 获取 YSuperscriptXOffset 值。 |
| [getYSuperscriptXSize()](#getYSuperscriptXSize--) | 获取 YSuperscriptXSize 值。 |
| [getYSuperscriptYOffset()](#getYSuperscriptYOffset--) | 获取 YSuperscriptYOffset 值。 |
| [getYSuperscriptYSize()](#getYSuperscriptYSize--) | 获取 YSuperscriptYSize 值。 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAchVendId() {#getAchVendId--}
```
public byte[] getAchVendId()
```


获取 AchVendId 值。

**Returns:**
byte[] - AchVendId 值。
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


包含有关字体模式性质的信息。

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
int - 信息。
### getFSType() {#getFSType--}
```
public int getFSType()
```


获取 FSType 值。

--------------------

指示 Font 的嵌入许可权。

**Returns:**
int - FSType 值。
### getLicenseFlags() {#getLicenseFlags--}
```
public LicenseFlags getLicenseFlags()
```


获取对象表示中的嵌入标志（fsType）。

**Returns:**
[LicenseFlags](../../com.aspose.font/licenseflags) - Embedded flags.
### getOffset() {#getOffset--}
```
public long getOffset()
```


获取自 sfnt 开始的偏移量。

**Returns:**
long - 自 sfnt 开始的偏移量。
### getPanose() {#getPanose--}
```
public byte[] getPanose()
```


这串 10 字节的数字用于描述给定字体的视觉特征。这些特征随后用于将该字体与外观相似但名称不同的其他字体关联。

**Returns:**
byte[] - 给定字体的视觉特征。
### getSCapHeight() {#getSCapHeight--}
```
public short getSCapHeight()
```


获取 SCapHeight 值。

**Returns:**
short - SCapHeight 值。
### getSFamilyClass() {#getSFamilyClass--}
```
public short getSFamilyClass()
```


此参数是字体系列设计的分类。字体类和字体子类是 IBM 为每个字体系列分配的注册值。此参数旨在在请求的字体不可用时用于选择替代字体。

**Returns:**
short - 字体系列设计的分类。
### getSTypoAscender() {#getSTypoAscender--}
```
public short getSTypoAscender()
```


获取 STypoAscender 值。

**Returns:**
short - STypoAscender 值。
### getSTypoDescender() {#getSTypoDescender--}
```
public short getSTypoDescender()
```


获取 STypoDescender 值。

**Returns:**
short - STypoDescender 值。
### getSTypoLineGap() {#getSTypoLineGap--}
```
public short getSTypoLineGap()
```


获取 STypoLineGap 值。

**Returns:**
short - STypoLineGap 值。
### getSXHeight() {#getSXHeight--}
```
public short getSXHeight()
```


获取 SXHeight 值。

**Returns:**
short - SXHeight 值。
### getSupportedTableVersions() {#getSupportedTableVersions--}
```
public int[] getSupportedTableVersions()
```


获取 OS/2 表的受支持版本。

**Returns:**
int[] - OS/2 表的受支持版本。
### getTag() {#getTag--}
```
public static String getTag()
```


获取表标签。

**Returns:**
java.lang.String - 表标签。
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


指向 TTF 表仓库的引用。

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getULCodePageRange() {#getULCodePageRange--}
```
public long[] getULCodePageRange()
```


获取 ULCodePageRange 值。

**Returns:**
long[] - ULCodePageRange 值。
### getULUnicodeRange() {#getULUnicodeRange--}
```
public long[] getULUnicodeRange()
```


获取 ULUnicodeRange 值。

**Returns:**
long[] - ULUnicodeRange 值。
### getUSBreakChar() {#getUSBreakChar--}
```
public int getUSBreakChar()
```


获取 USBreakChar 值。

**Returns:**
int - USBreakChar 值。
### getUSDefaultChar() {#getUSDefaultChar--}
```
public int getUSDefaultChar()
```


获取 USDefaultChar 值。

**Returns:**
int - USDefaultChar 值。
### getUSFirstCharIndex() {#getUSFirstCharIndex--}
```
public int getUSFirstCharIndex()
```


获取 USFirstCharIndex 值。

**Returns:**
int - USFirstCharIndex 值。
### getUSLastCharIndex() {#getUSLastCharIndex--}
```
public int getUSLastCharIndex()
```


获取 USLastCharIndex 值。

**Returns:**
int - USLastCharIndex 值。
### getUSLowerOpticalPointSize() {#getUSLowerOpticalPointSize--}
```
public int getUSLowerOpticalPointSize()
```


获取 USLowerOpticalPointSize 值。

**Returns:**
int - USLowerOpticalPointSize 值。
### getUSMaxContext() {#getUSMaxContext--}
```
public int getUSMaxContext()
```


获取 USMaxContext 值。

**Returns:**
int - UsMaxContext 值。
### getUSUpperOpticalPointSize() {#getUSUpperOpticalPointSize--}
```
public int getUSUpperOpticalPointSize()
```


获取 USUpperOpticalPointSize 值。

**Returns:**
int - USUpperOpticalPointSize 值。
### getUSWeightClass() {#getUSWeightClass--}
```
public int getUSWeightClass()
```


指示字体中字符的视觉粗细（黑度或笔画粗细的程度）。

**Returns:**
int - 字体中字符的视觉粗细（黑度或笔画厚度的程度）。
### getUSWidthClass() {#getUSWidthClass--}
```
public int getUSWidthClass()
```


指示相对于正常宽高比（宽度与高度的比例）的相对变化，该比例由字体设计师为字体中的字形指定。

**Returns:**
int - 字体设计师为字体中的字形指定的相对于正常宽高比（宽度与高度比例）的相对变化。
### getUSWinAscent() {#getUSWinAscent--}
```
public int getUSWinAscent()
```


获取 USWinAscent 值。

**Returns:**
int - USWinAscent 值。
### getUSWinDescent() {#getUSWinDescent--}
```
public int getUSWinDescent()
```


获取 USWinDescent 值。

**Returns:**
int - USWinDescent 值。
### getVersion() {#getVersion--}
```
public int getVersion()
```


获取 Version 值。

**Returns:**
int - 版本 值。
### getXAvgCharWidth() {#getXAvgCharWidth--}
```
public short getXAvgCharWidth()
```


获取 Average Character Width 参数。

**Returns:**
short - 平均字符宽度 参数。
### getYStrikeoutPosition() {#getYStrikeoutPosition--}
```
public short getYStrikeoutPosition()
```


获取 YStrikeoutPosition 值。

**Returns:**
short - YStrikeoutPosition 值。
### getYStrikeoutSize() {#getYStrikeoutSize--}
```
public short getYStrikeoutSize()
```


获取 YStrikeoutSize 值。

**Returns:**
short - YStrikeoutSize 值。
### getYSubscriptXOffset() {#getYSubscriptXOffset--}
```
public short getYSubscriptXOffset()
```


获取 YSubscriptXOffset 值。

**Returns:**
short - YSubscriptXOffset 值。
### getYSubscriptXSize() {#getYSubscriptXSize--}
```
public short getYSubscriptXSize()
```


获取 YSubscriptXSize 值。

**Returns:**
short - YSubscriptXSize 值。
### getYSubscriptYOffset() {#getYSubscriptYOffset--}
```
public short getYSubscriptYOffset()
```


获取 YSubscriptYOffset 值。

**Returns:**
short - YSubscriptYOffset 值。
### getYSubscriptYSize() {#getYSubscriptYSize--}
```
public short getYSubscriptYSize()
```


获取 YSubscriptYSize 值。

**Returns:**
short - YSubscriptYSize 值。
### getYSuperscriptXOffset() {#getYSuperscriptXOffset--}
```
public short getYSuperscriptXOffset()
```


获取 YSuperscriptXOffset 值。

**Returns:**
short - YSuperscriptXOffset 值。
### getYSuperscriptXSize() {#getYSuperscriptXSize--}
```
public short getYSuperscriptXSize()
```


获取 YSuperscriptXSize 值。

**Returns:**
short - YSuperscriptXSize 值。
### getYSuperscriptYOffset() {#getYSuperscriptYOffset--}
```
public short getYSuperscriptYOffset()
```


获取 YSuperscriptYOffset 值。

**Returns:**
short - YSuperscriptYOffset 值。
### getYSuperscriptYSize() {#getYSuperscriptYSize--}
```
public short getYSuperscriptYSize()
```


获取 YSuperscriptYSize 值。

**Returns:**
short - YSuperscriptYSize 值。
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

