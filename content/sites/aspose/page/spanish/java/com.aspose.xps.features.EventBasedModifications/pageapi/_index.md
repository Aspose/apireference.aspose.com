---
title: "PageAPI"
second_title: "Referencia de API de Aspose.Page para Java"
description: "La API de modificación del elemento Page."
type: docs
weight: 12
url: /es/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

La API de modificación del elemento **Page**.
## Métodos

| Método | Descripción |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Agrega un elemento de contenido (Canvas, Path o Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserta un elemento (Canvas, Path o Glyphs) en la página en la posición de índice. |
| [<T>remove(T element)](#-T-remove-T-) | Elimina un elemento de la página. |
| [addCanvas()](#addCanvas--) | Añade un nuevo canvas a la página. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Añade nuevos glyphs a la página. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Añade nuevos glyphs a la página. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Añade una entrada de contorno al documento. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Añade un nuevo path a la página. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Crea un nuevo segmento de arco elíptico con trazo. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Crea un nuevo segmento de arco elíptico. |
| [createCanvas()](#createCanvas--) | Crea un nuevo canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Crea un nuevo color en un espacio de color basado en ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Crea un nuevo color en el espacio de color scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Crea un nuevo color en el espacio de color scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Crea un nuevo color en el espacio de color sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Crea un nuevo color en el espacio de color sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Crea un nuevo color. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Crea un nuevo color en un espacio de color basado en ICC. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Crea nuevos glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Crea nuevos glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Crea una nueva parada de degradado. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Crea una nueva parada de degradado. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuevo pincel de imagen. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuevo pincel de imagen. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crea un nuevo pincel de degradado lineal. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Crea un nuevo pincel de degradado lineal. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Crea una nueva matriz de transformación afín. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Crea una nueva ruta. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Crea una nueva figura de ruta abierta. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Crea una nueva figura de ruta. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Crea una nueva figura de ruta abierta. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Crea una nueva figura de ruta. |
| [createPathGeometry()](#createPathGeometry--) | Crea una nueva geometría de ruta. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Crea una nueva geometría de ruta especificada con forma abreviada. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Crea una nueva geometría de ruta con una lista especificada de figuras de ruta. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Crea un nuevo conjunto de curvas cúbicas B?bezier con trazo. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Crea un nuevo conjunto de curvas cúbicas B?bezier. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Crea un nuevo dibujo poligonal con trazo que contiene un número arbitrario de vértices individuales. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Crea un nuevo dibujo polygonal que contiene un número arbitrario de vértices individuales. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Crea un nuevo conjunto de curvas cuadráticas B?bezier con trazo desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Crea un nuevo conjunto de curvas cuadráticas B?bezier desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crea un nuevo pincel de degradado radial. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Crea un nuevo pincel de degradado radial. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Crea un nuevo pincel de color sólido. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Crea un nuevo pincel de color sólido. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Crea un nuevo pincel visual. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Devuelve la altura de la página, expresada como un número real en unidades del espacio de coordenadas efectivo. |
| [getPageCount()](#getPageCount--) | Devuelve el número de páginas en el documento activo. |
| [getTotalPageCount()](#getTotalPageCount--) | Devuelve el número total de páginas en todos los documentos dentro del documento XPS. |
| [getUtils()](#getUtils--) | Obtiene el objeto que proporciona utilidades más allá de la API formal de manipulación XPS. |
| [getWidth()](#getWidth--) | Devuelve el ancho de la página, expresado como un número real en unidades del espacio de coordenadas efectivo. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserta un nuevo lienzo en la página en la posición de índice. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Inserta nuevos glifos en la página en la posición de índice. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserta nuevos glifos en la página en la posición de índice. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserta una nueva ruta en la página en la posición de índice. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Elimina un elemento en la posición de índice de la página. |
| [setHeight(float value)](#setHeight-float-) | Establece la altura de la página, expresada como un número real en unidades del espacio de coordenadas efectivo. |
| [setWidth(float value)](#setWidth-float-) | Establece el ancho de la página, expresada como un número real en unidades del espacio de coordenadas efectivo. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Agrega un elemento de contenido (Canvas, Path o Glyphs)

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| elemento | T | El elemento a agregar. |

**Returns:**
T - Elemento agregado.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Inserta un elemento (Canvas, Path o Glyphs) en la página en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un elemento. |
| elemento | T | El elemento a insertar. |

**Returns:**
T - Elemento insertado.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Elimina un elemento de la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| elemento | T | El elemento a eliminar. |

**Returns:**
T - Elemento eliminado.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Añade un nuevo canvas a la página.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Añade nuevos glyphs a la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Recurso de fuente. |
| fontRenderingEmSize | float | Tamaño de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Añade nuevos glyphs a la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontFamily | java.lang.String | Familia de fuente. |
| fontRenderingEmSize | float | Tamaño de fuente. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Estilo de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Añade una entrada de contorno al documento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| descripción | java.lang.String | La descripción de la entrada. |
| outlineLevel | int | El nivel de esquema. |
| targetPageNumber | int | El número de página de destino. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Añade un nuevo path a la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Crea un nuevo segmento de arco elíptico con trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| point | java.awt.geom.Point2D | El punto final del arco elíptico. |
| size | java.awt.geom.Dimension2D | El radio x e y del arco elíptico como un par x,y. |
| rotationAngle | float | Indica cómo se rota la elipse respecto al sistema de coordenadas actual. |
| isLargeArc | boolean | Determina si el arco se dibuja con un barrido de 180 grados o más. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La dirección en la que se dibuja el arco. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Crea un nuevo segmento de arco elíptico.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| point | java.awt.geom.Point2D | El punto final del arco elíptico. |
| size | java.awt.geom.Dimension2D | El radio x e y del arco elíptico como un par x,y. |
| rotationAngle | float | Indica cómo se rota la elipse respecto al sistema de coordenadas actual. |
| isLargeArc | boolean | Determina si el arco se dibuja con un barrido de 180 grados o más. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | La dirección en la que se dibuja el arco. |
| isStroked | boolean | Especifica si el trazo para este segmento de la ruta se dibuja. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Crea un nuevo canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Crea un nuevo color en un espacio de color basado en ICC.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | El recurso del perfil ICC. |
| componentes | float[] | Componentes de color. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Crea un nuevo color en el espacio de color scRGB.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| r | float | El componente de color rojo. |
| g | float | El componente de color verde. |
| b | float | El componente de color azul. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Crea un nuevo color en el espacio de color scRGB.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| a | float | El componente alfa del color. |
| r | float | El componente de color rojo. |
| g | float | El componente de color verde. |
| b | float | El componente de color azul. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Crea un nuevo color en el espacio de color sRGB.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| r | int | El componente de color rojo. |
| g | int | El componente de color verde. |
| b | int | El componente de color azul. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Crea un nuevo color en el espacio de color sRGB.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| a | int | El componente alfa del color. |
| r | int | El componente de color rojo. |
| g | int | El componente de color verde. |
| b | int | El componente de color azul. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Crea un nuevo color.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | java.awt.Color | Una instancia de color nativa para color RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Crea un nuevo color en un espacio de color basado en ICC.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | java.lang.String | La ruta al perfil ICC. |
| componentes | float[] | Componentes de color. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Crea nuevos glyphs.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Recurso de fuente. |
| fontRenderingEmSize | float | Tamaño de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Crea nuevos glyphs.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontFamily | java.lang.String | Familia de fuente. |
| fontRenderingEmSize | float | Tamaño de fuente. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Estilo de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Crea una nueva parada de degradado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | El color de la parada de degradado. |
| desplazamiento | float | El desplazamiento del degradado. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Crea una nueva parada de degradado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | java.awt.Color | El color de la parada de degradado. |
| desplazamiento | float | El desplazamiento del degradado. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuevo pincel de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Un recurso de imagen. |
| viewbox | java.awt.geom.Rectangle2D | La posición y dimensiones del contenido fuente del pincel. |
| área de visualización | java.awt.geom.Rectangle2D | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente repetidamente) aplica para rellenar la región a la que se aplica el pincel |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuevo pincel de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagePath | java.lang.String | La ruta a la imagen que se utilizará como mosaico del pincel. |
| viewbox | java.awt.geom.Rectangle2D | La posición y dimensiones del contenido fuente del pincel. |
| área de visualización | java.awt.geom.Rectangle2D | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente repetidamente) aplica para rellenar la región a la que se aplica el pincel |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Crea un nuevo pincel de degradado lineal.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del degradado lineal. |
| endPoint | java.awt.geom.Point2D | El punto final del degradado lineal. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Crea un nuevo pincel de degradado lineal.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | La lista de paradas de degradado. |
| startPoint | java.awt.geom.Point2D | El punto de inicio del degradado lineal. |
| endPoint | java.awt.geom.Point2D | El punto final del degradado lineal. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Crea una nueva matriz de transformación afín.

**Parameters:**
| Parámetro | Tipo | Descripción |
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


Crea una nueva ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Crea una nueva figura de ruta abierta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del primer segmento de la figura de ruta. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Crea una nueva figura de ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del primer segmento de la figura de ruta. |
| isClosed | boolean | Especifica si la ruta está cerrada. Si se establece en true, el trazo se dibuja "closed", es decir, el último punto del último segmento de la figura de ruta se conecta con el punto especificado en el atributo StartPoint; de lo contrario, el trazo se dibuja "open" y el último punto no se conecta al punto de inicio. Solo es aplicable si la figura de ruta se utiliza en un elemento Path que especifica un trazo. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Crea una nueva figura de ruta abierta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del primer segmento de la figura de ruta. |
| segmentos | java.util.List<com.aspose.xps.XpsPathSegment> | Lista de segmentos de ruta. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Crea una nueva figura de ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | El punto de inicio del primer segmento de la figura de ruta. |
| segmentos | java.util.List<com.aspose.xps.XpsPathSegment> | Lista de segmentos de ruta. |
| isClosed | boolean | Especifica si la ruta está cerrada. Si se establece en true, el trazo se dibuja "closed", es decir, el último punto del último segmento de la figura de ruta se conecta con el punto especificado en el atributo StartPoint; de lo contrario, el trazo se dibuja "open" y el último punto no se conecta al punto de inicio. Solo es aplicable si la figura de ruta se utiliza en un elemento Path que especifica un trazo. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Crea una nueva geometría de ruta.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Crea una nueva geometría de ruta especificada con forma abreviada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Forma abreviada de la geometría de ruta. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Crea una nueva geometría de ruta con una lista especificada de figuras de ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Lista de figuras de ruta. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Crea un nuevo conjunto de curvas cúbicas B?bezier con trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Puntos de control para múltiples segmentos B?bezier. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Crea un nuevo conjunto de curvas cúbicas B?bezier.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Puntos de control para múltiples segmentos B?bezier. |
| isStroked | boolean | Especifica si el trazo para este segmento de la ruta se dibuja. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Crea un nuevo dibujo poligonal con trazo que contiene un número arbitrario de vértices individuales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Un conjunto de coordenadas para los múltiples segmentos que definen el segmento de línea poligonal. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Crea un nuevo dibujo polygonal que contiene un número arbitrario de vértices individuales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Un conjunto de coordenadas para los múltiples segmentos que definen el segmento de línea poligonal. |
| isStroked | boolean | Especifica si el trazo para este segmento de la ruta se dibuja. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Crea un nuevo conjunto de curvas cuadráticas B?bezier con trazo desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Puntos de control para múltiples segmentos B?bezier cuadráticos. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Crea un nuevo conjunto de curvas cuadráticas B?bezier desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Puntos de control para múltiples segmentos B?bezier cuadráticos. |
| isStroked | boolean | Especifica si el trazo para este segmento de la ruta se dibuja. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crea un nuevo pincel de degradado radial.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| center | java.awt.geom.Point2D | El punto central del degradado radial (es decir, el centro de la elipse). |
| gradientOrigin | java.awt.geom.Point2D | El punto de origen del degradado radial. |
| radiusX | float | El radio en la dimensión x de la elipse que define el degradado radial. |
| radiusY | float | El radio en la dimensión y de la elipse que define el degradado radial. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Crea un nuevo pincel de degradado radial.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | La lista de paradas de degradado. |
| center | java.awt.geom.Point2D | El punto central del degradado radial (es decir, el centro de la elipse). |
| gradientOrigin | java.awt.geom.Point2D | El punto de origen del degradado radial. |
| radiusX | float | El radio en la dimensión x de la elipse que define el degradado radial. |
| radiusY | float | El radio en la dimensión y de la elipse que define el degradado radial. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Crea un nuevo pincel de color sólido.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | El color para los elementos rellenos. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Crea un nuevo pincel de color sólido.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| color | java.awt.Color | El color para los elementos rellenos. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Crea un nuevo pincel visual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | El elemento XPS (Canvas, Path, o Glyphs) para la propiedad Visual del visual brush. |
| viewbox | java.awt.geom.Rectangle2D | La posición y dimensiones del contenido fuente del pincel. |
| área de visualización | java.awt.geom.Rectangle2D | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente repetidamente) aplica para rellenar la región a la que se aplica el pincel |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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


Devuelve la altura de la página, expresada como un número real en unidades del espacio de coordenadas efectivo.

**Returns:**
float - La altura de la página.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Devuelve el número de páginas en el documento activo.

**Returns:**
int - El número de páginas en el documento activo.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Devuelve el número total de páginas en todos los documentos dentro del documento XPS.

**Returns:**
int - El número total de páginas en todos los documentos dentro del documento XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Obtiene el objeto que proporciona utilidades más allá de la API formal de manipulación XPS.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Devuelve el ancho de la página, expresado como un número real en unidades del espacio de coordenadas efectivo.

**Returns:**
float - El ancho de la página.
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


Inserta un nuevo lienzo en la página en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un nuevo lienzo. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Inserta nuevos glifos en la página en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se deben insertar los nuevos glifos. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Recurso de fuente. |
| fontSize | float | Tamaño de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserta nuevos glifos en la página en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se deben insertar los nuevos glifos. |
| fontFamily | java.lang.String | Familia de fuente. |
| fontSize | float | Tamaño de fuente. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Estilo de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserta una nueva ruta en la página en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar una nueva ruta. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

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


Elimina un elemento en la posición de índice de la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe eliminar el elemento. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Establece la altura de la página, expresada como un número real en unidades del espacio de coordenadas efectivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | La altura de la página. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Establece el ancho de la página, expresada como un número real en unidades del espacio de coordenadas efectivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | El ancho de la página. |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

