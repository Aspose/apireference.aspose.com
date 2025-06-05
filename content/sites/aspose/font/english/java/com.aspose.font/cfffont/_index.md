---
title: CffFont
second_title: Aspose.Font for Java API Reference
description: Represents Compact Font Format CFF.
type: docs
weight: 19
url: /java/com.aspose.font/cfffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class CffFont extends Font
```

Represents Compact Font Format (CFF).
## Methods

| Method | Description |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Converts the Font into another format. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Returns array of all glyph ids, available in the Font. |
| [getClass()](#getClass--) |  |
| [getCommonFontsSettings()](#getCommonFontsSettings--) | Gets settings common to CFF fonts. |
| [getEncoding()](#getEncoding--) | Gets Font encoding. |
| [getFontDefinition()](#getFontDefinition--) | Gets font definition. |
| [getFontFamily()](#getFontFamily--) | Gets Font family. |
| [getFontName()](#getFontName--) | Gets Font face name. |
| [getFontNames()](#getFontNames--) | Gets Font names. |
| [getFontSaver()](#getFontSaver--) | Gets Font save functionality. |
| [getFontStyle()](#getFontStyle--) | Gets Font style. |
| [getFontType()](#getFontType--) | Gets Font type. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Font glyph accessor. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Returns glyph by glyph id. |
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | Returns glyph by glyph name. |
| [getGlyphById(long id)](#getGlyphById-long-) | Returns glyph by glyph id. |
| [getGlyphIdType()](#getGlyphIdType--) | Gets glyph id type specification. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Gets glyphs representation for text. |
| [getIndexDataProvider(CffIndexProviderType indexType)](#getIndexDataProvider-com.aspose.font.CffIndexProviderType-) | Gets provider for the specified CFF INDEX structure type. |
| [getMetrics()](#getMetrics--) | Gets Font metrics. |
| [getNumGlyphs()](#getNumGlyphs--) | Gets number of glyphs in the Font. |
| [getPostscriptNames()](#getPostscriptNames--) | Gets postscript Font names. |
| [getStyle()](#getStyle--) | Gets Font style. |
| [getTopDictDataProvider()](#getTopDictDataProvider--) |  |
| [hashCode()](#hashCode--) |  |
| [isCidKeyedFont()](#isCidKeyedFont--) | Gets value indicating that the Font is cid-keyed. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Opens a font, using FontDefinition object. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Opens a font, using font type and font data byte array. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Opens a font, using font type and stream source. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Opens a font, using font type and font file name. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Saves the Font into original format. |
| [save(String fileName)](#save-java.lang.String-) | Saves the Font into original format. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Saves the Font into format specified. |
| [setCommonFontsSettings(CffFontsSettings value)](#setCommonFontsSettings-com.aspose.font.CffFontsSettings-) | Specifies settings common to CFF fonts. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | The Font family setter is not implemented yet. |
| [setFontName(String value)](#setFontName-java.lang.String-) | The Font face name setter is not implemented yet. |
| [setStyle(String value)](#setStyle-java.lang.String-) | The Style setter is not implemented yet. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAllGlyphIds() {#getAllGlyphIds--}
```
public GlyphId[] getAllGlyphIds()
```


Returns array of all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class.

**Returns:**
com.aspose.font.GlyphId[]
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCommonFontsSettings() {#getCommonFontsSettings--}
```
public CffFontsSettings getCommonFontsSettings()
```


Gets settings common to CFF fonts. These settings are used in different scenarios and can be changed for each individual font.

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings) - Font definition.
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


Gets Font encoding.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public FontDefinition getFontDefinition()
```


Gets font definition.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


Gets Font family.

**Returns:**
java.lang.String - Font family.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Gets Font face name.

**Returns:**
java.lang.String - Font face name.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Gets Font names.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


Gets Font save functionality.

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public int getFontStyle()
```


Gets Font style. This is a value computed and represented in generalized type.

**Returns:**
int - Font style. Usually, a combination of FontStyle class constant flag values or 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Gets Font type. Returns FontType.CFF value.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getGlyphAccessor() {#getGlyphAccessor--}
```
public IGlyphAccessor getGlyphAccessor()
```


Font glyph accessor. Retrieves glyphs and glyph identifiers.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public Glyph getGlyphById(GlyphId id)
```


Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyph id. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


Returns glyph by glyph name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph name. |

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
| id | long | Glyph id. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Gets glyph id type specification.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Gets glyphs representation for text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Input text. |

**Returns:**
com.aspose.font.GlyphId[] - GlyphId array.
### getIndexDataProvider(CffIndexProviderType indexType) {#getIndexDataProvider-com.aspose.font.CffIndexProviderType-}
```
public ICffIndexDataProvider getIndexDataProvider(CffIndexProviderType indexType)
```


Gets provider for the specified CFF INDEX structure type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| indexType | [CffIndexProviderType](../../com.aspose.font/cffindexprovidertype) | Type of INDEX structure. |

**Returns:**
[ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider) - Implementation of ( ICffIndexDataProvider ) interface.
### getMetrics() {#getMetrics--}
```
public IFontMetrics getMetrics()
```


Gets Font metrics.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Gets number of glyphs in the Font.

**Returns:**
int - Number of glyphs in the Font.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Gets postscript Font names.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


Gets Font style. This is a raw string value provided by Font file.

**Returns:**
java.lang.String - Font style.
### getTopDictDataProvider() {#getTopDictDataProvider--}
```
public TopDictDataProvider getTopDictDataProvider()
```




**Returns:**
[TopDictDataProvider](../../com.aspose.font/topdictdataprovider)
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isCidKeyedFont() {#isCidKeyedFont--}
```
public boolean isCidKeyedFont()
```


Gets value indicating that the Font is cid-keyed.

**Returns:**
boolean - Value indicating that the Font is cid-keyed.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### open(FontDefinition fontDefinition) {#open-com.aspose.font.FontDefinition-}
```
public static Font open(FontDefinition fontDefinition)
```


Opens a font, using FontDefinition object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | Font definition object. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public static Font open(FontType fontType, byte[] fontData)
```


Opens a font, using font type and font data byte array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font type. |
| fontData | byte[] | Byte array to load font from. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public static Font open(FontType fontType, StreamSource fontStreamSource)
```


Opens a font, using font type and stream source.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font type. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | Stream source for font. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public static Font open(FontType fontType, String fileName)
```


Opens a font, using font type and font file name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font type. |
| fileName | java.lang.String | Font file name. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Saves the Font into original format.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream to save font. |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Saves the Font into original format.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File to save font. |

### saveToFormat(OutputStream stream, FontSavingFormats outFormat) {#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-}
```
public void saveToFormat(OutputStream stream, FontSavingFormats outFormat)
```


Saves the Font into format specified.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | stream to save font |
| outFormat | [FontSavingFormats](../../com.aspose.font/fontsavingformats) | desired format |

### setCommonFontsSettings(CffFontsSettings value) {#setCommonFontsSettings-com.aspose.font.CffFontsSettings-}
```
public void setCommonFontsSettings(CffFontsSettings value)
```


Specifies settings common to CFF fonts.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [CffFontsSettings](../../com.aspose.font/cfffontssettings) | Font definition. |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public void setFontFamily(String value)
```


The Font family setter is not implemented yet.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font family. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


The Font face name setter is not implemented yet.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font face name. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


The Style setter is not implemented yet.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font style. |

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

