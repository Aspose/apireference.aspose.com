---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions Klasse"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions Klasse. Grundklasse für XPS-zu-Bild Speicheroptionen in C++."
type: docs
weight: 200
url: /de/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Basisklasse für XPS-als-Bild Speicheroptionen.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Gibt die Größe eines Seitenabschnitts an, der von Knoten zu Knoten weitergegeben wird. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Die Sammlung von Ereignis‑Handlern, die Änderungen an einer [XPS](../../aspose.page.xps/)‑Seite kurz vor dem Speichern vornimmt. |
| [get_ImageSize](./get_imagesize/)() const | Liest/Setzt die Größe der Ausgabebilder in Pixeln. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Liest/Setzt den Interpolationsmodus. |
| [get_PageNumbers](./get_pagenumbers/)() override | Liest/setzt das Array von Seitenzahlen, die konvertiert werden sollen. |
| [get_Resolution](./get_resolution/)() const | Liest/legt die Bildauflösung fest. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Liest/Setzt den Glättungsmodus. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Liest/Setzt den Hinweis zur Textdarstellung. |
| [ImageSaveOptions](./imagesaveoptions/)() | Erstellt eine neue Instanz von Optionen. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Gibt die Größe eines Seitenabschnitts an, der von Knoten zu Knoten weitergegeben wird. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Liest/Setzt die Größe der Ausgabebilder in Pixeln. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Liest/Setzt den Interpolationsmodus. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Liest/setzt das Array von Seitenzahlen, die konvertiert werden sollen. |
| [set_Resolution](./set_resolution/)(float) | Liest/legt die Bildauflösung fest. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Liest/Setzt den Glättungsmodus. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Liest/Setzt den Hinweis zur Textdarstellung. |
## Siehe auch

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
