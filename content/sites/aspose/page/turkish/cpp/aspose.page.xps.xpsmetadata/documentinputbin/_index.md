---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin sınıfı"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin sınıfı. Bir cihazda kurulu giriş kutusunu veya bir cihaz için desteklenen kutuların tam listesini açıklar. JobInputBin, DocumentInputBin ve PageInputBin anahtar sözcükleri birbirini dışlar. İkisi de bir PrintTicket veya Print Capabilities belgesinde aynı anda belirtilmemelidir. C++'de."
type: docs
weight: 1800
url: /tr/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Bir cihazda kurulu giriş kutusunu veya bir cihaz için desteklenen kutuların tam listesini açıklar. [JobInputBin](../jobinputbin/), [DocumentInputBin](./) ve [PageInputBin](../pageinputbin/) anahtar sözcükleri birbirini dışlar. İkisi de bir [PrintTicket](../printticket/) veya Print Capabilities belgesinde aynı anda belirtilmemelidir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
