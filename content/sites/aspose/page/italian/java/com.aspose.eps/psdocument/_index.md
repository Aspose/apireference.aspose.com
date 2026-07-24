---
title: "PsDocument"
second_title: "Aspose.Page per Java API Reference"
description: "Questa classe incapsula documenti PS/EPS."
type: docs
weight: 16
url: /it/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Questa classe incapsula documenti PS/EPS.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PsDocument()](#PsDocument--) | Inizializza un  PsDocument  vuoto con pagina inizializzata. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Inizializza un  PsDocument  vuoto con pagina inizializzata. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Inizializza un  PsDocument  vuoto con pagina inizializzata. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Inizializza un  PsDocument  vuoto. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Inizializza un  PsDocument  vuoto. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Inizializza un  PsDocument  vuoto quando il numero di pagine del documento Postscript è noto in anticipo. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Inizializza un  PsDocument  vuoto quando il numero di pagine del documento Postscript è noto in anticipo. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Inizializza  PsDocument  con un file PS/EPS di input. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Inizializza  PsDocument  con un flusso di file PS/EPS. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Aggiunge il ritaglio allo stato grafico corrente. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Aggiunge il ritaglio allo stato grafico corrente e poi scrive l'operatore "newpath". |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Aggiunge un rettangolo di ritaglio allo stato grafico corrente. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Aggiunge il ritaglio da un contorno del testo fornito nel carattere specificato. |
| [closePage()](#closePage--) | Completa la pagina corrente. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Converte il font Type 1 in TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Converte il font Type 3 in TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Converte il font Type 3 in TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Ritaglia il  PsDocument  fornito come file EPS. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Disegna un percorso arbitrario. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Disegna un'immagine mascherata. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Disegna un'immagine. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Disegna un'immagine trasformata con sfondo. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Disegna un'immagine trasparente trasformata con sfondo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Legge il file EPS ed estrae il riquadro di delimitazione dell'immagine EPS dal commento %%BoundingBox o i limiti per la dimensione di pagina predefinita (0, 0, 595, 842) se non esiste. |
| [extractEpsSize()](#extractEpsSize--) | Legge il file EPS ed estrae le dimensioni dell'immagine EPS dal commento %%BoundingBox o dalla dimensione di pagina predefinita (595, 842) se non esiste. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Estrae il testo dal file PS. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Riempire un percorso arbitrario. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Ottiene il numero di pagine nel documento PDF risultante. |
| [getPaint()](#getPaint--) | Ottiene il colore di riempimento nello stato grafico corrente. |
| [getStroke()](#getStroke--) | Ottiene il tratto nello stato grafico corrente. |
| [getXmpMetadata()](#getXmpMetadata--) | Legge il file PS/EPS ed estrae XmpMetadata se esiste già o ne aggiunge uno nuovo se non esiste. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Indica se la licenza del prodotto Aspose.Page per Java è accessibile e valida. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Unisce i file PS/EPS a un dispositivo. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Unisce i file PS/EPS a un dispositivo. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Unisce i file PS/EPS a un dispositivo. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Crea una nuova pagina e la imposta come corrente. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Crea una nuova pagina con le dimensioni del documento e la imposta come corrente. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Ridimensiona il PsDocument fornito come file EPS. |
| [rotate(float angleRadians)](#rotate-float-) | Aggiunge una rotazione in senso antiorario attorno all'origine allo stato grafico corrente (ruota la matrice corrente). |
| [rotate(int angleDegrees)](#rotate-int-) | Aggiunge una rotazione in senso antiorario attorno all'origine allo stato grafico corrente (ruota la matrice corrente). |
| [save()](#save--) | Salva il PsDocument fornito come file PS o EPS. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Salva il file PS/EPS su un dispositivo. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Salva il PsDocument fornito nello stream. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Salva il PsDocument fornito come file EPS. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Salva il file PS/EPS in un file immagine. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Salva il file PS/EPS in un file immagine nella directory specificata con il nome file specificato. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Salva il file PS/EPS in array di byte di immagini. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Salva il file PS/EPS in uno stream PDF di output. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Salva il file PS/EPS in un file PDF. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Salva l'oggetto BufferedImage in un file EPS. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Salva l'oggetto BufferedImage in un file EPS. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Salva l'immagine PNG/JPEG/BMP/GIF dallo stream di input nello stream di output EPS. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Salva l'immagine PNG/JPEG/BMP/GIF da file in un file EPS. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Aggiunge la scala allo stato grafico corrente (scala la matrice corrente). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Specifica un flusso di input. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Imposta i parametri del dispositivo di pagina (vedi l'operatore "setpagedevice" nella specifica PostScript). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Imposta la dimensione della pagina. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Imposta il paint nello stato grafico corrente. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Imposta il tratto nello stato grafico corrente. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Imposta la trasformazione corrente a questa. |
| [shear(float shx, float shy)](#shear-float-float-) | Aggiunge una trasformazione di taglio allo stato grafico corrente (taglia la matrice corrente). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Aggiunge una trasformazione allo stato grafico corrente (concatena questa matrice con quella corrente). |
| [translate(float x, float y)](#translate-float-float-) | Aggiunge una traslazione allo stato grafico corrente (trasla la matrice corrente). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Scrive il ripristino dello stato grafico corrente (vedi la specifica PostScript sull'operatore "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Scrive il salvataggio dello stato grafico corrente (vedi la specifica PostScript sull'operatore "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Inizializza un oggetto PsDocument vuoto con una pagina inizializzata. Questo costruttore è usato solo per operazioni aggiuntive non correlate ai file PostScript, ad esempio la conversione dei font.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Inizializza un  PsDocument  vuoto con pagina inizializzata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Il percorso del file PS/EPS di output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un insieme di parametri che controllano il salvataggio del file PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Inizializza un  PsDocument  vuoto con pagina inizializzata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flusso dove salvare il file PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un insieme di parametri che controllano il salvataggio del file PostScript. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Inizializza un  PsDocument  vuoto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Il percorso del file PS/EPS di output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un insieme di parametri che controllano il salvataggio del file PostScript. |
| multipaged | boolean | Se false la pagina non verrà inizializzata. In questo caso l'inizializzazione della pagina dovrebbe essere eseguita tramite una chiamata esplicita "openPage(width, height)". |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Inizializza un  PsDocument  vuoto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flusso dove salvare il file PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un insieme di parametri che controllano il salvataggio del file PostScript. |
| multipaged | boolean | Se false la pagina non verrà inizializzata. In questo caso l'inizializzazione della pagina dovrebbe essere eseguita tramite una chiamata esplicita "openPage(width, height)". |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Inizializza un  PsDocument  vuoto quando il numero di pagine del documento Postscript è noto in anticipo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Il percorso del file PS/EPS di output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un insieme di parametri che controllano il salvataggio del file PostScript. |
| numberOfPages | int | Il numero di pagine nel documento PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Inizializza un  PsDocument  vuoto quando il numero di pagine del documento Postscript è noto in anticipo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flusso dove salvare il file PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un insieme di parametri che controllano il salvataggio del file PostScript. |
| numberOfPages | int | Il numero di pagine nel documento PostScript. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Inizializza  PsDocument  con un file PS/EPS di input.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| psFilePath | java.lang.String | Percorso del file PS/EPS. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Inizializza  PsDocument  con un flusso di file PS/EPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| psStream | java.io.InputStream | Flusso del file PS/EPS. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Aggiunge il ritaglio allo stato grafico corrente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | java.awt.Shape | Il percorso di ritaglio. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Aggiunge il ritaglio allo stato grafico corrente e poi scrive l'operatore "newpath". È necessario farlo per evitare la confluenza di questo percorso di ritaglio con alcuni percorsi successivi, come i glifi delineati con l'operatore "charpath".

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | java.awt.Shape | Il percorso di ritaglio. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Aggiunge un rettangolo di ritaglio allo stato grafico corrente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | Il rettangolo di ritaglio. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Aggiunge il ritaglio da un contorno del testo fornito nel carattere specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo. |
| font | java.awt.Font | Il font. |
| x | float | Una coordinata X della posizione del testo. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Completa la pagina corrente.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Converte il font Type 1 in TrueType. Il nome del file TTF convertito sarà lo stesso del font Type 1 di input con estensione ".ttf". Il file TTF verrà salvato nella directory di output assegnata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Il percorso del file font Type 1.. |
| outputDir | java.lang.String | Directory di output dove salvare il font TrueType risultante. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Converte il font Type 3 in TrueType. Il file TTF verrà salvato nello stream di output fornito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Il percorso del file font Type 3. |
| outputStream | java.io.OutputStream | Stream di output dove salvare il font TrueType risultante. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Converte il font Type 3 in TrueType. Il nome del file TTF convertito sarà lo stesso del font Type 3 di input con estensione ".ttf". Il file TTF verrà salvato nella directory di output assegnata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Il percorso del file font Type 3.. |
| outputDir | java.lang.String | Directory di output dove salvare il font TrueType risultante. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Ritaglia il PsDocument fornito come file EPS. Salva il file EPS iniziale con il %%BoundingBox esistente aggiornato oppure ne crea uno nuovo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | Il riquadro di ritaglio (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Disegna un percorso arbitrario.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| shape | java.awt.Shape | Il percorso da riempire. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Disegna un'immagine mascherata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | L'immagine da disegnare. Deve essere nel formato immagine RGB a 24 bpp. |
| alphaMask1bpp | java.awt.image.BufferedImage | La maschera dell'immagine. Deve essere nel formato immagine a 1 bpp. |
| transform | java.awt.geom.AffineTransform | La matrice per trasformare l'immagine. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Disegna un'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'immagine da disegnare. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Disegna un'immagine trasformata con sfondo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'immagine da disegnare. |
| transform | java.awt.geom.AffineTransform | La matrice per trasformare l'immagine. |
| bkg | java.awt.Color | Lo sfondo per l'immagine. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Disegna l'immagine trasparente trasformata con sfondo. Se l'immagine non ha canale Alpha verrà disegnata come immagine opaca.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'immagine da disegnare. |
| transform | java.awt.geom.AffineTransform | La matrice per trasformare l'immagine. |
| transparencyThreshold | int | Una soglia che definisce a partire da quale valore di trasparenza il pixel sarà interpretato come completamente trasparente. Tutti i valori al di sotto di questa soglia saranno interpretati come completamente opachi. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Legge il file EPS ed estrae il riquadro di delimitazione dell'immagine EPS dal commento %%BoundingBox o i limiti per la dimensione di pagina predefinita (0, 0, 595, 842) se non esiste.

**Returns:**
int[] - Il riquadro di delimitazione dell'immagine EPS.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Legge il file EPS ed estrae le dimensioni dell'immagine EPS dal commento %%BoundingBox o dalla dimensione di pagina predefinita (595, 842) se non esiste.

**Returns:**
java.awt.Dimension - La dimensione dell'immagine EPS.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Estrae il testo da un file PS. Funziona solo per il testo scritto con font TrueType (Tipo 42) o font compositi (Tipo 0) che consistono in font TrueType.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Le opzioni di salvataggio. |
| startPage | int | La pagina da cui, in modo inclusivo, iniziare l'estrazione del testo. |
| endPage | int | La pagina da cui estrarre il testo in modo inclusivo. |

**Returns:**
java.lang.String - Il testo contenuto nelle pagine selezionate del file PS.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Riempire un percorso arbitrario.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| shape | java.awt.Shape | Il percorso da riempire. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fillPaint | java.awt.Paint | Il riempimento usato per dipingere l'interno dei glifi. |
| strokePaint | java.awt.Paint | Il  java.awt.Paint  usato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse della classe  java.awt.Paint  nel JDK. |
| stroke | java.awt.Stroke | Il tratto usato per disegnare i contorni dei glifi. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fillPaint | java.awt.Paint | Il riempimento usato per dipingere l'interno dei glifi. |
| strokePaint | java.awt.Paint | Il  java.awt.Paint  usato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse della classe  java.awt.Paint  nel JDK. |
| stroke | java.awt.Stroke | Il tratto usato per disegnare i contorni dei glifi. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. advances Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| advances | float[] |  |
| font | java.awt.Font | Font di sistema che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fillPaint | java.awt.Paint | Il riempimento usato per dipingere l'interno dei glifi. |
| strokePaint | java.awt.Paint | Il  java.awt.Paint  usato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse della classe  java.awt.Paint  nel JDK. |
| stroke | java.awt.Stroke | Il tratto usato per disegnare i contorni dei glifi. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| font | java.awt.Font | Font di sistema che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fillPaint | java.awt.Paint | Il riempimento usato per dipingere l'interno dei glifi. |
| strokePaint | java.awt.Paint | Il  java.awt.Paint  usato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse della classe  java.awt.Paint  nel JDK. |
| stroke | java.awt.Stroke | Il tratto usato per disegnare i contorni dei glifi. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fill | java.awt.Paint | Il riempimento usato per dipingere i glifi. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fill | java.awt.Paint | Il riempimento usato per dipingere i glifi. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| font | java.awt.Font | Font di sistema che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| font | java.awt.Font | Il font che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fill | java.awt.Paint | Il riempimento usato per dipingere i glifi. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| font | java.awt.Font | Font di sistema che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Aggiunge una stringa di testo riempiendo l'interno dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| font | java.awt.Font | Il font che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fill | java.awt.Paint | Il riempimento usato per dipingere i glifi. |

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


Ottiene il numero di pagine nel documento PDF risultante.

**Returns:**
int - il numero di pagine.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Ottiene il colore di riempimento nello stato grafico corrente.

**Returns:**
java.awt.Paint - Pittura corrente.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Ottiene il tratto nello stato grafico corrente.

**Returns:**
java.awt.Stroke - Tratto corrente.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Legge il file PS/EPS ed estrae XmpMetadata se esiste già o ne aggiunge uno nuovo se non esiste.

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


Indica se la licenza del prodotto Aspose.Page per Java è accessibile e valida.

**Returns:**
boolean - valore booleano
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Unisce i file PS/EPS a un dispositivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | File PS/EPS per l'unione con questo file a un dispositivo di output. |
| device | [Device](../../com.aspose.page/device) | Un dispositivo di output. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contiene flag che specificano l'output degli errori generati durante la conversione. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Unisce i file PS/EPS a un dispositivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Un flusso PDF di output. |
| filesForMerge | java.lang.String[] | File PS/EPS per l'unione con questo file a un dispositivo di output. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contiene flag che specificano l'output degli errori generati durante la conversione. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Unisce i file PS/EPS a un dispositivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Un percorso di file PDF di output. |
| filesForMerge | java.lang.String[] | File PS/EPS per l'unione con questo file a un dispositivo di output. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contiene flag che specificano l'output degli errori generati durante la conversione. |

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


Crea una nuova pagina e la imposta come corrente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float | La larghezza della nuova pagina. |
| altezza | float | L'altezza della nuova pagina. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Crea una nuova pagina con le dimensioni del documento e la imposta come corrente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pageName | java.lang.String | Il nome della nuova pagina. Se è null, il nome della pagina sarà un numero d'ordine della pagina. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Aggiunge una stringa di testo disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Aggiunge una stringa di testo disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| outlinePaint | java.awt.Paint | Il  java.awt.Paint  usato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse della classe  java.awt.Paint  nel JDK. |
| stroke | java.awt.Stroke | Il tratto usato per disegnare i contorni dei glifi. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Aggiunge una stringa di testo disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Aggiunge una stringa di testo disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont che verrà usato per disegnare il testo. Può essere usato con un font personalizzato che si trova in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| outlinePaint | java.awt.Paint | Il  java.awt.Paint  usato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse della classe  java.awt.Paint  nel JDK. |
| stroke | java.awt.Stroke | Il tratto usato per disegnare i contorni dei glifi. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Aggiunge una stringa di testo disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| font | java.awt.Font | Font di sistema che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Aggiunge una stringa di testo disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| advances | float[] | Un array di larghezze dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| font | java.awt.Font | Il font che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| outlinePaint | java.awt.Paint | Il  java.awt.Paint  usato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse della classe  java.awt.Paint  nel JDK. |
| stroke | java.awt.Stroke | Il tratto usato per disegnare i contorni dei glifi. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Aggiunge una stringa di testo disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| font | java.awt.Font | Font di sistema che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Aggiunge una stringa di testo disegnando i contorni dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Il testo da aggiungere. |
| font | java.awt.Font | Il font che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| outlinePaint | java.awt.Paint | Il  java.awt.Paint  usato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse della classe  java.awt.Paint  nel JDK. |
| stroke | java.awt.Stroke | Il tratto usato per disegnare i contorni dei glifi. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Ridimensiona il PsDocument fornito come file EPS. Questo metodo è usato solo dopo aver estratto le dimensioni EPS. Salva il file EPS iniziale con il %%BoundingBox esistente aggiornato oppure ne crea uno nuovo. La matrice di trasformazione della pagina verrà impostata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Nuova dimensione dell'immagine EPS nelle unità assegnate. |
| units | [Units](../../com.aspose.page/units) | Le unità della nuova dimensione. Possono essere punti, pollici, millimetri, centimetri e percentuali della dimensione iniziale. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Aggiunge una rotazione in senso antiorario attorno all'origine allo stato grafico corrente (ruota la matrice corrente).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| angleRadians | float | L'angolo di rotazione in radianti. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Aggiunge una rotazione in senso antiorario attorno all'origine allo stato grafico corrente (ruota la matrice corrente).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| angleDegrees | int | L'angolo di rotazione in gradi. |

### save() {#save--}
```
public void save()
```


Salva il PsDocument fornito come file PS o EPS. Questo metodo è usato solo quando il PsDocument è stato creato da zero.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Salva il file PS/EPS su un dispositivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Un dispositivo di output. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contiene flag che specificano l'output degli errori generati durante la conversione. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Salva il PsDocument fornito nello stream. Questo metodo è usato solo dopo l'aggiornamento dei metadati XMP. Salva il file EPS iniziale con i metadati esistenti aggiornati oppure ne crea uno nuovo chiamando il metodo getMetadata. In quest'ultimo caso vengono aggiunti tutti i codici PostScript necessari e i commenti EPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Stream del file EPS di output. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Salva il PsDocument fornito come file EPS. Questo metodo è usato solo dopo l'aggiornamento dei metadati XMP. Salva il file EPS iniziale con i metadati esistenti aggiornati oppure ne crea uno nuovo chiamando il metodo getMetadata. In quest'ultimo caso vengono aggiunti tutti i codici PostScript necessari e i commenti EPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Un percorso di file EPS di output.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Salva il file PS/EPS in un file immagine. La directory di output e il nome del file saranno gli stessi del file PS di input. L'estensione del file corrisponderà al formato immagine nel parametro "options". Se il documento è stato inizializzato con uno stream che non deriva da FileInputStream, il file immagine verrà salvato nella cartella corrente con il modello di nome file predefinito.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contiene i parametri necessari per salvare l'immagine e i flag che specificano l'output degli errori generati durante la conversione. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Salva il file PS/EPS in un file immagine nella directory specificata con il nome file specificato. L'estensione del file corrisponderà al formato immagine nel parametro "options".

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contiene i parametri necessari per salvare l'immagine e i flag che specificano l'output degli errori generati durante la conversione. |
| outDir | java.lang.String | La directory di output dove verrà salvato il file immagine. |
| fileNameTemplate | java.lang.String | Il modello di nome file per l'immagine (senza estensione). Se il file PS/EPS di input è a 1 pagina, sarà esattamente il nome del file, altrimenti "\_[n]", dove "n" è il numero di pagina a partire da 0, a questo verrà aggiunto il suffisso. L'estensione del file corrisponderà al formato immagine nel parametro "option". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Salva il file PS/EPS in array di byte di immagini.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contiene i parametri necessari per salvare l'immagine e i flag che specificano l'output degli errori generati durante la conversione. |

**Returns:**
byte[][] - Byte dell'immagine. Un array di byte per una pagina.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Salva il file PS/EPS in uno stream PDF di output.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Un flusso PDF di output. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Contiene flag che specificano l'output degli errori generati durante la conversione. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Salva il file PS/EPS in un file PDF.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Un percorso di file PDF di output. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Contiene flag che specificano l'output degli errori generati durante la conversione. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Salva l'oggetto BufferedImage in un file EPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'immagine. |
| epsStream | java.io.OutputStream | Stream di output EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contiene i parametri che specificano l'output degli errori generati durante la conversione. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Salva l'oggetto BufferedImage in un file EPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'immagine. |
| epsFilePath | java.lang.String | Percorso del file EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contiene i parametri che specificano l'output degli errori generati durante la conversione. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Salva l'immagine PNG/JPEG/BMP/GIF dallo stream di input nello stream di output EPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageStream | java.io.InputStream | Stream di input dell'immagine. |
| epsStream | java.io.OutputStream | Stream di output EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contiene i parametri che specificano l'output degli errori generati durante la conversione. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Salva l'immagine PNG/JPEG/BMP/GIF da file in un file EPS.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageFilePath | java.lang.String | Percorso del file immagine. |
| epsFilePath | java.lang.String | Percorso del file EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contiene i parametri che specificano l'output degli errori generati durante la conversione. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Aggiunge la scala allo stato grafico corrente (scala la matrice corrente).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xScale | float | La scala sull'asse X. |
| yScale | float | La scala sull'asse Y. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Specifica un flusso di input.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| is | java.io.InputStream | Stream di input del file PS/EPS. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Imposta i parametri del dispositivo di pagina (vedi operatore "setpagedevice" nella specifica PostScript). Tra questi possono esserci dimensioni della pagina, colore, ecc.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Parametri della pagina. In questo dizionario possono esserci dimensione della pagina e colore ecc. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Imposta la dimensione della pagina. Per creare pagine con dimensioni diverse in un documento usa il metodo  setPageDevice  subito dopo questo metodo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float | La larghezza della pagina nel file PostScript risultante. |
| altezza | float | L'altezza della pagina nel file PostScript risultante. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Imposta il paint nello stato grafico corrente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| paint | java.awt.Paint | Il paint. Può essere qualsiasi sottoclasse della classe  Paint  esistente in JDK. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Imposta il tratto nello stato grafico corrente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stroke | java.awt.Stroke | Il tratto. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Imposta la trasformazione corrente a questa.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | La trasformazione. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Aggiunge una trasformazione di taglio allo stato grafico corrente (taglia la matrice corrente).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| shx | float | La distorsione sull'asse X. |
| shy | float | La distorsione sull'asse Y. |

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


Aggiunge una trasformazione allo stato grafico corrente (concatena questa matrice con quella corrente).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | La trasformazione. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Aggiunge una traslazione allo stato grafico corrente (trasla la matrice corrente).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | La traslazione nella direzione X. |
| y | float | La traslazione nella direzione Y. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Scrive il ripristino dello stato grafico corrente (vedi la specifica PostScript sull'operatore "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Scrive il salvataggio dello stato grafico corrente (vedi la specifica PostScript sull'operatore "gsave").

