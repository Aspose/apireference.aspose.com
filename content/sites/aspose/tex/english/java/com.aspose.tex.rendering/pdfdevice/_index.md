---
title: PdfDevice
second_title: Aspose.TeX for Java API Reference
description: Implements the interface for outputting text and graphic content to PDF document.
type: docs
weight: 17
url: /java/com.aspose.tex.rendering/pdfdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.tex.rendering.Device](../../com.aspose.tex.rendering/device)

**All Implemented Interfaces:**
[com.aspose.tex.rendering.IInteractiveDevice](../../com.aspose.tex.rendering/iinteractivedevice), [com.aspose.tex.rendering.IFragmentRasterizer](../../com.aspose.tex.rendering/ifragmentrasterizer)
```
public class PdfDevice extends Device implements IInteractiveDevice, IFragmentRasterizer
```

Implements the interface for outputting text and graphic content to PDF document.
## Constructors

| Constructor | Description |
| --- | --- |
| [PdfDevice()](#PdfDevice--) | Creates new instance. |
| [PdfDevice(OutputStream stream)](#PdfDevice-java.io.OutputStream-) | Creates new instance. |
## Methods

| Method | Description |
| --- | --- |
| [init()](#init--) | Initializes device. |
| [getPageCount()](#getPageCount--) | Gets the number of pages. |
| [isReady()](#isReady--) | Shows if device is ready for output. |
| [getDestinationName()](#getDestinationName--) | Gets destination name: output file name or device description. |
| [create()](#create--) | Creates a copy of this device. |
| [dispose()](#dispose--) | Disposes the device. |
| [startDocument()](#startDocument--) | Starts the whole document. |
| [endDocument()](#endDocument--) | Finalizes the whole document. |
| [startPage(float width, float height)](#startPage-float-float-) | Starts a new page. |
| [endPage()](#endPage--) | Finalizes a page. |
| [addHyperlink(Rectangle2D activeRect, ColoredStroke border, String targetUri)](#addHyperlink-java.awt.geom.Rectangle2D-com.aspose.tex.rendering.ColoredStroke-java.lang.String-) | Sets the hyperlink with a URI as its target. |
| [addBookmark(String name, Point2D position)](#addBookmark-java.lang.String-java.awt.geom.Point2D-) | Adds the bookmark identified by the name. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Sets the current coordinate space transformation. |
| [setClip(Shape path)](#setClip-java.awt.Shape-) | Sets the current clip path. |
| [getStroke()](#getStroke--) | Gets the current stroke. |
| [setStroke(ColoredStroke value)](#setStroke-com.aspose.tex.rendering.ColoredStroke-) | Sets the current stroke. |
| [getFill()](#getFill--) | Gets the current fill color. |
| [setFill(Color value)](#setFill-java.awt.Color-) | Sets the current fill color. |
| [getStrokeOpacity()](#getStrokeOpacity--) | Gets the current stroke opacity. |
| [setStrokeOpacity(float value)](#setStrokeOpacity-float-) | Sets the current stroke opacity. |
| [getFillOpacity()](#getFillOpacity--) | Gets the current fill opacity. |
| [setFillOpacity(float value)](#setFillOpacity-float-) | Sets the current fill opacity. |
| [drawString(String str, float originX, float originY, List<GlyphData> charInfos)](#drawString-java.lang.String-float-float-java.util.List-com.aspose.tex.rendering.GlyphData--) | Draws a text string. |
| [drawPath(Shape path)](#drawPath-java.awt.Shape-) | Draws a path. |
| [fillPath(Shape path)](#fillPath-java.awt.Shape-) | Fills a path. |
| [showImage(Point2D origin, Dimension2D size, byte[] imageData)](#showImage-java.awt.geom.Point2D-java.awt.geom.Dimension2D-byte---) | Shows a raster image. |
| [startFragment()](#startFragment--) | Starts a fragment to rasterize. |
| [endFragment()](#endFragment--) | Ends a fragment to rasterize. |
### PdfDevice() {#PdfDevice--}
```
public PdfDevice()
```


Creates new instance. The output file will be written to the output working directory taking the job name as a file name.

### PdfDevice(OutputStream stream) {#PdfDevice-java.io.OutputStream-}
```
public PdfDevice(OutputStream stream)
```


Creates new instance. The output file will be written to specified stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | The stream to write the output file to. |

### init() {#init--}
```
public void init()
```


Initializes device.

### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Gets the number of pages.

**Returns:**
int
### isReady() {#isReady--}
```
public boolean isReady()
```


Shows if device is ready for output.

**Returns:**
boolean
### getDestinationName() {#getDestinationName--}
```
public String getDestinationName()
```


Gets destination name: output file name or device description.

**Returns:**
java.lang.String
### create() {#create--}
```
public Device create()
```


Creates a copy of this device.

**Returns:**
[Device](../../com.aspose.tex.rendering/device) - Copy of this device.
### dispose() {#dispose--}
```
public void dispose()
```


Disposes the device.

### startDocument() {#startDocument--}
```
public void startDocument()
```


Starts the whole document.

### endDocument() {#endDocument--}
```
public void endDocument()
```


Finalizes the whole document.

### startPage(float width, float height) {#startPage-float-float-}
```
public void startPage(float width, float height)
```


Starts a new page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | The page width. |
| height | float | The page height. |

### endPage() {#endPage--}
```
public void endPage()
```


Finalizes a page.

### addHyperlink(Rectangle2D activeRect, ColoredStroke border, String targetUri) {#addHyperlink-java.awt.geom.Rectangle2D-com.aspose.tex.rendering.ColoredStroke-java.lang.String-}
```
public void addHyperlink(Rectangle2D activeRect, ColoredStroke border, String targetUri)
```


Sets the hyperlink with a URI as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| activeRect | java.awt.geom.Rectangle2D | The active rectangle of the link. |
| border | [ColoredStroke](../../com.aspose.tex.rendering/coloredstroke) | The link border. |
| targetUri | java.lang.String | The target URI. |

### addBookmark(String name, Point2D position) {#addBookmark-java.lang.String-java.awt.geom.Point2D-}
```
public void addBookmark(String name, Point2D position)
```


Adds the bookmark identified by the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The bookmark name. |
| position | java.awt.geom.Point2D | The bookmark position. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Sets the current coordinate space transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | The transformation matrix. |

### setClip(Shape path) {#setClip-java.awt.Shape-}
```
public void setClip(Shape path)
```


Sets the current clip path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | The clip path. |

### getStroke() {#getStroke--}
```
public ColoredStroke getStroke()
```


Gets the current stroke.

**Returns:**
[ColoredStroke](../../com.aspose.tex.rendering/coloredstroke) - The current stroke.
### setStroke(ColoredStroke value) {#setStroke-com.aspose.tex.rendering.ColoredStroke-}
```
public void setStroke(ColoredStroke value)
```


Sets the current stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ColoredStroke](../../com.aspose.tex.rendering/coloredstroke) | The new current stroke. |

### getFill() {#getFill--}
```
public Color getFill()
```


Gets the current fill color.

**Returns:**
java.awt.Color - The current fill color.
### setFill(Color value) {#setFill-java.awt.Color-}
```
public void setFill(Color value)
```


Sets the current fill color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Color | The new current fill color. |

### getStrokeOpacity() {#getStrokeOpacity--}
```
public float getStrokeOpacity()
```


Gets the current stroke opacity.

**Returns:**
float - The current stroke opacity.
### setStrokeOpacity(float value) {#setStrokeOpacity-float-}
```
public void setStrokeOpacity(float value)
```


Sets the current stroke opacity.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The current stroke opacity. |

### getFillOpacity() {#getFillOpacity--}
```
public float getFillOpacity()
```


Gets the current fill opacity.

**Returns:**
float - The current fill opacity.
### setFillOpacity(float value) {#setFillOpacity-float-}
```
public void setFillOpacity(float value)
```


Sets the current fill opacity.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The current fill opacity. |

### drawString(String str, float originX, float originY, List<GlyphData> charInfos) {#drawString-java.lang.String-float-float-java.util.List-com.aspose.tex.rendering.GlyphData--}
```
public void drawString(String str, float originX, float originY, List<GlyphData> charInfos)
```


Draws a text string.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| str | java.lang.String | The string. |
| originX | float | The x coordinate of the origin. |
| originY | float | The x coordinate of the origin. |
| charInfos | java.util.List<com.aspose.tex.rendering.GlyphData> | Glyph data required for precise typesetting of a text string. |

### drawPath(Shape path) {#drawPath-java.awt.Shape-}
```
public void drawPath(Shape path)
```


Draws a path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | A path to draw. |

### fillPath(Shape path) {#fillPath-java.awt.Shape-}
```
public void fillPath(Shape path)
```


Fills a path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | A path to fill. |

### showImage(Point2D origin, Dimension2D size, byte[] imageData) {#showImage-java.awt.geom.Point2D-java.awt.geom.Dimension2D-byte---}
```
public void showImage(Point2D origin, Dimension2D size, byte[] imageData)
```


Shows a raster image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| origin | java.awt.geom.Point2D | The bottom-left corner of the shown image. |
| size | java.awt.geom.Dimension2D | The size of the shown image. |
| imageData | byte[] | The image data. |

### startFragment() {#startFragment--}
```
public void startFragment()
```


Starts a fragment to rasterize.

### endFragment() {#endFragment--}
```
public void endFragment()
```


Ends a fragment to rasterize.

