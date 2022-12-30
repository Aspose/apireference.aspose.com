---
title: IFont
second_title: Aspose.Font for Java API Reference
description: Declares common functionality for all font formats.
type: docs
weight: 98
url: /java/com.aspose.font/ifont/
---```
public interface IFont
```

Declares common functionality for all font formats. Implemented by Font classes.
## Methods

| Method | Description |
| --- | --- |
| [getFontType()](#getFontType--) | Gets Font type. |
| [getStyle()](#getStyle--) | Gets Font style. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Sets Font style. |
| [getFontStyle()](#getFontStyle--) | Gets Font style. |
| [getFontFamily()](#getFontFamily--) | Gets Font family. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Sets Font family. |
| [getFontName()](#getFontName--) | Gets Font face name. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Sets Font face name. |
| [getFontNames()](#getFontNames--) | Gets Font names. |
| [getPostscriptNames()](#getPostscriptNames--) | Gets postscript Font names. |
| [getNumGlyphs()](#getNumGlyphs--) | Gets number of glyphs in the Font. |
| [getMetrics()](#getMetrics--) | Gets Font metrics. |
| [getEncoding()](#getEncoding--) | Gets Font encoding. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Gets Font glyph accessor. |
| [getFontDefinition()](#getFontDefinition--) | Gets Font definition. |
| [getFontSaver()](#getFontSaver--) | Gets Font save functionality. |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Converts the Font into another format. |
### getFontType() {#getFontType--}
```
public abstract FontType getFontType()
```


Gets Font type.

--------------------

> ```
> Type1, TrueType etc.
> ```

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getStyle() {#getStyle--}
```
public abstract String getStyle()
```


Gets Font style. This is a raw string value provided by Font file.

**Returns:**
java.lang.String - Font style.
### setStyle(String value) {#setStyle-java.lang.String-}
```
public abstract void setStyle(String value)
```


Sets Font style. This is a raw string value provided by Font file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font style. |

### getFontStyle() {#getFontStyle--}
```
public abstract int getFontStyle()
```


Gets Font style. This is a value computed and represented in generalized type.

**Returns:**
int - Font style. Usually, a combination of FontStyle class constant flag values or 0.
### getFontFamily() {#getFontFamily--}
```
public abstract String getFontFamily()
```


Gets Font family.

**Returns:**
java.lang.String - Font family.
### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public abstract void setFontFamily(String value)
```


Sets Font family.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font family. |

### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


Gets Font face name.

**Returns:**
java.lang.String - Font face name.
### setFontName(String value) {#setFontName-java.lang.String-}
```
public abstract void setFontName(String value)
```


Sets Font face name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font face name. |

### getFontNames() {#getFontNames--}
```
public abstract MultiLanguageString getFontNames()
```


Gets Font names.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
### getPostscriptNames() {#getPostscriptNames--}
```
public abstract MultiLanguageString getPostscriptNames()
```


Gets postscript Font names.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names.
### getNumGlyphs() {#getNumGlyphs--}
```
public abstract int getNumGlyphs()
```


Gets number of glyphs in the Font.

**Returns:**
int - Number of glyphs in the Font..
### getMetrics() {#getMetrics--}
```
public abstract IFontMetrics getMetrics()
```


Gets Font metrics.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getEncoding() {#getEncoding--}
```
public abstract IFontEncoding getEncoding()
```


Gets Font encoding.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getGlyphAccessor() {#getGlyphAccessor--}
```
public abstract IGlyphAccessor getGlyphAccessor()
```


Gets Font glyph accessor. Retrieves glyphs and glyph identifiers.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getFontDefinition() {#getFontDefinition--}
```
public abstract FontDefinition getFontDefinition()
```


Gets Font definition.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontSaver() {#getFontSaver--}
```
public abstract IFontSaver getFontSaver()
```


Gets Font save functionality.

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public abstract Font convert(FontType fontType)
```


Converts the Font into another format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | type to convert to font into |

**Returns:**
[Font](../../com.aspose.font/font) - font converted into format specified
