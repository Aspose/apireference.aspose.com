---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin sınıfı"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin sınıfı. Cihaz için desteklenen tüm bölmelerin tam listesini açıklar. Çıktı bölmesi, belge bazında belirtilebilmesini sağlar. JobOutputBin, DocumentOutputBin ve PageOutputBin anahtar kelimeleri birbirini dışlar; bir PrintTicket veya Print Capabilities belgesinde yalnızca biri belirtilmelidir.  C++'da."
type: docs
weight: 2100
url: /tr/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Cihaz için desteklenen tüm bölmelerin tam listesini açıklar. Çıktı bölmesi, belge bazında belirtilebilmesini sağlar. [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) ve [PageOutputBin](../pageoutputbin/) anahtar kelimeleri birbirini dışlar; bir [PrintTicket](../printticket/) veya Print Capabilities belgesinde yalnızca biri belirtilmelidir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
