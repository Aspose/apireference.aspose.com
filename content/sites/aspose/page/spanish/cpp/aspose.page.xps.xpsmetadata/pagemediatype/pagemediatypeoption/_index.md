---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption class"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption class. Describe las opciones de característica PageMediaType en C++."
type: docs
weight: 700
url: /es/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Describe las opciones de característica [PageMediaType](../).

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Agrega una matriz de instancias de [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) a la opción. |
| [Clone](./clone/)() | Clona esta instancia de opción. El acceso directo al constructor de clonación. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Crea una nueva instancia. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Clona esta instancia de opción. |
| [SetWeight](./setweight/)(int32_t) | Establece un valor de la propiedad puntuada **Weight**. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [Archival](./archival/) | Especifica medios de calidad de archivo. |
| static [AutoSelect](./autoselect/) | Especifica que Media se seleccionará automáticamente. |
| static [BackPrintFilm](./backprintfilm/) | Especifica medio de película de impresión especializado. |
| static [Bond](./bond/) | Especifica medio de papel bond estándar. |
| static [CardStock](./cardstock/) | Especifica medio de cartulina estándar. |
| static [Continous](./continous/) | Especifica medio de alimentación continua. |
| static [EnvelopePlain](./envelopeplain/) | Especifica medio de sobre estándar. |
| static [EnvelopeWindow](./envelopewindow/) | Especifica medio de sobre con ventana. |
| static [Fabric](./fabric/) | Especifica medio de tela. |
| static [HighResolution](./highresolution/) | Especifica medio especializado de alta resolución. |
| static [Label](./label/) | Especifica medio de etiqueta. |
| static [MultiLayerForm](./multilayerform/) | Especifica medio de formularios multiparte adjuntos. |
| static [MultiPartForm](./multipartform/) | Especifica medio de formularios multiparte separados. |
| static [None](./none/) | Especifica medio desconocido o no listado. |
| static [Photographic](./photographic/) | Especifica medio fotográfico estándar. |
| static [PhotographicFilm](./photographicfilm/) | Especifica medio fotográfico de película. |
| static [PhotographicGlossy](./photographicglossy/) | Especifica medio fotográfico brillante. |
| static [PhotographicHighGloss](./photographichighgloss/) | Especifica medio fotográfico de alto brillo. |
| static [PhotographicMatte](./photographicmatte/) | Especifica medio fotográfico mate. |
| static [PhotographicSatin](./photographicsatin/) | Especifica medio fotográfico satinado. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Especifica medio fotográfico semibrillante. |
| static [Plain](./plain/) | Especifica medio de papel estándar. |
| static [Screen](./screen/) | Especifica salida a una pantalla de salida en forma continua. |
| static [ScreenPaged](./screenpaged/) | Especifica salida a una pantalla de salida en forma paginada. |
| static [Stationary](./stationary/) | Especifica medio de papelería especializado. |
| static [TabStockFull](./tabstockfull/) | Especifica medio de tabulador que no está precortado (pestañas individuales). |
| static [TabStockPreCut](./tabstockprecut/) | Especifica medio de tabulador que está precortado (pestañas múltiples). |
| static [Transparency](./transparency/) | Especifica medios de transparencia. |
| static [TShirtTransfer](./tshirttransfer/) | Especifica medios de transferencia especializados para camisetas. |
## Ver también

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
