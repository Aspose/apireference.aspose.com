---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption sınıfı"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption sınıfı. C++'da PageMediaType özellik seçeneklerini açıklar."
type: docs
weight: 700
url: /tr/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Bu [PageMediaType](../) özellik seçeneklerini açıklar.

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Seçeneğe [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) örneklerinden oluşan bir dizi ekler. |
| [Clone](./clone/)() | Bu seçenek örneğini klonlar. Klonlama yapıcısına kısayol. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Yeni bir örnek oluşturur. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Bu seçenek örneğini klonlar. |
| [SetWeight](./setweight/)(int32_t) | **Weight** puanlanmış özellik değerini ayarlar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Archival](./archival/) | Arşiv kalitesinde medya belirtir. |
| static [AutoSelect](./autoselect/) | Medyanın otomatik olarak seçileceğini belirtir. |
| static [BackPrintFilm](./backprintfilm/) | Özel arka baskı film medyasını belirtir. |
| static [Bond](./bond/) | Standart bağ medyasını belirtir. |
| static [CardStock](./cardstock/) | Standart kart stoğu medyasını belirtir. |
| static [Continous](./continous/) | Sürekli besleme medyasını belirtir. |
| static [EnvelopePlain](./envelopeplain/) | Standart zarf medyasını belirtir. |
| static [EnvelopeWindow](./envelopewindow/) | Pencereli zarf medyasını belirtir. |
| static [Fabric](./fabric/) | Kumaş medyasını belirtir. |
| static [HighResolution](./highresolution/) | Özel yüksek çözünürlüklü medyayı belirtir. |
| static [Label](./label/) | Etiket medyasını belirtir. |
| static [MultiLayerForm](./multilayerform/) | Ekli çok parçalı form medyasını belirtir. |
| static [MultiPartForm](./multipartform/) | Ayrı çok parçalı form medyasını belirtir. |
| static [None](./none/) | Bilinmeyen veya listelenmemiş medyayı belirtir. |
| static [Photographic](./photographic/) | Standart fotoğraf medyasını belirtir. |
| static [PhotographicFilm](./photographicfilm/) | Film fotoğraf medyasını belirtir. |
| static [PhotographicGlossy](./photographicglossy/) | Parlak fotoğraf medyasını belirtir. |
| static [PhotographicHighGloss](./photographichighgloss/) | Yüksek parlaklıkta fotoğraf medyasını belirtir. |
| static [PhotographicMatte](./photographicmatte/) | Mat fotoğraf medyasını belirtir. |
| static [PhotographicSatin](./photographicsatin/) | Saten fotoğraf medyasını belirtir. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Yarı parlak fotoğraf medyasını belirtir. |
| static [Plain](./plain/) | Standart kağıt medyasını belirtir. |
| static [Screen](./screen/) | Sürekli formda bir çıktı ekranına çıktıyı belirtir. |
| static [ScreenPaged](./screenpaged/) | Sayfalı formda bir çıktı ekranına çıktıyı belirtir. |
| static [Stationary](./stationary/) | Özel kırtasiye medyasını belirtir. |
| static [TabStockFull](./tabstockfull/) | Önceden kesilmemiş (tek sekmeli) sekme stoğu medyasını belirtir. |
| static [TabStockPreCut](./tabstockprecut/) | Önceden kesilmiş (çoklu sekmeli) sekme stoğu medyasını belirtir. |
| static [Transparency](./transparency/) | Şeffaf medya belirtir. |
| static [TShirtTransfer](./tshirttransfer/) | Özel tişört transfer medyasını belirtir. |
## Ayrıca Bakınız

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
