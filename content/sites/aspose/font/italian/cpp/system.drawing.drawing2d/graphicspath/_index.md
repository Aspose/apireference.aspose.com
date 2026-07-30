---
title: "classe System::Drawing::Drawing2D::GraphicsPath"
linktitle: "GraphicsPath"
second_title: "Aspose.Font per C++"
description: "classe System::Drawing::Drawing2D::GraphicsPath. Rappresenta un insieme di linee e curve collegate. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


Rappresenta un insieme di linee e curve collegate. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class GraphicsPath : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | Aggiunge l'arco ellittico specificato al percorso rappresentato dall'oggetto corrente. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | Aggiunge l'arco ellittico specificato al percorso rappresentato dall'oggetto corrente. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | Aggiunge l'arco ellittico specificato al percorso rappresentato dall'oggetto corrente. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | Aggiunge l'arco ellittico specificato al percorso rappresentato dall'oggetto corrente. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | Aggiunge la curva cubica di Bezier specificata al percorso rappresentato dall'oggetto corrente. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | Aggiunge la curva cubica di Bezier specificata al percorso rappresentato dall'oggetto corrente. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | Aggiunge la curva cubica di Bezier specificata al percorso rappresentato dall'oggetto corrente. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | Aggiunge la curva cubica di Bezier specificata al percorso rappresentato dall'oggetto corrente. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | Aggiunge una sequenza di curve cubiche di Bezier collegate alla figura corrente. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | Aggiunge una sequenza di curve cubiche di Bezier collegate alla figura corrente. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | Aggiunge la curva chiusa specificata al percorso rappresentato dall'oggetto corrente. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | Aggiunge la curva chiusa specificata al percorso rappresentato dall'oggetto corrente. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | Aggiunge la curva specificata al percorso rappresentato dall'oggetto corrente. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | Aggiunge la curva specificata al percorso rappresentato dall'oggetto corrente. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | Aggiunge la curva specificata al percorso rappresentato dall'oggetto corrente. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | Aggiunge la curva specificata al percorso rappresentato dall'oggetto corrente. |
| [AddEllipse](./addellipse/)(float, float, float, float) | Aggiunge l'ellisse specificata al percorso rappresentato dall'oggetto corrente. |
| [AddEllipse](./addellipse/)(int, int, int, int) | Aggiunge l'ellisse specificata al percorso rappresentato dall'oggetto corrente. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | Aggiunge l'ellisse specificata al percorso rappresentato dall'oggetto corrente. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | Aggiunge l'ellisse specificata al percorso rappresentato dall'oggetto corrente. |
| [AddLine](./addline/)(const Point\&, const Point\&) | Aggiunge la linea specificata al percorso rappresentato dall'oggetto corrente. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | Aggiunge la linea specificata al percorso rappresentato dall'oggetto corrente. |
| [AddLine](./addline/)(int, int, int, int) | Aggiunge la linea specificata al percorso rappresentato dall'oggetto corrente. |
| [AddLine](./addline/)(float, float, float, float) | Aggiunge la linea specificata al percorso rappresentato dall'oggetto corrente. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | Aggiunge la serie specificata di segmenti di linea collegati al percorso rappresentato dall'oggetto corrente. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | Aggiunge la serie specificata di segmenti di linea collegati al percorso rappresentato dall'oggetto corrente. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | Aggiunge il percorso specificato al percorso rappresentato dall'oggetto corrente. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | Aggiunge il contorno specificato della forma a torta al percorso rappresentato dall'oggetto corrente. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | Aggiunge il contorno specificato della forma a torta al percorso rappresentato dall'oggetto corrente. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | Aggiunge il contorno specificato della forma a torta al percorso rappresentato dall'oggetto corrente. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | Aggiunge il poligono specificato al percorso rappresentato dall'oggetto corrente. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | Aggiunge il poligono specificato al percorso rappresentato dall'oggetto corrente. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | Aggiunge il rettangolo specificato al percorso rappresentato dall'oggetto corrente. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | Aggiunge il rettangolo specificato al percorso rappresentato dall'oggetto corrente. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | Aggiunge la serie specificata di rettangoli al percorso rappresentato dall'oggetto corrente. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | Aggiunge la serie specificata di rettangoli al percorso rappresentato dall'oggetto corrente. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | Aggiunge una stringa di testo al percorso rappresentato dall'oggetto corrente. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | Aggiunge una stringa di testo al percorso rappresentato dall'oggetto corrente. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | Aggiunge una stringa di testo al percorso rappresentato dall'oggetto corrente. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | Aggiunge una stringa di testo al percorso rappresentato dall'oggetto corrente. |
| virtual [Clone](./clone/)() | Crea una copia dell'oggetto corrente. |
| [CloseAllFigures](./closeallfigures/)() | Chiude tutte le figure aperte e ne avvia una nuova. |
| [CloseFigure](./closefigure/)() | Chiude la figura corrente e ne avvia una nuova. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [Flatten](./flatten/)() | Appiattisce ogni curva nel percorso convertendola in una serie di linee collegate. Viene utilizzato il valore di appiattimento di 0,25. |
| [Flatten](./flatten/)(const MatrixPtr\&) | Appiattisce ogni curva nel percorso convertendola in una serie di linee collegate. Viene utilizzato il valore di appiattimento di 0,25. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | Appiattisce ogni curva nel percorso convertendola in una serie di linee collegate. |
| [get_FillMode](./get_fillmode/)() | Restituisce la modalità di riempimento dell'oggetto corrente. |
| [get_PathData](./get_pathdata/)() | Restituisce un oggetto [PathData](../pathdata/) contenente i punti che compongono un percorso rappresentato dall'oggetto corrente e i loro tipi. |
| [get_PathPoints](./get_pathpoints/)() const | Restituisce un array che contiene i punti che compongono un percorso rappresentato dall'oggetto corrente. |
| [get_PathTypes](./get_pathtypes/)() const | Restituisce un array che contiene valori che indicano i tipi dei punti che compongono un percorso rappresentato dall'oggetto corrente. |
| [get_PointCount](./get_pointcount/)() const | Restituisce il numero di punti nel percorso rappresentato dall'oggetto corrente. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | Restituisce un oggetto [RectangleF](../../system.drawing/rectanglef/) che rappresenta un rettangolo che delimita il percorso rappresentato dall'oggetto corrente quando viene trasformato con la matrice specificata. |
| [GetFigureFlags](./getfigureflags/)() | Restituisce un valore che è una combinazione bitwise dei valori Detail::FigureType che indica quali tipi di figure sono contenuti nel percorso rappresentato dall'oggetto corrente. |
| [GetLastPoint](./getlastpoint/)() const | Restituisce un oggetto [PointF](../../system.drawing/pointf/) che rappresenta l'ultimo punto del percorso. |
| [GraphicsPath](./graphicspath/)(FillMode) | Crea una nuova istanza della classe [GraphicsPath](./) con la modalità di riempimento specificata. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Crea una nuova istanza dell'oggetto [GraphicsPath](./) che rappresenta il percorso specificato. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Crea una nuova istanza dell'oggetto [GraphicsPath](./) che rappresenta il percorso specificato. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | Indica se il punto specificato è contenuto (sotto) il contorno di questo [GraphicsPath](./) quando disegnato con la [Pen](../../system.drawing/pen/) specificata. NON IMPLEMENTATO. |
| [IsVisible](./isvisible/)(const PointF\&) | Determina se il punto specificato è contenuto nel percorso rappresentato dall'oggetto corrente. |
| [IsVisible](./isvisible/)(float, float) | Determina se il punto specificato è contenuto nel percorso rappresentato dall'oggetto corrente. |
| [Reset](./reset/)() | Svuota il percorso rimuovendo tutti i punti. |
| [Reverse](./reverse/)() | Inverte l'ordine dei punti nell'array PathPoints di questo [GraphicsPath](./). |
| [set_FillMode](./set_fillmode/)(FillMode) | Imposta la modalità di riempimento dell'oggetto corrente. |
| [SetMarkers](./setmarkers/)() | NON IMPLEMENTATO. |
| [StartFigure](./startfigure/)() | Avvia una nuova figura. |
| [Transform](./transform/)(const MatrixPtr\&) | Trasforma il percorso rappresentato dall'oggetto corrente applicando la matrice di trasformazione specificata. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | Sostituisce questo percorso con un contorno attorno al percorso originale. |
| [~GraphicsPath](./~graphicspath/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
