---
title: "PsDocument"
second_title: "Aspose.Page voor Java API-referentie"
description: "Deze klasse omvat PS/EPS-documenten."
type: docs
weight: 16
url: /nl/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Deze klasse omvat PS/EPS-documenten.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [PsDocument()](#PsDocument--) | Initialiseert een lege  PsDocument  met een geïnitialiseerde pagina. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Initialiseert een lege  PsDocument  met een geïnitialiseerde pagina. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Initialiseert een lege  PsDocument  met een geïnitialiseerde pagina. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Initialiseert een lege  PsDocument . |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Initialiseert een lege  PsDocument . |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Initialiseert een lege  PsDocument  wanneer het aantal Postscript‑documentpagina's van tevoren bekend is. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Initialiseert een lege  PsDocument  wanneer het aantal Postscript‑documentpagina's van tevoren bekend is. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Initialiseert  PsDocument  met een invoer‑PS/EPS‑bestand. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Initialiseert  PsDocument  met een stream van een PS/EPS‑bestand. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Voegt een clip toe aan de huidige grafische toestand. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Voegt een clip toe aan de huidige grafische toestand en schrijft vervolgens de "newpath"‑operator. |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Voegt een bijsnijdingsrechthoek toe aan de huidige grafische toestand. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Voegt een clip toe vanuit een omtrek van de opgegeven tekst in het opgegeven lettertype. |
| [closePage()](#closePage--) | Voltooi de huidige pagina. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Converteert Type‑1‑lettertype naar TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Converteert Type‑3‑lettertype naar TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Converteert Type‑3‑lettertype naar TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Snijdt het opgegeven  PsDocument  bij als EPS‑bestand. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Teken een willekeurig pad. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Teken een gemaskeerde afbeelding. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Teken een afbeelding. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Teken een getransformeerde afbeelding met achtergrond. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Teken een getransformeerde transparante afbeelding met achtergrond. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Leest EPS‑bestand en extraheert de begrenzingsdoos van de EPS‑afbeelding uit de %%BoundingBox‑opmerking of de grenzen voor de standaardpaginagrootte (0, 0, 595, 842) als deze niet bestaat. |
| [extractEpsSize()](#extractEpsSize--) | Leest EPS‑bestand en extraheert de grootte van de EPS‑afbeelding uit de %%BoundingBox‑opmerking of de standaardpaginagrootte (595, 842) als deze niet bestaat. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Extraheert tekst uit een PS‑bestand. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Vul een willekeurig pad. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Voegt een tekststring toe door de binnenkant van glyphs te vullen. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Haalt het aantal pagina's op in het resulterende PDF-document. |
| [getPaint()](#getPaint--) | Haalt de paint op in de huidige grafische toestand. |
| [getStroke()](#getStroke--) | Haalt de stroke op in de huidige grafische toestand. |
| [getXmpMetadata()](#getXmpMetadata--) | Leest PS/EPS-bestand en extraheert XmpMetdata als het al bestaat of voegt een nieuwe toe als het niet bestaat. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Geeft aan of de licentie van Aspose.Page for Java-product wordt benaderd en geldig is. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Voegt PS/EPS-bestanden samen naar een apparaat. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Voegt PS/EPS-bestanden samen naar een apparaat. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Voegt PS/EPS-bestanden samen naar een apparaat. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Maakt een nieuwe pagina en maakt deze de huidige. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Maakt een nieuwe pagina met de grootte van het document en maakt deze de huidige. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Wijzigt de grootte van de opgegeven PsDocument als EPS-bestand. |
| [rotate(float angleRadians)](#rotate-float-) | Voegt een tegen de klok in rotatie rond de oorsprong toe aan de huidige grafische toestand (roteer de huidige matrix). |
| [rotate(int angleDegrees)](#rotate-int-) | Voegt een tegen de klok in rotatie rond de oorsprong toe aan de huidige grafische toestand (roteer de huidige matrix). |
| [save()](#save--) | Slaat het opgegeven PsDocument op als PS- of EPS-bestand. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Slaat PS/EPS-bestand op naar een apparaat. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Slaat het opgegeven PsDocument op naar de stream. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Slaat het opgegeven PsDocument op als EPS-bestand. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Slaat PS/EPS-bestand op naar een afbeeldingsbestand. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Slaat PS/EPS-bestand op naar een afbeeldingsbestand in de opgegeven map met de opgegeven bestandsnaam. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Slaat PS/EPS-bestand op naar bytes‑arrays van afbeeldingen. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Slaat PS/EPS-bestand op naar een uitvoer‑PDF‑stream. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Slaat PS/EPS-bestand op naar een PDF‑bestand. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Slaat BufferedImage‑object op naar een EPS‑bestand. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Slaat BufferedImage‑object op naar een EPS‑bestand. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Slaat PNG/JPEG/BMP/GIF‑afbeelding van de invoer‑stream op naar een EPS‑uitvoer‑stream. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Slaat PNG/JPEG/BMP/GIF‑afbeelding van bestand op naar een EPS‑bestand. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Voegt schaal toe aan de huidige grafische toestand (schaal huidige matrix). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Specificeert een invoerstroom. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Stelt pagina-apparaatparameters in (zie operator "setpagedevice" PostScript-specificatie). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Stelt paginagrootte in. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Stelt verf in de huidige grafische toestand in. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Stelt lijn in de huidige grafische toestand in. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Stel de huidige transformatie in op deze. |
| [shear(float shx, float shy)](#shear-float-float-) | Voegt schuine transformatie toe aan de huidige grafische toestand (schuine huidige matrix). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Voegt transformatie toe aan de huidige grafische toestand (voegt deze matrix samen met de huidige). |
| [translate(float x, float y)](#translate-float-float-) | Voegt translatie toe aan de huidige grafische toestand (verplaatst de huidige matrix). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Schrijft het herstellen van de huidige grafische toestand (zie PostScript-specificatie voor operator "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Schrijft het opslaan van de huidige grafische toestand (zie PostScript-specificatie voor operator "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Initialiseert een lege  PsDocument  met een geïnitialiseerde pagina. Deze constructor wordt alleen gebruikt voor extra bewerkingen die niet gerelateerd zijn aan PostScript-bestanden, bijvoorbeeld het converteren van lettertypen.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Initialiseert een lege  PsDocument  met een geïnitialiseerde pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Het uitvoer‑PS/EPS‑bestandspad. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Een set parameters die het opslaan van het PostScript‑bestand regelen. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Initialiseert een lege  PsDocument  met een geïnitialiseerde pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| psStream | java.io.OutputStream | Stream waarin het PS/EPS‑bestand wordt opgeslagen. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Een set parameters die het opslaan van het PostScript‑bestand regelen. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Initialiseert een lege  PsDocument .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Het uitvoer‑PS/EPS‑bestandspad. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Een set parameters die het opslaan van het PostScript‑bestand regelen. |
| multipaged | boolean | Als false wordt de pagina niet geïnitialiseerd. In dit geval moet de paginainitialisatie worden uitgevoerd via een expliciete "openPage(width, height)"‑aanroep. |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Initialiseert een lege  PsDocument .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| psStream | java.io.OutputStream | Stream waarin het PS/EPS‑bestand wordt opgeslagen. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Een set parameters die het opslaan van het PostScript‑bestand regelen. |
| multipaged | boolean | Als false wordt de pagina niet geïnitialiseerd. In dit geval moet de paginainitialisatie worden uitgevoerd via een expliciete "openPage(width, height)"‑aanroep. |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Initialiseert een lege  PsDocument  wanneer het aantal Postscript‑documentpagina's van tevoren bekend is.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Het uitvoer‑PS/EPS‑bestandspad. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Een set parameters die het opslaan van het PostScript‑bestand regelen. |
| numberOfPages | int | Het aantal pagina's in het PostScript‑document. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Initialiseert een lege  PsDocument  wanneer het aantal Postscript‑documentpagina's van tevoren bekend is.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| psStream | java.io.OutputStream | Stream waarin het PS/EPS‑bestand wordt opgeslagen. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Een set parameters die het opslaan van het PostScript‑bestand regelen. |
| numberOfPages | int | Het aantal pagina's in het PostScript‑document. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Initialiseert  PsDocument  met een invoer‑PS/EPS‑bestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| psFilePath | java.lang.String | PS/EPS‑bestandspad. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Initialiseert  PsDocument  met een stream van een PS/EPS‑bestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| psStream | java.io.InputStream | Stream van PS/EPS‑bestand. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Voegt een clip toe aan de huidige grafische toestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | java.awt.Shape | Het knippad. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Voegt een clip toe aan de huidige grafische toestand en schrijft vervolgens de "newpath"-operator. Het is nodig om de samenloop van dit knippad en enkele daaropvolgende paden, zoals glyphs die zijn omlijnd met de "charpath"-operator, te vermijden.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | java.awt.Shape | Het knippad. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Voegt een bijsnijdingsrechthoek toe aan de huidige grafische toestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | De kniprechthoek. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Voegt een clip toe vanuit een omtrek van de opgegeven tekst in het opgegeven lettertype.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De tekst. |
| lettertype | java.awt.Font | Het lettertype. |
| x | float | Een X-coördinaat van de tekstpositie. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Voltooi de huidige pagina.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Converteert Type 1-lettertype naar TrueType. De naam van het geconverteerde TTF-lettertypebestand zal hetzelfde zijn als het invoer-Type 1-lettertype met de extensie ".ttf". Het TTF-bestand wordt opgeslagen in de toegewezen uitvoermap.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Het pad naar het Type 1-lettertypebestand.. |
| outputDir | java.lang.String | Uitvoermap waar het resulterende TrueType-lettertype moet worden opgeslagen. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Converteert Type 3-lettertype naar TrueType. Het TTF-bestand wordt opgeslagen in de opgegeven uitvoerstroom.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Het pad naar het Type 3-lettertypebestand. |
| outputStream | java.io.OutputStream | Uitvoerstroom waar het resulterende TrueType-lettertype moet worden opgeslagen. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Converteert Type 3-lettertype naar TrueType. De naam van het geconverteerde TTF-lettertypebestand zal hetzelfde zijn als het invoer-Type 3-lettertype met de extensie ".ttf". Het TTF-bestand wordt opgeslagen in de toegewezen uitvoermap.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Het pad naar het Type 3-lettertypebestand.. |
| outputDir | java.lang.String | Uitvoermap waar het resulterende TrueType-lettertype moet worden opgeslagen. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Snijdt het opgegeven PsDocument bij als EPS-bestand. Het slaat het oorspronkelijke EPS-bestand op met een bijgewerkte bestaande %%BoundingBox of er wordt een nieuwe aangemaakt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | De crop box (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Teken een willekeurig pad.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| shape | java.awt.Shape | Het pad om te vullen. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Teken een gemaskeerde afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | De afbeelding om te tekenen. Moet in 24bpp RGB image format zijn. |
| alphaMask1bpp | java.awt.image.BufferedImage | Het afbeeldingsmasker. Moet in 1bpp image format zijn. |
| transform | java.awt.geom.AffineTransform | De matrix om de afbeelding te transformeren. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Teken een afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | De afbeelding om te tekenen. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Teken een getransformeerde afbeelding met achtergrond.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | De afbeelding om te tekenen. |
| transform | java.awt.geom.AffineTransform | De matrix om de afbeelding te transformeren. |
| bkg | java.awt.Color | De achtergrond voor de afbeelding. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Teken getransformeerde transparante afbeelding met achtergrond. Als afbeelding geen Alpha channel heeft, wordt deze getekend als ondoorzichtige afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | De afbeelding om te tekenen. |
| transform | java.awt.geom.AffineTransform | De matrix om de afbeelding te transformeren. |
| transparencyThreshold | int | Een drempel die bepaalt vanaf welke transparantiewaarde een pixel als volledig transparant wordt geïnterpreteerd. Alle waarden onder deze drempel worden als volledig ondoorzichtig geïnterpreteerd. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Leest EPS‑bestand en extraheert de begrenzingsdoos van de EPS‑afbeelding uit de %%BoundingBox‑opmerking of de grenzen voor de standaardpaginagrootte (0, 0, 595, 842) als deze niet bestaat.

**Returns:**
int[] - De bounding box van de EPS-afbeelding.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Leest EPS‑bestand en extraheert de grootte van de EPS‑afbeelding uit de %%BoundingBox‑opmerking of de standaardpaginagrootte (595, 842) als deze niet bestaat.

**Returns:**
java.awt.Dimension - De grootte van de EPS-afbeelding.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Extraheert tekst uit een PS-bestand. Het werkt alleen voor tekst die is geschreven met TrueType-lettertypen (Type 42) of samengestelde lettertypen (Type 0) die bestaan uit TrueType-lettertypen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | De opslagopties. |
| startPage | int | De pagina vanaf welke (inclusief) te beginnen is met het extraheren van tekst. |
| endPage | int | De pagina waarvan inclusief tekst moet worden geëxtraheerd. |

**Returns:**
java.lang.String - De tekst die zich bevindt in de geselecteerde pagina's van het PS‑bestand.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Vul een willekeurig pad.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| shape | java.awt.Shape | Het pad om te vullen. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| fillPaint | java.awt.Paint | De vulling die wordt gebruikt voor het schilderen van de binnenkant van glyphs. |
| strokePaint | java.awt.Paint | De  java.awt.Paint  die wordt gebruikt voor het schilderen van de omtrek van glyphs. Kan elke subklasse van de  java.awt.Paint ‑klasse in de JDK zijn. |
| stroke | java.awt.Stroke | De lijn die wordt gebruikt voor het tekenen van de contouren van glyphs. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| fillPaint | java.awt.Paint | De vulling die wordt gebruikt voor het schilderen van de binnenkant van glyphs. |
| strokePaint | java.awt.Paint | De  java.awt.Paint  die wordt gebruikt voor het schilderen van de omtrek van glyphs. Kan elke subklasse van de  java.awt.Paint ‑klasse in de JDK zijn. |
| stroke | java.awt.Stroke | De lijn die wordt gebruikt voor het tekenen van de contouren van glyphs. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. advances Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| advances | float[] |  |
| lettertype | java.awt.Font | Systeemlettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| fillPaint | java.awt.Paint | De vulling die wordt gebruikt voor het schilderen van de binnenkant van glyphs. |
| strokePaint | java.awt.Paint | De  java.awt.Paint  die wordt gebruikt voor het schilderen van de omtrek van glyphs. Kan elke subklasse van de  java.awt.Paint ‑klasse in de JDK zijn. |
| stroke | java.awt.Stroke | De lijn die wordt gebruikt voor het tekenen van de contouren van glyphs. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| lettertype | java.awt.Font | Systeemlettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| fillPaint | java.awt.Paint | De vulling die wordt gebruikt voor het schilderen van de binnenkant van glyphs. |
| strokePaint | java.awt.Paint | De  java.awt.Paint  die wordt gebruikt voor het schilderen van de omtrek van glyphs. Kan elke subklasse van de  java.awt.Paint ‑klasse in de JDK zijn. |
| stroke | java.awt.Stroke | De lijn die wordt gebruikt voor het tekenen van de contouren van glyphs. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| fill | java.awt.Paint | De vulling die wordt gebruikt voor het schilderen van glyphs. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| fill | java.awt.Paint | De vulling die wordt gebruikt voor het schilderen van glyphs. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| lettertype | java.awt.Font | Systeemlettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| lettertype | java.awt.Font | Het lettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| fill | java.awt.Paint | De vulling die wordt gebruikt voor het schilderen van glyphs. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| lettertype | java.awt.Font | Systeemlettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Voegt een tekststring toe door de binnenkant van glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| lettertype | java.awt.Font | Het lettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| fill | java.awt.Paint | De vulling die wordt gebruikt voor het schilderen van glyphs. |

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


Haalt het aantal pagina's op in het resulterende PDF-document.

**Returns:**
int - het aantal pagina's.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Haalt de paint op in de huidige grafische toestand.

**Returns:**
java.awt.Paint - Huidige verf.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Haalt de stroke op in de huidige grafische toestand.

**Returns:**
java.awt.Stroke - Huidige stroke.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Leest PS/EPS-bestand en extraheert XmpMetdata als het al bestaat of voegt een nieuwe toe als het niet bestaat.

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


Geeft aan of de licentie van Aspose.Page for Java-product wordt benaderd en geldig is.

**Returns:**
boolean - booleaanse waarde
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Voegt PS/EPS-bestanden samen naar een apparaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | PS/EPS-bestanden voor samenvoegen met dit bestand naar een uitvoerapparaat. |
| device | [Device](../../com.aspose.page/device) | Een uitvoerapparaat. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Bevat vlaggen die de uitvoer van fouten die tijdens conversie worden gegenereerd specificeren. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Voegt PS/EPS-bestanden samen naar een apparaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Een uitvoer-PDF-stream. |
| filesForMerge | java.lang.String[] | PS/EPS-bestanden voor samenvoegen met dit bestand naar een uitvoerapparaat. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Bevat vlaggen die de uitvoer van fouten die tijdens conversie worden gegenereerd specificeren. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Voegt PS/EPS-bestanden samen naar een apparaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Een uitvoer-PDF-bestandspad. |
| filesForMerge | java.lang.String[] | PS/EPS-bestanden voor samenvoegen met dit bestand naar een uitvoerapparaat. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Bevat vlaggen die de uitvoer van fouten die tijdens conversie worden gegenereerd specificeren. |

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


Maakt een nieuwe pagina en maakt deze de huidige.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float | De breedte van de nieuwe pagina. |
| hoogte | float | De hoogte van de nieuwe pagina. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Maakt een nieuwe pagina met de grootte van het document en maakt deze de huidige.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pageName | java.lang.String | De naam van de nieuwe pagina. Als deze null is, wordt de naam van de pagina een volgnummer van de pagina. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Voegt een tekststring toe door de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Voegt een tekststring toe door de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| outlinePaint | java.awt.Paint | De  java.awt.Paint  die wordt gebruikt voor het schilderen van de omtrek van glyphs. Kan elke subklasse van de  java.awt.Paint ‑klasse in de JDK zijn. |
| stroke | java.awt.Stroke | De lijn die wordt gebruikt voor het tekenen van de contouren van glyphs. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Voegt een tekststring toe door de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Voegt een tekststring toe door de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont die wordt gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| outlinePaint | java.awt.Paint | De  java.awt.Paint  die wordt gebruikt voor het schilderen van de omtrek van glyphs. Kan elke subklasse van de  java.awt.Paint ‑klasse in de JDK zijn. |
| stroke | java.awt.Stroke | De lijn die wordt gebruikt voor het tekenen van de contouren van glyphs. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Voegt een tekststring toe door de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| lettertype | java.awt.Font | Systeemlettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Voegt een tekststring toe door de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| advances | float[] | Een array met de breedte van glyphs. De lengte moet overeenkomen met het aantal glyphs in de tekenreeks. |
| lettertype | java.awt.Font | Het lettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| outlinePaint | java.awt.Paint | De  java.awt.Paint  die wordt gebruikt voor het schilderen van de omtrek van glyphs. Kan elke subklasse van de  java.awt.Paint ‑klasse in de JDK zijn. |
| stroke | java.awt.Stroke | De lijn die wordt gebruikt voor het tekenen van de contouren van glyphs. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Voegt een tekststring toe door de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| lettertype | java.awt.Font | Systeemlettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Voegt een tekststring toe door de contouren van glyphs te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekst | java.lang.String | De toe te voegen tekst. |
| lettertype | java.awt.Font | Het lettertype dat wordt gebruikt om tekst te tekenen. |
| x | float | X‑coördinaat voor de oorsprong van de tekst. |
| y | float | Y‑coördinaat voor de oorsprong van de tekst. |
| outlinePaint | java.awt.Paint | De  java.awt.Paint  die wordt gebruikt voor het schilderen van de omtrek van glyphs. Kan elke subklasse van de  java.awt.Paint ‑klasse in de JDK zijn. |
| stroke | java.awt.Stroke | De lijn die wordt gebruikt voor het tekenen van de contouren van glyphs. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Wijzigt de grootte van het opgegeven PsDocument als EPS-bestand. Deze methode wordt alleen gebruikt na het extraheren van de EPS-grootte. Het slaat het oorspronkelijke EPS-bestand op met een bijgewerkte bestaande %%BoundingBox of er wordt een nieuwe aangemaakt. De paginatransformatie‑matrix wordt ook ingesteld.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Nieuwe grootte van de EPS-afbeelding in toegewezen eenheden. |
| units | [Units](../../com.aspose.page/units) | De eenheden van de nieuwe grootte. Kan punten, inches, millimeters, centimeters en procenten van de oorspronkelijke grootte zijn. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Voegt een tegen de klok in rotatie rond de oorsprong toe aan de huidige grafische toestand (roteer de huidige matrix).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| angleRadians | float | De hoek van rotatie in radialen. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Voegt een tegen de klok in rotatie rond de oorsprong toe aan de huidige grafische toestand (roteer de huidige matrix).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| angleDegrees | int | De hoek van rotatie in graden. |

### save() {#save--}
```
public void save()
```


Slaat het opgegeven PsDocument op als PS- of EPS-bestand. Deze methode wordt alleen gebruikt wanneer PsDocument vanaf nul is gemaakt.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Slaat PS/EPS-bestand op naar een apparaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Een uitvoerapparaat. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Bevat vlaggen die de uitvoer van fouten die tijdens conversie worden gegenereerd specificeren. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Slaat het opgegeven PsDocument op naar de stream. Deze methode wordt alleen gebruikt na het bijwerken van XMP-metadata. Het slaat het oorspronkelijke EPS-bestand op met bijgewerkte bestaande metadata of er wordt een nieuw bestand aangemaakt tijdens het aanroepen van de getMetadata-methode. In het laatste geval worden alle benodigde PostScript-code en EPS‑commentaren toegevoegd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Stream van het uitvoer‑EPS‑bestand. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Slaat het opgegeven PsDocument op als EPS-bestand. Deze methode wordt alleen gebruikt na het bijwerken van XMP-metadata. Het slaat het oorspronkelijke EPS-bestand op met bijgewerkte bestaande metadata of er wordt een nieuw bestand aangemaakt tijdens het aanroepen van de getMetadata-methode. In het laatste geval worden alle benodigde PostScript-code en EPS‑commentaren toegevoegd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Een uitvoer EPS-bestandspad.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Slaat PS/EPS-bestand op als afbeeldingsbestand. De uitvoermap en de bestandsnaam zullen hetzelfde zijn als van het invoer‑PS‑bestand. De bestandsextensie komt overeen met het afbeeldingsformaat in de "options"‑parameter. Als het document is geïnitialiseerd met een stream die niet afkomstig is van FileInputStream, wordt het afbeeldingsbestand opgeslagen in de huidige map met een standaard bestandsnaamsjabloon.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Bevat de benodigde parameters voor het opslaan van een afbeelding en vlaggen die de uitvoer van fouten die tijdens de conversie worden gegooid specificeren. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Slaat PS/EPS-bestand op als afbeeldingsbestand in de opgegeven map met de opgegeven bestandsnaam. De bestandsextensie komt overeen met het afbeeldingsformaat in de "options"‑parameter.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Bevat de benodigde parameters voor het opslaan van een afbeelding en vlaggen die de uitvoer van fouten die tijdens de conversie worden gegooid specificeren. |
| outDir | java.lang.String | De uitvoermap waar het afbeeldingsbestand wordt opgeslagen. |
| fileNameTemplate | java.lang.String | Het bestandsnaamsjabloon voor de afbeelding (zonder extensie). Als het invoer‑PS/EPS‑bestand één pagina heeft, is dit precies de bestandsnaam; anders "\_[n]", waarbij "n" een paginanummer is beginnend bij 0, wordt hier een achtervoegsel aan toegevoegd. De bestandsextensie komt overeen met het afbeeldingsformaat in de "option"‑parameter. |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Slaat PS/EPS-bestand op naar bytes‑arrays van afbeeldingen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Bevat de benodigde parameters voor het opslaan van een afbeelding en vlaggen die de uitvoer van fouten die tijdens de conversie worden gegooid specificeren. |

**Returns:**
byte[][] - Afbeeldingsbytes. Eén byte‑array per pagina.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Slaat PS/EPS-bestand op naar een uitvoer‑PDF‑stream.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Een uitvoer-PDF-stream. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Bevat vlaggen die de uitvoer van fouten die tijdens conversie worden gegenereerd specificeren. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Slaat PS/EPS-bestand op naar een PDF‑bestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Een uitvoer-PDF-bestandspad. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Bevat vlaggen die de uitvoer van fouten die tijdens conversie worden gegenereerd specificeren. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Slaat BufferedImage‑object op naar een EPS‑bestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | De afbeelding. |
| epsStream | java.io.OutputStream | EPS-uitvoerstroom. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Bevat parameters die de uitvoer van fouten die tijdens de conversie worden gegooid specificeren. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Slaat BufferedImage‑object op naar een EPS‑bestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | De afbeelding. |
| epsFilePath | java.lang.String | EPS-bestandspad. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Bevat parameters die de uitvoer van fouten die tijdens de conversie worden gegooid specificeren. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Slaat PNG/JPEG/BMP/GIF‑afbeelding van de invoer‑stream op naar een EPS‑uitvoer‑stream.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageStream | java.io.InputStream | Afbeeldingsinvoerstroom. |
| epsStream | java.io.OutputStream | EPS-uitvoerstroom. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Bevat parameters die de uitvoer van fouten die tijdens de conversie worden gegooid specificeren. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Slaat PNG/JPEG/BMP/GIF‑afbeelding van bestand op naar een EPS‑bestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFilePath | java.lang.String | Afbeeldingsbestandspad. |
| epsFilePath | java.lang.String | EPS-bestandspad. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Bevat parameters die de uitvoer van fouten die tijdens de conversie worden gegooid specificeren. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Voegt schaal toe aan de huidige grafische toestand (schaal huidige matrix).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xScale | float | De schaal op de X-as. |
| yScale | float | De schaal op de Y-as. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Specificeert een invoerstroom.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| is | java.io.InputStream | Invoerstroom van PS/EPS-bestand. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Stelt paginatoestelparameters in (zie operator "setpagedevice" PostScript-specificatie). Onder deze kunnen paginagrootte en kleur enzovoort vallen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Parameters van de pagina. In dit woordenboek kunnen paginagrootte en kleur enz. staan. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Stelt de paginagrootte in. Om pagina's met verschillende groottes in één document te maken, gebruik je de  setPageDevice  methode direct na deze methode.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float | De breedte van de pagina in het resulterende PostScript‑bestand. |
| hoogte | float | De hoogte van de pagina in het resulterende PostScript‑bestand. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Stelt verf in de huidige grafische toestand in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| paint | java.awt.Paint | De paint. Het kan elke subklasse van de  Paint  klasse zijn die in de JDK bestaat. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Stelt lijn in de huidige grafische toestand in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stroke | java.awt.Stroke | De stroke. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Stel de huidige transformatie in op deze.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | De transformatie. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Voegt schuine transformatie toe aan de huidige grafische toestand (schuine huidige matrix).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| shx | float | De shear in de X-as. |
| shy | float | De shear in de Y-as. |

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


Voegt transformatie toe aan de huidige grafische toestand (voegt deze matrix samen met de huidige).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | De transformatie. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Voegt translatie toe aan de huidige grafische toestand (verplaatst de huidige matrix).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | De translatie in X-richting. |
| y | float | De translatie in Y-richting. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Schrijft het herstellen van de huidige grafische toestand (zie PostScript-specificatie voor operator "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Schrijft het opslaan van de huidige grafische toestand (zie PostScript-specificatie voor operator "gsave").

