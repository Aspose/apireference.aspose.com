---
title: TtfOs2Table
second_title: Aspose.Font for Java API Reference
description: Represents OS/2 table of the TTF Font file.
type: docs
weight: 105
url: /java/com.aspose.font/ttfos2table/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfOs2Table extends TtfTableBase
```

Represents "OS/2" table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAchVendId()](#getAchVendId--) | Gets AchVendId value. |
| [getClass()](#getClass--) |  |
| [getFSSelection()](#getFSSelection--) | Contains information concerning the nature of the font patterns. |
| [getFSType()](#getFSType--) | Gets FSType value. |
| [getLicenseFlags()](#getLicenseFlags--) | Gets an embedded flags(fsType) in object representation. |
| [getOffset()](#getOffset--) | Gets offset from beginning of sfnt. |
| [getPanose()](#getPanose--) | This 10 byte series of numbers is used to describe the visual characteristics of a given typeface. |
| [getSCapHeight()](#getSCapHeight--) | Gets SCapHeight value. |
| [getSFamilyClass()](#getSFamilyClass--) | This parameter is a classification of font-family design. |
| [getSTypoAscender()](#getSTypoAscender--) | Gets STypoAscender value. |
| [getSTypoDescender()](#getSTypoDescender--) | Gets STypoDescender value. |
| [getSTypoLineGap()](#getSTypoLineGap--) | Gets STypoLineGap value. |
| [getSXHeight()](#getSXHeight--) | Gets SXHeight value. |
| [getSupportedTableVersions()](#getSupportedTableVersions--) | Gets supported versions of the OS/2 table. |
| [getTag()](#getTag--) | Gets table tag. |
| [getTtfTables()](#getTtfTables--) | Reference to TTF table repository. |
| [getULCodePageRange()](#getULCodePageRange--) | Gets ULCodePageRange value. |
| [getULUnicodeRange()](#getULUnicodeRange--) | Gets ULUnicodeRange value. |
| [getUSBreakChar()](#getUSBreakChar--) | Gets USBreakChar value. |
| [getUSDefaultChar()](#getUSDefaultChar--) | Gets USDefaultChar value. |
| [getUSFirstCharIndex()](#getUSFirstCharIndex--) | Gets USFirstCharIndex value. |
| [getUSLastCharIndex()](#getUSLastCharIndex--) | Gets USLastCharIndex value. |
| [getUSLowerOpticalPointSize()](#getUSLowerOpticalPointSize--) | Gets USLowerOpticalPointSize value. |
| [getUSMaxContext()](#getUSMaxContext--) | Gets USMaxContext value. |
| [getUSUpperOpticalPointSize()](#getUSUpperOpticalPointSize--) | Gets USUpperOpticalPointSize value. |
| [getUSWeightClass()](#getUSWeightClass--) | Indicates the visual weight (degree of blackness or thickness of strokes) of the characters in the Font. |
| [getUSWidthClass()](#getUSWidthClass--) | Indicates a relative change from the normal aspect ratio (width to height ratio) as specified by a font designer for the glyphs in a Font. |
| [getUSWinAscent()](#getUSWinAscent--) | Gets USWinAscent value. |
| [getUSWinDescent()](#getUSWinDescent--) | Gets USWinDescent value. |
| [getVersion()](#getVersion--) | Gets Version value. |
| [getXAvgCharWidth()](#getXAvgCharWidth--) | Gets the Average Character Width parameter. |
| [getYStrikeoutPosition()](#getYStrikeoutPosition--) | Gets YStrikeoutPosition value. |
| [getYStrikeoutSize()](#getYStrikeoutSize--) | Gets YStrikeoutSize value. |
| [getYSubscriptXOffset()](#getYSubscriptXOffset--) | Gets YSubscriptXOffset value. |
| [getYSubscriptXSize()](#getYSubscriptXSize--) | Gets YSubscriptXSize value. |
| [getYSubscriptYOffset()](#getYSubscriptYOffset--) | Gets YSubscriptYOffset value. |
| [getYSubscriptYSize()](#getYSubscriptYSize--) | Gets YSubscriptYSize value. |
| [getYSuperscriptXOffset()](#getYSuperscriptXOffset--) | Gets YSuperscriptXOffset value. |
| [getYSuperscriptXSize()](#getYSuperscriptXSize--) | Gets YSuperscriptXSize value. |
| [getYSuperscriptYOffset()](#getYSuperscriptYOffset--) | Gets YSuperscriptYOffset value. |
| [getYSuperscriptYSize()](#getYSuperscriptYSize--) | Gets YSuperscriptYSize value. |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAchVendId() {#getAchVendId--}
```
public byte[] getAchVendId()
```


Gets AchVendId value.

**Returns:**
byte[] - AchVendId value.
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


Contains information concerning the nature of the font patterns.

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
int - The information.
### getFSType() {#getFSType--}
```
public int getFSType()
```


Gets FSType value.

--------------------

Indicates font embedding licensing rights for the Font.

**Returns:**
int - FSType value.
### getLicenseFlags() {#getLicenseFlags--}
```
public LicenseFlags getLicenseFlags()
```


Gets an embedded flags(fsType) in object representation.

**Returns:**
[LicenseFlags](../../com.aspose.font/licenseflags) - Embedded flags.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset from beginning of sfnt.

**Returns:**
long - Offset from beginning of sfnt.
### getPanose() {#getPanose--}
```
public byte[] getPanose()
```


This 10 byte series of numbers is used to describe the visual characteristics of a given typeface. These characteristics are then used to associate the font with other fonts of similar appearance having different names.

**Returns:**
byte[] - The visual characteristics of a given typeface.
### getSCapHeight() {#getSCapHeight--}
```
public short getSCapHeight()
```


Gets SCapHeight value.

**Returns:**
short - SCapHeight value.
### getSFamilyClass() {#getSFamilyClass--}
```
public short getSFamilyClass()
```


This parameter is a classification of font-family design. The font class and font subclass are registered values assigned by IBM to each font family. This parameter is intended for use in selecting an alternate font when the requested font is not available.

**Returns:**
short - Classification of font-family design.
### getSTypoAscender() {#getSTypoAscender--}
```
public short getSTypoAscender()
```


Gets STypoAscender value.

**Returns:**
short - STypoAscender value.
### getSTypoDescender() {#getSTypoDescender--}
```
public short getSTypoDescender()
```


Gets STypoDescender value.

**Returns:**
short - STypoDescender value.
### getSTypoLineGap() {#getSTypoLineGap--}
```
public short getSTypoLineGap()
```


Gets STypoLineGap value.

**Returns:**
short - STypoLineGap value.
### getSXHeight() {#getSXHeight--}
```
public short getSXHeight()
```


Gets SXHeight value.

**Returns:**
short - SXHeight value.
### getSupportedTableVersions() {#getSupportedTableVersions--}
```
public int[] getSupportedTableVersions()
```


Gets supported versions of the OS/2 table.

**Returns:**
int[] - Supported versions of the OS/2 table.
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Reference to TTF table repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getULCodePageRange() {#getULCodePageRange--}
```
public long[] getULCodePageRange()
```


Gets ULCodePageRange value.

**Returns:**
long[] - ULCodePageRange value.
### getULUnicodeRange() {#getULUnicodeRange--}
```
public long[] getULUnicodeRange()
```


Gets ULUnicodeRange value.

**Returns:**
long[] - ULUnicodeRange value.
### getUSBreakChar() {#getUSBreakChar--}
```
public int getUSBreakChar()
```


Gets USBreakChar value.

**Returns:**
int - USBreakChar value.
### getUSDefaultChar() {#getUSDefaultChar--}
```
public int getUSDefaultChar()
```


Gets USDefaultChar value.

**Returns:**
int - USDefaultChar value.
### getUSFirstCharIndex() {#getUSFirstCharIndex--}
```
public int getUSFirstCharIndex()
```


Gets USFirstCharIndex value.

**Returns:**
int - USFirstCharIndex value.
### getUSLastCharIndex() {#getUSLastCharIndex--}
```
public int getUSLastCharIndex()
```


Gets USLastCharIndex value.

**Returns:**
int - USLastCharIndex value.
### getUSLowerOpticalPointSize() {#getUSLowerOpticalPointSize--}
```
public int getUSLowerOpticalPointSize()
```


Gets USLowerOpticalPointSize value.

**Returns:**
int - The USLowerOpticalPointSize value.
### getUSMaxContext() {#getUSMaxContext--}
```
public int getUSMaxContext()
```


Gets USMaxContext value.

**Returns:**
int - UsMaxContext value.
### getUSUpperOpticalPointSize() {#getUSUpperOpticalPointSize--}
```
public int getUSUpperOpticalPointSize()
```


Gets USUpperOpticalPointSize value.

**Returns:**
int - The USUpperOpticalPointSize value.
### getUSWeightClass() {#getUSWeightClass--}
```
public int getUSWeightClass()
```


Indicates the visual weight (degree of blackness or thickness of strokes) of the characters in the Font.

**Returns:**
int - The visual weight (degree of blackness or thickness of strokes) of the characters in the Font.
### getUSWidthClass() {#getUSWidthClass--}
```
public int getUSWidthClass()
```


Indicates a relative change from the normal aspect ratio (width to height ratio) as specified by a font designer for the glyphs in a Font.

**Returns:**
int - A relative change from the normal aspect ratio (width to height ratio) as specified by a font designer for the glyphs in a Font.
### getUSWinAscent() {#getUSWinAscent--}
```
public int getUSWinAscent()
```


Gets USWinAscent value.

**Returns:**
int - USWinAscent value.
### getUSWinDescent() {#getUSWinDescent--}
```
public int getUSWinDescent()
```


Gets USWinDescent value.

**Returns:**
int - USWinDescent value.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Gets Version value.

**Returns:**
int - Version value.
### getXAvgCharWidth() {#getXAvgCharWidth--}
```
public short getXAvgCharWidth()
```


Gets the Average Character Width parameter.

**Returns:**
short - The Average Character Width parameter.
### getYStrikeoutPosition() {#getYStrikeoutPosition--}
```
public short getYStrikeoutPosition()
```


Gets YStrikeoutPosition value.

**Returns:**
short - YStrikeoutPosition value.
### getYStrikeoutSize() {#getYStrikeoutSize--}
```
public short getYStrikeoutSize()
```


Gets YStrikeoutSize value.

**Returns:**
short - YStrikeoutSize value.
### getYSubscriptXOffset() {#getYSubscriptXOffset--}
```
public short getYSubscriptXOffset()
```


Gets YSubscriptXOffset value.

**Returns:**
short - YSubscriptXOffset value.
### getYSubscriptXSize() {#getYSubscriptXSize--}
```
public short getYSubscriptXSize()
```


Gets YSubscriptXSize value.

**Returns:**
short - YSubscriptXSize value.
### getYSubscriptYOffset() {#getYSubscriptYOffset--}
```
public short getYSubscriptYOffset()
```


Gets YSubscriptYOffset value.

**Returns:**
short - YSubscriptYOffset value.
### getYSubscriptYSize() {#getYSubscriptYSize--}
```
public short getYSubscriptYSize()
```


Gets YSubscriptYSize value.

**Returns:**
short - YSubscriptYSize value.
### getYSuperscriptXOffset() {#getYSuperscriptXOffset--}
```
public short getYSuperscriptXOffset()
```


Gets YSuperscriptXOffset value.

**Returns:**
short - YSuperscriptXOffset value.
### getYSuperscriptXSize() {#getYSuperscriptXSize--}
```
public short getYSuperscriptXSize()
```


Gets YSuperscriptXSize value.

**Returns:**
short - YSuperscriptXSize value.
### getYSuperscriptYOffset() {#getYSuperscriptYOffset--}
```
public short getYSuperscriptYOffset()
```


Gets YSuperscriptYOffset value.

**Returns:**
short - YSuperscriptYOffset value.
### getYSuperscriptYSize() {#getYSuperscriptYSize--}
```
public short getYSuperscriptYSize()
```


Gets YSuperscriptYSize value.

**Returns:**
short - YSuperscriptYSize value.
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

