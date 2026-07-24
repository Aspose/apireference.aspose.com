---
title: "PsDocument"
second_title: "Aspose.Page för Java API-referens"
description: "Denna klass kapslar in PS/EPS‑dokument."
type: docs
weight: 16
url: /sv/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Denna klass kapslar in PS/EPS‑dokument.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PsDocument()](#PsDocument--) | Initierar ett tomt PsDocument med en initierad sida. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Initierar ett tomt PsDocument med en initierad sida. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Initierar ett tomt PsDocument med en initierad sida. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Initierar ett tomt PsDocument. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Initierar ett tomt PsDocument. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Initierar ett tomt PsDocument när antalet Postscript-dokumentsidor är känt i förväg. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Initierar ett tomt PsDocument när antalet Postscript-dokumentsidor är känt i förväg. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Initierar PsDocument med en inmatningsfil av typen PS/EPS. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Initierar PsDocument med en ström av PS/EPS-fil. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Lägger till clip i det aktuella grafikläget. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Lägger till clip i det aktuella grafikläget och skriver sedan \"newpath\"-operatorn. |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Lägger till ett klippningsrektangel i det aktuella grafikläget. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Lägger till clip från en kontur av given text i given teckensnitt. |
| [closePage()](#closePage--) | Fullborda aktuell sida. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Konverterar Type 1-teckensnitt till TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Konverterar Type 3-teckensnitt till TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Konverterar Type 3-teckensnitt till TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Beskär angivet PsDocument som EPS-fil. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Rita en godtycklig bana. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Rita maskerad bild. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Rita en bild. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Rita transformerad bild med bakgrund. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Rita transformerad transparent bild med bakgrund. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Läser EPS-fil och extraherar begränsningsrutan för EPS-bilden från %%BoundingBox-kommentaren eller gränserna för standardsidans storlek (0, 0, 595, 842) om den inte finns. |
| [extractEpsSize()](#extractEpsSize--) | Läser EPS-fil och extraherar storleken på EPS-bilden från %%BoundingBox-kommentaren eller standardsidans storlek (595, 842) om den inte finns. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Extraherar text från PS-fil. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Fyll en godtycklig bana. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Lägger till en textsträng genom att fylla glyfernas inre och rita glyfernas konturer. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Lägger till en textsträng genom att fylla glyfernas inre och rita glyfernas konturer. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Lägger till en textsträng genom att fylla glyfernas inre och rita glyfernas konturer. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Lägger till en textsträng genom att fylla glyfernas inre och rita glyfernas konturer. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Lägger till en textsträng genom att fylla glyfernas inre. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Lägger till en textsträng genom att fylla glyfernas inre. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Lägger till en textsträng genom att fylla glyfernas inre. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Lägger till en textsträng genom att fylla glyfernas inre. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Lägger till en textsträng genom att fylla glyfernas inre. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Lägger till en textsträng genom att fylla glyfernas inre. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Lägger till en textsträng genom att fylla glyfernas inre. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Lägger till en textsträng genom att fylla glyfernas inre. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Hämtar antalet sidor i det resulterande PDF-dokumentet. |
| [getPaint()](#getPaint--) | Hämtar färg i aktuellt grafikläge. |
| [getStroke()](#getStroke--) | Hämtar linje i aktuellt grafikläge. |
| [getXmpMetadata()](#getXmpMetadata--) | Läser PS/EPS-fil och extraherar XmpMetadata om den redan finns eller lägger till en ny om den inte finns. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Indikerar om licensen för Aspose.Page för Java-produkten är åtkomlig och giltig. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Slår samman PS/EPS-filer till en enhet. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Slår samman PS/EPS-filer till en enhet. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Slår samman PS/EPS-filer till en enhet. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Skapar en ny sida och gör den till den aktuella. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Skapar en ny sida med dokumentets storlek och gör den till den aktuella. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Lägger till en textsträng genom att rita glyfkonturer. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Lägger till en textsträng genom att rita glyfkonturer. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Lägger till en textsträng genom att rita glyfkonturer. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Lägger till en textsträng genom att rita glyfkonturer. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Lägger till en textsträng genom att rita glyfkonturer. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Lägger till en textsträng genom att rita glyfkonturer. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Lägger till en textsträng genom att rita glyfkonturer. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Lägger till en textsträng genom att rita glyfkonturer. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Ändrar storlek på given PsDocument som EPS-fil. |
| [rotate(float angleRadians)](#rotate-float-) | Lägger till rotation moturs kring origo i aktuellt grafikläge (rotera aktuell matris). |
| [rotate(int angleDegrees)](#rotate-int-) | Lägger till rotation moturs kring origo i aktuellt grafikläge (rotera aktuell matris). |
| [save()](#save--) | Sparar given PsDocument som PS- eller EPS-fil. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Sparar PS/EPS-fil till en enhet. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Sparar given PsDocument till strömmen. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Sparar given PsDocument som EPS-fil. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Sparar PS/EPS-fil till en bildfil. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Sparar PS/EPS-fil till en bildfil i den angivna katalogen med det angivna filnamnet. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Sparar PS/EPS-fil till bildens byte-arrayer. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Sparar PS/EPS-fil till en utdata-PDF-ström. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Sparar PS/EPS-fil till en PDF-fil. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Sparar BufferedImage-objekt till EPS-fil. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Sparar BufferedImage-objekt till EPS-fil. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Sparar PNG/JPEG/BMP/GIF-bild från indataström till EPS-utdataström. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Sparar PNG/JPEG/BMP/GIF-bild från fil till EPS-fil. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Lägger till skalning i aktuellt grafikläge (skala aktuell matris). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Specificerar en indataström. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Ställer in sidans enhetsparametrar (se operator "setpagedevice" PostScript-specifikationen). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Ställer in sidstorlek. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Sätter färg i det aktuella grafikläget. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Sätter linje i det aktuella grafikläget. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Ställ in den aktuella transformationen till denna. |
| [shear(float shx, float shy)](#shear-float-float-) | Lägger till skev transformation i det aktuella grafikläget (skevar den aktuella matrisen). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Lägger till transformation i det aktuella grafikläget (konkatenerar denna matris med den aktuella). |
| [translate(float x, float y)](#translate-float-float-) | Lägger till förskjutning i det aktuella grafikläget (förskjuter den aktuella matrisen). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Skriver återställning av det aktuella grafikläget (se PostScript-specifikationen för operatorn "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Skriver sparande av det aktuella grafikläget (se PostScript-specifikationen för operatorn "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Initierar ett tomt PsDocument med en initierad sida. Denna konstruktor används endast för ytterligare operationer som inte är relaterade till PostScript-filer, till exempel konvertering av teckensnitt.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Initierar ett tomt PsDocument med en initierad sida.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Sökvägen till utdata PS/EPS-filen. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | En uppsättning parametrar som styr sparandet av PostScript-filen. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Initierar ett tomt PsDocument med en initierad sida.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| psStream | java.io.OutputStream | Ström där PS/EPS-filen ska sparas. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | En uppsättning parametrar som styr sparandet av PostScript-filen. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Initierar ett tomt PsDocument.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Sökvägen till utdata PS/EPS-filen. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | En uppsättning parametrar som styr sparandet av PostScript-filen. |
| multipaged | boolean | Om falskt kommer sidan inte att initieras. I detta fall bör sidinitiering utföras via ett explicit "openPage(width, height) call. |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Initierar ett tomt PsDocument.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| psStream | java.io.OutputStream | Ström där PS/EPS-filen ska sparas. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | En uppsättning parametrar som styr sparandet av PostScript-filen. |
| multipaged | boolean | Om falskt kommer sidan inte att initieras. I detta fall bör sidinitiering utföras via ett explicit "openPage(width, height) call. |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Initierar ett tomt PsDocument när antalet Postscript-dokumentsidor är känt i förväg.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Sökvägen till utdata PS/EPS-filen. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | En uppsättning parametrar som styr sparandet av PostScript-filen. |
| numberOfPages | int | Antalet sidor i PostScript-dokumentet. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Initierar ett tomt PsDocument när antalet Postscript-dokumentsidor är känt i förväg.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| psStream | java.io.OutputStream | Ström där PS/EPS-filen ska sparas. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | En uppsättning parametrar som styr sparandet av PostScript-filen. |
| numberOfPages | int | Antalet sidor i PostScript-dokumentet. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Initierar PsDocument med en inmatningsfil av typen PS/EPS.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| psFilePath | java.lang.String | PS/EPS-filsökväg. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Initierar PsDocument med en ström av PS/EPS-fil.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| psStream | java.io.InputStream | Ström för PS/EPS-filen. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Lägger till clip i det aktuella grafikläget.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| s | java.awt.Shape | Klippningsvägen. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Lägger till klippning i det aktuella grafikläget och skriver sedan "newpath"-operatorn. Detta är nödvändigt för att undvika sammansmältning av denna klippningsväg med vissa efterföljande vägar, såsom glyfer konturerade med "charpath"-operatorn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| s | java.awt.Shape | Klippningsvägen. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Lägger till ett klippningsrektangel i det aktuella grafikläget.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | Klippningsrektangel. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Lägger till clip från en kontur av given text i given teckensnitt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten. |
| font | java.awt.Font | Typsnittet. |
| x | float | En X-koordinat för textens position. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Fullborda aktuell sida.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Konverterar Type 1-typsnitt till TrueType. Namnet på den konverterade TTF-typsnittsfilen kommer att vara detsamma som inmatat Type 1-typsnitt med \".ttf\"-ändelse. TTF-filen sparas till den tilldelade utdatamappen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Sökvägen till Type 1-typsnittsfilen.. |
| outputDir | java.lang.String | Utdatamapp där den resulterande TrueType-typsnittet sparas. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Konverterar Type 3-typsnitt till TrueType. TTF-filen sparas till den angivna utdatastreamen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Sökvägen till Type 3-typsnittsfilen. |
| outputStream | java.io.OutputStream | Utdatastream där den resulterande TrueType-typsnittet sparas. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Konverterar Type 3-typsnitt till TrueType. Namnet på den konverterade TTF-typsnittsfilen kommer att vara detsamma som inmatat Type 3-typsnitt med \".ttf\"-ändelse. TTF-filen sparas till den tilldelade utdatamappen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Sökvägen till Type 3-typsnittsfilen.. |
| outputDir | java.lang.String | Utdatamapp där den resulterande TrueType-typsnittet sparas. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Beskär given PsDocument som EPS-fil. Den sparar den ursprungliga EPS-filen med uppdaterad befintlig %%BoundingBox eller skapar en ny.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | Beskärningsrutan (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Rita en godtycklig bana.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| form | java.awt.Shape | Sökvägen att fylla. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Rita maskerad bild.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | Bilden att rita. Måste vara i 24bpp RGB-bildformat |
| alphaMask1bpp | java.awt.image.BufferedImage | Bildmasken. Måste vara i 1bpp bildformat. |
| transform | java.awt.geom.AffineTransform | Matrissen för att transformera bilden. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Rita en bild.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Bilden att rita. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Rita transformerad bild med bakgrund.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Bilden att rita. |
| transform | java.awt.geom.AffineTransform | Matrissen för att transformera bilden. |
| bkg | java.awt.Color | Bakgrunden för bilden. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Rita transformerad transparent bild med bakgrund. Om bilden inte har en Alpha-kanal kommer den att ritas som en ogenomskinlig bild.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Bilden att rita. |
| transform | java.awt.geom.AffineTransform | Matrissen för att transformera bilden. |
| transparencyThreshold | int | Ett tröskelvärde som definierar från vilket transparensvärde en pixel kommer att tolkas som helt transparent. Alla värden under detta tröskelvärde kommer att tolkas som helt ogenomskinliga. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Läser EPS-fil och extraherar begränsningsrutan för EPS-bilden från %%BoundingBox-kommentaren eller gränserna för standardsidans storlek (0, 0, 595, 842) om den inte finns.

**Returns:**
int[] - Begränsningsrutan för EPS-bilden.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Läser EPS-fil och extraherar storleken på EPS-bilden från %%BoundingBox-kommentaren eller standardsidans storlek (595, 842) om den inte finns.

**Returns:**
java.awt.Dimension - Storleken på EPS-bilden.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Extraherar text från PS-fil. Det fungerar endast för text som är skriven med TrueType-teckensnitt (Typ 42) eller sammansatta teckensnitt (Typ 0) som består av TrueType-teckensnitt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Sparaalternativen. |
| startPage | int | Sidan från vilken man inklusivt ska börja extrahera text. |
| endPage | int | Sidan till vilken man inklusivt ska extrahera text. |

**Returns:**
java.lang.String - Texten som finns i de valda sidorna i PS-filen.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Fyll en godtycklig bana.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| form | java.awt.Shape | Sökvägen att fylla. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Lägger till en textsträng genom att fylla glyfernas inre och rita glyfernas konturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fillPaint | java.awt.Paint | Fyllningen som används för att måla glyfernas inre. |
| strokePaint | java.awt.Paint | Den  java.awt.Paint  som används för att måla glyfernas konturer. Kan vara vilken subklass som helst av  java.awt.Paint  i JDK. |
| stroke | java.awt.Stroke | Strecket som används för att rita glyfernas konturer. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Lägger till en textsträng genom att fylla glyfernas inre och rita glyfernas konturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fillPaint | java.awt.Paint | Fyllningen som används för att måla glyfernas inre. |
| strokePaint | java.awt.Paint | Den  java.awt.Paint  som används för att måla glyfernas konturer. Kan vara vilken subklass som helst av  java.awt.Paint  i JDK. |
| stroke | java.awt.Stroke | Strecket som används för att rita glyfernas konturer. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Lägger till en textsträng genom att fylla glyfernas inre och rita glyfernas konturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. advances En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| advances | float[] |  |
| font | java.awt.Font | Systemteckensnitt som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fillPaint | java.awt.Paint | Fyllningen som används för att måla glyfernas inre. |
| strokePaint | java.awt.Paint | Den  java.awt.Paint  som används för att måla glyfernas konturer. Kan vara vilken subklass som helst av  java.awt.Paint  i JDK. |
| stroke | java.awt.Stroke | Strecket som används för att rita glyfernas konturer. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Lägger till en textsträng genom att fylla glyfernas inre och rita glyfernas konturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| font | java.awt.Font | Systemteckensnitt som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fillPaint | java.awt.Paint | Fyllningen som används för att måla glyfernas inre. |
| strokePaint | java.awt.Paint | Den  java.awt.Paint  som används för att måla glyfernas konturer. Kan vara vilken subklass som helst av  java.awt.Paint  i JDK. |
| stroke | java.awt.Stroke | Strecket som används för att rita glyfernas konturer. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Lägger till en textsträng genom att fylla glyfernas inre.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Lägger till en textsträng genom att fylla glyfernas inre.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fill | java.awt.Paint | Fyllningen som används för att måla glyfer. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Lägger till en textsträng genom att fylla glyfernas inre.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Lägger till en textsträng genom att fylla glyfernas inre.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fill | java.awt.Paint | Fyllningen som används för att måla glyfer. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Lägger till en textsträng genom att fylla glyfernas inre.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| font | java.awt.Font | Systemteckensnitt som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Lägger till en textsträng genom att fylla glyfernas inre.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| font | java.awt.Font | Teckensnittet som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fill | java.awt.Paint | Fyllningen som används för att måla glyfer. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Lägger till en textsträng genom att fylla glyfernas inre.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| font | java.awt.Font | Systemteckensnitt som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Lägger till en textsträng genom att fylla glyfernas inre.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| font | java.awt.Font | Teckensnittet som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fill | java.awt.Paint | Fyllningen som används för att måla glyfer. |

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


Hämtar antalet sidor i det resulterande PDF-dokumentet.

**Returns:**
int - antalet sidor.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Hämtar färg i aktuellt grafikläge.

**Returns:**
java.awt.Paint - Aktuell färg.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Hämtar linje i aktuellt grafikläge.

**Returns:**
java.awt.Stroke - Aktuell linje.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Läser PS/EPS-fil och extraherar XmpMetadata om den redan finns eller lägger till en ny om den inte finns.

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


Indikerar om licensen för Aspose.Page för Java-produkten är åtkomlig och giltig.

**Returns:**
boolean - booleskt värde
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Slår samman PS/EPS-filer till en enhet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | PS/EPS-filer för sammanslagning med den här filen till en utskriftsenhet. |
| device | [Device](../../com.aspose.page/device) | En utmatningsenhet. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Innehåller flaggor som specificerar utskrift av fel som kastas under konvertering. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Slår samman PS/EPS-filer till en enhet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | En PDF-utdataström. |
| filesForMerge | java.lang.String[] | PS/EPS-filer för sammanslagning med den här filen till en utskriftsenhet. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Innehåller flaggor som specificerar utskrift av fel som kastas under konvertering. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Slår samman PS/EPS-filer till en enhet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | En sökväg för PDF-utdatafil. |
| filesForMerge | java.lang.String[] | PS/EPS-filer för sammanslagning med den här filen till en utskriftsenhet. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Innehåller flaggor som specificerar utskrift av fel som kastas under konvertering. |

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


Skapar en ny sida och gör den till den aktuella.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float | Bredden på den nya sidan. |
| height | float | Höjden på den nya sidan. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Skapar en ny sida med dokumentets storlek och gör den till den aktuella.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pageName | java.lang.String | Namnet på den nya sidan. Om det är null kommer namnet på sidan att vara ett ordningsnummer för sidan. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Lägger till en textsträng genom att rita glyfkonturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Lägger till en textsträng genom att rita glyfkonturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| outlinePaint | java.awt.Paint | Den  java.awt.Paint  som används för att måla glyfernas konturer. Kan vara vilken subklass som helst av  java.awt.Paint  i JDK. |
| stroke | java.awt.Stroke | Strecket som används för att rita glyfernas konturer. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Lägger till en textsträng genom att rita glyfkonturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Lägger till en textsträng genom att rita glyfkonturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont som kommer att användas för att rita text. Den kan användas med ett anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| outlinePaint | java.awt.Paint | Den  java.awt.Paint  som används för att måla glyfernas konturer. Kan vara vilken subklass som helst av  java.awt.Paint  i JDK. |
| stroke | java.awt.Stroke | Strecket som används för att rita glyfernas konturer. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Lägger till en textsträng genom att rita glyfkonturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| font | java.awt.Font | Systemteckensnitt som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Lägger till en textsträng genom att rita glyfkonturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| advances | float[] | En array med glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| font | java.awt.Font | Teckensnittet som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| outlinePaint | java.awt.Paint | Den  java.awt.Paint  som används för att måla glyfernas konturer. Kan vara vilken subklass som helst av  java.awt.Paint  i JDK. |
| stroke | java.awt.Stroke | Strecket som används för att rita glyfernas konturer. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Lägger till en textsträng genom att rita glyfkonturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| font | java.awt.Font | Systemteckensnitt som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Lägger till en textsträng genom att rita glyfkonturer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Texten att lägga till. |
| font | java.awt.Font | Teckensnittet som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| outlinePaint | java.awt.Paint | Den  java.awt.Paint  som används för att måla glyfernas konturer. Kan vara vilken subklass som helst av  java.awt.Paint  i JDK. |
| stroke | java.awt.Stroke | Strecket som används för att rita glyfernas konturer. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Ändrar storlek på den angivna PsDocument som EPS-fil. Denna metod används endast efter att EPS-storleken har extraherats. Den sparar den ursprungliga EPS-filen med uppdaterad befintlig %%BoundingBox eller en ny kommer att skapas. Sidans transformationsmatris kommer också att sättas.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Ny storlek på EPS-bild i tilldelade enheter. |
| units | [Units](../../com.aspose.page/units) | Enheterna för den nya storleken. Kan vara punkter, tum, millimeter, centimeter och procent av ursprunglig storlek. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Lägger till rotation moturs kring origo i aktuellt grafikläge (rotera aktuell matris).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| angleRadians | float | Vinkeln för rotation i radianer. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Lägger till rotation moturs kring origo i aktuellt grafikläge (rotera aktuell matris).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| angleDegrees | int | Vinkeln för rotation i grader. |

### save() {#save--}
```
public void save()
```


Sparar angiven PsDocument som PS- eller EPS-fil. Denna metod används endast när PsDocument skapades från början.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Sparar PS/EPS-fil till en enhet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | En utmatningsenhet. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Innehåller flaggor som specificerar utskrift av fel som kastas under konvertering. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Sparar angiven PsDocument till strömmen. Denna metod används endast efter att XMP-metadata har uppdaterats. Den sparar den ursprungliga EPS-filen med uppdaterad befintlig metadata eller en ny som skapats vid anrop av getMetadata‑metoden. I det sista fallet läggs all nödvändig PostScript‑kod och EPS‑kommentarer till.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Ström för utdata‑EPS‑fil. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Sparar angiven PsDocument som EPS-fil. Denna metod används endast efter att XMP-metadata har uppdaterats. Den sparar den ursprungliga EPS-filen med uppdaterad befintlig metadata eller en ny som skapats vid anrop av getMetadata‑metoden. I det sista fallet läggs all nödvändig PostScript‑kod och EPS‑kommentarer till.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | En sökväg för EPS-utdatafil.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Sparar PS/EPS-fil till bildfil. Utdata‑katalogen och filnamnet kommer att vara samma som från indata‑PS‑filen. Filändelsen kommer att motsvara bildformatet i parametern \"options\". Om dokumentet initierades med en ström som inte härstammar från FileInputStream, kommer bildfilen att sparas i den aktuella mappen med standardmall för filnamn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Innehåller nödvändiga parametrar för att spara bild samt flaggor som specificerar utdata för fel som kastas under konverteringen. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Sparar PS/EPS-fil till bildfil i den angivna katalogen med det angivna filnamnet. Filändelsen kommer att motsvara bildformatet i parametern \"options\".

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Innehåller nödvändiga parametrar för att spara bild samt flaggor som specificerar utdata för fel som kastas under konverteringen. |
| outDir | java.lang.String | Utdata‑katalogen där bildfilen kommer att sparas. |
| fileNameTemplate | java.lang.String | Filnamnsmall för bilden (utan filändelse). Om indata‑PS/EPS‑filen har en sida kommer den att vara exakt filnamnet, annars \"\\_[n]\", där \"n\" är sidnumret med början från 0, ett suffix kommer att läggas till detta. Filändelsen kommer att motsvara bildformatet i parametern \"option\". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Sparar PS/EPS-fil till bildens byte-arrayer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Innehåller nödvändiga parametrar för att spara bild samt flaggor som specificerar utdata för fel som kastas under konverteringen. |

**Returns:**
byte[][] - Bildbytes. En byte‑array per sida.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Sparar PS/EPS-fil till en utdata-PDF-ström.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | En PDF-utdataström. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Innehåller flaggor som specificerar utskrift av fel som kastas under konvertering. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Sparar PS/EPS-fil till en PDF-fil.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | En sökväg för PDF-utdatafil. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Innehåller flaggor som specificerar utskrift av fel som kastas under konvertering. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Sparar BufferedImage-objekt till EPS-fil.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Bilden. |
| epsStream | java.io.OutputStream | EPS‑utdata‑ström. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Innehåller parametrar som specificerar utdata för fel som kastas under konverteringen. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Sparar BufferedImage-objekt till EPS-fil.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Bilden. |
| epsFilePath | java.lang.String | EPS-filens sökväg. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Innehåller parametrar som specificerar utdata för fel som kastas under konverteringen. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Sparar PNG/JPEG/BMP/GIF-bild från indataström till EPS-utdataström.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageStream | java.io.InputStream | Bildens inmatningsström. |
| epsStream | java.io.OutputStream | EPS‑utdata‑ström. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Innehåller parametrar som specificerar utdata för fel som kastas under konverteringen. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Sparar PNG/JPEG/BMP/GIF-bild från fil till EPS-fil.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFilePath | java.lang.String | Bildfilens sökväg. |
| epsFilePath | java.lang.String | EPS-filens sökväg. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Innehåller parametrar som specificerar utdata för fel som kastas under konverteringen. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Lägger till skalning i aktuellt grafikläge (skala aktuell matris).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| xScale | float | Skalan på X‑axeln. |
| yScale | float | Skalan på Y‑axeln. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Specificerar en indataström.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| is | java.io.InputStream | Inmatningsström för PS/EPS‑fil. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Ställer in sidans enhetsparametrar (se operatorn "setpagedevice" i PostScript‑specifikationen). Bland dessa kan sidstorlek och färg etc.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Sidans parametrar. I denna ordbok kan sidstorlek och färg med mera finnas. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Ställer in sidstorlek. För att skapa sidor med olika storlekar i ett dokument, använd metoden setPageDevice precis efter den här metoden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float | Sidans bredd i den resulterande PostScript‑filen. |
| height | float | Sidans höjd i den resulterande PostScript‑filen. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Sätter färg i det aktuella grafikläget.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| färg | java.awt.Paint | Målningsobjektet. Det kan vara någon underklass till Paint‑klassen som finns i JDK. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Sätter linje i det aktuella grafikläget.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stroke | java.awt.Stroke | Strecket. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Ställ in den aktuella transformationen till denna.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| matris | java.awt.geom.AffineTransform | Transformationen. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Lägger till skev transformation i det aktuella grafikläget (skevar den aktuella matrisen).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| shx | float | Skevning i X‑axeln. |
| shy | float | Skevning i Y‑axeln. |

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


Lägger till transformation i det aktuella grafikläget (konkatenerar denna matris med den aktuella).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| matris | java.awt.geom.AffineTransform | Transformationen. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Lägger till förskjutning i det aktuella grafikläget (förskjuter den aktuella matrisen).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | Översättningen i X-riktning. |
| y | float | Översättningen i Y-riktning. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Skriver återställning av det aktuella grafikläget (se PostScript-specifikationen för operatorn "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Skriver sparande av det aktuella grafikläget (se PostScript-specifikationen för operatorn "gsave").

