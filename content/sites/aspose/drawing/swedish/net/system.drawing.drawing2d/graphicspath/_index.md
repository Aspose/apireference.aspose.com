---
title: GraphicsPath
second_title: Aspose.Drawing för .NET API Referens
description: Representerar en serie sammankopplade linjer och kurvor.
type: docs
weight: 260
url: /sv/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Representerar en serie sammankopplade linjer och kurvor.

```csharp
public class GraphicsPath : IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | Initierar en ny instans av GraphicsPath-klassen med FillMode-värdet Alternate. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | Initierar en ny instans av[`GraphicsPath`](../graphicspath)klass med specificerad FillMode uppräkning. |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | Initierar en ny instans av[`GraphicsPath`](../graphicspath) klass med den angivna[`PathPointType`](../pathpointtype) ochPointF arrays. |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | Initierar en ny instans av[`GraphicsPath`](../graphicspath) klass med den angivna[`PathPointType`](../pathpointtype) ochPoint arrays. |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | Initierar en ny instans av[`GraphicsPath`](../graphicspath) klass med den angivnaPathPointType ochPointF matriser och med den angivnaFillMode uppräkningselement.. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | Initierar en ny instans av[`GraphicsPath`](../graphicspath) klass med den angivnaPathPointType ochPoint matriser och med den angivnaFillMode uppräkningselement.. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | Hämtar eller ställer in en FillMode-uppräkning som bestämmer hur det inre av former i denna GraphicsPath fylls. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | Får enPathData som kapslar in arrayer av punkter och typer för dettaGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | Hämtar punkterna i banan. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | Hämtar typen av motsvarande punkter iPathPoints array. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | Hämtar antalet element iPathPoints eller denPathTypes array. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | Lägger till en elliptisk båge till den aktuella figuren. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | Lägger till en elliptisk båge till den aktuella figuren. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | Lägger till en kubisk Bézier-kurva till den aktuella figuren. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | Lägger till en kubisk Bézier-kurva till den aktuella figuren. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | Lägger till en sekvens av anslutna kubiska Bézier-kurvor till den aktuella figuren. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | Lägger till en sekvens av anslutna kubiska Bézier-kurvor till den aktuella figuren. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | Lägger till en stängd kurva till denna väg. En kardinal splinekurva används eftersom kurvan går genom var och en av punkterna i arrayen. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | Lägger till en sluten kurva till denna bana. En kardinal splinekurva används eftersom kurvan går genom var och en av punkterna i arrayen. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | Lägger till en splinekurva till den aktuella figuren. En kardinal splinekurva används eftersom kurvan går genom var och en av punkterna i arrayen. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | Lägger till en splinekurva till den aktuella figuren. En kardinal splinekurva används eftersom kurvan går genom var och en av punkterna i arrayen. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | Lägger till en splinekurva till den aktuella figuren. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | Lägger till en splinekurva till den aktuella figuren. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | Lägger till en ellips till den aktuella sökvägen. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | Lägger till en ellips till den aktuella sökvägen. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | Lägger till ett linjesegment till denna GraphicsPath. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | Lägger till ett linjesegment till denna GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | Lägger till en serie anslutna linjesegment till slutet av dettaGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | Lägger till en serie anslutna linjesegment till slutet av dettaGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | Lägger till den angivna GraphicsPath till denna sökväg. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | Lägger till konturerna av en pajform till den här banan. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | Lägger till konturerna av en pajform till den här banan. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | Lägger till en polygon till denna sökväg. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | Lägger till en polygon till denna sökväg. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | Lägger till en rektangel till den här banan. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | Lägger till en rektangel till den här banan. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | Lägger till en serie rektanglar till den här banan. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | Lägger till en serie rektanglar till den här banan. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | Lägger till en textsträng till denna sökväg. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Lägger till en textsträng till denna sökväg. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Lägger till en textsträng till denna sökväg. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Lägger till en textsträng till denna sökväg. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | Gör en kopia av det aktuella sökvägsobjektet. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | Stänger alla öppna figurer i denna sökväg och startar en ny figur. Den stänger varje öppen figur genom att ansluta en linje från dess slutpunkt till dess startpunkt. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | Stänger den aktuella figuren och startar en ny figur. Om den aktuella figuren innehåller en sekvens av sammankopplade linjer och kurvor, stänger metoden slingan genom att ansluta en linje från slutpunkten till startpunkten. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | Frigör alla resurser som används av denna GraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | Konverterar varje kurva i denna väg till en sekvens av anslutna linjesegment. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | Returnerar en rektangel som begränsar dettaGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | Returnerar en rektangel som begränsar dettaGraphicsPath när denna sökväg är omvandlas av den angivnaMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | Returnerar en rektangel som begränsar dettaGraphicsPath när den aktuella sökvägen transformeras av den angivnaMatrix och ritas med det angivnaPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | Får den sista punkten i PathPoints-matrisen för detta[`GraphicsPath`](../graphicspath) . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | Indikerar om den angivna punkten finns inom (under) konturen av dennaGraphicsPath när det dras med det angivnaPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | Indikerar om den angivna punkten finns i dennaGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | Tömmar[`PathPoints`](./pathpoints) och[`PathTypes`](./pathtypes)arrays och ställer in[`FillMode`](../fillmode) tillAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | Vänder om ordningen på punkterna i[`PathPoints`](./pathpoints) rad av detta[`GraphicsPath`](../graphicspath) . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | Sätter en markör på detta[`GraphicsPath`](../graphicspath) . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | Startar en ny figur utan att stänga den nuvarande figuren. Alla efterföljande punkter som läggs till i sökvägen läggs till i denna nya figur. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | Tillämpar en transformationsmatris på denna GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | Tillämpar en varptransform, definierad av en rektangel och ett parallellogram, på detta[`GraphicsPath`](../graphicspath) . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | Tillämpar en varptransform, definierad av en rektangel och ett parallellogram, på detta[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Tillämpar en varptransform, definierad av en rektangel och ett parallellogram, på detta[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Tillämpar en varptransform, definierad av en rektangel och ett parallellogram, på detta[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | Lägger till en ytterligare kontur till sökvägen. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | Ersätter dettaGraphicsPath med kurvor som omsluter området som fylls när denna väg ritas av den angivna pennan. |

### Se även

* namnutrymme [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
