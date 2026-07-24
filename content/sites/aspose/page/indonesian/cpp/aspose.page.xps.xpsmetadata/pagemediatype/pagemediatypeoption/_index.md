---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption class"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption class. Menjelaskan opsi fitur PageMediaType dalam C++."
type: docs
weight: 700
url: /id/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Menjelaskan opsi fitur [PageMediaType](../).

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Menambahkan sebuah array dari instance [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) ke opsi. |
| [Clone](./clone/)() | Menggandakan instance opsi ini. Pintasan ke konstruktor kloning. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Membuat instance baru. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Menggandakan instance opsi ini. |
| [SetWeight](./setweight/)(int32_t) | Mengatur nilai properti terukur **Weight**. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Archival](./archival/) | Menentukan media kualitas arsip. |
| static [AutoSelect](./autoselect/) | Menentukan Media akan dipilih secara otomatis. |
| static [BackPrintFilm](./backprintfilm/) | Menentukan media film pencetakan belakang khusus. |
| static [Bond](./bond/) | Menentukan media bond standar. |
| static [CardStock](./cardstock/) | Menentukan media kertas karton standar. |
| static [Continous](./continous/) | Menentukan media umpan kontinu. |
| static [EnvelopePlain](./envelopeplain/) | Menentukan media amplop standar. |
| static [EnvelopeWindow](./envelopewindow/) | Menentukan media amplop berjendela. |
| static [Fabric](./fabric/) | Menentukan media kain. |
| static [HighResolution](./highresolution/) | Menentukan media resolusi tinggi khusus. |
| static [Label](./label/) | Menentukan media label. |
| static [MultiLayerForm](./multilayerform/) | Menentukan media formulir multi-bagian terlampir. |
| static [MultiPartForm](./multipartform/) | Menentukan media formulir multi-bagian terpisah. |
| static [None](./none/) | Menentukan media yang tidak diketahui atau tidak terdaftar. |
| static [Photographic](./photographic/) | Menentukan media fotografi standar. |
| static [PhotographicFilm](./photographicfilm/) | Menentukan media fotografi film. |
| static [PhotographicGlossy](./photographicglossy/) | Menentukan media fotografi mengkilap. |
| static [PhotographicHighGloss](./photographichighgloss/) | Menentukan media fotografi kilap tinggi. |
| static [PhotographicMatte](./photographicmatte/) | Menentukan media fotografi matte. |
| static [PhotographicSatin](./photographicsatin/) | Menentukan media fotografi satin. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Menentukan media fotografi semi-gloss. |
| static [Plain](./plain/) | Menentukan media kertas standar. |
| static [Screen](./screen/) | Menentukan output ke tampilan output dalam bentuk kontinu. |
| static [ScreenPaged](./screenpaged/) | Menentukan output ke tampilan output dalam bentuk berhalaman. |
| static [Stationary](./stationary/) | Menentukan media alat tulis khusus. |
| static [TabStockFull](./tabstockfull/) | Menentukan media stok tab yang tidak dipotong sebelumnya (tab tunggal). |
| static [TabStockPreCut](./tabstockprecut/) | Menentukan media stok tab yang dipotong sebelumnya (banyak tab). |
| static [Transparency](./transparency/) | Menentukan media transparan. |
| static [TShirtTransfer](./tshirttransfer/) | Menentukan media transfer kaos khusus. |
## Lihat Juga

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
