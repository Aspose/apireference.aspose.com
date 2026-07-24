---
title: "PageAPI"
second_title: "Aspose.Page per Java API Reference"
description: "L'API di modifica dell'elemento Page."
type: docs
weight: 12
url: /it/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

L'API di modifica dell'elemento **Page**.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Aggiunge un elemento di contenuto (Canvas, Path o Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserisce un elemento (Canvas, Path o Glyphs) nella pagina alla posizione indice. |
| [<T>remove(T element)](#-T-remove-T-) | Rimuove un elemento dalla pagina. |
| [addCanvas()](#addCanvas--) | Aggiunge un nuovo canvas alla pagina. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Aggiunge nuovi glyphs alla pagina. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Aggiunge nuovi glyphs alla pagina. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Aggiunge una voce di contorno al documento. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Aggiunge un nuovo Path alla pagina. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Crea un nuovo segmento di arco ellittico tracciato. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Crea un nuovo segmento di arco ellittico. |
| [createCanvas()](#createCanvas--) | Crea un nuovo canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Crea un nuovo colore nello spazio colore basato su ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Crea un nuovo colore nello spazio colore scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Crea un nuovo colore nello spazio colore scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Crea un nuovo colore nello spazio colore sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Crea un nuovo colore nello spazio colore sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Crea un nuovo colore. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Crea un nuovo colore nello spazio colore basato su ICC. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Crea nuovi glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Crea nuovi glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Crea una nuova fermata di gradiente. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Crea una nuova fermata di gradiente. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuovo pennello immagine. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuovo pennello immagine. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crea un nuovo pennello di gradiente lineare. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crea un nuovo pennello di gradiente lineare. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Crea una nuova matrice di trasformazione affine. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Crea un nuovo Path. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Crea una nuova figura di percorso aperto. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Crea una nuova figura di percorso. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Crea una nuova figura di percorso aperto. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Crea una nuova figura di percorso. |
| [createPathGeometry()](#createPathGeometry--) | Crea una nuova geometria di percorso. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Crea una nuova geometria di percorso specificata in forma abbreviata. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Crea una nuova geometria di percorso con l'elenco specificato di figure di percorso. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Crea un nuovo insieme di curve cubiche B?zier tracciate. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Crea un nuovo insieme di curve cubiche B?zier. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Crea un nuovo disegno poligonale tracciato contenente un numero arbitrario di vertici individuali. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Crea un nuovo disegno poligonale contenente un numero arbitrario di vertici individuali. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Crea un nuovo insieme di curve quadratiche B?zier tracciate dal punto precedente nella figura di percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Crea un nuovo insieme di curve quadratiche B?bezier dal punto precedente nella figura di percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crea un nuovo pennello a gradiente radiale. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crea un nuovo pennello a gradiente radiale. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Crea un nuovo pennello a colore solido. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Crea un nuovo pennello a colore solido. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuovo pennello visivo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Restituisce l'altezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo. |
| [getPageCount()](#getPageCount--) | Restituisce il numero di pagine nel documento attivo. |
| [getTotalPageCount()](#getTotalPageCount--) | Restituisce il numero totale di pagine in tutti i documenti all'interno del documento XPS. |
| [getUtils()](#getUtils--) | Ottiene l'oggetto che fornisce utilità oltre l'API formale di manipolazione XPS. |
| [getWidth()](#getWidth--) | Restituisce la larghezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserisce una nuova tela nella pagina alla posizione  index . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Inserisce nuovi glifi nella pagina alla posizione  index . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserisce nuovi glifi nella pagina alla posizione  index . |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserisce un nuovo percorso nella pagina alla posizione  index . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Rimuove un elemento alla posizione  index  dalla pagina. |
| [setHeight(float value)](#setHeight-float-) | Imposta l'altezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo. |
| [setWidth(float value)](#setWidth-float-) | Imposta la larghezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Aggiunge un elemento di contenuto (Canvas, Path o Glyphs)

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| elemento | T | L'elemento da aggiungere. |

**Returns:**
T - Elemento aggiunto.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Inserisce un elemento (Canvas, Path o Glyphs) nella pagina alla posizione indice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un elemento dovrebbe essere inserito. |
| elemento | T | L'elemento da inserire. |

**Returns:**
T - Elemento inserito.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Rimuove un elemento dalla pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| elemento | T | L'elemento da rimuovere. |

**Returns:**
T - Elemento rimosso.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Aggiunge un nuovo canvas alla pagina.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Aggiunge nuovi glyphs alla pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Risorsa del font. |
| fontRenderingEmSize | float | Dimensione del font. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Aggiunge nuovi glyphs alla pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontFamily | java.lang.String | Famiglia del font. |
| fontRenderingEmSize | float | Dimensione del font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Stile del carattere. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Aggiunge una voce di contorno al documento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| description | java.lang.String | La descrizione della voce. |
| outlineLevel | int | Il livello di contorno. |
| targetPageNumber | int | Il numero di pagina di destinazione. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Aggiunge un nuovo Path alla pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Crea un nuovo segmento di arco ellittico tracciato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| punto | java.awt.geom.Point2D | Il punto finale dell'arco ellittico. |
| dimensione | java.awt.geom.Dimension2D | Il raggio x e y dell'arco ellittico come coppia x,y. |
| rotationAngle | float | Indica come l'ellisse è ruotata rispetto al sistema di coordinate corrente. |
| isLargeArc | boolean | Determina se l'arco è disegnato con una sweep di 180 gradi o più. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La direzione in cui l'arco è disegnato. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Crea un nuovo segmento di arco ellittico.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| punto | java.awt.geom.Point2D | Il punto finale dell'arco ellittico. |
| dimensione | java.awt.geom.Dimension2D | Il raggio x e y dell'arco ellittico come coppia x,y. |
| rotationAngle | float | Indica come l'ellisse è ruotata rispetto al sistema di coordinate corrente. |
| isLargeArc | boolean | Determina se l'arco è disegnato con una sweep di 180 gradi o più. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La direzione in cui l'arco è disegnato. |
| isStroked | boolean | Specifica se il tratto per questo segmento del percorso è disegnato. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Crea un nuovo canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Crea un nuovo colore nello spazio colore basato su ICC.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | La risorsa del profilo ICC. |
| components | float[] | Componenti di colore. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Crea un nuovo colore nello spazio colore scRGB.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| r | float | Il componente di colore rosso. |
| g | float | Il componente di colore verde. |
| b | float | Il componente di colore blu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Crea un nuovo colore nello spazio colore scRGB.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | float | Il componente di colore alfa. |
| r | float | Il componente di colore rosso. |
| g | float | Il componente di colore verde. |
| b | float | Il componente di colore blu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Crea un nuovo colore nello spazio colore sRGB.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| r | int | Il componente di colore rosso. |
| g | int | Il componente di colore verde. |
| b | int | Il componente di colore blu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Crea un nuovo colore nello spazio colore sRGB.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | int | Il componente di colore alfa. |
| r | int | Il componente di colore rosso. |
| g | int | Il componente di colore verde. |
| b | int | Il componente di colore blu. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Crea un nuovo colore.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | java.awt.Color | Un'istanza di colore nativa per il colore RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Crea un nuovo colore nello spazio colore basato su ICC.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | java.lang.String | Il percorso al profilo ICC. |
| components | float[] | Componenti di colore. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Crea nuovi glyphs.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Risorsa del font. |
| fontRenderingEmSize | float | Dimensione del font. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Crea nuovi glyphs.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontFamily | java.lang.String | Famiglia del font. |
| fontRenderingEmSize | float | Dimensione del font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Stile del carattere. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Crea una nuova fermata di gradiente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Il colore di arresto del gradiente. |
| offset | float | L'offset del gradiente. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Crea una nuova fermata di gradiente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | java.awt.Color | Il colore di arresto del gradiente. |
| offset | float | L'offset del gradiente. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuovo pennello immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Una risorsa immagine. |
| viewbox | java.awt.geom.Rectangle2D | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | java.awt.geom.Rectangle2D | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuovo pennello immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imagePath | java.lang.String | Il percorso dell'immagine da utilizzare come tessera del pennello. |
| viewbox | java.awt.geom.Rectangle2D | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | java.awt.geom.Rectangle2D | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Crea un nuovo pennello di gradiente lineare.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza del gradiente lineare. |
| endPoint | java.awt.geom.Point2D | Il punto finale del gradiente lineare. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Crea un nuovo pennello di gradiente lineare.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | L'elenco delle fermate del gradiente. |
| startPoint | java.awt.geom.Point2D | Il punto di partenza del gradiente lineare. |
| endPoint | java.awt.geom.Point2D | Il punto finale del gradiente lineare. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Crea una nuova matrice di trasformazione affine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| m11 | float | Elemento 11. |
| m12 | float | Elemento 12. |
| m21 | float | Elemento 21. |
| m22 | float | Elemento 22. |
| m31 | float | Elemento 31. |
| m32 | float | Elemento 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Crea un nuovo Path.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Crea una nuova figura di percorso aperto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Crea una nuova figura di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |
| isClosed | boolean | Specifica se il percorso è chiuso. Se impostato su true, il tratto è disegnato \"closed\", cioè l'ultimo punto dell'ultimo segmento della figura del percorso è collegato al punto specificato nell'attributo StartPoint, altrimenti il tratto è disegnato \"open\" e l'ultimo punto non è collegato al punto di partenza. Applicabile solo se la figura del percorso è utilizzata in un elemento Path che specifica un tratto. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Crea una nuova figura di percorso aperto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Elenco di segmenti di percorso. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Crea una nuova figura di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Elenco di segmenti di percorso. |
| isClosed | boolean | Specifica se il percorso è chiuso. Se impostato su true, il tratto è disegnato \"closed\", cioè l'ultimo punto dell'ultimo segmento della figura del percorso è collegato al punto specificato nell'attributo StartPoint, altrimenti il tratto è disegnato \"open\" e l'ultimo punto non è collegato al punto di partenza. Applicabile solo se la figura del percorso è utilizzata in un elemento Path che specifica un tratto. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Crea una nuova geometria di percorso.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Crea una nuova geometria di percorso specificata in forma abbreviata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Forma abbreviata della geometria del percorso. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Crea una nuova geometria di percorso con l'elenco specificato di figure di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Elenco di figure del percorso. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Crea un nuovo insieme di curve cubiche B?zier tracciate.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Punti di controllo per più segmenti B?bezier. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Crea un nuovo insieme di curve cubiche B?zier.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Punti di controllo per più segmenti B?bezier. |
| isStroked | boolean | Specifica se il tratto per questo segmento del percorso è disegnato. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Crea un nuovo disegno poligonale tracciato contenente un numero arbitrario di vertici individuali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Un insieme di coordinate per i molteplici segmenti che definiscono il segmento di polilinea. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Crea un nuovo disegno poligonale contenente un numero arbitrario di vertici individuali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Un insieme di coordinate per i molteplici segmenti che definiscono il segmento di polilinea. |
| isStroked | boolean | Specifica se il tratto per questo segmento del percorso è disegnato. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Crea un nuovo insieme di curve quadratiche B?zier tracciate dal punto precedente nella figura di percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Punti di controllo per più segmenti B?bezier quadratici. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Crea un nuovo insieme di curve quadratiche B?bezier dal punto precedente nella figura di percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Punti di controllo per più segmenti B?bezier quadratici. |
| isStroked | boolean | Specifica se il tratto per questo segmento del percorso è disegnato. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crea un nuovo pennello a gradiente radiale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Il punto centrale del gradiente radiale (cioè il centro dell'ellisse). |
| gradientOrigin | java.awt.geom.Point2D | Il punto di origine del gradiente radiale. |
| radiusX | float | Il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |
| radiusY | float | Il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crea un nuovo pennello a gradiente radiale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | L'elenco delle fermate del gradiente. |
| center | java.awt.geom.Point2D | Il punto centrale del gradiente radiale (cioè il centro dell'ellisse). |
| gradientOrigin | java.awt.geom.Point2D | Il punto di origine del gradiente radiale. |
| radiusX | float | Il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |
| radiusY | float | Il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Crea un nuovo pennello a colore solido.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Il colore per gli elementi riempiti. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Crea un nuovo pennello a colore solido.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| color | java.awt.Color | Il colore per gli elementi riempiti. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuovo pennello visivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | L'elemento XPS (Canvas, Path, o Glyphs) per la proprietà Visual del visual brush. |
| viewbox | java.awt.geom.Rectangle2D | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | java.awt.geom.Rectangle2D | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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


Restituisce l'altezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo.

**Returns:**
float - L'altezza della pagina.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Restituisce il numero di pagine nel documento attivo.

**Returns:**
int - Il numero di pagine nel documento attivo.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Restituisce il numero totale di pagine in tutti i documenti all'interno del documento XPS.

**Returns:**
int - Il numero totale di pagine in tutti i documenti all'interno del documento XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Ottiene l'oggetto che fornisce utilità oltre l'API formale di manipolazione XPS.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Restituisce la larghezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo.

**Returns:**
float - La larghezza della pagina.
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


Inserisce una nuova tela nella pagina alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbe essere inserito un nuovo canvas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Inserisce nuovi glifi nella pagina alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbero essere inseriti nuovi glyphs. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Risorsa del font. |
| fontSize | float | Dimensione del font. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserisce nuovi glifi nella pagina alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbero essere inseriti nuovi glyphs. |
| fontFamily | java.lang.String | Famiglia del font. |
| fontSize | float | Dimensione del font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Stile del carattere. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserisce un nuovo percorso nella pagina alla posizione  index .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbe essere inserito un nuovo path. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

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


Rimuove un elemento alla posizione  index  dalla pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui l'elemento dovrebbe essere rimosso. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Imposta l'altezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | L'altezza della pagina. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Imposta la larghezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | La larghezza della pagina. |

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

