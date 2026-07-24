---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions classe"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions classe. Classe di base per le opzioni di salvataggio XPS-as-image in C++."
type: docs
weight: 200
url: /it/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Classe di base per le opzioni di salvataggio XPS-as-image.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Specifica la dimensione di una porzione di pagine da passare da nodo a nodo. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | La raccolta di gestori di eventi che esegue modifiche a una pagina [XPS](../../aspose.page.xps/) appena prima del salvataggio. |
| [get_ImageSize](./get_imagesize/)() const | Ottiene/imposta la dimensione delle immagini di output in pixel. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Ottiene/imposta la modalità di interpolazione. |
| [get_PageNumbers](./get_pagenumbers/)() override | Ottiene/imposta l’array dei numeri di pagina da convertire. |
| [get_Resolution](./get_resolution/)() const | Ottiene/imposta la risoluzione dell'immagine. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Ottiene/imposta la modalità di smussatura. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Ottiene/imposta il suggerimento di rendering del testo. |
| [ImageSaveOptions](./imagesaveoptions/)() | Crea una nuova istanza delle opzioni. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Specifica la dimensione di una porzione di pagine da passare da nodo a nodo. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Ottiene/imposta la dimensione delle immagini di output in pixel. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Ottiene/imposta la modalità di interpolazione. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Ottiene/imposta l’array dei numeri di pagina da convertire. |
| [set_Resolution](./set_resolution/)(float) | Ottiene/imposta la risoluzione dell'immagine. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Ottiene/imposta la modalità di smussatura. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Ottiene/imposta il suggerimento di rendering del testo. |
## Vedi anche

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
