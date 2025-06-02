---
title: Font
second_title: Aspose.Font for Java API Reference
description: Represents base Font class.
type: docs
weight: 31
url: /java/com.aspose.font/font/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFont](../../com.aspose.font/ifont), [com.aspose.font.IGlyphAccessor](../../com.aspose.font/iglyphaccessor), [com.aspose.font.IFontSaver](../../com.aspose.font/ifontsaver)
```
public abstract class Font implements IFont, IGlyphAccessor, IFontSaver
```

Represents base Font class.
## Methods

| Method | Description |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Converts the Font into another format. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Returns all glyph ids, available in the Font. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Gets Font encoding. |
| [getFontDefinition()](#getFontDefinition--) | Gets Font definition. |
| [getFontFamily()](#getFontFamily--) | Gets Font family. |
| [getFontName()](#getFontName--) | Gets Font face name. |
| [getFontNames()](#getFontNames--) | Gets Font names. |
| [getFontSaver()](#getFontSaver--) | Gets Font save functionality. |
| [getFontStyle()](#getFontStyle--) | Gets Font style. |
| [getFontType()](#getFontType--) | Gets Font type. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Font glyph accessor. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Returns glyph by glyph Id. |
| [getGlyphIdType()](#getGlyphIdType--) | Glyph id type specification. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Gets glyphs representation for text. |
| [getMetrics()](#getMetrics--) | Gets Font metrics. |
| [getNumGlyphs()](#getNumGlyphs--) | Gets number of glyphs in the Font. |
| [getPostscriptNames()](#getPostscriptNames--) | Gets postscript font names. |
| [getStyle()](#getStyle--) | Gets Font style. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Opens a font, using FontDefinition object. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Opens a font, using font type and font data byte array. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Opens a font, using font type and stream source. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Opens a font, using font type and font file name. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Saves the Font into original format. |
| [save(String fileName)](#save-java.lang.String-) | Saves the Font into original format. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Saves the Font into format specified. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Sets Font family. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Sets Font face name. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Sets Font style. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public abstract Font convert(FontType fontType)
```


Converts the Font into another format.

--------------------

> ```
> Note: TTF Font type is now supported only.
> ```

fontType Font format type to convert into.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) |  |

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
public abstract GlyphId[] getAllGlyphIds()
```


Returns all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. for example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphInt32Id ) class.

**Returns:**
com.aspose.font.GlyphId[] - Glyph identifiers.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public abstract IFontEncoding getEncoding()
```


Gets Font encoding.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public abstract FontDefinition getFontDefinition()
```


Gets Font definition.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public abstract String getFontFamily()
```


Gets Font family.

**Returns:**
java.lang.String - Font family.
### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


Gets Font face name.

**Returns:**
java.lang.String - Font face name.
### getFontNames() {#getFontNames--}
```
public abstract MultiLanguageString getFontNames()
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
public abstract int getFontStyle()
```


Gets Font style. This is a value computed and represented in generalized type.

**Returns:**
int - Font style. Usually, a combination of FontStyle class constant flag values or 0.
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
### getGlyphAccessor() {#getGlyphAccessor--}
```
public IGlyphAccessor getGlyphAccessor()
```


Font glyph accessor. Retrieves glyphs and glyph identifiers.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public abstract Glyph getGlyphById(GlyphId id)
```


Returns glyph by glyph Id. Glyph id is a unique number for a glyph, which is font type dependent. GlyphId - derived object. for example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyph id. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public abstract GlyphIdType getGlyphIdType()
```


Glyph id type specification. For consumers who needs to know the 'bytes[]' real type.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Id type specification
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
### getMetrics() {#getMetrics--}
```
public abstract IFontMetrics getMetrics()
```


Gets Font metrics.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public abstract int getNumGlyphs()
```


Gets number of glyphs in the Font.

**Returns:**
int - Number of glyphs in the Font.
### getPostscriptNames() {#getPostscriptNames--}
```
public abstract MultiLanguageString getPostscriptNames()
```


Gets postscript font names.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public abstract String getStyle()
```


Gets Font style. This is a raw string value provided by Font file.

**Returns:**
java.lang.String - Font style.
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

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public abstract void setFontFamily(String value)
```


Sets Font family.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font family. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public abstract void setFontName(String value)
```


Sets Font face name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New Font face name. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public abstract void setStyle(String value)
```


Sets Font style. This is a raw string value provided by Font file.

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

