---
title: "XpsDocument"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant l’entité principale du document XPS qui fournit des méthodes de manipulation pour tout élément XPS."
type: docs
weight: 19
url: /fr/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Classe encapsulant l’entité principale du document XPS qui fournit des méthodes de manipulation pour tout élément XPS.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Crée un document XPS vide avec la taille de page par défaut. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Ouvre un document XPS existant situé au chemin. |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Charge un document existant stocké dans le flux en tant que document XPS. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Ajoute un élément de contenu (Canvas, Path ou Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Insère un élément (Canvas, Path ou Glyphs) dans la page active à la position d'index. |
| [<T>remove(T element)](#-T-remove-T-) | Supprime un élément de la page active. |
| [addCanvas()](#addCanvas--) | Ajoute un nouveau canvas à la page active. |
| [addDocument()](#addDocument--) | Ajoute un document vide avec la taille de page par défaut et sélectionne le document ajouté comme actif. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Ajoute un document vide avec la taille de page par défaut. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Ajoute un document vide avec les dimensions de la première page largeur et hauteur et sélectionne le document ajouté comme actif. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Ajoute un document vide avec les dimensions de la première page  width  et  height . |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Ajoute de nouveaux glyphes à la page active. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Ajoute de nouveaux glyphes à la page active. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Ajoute une entrée de contour au document. |
| [addPage()](#addPage--) | Ajoute une page vide au document avec la taille de page par défaut. |
| [addPage(boolean activate)](#addPage-boolean-) | Ajoute une page vide au document avec la taille de page par défaut. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Ajoute une page au document et sélectionne la page ajoutée comme active. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Ajoute une page au document. |
| [addPage(float width, float height)](#addPage-float-float-) | Ajoute une page vide au document avec la largeur  width  et la hauteur  height  spécifiées. |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Ajoute une page vide au document avec la largeur  width  et la hauteur  height  spécifiées. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Ajoute un nouveau chemin à la page active. |
| [close()](#close--) | Libère l'instance. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Crée un nouveau segment d'arc elliptique tracé. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Crée un nouveau segment d'arc elliptique. |
| [createCanvas()](#createCanvas--) | Crée un nouveau canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Crée une nouvelle couleur dans l'espace colorimétrique basé sur ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Crée une nouvelle couleur dans l'espace colorimétrique scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Crée une nouvelle couleur dans l'espace colorimétrique scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Crée une nouvelle couleur dans l'espace colorimétrique sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Crée une nouvelle couleur dans l'espace colorimétrique sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Crée une nouvelle couleur. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Crée une nouvelle couleur dans l'espace colorimétrique basé sur ICC. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Crée une nouvelle ressource de police TrueType à partir du flux. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Crée une nouvelle ressource de police TrueType. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Crée de nouveaux glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Crée de nouveaux glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Crée un nouveau point d'arrêt de dégradé. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Crée un nouveau point d'arrêt de dégradé. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Crée une nouvelle ressource de profil ICC à partir du  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Crée une nouvelle ressource de profil ICC à partir du fichier de profil ICC situé à  iccProfilePath . |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Crée une nouvelle ressource d'image à partir du  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Crée une nouvelle ressource d'image à partir du fichier image situé à  imagePath . |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crée un nouveau pinceau d'image. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crée un nouveau pinceau d'image. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crée un nouveau pinceau de dégradé linéaire. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crée un nouveau pinceau de dégradé linéaire. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Crée une nouvelle matrice de transformation affine. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Crée un nouveau Path. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Crée une nouvelle figure de Path ouverte. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Crée une nouvelle figure de Path. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Crée une nouvelle figure de Path ouverte. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Crée une nouvelle figure de Path. |
| [createPathGeometry()](#createPathGeometry--) | Crée une nouvelle géométrie de Path. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Crée une nouvelle géométrie de chemin spécifiée sous forme abrégée. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Crée une nouvelle géométrie de chemin avec une liste spécifiée de figures de chemin. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Crée un nouvel ensemble de courbes cubiques B?bezier tracées. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Crée un nouvel ensemble de courbes cubiques B?bezier. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Crée un nouveau dessin polygonal tracé contenant un nombre arbitraire de sommets individuels. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Crée un nouveau dessin polygonal contenant un nombre arbitraire de sommets individuels. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Crée un nouvel ensemble de courbes quadratiques B?bezier tracées depuis le point précédent de la figure de chemin à travers un ensemble de sommets, en utilisant les points de contrôle spécifiés. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Crée un nouvel ensemble de courbes quadratiques B?bezier depuis le point précédent de la figure de chemin à travers un ensemble de sommets, en utilisant les points de contrôle spécifiés. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crée un nouveau pinceau à dégradé radial. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crée un nouveau pinceau à dégradé radial. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Crée un nouveau pinceau de couleur unie. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Crée un nouveau pinceau de couleur unie. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crée un nouveau pinceau visuel. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | Renvoie le numéro du document actif. |
| [getActivePage()](#getActivePage--) | Renvoie le numéro de la page active dans le document actif. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Renvoie le nombre de documents dans le paquet XPS. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Obtient le ticket d'impression du document indexé par  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Renvoie le ticket d'impression du travail du document. |
| [getPage()](#getPage--) | Renvoie l'instance  XpsPage  de la page active. |
| [getPageCount()](#getPageCount--) | Renvoie le nombre de pages dans le document actif. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Obtient le ticket d'impression de la page indexée par  pageIndex  dans le document indexé par  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Renvoie le nombre total de pages dans tous les documents du document XPS. |
| [getUtils()](#getUtils--) | Obtient l'objet qui fournit des utilitaires au-delà de l'API formelle de manipulation XPS. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Insère un nouveau canevas à la page active à la position  index . |
| [insertDocument(int index)](#insertDocument-int-) | Insère un document vide avec la taille de page par défaut à la position  index  et sélectionne le document inséré comme actif. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Insère un document vide avec la taille de page par défaut à la position  index . |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Insère un document vide avec les dimensions de la première page  width  et  height  à la position  index  et sélectionne le document inséré comme actif. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Insère un document vide avec les dimensions de la première page  width  et  height  à la position  index . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Insère de nouveaux glyphes dans la page active à la position  index . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Insère de nouveaux glyphes dans la page active à la position  index . |
| [insertPage(int index)](#insertPage-int-) | Insère une page vide dans le document avec la taille de page par défaut à la position  index  et sélectionne la page insérée comme active. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Insère une page vide dans le document avec la taille de page par défaut à la position  index . |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Insère une page dans le document à la position  index  et sélectionne la page insérée comme active. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Insère une page dans le document à la position  index . |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Insère une page vide dans le document avec la  width  et la  height  spécifiées à la position  index  et sélectionne la page insérée comme active. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Insère une page vide dans le document avec la  width  et la  height  spécifiées à la position  index . |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Insère un nouveau chemin dans la page active à la position  index . |
| [isLicensed()](#isLicensed--) | Indique si la licence du produit Aspose.Page for Java est accessible et valide. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Fusion de plusieurs fichiers XPS en un seul document XPS. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Fusion de plusieurs fichiers XPS en un seul document XPS. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Fusion de documents XPS en PDF en utilisant l'instance  Device . |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Fusion de documents XPS en PDF en utilisant l'instance  Device . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Supprime un élément à la position  index  de la page active. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Supprime un document à la position  index . |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Supprime une page du document. |
| [removePageAt(int index)](#removePageAt-int-) | Supprime une page du document à la position  index . |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Enregistre le document en utilisant l'instance  Device . |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Enregistre le document XPS dans un flux. |
| [save(String path)](#save-java.lang.String-) | Enregistre le document XPS dans le fichier XPS situé à  path . |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Enregistre le document dans un fichier image. Le répertoire de sortie et le nom du fichier seront les mêmes que ceux du fichier XPS d'entrée. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Enregistre le document dans un fichier image dans le répertoire spécifié avec le nom de fichier spécifié. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Enregistre le document au format image bitmap sous forme de tableaux d'octets. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Enregistre le document au format PDF. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Enregistre le document au format PDF. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Enregistre le document au format PS. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Enregistre le document au format PostScript. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Sélectionne un document actif pour l'édition. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Sélectionne une page de document active pour la modifier. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Lie le  printTicket  au document indexé par  documentIndex . |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Définit le ticket d'impression du travail du document. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Lie le  printTicket  à la page indexée par  pageIndex  dans le document indexé par  documentIndex . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Crée un document XPS vide avec la taille de page par défaut.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Ouvre un document XPS existant situé au chemin.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| path | java.lang.String | Emplacement du document. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Charge un document existant stocké dans le flux en tant que document XPS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| flux | java.io.InputStream | Flux du document. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Options de chargement du document. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Ajoute un élément de contenu (Canvas, Path ou Glyphs)

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| élément | T | L'élément à ajouter. |

**Returns:**
T - Élément ajouté.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Insère un élément (Canvas, Path ou Glyphs) dans la page active à la position d'index.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un élément doit être inséré. |
| élément | T | L'élément à insérer. |

**Returns:**
T - Élément inséré.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Supprime un élément de la page active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| élément | T | L'élément à supprimer. |

**Returns:**
T - Élément supprimé.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Ajoute un nouveau canvas à la page active.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Ajoute un document vide avec la taille de page par défaut et sélectionne le document ajouté comme actif.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Ajoute un document vide avec la taille de page par défaut.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| activer | boolean | Indicateur indiquant s'il faut sélectionner le document ajouté comme actif. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Ajoute un document vide avec les dimensions de la première page largeur et hauteur et sélectionne le document ajouté comme actif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float | Largeur de la première page. |
| hauteur | float | Hauteur de la première page. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Ajoute un document vide avec les dimensions de la première page  width  et  height .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float | Largeur de la première page. |
| hauteur | float | Hauteur de la première page. |
| activer | boolean | Indicateur indiquant s'il faut sélectionner le document ajouté comme actif. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Ajoute de nouveaux glyphes à la page active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ressource de police. |
| fontRenderingEmSize | float | Taille de police. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | java.lang.String | Chaîne à imprimer. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Ajoute de nouveaux glyphes à la page active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | Famille de police. |
| fontRenderingEmSize | float | Taille de police. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Style de police. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | java.lang.String | Chaîne à imprimer. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Ajoute une entrée de contour au document.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| description | java.lang.String | La description de l'entrée. |
| outlineLevel | int | Le niveau de contour. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | La cible d'entrée. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Ajoute une page vide au document avec la taille de page par défaut.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Ajoute une page vide au document avec la taille de page par défaut.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| activer | boolean | Indicateur indiquant s'il faut sélectionner la page ajoutée comme active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Ajoute une page au document et sélectionne la page ajoutée comme active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page à ajouter. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Ajoute une page au document.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page à ajouter. |
| activer | boolean | Indicateur indiquant s'il faut sélectionner la page ajoutée comme active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Ajoute une page vide au document avec la largeur  width  et la hauteur  height  spécifiées.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float | Largeur d'une nouvelle page. |
| hauteur | float | Hauteur d'une nouvelle page. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Ajoute une page vide au document avec la largeur  width  et la hauteur  height  spécifiées.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float | Largeur d'une nouvelle page. |
| hauteur | float | Hauteur d'une nouvelle page. |
| activer | boolean | Indicateur indiquant s'il faut sélectionner la page ajoutée comme active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Ajoute un nouveau chemin à la page active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Libère l'instance.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Crée un nouveau segment d'arc elliptique tracé.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| point | java.awt.geom.Point2D | Le point final de l'arc elliptique. |
| taille | java.awt.geom.Dimension2D | Le rayon x et y de l'arc elliptique sous forme de paire x,y. |
| rotationAngle | float | Indique comment l'ellipse est tournée par rapport au système de coordonnées actuel. |
| isLargeArc | boolean | Détermine si l'arc est dessiné avec un balayage de 180 degrés ou plus. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La direction dans laquelle l'arc est dessiné. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Crée un nouveau segment d'arc elliptique.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| point | java.awt.geom.Point2D | Le point final de l'arc elliptique. |
| taille | java.awt.geom.Dimension2D | Le rayon x et y de l'arc elliptique sous forme de paire x,y. |
| rotationAngle | float | Indique comment l'ellipse est tournée par rapport au système de coordonnées actuel. |
| isLargeArc | boolean | Détermine si l'arc est dessiné avec un balayage de 180 degrés ou plus. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La direction dans laquelle l'arc est dessiné. |
| isStroked | boolean | Spécifie si le trait pour ce segment du chemin est dessiné. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Crée un nouveau canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Crée une nouvelle couleur dans l'espace colorimétrique basé sur ICC.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | La ressource de profil ICC. |
| components | float[] | Composants de couleur. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Crée une nouvelle couleur dans l'espace colorimétrique scRGB.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| r | float | Le composant de couleur rouge. |
| g | float | Le composant de couleur vert. |
| b | float | Le composant de couleur bleu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Crée une nouvelle couleur dans l'espace colorimétrique scRGB.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| a | float | Le composant de couleur alpha. |
| r | float | Le composant de couleur rouge. |
| g | float | Le composant de couleur vert. |
| b | float | Le composant de couleur bleu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Crée une nouvelle couleur dans l'espace colorimétrique sRGB.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| r | int | Le composant de couleur rouge. |
| g | int | Le composant de couleur vert. |
| b | int | Le composant de couleur bleu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Crée une nouvelle couleur dans l'espace colorimétrique sRGB.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| a | int | Le composant de couleur alpha. |
| r | int | Le composant de couleur rouge. |
| g | int | Le composant de couleur vert. |
| b | int | Le composant de couleur bleu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Crée une nouvelle couleur.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | Une instance de couleur native pour la couleur RVB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Crée une nouvelle couleur dans l'espace colorimétrique basé sur ICC.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| path | java.lang.String | Le chemin vers le profil ICC. |
| components | float[] | Composants de couleur. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Crée une nouvelle ressource de police TrueType à partir du flux.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| flux | java.io.InputStream | Le flux contenant le profil ICC à prendre comme ressource. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Crée une nouvelle ressource de police TrueType.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | La famille de police. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Le style de police. Voir les constantes de classe  XpsFont  (qui sont des drapeaux bits) pour les valeurs disponibles à combiner. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Crée de nouveaux glyphs.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ressource de police. |
| fontRenderingEmSize | float | Taille de police. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | java.lang.String | Chaîne à imprimer. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Crée de nouveaux glyphs.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | Famille de police. |
| fontRenderingEmSize | float | Taille de police. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Style de police. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | java.lang.String | Chaîne à imprimer. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Crée un nouveau point d'arrêt de dégradé.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | La couleur d'arrêt du dégradé. |
| décalage | float | Le décalage du dégradé. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Crée un nouveau point d'arrêt de dégradé.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | La couleur d'arrêt du dégradé. |
| décalage | float | Le décalage du dégradé. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Crée une nouvelle ressource de profil ICC à partir du  stream .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| flux | java.io.InputStream | Le flux contenant le profil ICC à prendre comme ressource. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Crée une nouvelle ressource de profil ICC à partir du fichier de profil ICC situé à  iccProfilePath .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| iccProfilePath | java.lang.String | Le chemin vers le profil ICC à prendre comme ressource. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Crée une nouvelle ressource d'image à partir du  stream .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| flux | java.io.InputStream | Le flux contenant l'image à prendre comme ressource. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Crée une nouvelle ressource d'image à partir du fichier image situé à  imagePath .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imagePath | java.lang.String | Le chemin vers l'image à prendre comme ressource. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Crée un nouveau pinceau d'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Une ressource d'image. |
| viewbox | java.awt.geom.Rectangle2D | La position et les dimensions du contenu source du pinceau. |
| viewport | java.awt.geom.Rectangle2D | La région dans l'espace de coordonnées contenant de la tuile principale du pinceau qui est (éventuellement appliquée de façon répétée) utilisée pour remplir la région à laquelle le pinceau est appliqué |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Crée un nouveau pinceau d'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imagePath | java.lang.String | Le chemin vers l'image à utiliser comme tuile de pinceau. |
| viewbox | java.awt.geom.Rectangle2D | La position et les dimensions du contenu source du pinceau. |
| viewport | java.awt.geom.Rectangle2D | La région dans l'espace de coordonnées contenant de la tuile principale du pinceau qui est (éventuellement appliquée de façon répétée) utilisée pour remplir la région à laquelle le pinceau est appliqué |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Crée un nouveau pinceau de dégradé linéaire.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Le point de départ du dégradé linéaire. |
| endPoint | java.awt.geom.Point2D | Le point final du dégradé linéaire. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Crée un nouveau pinceau de dégradé linéaire.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | La liste des arrêts de dégradé. |
| startPoint | java.awt.geom.Point2D | Le point de départ du dégradé linéaire. |
| endPoint | java.awt.geom.Point2D | Le point final du dégradé linéaire. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Crée une nouvelle matrice de transformation affine.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| m11 | float | Élément 11. |
| m12 | float | Élément 12. |
| m21 | float | Élément 21. |
| m22 | float | Élément 22. |
| m31 | float | Élément 31. |
| m32 | float | Élément 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Crée un nouveau Path.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Crée une nouvelle figure de Path ouverte.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Le point de départ du premier segment de la figure de chemin. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Crée une nouvelle figure de Path.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Le point de départ du premier segment de la figure de chemin. |
| isClosed | boolean | Spécifie si le chemin est fermé. Si la valeur est vraie, le trait est dessiné \"closed\", c’est‑à‑dire que le dernier point du dernier segment de la figure de chemin est relié au point spécifié dans l’attribut StartPoint, sinon le trait est dessiné \"open\", et le dernier point n’est pas relié au point de départ. Applicable uniquement si la figure de chemin est utilisée dans un élément Path qui spécifie un trait. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Crée une nouvelle figure de Path ouverte.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Le point de départ du premier segment de la figure de chemin. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Liste des segments de chemin. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Crée une nouvelle figure de Path.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Le point de départ du premier segment de la figure de chemin. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Liste des segments de chemin. |
| isClosed | boolean | Spécifie si le chemin est fermé. Si la valeur est vraie, le trait est dessiné \"closed\", c’est‑à‑dire que le dernier point du dernier segment de la figure de chemin est relié au point spécifié dans l’attribut StartPoint, sinon le trait est dessiné \"open\", et le dernier point n’est pas relié au point de départ. Applicable uniquement si la figure de chemin est utilisée dans un élément Path qui spécifie un trait. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Crée une nouvelle géométrie de Path.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Crée une nouvelle géométrie de chemin spécifiée sous forme abrégée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Forme abrégée de la géométrie du chemin. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Crée une nouvelle géométrie de chemin avec une liste spécifiée de figures de chemin.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Liste des figures de chemin. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Crée un nouvel ensemble de courbes cubiques B?bezier tracées.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Points de contrôle pour plusieurs segments B?bezier. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Crée un nouvel ensemble de courbes cubiques B?bezier.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Points de contrôle pour plusieurs segments B?bezier. |
| isStroked | boolean | Spécifie si le trait pour ce segment du chemin est dessiné. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Crée un nouveau dessin polygonal tracé contenant un nombre arbitraire de sommets individuels.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Ensemble de coordonnées pour les multiples segments qui définissent le segment de polyligne. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Crée un nouveau dessin polygonal contenant un nombre arbitraire de sommets individuels.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Ensemble de coordonnées pour les multiples segments qui définissent le segment de polyligne. |
| isStroked | boolean | Spécifie si le trait pour ce segment du chemin est dessiné. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Crée un nouvel ensemble de courbes quadratiques B?bezier tracées depuis le point précédent de la figure de chemin à travers un ensemble de sommets, en utilisant les points de contrôle spécifiés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Points de contrôle pour plusieurs segments B?bezier quadratiques. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Crée un nouvel ensemble de courbes quadratiques B?bezier depuis le point précédent de la figure de chemin à travers un ensemble de sommets, en utilisant les points de contrôle spécifiés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Points de contrôle pour plusieurs segments B?bezier quadratiques. |
| isStroked | boolean | Spécifie si le trait pour ce segment du chemin est dessiné. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crée un nouveau pinceau à dégradé radial.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Le point central du dégradé radial (c’est‑à‑dire le centre de l’ellipse). |
| gradientOrigin | java.awt.geom.Point2D | Le point d’origine du dégradé radial. |
| radiusX | float | Le rayon dans la dimension x de l'ellipse qui définit le dégradé radial. |
| radiusY | float | Le rayon dans la dimension y de l'ellipse qui définit le dégradé radial. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crée un nouveau pinceau à dégradé radial.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | La liste des arrêts de dégradé. |
| center | java.awt.geom.Point2D | Le point central du dégradé radial (c’est‑à‑dire le centre de l’ellipse). |
| gradientOrigin | java.awt.geom.Point2D | Le point d’origine du dégradé radial. |
| radiusX | float | Le rayon dans la dimension x de l'ellipse qui définit le dégradé radial. |
| radiusY | float | Le rayon dans la dimension y de l'ellipse qui définit le dégradé radial. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Crée un nouveau pinceau de couleur unie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | La couleur des éléments remplis. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Crée un nouveau pinceau de couleur unie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | La couleur des éléments remplis. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Crée un nouveau pinceau visuel.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | L'élément XPS (Canvas, Path ou Glyphs) pour la propriété Visual du pinceau visuel. |
| viewbox | java.awt.geom.Rectangle2D | La position et les dimensions du contenu source du pinceau. |
| viewport | java.awt.geom.Rectangle2D | La région dans l'espace de coordonnées contenant de la tuile principale du pinceau qui est (éventuellement appliquée de façon répétée) utilisée pour remplir la région à laquelle le pinceau est appliqué |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Renvoie le numéro du document actif.

**Returns:**
int - La valeur int.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Renvoie le numéro de la page active dans le document actif.

**Returns:**
int - La valeur int.
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


Renvoie le nombre de documents dans le paquet XPS.

**Returns:**
int - Le nombre de documents dans le package XPS.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Obtient le ticket d'impression du document indexé par  documentIndex .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| documentIndex | int | Index du document dont le ticket d'impression doit être renvoyé. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Renvoie le ticket d'impression du travail du document.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Renvoie l'instance  XpsPage  de la page active.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Renvoie le nombre de pages dans le document actif.

**Returns:**
int - Le nombre de pages dans le document actif.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Obtient le ticket d'impression de la page indexée par  pageIndex  dans le document indexé par  documentIndex .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| documentIndex | int | Index du document. |
| pageIndex | int | Index de la page dont le ticket d'impression doit être renvoyé. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Renvoie le nombre total de pages dans tous les documents du document XPS.

**Returns:**
int - Le nombre total de pages dans tous les documents du document XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Obtient l'objet qui fournit des utilitaires au-delà de l'API formelle de manipulation XPS.

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


Insère un nouveau canevas à la page active à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un nouveau canvas doit être inséré. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Insère un document vide avec la taille de page par défaut à la position  index  et sélectionne le document inséré comme actif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un document doit être inséré. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Insère un document vide avec la taille de page par défaut à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un document doit être inséré. |
| activer | boolean | Indicateur indiquant s'il faut sélectionner le document inséré comme actif. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Insère un document vide avec les dimensions de la première page  width  et  height  à la position  index  et sélectionne le document inséré comme actif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un document doit être inséré. |
| largeur | float | Largeur de la première page. |
| hauteur | float | Hauteur de la première page. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Insère un document vide avec les dimensions de la première page  width  et  height  à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un document doit être inséré. |
| largeur | float | Largeur de la première page. |
| hauteur | float | Hauteur de la première page. |
| activer | boolean | Indicateur indiquant s'il faut sélectionner le document inséré comme actif. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Insère de nouveaux glyphes dans la page active à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle de nouveaux glyphs doivent être insérés. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ressource de police. |
| fontSize | float | Taille de police. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | java.lang.String | Chaîne à imprimer. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Insère de nouveaux glyphes dans la page active à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle de nouveaux glyphs doivent être insérés. |
| fontFamily | java.lang.String | Famille de police. |
| fontSize | float | Taille de police. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Style de police. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | java.lang.String | Chaîne à imprimer. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Insère une page vide dans le document avec la taille de page par défaut à la position  index  et sélectionne la page insérée comme active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle une page doit être insérée. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Insère une page vide dans le document avec la taille de page par défaut à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle une page doit être insérée. |
| activer | boolean | Indicateur indiquant s'il faut sélectionner la page insérée comme active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Insère une page dans le document à la position  index  et sélectionne la page insérée comme active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle une page doit être ajoutée. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page à insérer. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Insère une page dans le document à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle une page doit être ajoutée. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page à insérer. |
| activer | boolean | Indicateur indiquant s'il faut sélectionner la page insérée comme active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Insère une page vide dans le document avec la  width  et la  height  spécifiées à la position  index  et sélectionne la page insérée comme active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle une page doit être insérée. |
| largeur | float | Largeur d'une nouvelle page. |
| hauteur | float | Hauteur d'une nouvelle page. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Insère une page vide dans le document avec la  width  et la  height  spécifiées à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle une page doit être insérée. |
| largeur | float | Largeur d'une nouvelle page. |
| hauteur | float | Hauteur d'une nouvelle page. |
| activer | boolean | Indicateur indiquant s'il faut sélectionner la page insérée comme active. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Insère un nouveau chemin dans la page active à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un nouveau path doit être inséré. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Indique si la licence du produit Aspose.Page for Java est accessible et valide.

**Returns:**
booléen - valeur booléenne
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Fusion de plusieurs fichiers XPS en un seul document XPS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Fichiers XPS à fusionner avec ce document. |
| outStream | java.io.OutputStream | Le flux de sortie où enregistrer les documents XPS fusionnés. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Fusion de plusieurs fichiers XPS en un seul document XPS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Fichiers XPS à fusionner avec ce document. |
| outXpsFilePath | java.lang.String | Le chemin du fichier XPS de sortie. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Fusion de documents XPS en PDF en utilisant l'instance  Device .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Le chemin du fichier PDF de sortie. |
| filesForMerge | java.lang.String[] | Fichiers XPS à fusionner avec ce document vers un dispositif de sortie. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Options d'enregistrement du document. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Fusion de documents XPS en PDF en utilisant l'instance  Device .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Fichiers XPS à fusionner avec ce document vers un dispositif de sortie. |
| pdfStream | java.io.OutputStream | Le flux de sortie où écrire le PDF résultant. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Options d'enregistrement du document. |

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


Supprime un élément à la position  index  de la page active.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle l'élément doit être supprimé. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Supprime un document à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un document doit être supprimé. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Supprime une page du document.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Page à supprimer. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Supprime une page du document à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle une page doit être supprimée. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Enregistre le document en utilisant l'instance  Device .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | L'instance du  Device  . |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Options d'enregistrement du document. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Enregistre le document XPS dans un flux.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| flux | java.io.OutputStream | Flux du document XPS à enregistrer. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Enregistre le document XPS dans le fichier XPS situé à  path .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| path | java.lang.String | Emplacement du document. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Enregistre le document dans un fichier image. Le répertoire de sortie et le nom de fichier seront les mêmes que ceux du fichier XPS d'entrée. L'extension du fichier correspondra au format d'image dans le paramètre \"options\". Si le document a été initialisé avec un flux qui n'est pas un FileInputStream, le fichier image sera enregistré dans le dossier actuel avec le modèle de nom de fichier par défaut.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Options pour enregistrer le document au format d'image bitmap. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Enregistre le document dans un fichier image dans le répertoire spécifié avec le nom de fichier spécifié. L'extension du fichier correspondra au format d'image dans le paramètre \"options\".

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Options pour enregistrer le document au format d'image bitmap. |
| outDir | java.lang.String | Le répertoire de sortie où le fichier image sera enregistré. |
| fileNameTemplate | java.lang.String | Le modèle de nom de fichier pour l'image (sans extension). Si le fichier XPS d'entrée comporte une seule page, ce sera exactement le nom de fichier, sinon \"\\_[n]\", où \"n\" - le numéro de page à partir de 1, un suffixe sera ajouté à cela. L'extension du fichier correspondra au format d'image dans le paramètre \"option\". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Enregistre le document au format image bitmap sous forme de tableaux d'octets.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Options pour enregistrer le document au format d'image bitmap. |

**Returns:**
byte[][][] - Les tableaux d'octets des images résultantes. La première dimension correspond aux documents internes et la seconde aux pages au sein des documents internes.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Enregistre le document au format PDF.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| flux | java.io.OutputStream | Le flux vers lequel écrire le fichier PDF de sortie. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Options pour enregistrer le document au format PDF. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Enregistre le document au format PDF.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Le chemin du fichier PDF de sortie. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Options pour enregistrer le document au format PDF. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Enregistre le document au format PS.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| flux | java.io.OutputStream | Le flux vers lequel écrire le fichier PS de sortie. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Options pour enregistrer le document au format PS. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Enregistre le document au format PostScript.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Le chemin du fichier PostScript de sortie. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Options pour enregistrer le document au format PDF. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Sélectionne un document actif pour l'édition.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| documentNumber | int | Un numéro de document. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Sélectionne une page de document active pour la modifier.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| pageNumber | int | Un numéro de page. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Lie le  printTicket  au document indexé par  documentIndex .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| documentIndex | int | Indice du document auquel lier le ticket d'impression. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | Le ticket d'impression à lier. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Définit le ticket d'impression du travail du document.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | Le ticket d'impression du travail du document. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Lie le  printTicket  à la page indexée par  pageIndex  dans le document indexé par  documentIndex .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| documentIndex | int | Index du document. |
| pageIndex | int | Indice de la page auquel lier le ticket d'impression. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | Le ticket d'impression à lier. |

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

