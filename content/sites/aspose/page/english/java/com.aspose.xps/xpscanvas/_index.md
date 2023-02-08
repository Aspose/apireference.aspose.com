---
title: XpsCanvas
second_title: Aspose.Page for Java API Reference
description: Class incapsulating Canvas element features.
type: docs
weight: 15
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
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserts an element to this canvas's child list at \`\`\` index \`\`\` position. |
| [addCanvas()](#addCanvas--) | Adds a new canvas to this canvas's child list. |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserts a new canvas to this canvas's child list at \`\`\` index \`\`\` position. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Adds a new path to this canvas's child list. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserts a new path to this canvas's child list at \`\`\` index \`\`\` position. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Adds new glyphs to this canvas's child list. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserts new glyphs to this canvas's child list at \`\`\` index \`\`\` position. |
| [getEdgeMode()](#getEdgeMode--) | Returns the value that controls how edges of paths within the canvas are rendered. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Sets the value that controls how edges of paths within the canvas are rendered. |
| [deepClone()](#deepClone--) | Clones this canvas. |
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


Inserts an element to this canvas's child list at \`\`\` index \`\`\` position.

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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Inserts a new canvas to this canvas's child list at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a new canvas should be inserted. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
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
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserts a new path to this canvas's child list at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a new path should be inserted. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserts new glyphs to this canvas's child list at \`\`\` index \`\`\` position.

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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Returns the value that controls how edges of paths within the canvas are rendered.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Sets the value that controls how edges of paths within the canvas are rendered.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | The edge rendering mode. |

### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Clones this canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
