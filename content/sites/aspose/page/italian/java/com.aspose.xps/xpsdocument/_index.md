---
title: "XpsDocument"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula l'entità principale del documento XPS che fornisce metodi di manipolazione per qualsiasi elemento XPS."
type: docs
weight: 19
url: /it/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Classe che incapsula l'entità principale del documento XPS che fornisce metodi di manipolazione per qualsiasi elemento XPS.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Crea un documento XPS vuoto con dimensione pagina predefinita. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Apre un documento XPS esistente situato al  percorso . |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Carica un documento esistente memorizzato nello  stream  come documento XPS. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Aggiunge un elemento di contenuto (Canvas, Path o Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserisce un elemento (Canvas, Path o Glyphs) nella pagina attiva alla posizione  index . |
| [<T>remove(T element)](#-T-remove-T-) | Rimuove un elemento dalla pagina attiva. |
| [addCanvas()](#addCanvas--) | Aggiunge una nuova canvas alla pagina attiva. |
| [addDocument()](#addDocument--) | Aggiunge un documento vuoto con dimensione pagina predefinita e seleziona il documento aggiunto come attivo. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Aggiunge un documento vuoto con dimensione pagina predefinita. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Aggiunge un documento vuoto con le dimensioni della prima pagina  width  e  height  e seleziona il documento aggiunto come attivo. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Aggiunge un documento vuoto con le dimensioni della prima pagina  width  e  height . |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Aggiunge nuovi glifi alla pagina attiva. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Aggiunge nuovi glifi alla pagina attiva. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Aggiunge una voce di contorno al documento. |
| [addPage()](#addPage--) | Aggiunge una pagina vuota al documento con dimensione di pagina predefinita. |
| [addPage(boolean activate)](#addPage-boolean-) | Aggiunge una pagina vuota al documento con dimensione di pagina predefinita. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Aggiunge una pagina al documento e seleziona la pagina aggiunta come attiva. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Aggiunge una pagina al documento. |
| [addPage(float width, float height)](#addPage-float-float-) | Aggiunge una pagina vuota al documento con  width  e  height  specificati. |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Aggiunge una pagina vuota al documento con  width  e  height  specificati. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Aggiunge un nuovo percorso alla pagina attiva. |
| [close()](#close--) | Rilascia l'istanza. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Crea un nuovo segmento di arco ellittico tracciato. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Crea un nuovo segmento di arco ellittico. |
| [createCanvas()](#createCanvas--) | Crea un nuovo canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Crea un nuovo colore nello spazio colore basato su ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Crea un nuovo colore nello spazio colore scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Crea un nuovo colore nello spazio colore scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Crea un nuovo colore nello spazio colore sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Crea un nuovo colore nello spazio colore sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Crea un nuovo colore. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Crea un nuovo colore nello spazio colore basato su ICC. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Crea una nuova risorsa di font TrueType dallo stream. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Crea una nuova risorsa di font TrueType. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Crea nuovi glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Crea nuovi glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Crea una nuova fermata di gradiente. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Crea una nuova fermata di gradiente. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Crea una nuova risorsa di profilo ICC dallo  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Crea una nuova risorsa di profilo ICC dal file di profilo ICC situato al  iccProfilePath . |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Crea una nuova risorsa immagine dallo  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Crea una nuova risorsa immagine dal file immagine situato al  imagePath . |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuovo pennello immagine. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuovo pennello immagine. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crea un nuovo pennello di gradiente lineare. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crea un nuovo pennello di gradiente lineare. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Crea una nuova matrice di trasformazione affine. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Crea un nuovo Path. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Crea una nuova figura di percorso aperto. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Crea una nuova figura di percorso. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Crea una nuova figura di percorso aperto. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Crea una nuova figura di percorso. |
| [createPathGeometry()](#createPathGeometry--) | Crea una nuova geometria di percorso. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Crea una nuova geometria di percorso specificata in forma abbreviata. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Crea una nuova geometria di percorso con l'elenco specificato di figure di percorso. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Crea un nuovo insieme di curve cubiche B?zier tracciate. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Crea un nuovo insieme di curve cubiche B?zier. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Crea un nuovo disegno poligonale tracciato contenente un numero arbitrario di vertici individuali. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Crea un nuovo disegno poligonale contenente un numero arbitrario di vertici individuali. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Crea un nuovo insieme di curve quadratiche B?zier tracciate dal punto precedente nella figura di percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Crea un nuovo insieme di curve quadratiche B?bezier dal punto precedente nella figura di percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crea un nuovo pennello a gradiente radiale. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crea un nuovo pennello a gradiente radiale. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Crea un nuovo pennello a colore solido. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Crea un nuovo pennello a colore solido. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuovo pennello visivo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | Restituisce il numero del documento attivo. |
| [getActivePage()](#getActivePage--) | Restituisce il numero della pagina attiva all'interno del documento attivo. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Restituisce il numero di documenti all'interno del pacchetto XPS. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Ottiene il ticket di stampa del documento indicizzato da  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Restituisce il ticket di stampa del lavoro del documento. |
| [getPage()](#getPage--) | Restituisce l'istanza  XpsPage  per la pagina attiva. |
| [getPageCount()](#getPageCount--) | Restituisce il numero di pagine nel documento attivo. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Ottiene il ticket di stampa della pagina indicizzata da  pageIndex  nel documento indicizzato da  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Restituisce il numero totale di pagine in tutti i documenti all'interno del documento XPS. |
| [getUtils()](#getUtils--) | Ottiene l'oggetto che fornisce utilità oltre l'API formale di manipolazione XPS. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserisce una nuova tela nella pagina attiva alla posizione  index . |
| [insertDocument(int index)](#insertDocument-int-) | Inserisce un documento vuoto con dimensione di pagina predefinita alla posizione  index  e seleziona il documento inserito come attivo. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Inserisce un documento vuoto con dimensione di pagina predefinita alla posizione  index . |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Inserisce un documento vuoto con le dimensioni della prima pagina  width  e  height  alla posizione  index  e seleziona il documento inserito come attivo. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Inserisce un documento vuoto con le dimensioni della prima pagina  width  e  height  alla posizione  index . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Inserisce nuovi glifi nella pagina attiva alla posizione  index . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserisce nuovi glifi nella pagina attiva alla posizione  index . |
| [insertPage(int index)](#insertPage-int-) | Inserisce una pagina vuota nel documento con dimensione di pagina predefinita alla posizione  index  e seleziona la pagina inserita come attiva. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Inserisce una pagina vuota nel documento con dimensione di pagina predefinita alla posizione  index . |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Inserisce una pagina nel documento alla posizione  index  e seleziona la pagina inserita come attiva. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Inserisce una pagina nel documento alla posizione  index . |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Inserisce una pagina vuota nel documento con  width  e  height  specificati alla posizione  index  e seleziona la pagina inserita come attiva. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Inserisce una pagina vuota nel documento con  width  e  height  specificati alla posizione  index . |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserisce un nuovo percorso nella pagina attiva alla posizione  index . |
| [isLicensed()](#isLicensed--) | Indica se la licenza del prodotto Aspose.Page per Java è accessibile e valida. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Unione di diversi file XPS in un unico documento XPS. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Unione di diversi file XPS in un unico documento XPS. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Unione di documenti XPS in PDF usando l'istanza  Device . |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Unione di documenti XPS in PDF usando l'istanza  Device . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Rimuove un elemento alla posizione  index  dalla pagina attiva. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Rimuove un documento alla posizione  index . |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Rimuove una pagina dal documento. |
| [removePageAt(int index)](#removePageAt-int-) | Rimuove una pagina dal documento alla posizione  index . |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Salva il documento usando l'istanza  Device . |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Salva il documento XPS in uno stream. |
| [save(String path)](#save-java.lang.String-) | Salva il documento XPS nel file XPS situato al  path . |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Salva il documento in un file immagine. La directory di output e il nome del file saranno gli stessi del file XPS di input. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Salva il documento in un file immagine nella directory specificata con il nome file specificato. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Salva il documento in formato immagine bitmap come array di byte. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Salva il documento in formato PDF. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Salva il documento in formato PDF. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Salva il documento in formato PS. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Salva il documento in formato PostSscript. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Seleziona un documento attivo per la modifica. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Seleziona una pagina di documento attiva per la modifica. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Collega il  printTicket  al documento indicizzato da  documentIndex . |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Imposta il ticket di stampa del lavoro del documento. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Collega il  printTicket  alla pagina indicizzata da  pageIndex  nel documento indicizzato da  documentIndex . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Crea un documento XPS vuoto con dimensione pagina predefinita.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Apre un documento XPS esistente situato al  percorso .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | java.lang.String | Posizione del documento. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Carica un documento esistente memorizzato nello  stream  come documento XPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.InputStream | Stream del documento. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Opzioni di caricamento del documento. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Aggiunge un elemento di contenuto (Canvas, Path o Glyphs)

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| elemento | T | L'elemento da aggiungere. |

**Returns:**
T - Elemento aggiunto.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Inserisce un elemento (Canvas, Path o Glyphs) nella pagina attiva alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un elemento dovrebbe essere inserito. |
| elemento | T | L'elemento da inserire. |

**Returns:**
T - Elemento inserito.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Rimuove un elemento dalla pagina attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| elemento | T | L'elemento da rimuovere. |

**Returns:**
T - Elemento rimosso.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Aggiunge una nuova canvas alla pagina attiva.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Aggiunge un documento vuoto con dimensione pagina predefinita e seleziona il documento aggiunto come attivo.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Aggiunge un documento vuoto con dimensione pagina predefinita.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| attiva | boolean | Flag che indica se selezionare il documento aggiunto come attivo. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Aggiunge un documento vuoto con le dimensioni della prima pagina  width  e  height  e seleziona il documento aggiunto come attivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float | Larghezza della prima pagina. |
| altezza | float | Altezza della prima pagina. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Aggiunge un documento vuoto con le dimensioni della prima pagina  width  e  height .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float | Larghezza della prima pagina. |
| altezza | float | Altezza della prima pagina. |
| attiva | boolean | Flag che indica se selezionare il documento aggiunto come attivo. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Aggiunge nuovi glifi alla pagina attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Risorsa del font. |
| fontRenderingEmSize | float | Dimensione del font. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Aggiunge nuovi glifi alla pagina attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontFamily | java.lang.String | Famiglia del font. |
| fontRenderingEmSize | float | Dimensione del font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Stile del carattere. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Aggiunge una voce di contorno al documento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| description | java.lang.String | La descrizione della voce. |
| outlineLevel | int | Il livello di contorno. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | L'obiettivo di ingresso. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Aggiunge una pagina vuota al documento con dimensione di pagina predefinita.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Aggiunge una pagina vuota al documento con dimensione di pagina predefinita.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| attiva | boolean | Flag che indica se selezionare la pagina aggiunta come attiva. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Aggiunge una pagina al documento e seleziona la pagina aggiunta come attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina da aggiungere. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Aggiunge una pagina al documento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina da aggiungere. |
| attiva | boolean | Flag che indica se selezionare la pagina aggiunta come attiva. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Aggiunge una pagina vuota al documento con  width  e  height  specificati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float | Larghezza di una nuova pagina. |
| altezza | float | Altezza di una nuova pagina. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Aggiunge una pagina vuota al documento con  width  e  height  specificati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float | Larghezza di una nuova pagina. |
| altezza | float | Altezza di una nuova pagina. |
| attiva | boolean | Flag che indica se selezionare la pagina aggiunta come attiva. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Aggiunge un nuovo percorso alla pagina attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Rilascia l'istanza.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Crea un nuovo segmento di arco ellittico tracciato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| punto | java.awt.geom.Point2D | Il punto finale dell'arco ellittico. |
| dimensione | java.awt.geom.Dimension2D | Il raggio x e y dell'arco ellittico come coppia x,y. |
| rotationAngle | float | Indica come l'ellisse è ruotata rispetto al sistema di coordinate corrente. |
| isLargeArc | boolean | Determina se l'arco è disegnato con una sweep di 180 gradi o più. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La direzione in cui l'arco è disegnato. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Crea un nuovo segmento di arco ellittico.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| punto | java.awt.geom.Point2D | Il punto finale dell'arco ellittico. |
| dimensione | java.awt.geom.Dimension2D | Il raggio x e y dell'arco ellittico come coppia x,y. |
| rotationAngle | float | Indica come l'ellisse è ruotata rispetto al sistema di coordinate corrente. |
| isLargeArc | boolean | Determina se l'arco è disegnato con una sweep di 180 gradi o più. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La direzione in cui l'arco è disegnato. |
| isStroked | boolean | Specifica se il tratto per questo segmento del percorso è disegnato. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Crea un nuovo canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Crea un nuovo colore nello spazio colore basato su ICC.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | La risorsa del profilo ICC. |
| components | float[] | Componenti di colore. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Crea un nuovo colore nello spazio colore scRGB.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| r | float | Il componente di colore rosso. |
| g | float | Il componente di colore verde. |
| b | float | Il componente di colore blu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Crea un nuovo colore nello spazio colore scRGB.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | float | Il componente di colore alfa. |
| r | float | Il componente di colore rosso. |
| g | float | Il componente di colore verde. |
| b | float | Il componente di colore blu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Crea un nuovo colore nello spazio colore sRGB.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| r | int | Il componente di colore rosso. |
| g | int | Il componente di colore verde. |
| b | int | Il componente di colore blu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Crea un nuovo colore nello spazio colore sRGB.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | int | Il componente di colore alfa. |
| r | int | Il componente di colore rosso. |
| g | int | Il componente di colore verde. |
| b | int | Il componente di colore blu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Crea un nuovo colore.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | java.awt.Color | Un'istanza di colore nativa per il colore RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Crea un nuovo colore nello spazio colore basato su ICC.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | java.lang.String | Il percorso al profilo ICC. |
| components | float[] | Componenti di colore. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Crea una nuova risorsa di font TrueType dallo stream.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.InputStream | Lo stream contenente il profilo ICC da utilizzare come risorsa. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Crea una nuova risorsa di font TrueType.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontFamily | java.lang.String | La famiglia di caratteri. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Lo stile del carattere. Vedi le costanti della classe  XpsFont  (che sono flag bit) per i valori disponibili da combinare. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Crea nuovi glyphs.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Risorsa del font. |
| fontRenderingEmSize | float | Dimensione del font. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Crea nuovi glyphs.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontFamily | java.lang.String | Famiglia del font. |
| fontRenderingEmSize | float | Dimensione del font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Stile del carattere. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Crea una nuova fermata di gradiente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Il colore di arresto del gradiente. |
| offset | float | L'offset del gradiente. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Crea una nuova fermata di gradiente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | java.awt.Color | Il colore di arresto del gradiente. |
| offset | float | L'offset del gradiente. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Crea una nuova risorsa di profilo ICC dallo  stream .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.InputStream | Lo stream contenente il profilo ICC da utilizzare come risorsa. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Crea una nuova risorsa di profilo ICC dal file di profilo ICC situato al  iccProfilePath .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| iccProfilePath | java.lang.String | Il percorso del profilo ICC da utilizzare come risorsa. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Crea una nuova risorsa immagine dallo  stream .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.InputStream | Lo stream contenente l'immagine da utilizzare come risorsa. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Crea una nuova risorsa immagine dal file immagine situato al  imagePath .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imagePath | java.lang.String | Il percorso dell'immagine da utilizzare come risorsa. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuovo pennello immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Una risorsa immagine. |
| viewbox | java.awt.geom.Rectangle2D | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | java.awt.geom.Rectangle2D | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuovo pennello immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imagePath | java.lang.String | Il percorso dell'immagine da utilizzare come tessera del pennello. |
| viewbox | java.awt.geom.Rectangle2D | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | java.awt.geom.Rectangle2D | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Crea un nuovo pennello di gradiente lineare.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza del gradiente lineare. |
| endPoint | java.awt.geom.Point2D | Il punto finale del gradiente lineare. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Crea un nuovo pennello di gradiente lineare.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | L'elenco delle fermate del gradiente. |
| startPoint | java.awt.geom.Point2D | Il punto di partenza del gradiente lineare. |
| endPoint | java.awt.geom.Point2D | Il punto finale del gradiente lineare. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Crea una nuova matrice di trasformazione affine.

**Parameters:**
| Parametro | Tipo | Descrizione |
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


Crea un nuovo Path.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Crea una nuova figura di percorso aperto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Crea una nuova figura di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |
| isClosed | boolean | Specifica se il percorso è chiuso. Se impostato su true, il tratto è disegnato \"closed\", cioè l'ultimo punto dell'ultimo segmento della figura del percorso è collegato al punto specificato nell'attributo StartPoint, altrimenti il tratto è disegnato \"open\" e l'ultimo punto non è collegato al punto di partenza. Applicabile solo se la figura del percorso è utilizzata in un elemento Path che specifica un tratto. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Crea una nuova figura di percorso aperto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Elenco di segmenti di percorso. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Crea una nuova figura di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Elenco di segmenti di percorso. |
| isClosed | boolean | Specifica se il percorso è chiuso. Se impostato su true, il tratto è disegnato \"closed\", cioè l'ultimo punto dell'ultimo segmento della figura del percorso è collegato al punto specificato nell'attributo StartPoint, altrimenti il tratto è disegnato \"open\" e l'ultimo punto non è collegato al punto di partenza. Applicabile solo se la figura del percorso è utilizzata in un elemento Path che specifica un tratto. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Crea una nuova geometria di percorso.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Crea una nuova geometria di percorso specificata in forma abbreviata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Forma abbreviata della geometria del percorso. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Crea una nuova geometria di percorso con l'elenco specificato di figure di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Elenco di figure del percorso. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Crea un nuovo insieme di curve cubiche B?zier tracciate.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Punti di controllo per più segmenti B?bezier. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Crea un nuovo insieme di curve cubiche B?zier.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Punti di controllo per più segmenti B?bezier. |
| isStroked | boolean | Specifica se il tratto per questo segmento del percorso è disegnato. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Crea un nuovo disegno poligonale tracciato contenente un numero arbitrario di vertici individuali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Un insieme di coordinate per i molteplici segmenti che definiscono il segmento di polilinea. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Crea un nuovo disegno poligonale contenente un numero arbitrario di vertici individuali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Un insieme di coordinate per i molteplici segmenti che definiscono il segmento di polilinea. |
| isStroked | boolean | Specifica se il tratto per questo segmento del percorso è disegnato. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Crea un nuovo insieme di curve quadratiche B?zier tracciate dal punto precedente nella figura di percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Punti di controllo per più segmenti B?bezier quadratici. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Crea un nuovo insieme di curve quadratiche B?bezier dal punto precedente nella figura di percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Punti di controllo per più segmenti B?bezier quadratici. |
| isStroked | boolean | Specifica se il tratto per questo segmento del percorso è disegnato. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crea un nuovo pennello a gradiente radiale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Il punto centrale del gradiente radiale (cioè il centro dell'ellisse). |
| gradientOrigin | java.awt.geom.Point2D | Il punto di origine del gradiente radiale. |
| radiusX | float | Il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |
| radiusY | float | Il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crea un nuovo pennello a gradiente radiale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | L'elenco delle fermate del gradiente. |
| center | java.awt.geom.Point2D | Il punto centrale del gradiente radiale (cioè il centro dell'ellisse). |
| gradientOrigin | java.awt.geom.Point2D | Il punto di origine del gradiente radiale. |
| radiusX | float | Il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |
| radiusY | float | Il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Crea un nuovo pennello a colore solido.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Il colore per gli elementi riempiti. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Crea un nuovo pennello a colore solido.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | java.awt.Color | Il colore per gli elementi riempiti. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuovo pennello visivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | L'elemento XPS (Canvas, Path o Glyphs) per la proprietà Visual del pennello visivo. |
| viewbox | java.awt.geom.Rectangle2D | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | java.awt.geom.Rectangle2D | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Restituisce il numero del documento attivo.

**Returns:**
int - Il valore int.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Restituisce il numero della pagina attiva all'interno del documento attivo.

**Returns:**
int - Il valore int.
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


Restituisce il numero di documenti all'interno del pacchetto XPS.

**Returns:**
int - Il numero di documenti all'interno del pacchetto XPS.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Ottiene il ticket di stampa del documento indicizzato da  documentIndex .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| documentIndex | int | Indice del documento il cui ticket di stampa restituire. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Restituisce il ticket di stampa del lavoro del documento.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Restituisce l'istanza  XpsPage  per la pagina attiva.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Restituisce il numero di pagine nel documento attivo.

**Returns:**
int - Il numero di pagine nel documento attivo.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Ottiene il ticket di stampa della pagina indicizzata da  pageIndex  nel documento indicizzato da  documentIndex .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| documentIndex | int | Indice del documento. |
| pageIndex | int | Indice della pagina il cui ticket di stampa restituire. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Restituisce il numero totale di pagine in tutti i documenti all'interno del documento XPS.

**Returns:**
int - Il numero totale di pagine in tutti i documenti all'interno del documento XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Ottiene l'oggetto che fornisce utilità oltre l'API formale di manipolazione XPS.

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


Inserisce una nuova tela nella pagina attiva alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbe essere inserito un nuovo canvas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Inserisce un documento vuoto con dimensione di pagina predefinita alla posizione  index  e seleziona il documento inserito come attivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un documento dovrebbe essere inserito. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Inserisce un documento vuoto con dimensione di pagina predefinita alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un documento dovrebbe essere inserito. |
| attiva | boolean | Flag che indica se selezionare il documento inserito come attivo. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Inserisce un documento vuoto con le dimensioni della prima pagina  width  e  height  alla posizione  index  e seleziona il documento inserito come attivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un documento dovrebbe essere inserito. |
| larghezza | float | Larghezza della prima pagina. |
| altezza | float | Altezza della prima pagina. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Inserisce un documento vuoto con le dimensioni della prima pagina  width  e  height  alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un documento dovrebbe essere inserito. |
| larghezza | float | Larghezza della prima pagina. |
| altezza | float | Altezza della prima pagina. |
| attiva | boolean | Flag che indica se selezionare il documento inserito come attivo. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Inserisce nuovi glifi nella pagina attiva alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbero essere inseriti nuovi glyphs. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Risorsa del font. |
| fontSize | float | Dimensione del font. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserisce nuovi glifi nella pagina attiva alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbero essere inseriti nuovi glyphs. |
| fontFamily | java.lang.String | Famiglia del font. |
| fontSize | float | Dimensione del font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Stile del carattere. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Inserisce una pagina vuota nel documento con dimensione di pagina predefinita alla posizione  index  e seleziona la pagina inserita come attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui una pagina dovrebbe essere inserita. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Inserisce una pagina vuota nel documento con dimensione di pagina predefinita alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui una pagina dovrebbe essere inserita. |
| attiva | boolean | Flag che indica se selezionare la pagina inserita come attiva. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Inserisce una pagina nel documento alla posizione  index  e seleziona la pagina inserita come attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui una pagina dovrebbe essere aggiunta. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina da inserire. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Inserisce una pagina nel documento alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui una pagina dovrebbe essere aggiunta. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina da inserire. |
| attiva | boolean | Flag che indica se selezionare la pagina inserita come attiva. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Inserisce una pagina vuota nel documento con  width  e  height  specificati alla posizione  index  e seleziona la pagina inserita come attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui una pagina dovrebbe essere inserita. |
| larghezza | float | Larghezza di una nuova pagina. |
| altezza | float | Altezza di una nuova pagina. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Inserisce una pagina vuota nel documento con  width  e  height  specificati alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui una pagina dovrebbe essere inserita. |
| larghezza | float | Larghezza di una nuova pagina. |
| altezza | float | Altezza di una nuova pagina. |
| attiva | boolean | Flag che indica se selezionare la pagina inserita come attiva. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserisce un nuovo percorso nella pagina attiva alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbe essere inserito un nuovo path. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Indica se la licenza del prodotto Aspose.Page per Java è accessibile e valida.

**Returns:**
boolean - valore booleano
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Unione di diversi file XPS in un unico documento XPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | File XPS per la fusione con questo documento. |
| outStream | java.io.OutputStream | Il flusso di output dove salvare i documenti XPS uniti. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Unione di diversi file XPS in un unico documento XPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | File XPS per la fusione con questo documento. |
| outXpsFilePath | java.lang.String | Il percorso del file XPS di output. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Unione di documenti XPS in PDF usando l'istanza  Device .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Il percorso del file PDF di output. |
| filesForMerge | java.lang.String[] | File XPS per la fusione con questo documento verso un dispositivo di output. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opzioni di salvataggio del documento. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Unione di documenti XPS in PDF usando l'istanza  Device .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | File XPS per la fusione con questo documento verso un dispositivo di output. |
| pdfStream | java.io.OutputStream | Il flusso di output per scrivere il PDF risultante. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opzioni di salvataggio del documento. |

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


Rimuove un elemento alla posizione  index  dalla pagina attiva.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui l'elemento dovrebbe essere rimosso. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Rimuove un documento alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un documento dovrebbe essere rimosso. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Rimuove una pagina dal documento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Pagina da rimuovere. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Rimuove una pagina dal documento alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui una pagina dovrebbe essere rimossa. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Salva il documento usando l'istanza  Device .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | L'istanza del  Device  . |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opzioni di salvataggio del documento. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Salva il documento XPS in uno stream.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream XPS documento da salvare. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Salva il documento XPS nel file XPS situato al  path .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | java.lang.String | Posizione del documento. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Salva il documento in un file immagine. La directory di output e il nome del file saranno gli stessi del file XPS di input. L'estensione del file corrisponderà al formato immagine nel parametro \"options\". Se il documento è stato inizializzato con uno stream che non è FileInputStream, il file immagine verrà salvato nella cartella corrente con il modello di nome file predefinito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opzioni per salvare il documento in un formato immagine bitmap. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Salva il documento in un file immagine nella directory specificata con il nome file specificato. L'estensione del file corrisponderà al formato immagine nel parametro \"options\".

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opzioni per salvare il documento in un formato immagine bitmap. |
| outDir | java.lang.String | La directory di output dove verrà salvato il file immagine. |
| fileNameTemplate | java.lang.String | Il modello di nome file per l'immagine (senza estensione). Se il file XPS di input è a pagina singola, sarà esattamente il nome del file, altrimenti \"\\_[n]\", dove \"n\" è il numero di pagina a partire da 1, a questo verrà aggiunto il suffisso. L'estensione del file corrisponderà al formato immagine nel parametro \"option\". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Salva il documento in formato immagine bitmap come array di byte.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opzioni per salvare il documento in un formato immagine bitmap. |

**Returns:**
byte[][][] - Gli array di byte delle immagini risultanti. La prima dimensione è per i documenti interni e la seconda per le pagine all'interno dei documenti interni.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Salva il documento in formato PDF.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.OutputStream | Lo stream su cui scrivere il file PDF di output. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opzioni per salvare il documento in formato PDF. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Salva il documento in formato PDF.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Il percorso del file PDF di output. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opzioni per salvare il documento in formato PDF. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Salva il documento in formato PS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.OutputStream | Lo stream su cui scrivere il file PS di output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Opzioni per salvare il documento in formato PS. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Salva il documento in formato PostSscript.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Il percorso del file PostScript di output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Opzioni per salvare il documento in formato PDF. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Seleziona un documento attivo per la modifica.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| documentNumber | int | Un numero di documento. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Seleziona una pagina di documento attiva per la modifica.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pageNumber | int | Un numero di pagina. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Collega il  printTicket  al documento indicizzato da  documentIndex .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| documentIndex | int | Indice del documento a cui collegare il ticket di stampa. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | Il ticket di stampa da collegare. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Imposta il ticket di stampa del lavoro del documento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | Il ticket di stampa del lavoro del documento. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Collega il  printTicket  alla pagina indicizzata da  pageIndex  nel documento indicizzato da  documentIndex .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| documentIndex | int | Indice del documento. |
| pageIndex | int | Indice della pagina a cui collegare il ticket di stampa. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | Il ticket di stampa da collegare. |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

