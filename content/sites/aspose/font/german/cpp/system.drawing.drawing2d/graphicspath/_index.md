---
title: "System::Drawing::Drawing2D::GraphicsPath Klasse"
linktitle: "GraphicsPath"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Drawing2D::GraphicsPath Klasse. Stellt eine Menge verbundener Linien und Kurven dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 600
url: /de/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


Stellt eine Menge verbundener Linien und Kurven dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class GraphicsPath : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | Fügt den angegebenen elliptischen Bogen zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | Fügt den angegebenen elliptischen Bogen zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | Fügt den angegebenen elliptischen Bogen zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | Fügt den angegebenen elliptischen Bogen zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | Fügt die angegebene kubische Bézierkurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | Fügt die angegebene kubische Bézierkurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | Fügt die angegebene kubische Bézierkurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | Fügt die angegebene kubische Bézierkurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | Fügt eine Sequenz verbundener kubischer Bézierkurven zur aktuellen Figur hinzu. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | Fügt eine Sequenz verbundener kubischer Bézierkurven zur aktuellen Figur hinzu. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | Fügt die angegebene geschlossene Kurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | Fügt die angegebene geschlossene Kurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | Fügt die angegebene Kurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | Fügt die angegebene Kurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | Fügt die angegebene Kurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | Fügt die angegebene Kurve zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddEllipse](./addellipse/)(float, float, float, float) | Fügt die angegebene Ellipse zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddEllipse](./addellipse/)(int, int, int, int) | Fügt die angegebene Ellipse zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | Fügt die angegebene Ellipse zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | Fügt die angegebene Ellipse zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddLine](./addline/)(const Point\&, const Point\&) | Fügt die angegebene Linie zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | Fügt die angegebene Linie zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddLine](./addline/)(int, int, int, int) | Fügt die angegebene Linie zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddLine](./addline/)(float, float, float, float) | Fügt die angegebene Linie zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | Fügt die angegebene Reihe verbundener Liniensegmente zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | Fügt die angegebene Reihe verbundener Liniensegmente zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | Fügt den angegebenen Pfad zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | Fügt die angegebene Kontur der Kuchenform zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | Fügt die angegebene Kontur der Kuchenform zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | Fügt die angegebene Kontur der Kuchenform zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | Fügt das angegebene Polygon zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | Fügt das angegebene Polygon zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | Fügt das angegebene Rechteck zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | Fügt das angegebene Rechteck zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | Fügt die angegebene Reihe von Rechtecken zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | Fügt die angegebene Reihe von Rechtecken zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | Fügt eine Textzeichenfolge zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | Fügt eine Textzeichenfolge zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | Fügt eine Textzeichenfolge zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | Fügt eine Textzeichenfolge zum Pfad hinzu, der vom aktuellen Objekt dargestellt wird. |
| virtual [Clone](./clone/)() | Erstellt eine Kopie des aktuellen Objekts. |
| [CloseAllFigures](./closeallfigures/)() | Schließt alle offenen Figuren und startet eine neue. |
| [CloseFigure](./closefigure/)() | Schließt die aktuelle Figur und startet eine neue. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [Flatten](./flatten/)() | Glättet jede Kurve im Pfad, indem sie in eine Reihe verbundener Linien umgewandelt wird. Der Glättungswert von 0,25 wird verwendet. |
| [Flatten](./flatten/)(const MatrixPtr\&) | Glättet jede Kurve im Pfad, indem sie in eine Reihe verbundener Linien umgewandelt wird. Der Glättungswert von 0,25 wird verwendet. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | Glättet jede Kurve im Pfad, indem sie in eine Reihe verbundener Linien umgewandelt wird. |
| [get_FillMode](./get_fillmode/)() | Gibt den Füllmodus des aktuellen Objekts zurück. |
| [get_PathData](./get_pathdata/)() | Gibt ein [PathData](../pathdata/) Objekt zurück, das die Punkte enthält, aus denen ein Pfad besteht, der vom aktuellen Objekt dargestellt wird, sowie deren Typen. |
| [get_PathPoints](./get_pathpoints/)() const | Gibt ein Array zurück, das die Punkte enthält, aus denen ein Pfad besteht, der vom aktuellen Objekt dargestellt wird. |
| [get_PathTypes](./get_pathtypes/)() const | Gibt ein Array zurück, das Werte enthält, die die Typen der Punkte angeben, aus denen ein Pfad besteht, der vom aktuellen Objekt dargestellt wird. |
| [get_PointCount](./get_pointcount/)() const | Gibt die Anzahl der Punkte im Pfad zurück, der vom aktuellen Objekt dargestellt wird. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | Gibt ein [RectangleF](../../system.drawing/rectanglef/)‑Objekt zurück, das ein Rechteck darstellt, das den Pfad, der vom aktuellen Objekt repräsentiert wird, begrenzt, wenn er mit der angegebenen Matrix transformiert wird. |
| [GetFigureFlags](./getfigureflags/)() | Gibt einen Wert zurück, der eine bitweise Kombination von Detail::FigureType‑Werten ist und angibt, welche Figurtypen im Pfad enthalten sind, der vom aktuellen Objekt dargestellt wird. |
| [GetLastPoint](./getlastpoint/)() const | Gibt ein [PointF](../../system.drawing/pointf/)‑Objekt zurück, das den letzten Punkt im Pfad darstellt. |
| [GraphicsPath](./graphicspath/)(FillMode) | Erstellt eine neue Instanz der Klasse [GraphicsPath](./) mit dem angegebenen Füllmodus. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Erstellt eine neue Instanz des Objekts [GraphicsPath](./), das den angegebenen Pfad darstellt. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Erstellt eine neue Instanz des Objekts [GraphicsPath](./), das den angegebenen Pfad darstellt. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | Gibt an, ob der angegebene Punkt innerhalb (unter) der Kontur dieses [GraphicsPath](./) liegt, wenn er mit dem angegebenen [Pen](../../system.drawing/pen/) gezeichnet wird. NICHT IMPLEMENTIERT. |
| [IsVisible](./isvisible/)(const PointF\&) | Bestimmt, ob der angegebene Punkt innerhalb des Pfads liegt, der vom aktuellen Objekt dargestellt wird. |
| [IsVisible](./isvisible/)(float, float) | Bestimmt, ob der angegebene Punkt innerhalb des Pfads liegt, der vom aktuellen Objekt dargestellt wird. |
| [Reset](./reset/)() | Leert den Pfad, indem alle Punkte daraus entfernt werden. |
| [Reverse](./reverse/)() | Kehrt die Reihenfolge der Punkte im PathPoints‑Array dieses [GraphicsPath](./) um. |
| [set_FillMode](./set_fillmode/)(FillMode) | Setzt den Füllmodus des aktuellen Objekts. |
| [SetMarkers](./setmarkers/)() | NICHT IMPLEMENTIERT. |
| [StartFigure](./startfigure/)() | Startet eine neue Figur. |
| [Transform](./transform/)(const MatrixPtr\&) | Transformiert den vom aktuellen Objekt dargestellten Pfad, indem die angegebene Transformationsmatrix darauf angewendet wird. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | Ersetzt diesen Pfad durch eine Kontur um den ursprünglichen Pfad. |
| [~GraphicsPath](./~graphicspath/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
