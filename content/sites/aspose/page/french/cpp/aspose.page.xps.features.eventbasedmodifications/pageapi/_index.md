---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI classe"
linktitle: "PageAPI"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI classe. L'API de modification d'élément Page en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


L'**[Page](../../aspose.page/)** API de modification d'élément.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(T) | Ajoute un élément de contenu (Canvas, Path ou Glyphs). |
| [AddCanvas](./addcanvas/)() | Ajoute un nouveau canvas à la page. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Ajoute de nouveaux glyphs à la page. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Ajoute de nouveaux glyphs à la page. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Ajoute une entrée d'outline au document. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Ajoute un nouveau chemin à la page. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Crée un nouveau segment d'arc elliptique. |
| [CreateCanvas](./createcanvas/)() | Crée un nouveau canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Crée une nouvelle couleur. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Crée une nouvelle couleur dans l'espace colorimétrique sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Crée une nouvelle couleur dans l'espace colorimétrique sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Crée une nouvelle couleur dans l'espace colorimétrique scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Crée une nouvelle couleur dans l'espace colorimétrique scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Crée une nouvelle couleur dans un espace colorimétrique basé sur ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Crée une nouvelle couleur dans un espace colorimétrique basé sur ICC. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Crée de nouveaux glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Crée de nouveaux glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Crée un nouveau point d'arrêt de dégradé. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Crée un nouveau point d'arrêt de dégradé. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crée un nouveau pinceau d'image. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crée un nouveau pinceau d'image. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Crée un nouveau pinceau de dégradé linéaire. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Crée un nouveau pinceau de dégradé linéaire. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Crée une nouvelle matrice de transformation affine. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Crée un nouveau chemin. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Crée une nouvelle figure de chemin. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Crée une nouvelle figure de chemin. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Crée une nouvelle géométrie de chemin spécifiée sous forme abrégée. |
| [CreatePathGeometry](./createpathgeometry/)() | Crée une nouvelle géométrie de chemin. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Crée une nouvelle géométrie de chemin avec une liste spécifiée de figures de chemin. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crée un nouvel ensemble de courbes de Bézier cubiques. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crée un nouveau dessin polygonal contenant un nombre arbitraire de sommets individuels. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crée un nouvel ensemble de courbes de Bézier quadratiques depuis le point précédent dans la figure de chemin à travers un ensemble de sommets, en utilisant des points de contrôle spécifiés. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Crée un nouveau pinceau de dégradé radial. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Crée un nouveau pinceau de dégradé radial. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Crée un nouveau pinceau de couleur unie. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Crée un nouveau pinceau de couleur unie. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crée un nouveau pinceau visuel. |
| [get_Height](./get_height/)() | Renvoie/definit la hauteur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif. |
| [get_PageCount](./get_pagecount/)() | Renvoie le nombre de pages dans le document actif. |
| [get_TotalPageCount](./get_totalpagecount/)() | Renvoie le nombre total de pages dans tous les documents à l'intérieur du document [XPS](../../aspose.page.xps/). |
| [get_Utils](./get_utils/)() | Obtient l'objet qui fournit des utilitaires au-delà de l'API de manipulation formelle du [XPS](../../aspose.page.xps/). |
| [get_Width](./get_width/)() | Renvoie/definit la largeur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif. |
| [Insert](./insert/)(int32_t, T) | Insère un élément (Canvas, Path ou Glyphs) dans la page à la position *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Insère un nouveau canvas dans la page à la position *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Insère de nouveaux glyphs dans la page à la position *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Insère de nouveaux glyphs dans la page à la position *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Insère un nouveau chemin dans la page à la position *index*. |
| [Remove](./remove/)(T) | Supprime un élément de la page. |
| [RemoveAt](./removeat/)(int32_t) | Supprime un élément à la position *index* de la page. |
| [set_Height](./set_height/)(float) | Renvoie/definit la hauteur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif. |
| [set_Width](./set_width/)(float) | Renvoie/definit la largeur de la page, exprimée comme un nombre réel dans les unités de l'espace de coordonnées effectif. |
## Voir aussi

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
