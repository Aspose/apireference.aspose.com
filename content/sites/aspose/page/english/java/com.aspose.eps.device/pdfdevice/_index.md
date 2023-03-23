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
public class PdfDevice extends Device implements IMultiPageDevice, IStreamable
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
| [VERSION](#VERSION) | "Version" property key. |
| [VERSION5](#VERSION5) | "Version of Adobe Acrobat Reader" property value. |
| [TRANSPARENT](#TRANSPARENT) | "Transparent" property key. |
| [BACKGROUND](#BACKGROUND) | "Background" property key. |
| [BACKGROUND_COLOR](#BACKGROUND-COLOR) | "Background color" property key. |
| [PAGE_SIZE](#PAGE-SIZE) | "Page size" property key. |
| [PAGE_MARGINS](#PAGE-MARGINS) | "Page margins" property key. |
| [ORIENTATION](#ORIENTATION) | "Orientation" property key. |
| [FIT_TO_PAGE](#FIT-TO-PAGE) | "Fit content to page" property key. |
| [EMBED_FONTS](#EMBED-FONTS) | "Embed font in document" property key. |
| [EMBED_FONTS_AS](#EMBED-FONTS-AS) | "What font type is used for embedding" property key. |
| [COMPRESS](#COMPRESS) | "Compress" property key. |
| [WRITE_IMAGES_AS](#WRITE-IMAGES-AS) | "Format of images" property key. |
| [PRODUCER](#PRODUCER) | "Producer" property key. |
| [AUTHOR](#AUTHOR) | "Author" property key. |
| [TITLE](#TITLE) | "Title" property key. |
| [SUBJECT](#SUBJECT) | "Subject" property key. |
| [KEYWORDS](#KEYWORDS) | "Keywords" property key. |
| [EMIT_WARNINGS](#EMIT-WARNINGS) | "Emit warnings" property key. |
| [EMIT_ERRORS](#EMIT-ERRORS) | "Emit errors" property key. |
| [CREATOR](#CREATOR) |  |
## Methods

| Method | Description |
| --- | --- |
| [getProperties()](#getProperties--) | Gets device properties including metadata. |
| [setProperties(Properties props)](#setProperties-java.util.Properties-) | Specifies device properties including metadata. |
| [renew()](#renew--) | Reset device to initial state for whole document. |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [startDocument()](#startDocument--) | Makes necessary preparation of device before start rendering of document. |
| [endDocument()](#endDocument--) | Makes necessary preparation of device after the document has been rendered. |
| [dispose()](#dispose--) | Disposes the graphics context. |
| [reset()](#reset--) | If page device parameters will be set this method allows to return writing stream back the begining of page. |
| [initPageNumbers()](#initPageNumbers--) | Initializes numbers of pages to output. |
| [openPage(String title)](#openPage-java.lang.String-) | Makes necessary preparation of the device before page rendering. |
| [openPage(float width, float height)](#openPage-float-float-) | Makes necessary preparation of the device before page rendering. |
| [closePage()](#closePage--) | Makes necessary preparation of the device after page has been rendered. |
| [savePageTransform()](#savePageTransform--) |  |
| [getCurrentPageNumber()](#getCurrentPageNumber--) | Gets current page number. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) | Updates page parameters from other multi-paged device. |
| [setSaveFromPatternCreate()](#setSaveFromPatternCreate--) |  |
| [create()](#create--) | Creates a copy of this device. |
| [initClip()](#initClip--) | Initializes clip of the device. |
| [draw(Shape s)](#draw-java.awt.Shape-) | Draws a path. |
| [fill(Shape s)](#fill-java.awt.Shape-) | Fills a path. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Draws an image with assigned transform and background. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) | Draws a string at given point. |
| [getTransform()](#getTransform--) | Gets the current transform. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Specifies the current transform. |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transforms the current transform. |
| [translate(double x, double y)](#translate-double-double-) | Translates the current transformation matrix. |
| [rotate(double theta)](#rotate-double-) | Rotate the current transform over the Z-axis. |
| [scale(double sx, double sy)](#scale-double-double-) | Scales the current transformation matrix. |
| [shear(double shx, double shy)](#shear-double-double-) | Shears the current transformation matrix. |
| [setClip(Shape path)](#setClip-java.awt.Shape-) |  **Specifies clip shape.** |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Specifies current paint. |
| [clipRect(float x, float y, float width, float height)](#clipRect-float-float-float-float-) | Clips rectangle. |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Writes a comment. |
| [toString()](#toString--) | Returns the name of device type. |
| [clip(Shape s)](#clip-java.awt.Shape-) | Clips using given shape. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Specifies current font. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Writes out string with specified font. |
| [getOutputStream()](#getOutputStream--) | Gets an output stream. |
| [setOutputStream(OutputStream os)](#setOutputStream-java.io.OutputStream-) | Specifies an output stream. |
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

### VERSION {#VERSION}
```
public static final String VERSION
```


"Version" property key.

### VERSION5 {#VERSION5}
```
public static final String VERSION5
```


"Version of Adobe Acrobat Reader" property value.

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


"Embed font in document" property key.

### EMBED_FONTS_AS {#EMBED-FONTS-AS}
```
public static final String EMBED_FONTS_AS
```


"What font type is used for embedding" property key.

### COMPRESS {#COMPRESS}
```
public static final String COMPRESS
```


"Compress" property key.

### WRITE_IMAGES_AS {#WRITE-IMAGES-AS}
```
public static final String WRITE_IMAGES_AS
```


"Format of images" property key.

### PRODUCER {#PRODUCER}
```
public static final String PRODUCER
```


"Producer" property key.

### AUTHOR {#AUTHOR}
```
public static final String AUTHOR
```


"Author" property key.

### TITLE {#TITLE}
```
public static final String TITLE
```


"Title" property key.

### SUBJECT {#SUBJECT}
```
public static final String SUBJECT
```


"Subject" property key.

### KEYWORDS {#KEYWORDS}
```
public static final String KEYWORDS
```


"Keywords" property key.

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

### CREATOR {#CREATOR}
```
public static final String CREATOR
```


### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Gets device properties including metadata.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### setProperties(Properties props) {#setProperties-java.util.Properties-}
```
public void setProperties(Properties props)
```


Specifies device properties including metadata.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| props | java.util.Properties | Device properties. |

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


Disposes the graphics context. If on creation restoreOnDispose was true, writeGraphicsRestore() will be called.

### reset() {#reset--}
```
public void reset()
```


If page device parameters will be set this method allows to return writing stream back the begining of page.

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

### savePageTransform() {#savePageTransform--}
```
public void savePageTransform()
```




### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Gets current page number.

**Returns:**
int - The number of current page.
### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Updates page parameters from other multi-paged device.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) | Another instance of the same device. |

### setSaveFromPatternCreate() {#setSaveFromPatternCreate--}
```
public void setSaveFromPatternCreate()
```




### create() {#create--}
```
public Device create()
```


Creates a copy of this device.

**Returns:**
[Device](../../com.aspose.page/device) - Copy of this device.
### initClip() {#initClip--}
```
public void initClip()
```


Initializes clip of the device.

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
java.awt.geom.AffineTransform - Current transform.
### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Specifies the current transform. Since most output formats do not implement this functionality, the inverse transform of the currentTransform is calculated and multiplied by the transform to be set. The result is then forwarded by a call to writeTransform(Transform).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Transform to be applied. |

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

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Rotate the current transform over the Z-axis. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| theta | double | Radians over which to rotate. |

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


 **Specifies clip shape.** 

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | Path that is used for clipping. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Specifies current paint.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| paint | java.awt.Paint | A paint. |

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
### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Clips using given shape. Dispatches to writeClip(Rectangle), writeClip(Rectangle2D) or writeClip(Shape).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | Shape used for clipping. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Specifies current font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | A font. |

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

### getOutputStream() {#getOutputStream--}
```
public OutputStream getOutputStream()
```


Gets an output stream.

**Returns:**
java.io.OutputStream - An output stream.
### setOutputStream(OutputStream os) {#setOutputStream-java.io.OutputStream-}
```
public void setOutputStream(OutputStream os)
```


Specifies an output stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| os | java.io.OutputStream | An output stream. |

