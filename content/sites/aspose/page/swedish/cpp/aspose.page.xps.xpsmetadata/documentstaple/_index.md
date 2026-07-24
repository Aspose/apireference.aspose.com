---
title: "Aspose::Page::XPS::XpsMetadata::DocumentStaple klass"
linktitle: "DocumentStaple"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentStaple klass. Beskriver häftningskarakteristiken för utskriften. Varje dokument häftas separat. Nyckelorden JobStapleAllDocuments och DocumentStaple är ömsesidigt uteslutande. Det är upp till drivrutinen att avgöra hur begränsningar hanteras mellan dessa nyckelord.  i C++."
type: docs
weight: 2600
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class


Beskriver häftningskarakteristiken för utskriften. Varje dokument häftas separat. Nyckelorden [JobStapleAllDocuments](../jobstaplealldocuments/) och [DocumentStaple](./) är ömsesidigt uteslutande. Det är upp till drivrutinen att avgöra hur begränsningar hanteras mellan dessa nyckelord. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple).

```cpp
class DocumentStaple : public Aspose::Page::XPS::XpsMetadata::Staple,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentStaple](./documentstaple/)(const System::ArrayPtr\<System::SharedPtr\<Staple::StapleOption\>\>\&) | Skapar en ny instans. |
## Se även

* Class [Staple](../staple/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
