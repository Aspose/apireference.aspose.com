---
title: ImageDevice
second_title: Aspose.Page for Java API Reference
description: Class incapsulating image composing device.
type: docs
weight: 12
url: /java/com.aspose.xps.rendering/imagedevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device), [com.aspose.xps.rendering.DeviceXps](../../com.aspose.xps.rendering/devicexps)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPartitionDevice](../../com.aspose.page/imultipartitiondevice)
```
public final class ImageDevice extends DeviceXps implements IMultiPartitionDevice
```

Class incapsulating image composing device.
## Constructors

| Constructor | Description |
| --- | --- |
| [ImageDevice()](#ImageDevice--) | Creates the new instance. |
| [ImageDevice(Dimension pageSize)](#ImageDevice-java.awt.Dimension-) | Creates the new instance with specified media size. |
## Fields

| Field | Description |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [VERSION](#VERSION) | Current device version. |
## Methods

| Method | Description |
| --- | --- |
| [closePage()](#closePage--) | Accomplishes the page. |
| [closePartition()](#closePartition--) | Accomplished the document partition. |
| [create()](#create--) | Creates a new instance of the device based on this device instance. |
| [dispose()](#dispose--) | Disposes this device instance. |
| [draw(Shape path)](#draw-java.awt.Shape-) | Draws the specified path. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Draws an arc. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Draws an image with assigned transform and background. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Draws a line segment. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Draws an oval. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Draws a polygon. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Draws a polygon. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Draws a polyline. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Draws a polyline. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Draws a rectangle. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Draws a round rectangle. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) | Draws a string at the specified position. |
| [endDocument()](#endDocument--) | Accomplishes the document. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Fills the specified path. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Fills an arc. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Fills an oval. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Fills a polygon. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Fills a polygon. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Fills a rectangle. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Draws a round rectangle. |
| [getBackground()](#getBackground--) | Gets the background color. |
| [getCharTM()](#getCharTM--) | Gets current characters transform. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Gets creator of resulting device output. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) | Returns the absolute number of the current page within the document. |
| [getCurrentRelativePageNumber()](#getCurrentRelativePageNumber--) | Returns the relative number of the current page within the current partition. |
| [getFont()](#getFont--) | Gets the current font. |
| [getOpacity()](#getOpacity--) | Gets the opacity. |
| [getOpacityMask()](#getOpacityMask--) | Gets the brush for opacity mask. |
| [getPaint()](#getPaint--) | Gets the brush for filling paths. |
| [getProperties()](#getProperties--) | Gets device properties including metadata. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Gets a value of string property. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Gets a value of color property. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Gets a value of double property. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Gets a value of integer property. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Gets a value of margins property. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Gets a value of matrix property. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Gets a value of rectangle property. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Gets a value of size property. |
| [getResult()](#getResult--) | Returns the resulting images byte arrays. |
| [getSaveOptions()](#getSaveOptions--) | Returns save options. |
| [getSize()](#getSize--) | Gets the device media size. |
| [getStroke()](#getStroke--) | Gets the stroke for drawing paths. |
| [getTextRenderingMode()](#getTextRenderingMode--) | Gets current text rendering mode. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Gets current text stroke width. |
| [getTransform()](#getTransform--) | Returns the current transformation matrix. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Initializes clip of the device. |
| [initPageNumbers()](#initPageNumbers--) | Initializes numbers of pages to output. |
| [isDirectRGB()](#isDirectRGB--) | Indicates whether device uses direct RGB mode, that is RGB. |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Gets a value of boolean property. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Starts a new page with the specified width and height. |
| [openPage(String title)](#openPage-java.lang.String-) | Starts a new page with the specifies title. |
| [openPartition()](#openPartition--) | Starts a new document partition. |
| [renew()](#renew--) | Sets the devices to the initial state. |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) | Resets the device. |
| [rotate(double theta)](#rotate-double-) | Applies a clockwise rotation about the origin to the current transformation matrix. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Rotate the current transformation matrix around a point. |
| [scale(double x, double y)](#scale-double-double-) | Applies the specified scale vector to the current transformation matrix. |
| [setBackground(Color value)](#setBackground-java.awt.Color-) | Sets the background color. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Specifies characters transform. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Adds the specified path to the current clip path. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Specifies creator of resulting device output. |
| [setFont(ITrFont value)](#setFont-com.aspose.page.ITrFont-) | Sets the current font. |
| [setOpacity(float value)](#setOpacity-float-) | Sets the opacity. |
| [setOpacityMask(Paint value)](#setOpacityMask-java.awt.Paint-) | Gets the brush for opacity mask. |
| [setPaint(Paint value)](#setPaint-java.awt.Paint-) | Sets the brush for filling paths. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Specifies device properties including metadata. |
| [setSaveOptions(SaveOptions value)](#setSaveOptions-com.aspose.page.SaveOptions-) | Initializes save options. |
| [setSize(Dimension value)](#setSize-java.awt.Dimension-) | Sets the device media size. |
| [setStroke(Stroke value)](#setStroke-java.awt.Stroke-) | Sets the stroke for drawing paths. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Specifies text rendering mode. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Specifies text stroke width. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Sets the current transformation matrix. |
| [shear(double shx, double shy)](#shear-double-double-) | Applies the specified shear vector to the current transformation matrix. |
| [startDocument()](#startDocument--) | Starts the document. |
| [toString()](#toString--) | Returns the name of device type. |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Multiplies the current transformation matrix by the specified  Matrix . |
| [translate(double x, double y)](#translate-double-double-) | Applies the specified translation vector to the current transformation matrix. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) | Updates the current page parameters. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Writes a comment. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Writes out string with specified font. |
### ImageDevice() {#ImageDevice--}
```
public ImageDevice()
```


Creates the new instance.

### ImageDevice(Dimension pageSize) {#ImageDevice-java.awt.Dimension-}
```
public ImageDevice(Dimension pageSize)
```


Creates the new instance with specified media size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pageSize | java.awt.Dimension | The size of the device output media. |

### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### VERSION {#VERSION}
```
public static String VERSION
```


Current device version.

### closePage() {#closePage--}
```
public void closePage()
```


Accomplishes the page.

### closePartition() {#closePartition--}
```
public void closePartition()
```


Accomplished the document partition.

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

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Draws the specified path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | The path to draw. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Draws an arc.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X coordinate of center of the arc. |
| y | float | Y coordinate of center of the arc. |
| width | float | A width of circumscribed rectangle. |
| height | float | A height of circumscribed rectangle. |
| startAngle | float | A start angle of the arc. |
| arcAngle | float | An angle of the arc. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Draws an image with assigned transform and background.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | An image to be drawn. |
| transform | java.awt.geom.AffineTransform | A transform. |
| bkg | java.awt.Color | A background color. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Draws a line segment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x1 | float | X coordinate of the beginning of segment. |
| y1 | float | Y coordinate of the beginning of segment. |
| x2 | float | X coordinate of the end of segment. |
| y2 | float | Y coordinate of the end of segment. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Draws an oval.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X coordinate of center of the oval. |
| y | float | Y coordinate of center of the oval. |
| width | float | A width of circumscribed rectangle. |
| height | float | A height of circumscribed rectangle. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Draws a polygon.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xPoints | float[] | X coordinates of points. |
| yPoints | float[] | Y coordinate of points. |
| nPoints | int | The number of points. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Draws a polygon.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xPoints | int[] | X coordinates of points. |
| yPoints | int[] | Y coordinate of points. |
| nPoints | int | The number of points. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Draws a polyline.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xPoints | float[] | X coordinates of points. |
| yPoints | float[] | Y coordinate of points. |
| nPoints | int | The number of points. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Draws a polyline.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xPoints | int[] | X coordinates of points. |
| yPoints | int[] | Y coordinate of points. |
| nPoints | int | The number of points. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Draws a rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X coordinate of upper left corner of the rectangle. |
| y | float | Y coordinate of upper left corner of the rectangle. |
| width | float | A width of the rectangle. |
| height | float | A height of the rectangle. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Draws a round rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X coordinate of upper left corner of the rectangle. |
| y | float | Y coordinate of upper left corner of the rectangle. |
| width | float | A width of the rectangle. |
| height | float | A height of the rectangle. |
| arcWidth | float | A width of circumscribed rectangle of the arc that rounds an angle of the rectangle. |
| arcHeight | float | A height of circumscribed rectangle of the arc that rounds an angle of the rectangle. |

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

### endDocument() {#endDocument--}
```
public void endDocument()
```


Accomplishes the document.

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
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Fills the specified path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | The path to fill. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Fills an arc.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X coordinate of center of the arc. |
| y | float | Y coordinate of center of the arc. |
| width | float | A width of circumscribed rectangle. |
| height | float | A height of circumscribed rectangle. |
| startAngle | float | A start angle of the arc. |
| arcAngle | float | An angle of the arc. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Fills an oval.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X coordinate of center of the oval. |
| y | float | Y coordinate of center of the oval. |
| width | float | A width of circumscribed rectangle. |
| height | float | A height of circumscribed rectangle. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Fills a polygon.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xPoints | float[] | X coordinates of points. |
| yPoints | float[] | Y coordinate of points. |
| nPoints | int | The number of points. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Fills a polygon.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xPoints | int[] | X coordinates of points. |
| yPoints | int[] | Y coordinate of points. |
| nPoints | int | The number of points. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Fills a rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X coordinate of upper left corner of the rectangle. |
| y | float | Y coordinate of upper left corner of the rectangle. |
| width | float | A width of the rectangle. |
| height | float | A height of the rectangle. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Draws a round rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X coordinate of upper left corner of the rectangle. |
| y | float | Y coordinate of upper left corner of the rectangle. |
| width | float | A width of the rectangle. |
| height | float | A height of the rectangle. |
| arcWidth | float | A width of circumscribed rectangle of the arc that rounds an angle of the rectangle. |
| arcHeight | float | A height of circumscribed rectangle of the arc that rounds an angle of the rectangle. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Gets the background color.

**Returns:**
java.awt.Color - The background color.
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Gets current characters transform.

**Returns:**
java.awt.geom.AffineTransform - Current characters transform.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreator() {#getCreator--}
```
public String getCreator()
```


Gets creator of resulting device output.

**Returns:**
java.lang.String - A creator value.
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
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Gets the current font.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - The current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Gets the opacity.

**Returns:**
float - The opacity.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Gets the brush for opacity mask. The mask applies over Paint or Strike.

**Returns:**
java.awt.Paint - The brush for opacity mask.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Gets the brush for filling paths.

**Returns:**
java.awt.Paint - The brush for filling paths.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Gets device properties including metadata.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Gets a value of string property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.lang.String - The property value.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Gets a value of color property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.Color - The property value.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Gets a value of double property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
double - The property value.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Gets a value of integer property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
int - The property value.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Gets a value of margins property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.Insets - The property value.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Gets a value of matrix property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.geom.AffineTransform - The property value.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Gets a value of rectangle property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.Rectangle - The property value.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Gets a value of size property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
java.awt.Dimension - The property value.
### getResult() {#getResult--}
```
public byte[][][] getResult()
```


Returns the resulting images byte arrays. The first dimension is for inner documents and the second one is for pages within inner documents.

**Returns:**
byte[][][] - The resulting images byte arrays.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Returns save options.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Gets the device media size.

**Returns:**
java.awt.Dimension - The device media size.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Gets the stroke for drawing paths.

**Returns:**
java.awt.Stroke - The stroke for drawing paths.
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Gets current text rendering mode.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Gets current text stroke width.

**Returns:**
float - Current text stroke width.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Returns the current transformation matrix.

**Returns:**
java.awt.geom.AffineTransform - The current transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initClip() {#initClip--}
```
public void initClip()
```


Initializes clip of the device.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Initializes numbers of pages to output.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Indicates whether device uses direct RGB mode, that is RGB.

**Returns:**
boolean - True if direct RGB mode and false otherwise, that is BGR.
### isMainDocument() {#isMainDocument--}
```
public boolean isMainDocument()
```




**Returns:**
boolean
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


Gets a value of boolean property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The name of property. |

**Returns:**
boolean - The property value.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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
### openPartition() {#openPartition--}
```
public void openPartition()
```


Starts a new document partition.

### renew() {#renew--}
```
public void renew()
```


Sets the devices to the initial state.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Resets the device.

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Applies a clockwise rotation about the origin to the current transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | The angle of the rotation, in radians. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Rotate the current transformation matrix around a point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | An angle of rotation in radians. |
| x | double | X coordinate of point. |
| y | double | Y coordinate of point. |

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

### setBackground(Color value) {#setBackground-java.awt.Color-}
```
public void setBackground(Color value)
```


Sets the background color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Color | The background color. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Specifies characters transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters transform. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Adds the specified path to the current clip path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| clipPath | java.awt.Shape | The clip path to be added. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Specifies creator of resulting device output.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| creator | java.lang.String | A creator value. |

### setFont(ITrFont value) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont value)
```


Sets the current font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ITrFont](../../com.aspose.page/itrfont) | The current font. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sets the opacity.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The opacity. |

### setOpacityMask(Paint value) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint value)
```


Gets the brush for opacity mask. The mask applies over Paint or Strike.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Paint | The brush for opacity mask. |

### setPaint(Paint value) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint value)
```


Sets the brush for filling paths.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Paint | The brush for filling paths. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Specifies device properties including metadata.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Device properties. |

### setSaveOptions(SaveOptions value) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions value)
```


Initializes save options.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SaveOptions](../../com.aspose.page/saveoptions) | Save options. |

### setSize(Dimension value) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension value)
```


Sets the device media size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Dimension | The device media size. |

### setStroke(Stroke value) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke value)
```


Sets the stroke for drawing paths.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Stroke | The stroke for drawing paths. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Specifies text rendering mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Text rendering mode. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Specifies text stroke width.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| textStrokeWidth | float | Text stroke width. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Sets the current transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | The new transformation matrix. |

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

### startDocument() {#startDocument--}
```
public void startDocument()
```


Starts the document.

### toString() {#toString--}
```
public String toString()
```


Returns the name of device type.

**Returns:**
java.lang.String - Type name.
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

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Updates the current page parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) | The multipage device. |

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

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Writes a comment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| comment | java.lang.String | A comment to be written. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Writes out string with specified font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Specified font. |
| str | java.lang.String | The string. |

