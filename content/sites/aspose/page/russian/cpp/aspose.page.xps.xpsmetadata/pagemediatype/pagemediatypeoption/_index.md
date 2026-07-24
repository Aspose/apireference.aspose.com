---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption класс"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption класс. Описывает параметры функции PageMediaType в C++."
type: docs
weight: 700
url: /ru/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Описывает параметры функции [PageMediaType](../).

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Добавляет массив экземпляров [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) к опции. |
| [Clone](./clone/)() | Клонирует этот экземпляр опции. Ярлык к конструктору клонирования. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Создаёт новый экземпляр. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Клонирует этот экземпляр опции. |
| [SetWeight](./setweight/)(int32_t) | Устанавливает значение оцененного свойства **Weight**. |
## Поля

| Поле | Описание |
| --- | --- |
| static [Archival](./archival/) | Указывает носитель архивного качества. |
| static [AutoSelect](./autoselect/) | Указывает, что Media будет автоматически выбран. |
| static [BackPrintFilm](./backprintfilm/) | Указывает специализированный обратный печатный пленочный носитель. |
| static [Bond](./bond/) | Указывает стандартный бондовый носитель. |
| static [CardStock](./cardstock/) | Указывает стандартный картонный носитель. |
| static [Continous](./continous/) | Указывает носитель с непрерывной подачей. |
| static [EnvelopePlain](./envelopeplain/) | Указывает стандартный конвертный носитель. |
| static [EnvelopeWindow](./envelopewindow/) | Указывает носитель с окном в конверте. |
| static [Fabric](./fabric/) | Указывает тканевый носитель. |
| static [HighResolution](./highresolution/) | Указывает специализированный носитель высокого разрешения. |
| static [Label](./label/) | Указывает этикеточный носитель. |
| static [MultiLayerForm](./multilayerform/) | Указывает носитель присоединённых многостраничных форм. |
| static [MultiPartForm](./multipartform/) | Указывает отдельный носитель многостраничных форм. |
| static [None](./none/) | Указывает неизвестный или неуказанный носитель. |
| static [Photographic](./photographic/) | Указывает стандартный фотоноситель. |
| static [PhotographicFilm](./photographicfilm/) | Указывает фотопленочный носитель. |
| static [PhotographicGlossy](./photographicglossy/) | Указывает глянцевый фотоноситель. |
| static [PhotographicHighGloss](./photographichighgloss/) | Указывает фотоноситель с высоким глянцем. |
| static [PhotographicMatte](./photographicmatte/) | Указывает матовый фотоноситель. |
| static [PhotographicSatin](./photographicsatin/) | Указывает сатиновый фотоноситель. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Указывает полуглянцевый фотоноситель. |
| static [Plain](./plain/) | Указывает стандартный бумажный носитель. |
| static [Screen](./screen/) | Указывает вывод на дисплей в непрерывной форме. |
| static [ScreenPaged](./screenpaged/) | Указывает вывод на дисплей в постраничной форме. |
| static [Stationary](./stationary/) | Указывает специализированный канцелярский носитель. |
| static [TabStockFull](./tabstockfull/) | Указывает носитель с табами, не предрезанный (одинарные вкладки). |
| static [TabStockPreCut](./tabstockprecut/) | Указывает носитель с табами, предрезанный (многократные вкладки). |
| static [Transparency](./transparency/) | Указывает прозрачный носитель. |
| static [TShirtTransfer](./tshirttransfer/) | Указывает специализированный носитель для переноса на футболки. |
## См. также

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
