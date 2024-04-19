---
title: StringFormat
second_title: Aspose.Drawing for Java API Reference
description: Encapsulates text layout information such as alignment orientation and tab stops display manipulations such as ellipsis insertion and national digit substitution and OpenType features.
type: docs
weight: 47
url: /java/com.aspose.drawing/stringformat/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public final class StringFormat implements System.IDisposable
```

Encapsulates text layout information (such as alignment, orientation and tab stops) display manipulations (such as ellipsis insertion and national digit substitution) and OpenType features. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [StringFormat()](#StringFormat--) | Initializes a new instance of the [StringFormat](../../com.aspose.drawing/stringformat) class. |
| [StringFormat(StringFormat format)](#StringFormat-com.aspose.drawing.StringFormat-) | Initializes a new instance of the [StringFormat](../../com.aspose.drawing/stringformat) class from the specified existing [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [StringFormat(int options, int language)](#StringFormat-int-int-) | Initializes a new instance of the [StringFormat](../../com.aspose.drawing/stringformat) class with the specified [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration and language. |
| [StringFormat(int options)](#StringFormat-int-) | Initializes a new instance of the [StringFormat](../../com.aspose.drawing/stringformat) class with the specified [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration. |
## Methods

| Method | Description |
| --- | --- |
| [setDigitSubstitutionLanguage(int value)](#setDigitSubstitutionLanguage-int-) |  |
| [setDigitSubstitutionMethod(int value)](#setDigitSubstitutionMethod-int-) |  |
| [getFirstTabOffset()](#getFirstTabOffset--) |  |
| [getGenericDefault()](#getGenericDefault--) | Gets a generic default [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [getGenericTypographic()](#getGenericTypographic--) | Gets a generic typographic [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [getFormatFlags()](#getFormatFlags--) | Gets or sets a [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration that contains formatting information. |
| [setFormatFlags(int value)](#setFormatFlags-int-) | Gets or sets a [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration that contains formatting information. |
| [getAlignment()](#getAlignment--) | Gets or sets text alignment information on the vertical plane. |
| [setAlignment(int value)](#setAlignment-int-) | Gets or sets text alignment information on the vertical plane. |
| [getLineAlignment()](#getLineAlignment--) | Gets or sets the line alignment on the horizontal plane. |
| [setLineAlignment(int value)](#setLineAlignment-int-) | Gets or sets the line alignment on the horizontal plane. |
| [getHotkeyPrefix()](#getHotkeyPrefix--) | Gets or sets the `HotkeyPrefix`([.getHotkeyPrefix](../../null/\#getHotkeyPrefix)/[.setHotkeyPrefix(int)](../../null/\#setHotkeyPrefix-int-)) object for this [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [setHotkeyPrefix(int value)](#setHotkeyPrefix-int-) | Gets or sets the `HotkeyPrefix`([.getHotkeyPrefix](../../null/\#getHotkeyPrefix)/[.setHotkeyPrefix(int)](../../null/\#setHotkeyPrefix-int-)) object for this [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [getTrimming()](#getTrimming--) | Gets or sets the [StringTrimming](../../com.aspose.drawing/stringtrimming) enumeration for this [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [setTrimming(int value)](#setTrimming-int-) | Gets or sets the [StringTrimming](../../com.aspose.drawing/stringtrimming) enumeration for this [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [getDigitSubstitutionLanguage()](#getDigitSubstitutionLanguage--) | Gets the language that is used when local digits are substituted for western digits. |
| [getDigitSubstitutionMethod()](#getDigitSubstitutionMethod--) | Gets the method to be used for digit substitution. |
| [dispose()](#dispose--) | Releases all resources used by this [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [deepClone()](#deepClone--) | Creates an exact copy of this [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [getTabStops(float[] firstTabOffset)](#getTabStops-float---) | Gets the tab stops for this [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [getTabStops()](#getTabStops--) | Gets an array of distances between tab stops in the units specified by the `Aspose.Imaging.getGraphics().PageUnit` property. |
| [setTabStops(float firstTabOffset, float[] tabStops)](#setTabStops-float-float---) | Sets tab stops for this [StringFormat](../../com.aspose.drawing/stringformat) object. |
| [setDigitSubstitution(int language, int substitute)](#setDigitSubstitution-int-int-) | Specifies the language and method to be used when local digits are substituted for western digits. |
| [setMeasurableCharacterRanges(CharacterRange[] ranges)](#setMeasurableCharacterRanges-com.aspose.drawing.CharacterRange---) | Specifies an array of [CharacterRange](../../com.aspose.drawing/characterrange) structures that represent the ranges of characters measured by a call to the `MeasureCharacterRanges` method. |
### StringFormat() {#StringFormat--}
```
public StringFormat()
```


Initializes a new instance of the [StringFormat](../../com.aspose.drawing/stringformat) class.

### StringFormat(StringFormat format) {#StringFormat-com.aspose.drawing.StringFormat-}
```
public StringFormat(StringFormat format)
```


Initializes a new instance of the [StringFormat](../../com.aspose.drawing/stringformat) class from the specified existing [StringFormat](../../com.aspose.drawing/stringformat) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | The [StringFormat](../../com.aspose.drawing/stringformat) object from which to initialize the new [StringFormat](../../com.aspose.drawing/stringformat) object. |

### StringFormat(int options, int language) {#StringFormat-int-int-}
```
public StringFormat(int options, int language)
```


Initializes a new instance of the [StringFormat](../../com.aspose.drawing/stringformat) class with the specified [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration and language.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | int | The [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration for the new [StringFormat](../../com.aspose.drawing/stringformat) object. |
| language | int | A value that indicates the language of the text. |

### StringFormat(int options) {#StringFormat-int-}
```
public StringFormat(int options)
```


Initializes a new instance of the [StringFormat](../../com.aspose.drawing/stringformat) class with the specified [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | int | The [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration for the new [StringFormat](../../com.aspose.drawing/stringformat) object. |

### setDigitSubstitutionLanguage(int value) {#setDigitSubstitutionLanguage-int-}
```
public void setDigitSubstitutionLanguage(int value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### setDigitSubstitutionMethod(int value) {#setDigitSubstitutionMethod-int-}
```
public void setDigitSubstitutionMethod(int value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getFirstTabOffset() {#getFirstTabOffset--}
```
public float getFirstTabOffset()
```




**Returns:**
float
### getGenericDefault() {#getGenericDefault--}
```
public static StringFormat getGenericDefault()
```


Gets a generic default [StringFormat](../../com.aspose.drawing/stringformat) object.

**Returns:**
[StringFormat](../../com.aspose.drawing/stringformat)
### getGenericTypographic() {#getGenericTypographic--}
```
public static StringFormat getGenericTypographic()
```


Gets a generic typographic [StringFormat](../../com.aspose.drawing/stringformat) object.

**Returns:**
[StringFormat](../../com.aspose.drawing/stringformat) - A generic typographic [StringFormat](../../com.aspose.drawing/stringformat) object.
### getFormatFlags() {#getFormatFlags--}
```
public int getFormatFlags()
```


Gets or sets a [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration that contains formatting information.

**Returns:**
int
### setFormatFlags(int value) {#setFormatFlags-int-}
```
public void setFormatFlags(int value)
```


Gets or sets a [StringFormatFlags](../../com.aspose.drawing/stringformatflags) enumeration that contains formatting information.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getAlignment() {#getAlignment--}
```
public int getAlignment()
```


Gets or sets text alignment information on the vertical plane.

**Returns:**
int
### setAlignment(int value) {#setAlignment-int-}
```
public void setAlignment(int value)
```


Gets or sets text alignment information on the vertical plane.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getLineAlignment() {#getLineAlignment--}
```
public int getLineAlignment()
```


Gets or sets the line alignment on the horizontal plane.

**Returns:**
int
### setLineAlignment(int value) {#setLineAlignment-int-}
```
public void setLineAlignment(int value)
```


Gets or sets the line alignment on the horizontal plane.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getHotkeyPrefix() {#getHotkeyPrefix--}
```
public int getHotkeyPrefix()
```


Gets or sets the `HotkeyPrefix`([.getHotkeyPrefix](../../null/\#getHotkeyPrefix)/[.setHotkeyPrefix(int)](../../null/\#setHotkeyPrefix-int-)) object for this [StringFormat](../../com.aspose.drawing/stringformat) object.

**Returns:**
int
### setHotkeyPrefix(int value) {#setHotkeyPrefix-int-}
```
public void setHotkeyPrefix(int value)
```


Gets or sets the `HotkeyPrefix`([.getHotkeyPrefix](../../null/\#getHotkeyPrefix)/[.setHotkeyPrefix(int)](../../null/\#setHotkeyPrefix-int-)) object for this [StringFormat](../../com.aspose.drawing/stringformat) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getTrimming() {#getTrimming--}
```
public int getTrimming()
```


Gets or sets the [StringTrimming](../../com.aspose.drawing/stringtrimming) enumeration for this [StringFormat](../../com.aspose.drawing/stringformat) object.

**Returns:**
int
### setTrimming(int value) {#setTrimming-int-}
```
public void setTrimming(int value)
```


Gets or sets the [StringTrimming](../../com.aspose.drawing/stringtrimming) enumeration for this [StringFormat](../../com.aspose.drawing/stringformat) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getDigitSubstitutionLanguage() {#getDigitSubstitutionLanguage--}
```
public int getDigitSubstitutionLanguage()
```


Gets the language that is used when local digits are substituted for western digits.

**Returns:**
int - A National Language Support (NLS) language identifier that identifies the language that will be used when local digits are substituted for western digits. You can pass the `System.Globalization.CultureInfo.LCID` property of a java.util.Locale object as the NLS language identifier. For example, suppose you create a java.util.Locale object by passing the string "ar-EG" to a java.util.Locale constructor. If you pass the `System.Globalization.CultureInfo.LCID` property of that java.util.Locale object along with.`StringDigitSubstitute.Traditional` to the [.setDigitSubstitution(int,int)](../../null/\#setDigitSubstitution-int-int-) method, then Arabic-Indic digits will be substituted for western digits at display time.
### getDigitSubstitutionMethod() {#getDigitSubstitutionMethod--}
```
public int getDigitSubstitutionMethod()
```


Gets the method to be used for digit substitution.

**Returns:**
int - A [StringDigitSubstitute](../../com.aspose.drawing/stringdigitsubstitute) enumeration value that specifies how to substitute characters in a string that cannot be displayed because they are not supported by the current font.
### dispose() {#dispose--}
```
public void dispose()
```


Releases all resources used by this [StringFormat](../../com.aspose.drawing/stringformat) object.

### deepClone() {#deepClone--}
```
public StringFormat deepClone()
```


Creates an exact copy of this [StringFormat](../../com.aspose.drawing/stringformat) object.

**Returns:**
[StringFormat](../../com.aspose.drawing/stringformat) - The [StringFormat](../../com.aspose.drawing/stringformat) object this method creates.
### getTabStops(float[] firstTabOffset) {#getTabStops-float---}
```
public float[] getTabStops(float[] firstTabOffset)
```


Gets the tab stops for this [StringFormat](../../com.aspose.drawing/stringformat) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| firstTabOffset | float[] | The number of spaces between the beginning of a text line and the first tab stop. |

**Returns:**
float[] - An array of distances (in number of spaces) between tab stops.
### getTabStops() {#getTabStops--}
```
public float[] getTabStops()
```


Gets an array of distances between tab stops in the units specified by the `Aspose.Imaging.getGraphics().PageUnit` property.

**Returns:**
float[] - The tab stops.

The property is introduced for removed method GetTabStops.
### setTabStops(float firstTabOffset, float[] tabStops) {#setTabStops-float-float---}
```
public void setTabStops(float firstTabOffset, float[] tabStops)
```


Sets tab stops for this [StringFormat](../../com.aspose.drawing/stringformat) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| firstTabOffset | float | The number of spaces between the beginning of a line of text and the first tab stop. |
| tabStops | float[] | An array of distances between tab stops in the units specified by the Graphics.PageUnit property. |

### setDigitSubstitution(int language, int substitute) {#setDigitSubstitution-int-int-}
```
public void setDigitSubstitution(int language, int substitute)
```


Specifies the language and method to be used when local digits are substituted for western digits.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| language | int | A National Language Support (NLS) language identifier that identifies the language that will be used when local digits are substituted for western digits. You can pass the `System.Globalization.CultureInfo.LCID` property of a java.util.Locale object as the NLS language identifier. For example, suppose you create a java.util.Locale object by passing the string `"ar-EG"` to a java.util.Locale constructor. If you pass the `System.Globalization.CultureInfo.LCID` property of that java.util.Locale object along with `StringDigitSubstitute.Traditional` to the `M:StringFormat.SetDigitSubstitution(System.Int32,StringDigitSubstitute)` method, then Arabic-Indic digits will be substituted for western digits at display time. |
| substitute | int | An element of the [StringDigitSubstitute](../../com.aspose.drawing/stringdigitsubstitute) enumeration that specifies how digits are displayed. |

### setMeasurableCharacterRanges(CharacterRange[] ranges) {#setMeasurableCharacterRanges-com.aspose.drawing.CharacterRange---}
```
public void setMeasurableCharacterRanges(CharacterRange[] ranges)
```


Specifies an array of [CharacterRange](../../com.aspose.drawing/characterrange) structures that represent the ranges of characters measured by a call to the `MeasureCharacterRanges` method.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| ranges | [CharacterRange\[\]](../../com.aspose.drawing/characterrange) | An array of [CharacterRange](../../com.aspose.drawing/characterrange) structures that specifies the ranges of characters measured by a call to the `MeasureCharacterRanges` method. |

