---
title: Class GraphicsPath
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Drawing2D.GraphicsPath klas. Vertegenwoordigt een reeks verbonden lijnen en krommen.
type: docs
weight: 260
url: /nl/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Vertegenwoordigt een reeks verbonden lijnen en krommen.

```csharp
public class GraphicsPath : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [GraphicsPath](graphicspath/#constructor)() | Initialiseert een nieuwe instantie van de klasse GraphicsPath met de FillMode-waarde Alternate. |
| [GraphicsPath](graphicspath/#constructor_1)(FillMode) | Initialiseert een nieuw exemplaar van het`GraphicsPath`klasse met de opgegeven FillMode opsomming. |
| [GraphicsPath](graphicspath/#constructor_2)(PointF[], byte[]) | Initialiseert een nieuw exemplaar van het`GraphicsPath` klasse met de gespecificeerde[`PathPointType`](../pathpointtype/) EnPointF matrices. |
| [GraphicsPath](graphicspath/#constructor_4)(Point[], byte[]) | Initialiseert een nieuw exemplaar van het`GraphicsPath` klasse met de gespecificeerde[`PathPointType`](../pathpointtype/) EnPoint matrices. |
| [GraphicsPath](graphicspath/#constructor_3)(PointF[], byte[], FillMode) | Initialiseert een nieuw exemplaar van het`GraphicsPath` klasse met de gespecificeerdePathPointType EnPointF arrays en met de opgegevenFillMode opsommingselement.. |
| [GraphicsPath](graphicspath/#constructor_5)(Point[], byte[], FillMode) | Initialiseert een nieuw exemplaar van het`GraphicsPath` klasse met de gespecificeerdePathPointType EnPoint arrays en met de opgegevenFillMode opsommingselement.. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode/) { get; set; } | Hiermee wordt een FillMode-opsomming opgehaald of ingesteld die bepaalt hoe de binnenkant van vormen in dit GraphicsPath worden gevuld. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata/) { get; } | Krijgt eenPathData die hiervoor arrays van punten en typen inkapseltGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints/) { get; } | Haalt de punten in het pad op. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes/) { get; } | Haalt de typen van de corresponderende punten op in dePathPoints matrix. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount/) { get; } | Krijgt het aantal elementen in dePathPoints of dePathTypes matrix. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc_1)(RectangleF, float, float) | Voegt een elliptische boog toe aan de huidige figuur. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc)(float, float, float, float, float, float) | Voegt een elliptische boog toe aan de huidige figuur. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier_1)(PointF, PointF, PointF, PointF) | Voegt een kubieke Bézier-curve toe aan de huidige figuur. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier)(float, float, float, float, float, float, float, float) | Voegt een kubieke Bézier-curve toe aan de huidige figuur. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers)(PointF[]) | Voegt een reeks verbonden kubische Bézier-krommen toe aan de huidige figuur. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers_1)(Point[]) | Voegt een reeks verbonden kubische Bézier-krommen toe aan de huidige figuur. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve)(PointF[]) | Voegt een gesloten curve toe aan dit pad. Er wordt een kardinale spline-curve gebruikt omdat de curve door elk van de punten in de array loopt. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve_1)(PointF[], float) | Voegt een gesloten curve toe aan dit pad. Er wordt een kardinale spline-curve gebruikt omdat de curve door elk van de punten in de array loopt. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve)(PointF[]) | Voegt een spline-curve toe aan de huidige figuur. Er wordt een kardinale spline-curve gebruikt omdat de curve door elk van de punten in de array loopt. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_3)(Point[]) | Voegt een spline-curve toe aan de huidige figuur. Er wordt een kardinale spline-curve gebruikt omdat de curve door elk van de punten in de array loopt. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_2)(PointF[], float) | Voegt een spline-curve toe aan de huidige figuur. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_1)(PointF[], int, int, float) | Voegt een spline-curve toe aan de huidige figuur. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse_1)(RectangleF) | Voegt een ellips toe aan het huidige pad. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse)(float, float, float, float) | Voegt een ellips toe aan het huidige pad. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline_1)(PointF, PointF) | Voegt een lijnsegment toe aan dit GraphicsPath. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline)(float, float, float, float) | Voegt een lijnsegment toe aan dit GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines)(PointF[]) | Voegt een reeks verbonden lijnsegmenten toe aan het einde hiervanGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines_1)(Point[]) | Voegt een reeks verbonden lijnsegmenten toe aan het einde hiervanGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath/)(GraphicsPath, bool) | Voegt het gespecificeerde GraphicsPath toe aan dit pad. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie_1)(Rectangle, float, float) | Voegt de omtrek van een taartvorm toe aan dit pad. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie)(float, float, float, float, float, float) | Voegt de omtrek van een taartvorm toe aan dit pad. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon)(PointF[]) | Voegt een polygoon toe aan dit pad. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon_1)(Point[]) | Voegt een polygoon toe aan dit pad. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle)(Rectangle) | Voegt een rechthoek toe aan dit pad. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle_1)(RectangleF) | Voegt een rechthoek toe aan dit pad. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles)(RectangleF[]) | Voegt een reeks rechthoeken toe aan dit pad. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles_1)(Rectangle[]) | Voegt een reeks rechthoeken toe aan dit pad. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring)(string, FontFamily, int, float, Point, StringFormat) | Voegt een tekenreeks toe aan dit pad. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Voegt een tekenreeks toe aan dit pad. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Voegt een tekenreeks toe aan dit pad. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Voegt een tekenreeks toe aan dit pad. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone/)() | Maak een kopie van het huidige padobject. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures/)() | Sluit alle open figuren in dit pad en start een nieuwe figuur. Het sluit elke open figuur door een lijn van het eindpunt naar het beginpunt te verbinden. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure/)() | Sluit de huidige figuur en begint een nieuwe figuur. Als de huidige figuur een reeks verbonden lijnen en krommen bevat, sluit de methode de lus door een lijn te verbinden van het eindpunt naar het beginpunt. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose/)() | Geeft alle bronnen vrij die door dit GraphicsPath worden gebruikt. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten)() | Converteert elke curve in dit pad naar een reeks verbonden lijnsegmenten. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_1)(Matrix) | Past de opgegeven transformatie toe en converteert vervolgens elke curve hierinGraphicsPath . |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_2)(Matrix, float) | Converteert hierin elke krommeGraphicsPath in een reeks verbonden lijnsegmenten. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds)() | Geeft een rechthoek terug die dit begrenstGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_1)(Matrix) | Geeft een rechthoek terug die dit begrenstGraphicsPath wanneer dit pad is getransformeerd door het opgegevenMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_2)(Matrix, Pen) | Geeft een rechthoek terug die dit begrenstGraphicsPath wanneer het huidige pad is getransformeerd door het opgegevenMatrix en getekend met de opgegevenPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint/)() | Krijgt het laatste punt in de PathPoints-array hiervan`GraphicsPath` . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible/)(PointF, Pen) | Geeft aan of het gespecificeerde punt binnen (onder) de omtrek hiervan ligtGraphicsPath wanneer getekend met de opgegevenPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/)(PointF) | Geeft aan of het gespecificeerde punt hierin is opgenomenGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset/)() | Leegt de[`PathPoints`](./pathpoints/) En[`PathTypes`](./pathtypes/) arrays en stelt de[`FillMode`](../fillmode/) naarAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse/)() | Keert de volgorde van de punten in de[`PathPoints`](./pathpoints/)reeks hiervan`GraphicsPath` . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers/)() | Zet hierop een markering`GraphicsPath` . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure/)() | Start een nieuwe figuur zonder de huidige figuur te sluiten. Alle volgende punten die aan het pad worden toegevoegd, worden toegevoegd aan deze nieuwe figuur. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform/)(Matrix) | Past een transformatiematrix toe op dit GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp)(PointF[], RectangleF) | Past hierop een vervormingstransformatie toe, gedefinieerd door een rechthoek en een parallellogram`GraphicsPath` . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_1)(PointF[], RectangleF, Matrix) | Past hierop een vervormingstransformatie toe, gedefinieerd door een rechthoek en een parallellogram`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Past hierop een vervormingstransformatie toe, gedefinieerd door een rechthoek en een parallellogram`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Past hierop een vervormingstransformatie toe, gedefinieerd door een rechthoek en een parallellogram`GraphicsPath`. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen)(Pen) | Voegt een extra omtrek toe aan het pad. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_1)(Pen, Matrix) | Voegt een extra omtrek toe aan hetGraphicsPath . |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_2)(Pen, Matrix, float) | Vervangt ditGraphicsPath met curven die het gebied omsluiten dat wordt gevuld wanneer dit pad wordt getekend met de opgegeven pen. |

### Zie ook

* naamruimte [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* montage [Aspose.Drawing](../../)


