---
title: GraphicsPath
second_title: Aspose.Drawing für .NET-API-Referenz
description: Stellt eine Reihe verbundener Linien und Kurven dar.
type: docs
weight: 260
url: /de/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Stellt eine Reihe verbundener Linien und Kurven dar.

```csharp
public class GraphicsPath : IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | Initialisiert eine neue Instanz der GraphicsPath-Klasse mit einem FillMode-Wert von Alternate. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | Initialisiert eine neue Instanz von[`GraphicsPath`](../graphicspath)Klasse mit dem angegebenen FillMode Aufzählung. |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | Initialisiert eine neue Instanz von[`GraphicsPath`](../graphicspath) Klasse mit den angegebenen[`PathPointType`](../pathpointtype) undPointF Arrays. |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | Initialisiert eine neue Instanz von[`GraphicsPath`](../graphicspath) Klasse mit den angegebenen[`PathPointType`](../pathpointtype) undPoint Arrays. |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | Initialisiert eine neue Instanz von[`GraphicsPath`](../graphicspath) Klasse mit den angegebenenPathPointType undPointF Arrays und mit den angegebenenFillMode Aufzählungselement.. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | Initialisiert eine neue Instanz von[`GraphicsPath`](../graphicspath) Klasse mit den angegebenenPathPointType undPoint Arrays und mit den angegebenenFillMode Aufzählungselement.. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | Ruft eine FillMode-Enumeration ab oder legt diese fest, die bestimmt, wie das Innere von Formen in diesem GraphicsPath gefüllt wird. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | erhält aPathData das dafür Arrays von Punkten und Typen kapseltGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | Ruft die Punkte im Pfad ab. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | Ruft die Typen der entsprechenden Punkte in der abPathPoints array. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | Ruft die Anzahl der Elemente in der abPathPoints oder derPathTypes array. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | Hängt einen Ellipsenbogen an die aktuelle Figur an. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | Hängt einen Ellipsenbogen an die aktuelle Figur an. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | Fügt der aktuellen Figur eine kubische Bézier-Kurve hinzu. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | Fügt der aktuellen Figur eine kubische Bézier-Kurve hinzu. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | Fügt der aktuellen Figur eine Folge verbundener kubischer Bézier-Kurven hinzu. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | Fügt der aktuellen Figur eine Folge verbundener kubischer Bézier-Kurven hinzu. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | Fügt diesem Pfad eine geschlossene Kurve hinzu. Eine kardinale Spline-Kurve wird verwendet, da die Kurve durch jeden der Punkte im Array verläuft. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | Fügt diesem Pfad eine geschlossene Kurve hinzu. Es wird eine kardinale Spline-Kurve verwendet, da die Kurve durch jeden der Punkte im Array verläuft. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | Fügt der aktuellen Figur eine Spline-Kurve hinzu. Eine kardinale Spline-Kurve wird verwendet, da die Kurve durch jeden der Punkte im Array verläuft. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | Fügt der aktuellen Figur eine Spline-Kurve hinzu. Eine kardinale Spline-Kurve wird verwendet, da die Kurve durch jeden der Punkte im Array verläuft. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | Fügt der aktuellen Figur eine Spline-Kurve hinzu. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | Fügt der aktuellen Figur eine Spline-Kurve hinzu. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | Fügt dem aktuellen Pfad eine Ellipse hinzu. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | Fügt dem aktuellen Pfad eine Ellipse hinzu. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | Hängt ein Liniensegment an diesen GraphicsPath an. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | Hängt ein Liniensegment an diesen GraphicsPath an. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | Hängt eine Reihe verbundener Liniensegmente an das Ende davon anGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | Hängt eine Reihe verbundener Liniensegmente an das Ende davon anGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | Hängt den angegebenen GraphicsPath an diesen Pfad an. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | Fügt diesem Pfad den Umriss einer Tortenform hinzu. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | Fügt diesem Pfad den Umriss einer Tortenform hinzu. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | Fügt diesem Pfad ein Polygon hinzu. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | Fügt diesem Pfad ein Polygon hinzu. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | Fügt diesem Pfad ein Rechteck hinzu. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | Fügt diesem Pfad ein Rechteck hinzu. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | Fügt diesem Pfad eine Reihe von Rechtecken hinzu. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | Fügt diesem Pfad eine Reihe von Rechtecken hinzu. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | Fügt diesem Pfad eine Textzeichenfolge hinzu. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Fügt diesem Pfad eine Textzeichenfolge hinzu. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Fügt diesem Pfad eine Textzeichenfolge hinzu. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Fügt diesem Pfad eine Textzeichenfolge hinzu. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | Erstellt eine Kopie des aktuellen Pfadobjekts. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | Schließt alle offenen Figuren in diesem Pfad und beginnt eine neue Figur. Es schließt jede offene Figur, indem es eine Linie von seinem Endpunkt zu seinem Startpunkt verbindet. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | Schließt die aktuelle Figur und beginnt eine neue Figur. Wenn die aktuelle Figur eine Folge verbundener Linien und Kurven enthält, schließt die Methode die Schleife, indem sie eine Linie vom Endpunkt zum Startpunkt verbindet. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | Gibt alle von diesem GraphicsPath verwendeten Ressourcen frei. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | Konvertiert jede Kurve in diesem Pfad in eine Folge verbundener Liniensegmente. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | Gibt ein Rechteck zurück, das dies begrenztGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | Gibt ein Rechteck zurück, das dies begrenztGraphicsPath wenn dieser Pfad durch die angegebenen transformiert wirdMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | Gibt ein Rechteck zurück, das dies begrenztGraphicsPath wenn der aktuelle Pfad is durch den angegebenen transformiert wirdMatrix und mit den angegebenen gezeichnetPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | Ruft den letzten Punkt im PathPoints-Array davon ab[`GraphicsPath`](../graphicspath) . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | Gibt an, ob der angegebene Punkt innerhalb (unter) der Umrisslinie davon enthalten istGraphicsPath wenn mit den angegebenen gezeichnetPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | Gibt an, ob der angegebene Punkt darin enthalten istGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | Leert die[`PathPoints`](./pathpoints) und[`PathTypes`](./pathtypes)arrays und setzt die[`FillMode`](../fillmode) zuAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | Kehrt die Reihenfolge der Punkte in um[`PathPoints`](./pathpoints) Reihe davon[`GraphicsPath`](../graphicspath) . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | Setzt einen Marker darauf[`GraphicsPath`](../graphicspath) . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | Beginnt eine neue Figur, ohne die aktuelle Figur zu schließen. Alle nachfolgenden Punkte, die dem Pfad hinzugefügt werden, werden dieser neuen Figur hinzugefügt. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | Wendet eine Transformationsmatrix auf diesen GraphicsPath an. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | Wendet eine durch ein Rechteck und ein Parallelogramm definierte Warp-Transformation darauf an[`GraphicsPath`](../graphicspath) . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | Wendet darauf eine durch ein Rechteck und ein Parallelogramm definierte Warp-Transformation an[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Wendet darauf eine durch ein Rechteck und ein Parallelogramm definierte Warp-Transformation an[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Wendet darauf eine durch ein Rechteck und ein Parallelogramm definierte Warp-Transformation an[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | Fügt dem Pfad eine zusätzliche Kontur hinzu. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | Ersetzt diesGraphicsPath mit Kurven, die den Bereich umschließen, der gefüllt wird, wenn dieser Pfad mit dem angegebenen Stift gezeichnet wird. |

### Siehe auch

* namensraum [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
