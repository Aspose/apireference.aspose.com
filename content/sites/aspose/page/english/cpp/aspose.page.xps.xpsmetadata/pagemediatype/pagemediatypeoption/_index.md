---
title: Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption class
linktitle: PageMediaTypeOption
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption class. Describes the PageMediaType feature options in C++.'
type: docs
weight: 700
url: /cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Describes the [PageMediaType](../) feature options.

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Adds an array of [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) instances to the option. |
| [Clone](./clone/)() | Clones this option instance. The shortcut to the cloneing constructor. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Creates a new instance. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Clones this option instance. |
| [SetWeight](./setweight/)(int32_t) | Sets a **Weight** scored property value. |
## Fields

| Field | Description |
| --- | --- |
| static [Archival](./archival/) | Specifies archival quality media. |
| static [AutoSelect](./autoselect/) | Specifies Media would be Automatically selected. |
| static [BackPrintFilm](./backprintfilm/) | Specifies specialty back printing film media. |
| static [Bond](./bond/) | Specifies standard bond media. |
| static [CardStock](./cardstock/) | Specifies standard card stock media. |
| static [Continous](./continous/) | Specifies continuous feed media. |
| static [EnvelopePlain](./envelopeplain/) | Specifies standard envelope media. |
| static [EnvelopeWindow](./envelopewindow/) | Specifies windowed envelope media. |
| static [Fabric](./fabric/) | Specifies fabric media. |
| static [HighResolution](./highresolution/) | Specifies specialty high resolution media. |
| static [Label](./label/) | Specifies label media. |
| static [MultiLayerForm](./multilayerform/) | Specifies attached multi-part forms media. |
| static [MultiPartForm](./multipartform/) | Specifies separate multi-part forms media. |
| static [None](./none/) | Specifies unknown or unlisted media. |
| static [Photographic](./photographic/) | Specifies standard photographic media. |
| static [PhotographicFilm](./photographicfilm/) | Specifies film photographic media. |
| static [PhotographicGlossy](./photographicglossy/) | Specifies glossy photographic media. |
| static [PhotographicHighGloss](./photographichighgloss/) | Specifies high gloss photographic media. |
| static [PhotographicMatte](./photographicmatte/) | Specifies matte photographic media. |
| static [PhotographicSatin](./photographicsatin/) | Specifies satin photographic media. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Specifies semi-gloss photographic media. |
| static [Plain](./plain/) | Specifies standard paper media. |
| static [Screen](./screen/) | Specifies output to an output display in continuous form. |
| static [ScreenPaged](./screenpaged/) | Specifies output to an output display in paged form. |
| static [Stationary](./stationary/) | Specifies specialty stationery media. |
| static [TabStockFull](./tabstockfull/) | Specifies tab stock media that is not pre-cut (single tabs). |
| static [TabStockPreCut](./tabstockprecut/) | Specifies tab stock media that is pre-cut (multiple tabs). |
| static [Transparency](./transparency/) | Specifies transparency media. |
| static [TShirtTransfer](./tshirttransfer/) | Specifies specialty T-shirt transfer media. |
## See Also

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
