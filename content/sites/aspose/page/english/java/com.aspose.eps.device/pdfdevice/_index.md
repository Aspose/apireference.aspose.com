---
title: PdfDevice
second_title: Aspose.Page for Java API Reference
description: This class encapsulates rendering of document to PDF.
type: docs
weight: 12
url: /java/com.aspose.eps.device/pdfdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice), [com.aspose.page.IStreamable](../../com.aspose.page/istreamable)
```
public final class PdfDevice extends Device implements IMultiPageDevice, IStreamable
```

This class encapsulates rendering of document to PDF.
## Constructors

| Constructor | Description |
| --- | --- |
| [PdfDevice(OutputStream ros)](#PdfDevice-java.io.OutputStream-) | Initializes new instance of  PdfDevice  with an output stream. |
| [PdfDevice(OutputStream ros, Dimension size)](#PdfDevice-java.io.OutputStream-java.awt.Dimension-) | Initializes new instance of  PdfDevice  with an output stream. |
## Fields

| Field | Description |
| --- | --- |
| [AUTHOR](#AUTHOR) | "Author" property key. |
| [BACKGROUND](#BACKGROUND) | "Background" property key. |
| [BACKGROUND_COLOR](#BACKGROUND-COLOR) | "Background color" property key. |
| [COMPRESS](#COMPRESS) | "Compress" property key. |
| [CREATOR](#CREATOR) |  |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMBED_FONTS](#EMBED-FONTS) | "Embed font in document" property key. |
| [EMBED_FONTS_AS](#EMBED-FONTS-AS) | "What font type is used for embedding" property key. |
| [EMIT_ERRORS](#EMIT-ERRORS) | "Emit errors" property key. |
| [EMIT_WARNINGS](#EMIT-WARNINGS) | "Emit warnings" property key. |
| [FIT_TO_PAGE](#FIT-TO-PAGE) | "Fit content to page" property key. |
| [KEYWORDS](#KEYWORDS) | "Keywords" property key. |
| [ORIENTATION](#ORIENTATION) | "Orientation" property key. |
| [PAGE_MARGINS](#PAGE-MARGINS) | "Page margins" property key. |
| [PAGE_SIZE](#PAGE-SIZE) | "Page size" property key. |
| [PRODUCER](#PRODUCER) | "Producer" property key. |
| [SUBJECT](#SUBJECT) | "Subject" property key. |
| [TITLE](#TITLE) | "Title" property key. |
| [TRANSPARENT](#TRANSPARENT) | "Transparent" property key. |
| [VERSION](#VERSION) | "Version" property key. |
| [VERSION](#VERSION) | Current device version. |
| [VERSION5](#VERSION5) | "Version of Adobe Acrobat Reader" property value. |
| [WRITE_IMAGES_AS](#WRITE-IMAGES-AS) | "Format of images" property key. |
## Methods

| Method | Description |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Clips using given shape. |
| [clipRect(float x, float y, float width, float height)](#clipRect-float-float-float-float-) | Clips rectangle. |
| [closePage()](#closePage--) | Makes necessary preparation of the device after page has been rendered. |
| [create()](#create--) | Creates a copy of this device. |
| [dispose()](#dispose--) | Disposes the graphics context. |
| [draw(Shape s)](#draw-java.awt.Shape-) | Draws a path. |
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
| [fill(Shape s)](#fill-java.awt.Shape-) | Fills a path. |
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
| [getCurrentPageNumber()](#getCurrentPageNumber--) | Gets current page number. |
| [getFont()](#getFont--) | Gets current font. |
| [getOpacity()](#getOpacity--) | Gets current opacity. |
| [getOpacityMask()](#getOpacityMask--) | Gets current opacity mask. |
| [getOutputStream()](#getOutputStream--) | Gets an output stream. |
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
| [getTransform()](#getTransform--) | Gets the current transform. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Initializes clip of the device. |
| [initPageNumbers()](#initPageNumbers--) | Initializes numbers of pages to output. |
| [isDirectRGB()](#isDirectRGB--) | Indicates whether device uses direct RGB mode, that is RGB. |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Gets a value of boolean property. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Makes necessary preparation of the device before page rendering. |
| [openPage(String title)](#openPage-java.lang.String-) | Makes necessary preparation of the device before page rendering. |
| [renew()](#renew--) | Reset device to initial state for whole document. |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) | If page device parameters will be set this method allows to return writing stream back the begining of page. |
| [rotate(double theta)](#rotate-double-) | Rotate the current transform over the Z-axis. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Rotate the current transformation matrix around a point. |
| [savePageTransform()](#savePageTransform--) |  |
| [scale(double sx, double sy)](#scale-double-double-) | Scales the current transformation matrix. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Specifies current background of the page. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Specifies characters transform. |
| [setClip(Shape path)](#setClip-java.awt.Shape-) |  **Specifies clip shape.** |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Specifies creator of resulting device output. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Specifies current font. |
| [setOpacity(float opacity)](#setOpacity-float-) | Specifies opacity. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Specifies a opacity mask. |
| [setOutputStream(OutputStream os)](#setOutputStream-java.io.OutputStream-) | Specifies an output stream. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Specifies current paint. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Specifies device properties including metadata. |
| [setProperties(Properties props)](#setProperties-java.util.Properties-) | Specifies device properties including metadata. |
| [setSaveFromPatternCreate()](#setSaveFromPatternCreate--) |  |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Specifies options for managing rendering process. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifies size of page. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Specifies a stroke. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Specifies text rendering mode. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Specifies text stroke width. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Specifies the current transform. |
| [shear(double shx, double shy)](#shear-double-double-) | Shears the current transformation matrix. |
| [startDocument()](#startDocument--) | Makes necessary preparation of device before start rendering of document. |
| [toString()](#toString--) | Returns the name of device type. |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transforms the current transform. |
| [translate(double x, double y)](#translate-double-double-) | Translates the current transformation matrix. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) | Updates page parameters from other multi-paged device. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Writes a comment. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Writes out string with specified font. |
### PdfDevice(OutputStream ros) {#PdfDevice-java.io.OutputStream-}
```
public PdfDevice(OutputStream ros)
```


Initializes new instance of  PdfDevice  with an output stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| ros | java.io.OutputStream | An output stream. |

### PdfDevice(OutputStream ros, Dimension size) {#PdfDevice-java.io.OutputStream-java.awt.Dimension-}
```
public PdfDevice(OutputStream ros, Dimension size)
```


Initializes new instance of  PdfDevice  with an output stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| ros | java.io.OutputStream | An output stream. |
| size | java.awt.Dimension | Page size. |

### AUTHOR {#AUTHOR}
```
public static final String AUTHOR
```


"Author" property key.

### BACKGROUND {#BACKGROUND}
```
public static final String BACKGROUND
```


"Background" property key.

### BACKGROUND_COLOR {#BACKGROUND-COLOR}
```
public static final String BACKGROUND_COLOR
```


"Background color" property key.

### COMPRESS {#COMPRESS}
```
public static final String COMPRESS
```


"Compress" property key.

### CREATOR {#CREATOR}
```
public static final String CREATOR
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### EMBED_FONTS {#EMBED-FONTS}
```
public static final String EMBED_FONTS
```


"Embed font in document" property key.

### EMBED_FONTS_AS {#EMBED-FONTS-AS}
```
public static final String EMBED_FONTS_AS
```


"What font type is used for embedding" property key.

### EMIT_ERRORS {#EMIT-ERRORS}
```
public static final String EMIT_ERRORS
```


"Emit errors" property key.

### EMIT_WARNINGS {#EMIT-WARNINGS}
```
public static final String EMIT_WARNINGS
```


"Emit warnings" property key.

### FIT_TO_PAGE {#FIT-TO-PAGE}
```
public static final String FIT_TO_PAGE
```


"Fit content to page" property key.

### KEYWORDS {#KEYWORDS}
```
public static final String KEYWORDS
```


"Keywords" property key.

### ORIENTATION {#ORIENTATION}
```
public static final String ORIENTATION
```


"Orientation" property key.

### PAGE_MARGINS {#PAGE-MARGINS}
```
public static final String PAGE_MARGINS
```


"Page margins" property key.

### PAGE_SIZE {#PAGE-SIZE}
```
public static final String PAGE_SIZE
```


"Page size" property key.

### PRODUCER {#PRODUCER}
```
public static final String PRODUCER
```


"Producer" property key.

### SUBJECT {#SUBJECT}
```
public static final String SUBJECT
```


"Subject" property key.

### TITLE {#TITLE}
```
public static final String TITLE
```


"Title" property key.

### TRANSPARENT {#TRANSPARENT}
```
public static final String TRANSPARENT
```


"Transparent" property key.

### VERSION {#VERSION}
```
public static final String VERSION
```


"Version" property key.

### VERSION {#VERSION}
```
public static String VERSION
```


Current device version.

### VERSION5 {#VERSION5}
```
public static final String VERSION5
```


"Version of Adobe Acrobat Reader" property value.

### WRITE_IMAGES_AS {#WRITE-IMAGES-AS}
```
public static final String WRITE_IMAGES_AS
```


"Format of images" property key.

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Clips using given shape. Dispatches to writeClip(Rectangle), writeClip(Rectangle2D) or writeClip(Shape).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | Shape used for clipping. |

### clipRect(float x, float y, float width, float height) {#clipRect-float-float-float-float-}
```
public void clipRect(float x, float y, float width, float height)
```


Clips rectangle. Calls clip(Rectangle2D).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate. |
| y | float | The y-coordinate. |
| width | float | The rectangle width. |
| height | float | The rectangle height. |

### closePage() {#closePage--}
```
public final void closePage()
```


Makes necessary preparation of the device after page has been rendered.

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


Disposes the graphics context. If on creation restoreOnDispose was true, writeGraphicsRestore() will be called.

### draw(Shape s) {#draw-java.awt.Shape-}
```
public void draw(Shape s)
```


Draws a path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | A path to be drawn. |

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
### fill(Shape s) {#fill-java.awt.Shape-}
```
public void fill(Shape s)
```


Fills a path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | A path to be filled. |

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
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Gets current page number.

**Returns:**
int - The number of current page.
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
### getOutputStream() {#getOutputStream--}
```
public OutputStream getOutputStream()
```


Gets an output stream.

**Returns:**
java.io.OutputStream - An output stream.
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


Gets the current transform.

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


Makes necessary preparation of the device before page rendering.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | A width of the page. |
| height | float | A height of the page. |

**Returns:**
boolean - Always true.
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Makes necessary preparation of the device before page rendering.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| title | java.lang.String | The page title. |

**Returns:**
boolean - Always true.
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


If page device parameters will be set this method allows to return writing stream back the begining of page.

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Rotate the current transform over the Z-axis. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | Radians over which to rotate. |

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

### savePageTransform() {#savePageTransform--}
```
public void savePageTransform()
```




### scale(double sx, double sy) {#scale-double-double-}
```
public void scale(double sx, double sy)
```


Scales the current transformation matrix. Calls writeTransform(Transform).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | double | A scale in X axis. |
| sy | double | A scale in Y axis. |

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

### setClip(Shape path) {#setClip-java.awt.Shape-}
```
public void setClip(Shape path)
```


 **Specifies clip shape.** 

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | Path that is used for clipping. |

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


Specifies current font.

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

### setOutputStream(OutputStream os) {#setOutputStream-java.io.OutputStream-}
```
public void setOutputStream(OutputStream os)
```


Specifies an output stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| os | java.io.OutputStream | An output stream. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Specifies current paint.

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

### setProperties(Properties props) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties props)
```


Specifies device properties including metadata.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| props | java.util.Properties | Device properties. |

### setSaveFromPatternCreate() {#setSaveFromPatternCreate--}
```
public void setSaveFromPatternCreate()
```




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


Specifies the current transform. Since most output formats do not implement this functionality, the inverse transform of the currentTransform is calculated and multiplied by the transform to be set. The result is then forwarded by a call to writeTransform(Transform).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Transform to be applied. |

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


Transforms the current transform. Calls writeTransform(Transform)

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

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Updates page parameters from other multi-paged device.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) | Another instance of the same device. |

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

