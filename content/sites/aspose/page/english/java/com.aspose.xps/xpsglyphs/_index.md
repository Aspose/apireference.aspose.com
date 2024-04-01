---
title: XpsGlyphs
second_title: Aspose.Page for Java API Reference
description: Class incapsulating Glyphs element features.
type: docs
weight: 25
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
| [deepClone()](#deepClone--) | Clone this glyphs. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Provides access to element's children by index  i . |
| [getBidiLevel()](#getBidiLevel--) | Returns the value specifying the Unicode algorithm bidirectional nesting level. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Returns the path geometry limiting the rendered region of the element. |
| [getFill()](#getFill--) | Returns the brush used to fill the shape of the rendered glyphs. |
| [getFont()](#getFont--) | Returns the font resource for the TrueType font used to typeset elements text. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Returns the font size in drawing surface units, expressed as a float in units of the effective coordinate space. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Returns hyperlink target object. |
| [getOpacity()](#getOpacity--) | Returns the value defining the uniform transparency of the element. |
| [getOpacityMask()](#getOpacityMask--) | Returns the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [getOriginX()](#getOriginX--) | Returns the x coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [getOriginY()](#getOriginY--) | Returns the y coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [getRenderTransform()](#getRenderTransform--) | Returns the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [getStyleSimulations()](#getStyleSimulations--) | Returns the value specifying a style simulation. |
| [getUnicodeString()](#getUnicodeString--) | Returns the string of text rendered by the Glyphs element. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Returns the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph. |
| [iterator()](#iterator--) | Implementation of  Iterable  interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Sets the value specifying the Unicode algorithm bidirectional nesting level. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Sets the path geometry limiting the rendered region of the element. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Sets the brush used to fill the shape of the rendered glyphs. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Sets the font size in drawing surface units, expressed as a float in units of the effective coordinate space. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Sets hyperlink target object. |
| [setOpacity(float value)](#setOpacity-float-) | Sets the value defining the uniform transparency of the element. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [setOriginX(float value)](#setOriginX-float-) | Sets the x coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [setOriginY(float value)](#setOriginY-float-) | Sets the y coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [setSideways(boolean value)](#setSideways-boolean-) | Sets the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Sets the value specifying a style simulation. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Sets the string of text rendered by the Glyphs element. |
| [size()](#size--) | Returns the number of child elements. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Clone this glyphs.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Provides access to element's children by index  i .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| i | int | Index of child element. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Returns the value specifying the Unicode algorithm bidirectional nesting level. Even values imply left-to-right layout, odd values imply right-to-left layout. Right-to-left layout places the run origin at the right side of the first glyph, with positive advance widths (representing advances to the left) placing subsequent glyphs to the left of the previous glyph.

**Returns:**
int - The value specifying the Unicode algorithm bidirectional nesting level.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Returns the path geometry limiting the rendered region of the element.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Returns the brush used to fill the shape of the rendered glyphs.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
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
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Returns hyperlink target object.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returns the value defining the uniform transparency of the element.

**Returns:**
float - The value defining the uniform transparency of the element.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Returns the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Returns the x coordinate of the first glyph in the run, in units of the effective coordinate space.

**Returns:**
float - The x coordinate of the first glyph in the run, in units of the effective coordinate space.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Returns the y coordinate of the first glyph in the run, in units of the effective coordinate space.

**Returns:**
float - The y coordinate of the first glyph in the run, in units of the effective coordinate space.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Returns the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Returns the value specifying a style simulation.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Returns the string of text rendered by the Glyphs element. The text is specified as Unicode code points.

**Returns:**
java.lang.String - The string of text rendered by the Glyphs element.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Returns the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph.

**Returns:**
boolean - The value indicating that a glyph is turned on its side.
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Implementation of  Iterable  interface.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Returns enumerator for the list.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Sets the value specifying the Unicode algorithm bidirectional nesting level. Even values imply left-to-right layout, odd values imply right-to-left layout. Right-to-left layout places the run origin at the right side of the first glyph, with positive advance widths (representing advances to the left) placing subsequent glyphs to the left of the previous glyph.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the Unicode algorithm bidirectional nesting level. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Sets the path geometry limiting the rendered region of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The path geometry limiting the rendered region of the element. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Sets the brush used to fill the shape of the rendered glyphs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush used to fill the shape of the rendered glyphs. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Sets the font size in drawing surface units, expressed as a float in units of the effective coordinate space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The font size. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Sets hyperlink target object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Hyperlink target object. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sets the value defining the uniform transparency of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The value defining the uniform transparency of the element. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | The brush specifying a mask. |

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Sets the x coordinate of the first glyph in the run, in units of the effective coordinate space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The x coordinate of the first glyph in the run, in units of the effective coordinate space. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Sets the y coordinate of the first glyph in the run, in units of the effective coordinate space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The y coordinate of the first glyph in the run, in units of the effective coordinate space. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The affine transformation matrix. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Sets the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value indicating that a glyph is turned on its side. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Sets the value specifying a style simulation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | The value specifying a style simulation. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Sets the string of text rendered by the Glyphs element. The text is specified as Unicode code points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The string of text rendered by the Glyphs element. |

### size() {#size--}
```
public int size()
```


Returns the number of child elements.

**Returns:**
int - The number of child elements.
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

