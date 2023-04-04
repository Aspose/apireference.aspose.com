---
title: PdfDevice
second_title: Aspose.Page for Java API Reference
description: Class incapsulating image composing device.
type: docs
weight: 15
url: /java/com.aspose.xps.rendering/pdfdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device), [com.aspose.xps.rendering.DeviceXps](../../com.aspose.xps.rendering/devicexps)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPartitionDevice](../../com.aspose.page/imultipartitiondevice), [com.aspose.page.IInteractiveDevice](../../com.aspose.page/iinteractivedevice)
```
public class PdfDevice extends DeviceXps implements IMultiPartitionDevice, IInteractiveDevice
```

Class incapsulating image composing device.
## Constructors

| Constructor | Description |
| --- | --- |
| [PdfDevice(OutputStream stream)](#PdfDevice-java.io.OutputStream-) | Creates the new instance. |
| [PdfDevice(OutputStream stream, Dimension pageSize)](#PdfDevice-java.io.OutputStream-java.awt.Dimension-) | Creates the new instance with specified media size. |
## Methods

| Method | Description |
| --- | --- |
| [renew()](#renew--) | Sets the devices to the initial state. |
| [setSaveOptions(SaveOptions value)](#setSaveOptions-com.aspose.page.SaveOptions-) | Initializes save options. |
| [getSize()](#getSize--) | Gets the device media size. |
| [setSize(Dimension value)](#setSize-java.awt.Dimension-) | Sets the device media size. |
| [getBackground()](#getBackground--) | Gets the background color. |
| [setBackground(Color value)](#setBackground-java.awt.Color-) | Sets the background color. |
| [getOpacity()](#getOpacity--) | Gets the opacity. |
| [setOpacity(float value)](#setOpacity-float-) | Sets the opacity. |
| [getStroke()](#getStroke--) | Gets the stroke for drawing paths. |
| [setStroke(Stroke value)](#setStroke-java.awt.Stroke-) | Sets the stroke for drawing paths. |
| [getPaint()](#getPaint--) | Gets the brush for filling paths. |
| [setPaint(Paint value)](#setPaint-java.awt.Paint-) | Sets the brush for filling paths. |
| [getOpacityMask()](#getOpacityMask--) | Gets the brush for opacity mask. |
| [setOpacityMask(Paint value)](#setOpacityMask-java.awt.Paint-) | Gets the brush for opacity mask. |
| [getFont()](#getFont--) | Gets the current font. |
| [setFont(ITrFont value)](#setFont-com.aspose.page.ITrFont-) | Sets the current font. |
| [startDocument()](#startDocument--) | Starts the document. |
| [endDocument()](#endDocument--) | Accomplishes the document. |
| [reset()](#reset--) | Resets the device. |
| [initPageNumbers()](#initPageNumbers--) | Initializes numbers of pages to output. |
| [openPage(String title)](#openPage-java.lang.String-) | Starts a new page with the specifies title. |
| [openPage(float width, float height)](#openPage-float-float-) | Starts a new page with the specified width and height. |
| [closePage()](#closePage--) | Accomplishes the page. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) | Updates the current page parameters. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) | Returns the absolute number of the current page within the document. |
| [getCurrentRelativePageNumber()](#getCurrentRelativePageNumber--) | Returns the relative number of the current page within the current partition. |
| [openPartition()](#openPartition--) | Starts a new document partition. |
| [closePartition()](#closePartition--) | Accomplished the document partition. |
| [setHyperlinkTarget(String targetUri)](#setHyperlinkTarget-java.lang.String-) | Sets the hyperlink with an external URI as its target. |
| [setHyperlinkTarget(int targetPageNumber)](#setHyperlinkTarget-int-) | Sets the hyperlink with a page number as its target. |
| [addOutline(int outlineLevel, String description)](#addOutline-int-java.lang.String-) | Adds an outline item with the last object as its target. |
| [addOutline(Point2D origin, int outlineLevel, String description)](#addOutline-java.awt.geom.Point2D-int-java.lang.String-) | Adds an outline item with the origin point as its target. |
| [create()](#create--) | Creates a new instance of the device based on this device instance. |
| [dispose()](#dispose--) | Disposes this device instance. |
| [getTransform()](#getTransform--) | Returns the current transformation matrix. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Sets the current transformation matrix. |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Multiplies the current transformation matrix by the specified  Matrix . |
| [translate(double x, double y)](#translate-double-double-) | Applies the specified translation vector to the current transformation matrix. |
| [rotate(double theta)](#rotate-double-) | Applies a clockwise rotation about the origin to the current transformation matrix. |
| [scale(double x, double y)](#scale-double-double-) | Applies the specified scale vector to the current transformation matrix. |
| [shear(double shx, double shy)](#shear-double-double-) | Applies the specified shear vector to the current transformation matrix. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Adds the specified path to the current clip path. |
| [draw(Shape path)](#draw-java.awt.Shape-) | Draws the specified path. |
| [fill(Shape path)](#fill-java.awt.Shape-) | Fills the specified path. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) | Draws a string at the specified position. |
### PdfDevice(OutputStream stream) {#PdfDevice-java.io.OutputStream-}
```
public PdfDevice(OutputStream stream)
```


Creates the new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | The output stream containing PDF. |

### PdfDevice(OutputStream stream, Dimension pageSize) {#PdfDevice-java.io.OutputStream-java.awt.Dimension-}
```
public PdfDevice(OutputStream stream, Dimension pageSize)
```


Creates the new instance with specified media size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | The output stream containing PDF. |
| pageSize | java.awt.Dimension | The size of the device output media. |

### renew() {#renew--}
```
public void renew()
```


Sets the devices to the initial state.

### setSaveOptions(SaveOptions value) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions value)
```


Initializes save options.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SaveOptions](../../com.aspose.page/saveoptions) | Save options. |

### getSize() {#getSize--}
```
public Dimension getSize()
```


Gets the device media size.

**Returns:**
java.awt.Dimension - The device media size.
### setSize(Dimension value) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension value)
```


Sets the device media size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Dimension | The device media size. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Gets the background color.

**Returns:**
java.awt.Color - The background color.
### setBackground(Color value) {#setBackground-java.awt.Color-}
```
public void setBackground(Color value)
```


Sets the background color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Color | The background color. |

### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Gets the opacity.

**Returns:**
float - The opacity.
### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sets the opacity.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The opacity. |

### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Gets the stroke for drawing paths.

**Returns:**
java.awt.Stroke - The stroke for drawing paths.
### setStroke(Stroke value) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke value)
```


Sets the stroke for drawing paths.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Stroke | The stroke for drawing paths. |

### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Gets the brush for filling paths.

**Returns:**
java.awt.Paint - The brush for filling paths.
### setPaint(Paint value) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint value)
```


Sets the brush for filling paths.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Paint | The brush for filling paths. |

### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Gets the brush for opacity mask. The mask applies over Paint or Strike.

**Returns:**
java.awt.Paint - The brush for opacity mask.
### setOpacityMask(Paint value) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint value)
```


Gets the brush for opacity mask. The mask applies over Paint or Strike.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Paint | The brush for opacity mask. |

### getFont() {#getFont--}
```
public ITrFont getFont()
```


Gets the current font.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - The current font.
### setFont(ITrFont value) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont value)
```


Sets the current font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ITrFont](../../com.aspose.page/itrfont) | The current font. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Starts the document.

### endDocument() {#endDocument--}
```
public void endDocument()
```


Accomplishes the document.

### reset() {#reset--}
```
public void reset()
```


Resets the device.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Initializes numbers of pages to output.

### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Starts a new page with the specifies title.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| title | java.lang.String | The title. |

**Returns:**
boolean -  True  if started page is to be output (it's number is contained in PageNumbers save options).  False  , otherwise.
### openPage(float width, float height) {#openPage-float-float-}
```
public boolean openPage(float width, float height)
```


Starts a new page with the specified width and height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | The width of the page. |
| height | float | The height of the page. |

**Returns:**
boolean -  True  if started page is to be output (it's number is contained in PageNumbers save options).  False  , otherwise.
### closePage() {#closePage--}
```
public void closePage()
```


Accomplishes the page.

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Updates the current page parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) | The multipage device. |

### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Returns the absolute number of the current page within the document.

**Returns:**
int - The absolute number of the current page.
### getCurrentRelativePageNumber() {#getCurrentRelativePageNumber--}
```
public int getCurrentRelativePageNumber()
```


Returns the relative number of the current page within the current partition.

**Returns:**
int - The relative number of the current page.
### openPartition() {#openPartition--}
```
public void openPartition()
```


Starts a new document partition.

### closePartition() {#closePartition--}
```
public void closePartition()
```


Accomplished the document partition.

### setHyperlinkTarget(String targetUri) {#setHyperlinkTarget-java.lang.String-}
```
public void setHyperlinkTarget(String targetUri)
```


Sets the hyperlink with an external URI as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| targetUri | java.lang.String | The target external URI. |

### setHyperlinkTarget(int targetPageNumber) {#setHyperlinkTarget-int-}
```
public void setHyperlinkTarget(int targetPageNumber)
```


Sets the hyperlink with a page number as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| targetPageNumber | int | The target page number. |

### addOutline(int outlineLevel, String description) {#addOutline-int-java.lang.String-}
```
public void addOutline(int outlineLevel, String description)
```


Adds an outline item with the last object as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| outlineLevel | int | The outline level. |
| description | java.lang.String | The item description. |

### addOutline(Point2D origin, int outlineLevel, String description) {#addOutline-java.awt.geom.Point2D-int-java.lang.String-}
```
public void addOutline(Point2D origin, int outlineLevel, String description)
```


Adds an outline item with the origin point as its target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| origin | java.awt.geom.Point2D | The target origin. |
| outlineLevel | int | The outline level. |
| description | java.lang.String | The item description. |

### create() {#create--}
```
public Device create()
```


Creates a new instance of the device based on this device instance. Writes this device graphics state, i.e. creates  ApsCanvas  instance(s) with corresponding RenderTransform and Clip properties.

**Returns:**
[Device](../../com.aspose.page/device) - The new device instance.
### dispose() {#dispose--}
```
public void dispose()
```


Disposes this device instance. Finalizes this device instance graphics state, i.e. switches APS composing context to the  ApsCanvas  of the level higher then this device's graphics state  ApsCanvas .

### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Returns the current transformation matrix.

**Returns:**
java.awt.geom.AffineTransform - The current transformation matrix.
### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Sets the current transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | The new transformation matrix. |

### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Multiplies the current transformation matrix by the specified  Matrix .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | The matrix by which the current transformation matrix is to be multiplied. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Applies the specified translation vector to the current transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The x offset. |
| y | double | The y offset. |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Applies a clockwise rotation about the origin to the current transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | The angle of the rotation, in radians. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Applies the specified scale vector to the current transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The x scale factor. |
| y | double | The y scale factor. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Applies the specified shear vector to the current transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shx | double | The x shear factor. |
| shy | double | The y shear factor. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Adds the specified path to the current clip path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| clipPath | java.awt.Shape | The clip path to be added. |

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Draws the specified path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | The path to draw. |

### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Fills the specified path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | The path to fill. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Draws a string at the specified position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| str | java.lang.String | The text. |
| x | float | The x-coordinate of the string position. |
| y | float | The y-coordinate of the string position. |

