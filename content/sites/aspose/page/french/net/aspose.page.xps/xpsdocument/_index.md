---
title: Class XpsDocument
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsDocument classe. Classe encapsulant lentité principale du document XPS qui fournit des méthodes de manipulation pour tout élément XPS.
type: docs
weight: 480
url: /fr/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Classe encapsulant l'entité principale du document XPS qui fournit des méthodes de manipulation pour tout élément XPS.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Crée un document XPS vide avec la taille de page par défaut. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | Ouvre un document XPS existant situé à l'emplacement*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | Charge un document existant stocké dans le*stream* comme document XPS. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | Ouvre un document existant situé à la*path* comme document XPS. |

## Propriétés

| Nom | La description |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Obtient le numéro de document actif. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Obtient le numéro de page active dans le document actif. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | Renvoie le nombre de documents dans le package XPS. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Renvoie/définit le ticket d'impression du travail du document |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | Renvoie un[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) instance pour la page active. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Renvoie le nombre de pages du document actif. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | Renvoie le nombre total de pages dans tous les documents à l'intérieur du document XPS. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Ajoute un élément de contenu (Canevas, Chemin ou Glyphes) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Ajoute un nouveau canevas à la page active. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Ajoute un document vide avec la taille de page par défaut. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | Ajoute un document vide avec les dimensions de la première page *width* et*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Ajoute de nouveaux glyphes à la page active. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Ajoute de nouveaux glyphes à la page active. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Ajoute une entrée de plan au document. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Ajoute une page vide au document avec la taille de page par défaut. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Ajoute une page au document. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Ajoute une page vide au document avec spécifié*width* et*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Ajoute un nouveau chemin vers la page active. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Crée un nouveau segment d'arc elliptique. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Crée un nouveau canevas. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Crée une nouvelle couleur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | Crée une nouvelle couleur dans l'espace colorimétrique basé sur ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | Crée une nouvelle couleur dans l'espace colorimétrique basé sur ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | Crée une nouvelle couleur dans l'espace colorimétrique scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | Crée une nouvelle couleur dans l'espace colorimétrique sRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | Crée une nouvelle couleur dans l'espace colorimétrique scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | Crée une nouvelle couleur dans l'espace colorimétrique sRGB. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Crée une nouvelle ressource de police TrueType hors flux. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Crée une nouvelle ressource de police TrueType. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Crée de nouveaux glyphes. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Crée de nouveaux glyphes. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Crée un nouvel arrêt de dégradé. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Crée un nouvel arrêt de dégradé. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Crée une nouvelle ressource de profil ICC à partir de*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | Crée une nouvelle ressource de profil ICC à partir du fichier de profil ICC situé à la *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Crée une nouvelle ressource d'image à partir de*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | Crée une nouvelle ressource image à partir du fichier image situé à l'emplacement*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Crée un nouveau pinceau d'image. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Crée un nouveau pinceau d'image. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Crée un nouveau pinceau dégradé linéaire. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Crée un nouveau pinceau dégradé linéaire. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Crée une nouvelle matrice de transformation affine. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Crée un nouveau chemin. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Crée une nouvelle figure de chemin. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Crée une nouvelle figure de chemin. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Crée une nouvelle géométrie de chemin. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Crée une nouvelle géométrie de chemin avec une liste spécifiée de figures de chemin. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Crée une nouvelle géométrie de chemin spécifiée avec une forme abrégée. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Crée un nouvel ensemble de courbes de Bézier cubiques. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | Crée un nouveau dessin polygonal contenant un nombre arbitraire de sommets individuels. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Crée un nouvel ensemble de courbes de Bézier quadratiques à partir du point précédent dans la figure du chemin à travers un ensemble de sommets, en utilisant des points de contrôle spécifiés. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Crée un nouveau pinceau dégradé radial. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Crée un nouveau pinceau dégradé radial. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Crée un nouveau pinceau de couleur unie. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Crée un nouveau pinceau de couleur unie. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Crée un nouveau pinceau visuel. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Supprime l'instance. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | Renvoie le ticket d'impression du document indexé par*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | Renvoie le ticket d'impression de la page indexée par*pageIndex* dans le document indexé par*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Insère un élément (Canevas, Chemin ou Glyphes) dans la page active à*index* position. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | Insère un nouveau canevas dans la page active à*index* position. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Insère un document vide avec la taille de page par défaut à*index* position. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | Insère un document vide avec les dimensions de la première page *width* et*height* à*index* position. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Insère de nouveaux glyphes dans la page active à*index* position. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Insère de nouveaux glyphes dans la page active à*index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Insère une page vide dans le document avec la taille de page par défaut à*index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | Insère une page dans le document à*index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Insère une page vide dans le document avec spécifié*width* et*height* à*index* position. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | Insère un nouveau chemin vers la page active à*index* position. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Fusion de plusieurs fichiers XPS en un seul document XPS. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | Fusion de documents XPS en PDF à l'aide de[`Device`](../../aspose.page/device/) instance. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Supprime un élément de la page active. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Supprime un élément à*index* position de la page active. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Supprime un document à*index* position. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Supprime une page du document. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | Supprime une page du document à*index* position. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | Enregistre le document XPS dans le flux. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | Enregistre le document XPS dans le fichier XPS situé à l'emplacement*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | Enregistre le document à l'aide de la[`Device`](../../aspose.page/device/) instance. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Sélectionne un document actif pour modification. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Sélectionne une page de document active pour modification. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Relie le*printTicket* au document indexé par*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Relie le*printTicket* à la page indexée par*pageIndex* dans le document indexé par*documentIndex* . |

### Voir également

* class [Document](../../aspose.page/document/)
* espace de noms [Aspose.Page.XPS](../../aspose.page.xps/)
* Assemblée [Aspose.Page](../../)


