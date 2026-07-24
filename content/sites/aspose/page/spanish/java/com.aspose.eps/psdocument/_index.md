---
title: "PsDocument"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Esta clase encapsula documentos PS/EPS."
type: docs
weight: 16
url: /es/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Esta clase encapsula documentos PS/EPS.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PsDocument()](#PsDocument--) | Inicializa un PsDocument vacío con una página inicializada. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Inicializa un PsDocument vacío con una página inicializada. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Inicializa un PsDocument vacío con una página inicializada. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Inicializa un PsDocument vacío. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Inicializa un PsDocument vacío. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Inicializa un PsDocument vacío cuando se conoce de antemano el número de páginas del documento Postscript. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Inicializa un PsDocument vacío cuando se conoce de antemano el número de páginas del documento Postscript. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Inicializa un PsDocument con un archivo PS/EPS de entrada. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Inicializa un PsDocument con un flujo de archivo PS/EPS. |
## Métodos

| Método | Descripción |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Añade recorte al estado gráfico actual. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Añade recorte al estado gráfico actual y luego escribe el operador "newpath". |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Añade un rectángulo de recorte al estado gráfico actual. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Añade recorte a partir del contorno del texto dado en la fuente especificada. |
| [closePage()](#closePage--) | Completa la página actual. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Convierte la fuente Type 1 a TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Convierte la fuente Type 3 a TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Convierte la fuente Type 3 a TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Recorta el PsDocument dado como archivo EPS. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Dibuja una ruta arbitraria. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Dibuja una imagen enmascarada. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Dibuja una imagen. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Dibuja una imagen transformada con fondo. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Dibuja una imagen transparente transformada con fondo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Lee el archivo EPS y extrae el cuadro delimitador de la imagen EPS del comentario %%BoundingBox o los límites del tamaño de página predeterminado (0, 0, 595, 842) si no existe. |
| [extractEpsSize()](#extractEpsSize--) | Lee el archivo EPS y extrae el tamaño de la imagen EPS del comentario %%BoundingBox o del tamaño de página predeterminado (595, 842) si no existe. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Extrae texto del archivo PS. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Rellena una ruta arbitraria. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Añade una cadena de texto rellenando el interior de los glifos. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Añade una cadena de texto rellenando el interior de los glifos. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Añade una cadena de texto rellenando el interior de los glifos. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Añade una cadena de texto rellenando el interior de los glifos. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Añade una cadena de texto rellenando el interior de los glifos. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Añade una cadena de texto rellenando el interior de los glifos. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Añade una cadena de texto rellenando el interior de los glifos. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Añade una cadena de texto rellenando el interior de los glifos. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Obtiene la cantidad de páginas en el documento PDF resultante. |
| [getPaint()](#getPaint--) | Obtiene la pintura en el estado gráfico actual. |
| [getStroke()](#getStroke--) | Obtiene el trazo en el estado gráfico actual. |
| [getXmpMetadata()](#getXmpMetadata--) | Lee el archivo PS/EPS y extrae XmpMetdata si ya existe o agrega uno nuevo si no existe. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Indica si la licencia del producto Aspose.Page for Java está accesada y es válida. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Fusiona archivos PS/EPS a un dispositivo. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Fusiona archivos PS/EPS a un dispositivo. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Fusiona archivos PS/EPS a un dispositivo. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Crea una nueva página y la establece como actual. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Crea una nueva página con el tamaño del documento y la establece como actual. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Añade una cadena de texto dibujando los contornos de los glifos. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Añade una cadena de texto dibujando los contornos de los glifos. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Añade una cadena de texto dibujando los contornos de los glifos. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Añade una cadena de texto dibujando los contornos de los glifos. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Añade una cadena de texto dibujando los contornos de los glifos. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Añade una cadena de texto dibujando los contornos de los glifos. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Añade una cadena de texto dibujando los contornos de los glifos. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Añade una cadena de texto dibujando los contornos de los glifos. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Redimensiona el PsDocument dado como archivo EPS. |
| [rotate(float angleRadians)](#rotate-float-) | Añade una rotación en sentido antihorario alrededor del origen al estado gráfico actual (rotar la matriz actual). |
| [rotate(int angleDegrees)](#rotate-int-) | Añade una rotación en sentido antihorario alrededor del origen al estado gráfico actual (rotar la matriz actual). |
| [save()](#save--) | Guarda el PsDocument dado como archivo PS o EPS. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Guarda el archivo PS/EPS en un dispositivo. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Guarda el PsDocument dado en el flujo. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Guarda el PsDocument dado como archivo EPS. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Guarda el archivo PS/EPS en un archivo de imagen. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Guarda el archivo PS/EPS en un archivo de imagen en el directorio especificado con el nombre de archivo especificado. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Guarda el archivo PS/EPS en matrices de bytes de imágenes. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Guarda el archivo PS/EPS en un flujo PDF de salida. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Guarda el archivo PS/EPS en un archivo PDF. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Guarda el objeto BufferedImage en un archivo EPS. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Guarda el objeto BufferedImage en un archivo EPS. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Guarda la imagen PNG/JPEG/BMP/GIF desde el flujo de entrada al flujo de salida EPS. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Guarda la imagen PNG/JPEG/BMP/GIF desde un archivo en un archivo EPS. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Añade escala al estado gráfico actual (escalar la matriz actual). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Especifica un flujo de entrada. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Establece los parámetros del dispositivo de página (ver el operador "setpagedevice" en la especificación PostScript). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Establece el tamaño de página. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Establece la pintura en el estado gráfico actual. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Establece el trazo en el estado gráfico actual. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Establece la transformación actual a esta. |
| [shear(float shx, float shy)](#shear-float-float-) | Añade una transformación de cizallamiento al estado gráfico actual (cizallar la matriz actual). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Añade una transformación al estado gráfico actual (concatena esta matriz con la actual). |
| [translate(float x, float y)](#translate-float-float-) | Añade una traslación al estado gráfico actual (trasladar la matriz actual). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Escribe la restauración del estado gráfico actual (ver la especificación PostScript del operador "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Escribe el guardado del estado gráfico actual (ver la especificación PostScript del operador "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Inicializa un PsDocument vacío con una página inicializada. Este constructor se usa solo para operaciones adicionales que no están relacionadas con archivos PostScript, por ejemplo, la conversión de fuentes.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Inicializa un PsDocument vacío con una página inicializada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsFilePath | java.lang.String | La ruta del archivo PS/EPS de salida. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Inicializa un PsDocument vacío con una página inicializada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flujo donde guardar el archivo PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Inicializa un PsDocument vacío.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsFilePath | java.lang.String | La ruta del archivo PS/EPS de salida. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |
| multipaged | boolean | Si es false, la página no se inicializará. En este caso, la inicialización de la página debe realizarse mediante una llamada explícita "openPage(width, height)". |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Inicializa un PsDocument vacío.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flujo donde guardar el archivo PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |
| multipaged | boolean | Si es false, la página no se inicializará. En este caso, la inicialización de la página debe realizarse mediante una llamada explícita "openPage(width, height)". |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Inicializa un PsDocument vacío cuando se conoce de antemano el número de páginas del documento Postscript.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsFilePath | java.lang.String | La ruta del archivo PS/EPS de salida. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |
| numberOfPages | int | El número de páginas en el documento PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Inicializa un PsDocument vacío cuando se conoce de antemano el número de páginas del documento Postscript.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flujo donde guardar el archivo PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |
| numberOfPages | int | El número de páginas en el documento PostScript. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Inicializa un PsDocument con un archivo PS/EPS de entrada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| psFilePath | java.lang.String | Ruta del archivo PS/EPS. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Inicializa un PsDocument con un flujo de archivo PS/EPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| psStream | java.io.InputStream | Flujo del archivo PS/EPS. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Añade recorte al estado gráfico actual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| s | java.awt.Shape | La ruta de recorte. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Agrega recorte al estado gráfico actual y luego escribe el operador "newpath". Es necesario hacerlo para evitar la confluencia de esta ruta de recorte y algunas rutas posteriores, como los glifos delineados con el operador "charpath".

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| s | java.awt.Shape | La ruta de recorte. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Añade un rectángulo de recorte al estado gráfico actual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | El rectángulo de recorte. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Añade recorte a partir del contorno del texto dado en la fuente especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto. |
| font | java.awt.Font | La fuente. |
| x | float | Una coordenada X de la posición del texto. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Completa la página actual.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Convierte la fuente Type 1 a TrueType. El nombre del archivo de fuente TTF convertido será el mismo que la fuente Type 1 de entrada con la extensión ".ttf". El archivo TTF se guardará en el directorio de salida asignado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | La ruta del archivo de fuente Type 1.. |
| outputDir | java.lang.String | Directorio de salida donde guardar la fuente TrueType resultante. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Convierte la fuente Type 3 a TrueType. El archivo TTF se guardará en el flujo de salida proporcionado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | La ruta del archivo de fuente Type 3. |
| outputStream | java.io.OutputStream | Flujo de salida donde guardar la fuente TrueType resultante. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Convierte la fuente Type 3 a TrueType. El nombre del archivo de fuente TTF convertido será el mismo que la fuente Type 3 de entrada con la extensión ".ttf". El archivo TTF se guardará en el directorio de salida asignado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | La ruta del archivo de fuente Type 3.. |
| outputDir | java.lang.String | Directorio de salida donde guardar la fuente TrueType resultante. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Recorta el PsDocument dado como archivo EPS. Guarda el archivo EPS inicial con el %%BoundingBox existente actualizado o se creará uno nuevo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | La caja de recorte (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Dibuja una ruta arbitraria.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| shape | java.awt.Shape | La ruta a rellenar. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Dibuja una imagen enmascarada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | La imagen a dibujar. Debe estar en formato de imagen RGB de 24 bpp. |
| alphaMask1bpp | java.awt.image.BufferedImage | La máscara de imagen. Debe estar en formato de imagen de 1 bpp. |
| transform | java.awt.geom.AffineTransform | La matriz para transformar la imagen. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Dibuja una imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagen | java.awt.image.BufferedImage | La imagen a dibujar. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Dibuja una imagen transformada con fondo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagen | java.awt.image.BufferedImage | La imagen a dibujar. |
| transform | java.awt.geom.AffineTransform | La matriz para transformar la imagen. |
| bkg | java.awt.Color | El fondo para la imagen. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Dibuja la imagen transparente transformada con fondo. Si la imagen no tiene canal alfa, se dibujará como una imagen opaca.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagen | java.awt.image.BufferedImage | La imagen a dibujar. |
| transform | java.awt.geom.AffineTransform | La matriz para transformar la imagen. |
| transparencyThreshold | int | Un umbral que define a partir de qué valor de transparencia el píxel se interpretará como completamente transparente. Todos los valores por debajo de este umbral se interpretarán como completamente opacos. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Lee el archivo EPS y extrae el cuadro delimitador de la imagen EPS del comentario %%BoundingBox o los límites del tamaño de página predeterminado (0, 0, 595, 842) si no existe.

**Returns:**
int[] - La caja delimitadora de la imagen EPS.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Lee el archivo EPS y extrae el tamaño de la imagen EPS del comentario %%BoundingBox o del tamaño de página predeterminado (595, 842) si no existe.

**Returns:**
java.awt.Dimension - El tamaño de la imagen EPS.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Extrae texto de un archivo PS. Solo funciona para texto escrito con fuentes TrueType (Tipo 42) o fuentes compuestas (Tipo 0) que consisten en fuentes TrueType.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Las opciones de guardado. |
| startPage | int | La página desde la cual, inclusive, comenzar a extraer texto. |
| endPage | int | La página hasta la cual, inclusive, extraer texto. |

**Returns:**
java.lang.String - El texto contenido en las páginas seleccionadas del archivo PS.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Rellena una ruta arbitraria.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| shape | java.awt.Shape | La ruta a rellenar. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fillPaint | java.awt.Paint | El relleno usado para pintar el interior de los glifos. |
| strokePaint | java.awt.Paint | El  java.awt.Paint  usado para pintar los contornos de los glifos. Puede ser cualquier subclase de la clase  java.awt.Paint  en el JDK. |
| stroke | java.awt.Stroke | El trazo usado para dibujar los contornos de los glifos. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fillPaint | java.awt.Paint | El relleno usado para pintar el interior de los glifos. |
| strokePaint | java.awt.Paint | El  java.awt.Paint  usado para pintar los contornos de los glifos. Puede ser cualquier subclase de la clase  java.awt.Paint  en el JDK. |
| stroke | java.awt.Stroke | El trazo usado para dibujar los contornos de los glifos. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. advances Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| advances | float[] |  |
| font | java.awt.Font | Fuente del sistema que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fillPaint | java.awt.Paint | El relleno usado para pintar el interior de los glifos. |
| strokePaint | java.awt.Paint | El  java.awt.Paint  usado para pintar los contornos de los glifos. Puede ser cualquier subclase de la clase  java.awt.Paint  en el JDK. |
| stroke | java.awt.Stroke | El trazo usado para dibujar los contornos de los glifos. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| font | java.awt.Font | Fuente del sistema que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fillPaint | java.awt.Paint | El relleno usado para pintar el interior de los glifos. |
| strokePaint | java.awt.Paint | El  java.awt.Paint  usado para pintar los contornos de los glifos. Puede ser cualquier subclase de la clase  java.awt.Paint  en el JDK. |
| stroke | java.awt.Stroke | El trazo usado para dibujar los contornos de los glifos. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Añade una cadena de texto rellenando el interior de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Añade una cadena de texto rellenando el interior de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fill | java.awt.Paint | El relleno usado para pintar los glifos. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Añade una cadena de texto rellenando el interior de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Añade una cadena de texto rellenando el interior de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fill | java.awt.Paint | El relleno usado para pintar los glifos. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Añade una cadena de texto rellenando el interior de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| font | java.awt.Font | Fuente del sistema que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Añade una cadena de texto rellenando el interior de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| font | java.awt.Font | La fuente que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fill | java.awt.Paint | El relleno usado para pintar los glifos. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Añade una cadena de texto rellenando el interior de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| font | java.awt.Font | Fuente del sistema que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Añade una cadena de texto rellenando el interior de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| font | java.awt.Font | La fuente que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fill | java.awt.Paint | El relleno usado para pintar los glifos. |

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getNumberOfPages() {#getNumberOfPages--}
```
public int getNumberOfPages()
```


Obtiene la cantidad de páginas en el documento PDF resultante.

**Returns:**
int - el número de páginas.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Obtiene la pintura en el estado gráfico actual.

**Returns:**
java.awt.Paint - Pintura actual.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Obtiene el trazo en el estado gráfico actual.

**Returns:**
java.awt.Stroke - Trazo actual.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Lee el archivo PS/EPS y extrae XmpMetdata si ya existe o agrega uno nuevo si no existe.

**Returns:**
[XmpMetadata](../../com.aspose.eps.xmp/xmpmetadata) - existing or new instance of XMP metadata.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Indica si la licencia del producto Aspose.Page for Java está accesada y es válida.

**Returns:**
boolean - valor booleano
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Fusiona archivos PS/EPS a un dispositivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Archivos PS/EPS para combinar con este archivo a un dispositivo de salida. |
| device | [Device](../../com.aspose.page/device) | Un dispositivo de salida. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contiene indicadores que especifican la salida de errores generados durante la conversión. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Fusiona archivos PS/EPS a un dispositivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Un flujo PDF de salida. |
| filesForMerge | java.lang.String[] | Archivos PS/EPS para combinar con este archivo a un dispositivo de salida. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contiene indicadores que especifican la salida de errores generados durante la conversión. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Fusiona archivos PS/EPS a un dispositivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Una ruta de archivo PDF de salida. |
| filesForMerge | java.lang.String[] | Archivos PS/EPS para combinar con este archivo a un dispositivo de salida. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contiene indicadores que especifican la salida de errores generados durante la conversión. |

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
public void openPage(float width, float height)
```


Crea una nueva página y la establece como actual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | El ancho de la nueva página. |
| altura | float | La altura de la nueva página. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Crea una nueva página con el tamaño del documento y la establece como actual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pageName | java.lang.String | El nombre de la nueva página. Si es nulo, el nombre de la página será un número de orden de la página. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Añade una cadena de texto dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Añade una cadena de texto dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| outlinePaint | java.awt.Paint | El  java.awt.Paint  usado para pintar los contornos de los glifos. Puede ser cualquier subclase de la clase  java.awt.Paint  en el JDK. |
| stroke | java.awt.Stroke | El trazo usado para dibujar los contornos de los glifos. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Añade una cadena de texto dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Añade una cadena de texto dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que se encuentre en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| outlinePaint | java.awt.Paint | El  java.awt.Paint  usado para pintar los contornos de los glifos. Puede ser cualquier subclase de la clase  java.awt.Paint  en el JDK. |
| stroke | java.awt.Stroke | El trazo usado para dibujar los contornos de los glifos. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Añade una cadena de texto dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| font | java.awt.Font | Fuente del sistema que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Añade una cadena de texto dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| advances | float[] | Una matriz del ancho de los glifos. Su longitud debe coincidir con el número de glifos en la cadena. |
| font | java.awt.Font | La fuente que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| outlinePaint | java.awt.Paint | El  java.awt.Paint  usado para pintar los contornos de los glifos. Puede ser cualquier subclase de la clase  java.awt.Paint  en el JDK. |
| stroke | java.awt.Stroke | El trazo usado para dibujar los contornos de los glifos. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Añade una cadena de texto dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| font | java.awt.Font | Fuente del sistema que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Añade una cadena de texto dibujando los contornos de los glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | El texto a añadir. |
| font | java.awt.Font | La fuente que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| outlinePaint | java.awt.Paint | El  java.awt.Paint  usado para pintar los contornos de los glifos. Puede ser cualquier subclase de la clase  java.awt.Paint  en el JDK. |
| stroke | java.awt.Stroke | El trazo usado para dibujar los contornos de los glifos. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Redimensiona el PsDocument dado como archivo EPS. Este método se usa solo después de extraer el tamaño EPS. Guarda el archivo EPS inicial con el %%BoundingBox existente actualizado o se creará uno nuevo. También se establecerá la matriz de transformación de la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Nuevo tamaño de la imagen EPS en unidades asignadas. |
| units | [Units](../../com.aspose.page/units) | Las unidades del nuevo tamaño. Pueden ser puntos, pulgadas, milímetros, centímetros y porcentajes del tamaño inicial. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Añade una rotación en sentido antihorario alrededor del origen al estado gráfico actual (rotar la matriz actual).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| angleRadians | float | El ángulo de rotación en radianes. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Añade una rotación en sentido antihorario alrededor del origen al estado gráfico actual (rotar la matriz actual).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| angleDegrees | int | El ángulo de rotación en grados. |

### save() {#save--}
```
public void save()
```


Guarda el PsDocument dado como archivo PS o EPS. Este método se usa solo cuando el PsDocument fue creado desde cero.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Guarda el archivo PS/EPS en un dispositivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Un dispositivo de salida. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contiene indicadores que especifican la salida de errores generados durante la conversión. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Guarda el PsDocument dado en el flujo. Este método se usa solo después de actualizar los metadatos XMP. Guarda el archivo EPS inicial con los metadatos existentes actualizados o crea uno nuevo al llamar al método getMetadata. En el último caso se añaden todo el código PostScript necesario y los comentarios EPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Flujo del archivo EPS de salida. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Guarda el PsDocument dado como archivo EPS. Este método se usa solo después de actualizar los metadatos XMP. Guarda el archivo EPS inicial con los metadatos existentes actualizados o crea uno nuevo al llamar al método getMetadata. En el último caso se añaden todo el código PostScript necesario y los comentarios EPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Una ruta de archivo EPS de salida.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Guarda el archivo PS/EPS en un archivo de imagen. El directorio de salida y el nombre del archivo serán los mismos que del archivo PS de entrada. La extensión del archivo corresponderá al formato de imagen en el parámetro "options". Si el documento se inicializó con un flujo que no proviene de FileInputStream, el archivo de imagen se guardará en la carpeta actual con la plantilla de nombre de archivo predeterminada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contiene los parámetros necesarios para guardar la imagen y banderas que especifican la salida de errores generados durante la conversión. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Guarda el archivo PS/EPS en un archivo de imagen en el directorio especificado con el nombre de archivo especificado. La extensión del archivo corresponderá al formato de imagen en el parámetro "options".

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contiene los parámetros necesarios para guardar la imagen y banderas que especifican la salida de errores generados durante la conversión. |
| outDir | java.lang.String | El directorio de salida donde se guardará el archivo de imagen. |
| fileNameTemplate | java.lang.String | La plantilla de nombre de archivo para la imagen (sin extensión). Si el archivo PS/EPS de entrada tiene una sola página, será exactamente el nombre del archivo; de lo contrario, "\_[n]", donde "n" es el número de página comenzando desde 0, se añadirá un sufijo a esto. La extensión del archivo corresponderá al formato de imagen en el parámetro "option". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Guarda el archivo PS/EPS en matrices de bytes de imágenes.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contiene los parámetros necesarios para guardar la imagen y banderas que especifican la salida de errores generados durante la conversión. |

**Returns:**
byte[][] - Bytes de imágenes. Un arreglo de bytes por página.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Guarda el archivo PS/EPS en un flujo PDF de salida.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Un flujo PDF de salida. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Contiene indicadores que especifican la salida de errores generados durante la conversión. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Guarda el archivo PS/EPS en un archivo PDF.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Una ruta de archivo PDF de salida. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Contiene indicadores que especifican la salida de errores generados durante la conversión. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Guarda el objeto BufferedImage en un archivo EPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagen | java.awt.image.BufferedImage | La Imagen. |
| epsStream | java.io.OutputStream | Flujo de salida EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contiene parámetros que especifican la salida de errores generados durante la conversión. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Guarda el objeto BufferedImage en un archivo EPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagen | java.awt.image.BufferedImage | La Imagen. |
| epsFilePath | java.lang.String | Ruta del archivo EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contiene parámetros que especifican la salida de errores generados durante la conversión. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Guarda la imagen PNG/JPEG/BMP/GIF desde el flujo de entrada al flujo de salida EPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageStream | java.io.InputStream | Flujo de entrada de imagen. |
| epsStream | java.io.OutputStream | Flujo de salida EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contiene parámetros que especifican la salida de errores generados durante la conversión. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Guarda la imagen PNG/JPEG/BMP/GIF desde un archivo en un archivo EPS.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFilePath | java.lang.String | Ruta del archivo de imagen. |
| epsFilePath | java.lang.String | Ruta del archivo EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contiene parámetros que especifican la salida de errores generados durante la conversión. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Añade escala al estado gráfico actual (escalar la matriz actual).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| xScale | float | La escala en el eje X. |
| yScale | float | La escala en el eje Y. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Especifica un flujo de entrada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| is | java.io.InputStream | Flujo de entrada del archivo PS/EPS. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Establece los parámetros del dispositivo de página (ver el operador "setpagedevice" en la especificación PostScript). Entre ellos pueden estar el tamaño de página y el color, etc.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Parámetros de la página. En este diccionario pueden estar el tamaño de página y el color, etc. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Establece el tamaño de página. Para crear páginas con diferentes tamaños en un mismo documento, use el método  setPageDevice  justo después de este método.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | El ancho de la página en el archivo PostScript resultante. |
| altura | float | La altura de la página en el archivo PostScript resultante. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Establece la pintura en el estado gráfico actual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| paint | java.awt.Paint | El paint. Puede ser cualquier subclase de la clase  Paint  que exista en el JDK. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Establece el trazo en el estado gráfico actual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| stroke | java.awt.Stroke | El trazo. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Establece la transformación actual a esta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | La transformación. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Añade una transformación de cizallamiento al estado gráfico actual (cizallar la matriz actual).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| shx | float | El sesgo en el eje X. |
| shy | float | El sesgo en el eje Y. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(AffineTransform matrix) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform matrix)
```


Añade una transformación al estado gráfico actual (concatena esta matriz con la actual).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | La transformación. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Añade una traslación al estado gráfico actual (trasladar la matriz actual).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | La traslación en la dirección X. |
| y | float | La traslación en la dirección Y. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Escribe la restauración del estado gráfico actual (ver la especificación PostScript del operador "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Escribe el guardado del estado gráfico actual (ver la especificación PostScript del operador "gsave").

