---
title: "System::Drawing::Drawing2D::GraphicsPath klasse"
linktitle: "GraphicsPath"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Drawing2D::GraphicsPath klasse. Vertegenwoordigt een verzameling van verbonden lijnen en curven. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


Vertegenwoordigt een verzameling van verbonden lijnen en curven. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class GraphicsPath : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | Voegt de opgegeven elliptische boog toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | Voegt de opgegeven elliptische boog toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | Voegt de opgegeven elliptische boog toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | Voegt de opgegeven elliptische boog toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | Voegt de opgegeven kubieke Bezier-curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | Voegt de opgegeven kubieke Bezier-curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | Voegt de opgegeven kubieke Bezier-curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | Voegt de opgegeven kubieke Bezier-curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | Voegt een reeks van verbonden kubieke Bezier-curves toe aan de huidige figuur. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | Voegt een reeks van verbonden kubieke Bezier-curves toe aan de huidige figuur. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | Voegt de opgegeven gesloten curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | Voegt de opgegeven gesloten curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | Voegt de opgegeven curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | Voegt de opgegeven curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | Voegt de opgegeven curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | Voegt de opgegeven curve toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddEllipse](./addellipse/)(float, float, float, float) | Voegt de opgegeven ellips toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddEllipse](./addellipse/)(int, int, int, int) | Voegt de opgegeven ellips toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | Voegt de opgegeven ellips toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | Voegt de opgegeven ellips toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddLine](./addline/)(const Point\&, const Point\&) | Voegt de opgegeven lijn toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | Voegt de opgegeven lijn toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddLine](./addline/)(int, int, int, int) | Voegt de opgegeven lijn toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddLine](./addline/)(float, float, float, float) | Voegt de opgegeven lijn toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | Voegt de opgegeven reeks van verbonden lijnsegmenten toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | Voegt de opgegeven reeks van verbonden lijnsegmenten toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | Voegt het opgegeven pad toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | Voegt de opgegeven omtrek van de taartvorm toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | Voegt de opgegeven omtrek van de taartvorm toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | Voegt de opgegeven omtrek van de taartvorm toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | Voegt het opgegeven polygon toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | Voegt het opgegeven polygon toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | Voegt de opgegeven rechthoek toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | Voegt de opgegeven rechthoek toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | Voegt de opgegeven reeks van rechthoeken toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | Voegt de opgegeven reeks van rechthoeken toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | Voegt een tekenreeks tekst toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | Voegt een tekenreeks tekst toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | Voegt een tekenreeks tekst toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | Voegt een tekenreeks tekst toe aan het pad dat wordt vertegenwoordigd door het huidige object. |
| virtual [Clone](./clone/)() | Maakt een kopie van het huidige object. |
| [CloseAllFigures](./closeallfigures/)() | Sluit alle open figuren en start een nieuwe. |
| [CloseFigure](./closefigure/)() | Sluit de huidige figuur en start een nieuwe. |
| [Dispose](./dispose/)() | Geeft alle door het huidige object verworven besturingssysteembronnen vrij. |
| [Flatten](./flatten/)() | Vlak maakt elke curve in het pad door ze om te zetten in een reeks verbonden lijnen. De vlakheidswaarde van 0.25 wordt gebruikt. |
| [Flatten](./flatten/)(const MatrixPtr\&) | Vlak maakt elke curve in het pad door ze om te zetten in een reeks verbonden lijnen. De vlakheidswaarde van 0.25 wordt gebruikt. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | Vlak maakt elke curve in het pad door ze om te zetten in een reeks verbonden lijnen. |
| [get_FillMode](./get_fillmode/)() | Retourneert de vulmodus van het huidige object. |
| [get_PathData](./get_pathdata/)() | Retourneert een [PathData](../pathdata/) object dat de punten bevat die een pad vormen dat wordt weergegeven door het huidige object en hun types. |
| [get_PathPoints](./get_pathpoints/)() const | Retourneert een array die de punten bevat die een pad vormen dat wordt weergegeven door het huidige object. |
| [get_PathTypes](./get_pathtypes/)() const | Retourneert een array die waarden bevat die de types van de punten aangeven die een pad vormen dat wordt weergegeven door het huidige object. |
| [get_PointCount](./get_pointcount/)() const | Retourneert het aantal punten in het pad dat wordt weergegeven door het huidige object. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | Retourneert een [RectangleF](../../system.drawing/rectanglef/) object dat een rechthoek weergeeft die het pad omsluit dat wordt weergegeven door het huidige object wanneer het wordt getransformeerd met de opgegeven matrix. |
| [GetFigureFlags](./getfigureflags/)() | Retourneert een waarde die een bitwise combinatie is van Detail::FigureType-waarden die aangeven welke soorten figuren zich bevinden binnen het pad dat wordt weergegeven door het huidige object. |
| [GetLastPoint](./getlastpoint/)() const | Retourneert een [PointF](../../system.drawing/pointf/) object dat het laatste punt in het pad weergeeft. |
| [GraphicsPath](./graphicspath/)(FillMode) | Construeert een nieuw exemplaar van de [GraphicsPath](./) klasse met de opgegeven vulmodus. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Construeert een nieuw exemplaar van het [GraphicsPath](./) object dat het opgegeven pad weergeeft. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Construeert een nieuw exemplaar van het [GraphicsPath](./) object dat het opgegeven pad weergeeft. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | Geeft aan of het opgegeven punt zich bevindt binnen (onder) de omtrek van deze [GraphicsPath](./) wanneer getekend met de opgegeven [Pen](../../system.drawing/pen/). NIET GEREALISEERD. |
| [IsVisible](./isvisible/)(const PointF\&) | Bepaalt of het opgegeven punt zich bevindt binnen het pad dat wordt weergegeven door het huidige object. |
| [IsVisible](./isvisible/)(float, float) | Bepaalt of het opgegeven punt zich bevindt binnen het pad dat wordt weergegeven door het huidige object. |
| [Reset](./reset/)() | Leegt het pad door alle punten ervan te verwijderen. |
| [Reverse](./reverse/)() | Keert de volgorde van punten in de PathPoints-array van deze [GraphicsPath](./) om. |
| [set_FillMode](./set_fillmode/)(FillMode) | Stelt de vulmodus van het huidige object in. |
| [SetMarkers](./setmarkers/)() | NOG NIET GEÏMPLENTEERD. |
| [StartFigure](./startfigure/)() | Start een nieuwe figuur. |
| [Transform](./transform/)(const MatrixPtr\&) | Transformeert het pad dat wordt weergegeven door het huidige object door de opgegeven transformatiematrix erop toe te passen. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | Vervangt dit pad door een omtrek rond het oorspronkelijke pad. |
| [~GraphicsPath](./~graphicspath/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
