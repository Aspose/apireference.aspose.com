---
title: ITrFont
second_title: Aspose.Page for Java API Reference
description: This interface give access to main parameters of font.
type: docs
weight: 25
url: /java/com.aspose.page/itrfont/
---
```
public interface ITrFont
```

This interface give access to main parameters of font.
## Methods

| Method | Description |
| --- | --- |
| [getFontType()](#getFontType--) | Gets a type of font in Adobe classification. |
| [getFID()](#getFID--) | Returns font identifier. |
| [getFontName()](#getFontName--) | Gets a name of font. |
| [getEncodingTable()](#getEncodingTable--) | Gets a name of the encoding. |
| [getEncoding()](#getEncoding--) | Gets encoding array. |
| [getCharStrings()](#getCharStrings--) | Gets a mapping between character name and glyph. |
| [getFont()](#getFont--) | Gets DrFont corresponding to this font. |
| [getNativeFont()](#getNativeFont--) | Gets java.awt.Font corresponding to this font. |
| [getTransform()](#getTransform--) | Gets font transformation. |
| [getSize()](#getSize--) | Gets font size. |
| [getStyle()](#getStyle--) | Gets font style. |
| [deriveFont(float size)](#deriveFont-float-) | Creates equivalent of this font with new size. |
| [deriveFont(int style)](#deriveFont-int-) | Creates equivalent of this font with new style. |
| [deriveFont(float size, int style)](#deriveFont-float-int-) | Creates equivalent of this font with new size and style. |
| [deriveFont(AffineTransform transform)](#deriveFont-java.awt.geom.AffineTransform-) | Creates equivalent of this font with new transform. |
| [getCharWidth(char charValue)](#getCharWidth-char-) | Gets a width of character. |
| [getOutline(char charValue, float x, float y)](#getOutline-char-float-float-) | Returns an outline of glyph in specified location. |
| [clone()](#clone--) | Clones the font. |
### getFontType() {#getFontType--}
```
public abstract int getFontType()
```


Gets a type of font in Adobe classification.

**Returns:**
int - Font type.
### getFID() {#getFID--}
```
public abstract int getFID()
```


Returns font identifier.

**Returns:**
int - font identifier
### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


Gets a name of font.

**Returns:**
java.lang.String - Font name.
### getEncodingTable() {#getEncodingTable--}
```
public abstract String getEncodingTable()
```


Gets a name of the encoding.

**Returns:**
java.lang.String - A name of the encoding.
### getEncoding() {#getEncoding--}
```
public abstract String[] getEncoding()
```


Gets encoding array.

**Returns:**
java.lang.String[] - An encoding array.
### getCharStrings() {#getCharStrings--}
```
public abstract HashMap<String,IGlyph> getCharStrings()
```


Gets a mapping between character name and glyph.

**Returns:**
java.util.HashMap<java.lang.String,com.aspose.page.IGlyph> - A mapping between character name and glyph.
### getFont() {#getFont--}
```
public abstract DrFont getFont()
```


Gets DrFont corresponding to this font.

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### getNativeFont() {#getNativeFont--}
```
public abstract Font getNativeFont()
```


Gets java.awt.Font corresponding to this font.

**Returns:**
java.awt.Font - Native font.
### getTransform() {#getTransform--}
```
public abstract AffineTransform getTransform()
```


Gets font transformation.

**Returns:**
java.awt.geom.AffineTransform - A transformation.
### getSize() {#getSize--}
```
public abstract float getSize()
```


Gets font size.

**Returns:**
float - A size of the font.
### getStyle() {#getStyle--}
```
public abstract int getStyle()
```


Gets font style.

**Returns:**
int - A style of the font.
### deriveFont(float size) {#deriveFont-float-}
```
public abstract ITrFont deriveFont(float size)
```


Creates equivalent of this font with new size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | float | Size of new font. |

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - A new font.
### deriveFont(int style) {#deriveFont-int-}
```
public abstract ITrFont deriveFont(int style)
```


Creates equivalent of this font with new style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | int | Style of new font. |

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - A new font.
### deriveFont(float size, int style) {#deriveFont-float-int-}
```
public abstract ITrFont deriveFont(float size, int style)
```


Creates equivalent of this font with new size and style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | float | Size of new font. |
| style | int | Style of new font. |

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - A new font.
### deriveFont(AffineTransform transform) {#deriveFont-java.awt.geom.AffineTransform-}
```
public abstract ITrFont deriveFont(AffineTransform transform)
```


Creates equivalent of this font with new transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Transformation of new font. |

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - A new font.
### getCharWidth(char charValue) {#getCharWidth-char-}
```
public abstract float getCharWidth(char charValue)
```


Gets a width of character.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| charValue | char | Character. |

**Returns:**
float - A width of character.
### getOutline(char charValue, float x, float y) {#getOutline-char-float-float-}
```
public abstract Shape getOutline(char charValue, float x, float y)
```


Returns an outline of glyph in specified location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| charValue | char | Character. |
| x | float | X coordinate of the character location. |
| y | float | Y coordinate of the character location. |

**Returns:**
java.awt.Shape - An outline of glyph.
### clone() {#clone--}
```
public abstract ITrFont clone()
```


Clones the font.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - A new font.
