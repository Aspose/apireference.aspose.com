---
title: "Aspose::Page::XPS::XpsDocument classe"
linktitle: "XpsDocument"
second_title: "Aspose.Page pour C++"
description: "Classe Aspose::Page::XPS::XpsDocument. Classe encapsulant l'entité principale d'un document XPS qui fournit des méthodes de manipulation pour tout élément XPS en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Classe encapsulant l'entité principale d'un document [XPS](../) qui fournit des méthodes de manipulation pour tout élément [XPS](../).

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(T) | Ajoute un élément de contenu (Canvas, Path ou Glyphs). |
| [AddCanvas](./addcanvas/)() | Ajoute un nouveau canevas à la page active. |
| [AddDocument](./adddocument/)(bool) | Ajoute un document vide avec la taille de page par défaut. |
| [AddDocument](./adddocument/)(float, float, bool) | Ajoute un document vide avec les dimensions de la première page *width* et *height*. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Ajoute de nouveaux glyphes à la page active. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Ajoute de nouveaux glyphes à la page active. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Ajoute une entrée d'outline au document. |
| [AddPage](./addpage/)(bool) | Ajoute une page vide au document avec la taille de page par défaut. |
| [AddPage](./addpage/)(float, float, bool) | Ajoute une page vide au document avec les dimensions *width* et *height* spécifiées. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Ajoute une page au document. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Ajoute un nouveau chemin à la page active. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Crée un nouveau segment d'arc elliptique. |
| [CreateCanvas](./createcanvas/)() | Crée un nouveau canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Crée une nouvelle couleur. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Crée une nouvelle couleur dans l'espace colorimétrique sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Crée une nouvelle couleur dans l'espace colorimétrique sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Crée une nouvelle couleur dans l'espace colorimétrique scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Crée une nouvelle couleur dans l'espace colorimétrique scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Crée une nouvelle couleur dans un espace colorimétrique basé sur ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Crée une nouvelle couleur dans un espace colorimétrique basé sur ICC. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Crée une nouvelle ressource de police **TrueType**. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Crée une nouvelle ressource de police **TrueType** à partir d'un flux. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Crée de nouveaux glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Crée de nouveaux glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Crée un nouveau point d'arrêt de dégradé. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Crée un nouveau point d'arrêt de dégradé. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Crée une nouvelle ressource de profil ICC à partir du fichier de profil ICC situé à *iccProfilePath*. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Crée une nouvelle ressource de profil ICC à partir de *stream*. |
| [CreateImage](./createimage/)(System::String) | Crée une nouvelle ressource d'image à partir du fichier image situé à *imagePath*. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Crée une nouvelle ressource d'image à partir de *stream*. |
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
| [Dispose](./dispose/)() override | Libère l'instance. |
| [get_ActiveDocument](./get_activedocument/)() | Obtient le numéro du document actif. |
| [get_ActivePage](./get_activepage/)() | Obtient le numéro de la page active dans le document actif. |
| [get_DocumentCount](./get_documentcount/)() | Renvoie le nombre de documents dans le package [XPS](../). |
| [get_JobPrintTicket](./get_jobprintticket/)() | Renvoie/definit le ticket d'impression du travail du document. |
| [get_Page](./get_page/)() | Renvoie une instance [XpsPage](../) pour la page active. |
| [get_PageCount](./get_pagecount/)() | Renvoie le nombre de pages dans le document actif. |
| [get_TotalPageCount](./get_totalpagecount/)() | Renvoie le nombre total de pages dans tous les documents du document [XPS](../). |
| [get_Utils](./get_utils/)() const | Obtient l'objet qui fournit des utilitaires au-delà de l'API officielle de manipulation [XPS](../). |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Renvoie le ticket d'impression du document indexé par *documentIndex* . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Renvoie le ticket d'impression de la page indexée par *pageIndex* dans le document indexé par *documentIndex* . |
| [Insert](./insert/)(int32_t, T) | Insère un élément (Canvas, Path ou Glyphs) dans la page active à la position *index* . |
| [InsertCanvas](./insertcanvas/)(int32_t) | Insère un nouveau canvas dans la page active à la position *index* . |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Insère un document vide avec la taille de page par défaut à la position *index* . |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Insère un document vide avec les dimensions de la première page *width* et *height* à la position *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Insère de nouveaux glyphes dans la page active à la position *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Insère de nouveaux glyphes dans la page active à la position *index* . |
| [InsertPage](./insertpage/)(int32_t, bool) | Insère une page vide dans le document avec la taille de page par défaut à la position *index* . |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Insère une page vide dans le document avec les dimensions *width* et *height* spécifiées à la position *index* . |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Insère une page dans le document à la position *index* . |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Insère un nouveau chemin dans la page active à la position *index* . |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Fusion de plusieurs fichiers [XPS](../) en un document [XPS](../). |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Fusion de plusieurs fichiers [XPS](../) en un document [XPS](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Fusion de documents [XPS](../) en PDF à l'aide de l'instance [Device](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Fusion de documents [XPS](../) en PDF à l'aide de l'instance [Device](../). |
| [Remove](./remove/)(T) | Supprime un élément de la page active. |
| [RemoveAt](./removeat/)(int32_t) | Supprime un élément à la position *index* de la page active. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Supprime un document à la position *index*. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Supprime une page du document. |
| [RemovePageAt](./removepageat/)(int32_t) | Supprime une page du document à la position *index*. |
| [Save](./save/)(System::String) | Enregistre le document [XPS](../) dans le fichier [XPS](../) situé à *path* . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Enregistre le document [XPS](../) dans un flux. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Enregistre le document dans un fichier image. Le répertoire de sortie et le nom du fichier seront les mêmes que ceux du fichier [XPS](../) d'entrée. L'extension du fichier correspondra au format d'image indiqué dans le paramètre "options". Si le document a été initialisé avec un flux qui n'est pas un FileStream, le fichier image sera enregistré dans le dossier actuel avec le modèle de nom de fichier par défaut. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Enregistre le document dans un fichier image dans le répertoire spécifié avec le nom de fichier indiqué. L'extension du fichier correspondra au format d'image indiqué dans le paramètre "options". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Enregistre le document au format image bitmap sous forme de tableaux d'octets. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Enregistre le document au format PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Enregistre le document au format PDF. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Enregistre le document au format PS. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Enregistre le document au format PS. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Sélectionne un document actif pour la modification. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Sélectionne une page de document active pour la modification. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Renvoie/definit le ticket d'impression du travail du document. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Lie le *printTicket* au document indexé par *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Lie le *printTicket* à la page indexée par *pageIndex* dans le document indexé par *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | Crée un document [XPS](../) vide avec la taille de page par défaut. |
| [XpsDocument](./xpsdocument/)(System::String) | Ouvre un document [XPS](../) existant situé à *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Ouvre un document existant situé à *path* en tant que document [XPS](../). |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Charge un document existant stocké dans le *stream* en tant que document [XPS](../). |
## Voir aussi

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
