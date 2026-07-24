---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin sınıfı"
linktitle: "PageInputBin"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin sınıfı. Bir cihazda kurulu giriş kutusunu veya bir cihaz için desteklenen kutuların tam listesini açıklar. Giriş kutusunun sayfa bazında belirtilmesine izin verir. JobInputBin, DocumentInputBin ve PageInputBin anahtar kelimeleri birbirini dışlar. Her ikisi de bir PrintTicket veya Print Capabilities belgesinde aynı anda belirtilmemelidir. C++'da."
type: docs
weight: 10000
url: /tr/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Bir cihazda kurulu giriş kutusunu veya bir cihaz için desteklenen kutuların tam listesini açıklar. Giriş kutusunun sayfa bazında belirtilmesine izin verir. [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) ve [PageInputBin](./) anahtar kelimeleri birbirini dışlar. Her ikisi de bir [PrintTicket](../printticket/) veya Print Capabilities belgesinde aynı anda belirtilmemelidir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
