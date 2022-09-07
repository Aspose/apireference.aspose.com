---
title: XpsDocument
second_title: Aspose.Page for Java API Reference
description: Class incapsulating the main entity of XPS document that provides manipulation methods for any XPS element.
type: docs
weight: 18
url: /java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Class incapsulating the main entity of XPS document that provides manipulation methods for any XPS element.
## Constructors

| Constructor | Description |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Creates empty XPS document with default page size. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Opens an existing XPS document located at the \`\`\` path \`\`\`. |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Loads an existing document stored in the \`\`\` stream \`\`\` as XPS document. |
## Methods

| Method | Description |
| --- | --- |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Selects an active document for editing. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Selects an active document page for editing. |
| [getActiveDocument()](#getActiveDocument--) | Returns the active document number. |
| [getActivePage()](#getActivePage--) | Returns the active page number within the active document. |
| [getPage()](#getPage--) | Returns the \`\`\` XpsPage \`\`\` instance for active page. |
| [save(String path)](#save-java.lang.String-) | Saves XPS document to the XPS file located at the \`\`\` path \`\`\`. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Saves XPS document to stream. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Saves the document using the \`\`\` Device \`\`\` instance. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Merging XPS documents to PDF using the \`\`\` Device \`\`\` instance. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Merging several XPS files into one XPS document. |
| [getDocumentCount()](#getDocumentCount--) | Returns the number of documents inside the XPS package. |
| [getTotalPageCount()](#getTotalPageCount--) | Returns the total number of pages in all documents inside XPS document. |
| [getPageCount()](#getPageCount--) | Returns the number of pages in the active document. |
| [getJobPrintTicket()](#getJobPrintTicket--) | Returns the document's job print ticket. |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Sets the document's job print ticket. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Gets the print ticket of the document indexed by \`\`\` documentIndex \`\`\`. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Links the \`\`\` printTicket \`\`\` to the document indexed by \`\`\` documentIndex \`\`\`. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Gets the print ticket of the page indexed by \`\`\` pageIndex \`\`\` in the document indexed by \`\`\` documentIndex \`\`\`. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Links the \`\`\` printTicket \`\`\` to the page indexed by \`\`\` pageIndex \`\`\` in the document indexed by \`\`\` documentIndex \`\`\`. |
| [<T>add(T element)](#-T-add-T-) | Adds a content element (Canvas, Path or Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserts an element (Canvas, Path or Glyphs) to the active page at \`\`\` index \`\`\` position. |
| [<T>remove(T element)](#-T-remove-T-) | Removes an element from the active page. |
| [removeAt(int index)](#removeAt-int-) | Removes an element at \`\`\` index \`\`\` position from the active page. |
| [addDocument()](#addDocument--) | Adds an empty document with default page size and selects added document as active. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Adds an empty document with default page size. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Adds an empty document with the first page dimensions \`\`\` width \`\`\` and \`\`\` height \`\`\` and selects added document as active. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Adds an empty document with the first page dimensions \`\`\` width \`\`\` and \`\`\` height \`\`\`. |
| [insertDocument(int index)](#insertDocument-int-) | Inserts an empty document with default page size at \`\`\` index \`\`\` position and selects inserted document as active. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Inserts an empty document with default page size at \`\`\` index \`\`\` position. |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Inserts an empty document with the first page dimensions \`\`\` width \`\`\` and \`\`\` height \`\`\` at \`\`\` index \`\`\` position and selects inserted document as active. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Inserts an empty document with the first page dimensions \`\`\` width \`\`\` and \`\`\` height \`\`\` at \`\`\` index \`\`\` position. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Removes a document at \`\`\` index \`\`\` position. |
| [addPage()](#addPage--) | Adds an empty page to the document with default page size. |
| [addPage(boolean activate)](#addPage-boolean-) | Adds an empty page to the document with default page size. |
| [addPage(float width, float height)](#addPage-float-float-) | Adds an empty page to the document with specified \`\`\` width \`\`\` and \`\`\` height \`\`\`. |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Adds an empty page to the document with specified \`\`\` width \`\`\` and \`\`\` height \`\`\`. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Adds a page to the document and selects added page as active. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Adds a page to the document. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Removes a page from the document. |
| [insertPage(int index)](#insertPage-int-) | Inserts an empty page to the document with default page size at \`\`\` index \`\`\` position and select inserted page as active. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Inserts an empty page to the document with default page size at \`\`\` index \`\`\` position. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Inserts an empty page to the document with specified \`\`\` width \`\`\` and \`\`\` height \`\`\` at \`\`\` index \`\`\` position and selects inserted page as active. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Inserts an empty page to the document with specified \`\`\` width \`\`\` and \`\`\` height \`\`\` at \`\`\` index \`\`\` position. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Inserts a page to the document at \`\`\` index \`\`\` position and selects inserted page as active. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Inserts a page to the document at \`\`\` index \`\`\` position. |
| [removePageAt(int index)](#removePageAt-int-) | Removes a page from the document at \`\`\` index \`\`\` position. |
| [createCanvas()](#createCanvas--) | Creates a new canvas. |
| [addCanvas()](#addCanvas--) | Adds a new canvas to the active page. |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserts a new canvas to the active page at \`\`\` index \`\`\` position. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Creates a new path. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Adds a new path to the active page. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserts a new path to the active page at \`\`\` index \`\`\` position. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Creates new glyphs. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Creates new glyphs. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Adds new glyphs to the active page. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserts new glyphs to the active page at \`\`\` index \`\`\` position. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Adds new glyphs to the active page. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Inserts new glyphs to the active page at \`\`\` index \`\`\` position. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Creates a new affine transformation matrix. |
| [createPathGeometry()](#createPathGeometry--) | Creates a new path geometry. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Creates a new path geometry with specified list of path figures. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Creates a new path geometry specified with abbreviated form. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Creates a new open path figure. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Creates a new path figure. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Creates a new open path figure. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Creates a new path figure. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Creates a new stroked elliptical arc segment. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Creates a new elliptical arc segment. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Creates a new stroked polygonal drawing containing an arbitrary number of individual vertices. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Creates a new set of stroked cubic B?zier curves. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Creates a new set of cubic B?zier curves. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Creates a new set of stroked quadratic B?zier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Creates a new set of quadratic B?zier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Creates a new solid color brush. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Creates a new solid color brush. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Creates a new gradient stop. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Creates a new gradient stop. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Creates a new linear gradient brush. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Creates a new linear gradient brush. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Creates a new radial gradient brush. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Creates a new radial gradient brush. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Creates a new visual brush. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Creates a new image brush. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Creates a new image brush. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Creates a new color. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Creates a new color in sRGB color space. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Creates a new color in sRGB color space. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Creates a new color in scRGB color space. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Creates a new color in scRGB color space. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Creates a new color in ICC based color space. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Creates a new color in ICC based color space. |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Creates a new image resource out of image file located at the \`\`\` imagePath \`\`\`. |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Creates a new image resource out of \`\`\` stream \`\`\`. |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Creates a new ICC profile resource out of ICC profile file located at the \`\`\` iccProfilePath \`\`\`. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Creates a new ICC profile resource out of \`\`\` stream \`\`\`. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Creates a new TrueType font resource. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Creates a new TrueType font resource out of stream. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Adds an outline entry to the document. |
| [close()](#close--) | Disposes the instance. |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Creates empty XPS document with default page size.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Opens an existing XPS document located at the \`\`\` path \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | Location of the document. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Loads an existing document stored in the \`\`\` stream \`\`\` as XPS document.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | Document stream. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Document loading options. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Selects an active document for editing.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| documentNumber | int | A document number. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Selects an active document page for editing.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pageNumber | int | A page number. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - \`\`\` XpsPage \`\`\` instance for active page.
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Returns the active document number.

**Returns:**
int - The int value.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Returns the active page number within the active document.

**Returns:**
int - The int value.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Returns the \`\`\` XpsPage \`\`\` instance for active page.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The \`\`\` XpsPage \`\`\` instance for active page.
### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Saves XPS document to the XPS file located at the \`\`\` path \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | Location of the document. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Saves XPS document to stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream XPS document to be saved into. |

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Saves the document using the \`\`\` Device \`\`\` instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | The \`\`\` Device \`\`\` instance. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Document saving options. |

### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Merging XPS documents to PDF using the \`\`\` Device \`\`\` instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS files for merging with this document to an output device. |
| device | [Device](../../com.aspose.page/device) | The \`\`\` Device \`\`\` instance. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Document saving options. |

### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Merging several XPS files into one XPS document.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS files for merging with this document. |
| outStream | java.io.OutputStream | The output stream where to save merged XPS documents. |

### getDocumentCount() {#getDocumentCount--}
```
public int getDocumentCount()
```


Returns the number of documents inside the XPS package.

**Returns:**
int - The number of documents inside the XPS package.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Returns the total number of pages in all documents inside XPS document.

**Returns:**
int - The total number of pages in all documents inside XPS document.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Returns the number of pages in the active document.

**Returns:**
int - The number of pages in the active document.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Returns the document's job print ticket.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Sets the document's job print ticket.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | The document's job print ticket. |

### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Gets the print ticket of the document indexed by \`\`\` documentIndex \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| documentIndex | int | Index of the document whose print ticket to return. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Links the \`\`\` printTicket \`\`\` to the document indexed by \`\`\` documentIndex \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| documentIndex | int | Index of the document to link the print ticket to. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | The print ticket to link. |

### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Gets the print ticket of the page indexed by \`\`\` pageIndex \`\`\` in the document indexed by \`\`\` documentIndex \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| documentIndex | int | Index of the document. |
| pageIndex | int | Index of the page whose print ticket to return. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Links the \`\`\` printTicket \`\`\` to the page indexed by \`\`\` pageIndex \`\`\` in the document indexed by \`\`\` documentIndex \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| documentIndex | int | Index of the document. |
| pageIndex | int | Index of the page to link the print ticket to. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | The print ticket to link. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Adds a content element (Canvas, Path or Glyphs)

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


Inserts an element (Canvas, Path or Glyphs) to the active page at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which an \`\`\` element \`\`\` should be inserted. |
| element | T | The element to insert. |

**Returns:**
T - Inserted element.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Removes an element from the active page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | T | The element to remove. |

**Returns:**
T - Removed element.
### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


Removes an element at \`\`\` index \`\`\` position from the active page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which element should be removed. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Adds an empty document with default page size and selects added document as active.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Adds an empty document with default page size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| activate | boolean | Flag indicating whether to select added document as active. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Adds an empty document with the first page dimensions \`\`\` width \`\`\` and \`\`\` height \`\`\` and selects added document as active.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | Width of the first page. |
| height | float | Height of the first page. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Adds an empty document with the first page dimensions \`\`\` width \`\`\` and \`\`\` height \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | Width of the first page. |
| height | float | Height of the first page. |
| activate | boolean | Flag indicating whether to select added document as active. |

### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Inserts an empty document with default page size at \`\`\` index \`\`\` position and selects inserted document as active.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a document should be inserted. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Inserts an empty document with default page size at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a document should be inserted. |
| activate | boolean | Flag indicating whether to select inserted document as active. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Inserts an empty document with the first page dimensions \`\`\` width \`\`\` and \`\`\` height \`\`\` at \`\`\` index \`\`\` position and selects inserted document as active.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a document should be inserted. |
| width | float | Width of the first page. |
| height | float | Height of the first page. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Inserts an empty document with the first page dimensions \`\`\` width \`\`\` and \`\`\` height \`\`\` at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a document should be inserted. |
| width | float | Width of the first page. |
| height | float | Height of the first page. |
| activate | boolean | Flag indicating whether to select inserted document as active. |

### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Removes a document at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a document should be removed. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Adds an empty page to the document with default page size.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Adds an empty page to the document with default page size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| activate | boolean | Flag indicating whether to select added page as active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Adds an empty page to the document with specified \`\`\` width \`\`\` and \`\`\` height \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | Width of a new page. |
| height | float | Height of a new page. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Adds an empty page to the document with specified \`\`\` width \`\`\` and \`\`\` height \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | Width of a new page. |
| height | float | Height of a new page. |
| activate | boolean | Flag indicating whether to select added page as active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Adds a page to the document and selects added page as active.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page to be added. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Adds a page to the document.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page to be added. |
| activate | boolean | Flag indicating whether to select added page as active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Removes a page from the document.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page to be removed. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Inserts an empty page to the document with default page size at \`\`\` index \`\`\` position and select inserted page as active.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a page should be inserted. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Inserts an empty page to the document with default page size at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a page should be inserted. |
| activate | boolean | Flag indicating whether to select inserted page as active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Inserts an empty page to the document with specified \`\`\` width \`\`\` and \`\`\` height \`\`\` at \`\`\` index \`\`\` position and selects inserted page as active.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a page should be inserted. |
| width | float | Width of a new page. |
| height | float | Height of a new page. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Inserts an empty page to the document with specified \`\`\` width \`\`\` and \`\`\` height \`\`\` at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a page should be inserted. |
| width | float | Width of a new page. |
| height | float | Height of a new page. |
| activate | boolean | Flag indicating whether to select inserted page as active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Inserts a page to the document at \`\`\` index \`\`\` position and selects inserted page as active.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a page should be added. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page to be inserted. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Inserts a page to the document at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a page should be added. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page to be inserted. |
| activate | boolean | Flag indicating whether to select inserted page as active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Removes a page from the document at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a page should be removed. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Creates a new canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Adds a new canvas to the active page.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Inserts a new canvas to the active page at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a new canvas should be inserted. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Creates a new path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Adds a new path to the active page.

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


Inserts a new path to the active page at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a new path should be inserted. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Creates new glyphs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | Font family. |
| fontRenderingEmSize | float | Font size. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Font style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Creates new glyphs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font resource. |
| fontRenderingEmSize | float | Font size. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Adds new glyphs to the active page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | Font family. |
| fontRenderingEmSize | float | Font size. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Font style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserts new glyphs to the active page at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which new glyphs should be inserted. |
| fontFamily | java.lang.String | Font family. |
| fontSize | float | Font size. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Font style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Adds new glyphs to the active page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font resource. |
| fontRenderingEmSize | float | Font size. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Inserts new glyphs to the active page at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which new glyphs should be inserted. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font resource. |
| fontSize | float | Font size. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Creates a new affine transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m11 | float | Element 11. |
| m12 | float | Element 12. |
| m21 | float | Element 21. |
| m22 | float | Element 22. |
| m31 | float | Element 31. |
| m32 | float | Element 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Creates a new path geometry.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Creates a new path geometry with specified list of path figures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | List of path figures. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Creates a new path geometry specified with abbreviated form.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Abbreviated form of path geometry. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Creates a new open path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Creates a new path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |
| isClosed | boolean | Specifies whether the path is closed. If set to true, the stroke is drawn "closed," that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open," and the last point is not connected to the start point. Only applicable if the path figure is used in a \{Path\} element that specifies a stroke. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Creates a new open path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | List of path segments. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Creates a new path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | List of path segments. |
| isClosed | boolean | Specifies whether the path is closed. If set to true, the stroke is drawn "closed," that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open," and the last point is not connected to the start point. Only applicable if the path figure is used in a \{Path\} element that specifies a stroke. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Creates a new stroked elliptical arc segment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | java.awt.geom.Point2D | The end point of the elliptical arc. |
| size | java.awt.geom.Dimension2D | The x and y radius of the elliptical arc as an x,y pair. |
| rotationAngle | float | Indicates how the ellipse is rotated relative to the current coordinate system. |
| isLargeArc | boolean | Determines whether the arc is drawn with a sweep of 180 or greater. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | The direction in which the arc is drawn. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Creates a new elliptical arc segment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | java.awt.geom.Point2D | The end point of the elliptical arc. |
| size | java.awt.geom.Dimension2D | The x and y radius of the elliptical arc as an x,y pair. |
| rotationAngle | float | Indicates how the ellipse is rotated relative to the current coordinate system. |
| isLargeArc | boolean | Determines whether the arc is drawn with a sweep of 180 or greater. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | The direction in which the arc is drawn. |
| isStroked | boolean | Specifies whether the stroke for this segment of the path is drawn. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Creates a new stroked polygonal drawing containing an arbitrary number of individual vertices.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | A set of coordinates for the multiple segments that define the poly line segment. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Creates a new polygonal drawing containing an arbitrary number of individual vertices.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | A set of coordinates for the multiple segments that define the poly line segment. |
| isStroked | boolean | Specifies whether the stroke for this segment of the path is drawn. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Creates a new set of stroked cubic B?zier curves.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Control points for multiple B?zier segments. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Creates a new set of cubic B?zier curves.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Control points for multiple B?zier segments. |
| isStroked | boolean | Specifies whether the stroke for this segment of the path is drawn. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Creates a new set of stroked quadratic B?zier curves from the previous point in the path figure through a set of vertices, using specified control points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Control points for multiple quadratic B?zier segments. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Creates a new set of quadratic B?zier curves from the previous point in the path figure through a set of vertices, using specified control points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Control points for multiple quadratic B?zier segments. |
| isStroked | boolean | Specifies whether the stroke for this segment of the path is drawn. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Creates a new solid color brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | The color for filled elements. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Creates a new solid color brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | The color for filled elements. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Creates a new gradient stop.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | The gradient stop color. |
| offset | float | The gradient offset. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Creates a new gradient stop.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | The gradient stop color. |
| offset | float | The gradient offset. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Creates a new linear gradient brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | The list of gradient stops. |
| startPoint | java.awt.geom.Point2D | The starting point of the linear gradient. |
| endPoint | java.awt.geom.Point2D | The end point of the linear gradient. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Creates a new linear gradient brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point of the linear gradient. |
| endPoint | java.awt.geom.Point2D | The end point of the linear gradient. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Creates a new radial gradient brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | The list of gradient stops. |
| center | java.awt.geom.Point2D | The center point of the radial gradient (that is, the center of the ellipse). |
| gradientOrigin | java.awt.geom.Point2D | The origin point of the radial gradient. |
| radiusX | float | The radius in the x dimension of the ellipse which defines the radial gradient. |
| radiusY | float | The radius in the y dimension of the ellipse which defines the radial gradient. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Creates a new radial gradient brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | The center point of the radial gradient (that is, the center of the ellipse). |
| gradientOrigin | java.awt.geom.Point2D | The origin point of the radial gradient. |
| radiusX | float | The radius in the x dimension of the ellipse which defines the radial gradient. |
| radiusY | float | The radius in the y dimension of the ellipse which defines the radial gradient. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Creates a new visual brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | The XPS element (Canvas, Path or Glyphs) for Visual property od visual brush. |
| viewbox | java.awt.geom.Rectangle2D | The position and dimensions of the brush's source content. |
| viewport | java.awt.geom.Rectangle2D | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Creates a new image brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | An image resource. |
| viewbox | java.awt.geom.Rectangle2D | The position and dimensions of the brush's source content. |
| viewport | java.awt.geom.Rectangle2D | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Creates a new image brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imagePath | java.lang.String | The path to the image to take as a brush tile. |
| viewbox | java.awt.geom.Rectangle2D | The position and dimensions of the brush's source content. |
| viewport | java.awt.geom.Rectangle2D | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Creates a new color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | A native color instance for RGB color. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Creates a new color in sRGB color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | int | The alpha color component. |
| r | int | The red color component. |
| g | int | The green color component. |
| b | int | The blue color component. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Creates a new color in sRGB color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| r | int | The red color component. |
| g | int | The green color component. |
| b | int | The blue color component. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Creates a new color in scRGB color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | float | The alpha color component. |
| r | float | The red color component. |
| g | float | The green color component. |
| b | float | The blue color component. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Creates a new color in scRGB color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| r | float | The red color component. |
| g | float | The green color component. |
| b | float | The blue color component. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Creates a new color in ICC based color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | The path to the ICC profile. |
| components | float[] | Color components. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Creates a new color in ICC based color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | The ICC profile resource. |
| components | float[] | Color components. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Creates a new image resource out of image file located at the \`\`\` imagePath \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imagePath | java.lang.String | The path to the image to take as a resource. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Creates a new image resource out of \`\`\` stream \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The stream containing the image to take as a resource. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Creates a new ICC profile resource out of ICC profile file located at the \`\`\` iccProfilePath \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| iccProfilePath | java.lang.String | The path to the ICC profile to take as a resource. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Creates a new ICC profile resource out of \`\`\` stream \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The stream containing the ICC profile to take as a resource. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Creates a new TrueType font resource.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | The font family. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | The font style. See \`\`\` XpsFont \`\`\` class constants (which are bit flags) for values available to combine. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Creates a new TrueType font resource out of stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The stream containing the ICC profile to take as a resource. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Adds an outline entry to the document.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| description | java.lang.String | The entry description. |
| outlineLevel | int | The outline level. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | The entry target. |

### close() {#close--}
```
public void close()
```


Disposes the instance.

