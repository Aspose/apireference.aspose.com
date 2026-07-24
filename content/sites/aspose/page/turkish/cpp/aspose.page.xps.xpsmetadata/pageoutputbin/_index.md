---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin sınıfı"
linktitle: "PageOutputBin"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin sınıfı. Cihaz için desteklenen tüm bölmelerin tam listesini açıklar. Çıktı bölmesi sayfa bazında belirtilebilmesini sağlar. JobOutputBin, DocumentOutputBin ve PageOutputBin anahtar kelimeleri birbirini dışlar; yalnızca biri PrintTicket veya Print Capabilities belgesinde belirtilmelidir. C++'da."
type: docs
weight: 11400
url: /tr/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Cihaz için desteklenen tüm bölmelerin tam listesini açıklar. Çıktı bölmesi sayfa bazında belirtilebilmesini sağlar. [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) ve [PageOutputBin](./) anahtar kelimeleri birbirini dışlar; yalnızca biri bir [PrintTicket](../printticket/) veya Print Capabilities belgesinde belirtilmelidir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
