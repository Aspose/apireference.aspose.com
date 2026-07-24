---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions classe"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions classe. Classe de base pour les options d'enregistrement XPS‑en‑image en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Classe de base pour les options d'enregistrement XPS-en-image.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Spécifie la taille d'une portion de pages à transmettre d'un nœud à l'autre. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | La collection de gestionnaires d'événements qui effectue des modifications sur une page [XPS](../../aspose.page.xps/) juste avant qu'elle ne soit enregistrée. |
| [get_ImageSize](./get_imagesize/)() const | Obtient/definit la taille des images de sortie en pixels. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Obtient/definit le mode d'interpolation. |
| [get_PageNumbers](./get_pagenumbers/)() override | Obtient/definit le tableau des numéros de pages à convertir. |
| [get_Resolution](./get_resolution/)() const | Obtient/definit la résolution de l'image. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Obtient/definit le mode d'anticrénelage. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Obtient/definit l'indice de rendu du texte. |
| [ImageSaveOptions](./imagesaveoptions/)() | Crée une nouvelle instance d'options. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Spécifie la taille d'une portion de pages à transmettre d'un nœud à l'autre. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Obtient/definit la taille des images de sortie en pixels. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Obtient/definit le mode d'interpolation. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Obtient/definit le tableau des numéros de pages à convertir. |
| [set_Resolution](./set_resolution/)(float) | Obtient/definit la résolution de l'image. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Obtient/definit le mode d'anticrénelage. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Obtient/definit l'indice de rendu du texte. |
## Voir aussi

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
