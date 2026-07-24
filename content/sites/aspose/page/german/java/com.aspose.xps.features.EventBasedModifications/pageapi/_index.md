---
title: "PageAPI"
second_title: "Aspose.Page for Java API-Referenz"
description: "Die Page-Element-Änderungs-API."
type: docs
weight: 12
url: /de/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

Die **Page**-Elementmodifikations-API.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Fügt ein Inhaltselement (Canvas, Path oder Glyphs) hinzu |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Fügt ein Element (Canvas, Path oder Glyphs) an der Indexposition in die Seite ein |
| [<T>remove(T element)](#-T-remove-T-) | Entfernt ein Element von der Seite. |
| [addCanvas()](#addCanvas--) | Fügt ein neues Canvas zur Seite hinzu |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Fügt neue Glyphs zur Seite hinzu |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Fügt neue Glyphs zur Seite hinzu |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Fügt einen Gliederungseintrag zum Dokument hinzu |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Fügt einen neuen Pfad zur Seite hinzu |
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
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Erstellt neue Glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Erstellt neue Glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Erstellt einen neuen Farbverlaufspunkt. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Erstellt einen neuen Farbverlaufspunkt. |
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
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Gibt die Höhe der Seite zurück, ausgedrückt als Gleitkommazahl in Einheiten des effektiven Koordinatenraums. |
| [getPageCount()](#getPageCount--) | Gibt die Anzahl der Seiten im aktiven Dokument zurück. |
| [getTotalPageCount()](#getTotalPageCount--) | Gibt die Gesamtzahl der Seiten in allen Dokumenten innerhalb des XPS-Dokuments zurück. |
| [getUtils()](#getUtils--) | Ruft das Objekt ab, das Dienstprogramme über die formale XPS-Manipulations-API hinaus bereitstellt. |
| [getWidth()](#getWidth--) | Gibt die Breite der Seite zurück, ausgedrückt als Gleitkommazahl in Einheiten des effektiven Koordinatenraums. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Fügt eine neue Leinwand in die Seite an der Position  index  ein. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Fügt neue Glyphen in die Seite an der Position  index  ein. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Fügt neue Glyphen in die Seite an der Position  index  ein. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Fügt einen neuen Pfad in die Seite an der Position  index  ein. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Entfernt ein Element an der Position  index  von der Seite. |
| [setHeight(float value)](#setHeight-float-) | Setzt die Höhe der Seite, ausgedrückt als Gleitkommazahl in Einheiten des effektiven Koordinatenraums. |
| [setWidth(float value)](#setWidth-float-) | Setzt die Breite der Seite, ausgedrückt als Gleitkommazahl in Einheiten des effektiven Koordinatenraums. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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


Fügt ein Element (Canvas, Path oder Glyphs) an der Indexposition in die Seite ein

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


Entfernt ein Element von der Seite.

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


Fügt ein neues Canvas zur Seite hinzu

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Fügt neue Glyphs zur Seite hinzu

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


Fügt neue Glyphs zur Seite hinzu

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
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Fügt einen Gliederungseintrag zum Dokument hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Beschreibung. | java.lang.String | Die Beschreibung des Eintrags. |
| outlineLevel | int | Die Gliederungsebene. |
| targetPageNumber | int | Die Zielseitennummer. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Fügt einen neuen Pfad zur Seite hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Geometrie des Pfads. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
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
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Das XPS-Element (Canvas, Path oder Glyphs) für die Visual‑Eigenschaft des Visual‑Brushes. |
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


Gibt die Höhe der Seite zurück, ausgedrückt als Gleitkommazahl in Einheiten des effektiven Koordinatenraums.

**Returns:**
float – Die Höhe der Seite.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Gibt die Anzahl der Seiten im aktiven Dokument zurück.

**Returns:**
int – Die Anzahl der Seiten im aktiven Dokument.
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
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Gibt die Breite der Seite zurück, ausgedrückt als Gleitkommazahl in Einheiten des effektiven Koordinatenraums.

**Returns:**
float – Die Breite der Seite.
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


Fügt eine neue Leinwand in die Seite an der Position  index  ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein neues Canvas eingefügt werden soll. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Fügt neue Glyphen in die Seite an der Position  index  ein.

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


Fügt neue Glyphen in die Seite an der Position  index  ein.

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
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Fügt einen neuen Pfad in die Seite an der Position  index  ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein neuer Pfad eingefügt werden soll. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Geometrie des Pfads. |

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


Entfernt ein Element an der Position  index  von der Seite.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der das Element entfernt werden soll. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Setzt die Höhe der Seite, ausgedrückt als Gleitkommazahl in Einheiten des effektiven Koordinatenraums.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Die Höhe der Seite. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Setzt die Breite der Seite, ausgedrückt als Gleitkommazahl in Einheiten des effektiven Koordinatenraums.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Die Breite der Seite. |

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

