---
title: XpsCanvas
second_title: Aspose.Page for Java API Reference
description: Class incapsulating Canvas element features.
type: docs
weight: 16
url: /java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Class incapsulating Canvas element features. This element groups elements together. For example, Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit (as a hyperlink destination) or to apply a composed property value to each child and ancestor element.
## Methods

| Method | Description |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Adds an element to this canvas's child list. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserts an element to this canvas's child list at  index  position. |
| [addCanvas()](#addCanvas--) | Adds a new canvas to this canvas's child list. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Adds new glyphs to this canvas's child list. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Adds a new path to this canvas's child list. |
| [deepClone()](#deepClone--) | Clones this canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Provides access to element's children by index  i . |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Returns the path geometry limiting the rendered region of the element. |
| [getEdgeMode()](#getEdgeMode--) | Returns the value that controls how edges of paths within the canvas are rendered. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Returns hyperlink target object. |
| [getOpacity()](#getOpacity--) | Returns the value defining the uniform transparency of the element. |
| [getOpacityMask()](#getOpacityMask--) | Returns the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [getRenderTransform()](#getRenderTransform--) | Returns the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserts a new canvas to this canvas's child list at  index  position. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserts new glyphs to this canvas's child list at  index  position. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserts a new path to this canvas's child list at  index  position. |
| [iterator()](#iterator--) | Implementation of  Iterable  interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Sets the path geometry limiting the rendered region of the element. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Sets the value that controls how edges of paths within the canvas are rendered. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Sets hyperlink target object. |
| [setOpacity(float value)](#setOpacity-float-) | Sets the value defining the uniform transparency of the element. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [size()](#size--) | Returns the number of child elements. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Adds an element to this canvas's child list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | T | The element to add. |

**Returns:**
T - Added element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Inserts an element to this canvas's child list at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which an element should be inserted. |
| element | T | The element to insert. |

**Returns:**
T - Inserted element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Adds a new canvas to this canvas's child list.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Adds new glyphs to this canvas's child list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | Font family. |
| fontSize | float | Font size. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Font style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin T coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Adds a new path to this canvas's child list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Clones this canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Returns the value that controls how edges of paths within the canvas are rendered.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Returns the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Inserts a new canvas to this canvas's child list at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a new canvas should be inserted. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserts new glyphs to this canvas's child list at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which new glyphs should be inserted. |
| fontFamily | java.lang.String | Font family. |
| fontSize | float | Font size. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Font style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin T coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserts a new path to this canvas's child list at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a new path should be inserted. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Sets the path geometry limiting the rendered region of the element.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The path geometry limiting the rendered region of the element. |

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Sets the value that controls how edges of paths within the canvas are rendered.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | The edge rendering mode. |

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

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The affine transformation matrix. |

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

