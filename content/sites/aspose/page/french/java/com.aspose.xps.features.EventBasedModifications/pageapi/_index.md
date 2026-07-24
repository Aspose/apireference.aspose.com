---
title: "PageAPI"
second_title: "Référence API Aspose.Page pour Java"
description: "L'API de modification d'élément Page."
type: docs
weight: 12
url: /fr/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

L'API de modification de l'élément **Page**.
## Méthodes

| Méthode | Description |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Ajoute un élément de contenu (Canvas, Path ou Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Insère un élément (Canvas, Path ou Glyphs) dans la page à la position d'index. |
| [<T>remove(T element)](#-T-remove-T-) | Supprime un élément de la page. |
| [addCanvas()](#addCanvas--) | Ajoute un nouveau canvas à la page. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Ajoute de nouveaux glyphs à la page. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Ajoute de nouveaux glyphs à la page. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Ajoute une entrée de contour au document. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Ajoute un nouveau Path à la page. |
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
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Crée de nouveaux glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Crée de nouveaux glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Crée un nouveau point d'arrêt de dégradé. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Crée un nouveau point d'arrêt de dégradé. |
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
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Renvoie la hauteur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif. |
| [getPageCount()](#getPageCount--) | Renvoie le nombre de pages dans le document actif. |
| [getTotalPageCount()](#getTotalPageCount--) | Renvoie le nombre total de pages dans tous les documents du document XPS. |
| [getUtils()](#getUtils--) | Obtient l'objet qui fournit des utilitaires au-delà de l'API formelle de manipulation XPS. |
| [getWidth()](#getWidth--) | Renvoie la largeur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Insère un nouveau canevas dans la page à la position  index . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Insère de nouveaux glyphes dans la page à la position  index . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Insère de nouveaux glyphes dans la page à la position  index . |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Insère un nouveau chemin dans la page à la position  index . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Supprime un élément à la position  index  de la page. |
| [setHeight(float value)](#setHeight-float-) | Définit la hauteur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif. |
| [setWidth(float value)](#setWidth-float-) | Définit la largeur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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


Insère un élément (Canvas, Path ou Glyphs) dans la page à la position d'index.

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


Supprime un élément de la page.

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


Ajoute un nouveau canvas à la page.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Ajoute de nouveaux glyphs à la page.

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


Ajoute de nouveaux glyphs à la page.

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
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Ajoute une entrée de contour au document.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| description | java.lang.String | La description de l'entrée. |
| outlineLevel | int | Le niveau de contour. |
| targetPageNumber | int | Le numéro de page cible. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Ajoute un nouveau Path à la page.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
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
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | L'élément XPS (Canvas, Path, ou Glyphs) pour la propriété Visual du pinceau visuel. |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public float getHeight()
```


Renvoie la hauteur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif.

**Returns:**
float - La hauteur de la page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Renvoie le nombre de pages dans le document actif.

**Returns:**
int - Le nombre de pages dans le document actif.
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
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Renvoie la largeur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif.

**Returns:**
float - La largeur de la page.
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


Insère un nouveau canevas dans la page à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un nouveau canvas doit être inséré. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Insère de nouveaux glyphes dans la page à la position  index .

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


Insère de nouveaux glyphes dans la page à la position  index .

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
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Insère un nouveau chemin dans la page à la position  index .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un nouveau path doit être inséré. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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


Supprime un élément à la position  index  de la page.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle l'élément doit être supprimé. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Définit la hauteur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | La hauteur de la page. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Définit la largeur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | La largeur de la page. |

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

