---
title: "XpsDocument"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de hoofdentiteit van een XPS-document omvat en manipulatiemethoden voor elk XPS-element biedt."
type: docs
weight: 19
url: /nl/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Klasse die de hoofdentiteit van een XPS-document omvat en manipulatiemethoden voor elk XPS-element biedt.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Maakt een leeg XPS-document met standaard paginagrootte. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Opent een bestaand XPS-document op het pad. |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Laadt een bestaand document opgeslagen in de stream als XPS-document. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Voegt een inhoudselement toe (Canvas, Path of Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Voegt een element (Canvas, Path of Glyphs) in op de actieve pagina op de indexpositie. |
| [<T>remove(T element)](#-T-remove-T-) | Verwijdert een element van de actieve pagina. |
| [addCanvas()](#addCanvas--) | Voegt een nieuw canvas toe aan de actieve pagina. |
| [addDocument()](#addDocument--) | Voegt een leeg document toe met standaard paginagrootte en selecteert het toegevoegde document als actief. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Voegt een leeg document toe met standaard paginagrootte. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Voegt een leeg document toe met de afmetingen breedte en hoogte van de eerste pagina en selecteert het toegevoegde document als actief. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Voegt een leeg document toe met de afmetingen van de eerste pagina  breedte  en  hoogte . |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de actieve pagina. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de actieve pagina. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Voegt een outline-item toe aan het document. |
| [addPage()](#addPage--) | Voegt een lege pagina toe aan het document met de standaard paginagrootte. |
| [addPage(boolean activate)](#addPage-boolean-) | Voegt een lege pagina toe aan het document met de standaard paginagrootte. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Voegt een pagina toe aan het document en selecteert de toegevoegde pagina als actief. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Voegt een pagina toe aan het document. |
| [addPage(float width, float height)](#addPage-float-float-) | Voegt een lege pagina toe aan het document met gespecificeerde  breedte  en  hoogte . |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Voegt een lege pagina toe aan het document met gespecificeerde  breedte  en  hoogte . |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Voegt een nieuw pad toe aan de actieve pagina. |
| [close()](#close--) | Verwijdert de instantie. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Creëert een nieuw gestreken elliptisch boogsegment. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Creëert een nieuw elliptisch boogsegment. |
| [createCanvas()](#createCanvas--) | Creëert een nieuw canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Creëert een nieuwe kleur in een op ICC gebaseerd kleurenruimte. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Creëert een nieuwe kleur in scRGB-kleurruimte. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Creëert een nieuwe kleur in scRGB-kleurruimte. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Creëert een nieuwe kleur in sRGB-kleurruimte. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Creëert een nieuwe kleur in sRGB-kleurruimte. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Creëert een nieuwe kleur. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Creëert een nieuwe kleur in een op ICC gebaseerd kleurenruimte. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Maakt een nieuwe TrueType-lettertypebron aan vanuit een stream. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Maakt een nieuwe TrueType-lettertypebron aan. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Creëert nieuwe glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Creëert nieuwe glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Creëert een nieuw kleurovergangspunt. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Creëert een nieuw kleurovergangspunt. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Maakt een nieuwe ICC-profielbron aan vanuit  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Maakt een nieuwe ICC-profielbron aan vanuit een ICC-profielbestand op de locatie  iccProfilePath . |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Maakt een nieuwe afbeeldingsbron aan vanuit  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Maakt een nieuwe afbeeldingsbron aan vanuit een afbeeldingsbestand op de locatie  imagePath . |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Creëert een nieuwe afbeeldingskwast. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Creëert een nieuwe afbeeldingskwast. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Creëert een nieuwe lineaire kleurovergangkwast. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Creëert een nieuwe lineaire kleurovergangkwast. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Creëert een nieuwe affiene transformatie-matrix. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Creëert een nieuw pad. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Creëert een nieuwe open padfiguur. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Creëert een nieuwe padfiguur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Creëert een nieuwe open padfiguur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Creëert een nieuwe padfiguur. |
| [createPathGeometry()](#createPathGeometry--) | Creëert een nieuwe padgeometrie. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Maakt een nieuwe padgeometrie gespecificeerd met een verkorte vorm. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Maakt een nieuwe padgeometrie met een gespecificeerde lijst van padfiguren. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Maakt een nieuwe set gestrekte kubieke B?zier-curves. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Maakt een nieuwe set kubieke B?zier-curves. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Maakt een nieuwe gestrekte polygonale tekening die een willekeurig aantal individuele hoekpunten bevat. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Maakt een nieuwe polygonale tekening die een willekeurig aantal individuele hoekpunten bevat. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Maakt een nieuwe set gestrekte kwadratische B?zier-curves van het vorige punt in de padfiguur via een set hoekpunten, met gebruik van gespecificeerde controlepunten. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Maakt een nieuwe set kwadratische B?zier-curves van het vorige punt in de padfiguur via een set hoekpunten, met gebruik van gespecificeerde controlepunten. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Maakt een nieuwe radiale verloopkwast. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Maakt een nieuwe radiale verloopkwast. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Maakt een nieuwe effen kleurkwast. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Maakt een nieuwe effen kleurkwast. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Maakt een nieuwe visuele kwast. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | Retourneert het actieve documentnummer. |
| [getActivePage()](#getActivePage--) | Retourneert het actieve paginanummer binnen het actieve document. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Retourneert het aantal documenten in het XPS-pakket. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Haalt het printticket op van het document geïndexeerd met  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Retourneert het printticket van de taak van het document. |
| [getPage()](#getPage--) | Retourneert de  XpsPage  instantie voor de actieve pagina. |
| [getPageCount()](#getPageCount--) | Retourneert het aantal pagina's in het actieve document. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Haalt het printticket op van de pagina geïndexeerd met  pageIndex  in het document geïndexeerd met  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Retourneert het totale aantal pagina's in alle documenten binnen het XPS-document. |
| [getUtils()](#getUtils--) | Haalt het object op dat hulpmiddelen biedt buiten de formele XPS-manipulatie-API. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Voegt een nieuw canvas in op de actieve pagina op positie  index . |
| [insertDocument(int index)](#insertDocument-int-) | Voegt een leeg document met standaard paginagrootte in op positie  index  en selecteert het ingevoegde document als actief. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Voegt een leeg document met standaard paginagrootte in op positie  index . |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Voegt een leeg document met de afmetingen van de eerste pagina  breedte  en  hoogte  in op positie  index  en selecteert het ingevoegde document als actief. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Voegt een leeg document in met de afmetingen van de eerste pagina  breedte  en  hoogte  op  index  positie. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de actieve pagina op  index  positie. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de actieve pagina op  index  positie. |
| [insertPage(int index)](#insertPage-int-) | Voegt een lege pagina toe aan het document met de standaard paginagrootte op  index  positie en selecteert de ingevoegde pagina als actief. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Voegt een lege pagina toe aan het document met de standaard paginagrootte op  index  positie. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Voegt een pagina toe aan het document op  index  positie en selecteert de ingevoegde pagina als actief. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Voegt een pagina toe aan het document op  index  positie. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Voegt een lege pagina toe aan het document met gespecificeerde  breedte  en  hoogte  op  index  positie en selecteert de ingevoegde pagina als actief. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Voegt een lege pagina toe aan het document met gespecificeerde  breedte  en  hoogte  op  index  positie. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Voegt een nieuw pad toe aan de actieve pagina op  index  positie. |
| [isLicensed()](#isLicensed--) | Geeft aan of de licentie van Aspose.Page for Java-product wordt benaderd en geldig is. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Meerdere XPS-bestanden samenvoegen tot één XPS-document. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Meerdere XPS-bestanden samenvoegen tot één XPS-document. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | XPS-documenten samenvoegen tot PDF met behulp van de  Device  instantie. |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | XPS-documenten samenvoegen tot PDF met behulp van de  Device  instantie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Verwijdert een element op  index  positie van de actieve pagina. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Verwijdert een document op  index  positie. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Verwijdert een pagina uit het document. |
| [removePageAt(int index)](#removePageAt-int-) | Verwijdert een pagina uit het document op  index  positie. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Slaat het document op met de  Device  instantie. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Slaat XPS-document op naar stream. |
| [save(String path)](#save-java.lang.String-) | Slaat XPS-document op naar het XPS-bestand dat zich bevindt op het  pad . |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Slaat het document op naar een afbeeldingsbestand.De uitvoermap en bestandsnaam zullen hetzelfde zijn als van het invoer‑XPS‑bestand. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Slaat het document op naar een afbeeldingsbestand in de opgegeven map met de opgegeven bestandsnaam. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Slaat het document op in een bitmap‑afbeeldingsformaat als byte‑arrays. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Slaat het document op in PDF-formaat. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Slaat het document op in PDF-formaat. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Slaat het document op in PS-formaat. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Slaat het document op in PostScript-formaat. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Selecteert een actief document voor bewerking. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Selecteert een actieve documentpagina voor bewerking. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Koppelt het  printTicket  aan het document geïndexeerd door  documentIndex . |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Stelt het job print ticket van het document in. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Koppelt het  printTicket  aan de pagina geïndexeerd door  pageIndex  in het document geïndexeerd door  documentIndex . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Maakt een leeg XPS-document met standaard paginagrootte.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Opent een bestaand XPS-document op het pad.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | java.lang.String | Locatie van het document. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Laadt een bestaand document opgeslagen in de stream als XPS-document.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | java.io.InputStream | Documentstroom. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Opties voor het laden van documenten. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Voegt een inhoudselement toe (Canvas, Path of Glyphs)

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| element | T | Het element om toe te voegen. |

**Returns:**
T - Toegevoegd element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Voegt een element (Canvas, Path of Glyphs) in op de actieve pagina op de indexpositie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een element moet worden ingevoegd. |
| element | T | Het element om in te voegen. |

**Returns:**
T - Ingevoegd element.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Verwijdert een element van de actieve pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| element | T | Het element om te verwijderen. |

**Returns:**
T - Verwijderd element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Voegt een nieuw canvas toe aan de actieve pagina.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Voegt een leeg document toe met standaard paginagrootte en selecteert het toegevoegde document als actief.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Voegt een leeg document toe met standaard paginagrootte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| activeren | boolean | Vlag die aangeeft of het toegevoegde document als actief moet worden geselecteerd. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Voegt een leeg document toe met de afmetingen breedte en hoogte van de eerste pagina en selecteert het toegevoegde document als actief.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float | Breedte van de eerste pagina. |
| hoogte | float | Hoogte van de eerste pagina. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Voegt een leeg document toe met de afmetingen van de eerste pagina  breedte  en  hoogte .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float | Breedte van de eerste pagina. |
| hoogte | float | Hoogte van de eerste pagina. |
| activeren | boolean | Vlag die aangeeft of het toegevoegde document als actief moet worden geselecteerd. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Voegt nieuwe glyphs toe aan de actieve pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Lettertypebron. |
| fontRenderingEmSize | float | Lettergrootte. |
| originX | float | X-coördinaat van de oorsprong van de glyphs. |
| originY | float | Y-coördinaat van de oorsprong van de glyphs. |
| unicodeString | java.lang.String | Te printen tekenreeks. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Voegt nieuwe glyphs toe aan de actieve pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontFamily | java.lang.String | Lettertypefamilie. |
| fontRenderingEmSize | float | Lettergrootte. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Lettertype stijl. |
| originX | float | X-coördinaat van de oorsprong van de glyphs. |
| originY | float | Y-coördinaat van de oorsprong van de glyphs. |
| unicodeString | java.lang.String | Te printen tekenreeks. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Voegt een outline-item toe aan het document.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| beschrijving | java.lang.String | De beschrijving van het item. |
| outlineLevel | int | Het outline-niveau. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Het invoerdoel. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Voegt een lege pagina toe aan het document met de standaard paginagrootte.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Voegt een lege pagina toe aan het document met de standaard paginagrootte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| activeren | boolean | Vlag die aangeeft of de toegevoegde pagina als actief moet worden geselecteerd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Voegt een pagina toe aan het document en selecteert de toegevoegde pagina als actief.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina die moet worden toegevoegd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Voegt een pagina toe aan het document.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina die moet worden toegevoegd. |
| activeren | boolean | Vlag die aangeeft of de toegevoegde pagina als actief moet worden geselecteerd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Voegt een lege pagina toe aan het document met gespecificeerde  breedte  en  hoogte .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float | Breedte van een nieuwe pagina. |
| hoogte | float | Hoogte van een nieuwe pagina. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Voegt een lege pagina toe aan het document met gespecificeerde  breedte  en  hoogte .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float | Breedte van een nieuwe pagina. |
| hoogte | float | Hoogte van een nieuwe pagina. |
| activeren | boolean | Vlag die aangeeft of de toegevoegde pagina als actief moet worden geselecteerd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Voegt een nieuw pad toe aan de actieve pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De geometrie van het pad. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Verwijdert de instantie.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Creëert een nieuw gestreken elliptisch boogsegment.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| punt | java.awt.geom.Point2D | Het eindpunt van de elliptische boog. |
| grootte | java.awt.geom.Dimension2D | De x- en y-radius van de elliptische boog als een x,y-paar. |
| rotationAngle | float | Geeft aan hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem. |
| isLargeArc | boolean | Bepaalt of de boog wordt getekend met een sweep van 180 of meer. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | De richting waarin de boog wordt getekend. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Creëert een nieuw elliptisch boogsegment.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| punt | java.awt.geom.Point2D | Het eindpunt van de elliptische boog. |
| grootte | java.awt.geom.Dimension2D | De x- en y-radius van de elliptische boog als een x,y-paar. |
| rotationAngle | float | Geeft aan hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem. |
| isLargeArc | boolean | Bepaalt of de boog wordt getekend met een sweep van 180 of meer. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | De richting waarin de boog wordt getekend. |
| isStroked | boolean | Specificeert of de lijn voor dit segment van het pad wordt getekend. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Creëert een nieuw canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Creëert een nieuwe kleur in een op ICC gebaseerd kleurenruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | De ICC-profielbron. |
| components | float[] | Kleurcomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Creëert een nieuwe kleur in scRGB-kleurruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| r | float | De rode kleurcomponent. |
| g | float | De groene kleurcomponent. |
| b | float | De blauwe kleurcomponent. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Creëert een nieuwe kleur in scRGB-kleurruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| a | float | De alfa-kleurcomponent. |
| r | float | De rode kleurcomponent. |
| g | float | De groene kleurcomponent. |
| b | float | De blauwe kleurcomponent. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Creëert een nieuwe kleur in sRGB-kleurruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| r | int | De rode kleurcomponent. |
| g | int | De groene kleurcomponent. |
| b | int | De blauwe kleurcomponent. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Creëert een nieuwe kleur in sRGB-kleurruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| a | int | De alfa-kleurcomponent. |
| r | int | De rode kleurcomponent. |
| g | int | De groene kleurcomponent. |
| b | int | De blauwe kleurcomponent. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Creëert een nieuwe kleur.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| color | java.awt.Color | Een native kleurinstantie voor RGB-kleur. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Creëert een nieuwe kleur in een op ICC gebaseerd kleurenruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | java.lang.String | Het pad naar het ICC-profiel. |
| components | float[] | Kleurcomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Maakt een nieuwe TrueType-lettertypebron aan vanuit een stream.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | java.io.InputStream | De stroom die het ICC-profiel bevat om als bron te gebruiken. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Maakt een nieuwe TrueType-lettertypebron aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontFamily | java.lang.String | De lettertypefamilie. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | De letterstijl. Zie de  XpsFont  klasse‑constanten (die bit‑vlaggen zijn) voor waarden die gecombineerd kunnen worden. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Creëert nieuwe glyphs.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Lettertypebron. |
| fontRenderingEmSize | float | Lettergrootte. |
| originX | float | X-coördinaat van de oorsprong van de glyphs. |
| originY | float | Y-coördinaat van de oorsprong van de glyphs. |
| unicodeString | java.lang.String | Te printen tekenreeks. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Creëert nieuwe glyphs.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontFamily | java.lang.String | Lettertypefamilie. |
| fontRenderingEmSize | float | Lettergrootte. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Lettertype stijl. |
| originX | float | X-coördinaat van de oorsprong van de glyphs. |
| originY | float | Y-coördinaat van de oorsprong van de glyphs. |
| unicodeString | java.lang.String | Te printen tekenreeks. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Creëert een nieuw kleurovergangspunt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | De kleur van de gradiëntstop. |
| offset | float | De gradient-offset. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Creëert een nieuw kleurovergangspunt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| color | java.awt.Color | De kleur van de gradiëntstop. |
| offset | float | De gradient-offset. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Maakt een nieuwe ICC-profielbron aan vanuit  stream .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | java.io.InputStream | De stroom die het ICC-profiel bevat om als bron te gebruiken. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Maakt een nieuwe ICC-profielbron aan vanuit een ICC-profielbestand op de locatie  iccProfilePath .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| iccProfilePath | java.lang.String | Het pad naar het ICC-profiel om als bron te gebruiken. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Maakt een nieuwe afbeeldingsbron aan vanuit  stream .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | java.io.InputStream | De stroom die de afbeelding bevat om als bron te gebruiken. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Maakt een nieuwe afbeeldingsbron aan vanuit een afbeeldingsbestand op de locatie  imagePath .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imagePath | java.lang.String | Het pad naar de afbeelding om als bron te gebruiken. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Creëert een nieuwe afbeeldingskwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Een afbeeldingsbron. |
| viewbox | java.awt.geom.Rectangle2D | De positie en afmetingen van de broninhoud van de penseel. |
| viewport | java.awt.geom.Rectangle2D | Het gebied in de omvattende coördinatenruimte van de primaire penseel-tegel dat (mogelijk herhaaldelijk) wordt toegepast om het gebied te vullen waarop de penseel wordt toegepast |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Creëert een nieuwe afbeeldingskwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imagePath | java.lang.String | Het pad naar de afbeelding die als penseel-tegel wordt gebruikt. |
| viewbox | java.awt.geom.Rectangle2D | De positie en afmetingen van de broninhoud van de penseel. |
| viewport | java.awt.geom.Rectangle2D | Het gebied in de omvattende coördinatenruimte van de primaire penseel-tegel dat (mogelijk herhaaldelijk) wordt toegepast om het gebied te vullen waarop de penseel wordt toegepast |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Creëert een nieuwe lineaire kleurovergangkwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Het startpunt van de lineaire gradient. |
| endPoint | java.awt.geom.Point2D | Het eindpunt van de lineaire gradient. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Creëert een nieuwe lineaire kleurovergangkwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | De lijst met gradientstops. |
| startPoint | java.awt.geom.Point2D | Het startpunt van de lineaire gradient. |
| endPoint | java.awt.geom.Point2D | Het eindpunt van de lineaire gradient. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Creëert een nieuwe affiene transformatie-matrix.

**Parameters:**
| Parameter | Type | Beschrijving |
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


Creëert een nieuw pad.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De geometrie van het pad. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Creëert een nieuwe open padfiguur.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Het startpunt voor het eerste segment van de padfiguur. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Creëert een nieuwe padfiguur.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Het startpunt voor het eerste segment van de padfiguur. |
| isClosed | boolean | Specificeert of het pad gesloten is. Indien ingesteld op true, wordt de lijn "gesloten" getekend, dat wil zeggen dat het laatste punt in het laatste segment van de padfiguur wordt verbonden met het punt dat is opgegeven in het StartPoint-attribuut; anders wordt de lijn "open" getekend, en is het laatste punt niet verbonden met het startpunt. Alleen van toepassing als de padfiguur wordt gebruikt in een Path-element dat een lijn specificeert. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Creëert een nieuwe open padfiguur.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Het startpunt voor het eerste segment van de padfiguur. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Lijst van padsegmenten. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Creëert een nieuwe padfiguur.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Het startpunt voor het eerste segment van de padfiguur. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Lijst van padsegmenten. |
| isClosed | boolean | Specificeert of het pad gesloten is. Indien ingesteld op true, wordt de lijn "gesloten" getekend, dat wil zeggen dat het laatste punt in het laatste segment van de padfiguur wordt verbonden met het punt dat is opgegeven in het StartPoint-attribuut; anders wordt de lijn "open" getekend, en is het laatste punt niet verbonden met het startpunt. Alleen van toepassing als de padfiguur wordt gebruikt in een Path-element dat een lijn specificeert. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Creëert een nieuwe padgeometrie.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Maakt een nieuwe padgeometrie gespecificeerd met een verkorte vorm.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Afgekorte vorm van padgeometrie. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Maakt een nieuwe padgeometrie met een gespecificeerde lijst van padfiguren.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Lijst van padfiguren. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Maakt een nieuwe set gestrekte kubieke B?zier-curves.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Controlepunten voor meerdere B?bezier-segmenten. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Maakt een nieuwe set kubieke B?zier-curves.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Controlepunten voor meerdere B?bezier-segmenten. |
| isStroked | boolean | Specificeert of de lijn voor dit segment van het pad wordt getekend. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Maakt een nieuwe gestrekte polygonale tekening die een willekeurig aantal individuele hoekpunten bevat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Een reeks coördinaten voor de meerdere segmenten die de polyline-segment definiëren. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Maakt een nieuwe polygonale tekening die een willekeurig aantal individuele hoekpunten bevat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Een reeks coördinaten voor de meerdere segmenten die de polyline-segment definiëren. |
| isStroked | boolean | Specificeert of de lijn voor dit segment van het pad wordt getekend. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Maakt een nieuwe set gestrekte kwadratische B?zier-curves van het vorige punt in de padfiguur via een set hoekpunten, met gebruik van gespecificeerde controlepunten.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Controlepunten voor meerdere kwadratische B?bezier-segmenten. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Maakt een nieuwe set kwadratische B?zier-curves van het vorige punt in de padfiguur via een set hoekpunten, met gebruik van gespecificeerde controlepunten.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Controlepunten voor meerdere kwadratische B?bezier-segmenten. |
| isStroked | boolean | Specificeert of de lijn voor dit segment van het pad wordt getekend. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Maakt een nieuwe radiale verloopkwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Het middelpunt van de radiale gradiënt (dat wil zeggen, het midden van de ellips). |
| gradientOrigin | java.awt.geom.Point2D | Het oorsprongspunt van de radiale gradiënt. |
| radiusX | float | De straal in de x-dimensie van de ellips die de radiale gradiënt definieert. |
| radiusY | float | De straal in de y-dimensie van de ellips die de radiale gradiënt definieert. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Maakt een nieuwe radiale verloopkwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | De lijst met gradientstops. |
| center | java.awt.geom.Point2D | Het middelpunt van de radiale gradiënt (dat wil zeggen, het midden van de ellips). |
| gradientOrigin | java.awt.geom.Point2D | Het oorsprongspunt van de radiale gradiënt. |
| radiusX | float | De straal in de x-dimensie van de ellips die de radiale gradiënt definieert. |
| radiusY | float | De straal in de y-dimensie van de ellips die de radiale gradiënt definieert. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Maakt een nieuwe effen kleurkwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | De kleur voor gevulde elementen. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Maakt een nieuwe effen kleurkwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| color | java.awt.Color | De kleur voor gevulde elementen. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Maakt een nieuwe visuele kwast.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Het XPS-element (Canvas, Path of Glyphs) voor de Visual‑eigenschap van visual brush. |
| viewbox | java.awt.geom.Rectangle2D | De positie en afmetingen van de broninhoud van de penseel. |
| viewport | java.awt.geom.Rectangle2D | Het gebied in de omvattende coördinatenruimte van de primaire penseel-tegel dat (mogelijk herhaaldelijk) wordt toegepast om het gebied te vullen waarop de penseel wordt toegepast |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Retourneert het actieve documentnummer.

**Returns:**
int - De int‑waarde.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Retourneert het actieve paginanummer binnen het actieve document.

**Returns:**
int - De int‑waarde.
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


Retourneert het aantal documenten in het XPS-pakket.

**Returns:**
int - Het aantal documenten in het XPS-pakket.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Haalt het printticket op van het document geïndexeerd met  documentIndex .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| documentIndex | int | Index van het document waarvan het afdrukticket moet worden geretourneerd. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Retourneert het printticket van de taak van het document.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Retourneert de  XpsPage  instantie voor de actieve pagina.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Retourneert het aantal pagina's in het actieve document.

**Returns:**
int - Het aantal pagina's in het actieve document.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Haalt het printticket op van de pagina geïndexeerd met  pageIndex  in het document geïndexeerd met  documentIndex .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| documentIndex | int | Index van het document. |
| pageIndex | int | Index van de pagina waarvan het afdrukticket moet worden geretourneerd. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Retourneert het totale aantal pagina's in alle documenten binnen het XPS-document.

**Returns:**
int - Het totale aantal pagina's in alle documenten binnen het XPS-document.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Haalt het object op dat hulpmiddelen biedt buiten de formele XPS-manipulatie-API.

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


Voegt een nieuw canvas in op de actieve pagina op positie  index .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een nieuw canvas moet worden ingevoegd. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Voegt een leeg document met standaard paginagrootte in op positie  index  en selecteert het ingevoegde document als actief.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een document moet worden ingevoegd. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Voegt een leeg document met standaard paginagrootte in op positie  index .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een document moet worden ingevoegd. |
| activeren | boolean | Vlag die aangeeft of het ingevoegde document als actief moet worden geselecteerd. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Voegt een leeg document met de afmetingen van de eerste pagina  breedte  en  hoogte  in op positie  index  en selecteert het ingevoegde document als actief.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een document moet worden ingevoegd. |
| breedte | float | Breedte van de eerste pagina. |
| hoogte | float | Hoogte van de eerste pagina. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Voegt een leeg document in met de afmetingen van de eerste pagina  breedte  en  hoogte  op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een document moet worden ingevoegd. |
| breedte | float | Breedte van de eerste pagina. |
| hoogte | float | Hoogte van de eerste pagina. |
| activeren | boolean | Vlag die aangeeft of het ingevoegde document als actief moet worden geselecteerd. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Voegt nieuwe glyphs toe aan de actieve pagina op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop nieuwe glyphs moeten worden ingevoegd. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Lettertypebron. |
| fontSize | float | Lettergrootte. |
| originX | float | X-coördinaat van de oorsprong van de glyphs. |
| originY | float | Y-coördinaat van de oorsprong van de glyphs. |
| unicodeString | java.lang.String | Te printen tekenreeks. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Voegt nieuwe glyphs toe aan de actieve pagina op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop nieuwe glyphs moeten worden ingevoegd. |
| fontFamily | java.lang.String | Lettertypefamilie. |
| fontSize | float | Lettergrootte. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Lettertype stijl. |
| originX | float | X-coördinaat van de oorsprong van de glyphs. |
| originY | float | Y-coördinaat van de oorsprong van de glyphs. |
| unicodeString | java.lang.String | Te printen tekenreeks. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Voegt een lege pagina toe aan het document met de standaard paginagrootte op  index  positie en selecteert de ingevoegde pagina als actief.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een pagina moet worden ingevoegd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Voegt een lege pagina toe aan het document met de standaard paginagrootte op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een pagina moet worden ingevoegd. |
| activeren | boolean | Vlag die aangeeft of de ingevoegde pagina als actief moet worden geselecteerd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Voegt een pagina toe aan het document op  index  positie en selecteert de ingevoegde pagina als actief.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een pagina moet worden toegevoegd. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina die moet worden ingevoegd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Voegt een pagina toe aan het document op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een pagina moet worden toegevoegd. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina die moet worden ingevoegd. |
| activeren | boolean | Vlag die aangeeft of de ingevoegde pagina als actief moet worden geselecteerd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Voegt een lege pagina toe aan het document met gespecificeerde  breedte  en  hoogte  op  index  positie en selecteert de ingevoegde pagina als actief.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een pagina moet worden ingevoegd. |
| breedte | float | Breedte van een nieuwe pagina. |
| hoogte | float | Hoogte van een nieuwe pagina. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Voegt een lege pagina toe aan het document met gespecificeerde  breedte  en  hoogte  op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een pagina moet worden ingevoegd. |
| breedte | float | Breedte van een nieuwe pagina. |
| hoogte | float | Hoogte van een nieuwe pagina. |
| activeren | boolean | Vlag die aangeeft of de ingevoegde pagina als actief moet worden geselecteerd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Voegt een nieuw pad toe aan de actieve pagina op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een nieuw pad moet worden ingevoegd. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De geometrie van het pad. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Geeft aan of de licentie van Aspose.Page for Java-product wordt benaderd en geldig is.

**Returns:**
boolean - booleaanse waarde
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Meerdere XPS-bestanden samenvoegen tot één XPS-document.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-bestanden voor samenvoegen met dit document. |
| outStream | java.io.OutputStream | De uitvoerstroom waarin samengevoegde XPS-documenten moeten worden opgeslagen. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Meerdere XPS-bestanden samenvoegen tot één XPS-document.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-bestanden voor samenvoegen met dit document. |
| outXpsFilePath | java.lang.String | Het uitvoer‑XPS‑bestandspad. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


XPS-documenten samenvoegen tot PDF met behulp van de  Device  instantie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Het uitvoer‑PDF‑bestandspad. |
| filesForMerge | java.lang.String[] | XPS-bestanden voor samenvoegen met dit document naar een uitvoerapparaat. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opties voor het opslaan van documenten. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


XPS-documenten samenvoegen tot PDF met behulp van de  Device  instantie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-bestanden voor samenvoegen met dit document naar een uitvoerapparaat. |
| pdfStream | java.io.OutputStream | De uitvoerstroom om de resulterende PDF naar te schrijven. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opties voor het opslaan van documenten. |

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


Verwijdert een element op  index  positie van de actieve pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een element moet worden verwijderd. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Verwijdert een document op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een document moet worden verwijderd. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Verwijdert een pagina uit het document.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina die moet worden verwijderd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Verwijdert een pagina uit het document op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een pagina moet worden verwijderd. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Slaat het document op met de  Device  instantie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | De  Device  instantie. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opties voor het opslaan van documenten. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Slaat XPS-document op naar stream.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream XPS-document om op te slaan. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Slaat XPS-document op naar het XPS-bestand dat zich bevindt op het  pad .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | java.lang.String | Locatie van het document. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Slaat het document op als afbeeldingsbestand. De uitvoermap en de bestandsnaam zullen hetzelfde zijn als van het invoer‑XPS‑bestand. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "options". Als het document is geïnitialiseerd met een stream die geen FileInputStream is, wordt het afbeeldingsbestand opgeslagen in de huidige map met een standaard bestandsnaamsjabloon.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opties voor het opslaan van het document in een bitmap‑afbeeldingsformaat. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Slaat het document op als afbeeldingsbestand in de opgegeven map met de opgegeven bestandsnaam. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "options".

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opties voor het opslaan van het document in een bitmap‑afbeeldingsformaat. |
| outDir | java.lang.String | De uitvoermap waar het afbeeldingsbestand wordt opgeslagen. |
| fileNameTemplate | java.lang.String | Het bestandsnaamsjabloon voor de afbeelding (zonder extensie). Als het invoer‑XPS‑bestand één pagina heeft, zal dit precies de bestandsnaam zijn, anders "\_[n]", waarbij "n" een paginanummer is beginnend bij 1, wordt er een achtervoegsel aan toegevoegd. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "option". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Slaat het document op in een bitmap‑afbeeldingsformaat als byte‑arrays.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opties voor het opslaan van het document in een bitmap‑afbeeldingsformaat. |

**Returns:**
byte[][][] - De resulterende byte‑arrays van de afbeeldingen. De eerste dimensie is voor interne documenten en de tweede voor pagina's binnen interne documenten.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Slaat het document op in PDF-formaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | java.io.OutputStream | De stream om het uitvoer‑PDF‑bestand naartoe te schrijven. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opties voor het opslaan van het document in PDF-formaat. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Slaat het document op in PDF-formaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Het uitvoer‑PDF‑bestandspad. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opties voor het opslaan van het document in PDF-formaat. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Slaat het document op in PS-formaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | java.io.OutputStream | De stream om het uitvoer‑PS‑bestand naartoe te schrijven. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Opties voor het opslaan van het document in PS-formaat. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Slaat het document op in PostScript-formaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Het pad naar het uitvoer‑PostScript‑bestand. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Opties voor het opslaan van het document in PDF-formaat. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Selecteert een actief document voor bewerking.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| documentNumber | int | Een documentnummer. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Selecteert een actieve documentpagina voor bewerking.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pageNumber | int | Een paginanummer. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Koppelt het  printTicket  aan het document geïndexeerd door  documentIndex .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| documentIndex | int | Index van het document waaraan het printticket moet worden gekoppeld. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | Het te koppelen printticket. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Stelt het job print ticket van het document in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | Het printticket van de taak van het document. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Koppelt het  printTicket  aan de pagina geïndexeerd door  pageIndex  in het document geïndexeerd door  documentIndex .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| documentIndex | int | Index van het document. |
| pageIndex | int | Index van de pagina waaraan het printticket moet worden gekoppeld. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | Het te koppelen printticket. |

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

