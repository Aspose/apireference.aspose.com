---
title: GraphicsPath
second_title: Aspose.Drawing per .NET API Reference
description: Rappresenta una serie di linee e curve collegate.
type: docs
weight: 260
url: /it/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Rappresenta una serie di linee e curve collegate.

```csharp
public class GraphicsPath : IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | Inizializza una nuova istanza della classe GraphicsPath con un valore FillMode di Alternate. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | Inizializza una nuova istanza di[`GraphicsPath`](../graphicspath)classe con il specificatoFillMode enumerazione. |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | Inizializza una nuova istanza di[`GraphicsPath`](../graphicspath) classe con il specificato[`PathPointType`](../pathpointtype) ePointF matrici. |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | Inizializza una nuova istanza di[`GraphicsPath`](../graphicspath) classe con il specificato[`PathPointType`](../pathpointtype) ePoint matrici. |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | Inizializza una nuova istanza di[`GraphicsPath`](../graphicspath) classe con il specificatoPathPointType ePointF array e con il specificatoFillMode elemento di enumerazione.. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | Inizializza una nuova istanza di[`GraphicsPath`](../graphicspath) classe con il specificatoPathPointType ePoint array e con il specificatoFillMode elemento di enumerazione.. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | Ottiene o imposta un'enumerazione FillMode che determina come vengono riempiti gli interni delle forme in questo GraphicsPath. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | Ottiene aPathData che incapsula matrici di punti e tipi per questoGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | Ottiene i punti nel percorso. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | Ottiene i tipi dei punti corrispondenti nel filePathPoints matrice. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | Ottiene il numero di elementi nel filePathPoints o ilPathTypes matrice. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | Aggiunge un arco ellittico alla figura corrente. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | Aggiunge un arco ellittico alla figura corrente. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | Aggiunge una curva di Bézier cubica alla cifra corrente. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | Aggiunge una curva di Bézier cubica alla cifra corrente. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | Aggiunge una sequenza di curve di Bézier cubiche collegate alla figura corrente. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | Aggiunge una sequenza di curve di Bézier cubiche collegate alla figura corrente. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | Aggiunge una curva chiusa a questo percorso. Viene utilizzata una curva spline cardinale perché la curva viaggia attraverso ciascuno dei punti nell'array. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | Aggiunge una curva chiusa a questo percorso. Viene utilizzata una curva spline cardinale perché la curva viaggia attraverso ciascuno dei punti nell'array. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | Aggiunge una curva spline alla figura corrente. Viene utilizzata una curva spline cardinale perché la curva viaggia attraverso ciascuno dei punti nell'array. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | Aggiunge una curva spline alla figura corrente. Viene utilizzata una curva spline cardinale perché la curva viaggia attraverso ciascuno dei punti nell'array. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | Aggiunge una curva spline alla figura corrente. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | Aggiunge una curva spline alla figura corrente. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | Aggiunge un'ellisse al percorso corrente. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | Aggiunge un'ellisse al percorso corrente. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | Aggiunge un segmento di linea a questo GraphicsPath. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | Aggiunge un segmento di linea a questo GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | Aggiunge una serie di segmenti di linea collegati alla fine di questoGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | Aggiunge una serie di segmenti di linea collegati alla fine di questoGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | Aggiunge il GraphicsPath specificato a questo percorso. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | Aggiunge il contorno di una forma a torta a questo percorso. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | Aggiunge il contorno di una forma a torta a questo percorso. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | Aggiunge un poligono a questo percorso. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | Aggiunge un poligono a questo percorso. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | Aggiunge un rettangolo a questo percorso. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | Aggiunge un rettangolo a questo percorso. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | Aggiunge una serie di rettangoli a questo percorso. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | Aggiunge una serie di rettangoli a questo percorso. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | Aggiunge una stringa di testo a questo percorso. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Aggiunge una stringa di testo a questo percorso. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Aggiunge una stringa di testo a questo percorso. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Aggiunge una stringa di testo a questo percorso. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | Crea una copia dell'oggetto percorso corrente. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | Chiude tutte le figure aperte in questo percorso e avvia una nuova figura. Chiude ogni figura aperta collegando una linea dal suo punto finale al suo punto iniziale. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | Chiude la cifra corrente e ne avvia una nuova. Se la figura corrente contiene una sequenza di linee e curve collegate, il metodo chiude il ciclo collegando una linea dal punto finale al punto iniziale. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | Rilascia tutte le risorse utilizzate da questo GraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | Converte ogni curva in questo percorso in una sequenza di segmenti di linea collegati. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | Restituisce un rettangolo che lo delimitaGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | Restituisce un rettangolo che lo delimitaGraphicsPath quando questo percorso è trasformato dall'oggetto specificatoMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | Restituisce un rettangolo che lo delimitaGraphicsPath quando il percorso corrente è trasformato da quello specificatoMatrix e disegnato con il specificatoPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | Ottiene l'ultimo punto nell'array PathPoints di questo[`GraphicsPath`](../graphicspath) . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | Indica se il punto specificato è contenuto all'interno (sotto) il contorno di questoGraphicsPath quando disegnato con il specificatoPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | Indica se il punto specificato è contenuto all'interno di questoGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | Svuota il[`PathPoints`](./pathpoints) e[`PathTypes`](./pathtypes)arrays e imposta il[`FillMode`](../fillmode) aAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | Inverte l'ordine dei punti nel[`PathPoints`](./pathpoints) matrice di questo[`GraphicsPath`](../graphicspath) . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | Imposta un marker su questo[`GraphicsPath`](../graphicspath) . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | Inizia una nuova figura senza chiudere la figura corrente. Tutti i punti successivi aggiunti al percorso vengono aggiunti a questa nuova figura. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | Applica una matrice di trasformazione a questo GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | Applica una trasformata warp, definita da un rettangolo e un parallelogramma, a questo[`GraphicsPath`](../graphicspath) . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | Applica una trasformata warp, definita da un rettangolo e un parallelogramma, a questo[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Applica una trasformata warp, definita da un rettangolo e un parallelogramma, a questo[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Applica una trasformata warp, definita da un rettangolo e un parallelogramma, a questo[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | Aggiunge un contorno aggiuntivo al percorso. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | Sostituisce questoGraphicsPath con curve che racchiudono l'area che viene riempita quando questo percorso viene disegnato dalla penna specificata. |

### Guarda anche

* spazio dei nomi [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
