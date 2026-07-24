---
title: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex klass"
linktitle: "DocumentDuplex"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex klass. Beskriver duplexegenskaperna för utskriften. Duplexfunktionen möjliggör utskrift på båda sidor av mediet. Varje dokument duplexas separat. DocumentDuplex och JobDuplexAllDocumentsContiguously är ömsesidigt uteslutande. Det är upp till drivrutinen att avgöra hur begränsningar hanteras mellan dessa nyckelord.  i C++."
type: docs
weight: 1400
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class


Beskriver duplexegenskaperna för utskriften. Duplexfunktionen möjliggör utskrift på båda sidor av mediet. Varje dokument duplexas separat. [DocumentDuplex](./) och [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/) är ömsesidigt uteslutande. Det är upp till drivrutinen att avgöra hur begränsningar hanteras mellan dessa nyckelord. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex).

```cpp
class DocumentDuplex : public Aspose::Page::XPS::XpsMetadata::Duplex,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentDuplex](./documentduplex/)(const System::ArrayPtr\<System::SharedPtr\<Duplex::DuplexOption\>\>\&) | Skapar en ny instans. |
## Se även

* Class [Duplex](../duplex/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
