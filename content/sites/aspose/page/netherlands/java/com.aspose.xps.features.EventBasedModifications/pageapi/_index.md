---
title: "PageAPI"
second_title: "Aspose.Page voor Java API-referentie"
description: "De Page-elementwijzigings-API."
type: docs
weight: 12
url: /nl/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

De **Page**-element wijzigings-API.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Voegt een inhoudselement toe (Canvas, Path of Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Voegt een element (Canvas, Path of Glyphs) in op de pagina op indexpositie. |
| [<T>remove(T element)](#-T-remove-T-) | Verwijdert een element van de pagina. |
| [addCanvas()](#addCanvas--) | Voegt een nieuw canvas toe aan de pagina. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de pagina. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de pagina. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Voegt een outline-item toe aan het document. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Voegt een nieuw pad toe aan de pagina. |
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
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Creëert nieuwe glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Creëert nieuwe glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Creëert een nieuw kleurovergangspunt. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Creëert een nieuw kleurovergangspunt. |
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
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Retourneert de hoogte van de pagina, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte. |
| [getPageCount()](#getPageCount--) | Retourneert het aantal pagina's in het actieve document. |
| [getTotalPageCount()](#getTotalPageCount--) | Retourneert het totale aantal pagina's in alle documenten binnen het XPS-document. |
| [getUtils()](#getUtils--) | Haalt het object op dat hulpmiddelen biedt buiten de formele XPS-manipulatie-API. |
| [getWidth()](#getWidth--) | Retourneert de breedte van de pagina, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Voegt een nieuw canvas toe aan de pagina op  index  positie. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de pagina op  index  positie. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de pagina op  index  positie. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Voegt een nieuw pad toe aan de pagina op  index  positie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Verwijdert een element op  index  positie van de pagina. |
| [setHeight(float value)](#setHeight-float-) | Stelt de hoogte van de pagina in, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte. |
| [setWidth(float value)](#setWidth-float-) | Stelt de breedte van de pagina in, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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


Voegt een element (Canvas, Path of Glyphs) in op de pagina op indexpositie.

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


Verwijdert een element van de pagina.

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


Voegt een nieuw canvas toe aan de pagina.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Voegt nieuwe glyphs toe aan de pagina.

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


Voegt nieuwe glyphs toe aan de pagina.

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
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Voegt een outline-item toe aan het document.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| beschrijving | java.lang.String | De beschrijving van het item. |
| outlineLevel | int | Het outline-niveau. |
| targetPageNumber | int | Het doelpagina-nummer. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Voegt een nieuw pad toe aan de pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De geometrie van het pad. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
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
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Het XPS-element (Canvas, Path of Glyphs) voor de Visual-eigenschap van de visual brush. |
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


Retourneert de hoogte van de pagina, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte.

**Returns:**
float - De hoogte van de pagina.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Retourneert het aantal pagina's in het actieve document.

**Returns:**
int - Het aantal pagina's in het actieve document.
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
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Retourneert de breedte van de pagina, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte.

**Returns:**
float - De breedte van de pagina.
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


Voegt een nieuw canvas toe aan de pagina op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een nieuw canvas moet worden ingevoegd. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Voegt nieuwe glyphs toe aan de pagina op  index  positie.

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


Voegt nieuwe glyphs toe aan de pagina op  index  positie.

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
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Voegt een nieuw pad toe aan de pagina op  index  positie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een nieuw pad moet worden ingevoegd. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De geometrie van het pad. |

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


Verwijdert een element op  index  positie van de pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een element moet worden verwijderd. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Stelt de hoogte van de pagina in, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De hoogte van de pagina. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Stelt de breedte van de pagina in, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De breedte van de pagina. |

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

