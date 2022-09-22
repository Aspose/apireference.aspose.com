---
title: GraphicsPath
second_title: Referencia de Aspose.Drawing para .NET API
description: Representa una serie de líneas y curvas conectadas.
type: docs
weight: 260
url: /es/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Representa una serie de líneas y curvas conectadas.

```csharp
public class GraphicsPath : IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | Inicializa una nueva instancia de la clase GraphicsPath con un valor de FillMode de Alternate. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | Inicializa una nueva instancia del[`GraphicsPath`](../graphicspath)clase con el especificado FillMode enumeración. |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | Inicializa una nueva instancia del[`GraphicsPath`](../graphicspath) clase con el especificado[`PathPointType`](../pathpointtype) yPointF matrices. |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | Inicializa una nueva instancia del[`GraphicsPath`](../graphicspath) clase con el especificado[`PathPointType`](../pathpointtype) yPoint matrices. |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | Inicializa una nueva instancia del[`GraphicsPath`](../graphicspath) clase con el especificadoPathPointType yPointF arreglos y con el especificadoFillMode elemento de enumeración.. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | Inicializa una nueva instancia del[`GraphicsPath`](../graphicspath) clase con el especificadoPathPointType yPoint arreglos y con el especificadoFillMode elemento de enumeración.. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | Obtiene o establece una enumeración de FillMode que determina cómo se rellenan los interiores de las formas en este GraphicsPath. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | Obtiene unPathData que encapsula matrices de puntos y tipos para esteGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | Obtiene los puntos de la ruta. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | Obtiene los tipos de los puntos correspondientes en elPathPoints matriz. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | Obtiene el número de elementos en elPathPoints o elPathTypes matriz. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | Agrega un arco elíptico a la figura actual. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | Agrega un arco elíptico a la figura actual. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | Agrega una curva de Bézier cúbica a la figura actual. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | Agrega una curva de Bézier cúbica a la figura actual. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | Agrega una secuencia de curvas de Bézier cúbicas conectadas a la figura actual. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | Agrega una secuencia de curvas de Bézier cúbicas conectadas a la figura actual. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | Agrega una curva cerrada a esta ruta. Se utiliza una curva spline cardinal porque la curva se desplaza a través de cada uno de los puntos de la matriz. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | Agrega una curva cerrada a esta ruta. Se usa una curva spline cardinal porque la curva viaja a través de cada uno de los puntos en la matriz. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | Agrega una curva spline a la figura actual. Se utiliza una curva spline cardinal porque la curva se desplaza a través de cada uno de los puntos de la matriz. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | Agrega una curva spline a la figura actual. Se utiliza una curva spline cardinal porque la curva se desplaza a través de cada uno de los puntos de la matriz. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | Agrega una curva spline a la figura actual. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | Agrega una curva spline a la figura actual. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | Agrega una elipse a la ruta actual. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | Agrega una elipse a la ruta actual. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | Agrega un segmento de línea a este GraphicsPath. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | Agrega un segmento de línea a este GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | Agrega una serie de segmentos de línea conectados al final de esteGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | Agrega una serie de segmentos de línea conectados al final de esteGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | Agrega la GraphicsPath especificada a esta ruta. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | Agrega el contorno de una forma circular a esta ruta. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | Agrega el contorno de una forma circular a esta ruta. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | Agrega un polígono a esta ruta. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | Agrega un polígono a esta ruta. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | Agrega un rectángulo a esta ruta. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | Agrega un rectángulo a esta ruta. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | Agrega una serie de rectángulos a esta ruta. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | Agrega una serie de rectángulos a esta ruta. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | Agrega una cadena de texto a esta ruta. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Agrega una cadena de texto a esta ruta. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Agrega una cadena de texto a esta ruta. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Agrega una cadena de texto a esta ruta. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | Hacer una copia del objeto de ruta actual. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | Cierra todas las figuras abiertas en este camino y comienza una nueva figura. Cierra cada figura abierta conectando una línea desde su punto final hasta su punto inicial. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | Cierra la figura actual y comienza una nueva figura. Si la figura actual contiene una secuencia de líneas y curvas conectadas, el método cierra el bucle conectando una línea desde el punto final hasta el punto inicial. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | Libera todos los recursos utilizados por este GraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | Convierte cada curva de esta ruta en una secuencia de segmentos de línea conectados. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | Devuelve un rectángulo que delimita esteGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | Devuelve un rectángulo que delimita esteGraphicsPath cuando esta ruta es transformada por el especificadoMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | Devuelve un rectángulo que delimita esteGraphicsPath cuando la ruta actual es transformada por el especificadoMatrix y dibujado con el especificadoPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | Obtiene el último punto en la matriz PathPoints de este[`GraphicsPath`](../graphicspath) . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | Indica si el punto especificado está contenido dentro (debajo) del contorno de esteGraphicsPath cuando se dibuja con el especificadoPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | Indica si el punto especificado está contenido dentro de esteGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | Vacía el[`PathPoints`](./pathpoints) y[`PathTypes`](./pathtypes)arrays y establece el[`FillMode`](../fillmode) aAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | Invierte el orden de los puntos en el[`PathPoints`](./pathpoints) matriz de este[`GraphicsPath`](../graphicspath) . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | Establece un marcador en este[`GraphicsPath`](../graphicspath) . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | Comienza una nueva figura sin cerrar la figura actual. Todos los puntos posteriores agregados a la ruta se agregan a esta nueva figura. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | Aplica una matriz de transformación a este GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | Aplica una transformación warp, definida por un rectángulo y un paralelogramo, a este[`GraphicsPath`](../graphicspath) . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | Aplica una transformación warp, definida por un rectángulo y un paralelogramo, a este[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Aplica una transformación warp, definida por un rectángulo y un paralelogramo, a este[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Aplica una transformación warp, definida por un rectángulo y un paralelogramo, a este[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | Agrega un contorno adicional a la ruta. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | Reemplaza estoGraphicsPath con curvas que encierran el área que se rellena cuando la pluma especificada dibuja esta ruta. |

### Ver también

* espacio de nombres [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
