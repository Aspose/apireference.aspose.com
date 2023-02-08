---
title: ImageDevice
second_title: Aspose.Page for Java API Reference
description: This class encapsulates rendering of document to image.
type: docs
weight: 10
url: /java/com.aspose.eps.device/imagedevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class ImageDevice extends Device implements IMultiPageDevice
```

This class encapsulates rendering of document to image.
## Constructors

| Constructor | Description |
| --- | --- |
| [ImageDevice()](#ImageDevice--) | Initializes new instance of \`\`\` ImageDevice \`\`\`. |
| [ImageDevice(Dimension size)](#ImageDevice-java.awt.Dimension-) | Initializes new instance of \`\`\` ImageDevice \`\`\` with specified size of a page. |
| [ImageDevice(Dimension size, ImageFormat imageFormat)](#ImageDevice-java.awt.Dimension-com.aspose.eps.ImageFormat-) | Initializes new instance of \`\`\` ImageDevice \`\`\` with specified size of a page and image format. |
## Fields

| Field | Description |
| --- | --- |
| [TRANSPARENT](#TRANSPARENT) | "Transparent" property key. |
| [BACKGROUND](#BACKGROUND) | "Background" property key. |
| [BACKGROUND_COLOR](#BACKGROUND-COLOR) | "Background color" property key. |
| [PAGE_SIZE](#PAGE-SIZE) | "Page size" property key. |
| [PAGE_MARGINS](#PAGE-MARGINS) | "Page margins" property key. |
| [ORIENTATION](#ORIENTATION) | "Orientation" property key. |
| [FIT_TO_PAGE](#FIT-TO-PAGE) | "Fit content to page" property key. |
| [EMBED_FONTS](#EMBED-FONTS) | "Embed font in document. |
| [EMIT_WARNINGS](#EMIT-WARNINGS) | "Emit warnings" property key. |
| [EMIT_ERRORS](#EMIT-ERRORS) | "Emit errors" property key. |
| [PRODUCER](#PRODUCER) | "Producer" property key. |
## Methods

| Method | Description |
| --- | --- |
| [getFormat()](#getFormat--) | Gets image format. |
| [renew()](#renew--) | Reset device to initial state for whole document. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Specifies options for managing rendering process. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Specifies device properties. |
| [getProperties()](#getProperties--) | Gets device properties including metadata. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Gets a value of string property. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Gets a value of color property. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Gets a value of rectangle property. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Gets a value of margins property. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Gets a value of size property. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Gets a value of integer property. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Gets a value of double property. |
| [isProperty(String key)](#isProperty-java.lang.String-) | Gets a value of boolean property. |
| [getCreator()](#getCreator--) | Gets creator of resulting device output. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Specifies creator of resulting device output. |
| [getSize()](#getSize--) | Gets a size of the page. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifies a size of the page. |
| [getBackground()](#getBackground--) | Gets current background of the page. |
| [setBackground(Color bkgrd)](#setBackground-java.awt.Color-) | Specifies current background of the page. |
| [getOpacity()](#getOpacity--) | Gets current opacity. |
| [setOpacity(float opacity)](#setOpacity-float-) | Specifies current opacity. |
| [getStroke()](#getStroke--) | Gets current stroke. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Specifies current stroke. |
| [getPaint()](#getPaint--) | Gets current paint. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Specifies current paint. |
| [getFont()](#getFont--) | Gets current font. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Specifies current font. |
| [getCharTM()](#getCharTM--) | Gets current characters transform. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Specifies current characters transform. |
| [getTextRenderingMode()](#getTextRenderingMode--) | Gets current text rendering mode. |
| [setTextRenderingMode(TextRenderingMode trm)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Specifies current text rendering mode. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Gets current text stroke width. |
| [setTextStrokeWidth(float tsw)](#setTextStrokeWidth-float-) | Specifies current text stroke width. |
| [startDocument()](#startDocument--) | Makes necessary preparation of device before start rendering of document. |
| [endDocument()](#endDocument--) | Makes necessary preparation of device after the document has been rendered. |
| [dispose()](#dispose--) | Disposes the device. |
| [isDirectRGB()](#isDirectRGB--) | Indicates whether device uses direct RGB mode, that is RGB. |
| [reset()](#reset--) | Reset the device to initial state for a page. |
| [initPageNumbers()](#initPageNumbers--) | Initializes numbers of pages to output. |
| [openPage(String title)](#openPage-java.lang.String-) | Makes necessary preparation of the device before page rendering. |
| [openPage(float width, float height)](#openPage-float-float-) | Makes necessary preparation of the device before page rendering. |
| [closePage()](#closePage--) | Makes necessary preparation of the device after page has been rendered. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) | Gets current page number. |
| [updatePageParameters(IMultiPageDevice doc)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) | Updates page parameters from other multi-paged device. |
| [create()](#create--) | Creates a copy of this device. |
| [initClip()](#initClip--) | Initializes a clip of the device |
| [draw(Shape s)](#draw-java.awt.Shape-) | Draws a path. |
| [fill(Shape s)](#fill-java.awt.Shape-) | Fills a path. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Draws an image with assigned transform and background. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) | Draws a string at given point. |
| [getTransform()](#getTransform--) | Gets the current transform. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Specifies current transform. |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transforms the current transformation matrix. |
| [translate(double x, double y)](#translate-double-double-) | Translates the current transformation matrix. |
| [rotate(double theta)](#rotate-double-) | Rotate the current transform over the Z-axis. |
| [scale(double sx, double sy)](#scale-double-double-) | Scales the current transformation matrix. |
| [shear(double shx, double shy)](#shear-double-double-) | Shears the current transformation matrix. |
| [setClip(Shape path)](#setClip-java.awt.Shape-) | Specifies clip shape. |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Writes a comment. |
| [toString()](#toString--) | Returns the name of device type. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Writes out string with specified font. |
| [getImagesBytes()](#getImagesBytes--) | Gets resulting images in bytes. |
### ImageDevice() {#ImageDevice--}
```
public ImageDevice()
```


Initializes new instance of \`\`\` ImageDevice \`\`\`.

### ImageDevice(Dimension size) {#ImageDevice-java.awt.Dimension-}
```
public ImageDevice(Dimension size)
```


Initializes new instance of \`\`\` ImageDevice \`\`\` with specified size of a page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Page size. |

### ImageDevice(Dimension size, ImageFormat imageFormat) {#ImageDevice-java.awt.Dimension-com.aspose.eps.ImageFormat-}
```
public ImageDevice(Dimension size, ImageFormat imageFormat)
```


Initializes new instance of \`\`\` ImageDevice \`\`\` with specified size of a page and image format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Page size. |
| imageFormat | [ImageFormat](../../com.aspose.eps/imageformat) | Format of the image. |

### TRANSPARENT {#TRANSPARENT}
```
public static final String TRANSPARENT
```


"Transparent" property key.

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

### PAGE_SIZE {#PAGE-SIZE}
```
public static final String PAGE_SIZE
```


"Page size" property key.

### PAGE_MARGINS {#PAGE-MARGINS}
```
public static final String PAGE_MARGINS
```


"Page margins" property key.

### ORIENTATION {#ORIENTATION}
```
public static final String ORIENTATION
```


"Orientation" property key.

### FIT_TO_PAGE {#FIT-TO-PAGE}
```
public static final String FIT_TO_PAGE
```


"Fit content to page" property key.

### EMBED_FONTS {#EMBED-FONTS}
```
public static final String EMBED_FONTS
```


"Embed font in document.

### EMIT_WARNINGS {#EMIT-WARNINGS}
```
public static final String EMIT_WARNINGS
```


"Emit warnings" property key.

### EMIT_ERRORS {#EMIT-ERRORS}
```
public static final String EMIT_ERRORS
```


"Emit errors" property key.

### PRODUCER {#PRODUCER}
```
public static final String PRODUCER
```


"Producer" property key.

### getFormat() {#getFormat--}
```
public ImageFormat getFormat()
```


Gets image format.

**Returns:**
[ImageFormat](../../com.aspose.eps/imageformat) - An image format.
### renew() {#renew--}
```
public void renew()
```


Reset device to initial state for whole document.

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Specifies options for managing rendering process.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Rendering options. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Specifies device properties.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Device properties. |

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
### getCreator() {#getCreator--}
```
public String getCreator()
```


Gets creator of resulting device output.

**Returns:**
java.lang.String - The creator.
### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Specifies creator of resulting device output.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| creator | java.lang.String | The creator. |

### getSize() {#getSize--}
```
public Dimension getSize()
```


Gets a size of the page.

**Returns:**
java.awt.Dimension - Size of the page.
### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specifies a size of the page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Size of the page. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Gets current background of the page.

**Returns:**
java.awt.Color - Current background.
### setBackground(Color bkgrd) {#setBackground-java.awt.Color-}
```
public void setBackground(Color bkgrd)
```


Specifies current background of the page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bkgrd | java.awt.Color | A background. |

### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Gets current opacity.

**Returns:**
float - Current opacity.
### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Specifies current opacity.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| opacity | float | An opacity. |

### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Gets current stroke.

**Returns:**
java.awt.Stroke - Current stroke.
### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Specifies current stroke.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stroke | java.awt.Stroke | A stroke. |

### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Gets current paint.

**Returns:**
java.awt.Paint - Current paint.
### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Specifies current paint.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| paint | java.awt.Paint | A paint. |

### getFont() {#getFont--}
```
public ITrFont getFont()
```


Gets current font.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Specifies current font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | A font. |

### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Gets current characters transform.

**Returns:**
java.awt.geom.AffineTransform - Current characters transform.
### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Specifies current characters transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | Characters transform. |

### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Gets current text rendering mode.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### setTextRenderingMode(TextRenderingMode trm) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode trm)
```


