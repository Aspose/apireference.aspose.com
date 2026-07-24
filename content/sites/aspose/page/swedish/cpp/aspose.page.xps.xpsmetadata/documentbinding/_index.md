---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding-klass"
linktitle: "DocumentBinding"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding-klass. Beskriver bindningsmetoden. Varje dokument bindas separat. DocumentBinding och JobBindAllDocuments är ömsesidigt uteslutande. Det är upp till drivrutinen att avgöra hur begränsningar hanteras mellan nyckelorden. i C++."
type: docs
weight: 600
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Beskriver bindningsmetoden. Varje dokument bindas separat. [DocumentBinding](./) och [JobBindAllDocuments](../jobbindalldocuments/) är ömsesidigt uteslutande. Det är upp till drivrutinen att avgöra hur begränsningar hanteras mellan nyckelorden. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Skapar en ny instans. |
## Se även

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
