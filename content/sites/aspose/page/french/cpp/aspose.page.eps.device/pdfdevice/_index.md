---
title: "classe Aspose::Page::EPS::Device::PdfDevice"
linktitle: "PdfDevice"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::Device::PdfDevice classe. Cette classe encapsule le rendu du document en PDF en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Cette classe encapsule le rendu du document au format PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" valeur de la propriété. |
| static [BACKGROUND](./background/)() | "Background" clé de propriété. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" clé de propriété. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Rogne en utilisant la forme donnée. Délègue à writeClip(Rectangle), writeClip(RectangleF) ou writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Rogne le rectangle. Appelle clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | Effectue la préparation nécessaire du dispositif après le rendu de la page. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" clé de propriété. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Crée une copie de ce dispositif. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Libère le contexte graphique. Si lors de la création restoreOnDispose était vrai, writeGraphicsRestore() sera appelé. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Dessine un chemin. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Dessine une image avec la transformation assignée et l'arrière-plan. |
| [DrawString](./drawstring/)(System::String, double, double) override | Dessine une chaîne au point donné. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" clé de propriété. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" clé de propriété. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" valeur de la propriété. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" valeur de la propriété. |
| [EndDocument](./enddocument/)() override | Effectue la préparation nécessaire du dispositif après le rendu du document. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Remplit un chemin. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" clé de propriété. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Numéro de page actuel. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Dessine un cadre et une bannière autour d'une chaîne. La méthode calcule et renvoie le point où le curseur de texte doit être positionné avant de dessiner la chaîne. |
| [get_OutputStream](./get_outputstream/)() override | Spécifie ou renvoie un flux de sortie. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Obtient la transformation actuelle. |
| [InitClip](./initclip/)() override | Initialise le clip du dispositif. |
| [InitPageNumbers](./initpagenumbers/)() override | Initialise le nombre de pages à produire. |
| static [KEYWORDS](./keywords/)() | Valeur de la propriété "Keywords". |
| [OpenPage](./openpage/)(System::String) override | Effectue les préparations nécessaires du dispositif avant le rendu de la page. |
| [OpenPage](./openpage/)(float, float) override | Effectue les préparations nécessaires du dispositif avant le rendu de chaque page. |
| static [ORIENTATION](./orientation/)() | Clé de la propriété "Orientation". |
| static [PAGE_MARGINS](./page_margins/)() | Clé de la propriété "Page margins". |
| static [PAGE_SIZE_](./page_size_/)() | Clé de la propriété "Page size". |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Initialise une nouvelle instance de [PdfDevice](./) avec le flux de sortie. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Initialise une nouvelle instance de [PdfDevice](./) avec le flux de sortie et la taille de page spécifiée. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Constructeur de clonage. Initialise une nouvelle instance de [PdfDevice](./) avec le dispositif existant. |
| [ReNew](./renew/)() override | Réinitialise le dispositif à son état initial pour l'ensemble du document. Utilisé pour réinitialiser le flux de sortie. |
| [ReNewForMerge](./renewformerge/)(bool) override | Réinitialise le dispositif à son état initial pour l'ensemble du document lors de la fusion de plusieurs documents. Utilisé pour réinitialiser le flux de sortie. |
| [Reset](./reset/)() override | Si les paramètres du dispositif de page sont définis, cette méthode permet de ramener le flux d'écriture au début de la page. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Fait pivoter la transformation actuelle autour de l'axe Z. Appelle writeTransform(Transform). Une rotation d'un angle positif theta fait pivoter les points de l'axe x positif vers l'axe y positif. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Mise à l'échelle de la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Spécifie la police actuelle. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Spécifie ou renvoie un flux de sortie. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Renvoie ou spécifie la peinture actuelle. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Renvoie ou spécifie le trait actuel. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Spécifie le clip du dispositif. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Spécifie la transformation actuelle. Puisque la plupart des formats de sortie n'implémentent pas cette fonctionnalité, la transformation inverse de currentTransform est calculée et multipliée par la transformation à définir. Le résultat est ensuite transmis via un appel à writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Applique un cisaillement à la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | Effectue les préparations nécessaires du dispositif avant le début du rendu du document. |
| static [SUBJECT](./subject/)() | Valeur de la propriété "Subject". |
| static [TITLE](./title/)() | Valeur de la propriété "Title". |
| [ToString](./tostring/)() const override | Renvoie le nom du type d'appareil. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Transforme la matrice de transformation actuelle. Appelle writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | Déplace la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | "Transparent" clé de propriété. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Met à jour les paramètres de page à partir d'un autre dispositif multi-pages. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" clé de propriété. |
| [WriteBackground](./writebackground/)() override | Écrit le fond actuel. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Écrit le cap du trait. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Écrit un commentaire. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Écrit le tiret du trait. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Écrit le catalogue, docinfo, préférences, et (comme nous utilisons uniquement une sortie d'une seule page) l'arbre des pages. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Écrit la jointure du trait. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Écrit la dernière peinture écrite. Elle est utile dans les cas où, après l'écriture de la peinture, une restauration graphique ("Q") a été effectuée. |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Écrit la limite d'onglet du trait. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Écrit la peinture avec la couleur donnée. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Écrit la peinture avec le dégradé donné. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Écrit la peinture avec la texture donnée. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Écrit la peinture. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Écrit une chaîne avec la police spécifiée. |
| [WriteTrailer](./writetrailer/)() | Écrit la bande-annonce du document PDF. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Écrit la matrice de transformation donnée dans le fichier. |
| [WriteWarning](./writewarning/)(System::String) override | Écrit un avertissement, par défaut vers System.err. |
| [WriteWidth](./writewidth/)(float) override | Écrit la largeur du trait. |
## Champs

| Champ | Description |
| --- | --- |
| static [VERSION](./version/) | "Version" clé de propriété. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" valeur de propriété. |

## Deprecated
La classe PdfDevice est obsolète à partir de la version 24.3. Veuillez utiliser la méthode SaveAsPdf de la classe PsDocument à la place. Dans la version 24.6, cette classe sera entièrement masquée.

## Voir aussi

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
