---
title: "XpsDocument"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die die Haupteinheit des XPS-Dokuments kapselt und Manipulationsmethoden für jedes XPS-Element bereitstellt."
type: docs
weight: 19
url: /de/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Klasse, die die Haupteinheit des XPS-Dokuments kapselt und Manipulationsmethoden für jedes XPS-Element bereitstellt.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Erstellt ein leeres XPS-Dokument mit Standardseitengröße. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Öffnet ein vorhandenes XPS-Dokument, das sich im Pfad befindet. |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Lädt ein vorhandenes Dokument, das im Stream gespeichert ist, als XPS-Dokument. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Fügt ein Inhaltselement (Canvas, Path oder Glyphs) hinzu |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Fügt ein Element (Canvas, Path oder Glyphs) an der Indexposition zur aktiven Seite hinzu. |
| [<T>remove(T element)](#-T-remove-T-) | Entfernt ein Element von der aktiven Seite. |
| [addCanvas()](#addCanvas--) | Fügt der aktiven Seite ein neues Canvas hinzu. |
| [addDocument()](#addDocument--) | Fügt ein leeres Dokument mit Standardseitengröße hinzu und wählt das hinzugefügte Dokument als aktiv aus. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Fügt ein leeres Dokument mit Standardseitengröße hinzu |
| [addDocument(float width, float height)](#addDocument-float-float-) | Fügt ein leeres Dokument mit den Abmessungen der ersten Seite (Breite und Höhe) hinzu und wählt das hinzugefügte Dokument als aktiv aus. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Fügt ein leeres Dokument mit den Abmessungen der ersten Seite  width  und  height  hinzu. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Fügt neue Glyphen zur aktiven Seite hinzu. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Fügt neue Glyphen zur aktiven Seite hinzu. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Fügt einen Gliederungseintrag zum Dokument hinzu |
| [addPage()](#addPage--) | Fügt dem Dokument eine leere Seite mit Standardseitengröße hinzu. |
| [addPage(boolean activate)](#addPage-boolean-) | Fügt dem Dokument eine leere Seite mit Standardseitengröße hinzu. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Fügt dem Dokument eine Seite hinzu und wählt die hinzugefügte Seite als aktiv aus. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Fügt dem Dokument eine Seite hinzu. |
| [addPage(float width, float height)](#addPage-float-float-) | Fügt dem Dokument eine leere Seite mit der angegebenen  width  und  height  hinzu. |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Fügt dem Dokument eine leere Seite mit der angegebenen  width  und  height  hinzu. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Fügt der aktiven Seite einen neuen Pfad hinzu. |
| [close()](#close--) | Gibt die Instanz frei. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Erstellt ein neues gestrecktes elliptisches Bogensegment. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Erstellt ein neues elliptisches Bogensegment. |
| [createCanvas()](#createCanvas--) | Erstellt ein neues Canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Erstellt eine neue Farbe im ICC-basierten Farbraum. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Erstellt eine neue Farbe im scRGB-Farbraum. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Erstellt eine neue Farbe im scRGB-Farbraum. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Erstellt eine neue Farbe im sRGB-Farbraum. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Erstellt eine neue Farbe im sRGB-Farbraum. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Erstellt eine neue Farbe. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Erstellt eine neue Farbe im ICC-basierten Farbraum. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Erstellt eine neue TrueType-Schriftartressource aus einem Stream. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Erstellt eine neue TrueType-Schriftartressource. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Erstellt neue Glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Erstellt neue Glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Erstellt einen neuen Farbverlaufspunkt. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Erstellt einen neuen Farbverlaufspunkt. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Erstellt eine neue ICC-Profilressource aus  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Erstellt eine neue ICC-Profilressource aus der ICC-Profildatei, die sich unter  iccProfilePath  befindet. |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Erstellt eine neue Bildressource aus  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Erstellt eine neue Bildressource aus der Bilddatei, die sich unter  imagePath  befindet. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Erstellt einen neuen Bildpinsel. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Erstellt einen neuen Bildpinsel. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Erstellt einen neuen linearen Farbverlaufpinsel. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Erstellt einen neuen linearen Farbverlaufpinsel. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Erstellt eine neue affine Transformationsmatrix. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Erstellt einen neuen Pfad. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Erstellt eine neue offene Pfadfigur. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Erstellt eine neue Pfadfigur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Erstellt eine neue offene Pfadfigur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Erstellt eine neue Pfadfigur. |
| [createPathGeometry()](#createPathGeometry--) | Erstellt eine neue Pfadgeometrie. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Erstellt eine neue Pfadgeometrie, die in Kurzform angegeben ist. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Erstellt eine neue Pfadgeometrie mit einer angegebenen Liste von Pfadfiguren. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Erstellt einen neuen Satz von gestreckten kubischen B?zier-Kurven. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Erstellt einen neuen Satz kubischer B?zier-Kurven. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Erstellt eine neue gestreckte polygonale Zeichnung, die eine beliebige Anzahl einzelner Scheitelpunkte enthält. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Erstellt eine neue polygonale Zeichnung, die eine beliebige Anzahl einzelner Scheitelpunkte enthält. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Erstellt einen neuen Satz gestreckter quadratischer B?zier-Kurven vom vorherigen Punkt in der Pfadfigur durch einen Satz von Scheitelpunkten unter Verwendung der angegebenen Kontrollpunkte. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Erstellt einen neuen Satz quadratischer B?zier-Kurven vom vorherigen Punkt in der Pfadfigur durch einen Satz von Scheitelpunkten unter Verwendung der angegebenen Kontrollpunkte. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Erstellt einen neuen radialen Farbverlauf-Pinsel. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Erstellt einen neuen radialen Farbverlauf-Pinsel. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Erstellt einen neuen Vollfarb-Pinsel. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Erstellt einen neuen Vollfarb-Pinsel. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Erstellt einen neuen visuellen Pinsel. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | Gibt die Nummer des aktiven Dokuments zurück. |
| [getActivePage()](#getActivePage--) | Gibt die Nummer der aktiven Seite im aktiven Dokument zurück. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Gibt die Anzahl der Dokumente im XPS-Paket zurück. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Liest das Druckticket des Dokuments mit dem Index  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Gibt das Druckticket des Dokuments zurück. |
| [getPage()](#getPage--) | Gibt die  XpsPage  Instanz für die aktive Seite zurück. |
| [getPageCount()](#getPageCount--) | Gibt die Anzahl der Seiten im aktiven Dokument zurück. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Liest das Druckticket der Seite mit dem Index  pageIndex  im Dokument mit dem Index  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Gibt die Gesamtzahl der Seiten in allen Dokumenten innerhalb des XPS-Dokuments zurück. |
| [getUtils()](#getUtils--) | Ruft das Objekt ab, das Dienstprogramme über die formale XPS-Manipulations-API hinaus bereitstellt. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Fügt der aktiven Seite ein neues Canvas an der Position  index  ein. |
| [insertDocument(int index)](#insertDocument-int-) | Fügt ein leeres Dokument mit Standardseitengröße an der Position  index  ein und wählt das eingefügte Dokument als aktiv aus. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Fügt ein leeres Dokument mit Standardseitengröße an der Position  index  ein. |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Fügt ein leeres Dokument mit den Abmessungen der ersten Seite  width  und  height  an der Position  index  ein und wählt das eingefügte Dokument als aktiv aus. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Fügt ein leeres Dokument mit den Abmessungen der ersten Seite width und height an der Position index ein. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Fügt neue Glyphen zur aktiven Seite an der Position index ein. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Fügt neue Glyphen zur aktiven Seite an der Position index ein. |
| [insertPage(int index)](#insertPage-int-) | Fügt eine leere Seite zum Dokument mit Standardseitengröße an der Position index ein und wählt die eingefügte Seite als aktiv aus. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Fügt eine leere Seite zum Dokument mit Standardseitengröße an der Position index ein. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Fügt eine Seite zum Dokument an der Position index ein und wählt die eingefügte Seite als aktiv aus. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Fügt eine Seite zum Dokument an der Position index ein. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Fügt eine leere Seite zum Dokument mit angegebenen width und height an der Position index ein und wählt die eingefügte Seite als aktiv aus. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Fügt eine leere Seite zum Dokument mit angegebenen width und height an der Position index ein. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Fügt einen neuen Pfad zur aktiven Seite an der Position index ein. |
| [isLicensed()](#isLicensed--) | Gibt an, ob die Lizenz für Aspose.Page für Java abgerufen und gültig ist. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Zusammenführen mehrerer XPS-Dateien zu einem XPS-Dokument. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Zusammenführen mehrerer XPS-Dateien zu einem XPS-Dokument. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Zusammenführen von XPS-Dokumenten zu PDF unter Verwendung der Device Instanz. |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Zusammenführen von XPS-Dokumenten zu PDF unter Verwendung der Device Instanz. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Entfernt ein Element an der Position index von der aktiven Seite. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Entfernt ein Dokument an der Position index. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Entfernt eine Seite aus dem Dokument. |
| [removePageAt(int index)](#removePageAt-int-) | Entfernt eine Seite aus dem Dokument an der Position index. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Speichert das Dokument unter Verwendung der Device Instanz. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Speichert das XPS-Dokument in einen Stream. |
| [save(String path)](#save-java.lang.String-) | Speichert das XPS-Dokument in die XPS-Datei, die sich unter dem Pfad path befindet. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Speichert das Dokument in eine Bilddatei. Das Ausgabeverzeichnis und der Dateiname sind dieselben wie bei der Eingabe-XPS-Datei. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Speichert das Dokument in eine Bilddatei in das angegebene Verzeichnis mit dem angegebenen Dateinamen. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Speichert das Dokument im Bitmap-Bildformat als Byte-Arrays. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Speichert das Dokument im PDF-Format. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Speichert das Dokument im PDF-Format. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Speichert das Dokument im PS-Format. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Speichert das Dokument im PostScript-Format. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Wählt ein aktives Dokument zum Bearbeiten aus. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Wählt eine aktive Dokumentseite zur Bearbeitung aus. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Verknüpft das  printTicket  mit dem Dokument, das durch  documentIndex  indiziert ist. |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Setzt das Job-Druckticket des Dokuments. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Verknüpft das  printTicket  mit der Seite, die durch  pageIndex  im Dokument, das durch  documentIndex  indiziert ist, referenziert wird. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Erstellt ein leeres XPS-Dokument mit Standardseitengröße.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Öffnet ein vorhandenes XPS-Dokument, das sich im Pfad befindet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.lang.String | Speicherort des Dokuments. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Lädt ein vorhandenes Dokument, das im Stream gespeichert ist, als XPS-Dokument.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Dokument-Stream. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Optionen zum Laden des Dokuments. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Fügt ein Inhaltselement (Canvas, Path oder Glyphs) hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Element | T | Das Element zum Hinzufügen. |

**Returns:**
T - Hinzugefügtes Element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Fügt ein Element (Canvas, Path oder Glyphs) an der Indexposition zur aktiven Seite hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Element eingefügt werden soll. |
| Element | T | Das Element zum Einfügen. |

**Returns:**
T - Eingefügtes Element.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Entfernt ein Element von der aktiven Seite.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Element | T | Das zu entfernende Element. |

**Returns:**
T - Entferntes Element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Fügt der aktiven Seite ein neues Canvas hinzu.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Fügt ein leeres Dokument mit Standardseitengröße hinzu und wählt das hinzugefügte Dokument als aktiv aus.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Fügt ein leeres Dokument mit Standardseitengröße hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| aktivieren | boolean | Flag, das angibt, ob das hinzugefügte Dokument als aktiv ausgewählt werden soll. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Fügt ein leeres Dokument mit den Abmessungen der ersten Seite (Breite und Höhe) hinzu und wählt das hinzugefügte Dokument als aktiv aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float | Breite der ersten Seite. |
| Höhe | float | Höhe der ersten Seite. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Fügt ein leeres Dokument mit den Abmessungen der ersten Seite  width  und  height  hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float | Breite der ersten Seite. |
| Höhe | float | Höhe der ersten Seite. |
| aktivieren | boolean | Flag, das angibt, ob das hinzugefügte Dokument als aktiv ausgewählt werden soll. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Fügt neue Glyphen zur aktiven Seite hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font-Ressource. |
| fontRenderingEmSize | float | Schriftgröße. |
| originX | float | X-Koordinate des Glyph-Ursprungs. |
| originY | float | Y-Koordinate des Glyph-Ursprungs. |
| unicodeString | java.lang.String | Zu druckende Zeichenkette. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Fügt neue Glyphen zur aktiven Seite hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontFamily | java.lang.String | Schriftfamilie. |
| fontRenderingEmSize | float | Schriftgröße. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Schriftstil. |
| originX | float | X-Koordinate des Glyph-Ursprungs. |
| originY | float | Y-Koordinate des Glyph-Ursprungs. |
| unicodeString | java.lang.String | Zu druckende Zeichenkette. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Fügt einen Gliederungseintrag zum Dokument hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Beschreibung. | java.lang.String | Die Beschreibung des Eintrags. |
| outlineLevel | int | Die Gliederungsebene. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Das Einstiegsziel. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Fügt dem Dokument eine leere Seite mit Standardseitengröße hinzu.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Fügt dem Dokument eine leere Seite mit Standardseitengröße hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| aktivieren | boolean | Flag, das angibt, ob die hinzugefügte Seite als aktiv ausgewählt werden soll. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Fügt dem Dokument eine Seite hinzu und wählt die hinzugefügte Seite als aktiv aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Hinzu zufügende Seite. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Fügt dem Dokument eine Seite hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Hinzu zufügende Seite. |
| aktivieren | boolean | Flag, das angibt, ob die hinzugefügte Seite als aktiv ausgewählt werden soll. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Fügt dem Dokument eine leere Seite mit der angegebenen  width  und  height  hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float | Breite einer neuen Seite. |
| Höhe | float | Höhe einer neuen Seite. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Fügt dem Dokument eine leere Seite mit der angegebenen  width  und  height  hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float | Breite einer neuen Seite. |
| Höhe | float | Höhe einer neuen Seite. |
| aktivieren | boolean | Flag, das angibt, ob die hinzugefügte Seite als aktiv ausgewählt werden soll. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Fügt der aktiven Seite einen neuen Pfad hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Geometrie des Pfads. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Gibt die Instanz frei.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Erstellt ein neues gestrecktes elliptisches Bogensegment.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Punkt | java.awt.geom.Point2D | Der Endpunkt des elliptischen Bogens. |
| Größe | java.awt.geom.Dimension2D | Der x- und y-Radius des elliptischen Bogens als x,y-Paar. |
| rotationAngle | float | Gibt an, wie die Ellipse relativ zum aktuellen Koordinatensystem gedreht ist. |
| isLargeArc | boolean | Bestimmt, ob der Bogen mit einem Winkel von 180 Grad oder mehr gezeichnet wird. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Die Richtung, in der der Bogen gezeichnet wird. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Erstellt ein neues elliptisches Bogensegment.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Punkt | java.awt.geom.Point2D | Der Endpunkt des elliptischen Bogens. |
| Größe | java.awt.geom.Dimension2D | Der x- und y-Radius des elliptischen Bogens als x,y-Paar. |
| rotationAngle | float | Gibt an, wie die Ellipse relativ zum aktuellen Koordinatensystem gedreht ist. |
| isLargeArc | boolean | Bestimmt, ob der Bogen mit einem Winkel von 180 Grad oder mehr gezeichnet wird. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Die Richtung, in der der Bogen gezeichnet wird. |
| isStroked | boolean | Gibt an, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Erstellt ein neues Canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Erstellt eine neue Farbe im ICC-basierten Farbraum.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | Die ICC-Profil-Ressource. |
| components | float[] | Farbkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Erstellt eine neue Farbe im scRGB-Farbraum.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| r | float | Die rote Farbkomponente. |
| g | float | Die grüne Farbkomponente. |
| b | float | Die blaue Farbkomponente. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Erstellt eine neue Farbe im scRGB-Farbraum.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | float | Die Alpha-Farbkomponente. |
| r | float | Die rote Farbkomponente. |
| g | float | Die grüne Farbkomponente. |
| b | float | Die blaue Farbkomponente. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Erstellt eine neue Farbe im sRGB-Farbraum.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| r | int | Die rote Farbkomponente. |
| g | int | Die grüne Farbkomponente. |
| b | int | Die blaue Farbkomponente. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Erstellt eine neue Farbe im sRGB-Farbraum.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | int | Die Alpha-Farbkomponente. |
| r | int | Die rote Farbkomponente. |
| g | int | Die grüne Farbkomponente. |
| b | int | Die blaue Farbkomponente. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Erstellt eine neue Farbe.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| color | java.awt.Color | Eine native Farbinstanz für RGB-Farbe. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Erstellt eine neue Farbe im ICC-basierten Farbraum.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.lang.String | Der Pfad zum ICC-Profil. |
| components | float[] | Farbkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Erstellt eine neue TrueType-Schriftartressource aus einem Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Der Stream, der das ICC-Profil enthält, das als Ressource verwendet werden soll. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Erstellt eine neue TrueType-Schriftartressource.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontFamily | java.lang.String | Die Schriftfamilie. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Der Schriftstil. Siehe die Klassenkonstanten von  XpsFont  (die Bit‑Flags sind) für kombinierbare Werte. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Erstellt neue Glyphs.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font-Ressource. |
| fontRenderingEmSize | float | Schriftgröße. |
| originX | float | X-Koordinate des Glyph-Ursprungs. |
| originY | float | Y-Koordinate des Glyph-Ursprungs. |
| unicodeString | java.lang.String | Zu druckende Zeichenkette. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Erstellt neue Glyphs.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontFamily | java.lang.String | Schriftfamilie. |
| fontRenderingEmSize | float | Schriftgröße. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Schriftstil. |
| originX | float | X-Koordinate des Glyph-Ursprungs. |
| originY | float | Y-Koordinate des Glyph-Ursprungs. |
| unicodeString | java.lang.String | Zu druckende Zeichenkette. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Erstellt einen neuen Farbverlaufspunkt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Die Farbe des Farbverlaufs-Stoppwerts. |
| Versatz | float | Der Versatz des Farbverlaufs. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Erstellt einen neuen Farbverlaufspunkt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| color | java.awt.Color | Die Farbe des Farbverlaufs-Stoppwerts. |
| Versatz | float | Der Versatz des Farbverlaufs. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Erstellt eine neue ICC-Profilressource aus  stream .

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Der Stream, der das ICC-Profil enthält, das als Ressource verwendet werden soll. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Erstellt eine neue ICC-Profilressource aus der ICC-Profildatei, die sich unter  iccProfilePath  befindet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| iccProfilePath | java.lang.String | Der Pfad zum ICC-Profil, das als Ressource verwendet werden soll. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Erstellt eine neue Bildressource aus  stream .

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.InputStream | Der Stream, der das Bild enthält, das als Ressource verwendet werden soll. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Erstellt eine neue Bildressource aus der Bilddatei, die sich unter  imagePath  befindet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imagePath | java.lang.String | Der Pfad zum Bild, das als Ressource verwendet werden soll. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Erstellt einen neuen Bildpinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Eine Bildressource. |
| Ansichtsfenster | java.awt.geom.Rectangle2D | Die Position und Abmessungen des Quellinhalts des Pinsels. |
| Ansichtsfenster | java.awt.geom.Rectangle2D | Der Bereich im umgebenden Koordinatenraum des primären Pinseltiles, der (möglicherweise wiederholt) angewendet wird, um den Bereich zu füllen, auf den der Pinsel angewendet wird. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Erstellt einen neuen Bildpinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imagePath | java.lang.String | Der Pfad zum Bild, das als Pinselkachel verwendet wird. |
| Ansichtsfenster | java.awt.geom.Rectangle2D | Die Position und Abmessungen des Quellinhalts des Pinsels. |
| Ansichtsfenster | java.awt.geom.Rectangle2D | Der Bereich im umgebenden Koordinatenraum des primären Pinseltiles, der (möglicherweise wiederholt) angewendet wird, um den Bereich zu füllen, auf den der Pinsel angewendet wird. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Erstellt einen neuen linearen Farbverlaufpinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Der Startpunkt des linearen Farbverlaufs. |
| endPoint | java.awt.geom.Point2D | Der Endpunkt des linearen Farbverlaufs. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Erstellt einen neuen linearen Farbverlaufpinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Die Liste der Farbverlaufsstopps. |
| startPoint | java.awt.geom.Point2D | Der Startpunkt des linearen Farbverlaufs. |
| endPoint | java.awt.geom.Point2D | Der Endpunkt des linearen Farbverlaufs. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Erstellt eine neue affine Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
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


Erstellt einen neuen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Geometrie des Pfads. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Erstellt eine neue offene Pfadfigur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Der Startpunkt für das erste Segment der Pfadfigur. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Erstellt eine neue Pfadfigur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Der Startpunkt für das erste Segment der Pfadfigur. |
| isClosed | boolean | Gibt an, ob der Pfad geschlossen ist. Wenn auf true gesetzt, wird der Strich "geschlossen" gezeichnet, das heißt, der letzte Punkt im letzten Segment der Pfadfigur wird mit dem im Attribut StartPoint angegebenen Punkt verbunden; andernfalls wird der Strich "offen" gezeichnet, und der letzte Punkt ist nicht mit dem Startpunkt verbunden. Nur anwendbar, wenn die Pfadfigur in einem Path-Element verwendet wird, das einen Strich angibt. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Erstellt eine neue offene Pfadfigur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Der Startpunkt für das erste Segment der Pfadfigur. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Liste von Pfadsegmenten. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Erstellt eine neue Pfadfigur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Der Startpunkt für das erste Segment der Pfadfigur. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Liste von Pfadsegmenten. |
| isClosed | boolean | Gibt an, ob der Pfad geschlossen ist. Wenn auf true gesetzt, wird der Strich "geschlossen" gezeichnet, das heißt, der letzte Punkt im letzten Segment der Pfadfigur wird mit dem im Attribut StartPoint angegebenen Punkt verbunden; andernfalls wird der Strich "offen" gezeichnet, und der letzte Punkt ist nicht mit dem Startpunkt verbunden. Nur anwendbar, wenn die Pfadfigur in einem Path-Element verwendet wird, das einen Strich angibt. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Erstellt eine neue Pfadgeometrie.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Erstellt eine neue Pfadgeometrie, die in Kurzform angegeben ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Abgekürzte Form der Pfadgeometrie. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Erstellt eine neue Pfadgeometrie mit einer angegebenen Liste von Pfadfiguren.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Liste von Pfadfiguren. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Erstellt einen neuen Satz von gestreckten kubischen B?zier-Kurven.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Steuerpunkte für mehrere B?bezier-Segmente. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Erstellt einen neuen Satz kubischer B?zier-Kurven.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Steuerpunkte für mehrere B?bezier-Segmente. |
| isStroked | boolean | Gibt an, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Erstellt eine neue gestreckte polygonale Zeichnung, die eine beliebige Anzahl einzelner Scheitelpunkte enthält.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Ein Satz von Koordinaten für die mehreren Segmente, die das Polyliniensegment definieren. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Erstellt eine neue polygonale Zeichnung, die eine beliebige Anzahl einzelner Scheitelpunkte enthält.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Ein Satz von Koordinaten für die mehreren Segmente, die das Polyliniensegment definieren. |
| isStroked | boolean | Gibt an, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Erstellt einen neuen Satz gestreckter quadratischer B?zier-Kurven vom vorherigen Punkt in der Pfadfigur durch einen Satz von Scheitelpunkten unter Verwendung der angegebenen Kontrollpunkte.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Steuerpunkte für mehrere quadratische B?bezier-Segmente. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Erstellt einen neuen Satz quadratischer B?zier-Kurven vom vorherigen Punkt in der Pfadfigur durch einen Satz von Scheitelpunkten unter Verwendung der angegebenen Kontrollpunkte.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Steuerpunkte für mehrere quadratische B?bezier-Segmente. |
| isStroked | boolean | Gibt an, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Erstellt einen neuen radialen Farbverlauf-Pinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Der Mittelpunkt des radialen Farbverlaufs (das heißt, das Zentrum der Ellipse). |
| gradientOrigin | java.awt.geom.Point2D | Der Ursprungspunkt des radialen Farbverlaufs. |
| radiusX | float | Der Radius in der x‑Dimension der Ellipse, die den radialen Farbverlauf definiert. |
| radiusY | float | Der Radius in der y‑Dimension der Ellipse, die den radialen Farbverlauf definiert. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Erstellt einen neuen radialen Farbverlauf-Pinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Die Liste der Farbverlaufsstopps. |
| center | java.awt.geom.Point2D | Der Mittelpunkt des radialen Farbverlaufs (das heißt, das Zentrum der Ellipse). |
| gradientOrigin | java.awt.geom.Point2D | Der Ursprungspunkt des radialen Farbverlaufs. |
| radiusX | float | Der Radius in der x‑Dimension der Ellipse, die den radialen Farbverlauf definiert. |
| radiusY | float | Der Radius in der y‑Dimension der Ellipse, die den radialen Farbverlauf definiert. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Erstellt einen neuen Vollfarb-Pinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Die Farbe für gefüllte Elemente. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Erstellt einen neuen Vollfarb-Pinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| color | java.awt.Color | Die Farbe für gefüllte Elemente. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Erstellt einen neuen visuellen Pinsel.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Das XPS-Element (Canvas, Path oder Glyphs) für die Visual‑Eigenschaft des visuellen Brushes. |
| Ansichtsfenster | java.awt.geom.Rectangle2D | Die Position und Abmessungen des Quellinhalts des Pinsels. |
| Ansichtsfenster | java.awt.geom.Rectangle2D | Der Bereich im umgebenden Koordinatenraum des primären Pinseltiles, der (möglicherweise wiederholt) angewendet wird, um den Bereich zu füllen, auf den der Pinsel angewendet wird. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Gibt die Nummer des aktiven Dokuments zurück.

**Returns:**
int - Der int‑Wert.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Gibt die Nummer der aktiven Seite im aktiven Dokument zurück.

**Returns:**
int - Der int‑Wert.
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


Gibt die Anzahl der Dokumente im XPS-Paket zurück.

**Returns:**
int - Die Anzahl der Dokumente im XPS-Paket.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Liest das Druckticket des Dokuments mit dem Index  documentIndex .

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| documentIndex | int | Index des Dokuments, dessen Druckticket zurückgegeben werden soll. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Gibt das Druckticket des Dokuments zurück.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Gibt die  XpsPage  Instanz für die aktive Seite zurück.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Gibt die Anzahl der Seiten im aktiven Dokument zurück.

**Returns:**
int – Die Anzahl der Seiten im aktiven Dokument.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Liest das Druckticket der Seite mit dem Index  pageIndex  im Dokument mit dem Index  documentIndex .

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| documentIndex | int | Index des Dokuments. |
| pageIndex | int | Index der Seite, deren Druckticket zurückgegeben werden soll. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Gibt die Gesamtzahl der Seiten in allen Dokumenten innerhalb des XPS-Dokuments zurück.

**Returns:**
int – Die Gesamtzahl der Seiten in allen Dokumenten innerhalb des XPS-Dokuments.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Ruft das Objekt ab, das Dienstprogramme über die formale XPS-Manipulations-API hinaus bereitstellt.

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


Fügt der aktiven Seite ein neues Canvas an der Position  index  ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein neues Canvas eingefügt werden soll. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Fügt ein leeres Dokument mit Standardseitengröße an der Position  index  ein und wählt das eingefügte Dokument als aktiv aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Dokument eingefügt werden soll. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Fügt ein leeres Dokument mit Standardseitengröße an der Position  index  ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Dokument eingefügt werden soll. |
| aktivieren | boolean | Flag, das angibt, ob das eingefügte Dokument als aktiv ausgewählt werden soll. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Fügt ein leeres Dokument mit den Abmessungen der ersten Seite  width  und  height  an der Position  index  ein und wählt das eingefügte Dokument als aktiv aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Dokument eingefügt werden soll. |
| Breite | float | Breite der ersten Seite. |
| Höhe | float | Höhe der ersten Seite. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Fügt ein leeres Dokument mit den Abmessungen der ersten Seite width und height an der Position index ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Dokument eingefügt werden soll. |
| Breite | float | Breite der ersten Seite. |
| Höhe | float | Höhe der ersten Seite. |
| aktivieren | boolean | Flag, das angibt, ob das eingefügte Dokument als aktiv ausgewählt werden soll. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Fügt neue Glyphen zur aktiven Seite an der Position index ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der neue Glyphen eingefügt werden sollen. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font-Ressource. |
| fontSize | float | Schriftgröße. |
| originX | float | X-Koordinate des Glyph-Ursprungs. |
| originY | float | Y-Koordinate des Glyph-Ursprungs. |
| unicodeString | java.lang.String | Zu druckende Zeichenkette. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Fügt neue Glyphen zur aktiven Seite an der Position index ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der neue Glyphen eingefügt werden sollen. |
| fontFamily | java.lang.String | Schriftfamilie. |
| fontSize | float | Schriftgröße. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Schriftstil. |
| originX | float | X-Koordinate des Glyph-Ursprungs. |
| originY | float | Y-Koordinate des Glyph-Ursprungs. |
| unicodeString | java.lang.String | Zu druckende Zeichenkette. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Fügt eine leere Seite zum Dokument mit Standardseitengröße an der Position index ein und wählt die eingefügte Seite als aktiv aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der eine Seite eingefügt werden soll. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Fügt eine leere Seite zum Dokument mit Standardseitengröße an der Position index ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der eine Seite eingefügt werden soll. |
| aktivieren | boolean | Flag, das angibt, ob die eingefügte Seite als aktiv ausgewählt werden soll. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Fügt eine Seite zum Dokument an der Position index ein und wählt die eingefügte Seite als aktiv aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der eine Seite hinzugefügt werden soll. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Einzufügende Seite. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Fügt eine Seite zum Dokument an der Position index ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der eine Seite hinzugefügt werden soll. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Einzufügende Seite. |
| aktivieren | boolean | Flag, das angibt, ob die eingefügte Seite als aktiv ausgewählt werden soll. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Fügt eine leere Seite zum Dokument mit angegebenen width und height an der Position index ein und wählt die eingefügte Seite als aktiv aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der eine Seite eingefügt werden soll. |
| Breite | float | Breite einer neuen Seite. |
| Höhe | float | Höhe einer neuen Seite. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Fügt eine leere Seite zum Dokument mit angegebenen width und height an der Position index ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der eine Seite eingefügt werden soll. |
| Breite | float | Breite einer neuen Seite. |
| Höhe | float | Höhe einer neuen Seite. |
| aktivieren | boolean | Flag, das angibt, ob die eingefügte Seite als aktiv ausgewählt werden soll. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Fügt einen neuen Pfad zur aktiven Seite an der Position index ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein neuer Pfad eingefügt werden soll. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Geometrie des Pfads. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Gibt an, ob die Lizenz für Aspose.Page für Java abgerufen und gültig ist.

**Returns:**
boolean - boolescher Wert
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Zusammenführen mehrerer XPS-Dateien zu einem XPS-Dokument.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-Dateien zum Zusammenführen mit diesem Dokument. |
| outStream | java.io.OutputStream | Der Ausgabestream, in dem zusammengeführte XPS-Dokumente gespeichert werden sollen. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Zusammenführen mehrerer XPS-Dateien zu einem XPS-Dokument.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-Dateien zum Zusammenführen mit diesem Dokument. |
| outXpsFilePath | java.lang.String | Der Ausgabepfad der XPS-Datei. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Zusammenführen von XPS-Dokumenten zu PDF unter Verwendung der Device Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Der Ausgabepfad der PDF-Datei. |
| filesForMerge | java.lang.String[] | XPS-Dateien zum Zusammenführen mit diesem Dokument zu einem Ausgabegerät. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Optionen zum Speichern des Dokuments. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Zusammenführen von XPS-Dokumenten zu PDF unter Verwendung der Device Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | XPS-Dateien zum Zusammenführen mit diesem Dokument zu einem Ausgabegerät. |
| pdfStream | java.io.OutputStream | Der Ausgabestream, in den das resultierende PDF geschrieben werden soll. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Optionen zum Speichern des Dokuments. |

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


Entfernt ein Element an der Position index von der aktiven Seite.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der das Element entfernt werden soll. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Entfernt ein Dokument an der Position index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Dokument entfernt werden soll. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Entfernt eine Seite aus dem Dokument.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Zu entfernende Seite. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Entfernt eine Seite aus dem Dokument an der Position index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der eine Seite entfernt werden soll. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Speichert das Dokument unter Verwendung der Device Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Die  Device  Instanz. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Optionen zum Speichern des Dokuments. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Speichert das XPS-Dokument in einen Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.OutputStream | Stream XPS-Dokument, in das gespeichert werden soll. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Speichert das XPS-Dokument in die XPS-Datei, die sich unter dem Pfad path befindet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.lang.String | Speicherort des Dokuments. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Speichert das Dokument in eine Bilddatei. Das Ausgabeverzeichnis und der Dateiname entsprechen denen der Eingabe‑XPS‑Datei. Die Dateierweiterung entspricht dem Bildformat im Parameter "options". Wenn das Dokument mit einem Stream initialisiert wurde, der kein FileInputStream ist, wird die Bilddatei im aktuellen Ordner mit einer Standard‑Dateinamen‑Vorlage gespeichert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Optionen zum Speichern des Dokuments im Bitmap‑Bildformat. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Speichert das Dokument in eine Bilddatei im angegebenen Verzeichnis mit dem angegebenen Dateinamen. Die Dateierweiterung entspricht dem Bildformat im Parameter "options".

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Optionen zum Speichern des Dokuments im Bitmap‑Bildformat. |
| outDir | java.lang.String | Das Ausgabeverzeichnis, in dem die Bilddatei gespeichert wird. |
| fileNameTemplate | java.lang.String | Die Dateinamen‑Vorlage für das Bild (ohne Erweiterung). Wenn die Eingabe‑XPS‑Datei einseitig ist, entspricht sie exakt dem Datenamen, andernfalls "\_[n]", wobei "n" die Seitennummer ab 1 ist; ein Suffix wird daran angehängt. Die Dateierweiterung entspricht dem Bildformat im Parameter "option". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Speichert das Dokument im Bitmap-Bildformat als Byte-Arrays.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Optionen zum Speichern des Dokuments im Bitmap‑Bildformat. |

**Returns:**
byte[][][] - Die resultierenden Bild‑Byte‑Arrays. Die erste Dimension ist für innere Dokumente und die zweite für Seiten innerhalb innerer Dokumente.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Speichert das Dokument im PDF-Format.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.OutputStream | Der Stream, in den die Ausgabedatei im PDF‑Format geschrieben wird. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Optionen zum Speichern des Dokuments im PDF‑Format. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Speichert das Dokument im PDF-Format.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Der Ausgabepfad der PDF-Datei. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Optionen zum Speichern des Dokuments im PDF‑Format. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Speichert das Dokument im PS-Format.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | java.io.OutputStream | Der Stream, in den die Ausgabedatei im PS‑Format geschrieben wird. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Optionen zum Speichern des Dokuments im PS‑Format. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Speichert das Dokument im PostScript-Format.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Der Pfad zur Ausgabedatei im PostScript‑Format. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Optionen zum Speichern des Dokuments im PDF‑Format. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Wählt ein aktives Dokument zum Bearbeiten aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| documentNumber | int | Eine Dokumentnummer. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Wählt eine aktive Dokumentseite zur Bearbeitung aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pageNumber | int | Eine Seitennummer. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Verknüpft das  printTicket  mit dem Dokument, das durch  documentIndex  indiziert ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| documentIndex | int | Index des Dokuments, dem das Druckticket zugeordnet werden soll. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | Das zu verknüpfende Druckticket. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Setzt das Job-Druckticket des Dokuments.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | Das Druckticket des Dokuments. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Verknüpft das  printTicket  mit der Seite, die durch  pageIndex  im Dokument, das durch  documentIndex  indiziert ist, referenziert wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| documentIndex | int | Index des Dokuments. |
| pageIndex | int | Index der Seite, dem das Druckticket zugeordnet werden soll. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | Das zu verknüpfende Druckticket. |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

