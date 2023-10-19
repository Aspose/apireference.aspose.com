---
title: TtfFont
second_title: Aspose.Font for Java API Reference
description: Represents TrueType Font TTF.
type: docs
weight: 75
url: /java/com.aspose.font/ttffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class TtfFont extends Font
```

Represents TrueType Font (TTF).
## Methods

| Method | Description |
| --- | --- |
| [getTtfTables()](#getTtfTables--) | Gets TTF tables. |
| [getCffFont()](#getCffFont--) | Gets CFF Font if present. |
| [getFontType()](#getFontType--) | Gets Font type. |
| [getFontFamily()](#getFontFamily--) | Gets Font family. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Sets Font family. |
| [getStyle()](#getStyle--) | Gets Font style. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Sets Font style. |
| [getFontStyle()](#getFontStyle--) | Gets Font style. |
| [getFontName()](#getFontName--) | Gets Font face name. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Sets Font face name. |
| [getFontNames()](#getFontNames--) | Gets Font names. |
| [getPostscriptNames()](#getPostscriptNames--) | Gets Postscript font names. |
| [getNumGlyphs()](#getNumGlyphs--) | Gets number of glyphs in the Font. |
| [isSymbolic()](#isSymbolic--) | Returns true in case Font is symbolic. |
| [getMetrics()](#getMetrics--) | Gets Font metrics. |
| [getEncoding()](#getEncoding--) | Gets Font encoding. |
| [getGlyphIdType()](#getGlyphIdType--) | Gets glyph id type specification. |
| [getFontDefinition()](#getFontDefinition--) | Gets Font definition. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Returns glyph by glyph id. |
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | Returns glyph by glyph name. |
| [getGlyphById(long id)](#getGlyphById-long-) | Returns glyph by glyph id. |
| [getAllGlyphIds()](#getAllGlyphIds--) | Returns array of all glyph ids, available in the Font. |
| [getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-) | Gets a glyph by glyph identifier passed and fills passed list of glyph identifiers with components of this glyph. |
| [getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-) | Gets a glyph by glyph name passed and fills passed list of glyph identifiers with components of this glyph. |
| [getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-) | Gets a glyph by glyph index passed and fills passed list of glyph identifiers with components of this glyph. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Get glyphs representation for text. |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Converts the Font into another format. |
| [convert(FontType fontType, Collection<Integer> limitingCharacterSet)](#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--) | Converts the Font into another format with limiting character set  *Note: TTF Font type is now supported only.* |
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Gets TTF tables.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - TTF tables.
### getCffFont() {#getCffFont--}
```
public Font getCffFont()
```


Gets CFF Font if present.

**Returns:**
[Font](../../com.aspose.font/font) - CFF Font.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Gets Font type. Returns FontType.TTF value.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


Gets Font family.

**Returns:**
java.lang.String - Font family.
### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public void setFontFamily(String value)
```


Sets Font family.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font family. |

### getStyle() {#getStyle--}
```
public String getStyle()
```


Gets Font style. This is a raw string value provided by Font file.

**Returns:**
java.lang.String - Font style.
### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


Sets Font style. This is a raw string value provided by Font file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font style. |

### getFontStyle() {#getFontStyle--}
```
public int getFontStyle()
```


Gets Font style. This is a value computed and represented in generalized type.

**Returns:**
int - Font style. Usually, a combination of FontStyle class constant flag values or 0.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Gets Font face name.

**Returns:**
java.lang.String - Font face name.
### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


Sets Font face name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font face name. |

### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Gets Font names.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Gets Postscript font names.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Gets number of glyphs in the Font.

**Returns:**
int - Number of glyphs in the Font.
### isSymbolic() {#isSymbolic--}
```
public boolean isSymbolic()
```


Returns true in case Font is symbolic.

**Returns:**
boolean - True in case Font is symbolic.
### getMetrics() {#getMetrics--}
```
public IFontMetrics getMetrics()
```


Gets Font metrics.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


Gets Font encoding.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Gets glyph id type specification.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
### getFontDefinition() {#getFontDefinition--}
```
public FontDefinition getFontDefinition()
```


Gets Font definition.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public Glyph getGlyphById(GlyphId id)
```


Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) |  |

**Returns:**
[Glyph](../../com.aspose.font/glyph)
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


Returns glyph by glyph name. Name (string) glyph addressing is supported for TTF fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph string identifier. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(long id) {#getGlyphById-long-}
```
public Glyph getGlyphById(long id)
```


Returns glyph by glyph id.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | long | Glyph index. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getAllGlyphIds() {#getAllGlyphIds--}
```
public GlyphId[] getAllGlyphIds()
```


Returns array of all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name.

**Returns:**
com.aspose.font.GlyphId[] - Glyph identifiers.
### getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```


Gets a glyph by glyph identifier passed and fills passed list of glyph identifiers with components of this glyph. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name.

--------------------

Empty collection componentsToPopulate should be passed that will contain glyph components id list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyph id. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | List of glyph identifiers to fill. |

### getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)
```


Gets a glyph by glyph name passed and fills passed list of glyph identifiers with components of this glyph.

--------------------

Empty collection componentsToPopulate should be passed that will contain glyph components id list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph name. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | List of glyph identifiers to fill. |

### getGlyphComponentsById(long id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)
```


Gets a glyph by glyph index passed and fills passed list of glyph identifiers with components of this glyph.

--------------------

Empty collection componentsToPopulate should be passed that will contain glyph components id list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | long | Glyph index. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | List of glyph identifiers to fill. |

### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Get glyphs representation for text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Input text. |

**Returns:**
com.aspose.font.GlyphId[] - GlyphId array.
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public Font convert(FontType fontType)
```


Converts the Font into another format. Note: TTF Font type is now supported only.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font format type to convert into. |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
### convert(FontType fontType, Collection<Integer> limitingCharacterSet) {#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--}
```
public Font convert(FontType fontType, Collection<Integer> limitingCharacterSet)
```


Converts the Font into another format with limiting character set  *Note: TTF Font type is now supported only.*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font format type to convert into. |
| limitingCharacterSet | java.util.Collection<java.lang.Integer> | Limiting character set. |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
