---
title: "PageAPI"
second_title: "Aspose.Page för Java API-referens"
description: "API för modifiering av Page‑elementet."
type: docs
weight: 12
url: /sv/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

API för modifiering av **Page**‑elementet.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Lägger till ett innehållselement (Canvas, Path eller Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Infogar ett element (Canvas, Path eller Glyphs) på sidan vid indexpositionen. |
| [<T>remove(T element)](#-T-remove-T-) | Tar bort ett element från sidan. |
| [addCanvas()](#addCanvas--) | Lägger till en ny canvas på sidan. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Lägger till nya glyphs på sidan. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Lägger till nya glyphs på sidan. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Lägger till en konturpost i dokumentet. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Lägger till en ny path på sidan. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Skapar ett nytt streckat elliptiskt bågsegment. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Skapar ett nytt elliptiskt bågsegment. |
| [createCanvas()](#createCanvas--) | Skapar en ny canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Skapar en ny färg i ICC-baserad färgrymd. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Skapar en ny färg i scRGB-färgrymden. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Skapar en ny färg i scRGB-färgrymden. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Skapar en ny färg i sRGB-färgrymden. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Skapar en ny färg i sRGB-färgrymden. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Skapar en ny färg. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Skapar en ny färg i ICC-baserad färgrymd. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Skapar nya glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Skapar nya glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Skapar ett nytt gradientstopp. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Skapar ett nytt gradientstopp. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Skapar en ny bildpensel. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Skapar en ny bildpensel. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Skapar en ny linjär gradientpensel. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Skapar en ny linjär gradientpensel. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Skapar en ny affin transformationsmatris. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Skapar en ny bana. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Skapar en ny öppen path‑figur. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Skapar en ny banfigur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Skapar en ny öppen path‑figur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Skapar en ny banfigur. |
| [createPathGeometry()](#createPathGeometry--) | Skapar en ny bangeometri. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Skapar en ny bangeometri specificerad med förkortad form. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Skapar en ny bangeometri med en specificerad lista av banfigurer. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Skapar en ny uppsättning streckade kubiska B?bezier‑kurvor. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Skapar en ny uppsättning kubiska B?bezier‑kurvor. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Skapar en ny streckad polygonritning som innehåller ett godtyckligt antal enskilda hörn. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Skapar en ny polygonritning som innehåller ett godtyckligt antal enskilda hörn. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Skapar en ny uppsättning av strokade kvadratiska B?zier-kurvor från föregående punkt i sökvägsfiguren genom en uppsättning hörn, med angivna kontrollpunkter. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Skapar en ny uppsättning av kvadratiska B?zier-kurvor från föregående punkt i sökvägsfiguren genom en uppsättning hörn, med angivna kontrollpunkter. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Skapar en ny radiell gradientpensel. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Skapar en ny radiell gradientpensel. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Skapar en ny solid färgpensel. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Skapar en ny solid färgpensel. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Skapar en ny visuell pensel. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Returnerar sidans höjd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [getPageCount()](#getPageCount--) | Returnerar antalet sidor i det aktiva dokumentet. |
| [getTotalPageCount()](#getTotalPageCount--) | Returnerar det totala antalet sidor i alla dokument i XPS-dokumentet. |
| [getUtils()](#getUtils--) | Hämtar objektet som tillhandahåller verktyg utöver det formella XPS-manipulerings‑API:et. |
| [getWidth()](#getWidth--) | Returnerar sidans bredd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Infogar en ny canvas till sidan på  index  position. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Infogar nya glyfer till sidan på  index  position. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Infogar nya glyfer till sidan på  index  position. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Infogar en ny sökväg till sidan på  index  position. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Tar bort ett element på  index  position från sidan. |
| [setHeight(float value)](#setHeight-float-) | Ställer in sidans höjd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [setWidth(float value)](#setWidth-float-) | Ställer in sidans bredd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Lägger till ett innehållselement (Canvas, Path eller Glyphs)

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| element | T | Elementet att lägga till. |

**Returns:**
T - Tillagt element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Infogar ett element (Canvas, Path eller Glyphs) på sidan vid indexpositionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett  element  ska infogas. |
| element | T | Elementet att infoga. |

**Returns:**
T - Infogat element.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Tar bort ett element från sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| element | T | Elementet att ta bort. |

**Returns:**
T - Borttaget element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Lägger till en ny canvas på sidan.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Lägger till nya glyphs på sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Typsnittresurs. |
| fontRenderingEmSize | float | Typsnittsstorlek. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Lägger till nya glyphs på sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontFamily | java.lang.String | Typsnittsfamilj. |
| fontRenderingEmSize | float | Typsnittsstorlek. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckenstil. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Lägger till en konturpost i dokumentet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| description | java.lang.String | Postens beskrivning. |
| outlineLevel | int | Innehållsnivån. |
| targetPageNumber | int | Målsidans nummer. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Lägger till en ny path på sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Skapar ett nytt streckat elliptiskt bågsegment.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkt | java.awt.geom.Point2D | Slutpunkten för den elliptiska bågen. |
| size | java.awt.geom.Dimension2D | x- och y-radien för den elliptiska bågen som ett x,y-par. |
| rotationAngle | float | Anger hur ellipsen är roterad i förhållande till det aktuella koordinatsystemet. |
| isLargeArc | boolean | Bestämmer om bågen ritas med en svepning på 180 grader eller mer. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Riktningen som bågen ritas i. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Skapar ett nytt elliptiskt bågsegment.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkt | java.awt.geom.Point2D | Slutpunkten för den elliptiska bågen. |
| size | java.awt.geom.Dimension2D | x- och y-radien för den elliptiska bågen som ett x,y-par. |
| rotationAngle | float | Anger hur ellipsen är roterad i förhållande till det aktuella koordinatsystemet. |
| isLargeArc | boolean | Bestämmer om bågen ritas med en svepning på 180 grader eller mer. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Riktningen som bågen ritas i. |
| isStroked | boolean | Anger om strecket för detta segment av sökvägen ritas. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Skapar en ny canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Skapar en ny färg i ICC-baserad färgrymd.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC-profilresursen. |
| komponenter | float[] | Färgkomponenter. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Skapar en ny färg i scRGB-färgrymden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| r | float | Den röda färgkomponenten. |
| g | float | Den gröna färgkomponenten. |
| b | float | Den blå färgkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Skapar en ny färg i scRGB-färgrymden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| en | float | Alfa-färgkomponenten. |
| r | float | Den röda färgkomponenten. |
| g | float | Den gröna färgkomponenten. |
| b | float | Den blå färgkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Skapar en ny färg i sRGB-färgrymden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| r | int | Den röda färgkomponenten. |
| g | int | Den gröna färgkomponenten. |
| b | int | Den blå färgkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Skapar en ny färg i sRGB-färgrymden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| en | int | Alfa-färgkomponenten. |
| r | int | Den röda färgkomponenten. |
| g | int | Den gröna färgkomponenten. |
| b | int | Den blå färgkomponenten. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Skapar en ny färg.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | java.awt.Color | En inbyggd färginstans för RGB-färg. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Skapar en ny färg i ICC-baserad färgrymd.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sökväg | java.lang.String | Sökvägen till ICC-profilen. |
| komponenter | float[] | Färgkomponenter. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Skapar nya glyphs.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Typsnittresurs. |
| fontRenderingEmSize | float | Typsnittsstorlek. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Skapar nya glyphs.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontFamily | java.lang.String | Typsnittsfamilj. |
| fontRenderingEmSize | float | Typsnittsstorlek. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckenstil. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Skapar ett nytt gradientstopp.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Gradientstoppens färg. |
| offset | float | Gradientens förskjutning. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Skapar ett nytt gradientstopp.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | java.awt.Color | Gradientstoppens färg. |
| offset | float | Gradientens förskjutning. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Skapar en ny bildpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | En bildresurs. |
| viewbox | java.awt.geom.Rectangle2D | Positionen och dimensionerna för borstpenselns källinnehåll. |
| visningsområde | java.awt.geom.Rectangle2D | Regionen i det omgivande koordinatrymmet för den primära borstplattan som (möjligen upprepade gånger) tillämpas för att fylla den region som borstpenseln appliceras på. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Skapar en ny bildpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imagePath | java.lang.String | Sökvägen till bilden som ska användas som penseltegel. |
| viewbox | java.awt.geom.Rectangle2D | Positionen och dimensionerna för borstpenselns källinnehåll. |
| visningsområde | java.awt.geom.Rectangle2D | Regionen i det omgivande koordinatrymmet för den primära borstplattan som (möjligen upprepade gånger) tillämpas för att fylla den region som borstpenseln appliceras på. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Skapar en ny linjär gradientpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för den linjära gradienten. |
| endPoint | java.awt.geom.Point2D | Slutpunkten för den linjära gradienten. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Skapar en ny linjär gradientpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Listan med gradientstopp. |
| startPoint | java.awt.geom.Point2D | Startpunkten för den linjära gradienten. |
| endPoint | java.awt.geom.Point2D | Slutpunkten för den linjära gradienten. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Skapar en ny affin transformationsmatris.

**Parameters:**
| Parameter | Typ | Beskrivning |
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


Skapar en ny bana.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Skapar en ny öppen path‑figur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Skapar en ny banfigur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |
| isClosed | boolean | Anger om sökvägen är sluten. Om den är satt till true ritas strecket som "slutet", det vill säga att den sista punkten i det sista segmentet av sökvägsfiguren är kopplad till punkten som anges i attributet StartPoint, annars ritas strecket som "öppet" och den sista punkten är inte kopplad till startpunkten. Endast tillämplig om sökvägsfiguren används i ett Path-element som specificerar ett streck. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Skapar en ny öppen path‑figur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Lista över sökvägssegment. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Skapar en ny banfigur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Startpunkten för det första segmentet i sökvägsfiguren. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Lista över sökvägssegment. |
| isClosed | boolean | Anger om sökvägen är sluten. Om den är satt till true ritas strecket som "slutet", det vill säga att den sista punkten i det sista segmentet av sökvägsfiguren är kopplad till punkten som anges i attributet StartPoint, annars ritas strecket som "öppet" och den sista punkten är inte kopplad till startpunkten. Endast tillämplig om sökvägsfiguren används i ett Path-element som specificerar ett streck. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Skapar en ny bangeometri.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Skapar en ny bangeometri specificerad med förkortad form.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Förkortad form av path geometry. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Skapar en ny bangeometri med en specificerad lista av banfigurer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Lista över path-figurer. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Skapar en ny uppsättning streckade kubiska B?bezier‑kurvor.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Kontrollpunkter för flera B?bezier-segment. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Skapar en ny uppsättning kubiska B?bezier‑kurvor.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Kontrollpunkter för flera B?bezier-segment. |
| isStroked | boolean | Anger om strecket för detta segment av sökvägen ritas. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Skapar en ny streckad polygonritning som innehåller ett godtyckligt antal enskilda hörn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | En uppsättning koordinater för de flera segmenten som definierar polylinjensegmentet. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Skapar en ny polygonritning som innehåller ett godtyckligt antal enskilda hörn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | En uppsättning koordinater för de flera segmenten som definierar polylinjensegmentet. |
| isStroked | boolean | Anger om strecket för detta segment av sökvägen ritas. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Skapar en ny uppsättning av strokade kvadratiska B?zier-kurvor från föregående punkt i sökvägsfiguren genom en uppsättning hörn, med angivna kontrollpunkter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Kontrollpunkter för flera kvadratiska B?bezier-segment. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Skapar en ny uppsättning av kvadratiska B?zier-kurvor från föregående punkt i sökvägsfiguren genom en uppsättning hörn, med angivna kontrollpunkter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Kontrollpunkter för flera kvadratiska B?bezier-segment. |
| isStroked | boolean | Anger om strecket för detta segment av sökvägen ritas. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Skapar en ny radiell gradientpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| centrum | java.awt.geom.Point2D | Den centrala punkten för den radiala gradienten (det vill säga ellipsens centrum). |
| gradientOrigin | java.awt.geom.Point2D | Ursprungspunkten för den radiala gradienten. |
| radiusX | float | Radien i x-dimensionen av ellipsen som definierar den radiala gradienten. |
| radiusY | float | Radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Skapar en ny radiell gradientpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Listan med gradientstopp. |
| centrum | java.awt.geom.Point2D | Den centrala punkten för den radiala gradienten (det vill säga ellipsens centrum). |
| gradientOrigin | java.awt.geom.Point2D | Ursprungspunkten för den radiala gradienten. |
| radiusX | float | Radien i x-dimensionen av ellipsen som definierar den radiala gradienten. |
| radiusY | float | Radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Skapar en ny solid färgpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Färgen för fyllda element. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Skapar en ny solid färgpensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| color | java.awt.Color | Färgen för fyllda element. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Skapar en ny visuell pensel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | XPS-elementet (Canvas, Path eller Glyphs) för Visual-egenskapen för visuell pensel. |
| viewbox | java.awt.geom.Rectangle2D | Positionen och dimensionerna för borstpenselns källinnehåll. |
| visningsområde | java.awt.geom.Rectangle2D | Regionen i det omgivande koordinatrymmet för den primära borstplattan som (möjligen upprepade gånger) tillämpas för att fylla den region som borstpenseln appliceras på. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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


Returnerar sidans höjd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet.

**Returns:**
float - Sidans höjd.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Returnerar antalet sidor i det aktiva dokumentet.

**Returns:**
int - Antalet sidor i det aktiva dokumentet.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Returnerar det totala antalet sidor i alla dokument i XPS-dokumentet.

**Returns:**
int - Det totala antalet sidor i alla dokument i XPS-dokumentet.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Hämtar objektet som tillhandahåller verktyg utöver det formella XPS-manipulerings‑API:et.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Returnerar sidans bredd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet.

**Returns:**
float - Sidans bredd.
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


Infogar en ny canvas till sidan på  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en ny duk ska infogas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Infogar nya glyfer till sidan på  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där nya glyfer ska infogas. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Typsnittresurs. |
| fontSize | float | Typsnittsstorlek. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Infogar nya glyfer till sidan på  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där nya glyfer ska infogas. |
| fontFamily | java.lang.String | Typsnittsfamilj. |
| fontSize | float | Typsnittsstorlek. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckenstil. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyfer ursprung Y-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Infogar en ny sökväg till sidan på  index  position.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en ny bana ska infogas. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

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


Tar bort ett element på  index  position från sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där elementet ska tas bort. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Ställer in sidans höjd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Sidans höjd. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Ställer in sidans bredd, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Sidans bredd. |

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

