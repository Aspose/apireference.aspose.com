---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI classe"
linktitle: "PageAPI"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI classe. L'API di modifica dell'elemento Page in C++."
type: docs
weight: 500
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


L'API di modifica dell'elemento **[Page](../../aspose.page/)**.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(T) | Aggiunge un elemento di contenuto (Canvas, Path o Glyphs). |
| [AddCanvas](./addcanvas/)() | Aggiunge una nuova canvas alla pagina. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Aggiunge nuovi glyphs alla pagina. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Aggiunge nuovi glyphs alla pagina. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Aggiunge una voce di outline al documento. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Aggiunge un nuovo path alla pagina. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Crea un nuovo segmento di arco ellittico. |
| [CreateCanvas](./createcanvas/)() | Crea una nuova canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Crea un nuovo colore. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Crea un nuovo colore nello spazio colore sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Crea un nuovo colore nello spazio colore sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Crea un nuovo colore nello spazio colore scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Crea un nuovo colore nello spazio colore scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Crea un nuovo colore in uno spazio colore basato su ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Crea un nuovo colore in uno spazio colore basato su ICC. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Crea nuovi glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Crea nuovi glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Crea una nuova fermata di gradiente. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Crea una nuova fermata di gradiente. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea un nuovo pennello immagine. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea un nuovo pennello immagine. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Crea un nuovo pennello a gradiente lineare. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Crea un nuovo pennello a gradiente lineare. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Crea una nuova matrice di trasformazione affine. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Crea un nuovo percorso. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Crea una nuova figura di percorso. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Crea una nuova figura di percorso. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Crea una nuova geometria di percorso specificata in forma abbreviata. |
| [CreatePathGeometry](./createpathgeometry/)() | Crea una nuova geometria di percorso. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Crea una nuova geometria di percorso con l'elenco specificato di figure di percorso. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuovo insieme di curve Bézier cubiche. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuovo disegno poligonale contenente un numero arbitrario di vertici individuali. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuovo insieme di curve Bézier quadratiche dal punto precedente nella figura di percorso attraverso un insieme di vertici, usando i punti di controllo specificati. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Crea un nuovo pennello a gradiente radiale. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Crea un nuovo pennello a gradiente radiale. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Crea un nuovo pennello a colore solido. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Crea un nuovo pennello a colore solido. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea un nuovo pennello visivo. |
| [get_Height](./get_height/)() | Restituisce/imposta l'altezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo. |
| [get_PageCount](./get_pagecount/)() | Restituisce il numero di pagine nel documento attivo. |
| [get_TotalPageCount](./get_totalpagecount/)() | Restituisce il numero totale di pagine in tutti i documenti all'interno del documento [XPS](../../aspose.page.xps/). |
| [get_Utils](./get_utils/)() | Ottiene l'oggetto che fornisce utilità oltre l'API formale di manipolazione [XPS](../../aspose.page.xps/). |
| [get_Width](./get_width/)() | Restituisce/imposta la larghezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo. |
| [Insert](./insert/)(int32_t, T) | Inserisce un elemento (Canvas, Path o Glyphs) nella pagina alla posizione *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserisce un nuovo canvas nella pagina alla posizione *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserisce nuovi glyphs nella pagina alla posizione *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Inserisce nuovi glyphs nella pagina alla posizione *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Inserisce un nuovo percorso nella pagina alla posizione *index*. |
| [Remove](./remove/)(T) | Rimuove un elemento dalla pagina. |
| [RemoveAt](./removeat/)(int32_t) | Rimuove un elemento alla posizione *index* dalla pagina. |
| [set_Height](./set_height/)(float) | Restituisce/imposta l'altezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo. |
| [set_Width](./set_width/)(float) | Restituisce/imposta la larghezza della pagina, espressa come numero reale nelle unità dello spazio di coordinate effettivo. |
## Vedi anche

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
