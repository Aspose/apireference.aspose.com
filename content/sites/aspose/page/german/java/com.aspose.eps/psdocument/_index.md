---
title: "PsDocument"
second_title: "Aspose.Page for Java API-Referenz"
description: "Diese Klasse kapselt PS/EPS-Dokumente."
type: docs
weight: 16
url: /de/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Diese Klasse kapselt PS/EPS-Dokumente.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PsDocument()](#PsDocument--) | Initialisiert ein leeres  PsDocument  mit einer initialisierten Seite. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Initialisiert ein leeres  PsDocument  mit einer initialisierten Seite. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Initialisiert ein leeres  PsDocument  mit einer initialisierten Seite. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Initialisiert ein leeres  PsDocument . |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Initialisiert ein leeres  PsDocument . |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Initialisiert ein leeres  PsDocument  , wenn die Anzahl der Postscript-Dokumentseiten im Voraus bekannt ist. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Initialisiert ein leeres  PsDocument  , wenn die Anzahl der Postscript-Dokumentseiten im Voraus bekannt ist. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Initialisiert  PsDocument  mit einer Eingabe‑PS/EPS‑Datei. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Initialisiert  PsDocument  mit einem Stream einer PS/EPS‑Datei. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Fügt dem aktuellen Grafikzustand einen Clip hinzu. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Fügt dem aktuellen Grafikzustand einen Clip hinzu und schreibt dann den Operator "newpath". |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Fügt dem aktuellen Grafikzustand ein Clipping‑Rechteck hinzu. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Fügt einen Clip aus der Kontur des angegebenen Textes in der angegebenen Schriftart hinzu. |
| [closePage()](#closePage--) | Vervollständige die aktuelle Seite. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Konvertiert Type‑1‑Schriftart zu TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Konvertiert Type‑3‑Schriftart zu TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Konvertiert Type‑3‑Schriftart zu TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Schneidet das angegebene  PsDocument  als EPS‑Datei zu. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Zeichnet einen beliebigen Pfad. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Zeichnet ein maskiertes Bild. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Zeichnet ein Bild. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Zeichnet ein transformiertes Bild mit Hintergrund. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Zeichnet ein transformiertes transparentes Bild mit Hintergrund. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Liest EPS‑Datei und extrahiert das Begrenzungsfeld des EPS‑Bildes aus dem %%BoundingBox‑Kommentar oder die Grenzen der Standardseitengröße (0, 0, 595, 842), falls dieser nicht existiert. |
| [extractEpsSize()](#extractEpsSize--) | Liest EPS‑Datei und extrahiert die Größe des EPS‑Bildes aus dem %%BoundingBox‑Kommentar oder der Standardseitengröße (595, 842), falls diese nicht existiert. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Extrahiert Text aus einer PS‑Datei. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Fülle einen beliebigen Pfad. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Ermittelt die Anzahl der Seiten im resultierenden PDF-Dokument. |
| [getPaint()](#getPaint--) | Ermittelt die Farbe im aktuellen Grafikzustand. |
| [getStroke()](#getStroke--) | Ermittelt den Strich im aktuellen Grafikzustand. |
| [getXmpMetadata()](#getXmpMetadata--) | Liest PS/EPS-Datei und extrahiert XmpMetdata, falls es bereits existiert, oder fügt ein neues hinzu, falls es nicht existiert. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Gibt an, ob die Lizenz für Aspose.Page für Java abgerufen und gültig ist. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Führt PS/EPS-Dateien zu einem Gerät zusammen. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Führt PS/EPS-Dateien zu einem Gerät zusammen. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Führt PS/EPS-Dateien zu einem Gerät zusammen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Erstellt eine neue Seite und macht sie zur aktuellen. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Erstellt eine neue Seite mit der Größe des Dokuments und macht sie zur aktuellen. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Ändert die Größe des angegebenen PsDocument als EPS-Datei. |
| [rotate(float angleRadians)](#rotate-float-) | Fügt eine Drehung gegen den Uhrzeigersinn um den Ursprung zum aktuellen Grafikzustand hinzu (drehe die aktuelle Matrix). |
| [rotate(int angleDegrees)](#rotate-int-) | Fügt eine Drehung gegen den Uhrzeigersinn um den Ursprung zum aktuellen Grafikzustand hinzu (drehe die aktuelle Matrix). |
| [save()](#save--) | Speichert das angegebene PsDocument als PS- oder EPS-Datei. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Speichert PS/EPS-Datei auf ein Gerät. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Speichert das angegebene PsDocument in den Stream. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Speichert das angegebene PsDocument als EPS-Datei. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Speichert PS/EPS-Datei als Bilddatei. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Speichert PS/EPS-Datei als Bilddatei im angegebenen Verzeichnis mit dem angegebenen Dateinamen. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Speichert PS/EPS-Datei in Bild-Byte-Arrays. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Speichert PS/EPS-Datei in einen Ausgabe-PDF-Stream. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Speichert PS/EPS-Datei als PDF-Datei. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Speichert das BufferedImage-Objekt als EPS-Datei. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Speichert das BufferedImage-Objekt als EPS-Datei. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Speichert PNG/JPEG/BMP/GIF-Bild aus dem Eingabestream in den EPS-Ausgabestream. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Speichert PNG/JPEG/BMP/GIF-Bild aus einer Datei als EPS-Datei. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Fügt eine Skalierung zum aktuellen Grafikzustand hinzu (skalieren der aktuellen Matrix). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Gibt einen Eingabestream an. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Setzt Seitengeräteparameter (siehe Operator "setpagedevice" PostScript-Spezifikation). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Setzt die Seitengröße. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Setzt die Farbe im aktuellen Grafikzustand. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Setzt den Strich im aktuellen Grafikzustand. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Setzt die aktuelle Transformation auf diese. |
| [shear(float shx, float shy)](#shear-float-float-) | Fügt eine Schertransformation zum aktuellen Grafikzustand hinzu (Scherung der aktuellen Matrix). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Fügt eine Transformation zum aktuellen Grafikzustand hinzu (verknüpft diese Matrix mit der aktuellen). |
| [translate(float x, float y)](#translate-float-float-) | Fügt eine Translation zum aktuellen Grafikzustand hinzu (verschiebt die aktuelle Matrix). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Schreibt das Wiederherstellen des aktuellen Grafikzustands (siehe PostScript-Spezifikation zum Operator "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Schreibt das Speichern des aktuellen Grafikzustands (siehe PostScript-Spezifikation zum Operator "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Initialisiert ein leeres PsDocument mit einer initialisierten Seite. Dieser Konstruktor wird nur für zusätzliche Vorgänge verwendet, die nicht mit PostScript-Dateien zusammenhängen, zum Beispiel zum Konvertieren von Schriftarten.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Initialisiert ein leeres  PsDocument  mit einer initialisierten Seite.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Der Ausgabepfad der PS/EPS-Datei. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ein Satz von Parametern, die das Speichern der PostScript-Datei steuern. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Initialisiert ein leeres  PsDocument  mit einer initialisierten Seite.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| psStream | java.io.OutputStream | Stream, in dem die PS/EPS-Datei gespeichert wird. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ein Satz von Parametern, die das Speichern der PostScript-Datei steuern. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Initialisiert ein leeres  PsDocument .

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Der Ausgabepfad der PS/EPS-Datei. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ein Satz von Parametern, die das Speichern der PostScript-Datei steuern. |
| multipaged | boolean | Wenn false, wird die Seite nicht initialisiert. In diesem Fall sollte die Seitenerstellung über einen expliziten "openPage(width, height) call" durchgeführt werden. |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Initialisiert ein leeres  PsDocument .

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| psStream | java.io.OutputStream | Stream, in dem die PS/EPS-Datei gespeichert wird. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ein Satz von Parametern, die das Speichern der PostScript-Datei steuern. |
| multipaged | boolean | Wenn false, wird die Seite nicht initialisiert. In diesem Fall sollte die Seitenerstellung über einen expliziten "openPage(width, height) call" durchgeführt werden. |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Initialisiert ein leeres  PsDocument  , wenn die Anzahl der Postscript-Dokumentseiten im Voraus bekannt ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Der Ausgabepfad der PS/EPS-Datei. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ein Satz von Parametern, die das Speichern der PostScript-Datei steuern. |
| numberOfPages | int | Die Anzahl der Seiten im PostScript-Dokument. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Initialisiert ein leeres  PsDocument  , wenn die Anzahl der Postscript-Dokumentseiten im Voraus bekannt ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| psStream | java.io.OutputStream | Stream, in dem die PS/EPS-Datei gespeichert wird. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ein Satz von Parametern, die das Speichern der PostScript-Datei steuern. |
| numberOfPages | int | Die Anzahl der Seiten im PostScript-Dokument. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Initialisiert  PsDocument  mit einer Eingabe‑PS/EPS‑Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| psFilePath | java.lang.String | PS/EPS-Dateipfad. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Initialisiert  PsDocument  mit einem Stream einer PS/EPS‑Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| psStream | java.io.InputStream | Stream der PS/EPS-Datei. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Fügt dem aktuellen Grafikzustand einen Clip hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | java.awt.Shape | Der Beschneidungspfad. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Fügt dem aktuellen Grafikzustand einen Clip hinzu und schreibt dann den Operator "newpath". Dies ist notwendig, um die Zusammenführung dieses Beschneidungspfads und einiger nachfolgender Pfade, wie Glyphen, die mit dem Operator "charpath" umrissen sind, zu vermeiden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | java.awt.Shape | Der Beschneidungspfad. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Fügt dem aktuellen Grafikzustand ein Clipping‑Rechteck hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rechteck | java.awt.geom.Rectangle2D.Float | Das Beschneidungsrechteck. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Fügt einen Clip aus der Kontur des angegebenen Textes in der angegebenen Schriftart hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der Text. |
| Schriftart | java.awt.Font | Die Schriftart. |
| x | float | Eine X‑Koordinate der Textposition. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Vervollständige die aktuelle Seite.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Konvertiert Type‑1‑Schriftart zu TrueType. Der Name der konvertierten TTF‑Schriftdatei ist derselbe wie die Eingabe‑Type‑1‑Schrift mit der Erweiterung ".ttf". Die TTF‑Datei wird im zugewiesenen Ausgabeverzeichnis gespeichert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Der Pfad zur Type‑1‑Schriftdatei.. |
| outputDir | java.lang.String | Ausgabeverzeichnis, in dem die resultierende TrueType‑Schrift gespeichert wird. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Konvertiert Type‑3‑Schriftart zu TrueType. Die TTF‑Datei wird in den bereitgestellten Ausgabestream geschrieben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Der Pfad zur Type‑3‑Schriftdatei. |
| outputStream | java.io.OutputStream | Ausgabestream, in dem die resultierende TrueType‑Schrift gespeichert wird. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Konvertiert Type‑3‑Schriftart zu TrueType. Der Name der konvertierten TTF‑Schriftdatei ist derselbe wie die Eingabe‑Type‑3‑Schrift mit der Erweiterung ".ttf". Die TTF‑Datei wird im zugewiesenen Ausgabeverzeichnis gespeichert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Der Pfad zur Type‑3‑Schriftdatei.. |
| outputDir | java.lang.String | Ausgabeverzeichnis, in dem die resultierende TrueType‑Schrift gespeichert wird. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Schneidet das angegebene PsDocument als EPS‑Datei zu. Es speichert die ursprüngliche EPS‑Datei mit aktualisiertem vorhandenen %%BoundingBox oder erstellt ein neues.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | Das Zuschneidefeld (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Zeichnet einen beliebigen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| shape | java.awt.Shape | Der Pfad zum Füllen. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Zeichnet ein maskiertes Bild.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | Das Bild zum Zeichnen. Muss im 24‑bpp RGB‑Bildformat vorliegen. |
| alphaMask1bpp | java.awt.image.BufferedImage | Die Bildmaske. Muss im 1‑bpp Bildformat vorliegen. |
| transform | java.awt.geom.AffineTransform | Die Matrix zur Bildtransformation. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Zeichnet ein Bild.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Das Bild zum Zeichnen. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Zeichnet ein transformiertes Bild mit Hintergrund.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Das Bild zum Zeichnen. |
| transform | java.awt.geom.AffineTransform | Die Matrix zur Bildtransformation. |
| bkg | java.awt.Color | Der Hintergrund für das Bild. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Transformiertes transparentes Bild mit Hintergrund zeichnen. Wenn das Bild keinen Alpha‑Kanal hat, wird es als undurchsichtiges Bild gezeichnet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Das Bild zum Zeichnen. |
| transform | java.awt.geom.AffineTransform | Die Matrix zur Bildtransformation. |
| transparencyThreshold | int | Ein Schwellenwert, der definiert, ab welchem Transparenzwert ein Pixel als vollständig transparent interpretiert wird. Alle Werte unterhalb dieses Schwellenwerts werden als vollständig undurchsichtig interpretiert. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Liest EPS‑Datei und extrahiert das Begrenzungsfeld des EPS‑Bildes aus dem %%BoundingBox‑Kommentar oder die Grenzen der Standardseitengröße (0, 0, 595, 842), falls dieser nicht existiert.

**Returns:**
int[] – Die Begrenzungsbox des EPS‑Bildes.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Liest EPS‑Datei und extrahiert die Größe des EPS‑Bildes aus dem %%BoundingBox‑Kommentar oder der Standardseitengröße (595, 842), falls diese nicht existiert.

**Returns:**
java.awt.Dimension – Die Größe des EPS‑Bildes.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Extrahiert Text aus einer PS‑Datei. Sie funktioniert nur für Text, der mit TrueType‑Schriften (Typ 42) oder zusammengesetzten Schriften (Typ 0), die aus TrueType‑Schriften bestehen, geschrieben wurde.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Die Speicheroptionen. |
| startPage | int | Die Seite, ab der (einschließlich) Text extrahiert werden soll. |
| endPage | int | Die Seite, von der ausgehend Text extrahiert werden soll. |

**Returns:**
java.lang.String - Der Text, der in den ausgewählten Seiten der PS-Datei enthalten ist.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Fülle einen beliebigen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| shape | java.awt.Shape | Der Pfad zum Füllen. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| fillPaint | java.awt.Paint | Die Füllung, die zum Malen des Inneren von Glyphen verwendet wird. |
| strokePaint | java.awt.Paint | Das java.awt.Paint, das zum Malen der Konturen von Glyphen verwendet wird. Kann jede Unterklasse der java.awt.Paint‑Klasse im JDK sein. |
| stroke | java.awt.Stroke | Der Strich, der zum Zeichnen der Konturen von Glyphen verwendet wird. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| fillPaint | java.awt.Paint | Die Füllung, die zum Malen des Inneren von Glyphen verwendet wird. |
| strokePaint | java.awt.Paint | Das java.awt.Paint, das zum Malen der Konturen von Glyphen verwendet wird. Kann jede Unterklasse der java.awt.Paint‑Klasse im JDK sein. |
| stroke | java.awt.Stroke | Der Strich, der zum Zeichnen der Konturen von Glyphen verwendet wird. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. advances Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| advances | float[] |  |
| Schriftart | java.awt.Font | Systemschriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| fillPaint | java.awt.Paint | Die Füllung, die zum Malen des Inneren von Glyphen verwendet wird. |
| strokePaint | java.awt.Paint | Das java.awt.Paint, das zum Malen der Konturen von Glyphen verwendet wird. Kann jede Unterklasse der java.awt.Paint‑Klasse im JDK sein. |
| stroke | java.awt.Stroke | Der Strich, der zum Zeichnen der Konturen von Glyphen verwendet wird. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| Schriftart | java.awt.Font | Systemschriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| fillPaint | java.awt.Paint | Die Füllung, die zum Malen des Inneren von Glyphen verwendet wird. |
| strokePaint | java.awt.Paint | Das java.awt.Paint, das zum Malen der Konturen von Glyphen verwendet wird. Kann jede Unterklasse der java.awt.Paint‑Klasse im JDK sein. |
| stroke | java.awt.Stroke | Der Strich, der zum Zeichnen der Konturen von Glyphen verwendet wird. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| fill | java.awt.Paint | Die Füllung, die zum Malen von Glyphen verwendet wird. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| fill | java.awt.Paint | Die Füllung, die zum Malen von Glyphen verwendet wird. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| Schriftart | java.awt.Font | Systemschriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| Schriftart | java.awt.Font | Die Schriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| fill | java.awt.Paint | Die Füllung, die zum Malen von Glyphen verwendet wird. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| Schriftart | java.awt.Font | Systemschriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Fügt eine Textzeichenfolge hinzu, indem das Innere der Glyphen gefüllt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| Schriftart | java.awt.Font | Die Schriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| fill | java.awt.Paint | Die Füllung, die zum Malen von Glyphen verwendet wird. |

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


Ermittelt die Anzahl der Seiten im resultierenden PDF-Dokument.

**Returns:**
int - die Anzahl der Seiten.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Ermittelt die Farbe im aktuellen Grafikzustand.

**Returns:**
java.awt.Paint - Aktuelle Farbe.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Ermittelt den Strich im aktuellen Grafikzustand.

**Returns:**
java.awt.Stroke - Aktueller Strich.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Liest PS/EPS-Datei und extrahiert XmpMetdata, falls es bereits existiert, oder fügt ein neues hinzu, falls es nicht existiert.

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


Gibt an, ob die Lizenz für Aspose.Page für Java abgerufen und gültig ist.

**Returns:**
boolean - boolescher Wert
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Führt PS/EPS-Dateien zu einem Gerät zusammen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | PS/EPS-Dateien zum Zusammenführen mit dieser Datei auf ein Ausgabegerät. |
| device | [Device](../../com.aspose.page/device) | Ein Ausgabegerät. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Enthält Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern angeben. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Führt PS/EPS-Dateien zu einem Gerät zusammen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Ein PDF-Ausgabestream. |
| filesForMerge | java.lang.String[] | PS/EPS-Dateien zum Zusammenführen mit dieser Datei auf ein Ausgabegerät. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Enthält Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern angeben. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Führt PS/EPS-Dateien zu einem Gerät zusammen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Ein Pfad für die Ausgabepdf‑Datei. |
| filesForMerge | java.lang.String[] | PS/EPS-Dateien zum Zusammenführen mit dieser Datei auf ein Ausgabegerät. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Enthält Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern angeben. |

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


Erstellt eine neue Seite und macht sie zur aktuellen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float | Die Breite der neuen Seite. |
| Höhe | float | Die Höhe der neuen Seite. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Erstellt eine neue Seite mit der Größe des Dokuments und macht sie zur aktuellen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pageName | java.lang.String | Der Name der neuen Seite. Wenn er null ist, wird der Name der Seite eine Ordnungszahl der Seite sein. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| outlinePaint | java.awt.Paint | Das java.awt.Paint, das zum Malen der Konturen von Glyphen verwendet wird. Kann jede Unterklasse der java.awt.Paint‑Klasse im JDK sein. |
| stroke | java.awt.Stroke | Der Strich, der zum Zeichnen der Konturen von Glyphen verwendet wird. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont, der zum Zeichnen von Text verwendet wird. Er kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| outlinePaint | java.awt.Paint | Das java.awt.Paint, das zum Malen der Konturen von Glyphen verwendet wird. Kann jede Unterklasse der java.awt.Paint‑Klasse im JDK sein. |
| stroke | java.awt.Stroke | Der Strich, der zum Zeichnen der Konturen von Glyphen verwendet wird. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| Schriftart | java.awt.Font | Systemschriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| advances | float[] | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| Schriftart | java.awt.Font | Die Schriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| outlinePaint | java.awt.Paint | Das java.awt.Paint, das zum Malen der Konturen von Glyphen verwendet wird. Kann jede Unterklasse der java.awt.Paint‑Klasse im JDK sein. |
| stroke | java.awt.Stroke | Der Strich, der zum Zeichnen der Konturen von Glyphen verwendet wird. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| Schriftart | java.awt.Font | Systemschriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Fügt eine Textzeichenfolge hinzu, indem die Konturen der Glyphen gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | java.lang.String | Der hinzuzufügende Text. |
| Schriftart | java.awt.Font | Die Schriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X‑Koordinate für den Textursprung. |
| y | float | Y‑Koordinate für den Textursprung. |
| outlinePaint | java.awt.Paint | Das java.awt.Paint, das zum Malen der Konturen von Glyphen verwendet wird. Kann jede Unterklasse der java.awt.Paint‑Klasse im JDK sein. |
| stroke | java.awt.Stroke | Der Strich, der zum Zeichnen der Konturen von Glyphen verwendet wird. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Ändert die Größe des angegebenen PsDocument als EPS-Datei. Diese Methode wird nur nach dem Extrahieren der EPS-Größe verwendet. Sie speichert die ursprüngliche EPS-Datei mit aktualisiertem vorhandenen %%BoundingBox oder erstellt ein neues. Die Transformationsmatrix der Seite wird ebenfalls gesetzt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Neue Größe des EPS-Bildes in zugewiesenen Einheiten. |
| units | [Units](../../com.aspose.page/units) | Die Einheiten der neuen Größe. Können Punkte, Zoll, Millimeter, Zentimeter und Prozentsätze der ursprünglichen Größe sein. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Fügt eine Drehung gegen den Uhrzeigersinn um den Ursprung zum aktuellen Grafikzustand hinzu (drehe die aktuelle Matrix).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angleRadians | float | Der Drehwinkel in Radianten. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Fügt eine Drehung gegen den Uhrzeigersinn um den Ursprung zum aktuellen Grafikzustand hinzu (drehe die aktuelle Matrix).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angleDegrees | int | Der Drehwinkel in Grad. |

### save() {#save--}
```
public void save()
```


Speichert das angegebene PsDocument als PS- oder EPS-Datei. Diese Methode wird nur verwendet, wenn das PsDocument von Grund auf neu erstellt wurde.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Speichert PS/EPS-Datei auf ein Gerät.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Ein Ausgabegerät. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Enthält Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern angeben. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Speichert das angegebene PsDocument in den Stream. Diese Methode wird nur nach dem Aktualisieren von XMP-Metadaten verwendet. Sie speichert die ursprüngliche EPS-Datei mit aktualisierten vorhandenen Metadaten oder erstellt eine neue, während die getMetadata‑Methode aufgerufen wird. Im letzten Fall werden alle erforderlichen PostScript‑Code und EPS‑Kommentare hinzugefügt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Stream der Ausgabeps‑Datei. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Speichert das angegebene PsDocument als EPS-Datei. Diese Methode wird nur nach dem Aktualisieren von XMP-Metadaten verwendet. Sie speichert die ursprüngliche EPS-Datei mit aktualisierten vorhandenen Metadaten oder erstellt eine neue, während die getMetadata‑Methode aufgerufen wird. Im letzten Fall werden alle erforderlichen PostScript‑Code und EPS‑Kommentare hinzugefügt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Ein Ausgabepfad für EPS-Datei.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Speichert PS/EPS-Datei in Bilddatei. Das Ausgabeverzeichnis und der Dateiname sind identisch mit dem des Eingabe‑PS‑Datei. Die Dateierweiterung entspricht dem Bildformat im Parameter "options". Wenn das Dokument mit einem Stream initialisiert wurde, der nicht von FileInputStream abgeleitet ist, wird die Bilddatei im aktuellen Ordner mit einer Standard‑Dateinamen‑Vorlage gespeichert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Enthält notwendige Parameter zum Speichern des Bildes und Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern spezifizieren. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Speichert PS/EPS-Datei in Bilddatei im angegebenen Verzeichnis mit dem angegebenen Dateinamen. Die Dateierweiterung entspricht dem Bildformat im Parameter "options".

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Enthält notwendige Parameter zum Speichern des Bildes und Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern spezifizieren. |
| outDir | java.lang.String | Das Ausgabeverzeichnis, in dem die Bilddatei gespeichert wird. |
| fileNameTemplate | java.lang.String | Die Dateinamenvorlage für das Bild (ohne Erweiterung). Wenn die Eingabe‑PS/EPS-Datei einseitig ist, entspricht sie exakt dem Dateinamen, andernfalls "\\_[n]", wobei "n" die Seitennummer beginnend bei 0 ist, wird ein Suffix an diesen angehängt. Die Dateierweiterung entspricht dem Bildformat im Parameter "option". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Speichert PS/EPS-Datei in Bild-Byte-Arrays.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Enthält notwendige Parameter zum Speichern des Bildes und Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern spezifizieren. |

**Returns:**
byte[][] - Bildbytes. Ein Byte‑Array pro Seite.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Speichert PS/EPS-Datei in einen Ausgabe-PDF-Stream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Ein PDF-Ausgabestream. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Enthält Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern angeben. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Speichert PS/EPS-Datei als PDF-Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Ein Pfad für die Ausgabepdf‑Datei. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Enthält Flags, die die Ausgabe von während der Konvertierung ausgelösten Fehlern angeben. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Speichert das BufferedImage-Objekt als EPS-Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Das Bild. |
| epsStream | java.io.OutputStream | EPS-Ausgabestream. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Enthält Parameter, die die Ausgabe von während der Konvertierung ausgelösten Fehlern festlegen. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Speichert das BufferedImage-Objekt als EPS-Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Das Bild. |
| epsFilePath | java.lang.String | EPS-Dateipfad. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Enthält Parameter, die die Ausgabe von während der Konvertierung ausgelösten Fehlern festlegen. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Speichert PNG/JPEG/BMP/GIF-Bild aus dem Eingabestream in den EPS-Ausgabestream.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageStream | java.io.InputStream | Bild-Eingabestream. |
| epsStream | java.io.OutputStream | EPS-Ausgabestream. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Enthält Parameter, die die Ausgabe von während der Konvertierung ausgelösten Fehlern festlegen. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Speichert PNG/JPEG/BMP/GIF-Bild aus einer Datei als EPS-Datei.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFilePath | java.lang.String | Bilddateipfad. |
| epsFilePath | java.lang.String | EPS-Dateipfad. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Enthält Parameter, die die Ausgabe von während der Konvertierung ausgelösten Fehlern festlegen. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Fügt eine Skalierung zum aktuellen Grafikzustand hinzu (skalieren der aktuellen Matrix).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xScale | float | Der Maßstab in X‑Richtung. |
| yScale | float | Der Maßstab in Y‑Richtung. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Gibt einen Eingabestream an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| is | java.io.InputStream | Eingabestream der PS/EPS-Datei. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Setzt Seitengeräte‑Parameter (siehe Operator "setpagedevice" PostScript‑Spezifikation). Dazu können Seitenformat und Farbe usw. gehören.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Parameter der Seite. In diesem Wörterbuch können Seitengröße und Farbe usw. enthalten sein. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Legt die Seitengröße fest. Um Seiten mit unterschiedlichen Größen in einem Dokument zu erstellen, verwenden Sie die Methode  setPageDevice  unmittelbar nach dieser Methode.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float | Die Breite der Seite in der resultierenden PostScript-Datei. |
| Höhe | float | Die Höhe der Seite in der resultierenden PostScript-Datei. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Setzt die Farbe im aktuellen Grafikzustand.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| paint | java.awt.Paint | Das Paint. Es kann jede Unterklasse der  Paint  Klasse sein, die im JDK existiert. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Setzt den Strich im aktuellen Grafikzustand.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stroke | java.awt.Stroke | Der stroke. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Setzt die aktuelle Transformation auf diese.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Die Transformation. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Fügt eine Schertransformation zum aktuellen Grafikzustand hinzu (Scherung der aktuellen Matrix).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| shx | float | Die Scherung in X-Achse. |
| shy | float | Die Scherung in Y-Achse. |

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


Fügt eine Transformation zum aktuellen Grafikzustand hinzu (verknüpft diese Matrix mit der aktuellen).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Die Transformation. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Fügt eine Translation zum aktuellen Grafikzustand hinzu (verschiebt die aktuelle Matrix).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | Die Verschiebung in X-Richtung. |
| y | float | Die Verschiebung in Y-Richtung. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Schreibt das Wiederherstellen des aktuellen Grafikzustands (siehe PostScript-Spezifikation zum Operator "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Schreibt das Speichern des aktuellen Grafikzustands (siehe PostScript-Spezifikation zum Operator "gsave").