Specifies current text rendering mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| trm | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Text rendering mode. |

### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Gets current text stroke width.

**Returns:**
float - Current text stroke width.
### setTextStrokeWidth(float tsw) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float tsw)
```


Specifies current text stroke width.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| tsw | float | Text stroke width. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Makes necessary preparation of device before start rendering of document.

### endDocument() {#endDocument--}
```
public void endDocument()
```


Makes necessary preparation of device after the document has been rendered.

### dispose() {#dispose--}
```
public void dispose()
```


Disposes the device.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Indicates whether device uses direct RGB mode, that is RGB.

**Returns:**
boolean - True if direct RGB mode and false otherwise, that is BGR.
### reset() {#reset--}
```
public void reset()
```


Reset the device to initial state for a page.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Initializes numbers of pages to output.

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
### closePage() {#closePage--}
```
public final void closePage()
```


Makes necessary preparation of the device after page has been rendered.

### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Gets current page number.

**Returns:**
int - Current page number.
### updatePageParameters(IMultiPageDevice doc) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice doc)
```


Updates page parameters from other multi-paged device.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| doc | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) | Another instance of the same device. |

### create() {#create--}
```
public Device create()
```


Creates a copy of this device.

**Returns:**
[Device](../../com.aspose.page/device)
### initClip() {#initClip--}
```
public void initClip()
```


Initializes a clip of the device

### draw(Shape s) {#draw-java.awt.Shape-}
```
public void draw(Shape s)
```


Draws a path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | A path to be drawn. |

### fill(Shape s) {#fill-java.awt.Shape-}
```
public void fill(Shape s)
```


Fills a path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | A path to be filled. |

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

### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Gets the current transform.

**Returns:**
java.awt.geom.AffineTransform - current transform.
### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Specifies current transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | A transform. |

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

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Rotate the current transform over the Z-axis. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | radians over which to rotate |

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

### setClip(Shape path) {#setClip-java.awt.Shape-}
```
public void setClip(Shape path)
```


Specifies clip shape.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | Path that is used for clipping. |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Writes a comment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| comment | java.lang.String | A comment to be written. |

### toString() {#toString--}
```
public String toString()
```


Returns the name of device type.

**Returns:**
java.lang.String - Type name.
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

### getImagesBytes() {#getImagesBytes--}
```
public byte[][] getImagesBytes()
```


Gets resulting images in bytes.

**Returns:**
byte[][] - Images bytes. One byte array for one page.
