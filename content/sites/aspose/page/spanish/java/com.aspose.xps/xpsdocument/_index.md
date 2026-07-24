---
title: "XpsDocument"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula la entidad principal del documento XPS que proporciona métodos de manipulación para cualquier elemento XPS."
type: docs
weight: 19
url: /es/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Clase que encapsula la entidad principal del documento XPS que proporciona métodos de manipulación para cualquier elemento XPS.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Crea un documento XPS vacío con el tamaño de página predeterminado. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Abre un documento XPS existente ubicado en la ruta . |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Carga un documento existente almacenado en el stream como documento XPS. |
## Métodos

| Método | Descripción |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Agrega un elemento de contenido (Canvas, Path o Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserta un elemento (Canvas, Path o Glyphs) en la página activa en la posición index. |
| [<T>remove(T element)](#-T-remove-T-) | Elimina un elemento de la página activa. |
| [addCanvas()](#addCanvas--) | Añade un nuevo canvas a la página activa. |
| [addDocument()](#addDocument--) | Añade un documento vacío con el tamaño de página predeterminado y selecciona el documento añadido como activo. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Añade un documento vacío con el tamaño de página predeterminado. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Añade un documento vacío con las dimensiones de la primera página width y height y selecciona el documento añadido como activo. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Añade un documento vacío con las dimensiones de la primera página width y height. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Añade nuevos glyphs a la página activa. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Añade nuevos glyphs a la página activa. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Añade una entrada de contorno al documento. |
| [addPage()](#addPage--) | Añade una página vacía al documento con el tamaño de página predeterminado. |
| [addPage(boolean activate)](#addPage-boolean-) | Añade una página vacía al documento con el tamaño de página predeterminado. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Añade una página al documento y selecciona la página añadida como activa. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Añade una página al documento. |
| [addPage(float width, float height)](#addPage-float-float-) | Añade una página vacía al documento con el ancho width y la altura height especificados. |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Añade una página vacía al documento con el ancho width y la altura height especificados. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Añade un nuevo path a la página activa. |
| [close()](#close--) | Elimina la instancia. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Crea un nuevo segmento de arco elíptico con trazo. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Crea un nuevo segmento de arco elíptico. |
| [createCanvas()](#createCanvas--) | Crea un nuevo canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Crea un nuevo color en un espacio de color basado en ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Crea un nuevo color en el espacio de color scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Crea un nuevo color en el espacio de color scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Crea un nuevo color en el espacio de color sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Crea un nuevo color en el espacio de color sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Crea un nuevo color. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Crea un nuevo color en un espacio de color basado en ICC. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Crea un nuevo recurso de fuente TrueType a partir del stream. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Crea un nuevo recurso de fuente TrueType. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Crea nuevos glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Crea nuevos glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Crea una nueva parada de degradado. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Crea una nueva parada de degradado. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Crea un nuevo recurso de perfil ICC a partir del stream. |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Crea un nuevo recurso de perfil ICC a partir del archivo de perfil ICC ubicado en iccProfilePath. |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Crea un nuevo recurso de imagen a partir del stream. |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Crea un nuevo recurso de imagen a partir del archivo de imagen ubicado en imagePath. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuevo pincel de imagen. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuevo pincel de imagen. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crea un nuevo pincel de degradado lineal. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crea un nuevo pincel de degradado lineal. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Crea una nueva matriz de transformación afín. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Crea una nueva ruta. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Crea una nueva figura de ruta abierta. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Crea una nueva figura de ruta. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Crea una nueva figura de ruta abierta. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Crea una nueva figura de ruta. |
| [createPathGeometry()](#createPathGeometry--) | Crea una nueva geometría de ruta. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Crea una nueva geometría de ruta especificada con forma abreviada. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Crea una nueva geometría de ruta con una lista especificada de figuras de ruta. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Crea un nuevo conjunto de curvas cúbicas B?bezier con trazo. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Crea un nuevo conjunto de curvas cúbicas B?bezier. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Crea un nuevo dibujo poligonal con trazo que contiene un número arbitrario de vértices individuales. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Crea un nuevo dibujo polygonal que contiene un número arbitrario de vértices individuales. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Crea un nuevo conjunto de curvas cuadráticas B?bezier con trazo desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Crea un nuevo conjunto de curvas cuadráticas B?bezier desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crea un nuevo pincel de degradado radial. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crea un nuevo pincel de degradado radial. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Crea un nuevo pincel de color sólido. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Crea un nuevo pincel de color sólido. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuevo pincel visual. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | Devuelve el número del documento activo. |
| [getActivePage()](#getActivePage--) | Devuelve el número de página activo dentro del documento activo. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Devuelve el número de documentos dentro del paquete XPS. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Obtiene el ticket de impresión del documento indexado por  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Devuelve el ticket de impresión del trabajo del documento. |
| [getPage()](#getPage--) | Devuelve la instancia  XpsPage  de la página activa. |
| [getPageCount()](#getPageCount--) | Devuelve el número de páginas en el documento activo. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Obtiene el ticket de impresión de la página indexada por  pageIndex  en el documento indexado por  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Devuelve el número total de páginas en todos los documentos dentro del documento XPS. |
| [getUtils()](#getUtils--) | Obtiene el objeto que proporciona utilidades más allá de la API formal de manipulación XPS. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserta un nuevo lienzo en la página activa en la posición  index . |
| [insertDocument(int index)](#insertDocument-int-) | Inserta un documento vacío con tamaño de página predeterminado en la posición  index  y selecciona el documento insertado como activo. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Inserta un documento vacío con tamaño de página predeterminado en la posición  index . |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Inserta un documento vacío con las dimensiones de la primera página  width  y  height  en la posición  index  y selecciona el documento insertado como activo. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Inserta un documento vacío con las dimensiones de la primera página  width  y  height  en la posición  index . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Inserta nuevos glifos en la página activa en la posición  index . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserta nuevos glifos en la página activa en la posición  index . |
| [insertPage(int index)](#insertPage-int-) | Inserta una página vacía en el documento con tamaño de página predeterminado en la posición  index  y selecciona la página insertada como activa. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Inserta una página vacía en el documento con tamaño de página predeterminado en la posición  index . |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Inserta una página en el documento en la posición  index  y selecciona la página insertada como activa. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Inserta una página en el documento en la posición  index . |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Inserta una página vacía en el documento con el  width  y  height  especificados en la posición  index  y selecciona la página insertada como activa. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Inserta una página vacía en el documento con el  width  y  height  especificados en la posición  index . |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserta una nueva ruta en la página activa en la posición  index . |
| [isLicensed()](#isLicensed--) | Indica si la licencia del producto Aspose.Page for Java está accesada y es válida. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Fusionando varios archivos XPS en un documento XPS. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Fusionando varios archivos XPS en un documento XPS. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Fusionando documentos XPS a PDF usando la instancia  Device . |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Fusionando documentos XPS a PDF usando la instancia  Device . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Elimina un elemento en la posición  index  de la página activa. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Elimina un documento en la posición  index . |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Elimina una página del documento. |
| [removePageAt(int index)](#removePageAt-int-) | Elimina una página del documento en la posición  index . |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Guarda el documento usando la instancia  Device . |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Guarda el documento XPS en un flujo. |
| [save(String path)](#save-java.lang.String-) | Guarda el documento XPS en el archivo XPS ubicado en la ruta. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Guarda el documento en un archivo de imagen. El directorio de salida y el nombre del archivo serán los mismos que del archivo XPS de entrada. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Guarda el documento en un archivo de imagen en el directorio especificado con el nombre de archivo especificado. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Guarda el documento en formato de imagen bitmap como matrices de bytes. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Guarda el documento en formato PDF. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Guarda el documento en formato PDF. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Guarda el documento en formato PS. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Guarda el documento en formato PostSscript. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Selecciona un documento activo para editar. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Selecciona una página de documento activa para editar. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Vincula el  printTicket  al documento indexado por  documentIndex . |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Establece el ticket de impresión del trabajo del documento. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Vincula el  printTicket  a la página indexada por  pageIndex  en el documento indexado por  documentIndex . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Crea un documento XPS vacío con el tamaño de página predeterminado.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Abre un documento XPS existente ubicado en la ruta .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | java.lang.String | Ubicación del documento. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Carga un documento existente almacenado en el stream como documento XPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.InputStream | Flujo del documento. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Opciones de carga del documento. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Agrega un elemento de contenido (Canvas, Path o Glyphs)

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| elemento | T | El elemento a agregar. |

**Returns:**
T - Elemento agregado.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Inserta un elemento (Canvas, Path o Glyphs) en la página activa en la posición index.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un elemento. |
| elemento | T | El elemento a insertar. |

**Returns:**
T - Elemento insertado.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Elimina un elemento de la página activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| elemento | T | El elemento a eliminar. |

**Returns:**
T - Elemento eliminado.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Añade un nuevo canvas a la página activa.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Añade un documento vacío con el tamaño de página predeterminado y selecciona el documento añadido como activo.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Añade un documento vacío con el tamaño de página predeterminado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| activar | boolean | Indicador que indica si se debe seleccionar el documento añadido como activo. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Añade un documento vacío con las dimensiones de la primera página width y height y selecciona el documento añadido como activo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | Ancho de la primera página. |
| altura | float | Altura de la primera página. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Añade un documento vacío con las dimensiones de la primera página width y height.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | Ancho de la primera página. |
| altura | float | Altura de la primera página. |
| activar | boolean | Indicador que indica si se debe seleccionar el documento añadido como activo. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Añade nuevos glyphs a la página activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Recurso de fuente. |
| fontRenderingEmSize | float | Tamaño de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Añade nuevos glyphs a la página activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontFamily | java.lang.String | Familia de fuente. |
| fontRenderingEmSize | float | Tamaño de fuente. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Estilo de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Añade una entrada de contorno al documento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| descripción | java.lang.String | La descripción de la entrada. |
| outlineLevel | int | El nivel de esquema. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | El objetivo de la entrada. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Añade una página vacía al documento con el tamaño de página predeterminado.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Añade una página vacía al documento con el tamaño de página predeterminado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| activar | boolean | Indicador que indica si se debe seleccionar la página añadida como activa. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Añade una página al documento y selecciona la página añadida como activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Página a añadir. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Añade una página al documento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Página a añadir. |
| activar | boolean | Indicador que indica si se debe seleccionar la página añadida como activa. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Añade una página vacía al documento con el ancho width y la altura height especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | Ancho de una página nueva. |
| altura | float | Altura de una página nueva. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Añade una página vacía al documento con el ancho width y la altura height especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | Ancho de una página nueva. |
| altura | float | Altura de una página nueva. |
| activar | boolean | Indicador que indica si se debe seleccionar la página añadida como activa. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Añade un nuevo path a la página activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Elimina la instancia.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Crea un nuevo segmento de arco elíptico con trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| point | java.awt.geom.Point2D | El punto final del arco elíptico. |
| size | java.awt.geom.Dimension2D | El radio x e y del arco elíptico como un par x,y. |
| rotationAngle | float | Indica cómo se rota la elipse respecto al sistema de coordenadas actual. |
| isLargeArc | boolean | Determina si el arco se dibuja con un barrido de 180 grados o más. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La dirección en la que se dibuja el arco. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Crea un nuevo segmento de arco elíptico.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| point | java.awt.geom.Point2D | El punto final del arco elíptico. |
| size | java.awt.geom.Dimension2D | El radio x e y del arco elíptico como un par x,y. |
| rotationAngle | float | Indica cómo se rota la elipse respecto al sistema de coordenadas actual. |
| isLargeArc | boolean | Determina si el arco se dibuja con un barrido de 180 grados o más. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La dirección en la que se dibuja el arco. |
| isStroked | boolean | Especifica si el trazo para este segmento de la ruta se dibuja. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Crea un nuevo canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Crea un nuevo color en un espacio de color basado en ICC.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | El recurso del perfil ICC. |
| componentes | float[] | Componentes de color. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Crea un nuevo color en el espacio de color scRGB.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| r | float | El componente de color rojo. |
| g | float | El componente de color verde. |
| b | float | El componente de color azul. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Crea un nuevo color en el espacio de color scRGB.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| a | float | El componente alfa del color. |
| r | float | El componente de color rojo. |
| g | float | El componente de color verde. |
| b | float | El componente de color azul. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Crea un nuevo color en el espacio de color sRGB.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| r | int | El componente de color rojo. |
| g | int | El componente de color verde. |
| b | int | El componente de color azul. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Crea un nuevo color en el espacio de color sRGB.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| a | int | El componente alfa del color. |
| r | int | El componente de color rojo. |
| g | int | El componente de color verde. |
| b | int | El componente de color azul. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Crea un nuevo color.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | java.awt.Color | Una instancia de color nativa para color RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Crea un nuevo color en un espacio de color basado en ICC.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | java.lang.String | La ruta al perfil ICC. |
| componentes | float[] | Componentes de color. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Crea un nuevo recurso de fuente TrueType a partir del stream.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.InputStream | El flujo que contiene el perfil ICC para tomar como recurso. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Crea un nuevo recurso de fuente TrueType.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontFamily | java.lang.String | La familia de fuentes. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | El estilo de fuente. Consulte las constantes de clase XpsFont (que son banderas de bits) para los valores disponibles para combinar. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Crea nuevos glyphs.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Recurso de fuente. |
| fontRenderingEmSize | float | Tamaño de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Crea nuevos glyphs.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontFamily | java.lang.String | Familia de fuente. |
| fontRenderingEmSize | float | Tamaño de fuente. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Estilo de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Crea una nueva parada de degradado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | El color de la parada de degradado. |
| desplazamiento | float | El desplazamiento del degradado. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Crea una nueva parada de degradado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | java.awt.Color | El color de la parada de degradado. |
| desplazamiento | float | El desplazamiento del degradado. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Crea un nuevo recurso de perfil ICC a partir del stream.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.InputStream | El flujo que contiene el perfil ICC para tomar como recurso. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Crea un nuevo recurso de perfil ICC a partir del archivo de perfil ICC ubicado en iccProfilePath.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| iccProfilePath | java.lang.String | La ruta al perfil ICC para tomar como recurso. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Crea un nuevo recurso de imagen a partir del stream.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.InputStream | El flujo que contiene la imagen para tomar como recurso. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Crea un nuevo recurso de imagen a partir del archivo de imagen ubicado en imagePath.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagePath | java.lang.String | La ruta a la imagen para tomar como recurso. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuevo pincel de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Un recurso de imagen. |
| viewbox | java.awt.geom.Rectangle2D | La posición y dimensiones del contenido fuente del pincel. |
| área de visualización | java.awt.geom.Rectangle2D | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente repetidamente) aplica para rellenar la región a la que se aplica el pincel |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuevo pincel de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagePath | java.lang.String | La ruta a la imagen que se utilizará como mosaico del pincel. |
| viewbox | java.awt.geom.Rectangle2D | La posición y dimensiones del contenido fuente del pincel. |
| área de visualización | java.awt.geom.Rectangle2D | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente repetidamente) aplica para rellenar la región a la que se aplica el pincel |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Crea un nuevo pincel de degradado lineal.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del degradado lineal. |
| endPoint | java.awt.geom.Point2D | El punto final del degradado lineal. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Crea un nuevo pincel de degradado lineal.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | La lista de paradas de degradado. |
| startPoint | java.awt.geom.Point2D | El punto de inicio del degradado lineal. |
| endPoint | java.awt.geom.Point2D | El punto final del degradado lineal. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Crea una nueva matriz de transformación afín.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| m11 | float | Elemento 11. |
| m12 | float | Elemento 12. |
| m21 | float | Elemento 21. |
| m22 | float | Elemento 22. |
| m31 | float | Elemento 31. |
| m32 | float | Elemento 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Crea una nueva ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Crea una nueva figura de ruta abierta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del primer segmento de la figura de ruta. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Crea una nueva figura de ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del primer segmento de la figura de ruta. |
| isClosed | boolean | Especifica si la ruta está cerrada. Si se establece en true, el trazo se dibuja "closed", es decir, el último punto del último segmento de la figura de ruta se conecta con el punto especificado en el atributo StartPoint; de lo contrario, el trazo se dibuja "open" y el último punto no se conecta al punto de inicio. Solo es aplicable si la figura de ruta se utiliza en un elemento Path que especifica un trazo. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Crea una nueva figura de ruta abierta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del primer segmento de la figura de ruta. |
| segmentos | java.util.List<com.aspose.xps.XpsPathSegment> | Lista de segmentos de ruta. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Crea una nueva figura de ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del primer segmento de la figura de ruta. |
| segmentos | java.util.List<com.aspose.xps.XpsPathSegment> | Lista de segmentos de ruta. |
| isClosed | boolean | Especifica si la ruta está cerrada. Si se establece en true, el trazo se dibuja "closed", es decir, el último punto del último segmento de la figura de ruta se conecta con el punto especificado en el atributo StartPoint; de lo contrario, el trazo se dibuja "open" y el último punto no se conecta al punto de inicio. Solo es aplicable si la figura de ruta se utiliza en un elemento Path que especifica un trazo. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Crea una nueva geometría de ruta.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Crea una nueva geometría de ruta especificada con forma abreviada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Forma abreviada de la geometría de ruta. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Crea una nueva geometría de ruta con una lista especificada de figuras de ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Lista de figuras de ruta. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Crea un nuevo conjunto de curvas cúbicas B?bezier con trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Puntos de control para múltiples segmentos B?bezier. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Crea un nuevo conjunto de curvas cúbicas B?bezier.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Puntos de control para múltiples segmentos B?bezier. |
| isStroked | boolean | Especifica si el trazo para este segmento de la ruta se dibuja. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Crea un nuevo dibujo poligonal con trazo que contiene un número arbitrario de vértices individuales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Un conjunto de coordenadas para los múltiples segmentos que definen el segmento de línea poligonal. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Crea un nuevo dibujo polygonal que contiene un número arbitrario de vértices individuales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Un conjunto de coordenadas para los múltiples segmentos que definen el segmento de línea poligonal. |
| isStroked | boolean | Especifica si el trazo para este segmento de la ruta se dibuja. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Crea un nuevo conjunto de curvas cuadráticas B?bezier con trazo desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Puntos de control para múltiples segmentos B?bezier cuadráticos. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Crea un nuevo conjunto de curvas cuadráticas B?bezier desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Puntos de control para múltiples segmentos B?bezier cuadráticos. |
| isStroked | boolean | Especifica si el trazo para este segmento de la ruta se dibuja. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crea un nuevo pincel de degradado radial.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| center | java.awt.geom.Point2D | El punto central del degradado radial (es decir, el centro de la elipse). |
| gradientOrigin | java.awt.geom.Point2D | El punto de origen del degradado radial. |
| radiusX | float | El radio en la dimensión x de la elipse que define el degradado radial. |
| radiusY | float | El radio en la dimensión y de la elipse que define el degradado radial. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crea un nuevo pincel de degradado radial.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | La lista de paradas de degradado. |
| center | java.awt.geom.Point2D | El punto central del degradado radial (es decir, el centro de la elipse). |
| gradientOrigin | java.awt.geom.Point2D | El punto de origen del degradado radial. |
| radiusX | float | El radio en la dimensión x de la elipse que define el degradado radial. |
| radiusY | float | El radio en la dimensión y de la elipse que define el degradado radial. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Crea un nuevo pincel de color sólido.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | El color para los elementos rellenos. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Crea un nuevo pincel de color sólido.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | java.awt.Color | El color para los elementos rellenos. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuevo pincel visual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | El elemento XPS (Canvas, Path o Glyphs) para la propiedad Visual del pincel visual. |
| viewbox | java.awt.geom.Rectangle2D | La posición y dimensiones del contenido fuente del pincel. |
| área de visualización | java.awt.geom.Rectangle2D | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente repetidamente) aplica para rellenar la región a la que se aplica el pincel |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Devuelve el número del documento activo.

**Returns:**
int - El valor entero.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Devuelve el número de página activo dentro del documento activo.

**Returns:**
int - El valor entero.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentCount() {#getDocumentCount--}
```
public int getDocumentCount()
```


Devuelve el número de documentos dentro del paquete XPS.

**Returns:**
int - El número de documentos dentro del paquete XPS.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Obtiene el ticket de impresión del documento indexado por  documentIndex .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| documentIndex | int | Índice del documento cuyo ticket de impresión se debe devolver. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Devuelve el ticket de impresión del trabajo del documento.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Devuelve la instancia  XpsPage  de la página activa.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Devuelve el número de páginas en el documento activo.

**Returns:**
int - El número de páginas en el documento activo.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Obtiene el ticket de impresión de la página indexada por  pageIndex  en el documento indexado por  documentIndex .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| documentIndex | int | Índice del documento. |
| pageIndex | int | Índice de la página cuyo ticket de impresión se debe devolver. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Devuelve el número total de páginas en todos los documentos dentro del documento XPS.

**Returns:**
int - El número total de páginas en todos los documentos dentro del documento XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Obtiene el objeto que proporciona utilidades más allá de la API formal de manipulación XPS.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The utilities object.
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


Inserta un nuevo lienzo en la página activa en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un nuevo lienzo. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Inserta un documento vacío con tamaño de página predeterminado en la posición  index  y selecciona el documento insertado como activo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un documento. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Inserta un documento vacío con tamaño de página predeterminado en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un documento. |
| activar | boolean | Bandera que indica si se debe seleccionar el documento insertado como activo. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Inserta un documento vacío con las dimensiones de la primera página  width  y  height  en la posición  index  y selecciona el documento insertado como activo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un documento. |
| ancho | float | Ancho de la primera página. |
| altura | float | Altura de la primera página. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Inserta un documento vacío con las dimensiones de la primera página  width  y  height  en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un documento. |
| ancho | float | Ancho de la primera página. |
| altura | float | Altura de la primera página. |
| activar | boolean | Bandera que indica si se debe seleccionar el documento insertado como activo. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Inserta nuevos glifos en la página activa en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se deben insertar los nuevos glifos. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Recurso de fuente. |
| fontSize | float | Tamaño de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserta nuevos glifos en la página activa en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se deben insertar los nuevos glifos. |
| fontFamily | java.lang.String | Familia de fuente. |
| fontSize | float | Tamaño de fuente. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Estilo de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Inserta una página vacía en el documento con tamaño de página predeterminado en la posición  index  y selecciona la página insertada como activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar una página. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Inserta una página vacía en el documento con tamaño de página predeterminado en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar una página. |
| activar | boolean | Bandera que indica si se debe seleccionar la página insertada como activa. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Inserta una página en el documento en la posición  index  y selecciona la página insertada como activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe agregar una página. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Página a insertar. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Inserta una página en el documento en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe agregar una página. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Página a insertar. |
| activar | boolean | Bandera que indica si se debe seleccionar la página insertada como activa. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Inserta una página vacía en el documento con el  width  y  height  especificados en la posición  index  y selecciona la página insertada como activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar una página. |
| ancho | float | Ancho de una página nueva. |
| altura | float | Altura de una página nueva. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Inserta una página vacía en el documento con el  width  y  height  especificados en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar una página. |
| ancho | float | Ancho de una página nueva. |
| altura | float | Altura de una página nueva. |
| activar | boolean | Bandera que indica si se debe seleccionar la página insertada como activa. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserta una nueva ruta en la página activa en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar una nueva ruta. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Indica si la licencia del producto Aspose.Page for Java está accesada y es válida.

**Returns:**
boolean - valor booleano
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Fusionando varios archivos XPS en un documento XPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Archivos XPS para combinar con este documento. |
| outStream | java.io.OutputStream | El flujo de salida donde guardar los documentos XPS combinados. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Fusionando varios archivos XPS en un documento XPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Archivos XPS para combinar con este documento. |
| outXpsFilePath | java.lang.String | La ruta del archivo XPS de salida. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Fusionando documentos XPS a PDF usando la instancia  Device .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | La ruta del archivo PDF de salida. |
| filesForMerge | java.lang.String[] | Archivos XPS para combinar con este documento en un dispositivo de salida. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opciones de guardado del documento. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Fusionando documentos XPS a PDF usando la instancia  Device .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Archivos XPS para combinar con este documento en un dispositivo de salida. |
| pdfStream | java.io.OutputStream | El flujo de salida donde escribir el PDF resultante. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opciones de guardado del documento. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


Elimina un elemento en la posición  index  de la página activa.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe eliminar el elemento. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Elimina un documento en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe eliminar un documento. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Elimina una página del documento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Página a eliminar. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Elimina una página del documento en la posición  index .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe eliminar una página. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Guarda el documento usando la instancia  Device .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | La instancia del Device. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opciones de guardado del documento. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Guarda el documento XPS en un flujo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.OutputStream | Flujo del documento XPS donde se guardará. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Guarda el documento XPS en el archivo XPS ubicado en la ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | java.lang.String | Ubicación del documento. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Guarda el documento en un archivo de imagen. El directorio de salida y el nombre de archivo serán los mismos que del archivo XPS de entrada. La extensión del archivo corresponderá al formato de imagen en el parámetro "options". Si el documento se inicializó con un flujo que no es FileInputStream, el archivo de imagen se guardará en la carpeta actual con la plantilla de nombre de archivo predeterminada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opciones para guardar el documento en formato de imagen bitmap. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Guarda el documento en un archivo de imagen en el directorio especificado con el nombre de archivo especificado. La extensión del archivo corresponderá al formato de imagen en el parámetro "options".

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opciones para guardar el documento en formato de imagen bitmap. |
| outDir | java.lang.String | El directorio de salida donde se guardará el archivo de imagen. |
| fileNameTemplate | java.lang.String | Plantilla de nombre de archivo para la imagen (sin extensión). Si el archivo XPS de entrada tiene una sola página, será exactamente el nombre de archivo; de lo contrario, "\_[n]", donde "n" es el número de página a partir de 1, y se añadirá un sufijo a esto. La extensión del archivo corresponderá al formato de imagen en el parámetro "option". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Guarda el documento en formato de imagen bitmap como matrices de bytes.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opciones para guardar el documento en formato de imagen bitmap. |

**Returns:**
byte[][][] - Los arreglos de bytes de las imágenes resultantes. La primera dimensión es para documentos internos y la segunda para páginas dentro de los documentos internos.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Guarda el documento en formato PDF.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.OutputStream | El flujo donde escribir el archivo PDF de salida. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opciones para guardar el documento en formato PDF. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Guarda el documento en formato PDF.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | La ruta del archivo PDF de salida. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opciones para guardar el documento en formato PDF. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Guarda el documento en formato PS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.OutputStream | El flujo donde escribir el archivo PS de salida. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Opciones para guardar el documento en formato PS. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Guarda el documento en formato PostSscript.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsFilePath | java.lang.String | La ruta del archivo PostScript de salida. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Opciones para guardar el documento en formato PDF. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Selecciona un documento activo para editar.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| documentNumber | int | Un número de documento. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Selecciona una página de documento activa para editar.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pageNumber | int | Un número de página. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Vincula el  printTicket  al documento indexado por  documentIndex .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| documentIndex | int | Índice del documento al que enlazar el ticket de impresión. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | El ticket de impresión a enlazar. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Establece el ticket de impresión del trabajo del documento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | El ticket de impresión del trabajo del documento. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Vincula el  printTicket  a la página indexada por  pageIndex  en el documento indexado por  documentIndex .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| documentIndex | int | Índice del documento. |
| pageIndex | int | Índice de la página a la que enlazar el ticket de impresión. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | El ticket de impresión a enlazar. |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

