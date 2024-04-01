---
title: Device
second_title: Aspose.Page for Java API Reference
description: This class encapsulates rendering of document to abstract device.
type: docs
weight: 11
url: /java/com.aspose.page/device/
---
**Inheritance:**
java.lang.Object
```
public abstract class Device
```

This class encapsulates rendering of document to abstract device. Rendering of the document is performed page by page.
## Constructors

| Constructor | Description |
| --- | --- |
| [Device(Dimension pageSize)](#Device-java.awt.Dimension-) | Creates the new instance of Device with a size of a page. |
## Fields

| Field | Description |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [VERSION](#VERSION) | Current device version. |
## Methods

| Method | Description |
| --- | --- |
| [create()](#create--) | Creates a copy of this device. |
| [dispose()](#dispose--) | Disposes the device. |
| [draw(Shape path)](#draw-java.awt.Shape-) | Draws a path. |
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
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) | Draws a string at given point. |
| [endDocument()](#endDocument--) | Makes necessary preparation of device after the document has been rendered. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Fills a path. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Fills an arc. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Fills an oval. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Fills a polygon. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Fills a polygon. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Fills a rectangle. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Draws a round rectangle. |
| [getBackground()](#getBackground--) | Gets current background of the page. |
| [getCharTM()](#getCharTM--) | Gets current characters transform. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Gets creator of resulting device output. |
| [getFont()](#getFont--) | Gets current font. |
| [getOpacity()](#getOpacity--) | Gets current opacity. |
| [getOpacityMask()](#getOpacityMask--) | Gets current opacity mask. |
| [getPaint()](#getPaint--) | Gets current paint. |
| [getProperties()](#getProperties--) | Gets device properties including metadata. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Gets a value of string property. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Gets a value of color property. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Gets a value of double property. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Gets a value of integer property. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Gets a value of margins property. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Gets a value of matrix property. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Gets a value of rectangle property. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Gets a value of size property. |
| [getSaveOptions()](#getSaveOptions--) | Returns save options. |
| [getSize()](#getSize--) | Gets a size of the page. |
| [getStroke()](#getStroke--) | Gets current stroke. |
| [getTextRenderingMode()](#getTextRenderingMode--) | Gets current text rendering mode. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Gets current text stroke width. |
| [getTransform()](#getTransform--) | Gets current transform. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Initializes clip of the device. |
| [isDirectRGB()](#isDirectRGB--) | Indicates whether device uses direct RGB mode, that is RGB. |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Gets a value of boolean property. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [renew()](#renew--) | Reset device to initial state for whole document. |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) | Reset the device to initial state for a page. |
| [rotate(double theta)](#rotate-double-) | Rotate the current transformation matrix. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Rotate the current transformation matrix around a point. |
| [scale(double x, double y)](#scale-double-double-) | Scales the current transformation matrix. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Specifies current background of the page. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Specifies characters transform. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Specifies the clip of the device. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Specifies creator of resulting device output. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Specifies a font. |
| [setOpacity(float opacity)](#setOpacity-float-) | Specifies opacity. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Specifies a opacity mask. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Specifies a paint. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Specifies device properties including metadata. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Specifies options for managing rendering process. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifies size of page. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Specifies a stroke. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Specifies text rendering mode. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Specifies text stroke width. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Specifies current transform. |
| [shear(double shx, double shy)](#shear-double-double-) | Shears the current transformation matrix. |
| [startDocument()](#startDocument--) | Makes necessary preparation of device before start rendering of document. |
| [toString()](#toString--) | Returns the name of device type. |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transforms the current transformation matrix. |
| [translate(double x, double y)](#translate-double-double-) | Translates the current transformation matrix. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Writes a comment. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Writes out string with specified font. |
### Device(Dimension pageSize) {#Device-java.awt.Dimension-}
```
public Device(Dimension pageSize)
```


Creates the new instance of Device with a size of a page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Page size. |

### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### VERSION {#VERSION}
```
public static String VERSION
```


Current device version.

### create() {#create--}
```
public Device create()
```


Creates a copy of this device.

**Returns:**
[Device](../../com.aspose.page/device) - Copy of this device.
### dispose() {#dispose--}
```
public void dispose()
```


Disposes the device.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Draws a path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | A path to be drawn. |

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


Draws a string at given point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| str | java.lang.String | A string to be drawn. |
| x | float | X coordinate of point. |
| y | float | Y coordinate of point. |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Makes necessary preparation of device after the document has been rendered.

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


Fills a path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | A path to be filled. |

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


Gets current background of the page.

**Returns:**
java.awt.Color - Current background of the page
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
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Gets current font.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Gets current opacity.

**Returns:**
float - Current opacity.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Gets current opacity mask.

**Returns:**
java.awt.Paint - Current opacity mask.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Gets current paint.

**Returns:**
java.awt.Paint - Current paint.
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


Gets a size of the page.

**Returns:**
java.awt.Dimension - Size of page.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Gets current stroke.

**Returns:**
java.awt.Stroke - Current stroke.
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


Gets current transform.

**Returns:**
java.awt.geom.AffineTransform - Current transform.
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




### renew() {#renew--}
```
public void renew()
```


Reset device to initial state for whole document. Used for reseting output stream.

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


Reset the device to initial state for a page.

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Rotate the current transformation matrix. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | Angle in radians over which to rotate. |

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


Scales the current transformation matrix. Calls writeTransform(Transform).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | A scale in X axis. |
| y | double | A scale in Y axis. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Specifies current background of the page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| background | java.awt.Color | A background of the page. |

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


Specifies the clip of the device.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| clipPath | java.awt.Shape | A clipping path. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Specifies creator of resulting device output.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| creator | java.lang.String | A creator value. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Specifies a font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | A font. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Specifies opacity.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| opacity | float | An opacity. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Specifies a opacity mask.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| opacityMask | java.awt.Paint | A opacity mask. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Specifies a paint.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| paint | java.awt.Paint | A paint. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Specifies device properties including metadata.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Device properties. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Specifies options for managing rendering process.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Options for managing rendering process. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specifies size of page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Size of page. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Specifies a stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stroke | java.awt.Stroke | A stroke. |

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


Specifies current transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | A transform.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Shears the current transformation matrix. Calls writeTransform(Transform).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shx | double | A shear in X axis. |
| shy | double | A shear in Y axis. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Makes necessary preparation of device before start rendering of document.

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


Transforms the current transformation matrix. Calls writeTransform(Transform).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Transform to be applied. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Translates the current transformation matrix. Calls writeTransform(Transform).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | Translation in X axis. |
| y | double | Translation in Y axis. |

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

