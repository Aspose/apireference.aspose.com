---
title: "PsDocument"
second_title: "Référence API Aspose.Page pour Java"
description: "Cette classe encapsule les documents PS/EPS."
type: docs
weight: 16
url: /fr/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Cette classe encapsule les documents PS/EPS.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PsDocument()](#PsDocument--) | Initialise un  PsDocument  vide avec une page initialisée. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Initialise un  PsDocument  vide avec une page initialisée. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Initialise un  PsDocument  vide avec une page initialisée. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Initialise un  PsDocument  vide. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Initialise un  PsDocument  vide. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Initialise un  PsDocument  vide lorsque le nombre de pages du document Postscript est connu à l'avance. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Initialise un  PsDocument  vide lorsque le nombre de pages du document Postscript est connu à l'avance. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Initialise le  PsDocument  avec un fichier PS/EPS d'entrée. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Initialise le  PsDocument  avec un flux de fichier PS/EPS. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Ajoute un clip à l'état graphique actuel. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Ajoute un clip à l'état graphique actuel puis écrit l'opérateur "newpath". |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Ajoute un rectangle de découpage à l'état graphique actuel. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Ajoute un clip à partir du contour du texte donné dans la police donnée. |
| [closePage()](#closePage--) | Complète la page actuelle. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Convertit la police Type 1 en TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Convertit la police Type 3 en TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Convertit la police Type 3 en TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Recadre le  PsDocument  donné en tant que fichier EPS. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Dessine un chemin arbitraire. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Dessine une image masquée. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Dessine une image. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Dessine une image transformée avec arrière-plan. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Dessine une image transparente transformée avec arrière-plan. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Lit le fichier EPS et extrait la boîte englobante de l'image EPS à partir du commentaire %%BoundingBox ou les limites pour la taille de page par défaut (0, 0, 595, 842) si elle n'existe pas. |
| [extractEpsSize()](#extractEpsSize--) | Lit le fichier EPS et extrait la taille de l'image EPS à partir du commentaire %%BoundingBox ou la taille de page par défaut (595, 842) si elle n'existe pas. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Extrait le texte du fichier PS. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Remplir un chemin arbitraire. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Obtient le nombre de pages du document PDF résultant. |
| [getPaint()](#getPaint--) | Obtient la peinture dans l'état graphique actuel. |
| [getStroke()](#getStroke--) | Obtient le trait dans l'état graphique actuel. |
| [getXmpMetadata()](#getXmpMetadata--) | Lit le fichier PS/EPS et extrait les métadonnées XmpMetdata si elles existent déjà ou en ajoute de nouvelles si elles n'existent pas. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Indique si la licence du produit Aspose.Page for Java est accessible et valide. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Fusionne les fichiers PS/EPS vers un dispositif. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Fusionne les fichiers PS/EPS vers un dispositif. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Fusionne les fichiers PS/EPS vers un dispositif. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Crée une nouvelle page et la rend courante. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Crée une nouvelle page avec la taille du document et la rend courante. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Redimensionne le PsDocument donné en fichier EPS. |
| [rotate(float angleRadians)](#rotate-float-) | Ajoute une rotation dans le sens antihoraire autour de l'origine à l'état graphique actuel (faire pivoter la matrice actuelle). |
| [rotate(int angleDegrees)](#rotate-int-) | Ajoute une rotation dans le sens antihoraire autour de l'origine à l'état graphique actuel (faire pivoter la matrice actuelle). |
| [save()](#save--) | Enregistre le PsDocument donné en fichier PS ou EPS. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Enregistre le fichier PS/EPS vers un dispositif. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Enregistre le PsDocument donné dans le flux. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Enregistre le PsDocument donné en fichier EPS. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Enregistre le fichier PS/EPS en fichier image. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Enregistre le fichier PS/EPS en fichier image dans le répertoire spécifié avec le nom de fichier spécifié. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Enregistre le fichier PS/EPS dans des tableaux d'octets d'images. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Enregistre le fichier PS/EPS dans un flux PDF de sortie. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Enregistre le fichier PS/EPS en fichier PDF. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Enregistre l'objet BufferedImage en fichier EPS. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Enregistre l'objet BufferedImage en fichier EPS. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Enregistre l'image PNG/JPEG/BMP/GIF du flux d'entrée vers le flux de sortie EPS. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Enregistre l'image PNG/JPEG/BMP/GIF du fichier en fichier EPS. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Ajoute une mise à l'échelle à l'état graphique actuel (mise à l'échelle de la matrice actuelle). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Spécifie un flux d'entrée. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Définit les paramètres du dispositif de page (voir l'opérateur "setpagedevice" de la spécification PostScript). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Définit la taille de la page. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Définit la peinture dans l'état graphique actuel. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Définit le tracé dans l'état graphique actuel. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Définit la transformation actuelle à celle-ci. |
| [shear(float shx, float shy)](#shear-float-float-) | Ajoute une transformation de cisaillement à l'état graphique actuel (cisaillement de la matrice actuelle). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Ajoute une transformation à l'état graphique actuel (concatène cette matrice avec celle actuelle). |
| [translate(float x, float y)](#translate-float-float-) | Ajoute une translation à l'état graphique actuel (déplace la matrice actuelle). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Écrit la restauration de l'état graphique actuel (voir la spécification PostScript concernant l'opérateur "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Écrit la sauvegarde de l'état graphique actuel (voir la spécification PostScript concernant l'opérateur "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Initialise un PsDocument vide avec une page initialisée. Ce constructeur n'est utilisé que pour des opérations supplémentaires qui ne sont pas liées aux fichiers PostScript, par exemple la conversion de polices.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Initialise un  PsDocument  vide avec une page initialisée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Le chemin du fichier PS/EPS de sortie. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Initialise un  PsDocument  vide avec une page initialisée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flux où enregistrer le fichier PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Initialise un  PsDocument  vide.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Le chemin du fichier PS/EPS de sortie. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |
| multipaged | boolean | Si false, la page ne sera pas initialisée. Dans ce cas, l'initialisation de la page doit être effectuée via l'appel explicite "openPage(width, height) call. |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Initialise un  PsDocument  vide.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flux où enregistrer le fichier PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |
| multipaged | boolean | Si false, la page ne sera pas initialisée. Dans ce cas, l'initialisation de la page doit être effectuée via l'appel explicite "openPage(width, height) call. |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Initialise un  PsDocument  vide lorsque le nombre de pages du document Postscript est connu à l'avance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Le chemin du fichier PS/EPS de sortie. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |
| numberOfPages | int | Le nombre de pages dans le document PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Initialise un  PsDocument  vide lorsque le nombre de pages du document Postscript est connu à l'avance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| psStream | java.io.OutputStream | Flux où enregistrer le fichier PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |
| numberOfPages | int | Le nombre de pages dans le document PostScript. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Initialise le  PsDocument  avec un fichier PS/EPS d'entrée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| psFilePath | java.lang.String | Chemin du fichier PS/EPS. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Initialise le  PsDocument  avec un flux de fichier PS/EPS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| psStream | java.io.InputStream | Flux du fichier PS/EPS. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Ajoute un clip à l'état graphique actuel.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | Le chemin de découpage. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Ajoute un clip à l'état graphique actuel puis écrit l'opérateur \"newpath\". C'est nécessaire pour éviter la confluence de ce chemin de découpage avec certains chemins ultérieurs tels que les glyphes tracés avec l'opérateur \"charpath\".

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | Le chemin de découpage. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Ajoute un rectangle de découpage à l'état graphique actuel.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | Le rectangle de découpage. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Ajoute un clip à partir du contour du texte donné dans la police donnée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte. |
| police | java.awt.Font | La police. |
| x | float | Une coordonnée X de la position du texte. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Complète la page actuelle.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Convertit la police Type 1 en TrueType. Le nom du fichier TTF converti sera le même que celui de la police Type 1 d'entrée avec l'extension \".ttf\". Le fichier TTF sera enregistré dans le répertoire de sortie assigné.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Le chemin du fichier de police Type 1.. |
| outputDir | java.lang.String | Répertoire de sortie où enregistrer la police TrueType résultante. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Convertit la police Type 3 en TrueType. Le fichier TTF sera enregistré dans le flux de sortie fourni.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Le chemin du fichier de police Type 3. |
| outputStream | java.io.OutputStream | Flux de sortie où enregistrer la police TrueType résultante. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Convertit la police Type 3 en TrueType. Le nom du fichier TTF converti sera le même que celui de la police Type 3 d'entrée avec l'extension \".ttf\". Le fichier TTF sera enregistré dans le répertoire de sortie assigné.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Le chemin du fichier de police Type 3.. |
| outputDir | java.lang.String | Répertoire de sortie où enregistrer la police TrueType résultante. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Rogne le PsDocument fourni en tant que fichier EPS. Il enregistre le fichier EPS initial avec le %%BoundingBox existant mis à jour ou crée un nouveau.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | La boîte de recadrage (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Dessine un chemin arbitraire.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| shape | java.awt.Shape | Le chemin à remplir. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Dessine une image masquée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | L'image à dessiner. Doit être au format image RGB 24bpp. |
| alphaMask1bpp | java.awt.image.BufferedImage | Le masque d'image. Doit être au format image 1bpp. |
| transform | java.awt.geom.AffineTransform | La matrice pour transformer l'image. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Dessine une image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'image à dessiner. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Dessine une image transformée avec arrière-plan.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'image à dessiner. |
| transform | java.awt.geom.AffineTransform | La matrice pour transformer l'image. |
| bkg | java.awt.Color | L'arrière-plan de l'image. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Dessiner l'image transparente transformée avec arrière-plan. Si l'image n'a pas de canal Alpha, elle sera dessinée comme une image opaque.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'image à dessiner. |
| transform | java.awt.geom.AffineTransform | La matrice pour transformer l'image. |
| transparencyThreshold | int | Un seuil qui définit à partir de quelle valeur de transparence le pixel sera interprété comme totalement transparent. Toutes les valeurs inférieures à ce seuil seront interprétées comme totalement opaques. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Lit le fichier EPS et extrait la boîte englobante de l'image EPS à partir du commentaire %%BoundingBox ou les limites pour la taille de page par défaut (0, 0, 595, 842) si elle n'existe pas.

**Returns:**
int[] - La boîte englobante de l'image EPS.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Lit le fichier EPS et extrait la taille de l'image EPS à partir du commentaire %%BoundingBox ou la taille de page par défaut (595, 842) si elle n'existe pas.

**Returns:**
java.awt.Dimension - La taille de l'image EPS.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Extrait le texte d'un fichier PS. Cela ne fonctionne que pour le texte écrit avec des polices TrueType (Type 42) ou des polices composites (Type 0) qui sont composées de polices TrueType.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Les options d'enregistrement. |
| startPage | int | La page à partir de laquelle commencer à extraire le texte, inclusivement. |
| endPage | int | La page à partir de laquelle extraire le texte de manière inclusive. |

**Returns:**
java.lang.String - Le texte contenu dans les pages sélectionnées du fichier PS.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Remplir un chemin arbitraire.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| shape | java.awt.Shape | Le chemin à remplir. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fillPaint | java.awt.Paint | Le remplissage utilisé pour peindre l'intérieur des glyphes. |
| strokePaint | java.awt.Paint | Le  java.awt.Paint  utilisé pour peindre les contours des glyphes. Peut être n'importe quelle sous‑classe de la classe  java.awt.Paint  du JDK. |
| stroke | java.awt.Stroke | Le trait utilisé pour dessiner les contours des glyphes. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fillPaint | java.awt.Paint | Le remplissage utilisé pour peindre l'intérieur des glyphes. |
| strokePaint | java.awt.Paint | Le  java.awt.Paint  utilisé pour peindre les contours des glyphes. Peut être n'importe quelle sous‑classe de la classe  java.awt.Paint  du JDK. |
| stroke | java.awt.Stroke | Le trait utilisé pour dessiner les contours des glyphes. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. advances Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| advances | float[] |  |
| police | java.awt.Font | Police système qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fillPaint | java.awt.Paint | Le remplissage utilisé pour peindre l'intérieur des glyphes. |
| strokePaint | java.awt.Paint | Le  java.awt.Paint  utilisé pour peindre les contours des glyphes. Peut être n'importe quelle sous‑classe de la classe  java.awt.Paint  du JDK. |
| stroke | java.awt.Stroke | Le trait utilisé pour dessiner les contours des glyphes. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| police | java.awt.Font | Police système qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fillPaint | java.awt.Paint | Le remplissage utilisé pour peindre l'intérieur des glyphes. |
| strokePaint | java.awt.Paint | Le  java.awt.Paint  utilisé pour peindre les contours des glyphes. Peut être n'importe quelle sous‑classe de la classe  java.awt.Paint  du JDK. |
| stroke | java.awt.Stroke | Le trait utilisé pour dessiner les contours des glyphes. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fill | java.awt.Paint | Le remplissage utilisé pour peindre les glyphes. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fill | java.awt.Paint | Le remplissage utilisé pour peindre les glyphes. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| police | java.awt.Font | Police système qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| police | java.awt.Font | La police qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fill | java.awt.Paint | Le remplissage utilisé pour peindre les glyphes. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| police | java.awt.Font | Police système qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Ajoute une chaîne de texte en remplissant l'intérieur des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| police | java.awt.Font | La police qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fill | java.awt.Paint | Le remplissage utilisé pour peindre les glyphes. |

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


Obtient le nombre de pages du document PDF résultant.

**Returns:**
int - le nombre de pages.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Obtient la peinture dans l'état graphique actuel.

**Returns:**
java.awt.Paint - Peinture actuelle.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Obtient le trait dans l'état graphique actuel.

**Returns:**
java.awt.Stroke - Trait actuel.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Lit le fichier PS/EPS et extrait les métadonnées XmpMetdata si elles existent déjà ou en ajoute de nouvelles si elles n'existent pas.

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


Indique si la licence du produit Aspose.Page for Java est accessible et valide.

**Returns:**
booléen - valeur booléenne
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Fusionne les fichiers PS/EPS vers un dispositif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Fichiers PS/EPS pour la fusion avec ce fichier vers un dispositif de sortie. |
| device | [Device](../../com.aspose.page/device) | Un périphérique de sortie. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contient des indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Fusionne les fichiers PS/EPS vers un dispositif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Un flux PDF de sortie. |
| filesForMerge | java.lang.String[] | Fichiers PS/EPS pour la fusion avec ce fichier vers un dispositif de sortie. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contient des indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Fusionne les fichiers PS/EPS vers un dispositif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Un chemin de fichier PDF de sortie. |
| filesForMerge | java.lang.String[] | Fichiers PS/EPS pour la fusion avec ce fichier vers un dispositif de sortie. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contient des indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

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


Crée une nouvelle page et la rend courante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float | La largeur de la nouvelle page. |
| hauteur | float | La hauteur de la nouvelle page. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Crée une nouvelle page avec la taille du document et la rend courante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| pageName | java.lang.String | Le nom de la nouvelle page. Si elle est nulle, le nom de la page sera le numéro d'ordre de la page. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Ajoute une chaîne de texte en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Ajoute une chaîne de texte en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| outlinePaint | java.awt.Paint | Le  java.awt.Paint  utilisé pour peindre les contours des glyphes. Peut être n'importe quelle sous‑classe de la classe  java.awt.Paint  du JDK. |
| stroke | java.awt.Stroke | Le trait utilisé pour dessiner les contours des glyphes. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Ajoute une chaîne de texte en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Ajoute une chaîne de texte en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| outlinePaint | java.awt.Paint | Le  java.awt.Paint  utilisé pour peindre les contours des glyphes. Peut être n'importe quelle sous‑classe de la classe  java.awt.Paint  du JDK. |
| stroke | java.awt.Stroke | Le trait utilisé pour dessiner les contours des glyphes. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Ajoute une chaîne de texte en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| police | java.awt.Font | Police système qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Ajoute une chaîne de texte en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| advances | float[] | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| police | java.awt.Font | La police qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| outlinePaint | java.awt.Paint | Le  java.awt.Paint  utilisé pour peindre les contours des glyphes. Peut être n'importe quelle sous‑classe de la classe  java.awt.Paint  du JDK. |
| stroke | java.awt.Stroke | Le trait utilisé pour dessiner les contours des glyphes. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Ajoute une chaîne de texte en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| police | java.awt.Font | Police système qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Ajoute une chaîne de texte en dessinant les contours des glyphes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Le texte à ajouter. |
| police | java.awt.Font | La police qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| outlinePaint | java.awt.Paint | Le  java.awt.Paint  utilisé pour peindre les contours des glyphes. Peut être n'importe quelle sous‑classe de la classe  java.awt.Paint  du JDK. |
| stroke | java.awt.Stroke | Le trait utilisé pour dessiner les contours des glyphes. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Redimensionne le PsDocument donné en tant que fichier EPS. Cette méthode n'est utilisée qu'après l'extraction de la taille EPS. Elle enregistre le fichier EPS initial avec le %%BoundingBox existant mis à jour ou crée un nouveau. La matrice de transformation de la page sera également définie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Nouvelle taille de l'image EPS dans les unités assignées. |
| units | [Units](../../com.aspose.page/units) | Les unités de la nouvelle taille. Elles peuvent être des points, des pouces, des millimètres, des centimètres et des pourcentages de la taille initiale. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Ajoute une rotation dans le sens antihoraire autour de l'origine à l'état graphique actuel (faire pivoter la matrice actuelle).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| angleRadians | float | L'angle de rotation en radians. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Ajoute une rotation dans le sens antihoraire autour de l'origine à l'état graphique actuel (faire pivoter la matrice actuelle).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| angleDegrees | int | L'angle de rotation en degrés. |

### save() {#save--}
```
public void save()
```


Enregistre le PsDocument donné en tant que fichier PS ou EPS. Cette méthode n'est utilisée que lorsque le PsDocument a été créé de toutes pièces.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Enregistre le fichier PS/EPS vers un dispositif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Un périphérique de sortie. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Contient des indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Enregistre le PsDocument donné dans le flux. Cette méthode n'est utilisée qu'après la mise à jour des métadonnées XMP. Elle enregistre le fichier EPS initial avec les métadonnées existantes mises à jour ou crée un nouveau lors de l'appel de la méthode getMetadata. Dans ce dernier cas, tout le code PostScript nécessaire et les commentaires EPS sont ajoutés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Flux du fichier EPS de sortie. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Enregistre le PsDocument donné en tant que fichier EPS. Cette méthode n'est utilisée qu'après la mise à jour des métadonnées XMP. Elle enregistre le fichier EPS initial avec les métadonnées existantes mises à jour ou crée un nouveau lors de l'appel de la méthode getMetadata. Dans ce dernier cas, tout le code PostScript nécessaire et les commentaires EPS sont ajoutés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Un chemin de fichier EPS de sortie.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Enregistre le fichier PS/EPS en fichier image. Le répertoire de sortie et le nom de fichier seront les mêmes que ceux du fichier PS d'entrée. L'extension du fichier correspondra au format d'image dans le paramètre "options". Si le document a été initialisé avec un flux qui n'est pas dérivé de FileInputStream, le fichier image sera enregistré dans le dossier actuel avec le modèle de nom de fichier par défaut.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contient les paramètres nécessaires pour enregistrer l'image et les indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Enregistre le fichier PS/EPS en fichier image dans le répertoire spécifié avec le nom de fichier spécifié. L'extension du fichier correspondra au format d'image dans le paramètre "options".

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contient les paramètres nécessaires pour enregistrer l'image et les indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |
| outDir | java.lang.String | Le répertoire de sortie où le fichier image sera enregistré. |
| fileNameTemplate | java.lang.String | Le modèle de nom de fichier pour l'image (sans extension). Si le fichier PS/EPS d'entrée est d'une seule page, ce sera exactement le nom de fichier, sinon "\_[n]", où "n" - le numéro de page à partir de 0, un suffixe sera ajouté à cela. L'extension du fichier correspondra au format d'image dans le paramètre "option". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Enregistre le fichier PS/EPS dans des tableaux d'octets d'images.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Contient les paramètres nécessaires pour enregistrer l'image et les indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

**Returns:**
byte[][] - Octets d'images. Un tableau d'octets par page.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Enregistre le fichier PS/EPS dans un flux PDF de sortie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Un flux PDF de sortie. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Contient des indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Enregistre le fichier PS/EPS en fichier PDF.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Un chemin de fichier PDF de sortie. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Contient des indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Enregistre l'objet BufferedImage en fichier EPS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'image. |
| epsStream | java.io.OutputStream | Flux de sortie EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contient les paramètres qui spécifient la sortie des erreurs générées lors de la conversion. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Enregistre l'objet BufferedImage en fichier EPS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | L'image. |
| epsFilePath | java.lang.String | Chemin du fichier EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contient les paramètres qui spécifient la sortie des erreurs générées lors de la conversion. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Enregistre l'image PNG/JPEG/BMP/GIF du flux d'entrée vers le flux de sortie EPS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageStream | java.io.InputStream | Flux d'entrée d'image. |
| epsStream | java.io.OutputStream | Flux de sortie EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contient les paramètres qui spécifient la sortie des erreurs générées lors de la conversion. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Enregistre l'image PNG/JPEG/BMP/GIF du fichier en fichier EPS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFilePath | java.lang.String | Chemin du fichier image. |
| epsFilePath | java.lang.String | Chemin du fichier EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Contient les paramètres qui spécifient la sortie des erreurs générées lors de la conversion. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Ajoute une mise à l'échelle à l'état graphique actuel (mise à l'échelle de la matrice actuelle).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| xScale | float | L'échelle sur l'axe X. |
| yScale | float | L'échelle sur l'axe Y. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Spécifie un flux d'entrée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| is | java.io.InputStream | Flux d'entrée du fichier PS/EPS. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Définit les paramètres du dispositif de page (voir l'opérateur "setpagedevice" de la spécification PostScript). Parmi ceux-ci peuvent figurer la taille de la page, la couleur, etc.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Paramètres de la page. Dans ce dictionnaire peuvent se trouver la taille de la page et la couleur, etc. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Définit la taille de la page. Pour créer des pages de tailles différentes dans un même document, utilisez la méthode  setPageDevice  juste après cette méthode.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float | La largeur de la page dans le fichier PostScript résultant. |
| hauteur | float | La hauteur de la page dans le fichier PostScript résultant. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Définit la peinture dans l'état graphique actuel.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| paint | java.awt.Paint | Le paint. Il peut s'agir de n'importe quelle sous‑classe de la classe  Paint  existant dans le JDK. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Définit le tracé dans l'état graphique actuel.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| stroke | java.awt.Stroke | Le trait. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Définit la transformation actuelle à celle-ci.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | La transformation. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Ajoute une transformation de cisaillement à l'état graphique actuel (cisaillement de la matrice actuelle).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| shx | float | Le cisaillement selon l'axe X. |
| shy | float | Le cisaillement selon l'axe Y. |

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


Ajoute une transformation à l'état graphique actuel (concatène cette matrice avec celle actuelle).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | La transformation. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Ajoute une translation à l'état graphique actuel (déplace la matrice actuelle).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | La translation dans la direction X. |
| y | float | La translation dans la direction Y. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Écrit la restauration de l'état graphique actuel (voir la spécification PostScript concernant l'opérateur "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Écrit la sauvegarde de l'état graphique actuel (voir la spécification PostScript concernant l'opérateur "gsave").

