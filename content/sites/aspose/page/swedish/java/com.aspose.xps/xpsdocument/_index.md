---
title: "XpsDocument"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in huvudobjektet i XPS-dokumentet och tillhandahåller manipuleringsmetoder för alla XPS-element."
type: docs
weight: 19
url: /sv/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Klass som kapslar in huvudobjektet i XPS-dokumentet och tillhandahåller manipuleringsmetoder för alla XPS-element.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Skapar ett tomt XPS-dokument med standard sidstorlek. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Öppnar ett befintligt XPS-dokument som finns på sökvägen . |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Laddar ett befintligt dokument som lagras i  stream  som XPS-dokument. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Lägger till ett innehållselement (Canvas, Path eller Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Infogar ett element (Canvas, Path eller Glyphs) på den aktiva sidan vid position  index . |
| [<T>remove(T element)](#-T-remove-T-) | Tar bort ett element från den aktiva sidan. |
| [addCanvas()](#addCanvas--) | Lägger till en ny canvas på den aktiva sidan. |
| [addDocument()](#addDocument--) | Lägger till ett tomt dokument med standard sidstorlek och markerar det tillagda dokumentet som aktivt. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Lägger till ett tomt dokument med standard sidstorlek. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Lägger till ett tomt dokument med den första sidans dimensioner  width  och  height  och markerar det tillagda dokumentet som aktivt. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Lägger till ett tomt dokument med den första sidans dimensioner  width  och  height . |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Lägger till nya glyphs på den aktiva sidan. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Lägger till nya glyphs på den aktiva sidan. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Lägger till en konturpost i dokumentet. |
| [addPage()](#addPage--) | Lägger till en tom sida i dokumentet med standard sidstorlek. |
| [addPage(boolean activate)](#addPage-boolean-) | Lägger till en tom sida i dokumentet med standard sidstorlek. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Lägger till en sida i dokumentet och markerar den tillagda sidan som aktiv. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Lägger till en sida i dokumentet. |
| [addPage(float width, float height)](#addPage-float-float-) | Lägger till en tom sida i dokumentet med angiven  width  och  height . |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Lägger till en tom sida i dokumentet med angiven  width  och  height . |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Lägger till en ny path på den aktiva sidan. |
| [close()](#close--) | Avslutar instansen. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Skapar ett nytt streckat elliptiskt bågsegment. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Skapar ett nytt elliptiskt bågsegment. |
| [createCanvas()](#createCanvas--) | Skapar en ny canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Skapar en ny färg i ICC-baserad färgrymd. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Skapar en ny färg i scRGB-färgrymden. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Skapar en ny färg i scRGB-färgrymden. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Skapar en ny färg i sRGB-färgrymden. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Skapar en ny färg i sRGB-färgrymden. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Skapar en ny färg. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Skapar en ny färg i ICC-baserad färgrymd. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Skapar en ny TrueType-typsnittresurs från stream. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Skapar en ny TrueType-typsnittresurs. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Skapar nya glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Skapar nya glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Skapar ett nytt gradientstopp. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Skapar ett nytt gradientstopp. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Skapar en ny ICC-profilresurs från  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Skapar en ny ICC-profilresurs från ICC-profilfilen som finns på  iccProfilePath . |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Skapar en ny bildresurs från  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Skapar en ny bildresurs från bildfilen som finns på  imagePath . |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Skapar en ny bildpensel. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Skapar en ny bildpensel. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Skapar en ny linjär gradientpensel. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Skapar en ny linjär gradientpensel. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Skapar en ny affin transformationsmatris. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Skapar en ny bana. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Skapar en ny öppen path‑figur. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Skapar en ny banfigur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Skapar en ny öppen path‑figur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Skapar en ny banfigur. |
| [createPathGeometry()](#createPathGeometry--) | Skapar en ny bangeometri. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Skapar en ny bangeometri specificerad med förkortad form. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Skapar en ny bangeometri med en specificerad lista av banfigurer. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Skapar en ny uppsättning streckade kubiska B?bezier‑kurvor. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Skapar en ny uppsättning kubiska B?bezier‑kurvor. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Skapar en ny streckad polygonritning som innehåller ett godtyckligt antal enskilda hörn. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Skapar en ny polygonritning som innehåller ett godtyckligt antal enskilda hörn. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Skapar en ny uppsättning av strokade kvadratiska B?zier-kurvor från föregående punkt i sökvägsfiguren genom en uppsättning hörn, med angivna kontrollpunkter. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Skapar en ny uppsättning av kvadratiska B?zier-kurvor från föregående punkt i sökvägsfiguren genom en uppsättning hörn, med angivna kontrollpunkter. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Skapar en ny radiell gradientpensel. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Skapar en ny radiell gradientpensel. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Skapar en ny solid färgpensel. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Skapar en ny solid färgpensel. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Skapar en ny visuell pensel. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | Returnerar det aktiva dokumentets nummer. |
| [getActivePage()](#getActivePage--) | Returnerar det aktiva sidnumret i det aktiva dokumentet. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Returnerar antalet dokument i XPS-paketet. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Hämtar utskriftsbiljetten för dokumentet som indexeras med  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Returnerar dokumentets jobbutskriftsbiljett. |
| [getPage()](#getPage--) | Returnerar  XpsPage  instansen för aktiv sida. |
| [getPageCount()](#getPageCount--) | Returnerar antalet sidor i det aktiva dokumentet. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Hämtar utskriftsbiljetten för sidan som indexeras med  pageIndex  i dokumentet som indexeras med  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Returnerar det totala antalet sidor i alla dokument i XPS-dokumentet. |
| [getUtils()](#getUtils--) | Hämtar objektet som tillhandahåller verktyg utöver det formella XPS-manipulerings‑API:et. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Infogar en ny canvas till den aktiva sidan vid  index  position. |
| [insertDocument(int index)](#insertDocument-int-) | Infogar ett tomt dokument med standard sidstorlek vid  index  position och markerar infogat dokument som aktivt. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Infogar ett tomt dokument med standard sidstorlek vid  index  position. |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Infogar ett tomt dokument med den första sidans dimensioner  width  och  height  vid  index  position och markerar det infogade dokumentet som aktivt. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Infogar ett tomt dokument med den första sidans dimensioner  width  och  height  vid  index  position. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Infogar nya glyfer till den aktiva sidan vid  index  position. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Infogar nya glyfer till den aktiva sidan vid  index  position. |
| [insertPage(int index)](#insertPage-int-) | Infogar en tom sida till dokumentet med standard sidstorlek vid  index  position och markerar den infogade sidan som aktiv. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Infogar en tom sida till dokumentet med standard sidstorlek vid  index  position. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Infogar en sida till dokumentet vid  index  position och markerar den infogade sidan som aktiv. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Infogar en sida till dokumentet vid  index  position. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Infogar en tom sida till dokumentet med angiven  width  och  height  vid  index  position och markerar den infogade sidan som aktiv. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Infogar en tom sida till dokumentet med angiven  width  och  height  vid  index  position. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Infogar en ny sökväg till den aktiva sidan vid  index  position. |
| [isLicensed()](#isLicensed--) | Indikerar om licensen för Aspose.Page för Java-produkten är åtkomlig och giltig. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Sammanfogar flera XPS-filer till ett XPS-dokument. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Sammanfogar flera XPS-filer till ett XPS-dokument. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Sammanfogar XPS-dokument till PDF med hjälp av  Device  -instansen. |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Sammanfogar XPS-dokument till PDF med hjälp av  Device  -instansen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Tar bort ett element vid  index  position från den aktiva sidan. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Tar bort ett dokument vid  index  position. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Tar bort en sida från dokumentet. |
| [removePageAt(int index)](#removePageAt-int-) | Tar bort en sida från dokumentet vid  index  position. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Sparar dokumentet med  Device  instansen. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Sparar XPS-dokument till ström. |
| [save(String path)](#save-java.lang.String-) | Sparar XPS-dokument till XPS-filen som finns på  path . |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Sparar dokumentet till bildfil. Utdata katalogen och filnamnet kommer att vara samma som från inmatnings‑XPS‑filen. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Sparar dokumentet till bildfil i den angivna katalogen med det angivna filnamnet. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Sparar dokumentet i bitmap-bildformat som byte‑arrayer. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Sparar dokumentet i PDF-format. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Sparar dokumentet i PDF-format. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Sparar dokumentet i PS-format. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Sparar dokumentet i PostScript-format. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Väljer ett aktivt dokument för redigering. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Väljer en aktiv dokumentsida för redigering. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Länkar  printTicket  till dokumentet indexerat med  documentIndex . |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Ställer in dokumentets jobb‑utskriftsticket. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Länkar  printTicket  till sidan indexerad med  pageIndex  i dokumentet indexerat med  documentIndex . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Skapar ett tomt XPS-dokument med standard sidstorlek.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Öppnar ett befintligt XPS-dokument som finns på sökvägen .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sökväg | java.lang.String | Plats för dokumentet. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Laddar ett befintligt dokument som lagras i  stream  som XPS-dokument.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.InputStream | Dokumentström. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Alternativ för dokumentladdning. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Lägger till ett innehållselement (Canvas, Path eller Glyphs)

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| element | T | Elementet att lägga till. |

**Returns:**
T - Tillagt element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Infogar ett element (Canvas, Path eller Glyphs) på den aktiva sidan vid position  index .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett  element  ska infogas. |
| element | T | Elementet att infoga. |

**Returns:**
T - Infogat element.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Tar bort ett element från den aktiva sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| element | T | Elementet att ta bort. |

**Returns:**
T - Borttaget element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Lägger till en ny canvas på den aktiva sidan.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Lägger till ett tomt dokument med standard sidstorlek och markerar det tillagda dokumentet som aktivt.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Lägger till ett tomt dokument med standard sidstorlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| aktivera | boolean | Flagga som indikerar om det tillagda dokumentet ska väljas som aktivt. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Lägger till ett tomt dokument med den första sidans dimensioner  width  och  height  och markerar det tillagda dokumentet som aktivt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float | Bredd på den första sidan. |
| height | float | Höjd på den första sidan. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Lägger till ett tomt dokument med den första sidans dimensioner  width  och  height .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float | Bredd på den första sidan. |
| height | float | Höjd på den första sidan. |
| aktivera | boolean | Flagga som indikerar om det tillagda dokumentet ska väljas som aktivt. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Lägger till nya glyphs på den aktiva sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Typsnittresurs. |
| fontRenderingEmSize | float | Typsnittsstorlek. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Lägger till nya glyphs på den aktiva sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontFamily | java.lang.String | Typsnittsfamilj. |
| fontRenderingEmSize | float | Typsnittsstorlek. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckenstil. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Lägger till en konturpost i dokumentet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| description | java.lang.String | Postens beskrivning. |
| outlineLevel | int | Innehållsnivån. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Ingångsmålet. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Lägger till en tom sida i dokumentet med standard sidstorlek.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Lägger till en tom sida i dokumentet med standard sidstorlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| aktivera | boolean | Flagga som indikerar om den tillagda sidan ska väljas som aktiv. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Lägger till en sida i dokumentet och markerar den tillagda sidan som aktiv.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Sida som ska läggas till. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Lägger till en sida i dokumentet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Sida som ska läggas till. |
| aktivera | boolean | Flagga som indikerar om den tillagda sidan ska väljas som aktiv. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Lägger till en tom sida i dokumentet med angiven  width  och  height .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float | Bredd på en ny sida. |
| height | float | Höjd på en ny sida. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Lägger till en tom sida i dokumentet med angiven  width  och  height .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float | Bredd på en ny sida. |
| height | float | Höjd på en ny sida. |
| aktivera | boolean | Flagga som indikerar om den tillagda sidan ska väljas som aktiv. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Lägger till en ny path på den aktiva sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Avslutar instansen.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Skapar ett nytt streckat elliptiskt bågsegment.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkt | java.awt.geom.Point2D | Slutpunkten för den elliptiska bågen. |
| size | java.awt.geom.Dimension2D | x- och y-radien för den elliptiska bågen som ett x,y-par. |
| rotationAngle | float | Anger hur ellipsen är roterad i förhållande till det aktuella koordinatsystemet. |
| isLargeArc | boolean | Bestämmer om bågen ritas med en svepning på 180 grader eller mer. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Riktningen som bågen ritas i. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Skapar ett nytt elliptiskt bågsegment.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkt | java.awt.geom.Point2D | Slutpunkten för den elliptiska bågen. |
| size | java.awt.geom.Dimension2D | x- och y-radien för den elliptiska bågen som ett x,y-par. |
| rotationAngle | float | Anger hur ellipsen är roterad i förhållande till det aktuella koordinatsystemet. |
| isLargeArc | boolean | Bestämmer om bågen ritas med en svepning på 180 grader eller mer. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Riktningen som bågen ritas i. |
| isStroked | boolean | Anger om strecket för detta segment av sökvägen ritas. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Skapar en ny canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Skapar en ny färg i ICC-baserad färgrymd.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC-profilresursen. |
| komponenter | float[] | Färgkomponenter. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Skapar en ny färg i scRGB-färgrymden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| r | float | Den röda färgkomponenten. |
| g | float | Den gröna färgkomponenten. |
| b | float | Den blå färgkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Skapar en ny färg i scRGB-färgrymden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| en | float | Alfa-färgkomponenten. |
| r | float | Den röda färgkomponenten. |
| g | float | Den gröna färgkomponenten. |
| b | float | Den blå färgkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Skapar en ny färg i sRGB-färgrymden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| r | int | Den röda färgkomponenten. |
| g | int | Den gröna färgkomponenten. |
| b | int | Den blå färgkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Skapar en ny färg i sRGB-färgrymden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| en | int | Alfa-färgkomponenten. |
| r | int | Den röda färgkomponenten. |
| g | int | Den gröna färgkomponenten. |
| b | int | Den blå färgkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Skapar en ny färg.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | java.awt.Color | En inbyggd färginstans för RGB-färg. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Skapar en ny färg i ICC-baserad färgrymd.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sökväg | java.lang.String | Sökvägen till ICC-profilen. |
| komponenter | float[] | Färgkomponenter. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Skapar en ny TrueType-typsnittresurs från stream.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.InputStream | Strömmen som innehåller ICC-profilen att använda som en resurs. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Skapar en ny TrueType-typsnittresurs.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontFamily | java.lang.String | Teckensnittsfamiljen. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckensnittsstilen. Se XpsFont-klassens konstanter (som är bitflaggor) för värden som kan kombineras. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Skapar nya glyphs.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Typsnittresurs. |
| fontRenderingEmSize | float | Typsnittsstorlek. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Skapar nya glyphs.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontFamily | java.lang.String | Typsnittsfamilj. |
| fontRenderingEmSize | float | Typsnittsstorlek. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckenstil. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Skapar ett nytt gradientstopp.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Gradientstoppens färg. |
| offset | float | Gradientens förskjutning. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Skapar ett nytt gradientstopp.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | java.awt.Color | Gradientstoppens färg. |
| offset | float | Gradientens förskjutning. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Skapar en ny ICC-profilresurs från  stream .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.InputStream | Strömmen som innehåller ICC-profilen att använda som en resurs. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Skapar en ny ICC-profilresurs från ICC-profilfilen som finns på  iccProfilePath .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| iccProfilePath | java.lang.String | Sökvägen till ICC-profilen att använda som en resurs. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Skapar en ny bildresurs från  stream .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.InputStream | Strömmen som innehåller bilden att använda som en resurs. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Skapar en ny bildresurs från bildfilen som finns på  imagePath .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imagePath | java.lang.String | Sökvägen till bilden att använda som en resurs. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Skapar en ny bildpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | En bildresurs. |
| viewbox | java.awt.geom.Rectangle2D | Positionen och dimensionerna för borstpenselns källinnehåll. |
| visningsområde | java.awt.geom.Rectangle2D | Regionen i det omgivande koordinatrymmet för den primära borstplattan som (möjligen upprepade gånger) tillämpas för att fylla den region som borstpenseln appliceras på. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Skapar en ny bildpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imagePath | java.lang.String | Sökvägen till bilden som ska användas som penseltegel. |
| viewbox | java.awt.geom.Rectangle2D | Positionen och dimensionerna för borstpenselns källinnehåll. |
| visningsområde | java.awt.geom.Rectangle2D | Regionen i det omgivande koordinatrymmet för den primära borstplattan som (möjligen upprepade gånger) tillämpas för att fylla den region som borstpenseln appliceras på. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Skapar en ny linjär gradientpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för den linjära gradienten. |
| endPoint | java.awt.geom.Point2D | Slutpunkten för den linjära gradienten. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Skapar en ny linjär gradientpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Listan med gradientstopp. |
| startPoint | java.awt.geom.Point2D | Startpunkten för den linjära gradienten. |
| endPoint | java.awt.geom.Point2D | Slutpunkten för den linjära gradienten. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Skapar en ny affin transformationsmatris.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| m11 | float | Element 11. |
| m12 | float | Element 12. |
| m21 | float | Element 21. |
| m22 | float | Element 22. |
| m31 | float | Element 31. |
| m32 | float | Element 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Skapar en ny bana.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Skapar en ny öppen path‑figur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Skapar en ny banfigur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |
| isClosed | boolean | Anger om sökvägen är sluten. Om den är satt till true ritas strecket som "slutet", det vill säga att den sista punkten i det sista segmentet av sökvägsfiguren är kopplad till punkten som anges i attributet StartPoint, annars ritas strecket som "öppet" och den sista punkten är inte kopplad till startpunkten. Endast tillämplig om sökvägsfiguren används i ett Path-element som specificerar ett streck. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Skapar en ny öppen path‑figur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Lista över sökvägssegment. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Skapar en ny banfigur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Lista över sökvägssegment. |
| isClosed | boolean | Anger om sökvägen är sluten. Om den är satt till true ritas strecket som "slutet", det vill säga att den sista punkten i det sista segmentet av sökvägsfiguren är kopplad till punkten som anges i attributet StartPoint, annars ritas strecket som "öppet" och den sista punkten är inte kopplad till startpunkten. Endast tillämplig om sökvägsfiguren används i ett Path-element som specificerar ett streck. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Skapar en ny bangeometri.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Skapar en ny bangeometri specificerad med förkortad form.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Förkortad form av path geometry. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Skapar en ny bangeometri med en specificerad lista av banfigurer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Lista över path-figurer. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Skapar en ny uppsättning streckade kubiska B?bezier‑kurvor.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Kontrollpunkter för flera B?bezier-segment. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Skapar en ny uppsättning kubiska B?bezier‑kurvor.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Kontrollpunkter för flera B?bezier-segment. |
| isStroked | boolean | Anger om strecket för detta segment av sökvägen ritas. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Skapar en ny streckad polygonritning som innehåller ett godtyckligt antal enskilda hörn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | En uppsättning koordinater för de flera segmenten som definierar polylinjensegmentet. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Skapar en ny polygonritning som innehåller ett godtyckligt antal enskilda hörn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | En uppsättning koordinater för de flera segmenten som definierar polylinjensegmentet. |
| isStroked | boolean | Anger om strecket för detta segment av sökvägen ritas. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Skapar en ny uppsättning av strokade kvadratiska B?zier-kurvor från föregående punkt i sökvägsfiguren genom en uppsättning hörn, med angivna kontrollpunkter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Kontrollpunkter för flera kvadratiska B?bezier-segment. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Skapar en ny uppsättning av kvadratiska B?zier-kurvor från föregående punkt i sökvägsfiguren genom en uppsättning hörn, med angivna kontrollpunkter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Kontrollpunkter för flera kvadratiska B?bezier-segment. |
| isStroked | boolean | Anger om strecket för detta segment av sökvägen ritas. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Skapar en ny radiell gradientpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| centrum | java.awt.geom.Point2D | Den centrala punkten för den radiala gradienten (det vill säga ellipsens centrum). |
| gradientOrigin | java.awt.geom.Point2D | Ursprungspunkten för den radiala gradienten. |
| radiusX | float | Radien i x-dimensionen av ellipsen som definierar den radiala gradienten. |
| radiusY | float | Radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Skapar en ny radiell gradientpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Listan med gradientstopp. |
| centrum | java.awt.geom.Point2D | Den centrala punkten för den radiala gradienten (det vill säga ellipsens centrum). |
| gradientOrigin | java.awt.geom.Point2D | Ursprungspunkten för den radiala gradienten. |
| radiusX | float | Radien i x-dimensionen av ellipsen som definierar den radiala gradienten. |
| radiusY | float | Radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Skapar en ny solid färgpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Färgen för fyllda element. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Skapar en ny solid färgpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | java.awt.Color | Färgen för fyllda element. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Skapar en ny visuell pensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | XPS-elementet (Canvas, Path eller Glyphs) för Visual-egenskapen för visuell pensel. |
| viewbox | java.awt.geom.Rectangle2D | Positionen och dimensionerna för borstpenselns källinnehåll. |
| visningsområde | java.awt.geom.Rectangle2D | Regionen i det omgivande koordinatrymmet för den primära borstplattan som (möjligen upprepade gånger) tillämpas för att fylla den region som borstpenseln appliceras på. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Returnerar det aktiva dokumentets nummer.

**Returns:**
int - Det heltalsvärdet.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Returnerar det aktiva sidnumret i det aktiva dokumentet.

**Returns:**
int - Det heltalsvärdet.
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


Returnerar antalet dokument i XPS-paketet.

**Returns:**
int - Antalet dokument i XPS-paketet.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Hämtar utskriftsbiljetten för dokumentet som indexeras med  documentIndex .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| documentIndex | int | Index för dokumentet vars utskriftsticket ska returneras. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Returnerar dokumentets jobbutskriftsbiljett.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Returnerar  XpsPage  instansen för aktiv sida.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Returnerar antalet sidor i det aktiva dokumentet.

**Returns:**
int - Antalet sidor i det aktiva dokumentet.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Hämtar utskriftsbiljetten för sidan som indexeras med  pageIndex  i dokumentet som indexeras med  documentIndex .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| documentIndex | int | Index för dokumentet. |
| pageIndex | int | Index för sidan vars utskriftsticket ska returneras. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Returnerar det totala antalet sidor i alla dokument i XPS-dokumentet.

**Returns:**
int - Det totala antalet sidor i alla dokument i XPS-dokumentet.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Hämtar objektet som tillhandahåller verktyg utöver det formella XPS-manipulerings‑API:et.

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


Infogar en ny canvas till den aktiva sidan vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en ny duk ska infogas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Infogar ett tomt dokument med standard sidstorlek vid  index  position och markerar infogat dokument som aktivt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett dokument ska infogas. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Infogar ett tomt dokument med standard sidstorlek vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett dokument ska infogas. |
| aktivera | boolean | Flagga som indikerar om det infogade dokumentet ska väljas som aktivt. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Infogar ett tomt dokument med den första sidans dimensioner  width  och  height  vid  index  position och markerar det infogade dokumentet som aktivt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett dokument ska infogas. |
| width | float | Bredd på den första sidan. |
| height | float | Höjd på den första sidan. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Infogar ett tomt dokument med den första sidans dimensioner  width  och  height  vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett dokument ska infogas. |
| width | float | Bredd på den första sidan. |
| height | float | Höjd på den första sidan. |
| aktivera | boolean | Flagga som indikerar om det infogade dokumentet ska väljas som aktivt. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Infogar nya glyfer till den aktiva sidan vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där nya glyfer ska infogas. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Typsnittresurs. |
| fontSize | float | Typsnittsstorlek. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Infogar nya glyfer till den aktiva sidan vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där nya glyfer ska infogas. |
| fontFamily | java.lang.String | Typsnittsfamilj. |
| fontSize | float | Typsnittsstorlek. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckenstil. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Infogar en tom sida till dokumentet med standard sidstorlek vid  index  position och markerar den infogade sidan som aktiv.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en sida ska infogas. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Infogar en tom sida till dokumentet med standard sidstorlek vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en sida ska infogas. |
| aktivera | boolean | Flagga som indikerar om den infogade sidan ska väljas som aktiv. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Infogar en sida till dokumentet vid  index  position och markerar den infogade sidan som aktiv.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en sida ska läggas till. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Sida som ska infogas. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Infogar en sida till dokumentet vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en sida ska läggas till. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Sida som ska infogas. |
| aktivera | boolean | Flagga som indikerar om den infogade sidan ska väljas som aktiv. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Infogar en tom sida till dokumentet med angiven  width  och  height  vid  index  position och markerar den infogade sidan som aktiv.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en sida ska infogas. |
| width | float | Bredd på en ny sida. |
| height | float | Höjd på en ny sida. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Infogar en tom sida till dokumentet med angiven  width  och  height  vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en sida ska infogas. |
| width | float | Bredd på en ny sida. |
| height | float | Höjd på en ny sida. |
| aktivera | boolean | Flagga som indikerar om den infogade sidan ska väljas som aktiv. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Infogar en ny sökväg till den aktiva sidan vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en ny bana ska infogas. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Indikerar om licensen för Aspose.Page för Java-produkten är åtkomlig och giltig.

**Returns:**
boolean - booleskt värde
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Sammanfogar flera XPS-filer till ett XPS-dokument.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-filer för sammanslagning med detta dokument. |
| outStream | java.io.OutputStream | Utdataströmmen där sammanslagna XPS-dokument ska sparas. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Sammanfogar flera XPS-filer till ett XPS-dokument.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-filer för sammanslagning med detta dokument. |
| outXpsFilePath | java.lang.String | Sökvägen till den utgående XPS-filen. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Sammanfogar XPS-dokument till PDF med hjälp av  Device  -instansen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Sökvägen till den utgående PDF-filen. |
| filesForMerge | java.lang.String[] | XPS-filer för sammanslagning med detta dokument till en utmatningsenhet. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Alternativ för att spara dokument. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Sammanfogar XPS-dokument till PDF med hjälp av  Device  -instansen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-filer för sammanslagning med detta dokument till en utmatningsenhet. |
| pdfStream | java.io.OutputStream | Utmatningsströmmen för att skriva den resulterande PDF-filen till. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Alternativ för att spara dokument. |

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


Tar bort ett element vid  index  position från den aktiva sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där elementet ska tas bort. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Tar bort ett dokument vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett dokument ska tas bort. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Tar bort en sida från dokumentet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Sida som ska tas bort. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Tar bort en sida från dokumentet vid  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en sida ska tas bort. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Sparar dokumentet med  Device  instansen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Device-instansen. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Alternativ för att spara dokument. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Sparar XPS-dokument till ström.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.OutputStream | Ström för XPS-dokument att spara i. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Sparar XPS-dokument till XPS-filen som finns på  path .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sökväg | java.lang.String | Plats för dokumentet. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Sparar dokumentet till en bildfil. Utdata‑katalogen och filnamnet kommer att vara samma som från inmatnings‑XPS‑filen. Filändelsen kommer att motsvara bildformatet i "options"‑parametern. Om dokumentet initierades med en ström som inte är FileInputStream, kommer bildfilen att sparas i den aktuella mappen med standardfilnamnsmall.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Alternativ för att spara dokumentet i ett bitmap-bildformat. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Sparar dokumentet till en bildfil i den angivna katalogen med det angivna filnamnet. Filändelsen kommer att motsvara bildformatet i "options"‑parametern.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Alternativ för att spara dokumentet i ett bitmap-bildformat. |
| outDir | java.lang.String | Utdata‑katalogen där bildfilen kommer att sparas. |
| fileNameTemplate | java.lang.String | Filnamnsmall för bild (utan filändelse). Om inmatnings‑XPS‑filen är en‑sidig kommer den att vara exakt filnamnet, annars "\_[n]", där "n" - ett sidnummer med början från 1, kommer ett suffix att läggas till. Filändelsen kommer att motsvara bildformatet i "option"‑parametern. |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Sparar dokumentet i bitmap-bildformat som byte‑arrayer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Alternativ för att spara dokumentet i ett bitmap-bildformat. |

**Returns:**
byte[][][] - De resulterande bildernas byte‑arrayer. Den första dimensionen är för inre dokument och den andra för sidor inom inre dokument.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Sparar dokumentet i PDF-format.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.OutputStream | Strömmen för att skriva utdata‑PDF‑filen till. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Alternativ för att spara dokumentet i PDF-format. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Sparar dokumentet i PDF-format.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Sökvägen till den utgående PDF-filen. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Alternativ för att spara dokumentet i PDF-format. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Sparar dokumentet i PS-format.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.OutputStream | Strömmen för att skriva utdata‑PS‑filen till. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Alternativ för att spara dokumentet i PS-format. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Sparar dokumentet i PostScript-format.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Sökvägen till den utgående PostScript-filen. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Alternativ för att spara dokumentet i PDF-format. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Väljer ett aktivt dokument för redigering.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| documentNumber | int | Ett dokumentnummer. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Väljer en aktiv dokumentsida för redigering.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pageNumber | int | Ett sidnummer. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Länkar  printTicket  till dokumentet indexerat med  documentIndex .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| documentIndex | int | Index för dokumentet att länka utskriftbiljetten till. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | Utskriftbiljetten att länka. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Ställer in dokumentets jobb‑utskriftsticket.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | Dokumentets jobbutskriftbiljett. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Länkar  printTicket  till sidan indexerad med  pageIndex  i dokumentet indexerat med  documentIndex .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| documentIndex | int | Index för dokumentet. |
| pageIndex | int | Index för sidan att länka utskriftbiljetten till. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | Utskriftbiljetten att länka. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

