---
title: XpsGlyphs
second_title: Aspose.Page for Java API Reference
description: Class incapsulating Glyphs element features.
type: docs
weight: 24
url: /java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Class incapsulating Glyphs element features. This element represents a run of uniformly-formatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers.
## Methods

| Method | Description |
| --- | --- |
| [getBidiLevel()](#getBidiLevel--) | Returns the value specifying the Unicode algorithm bidirectional nesting level. |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Sets the value specifying the Unicode algorithm bidirectional nesting level. |
| [getFill()](#getFill--) | Returns the brush used to fill the shape of the rendered glyphs. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Sets the brush used to fill the shape of the rendered glyphs. |
| [getFont()](#getFont--) | Returns the font resource for the TrueType font used to typeset elements text. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Returns the font size in drawing surface units, expressed as a float in units of the effective coordinate space. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Sets the font size in drawing surface units, expressed as a float in units of the effective coordinate space. |
| [getOriginX()](#getOriginX--) | Returns the x coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [setOriginX(float value)](#setOriginX-float-) | Sets the x coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [getOriginY()](#getOriginY--) | Returns the y coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [setOriginY(float value)](#setOriginY-float-) | Sets the y coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [isSideways()](#isSideways--) | Returns the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph. |
| [setSideways(boolean value)](#setSideways-boolean-) | Sets the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph. |
| [getUnicodeString()](#getUnicodeString--) | Returns the string of text rendered by the Glyphs element. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Sets the string of text rendered by the Glyphs element. |
| [getStyleSimulations()](#getStyleSimulations--) | Returns the value specifying a style simulation. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Sets the value specifying a style simulation. |
| [deepClone()](#deepClone--) | Clone this glyphs. |
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Returns the value specifying the Unicode algorithm bidirectional nesting level. Even values imply left-to-right layout, odd values imply right-to-left layout. Right-to-left layout places the run origin at the right side of the first glyph, with positive advance widths (representing advances to the left) placing subsequent glyphs to the left of the previous glyph.

**Returns:**
int - The value specifying the Unicode algorithm bidirectional nesting level.
### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Sets the value specifying the Unicode algorithm bidirectional nesting level. Even values imply left-to-right layout, odd values imply right-to-left layout. Right-to-left layout places the run origin at the right side of the first glyph, with positive advance widths (representing advances to the left) placing subsequent glyphs to the left of the previous glyph.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the Unicode algorithm bidirectional nesting level. |

### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Returns the brush used to fill the shape of the rendered glyphs.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Sets the brush used to fill the shape of the rendered glyphs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush used to fill the shape of the rendered glyphs. |

### getFont() {#getFont--}
```
public XpsFont getFont()
```


Returns the font resource for the TrueType font used to typeset elements text.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Returns the font size in drawing surface units, expressed as a float in units of the effective coordinate space.

**Returns:**
float - The font size.
### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Sets the font size in drawing surface units, expressed as a float in units of the effective coordinate space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The font size. |

### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Returns the x coordinate of the first glyph in the run, in units of the effective coordinate space.

**Returns:**
float - The x coordinate of the first glyph in the run, in units of the effective coordinate space.
### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Sets the x coordinate of the first glyph in the run, in units of the effective coordinate space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The x coordinate of the first glyph in the run, in units of the effective coordinate space. |

### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Returns the y coordinate of the first glyph in the run, in units of the effective coordinate space.

**Returns:**
float - The y coordinate of the first glyph in the run, in units of the effective coordinate space.
### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Sets the y coordinate of the first glyph in the run, in units of the effective coordinate space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The y coordinate of the first glyph in the run, in units of the effective coordinate space. |

### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Returns the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph.

**Returns:**
boolean - The value indicating that a glyph is turned on its side.
### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Sets the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value indicating that a glyph is turned on its side. |

### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Returns the string of text rendered by the Glyphs element. The text is specified as Unicode code points.

**Returns:**
java.lang.String - The string of text rendered by the Glyphs element.
### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Sets the string of text rendered by the Glyphs element. The text is specified as Unicode code points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The string of text rendered by the Glyphs element. |

### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Returns the value specifying a style simulation.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Sets the value specifying a style simulation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | The value specifying a style simulation. |

### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Clone this glyphs.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
