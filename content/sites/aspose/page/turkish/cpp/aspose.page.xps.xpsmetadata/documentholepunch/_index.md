---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch sınıfı"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch sınıfı. Çıktının delme özelliklerini açıklar. Her belge ayrı ayrı delinmiştir. JobHolePunch ve DocumentHolePunch anahtar kelimeleri birbirini dışlar. Her ikisi de aynı anda bir PrintTicket veya Print Capabilities belgesinde belirtilmemelidir. C++'da."
type: docs
weight: 1500
url: /tr/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Çıktının delme özelliklerini açıklar. Her belge ayrı ayrı delinmiştir. [JobHolePunch](../jobholepunch/) ve [DocumentHolePunch](./) anahtar kelimeleri birbirini dışlar. Her ikisi de aynı anda bir [PrintTicket](../printticket/) veya Print Capabilities belgesinde belirtilmemelidir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
