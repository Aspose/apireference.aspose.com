---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate klass"
linktitle: "DocumentCollate"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate klass. Beskriver sorteringsegenskaperna för utskriften. Alla sidor i varje enskilt dokument sorteras. DocumentCollate och JobCollateAlldocuments är ömsesidigt uteslutande. Beteendet och implementeringen av huruvida båda eller endast ett av dessa nyckelord implementeras lämnas åt drivrutinen.  i C++."
type: docs
weight: 800
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Beskriver sorteringsegenskaperna för utskriften. Alla sidor i varje enskilt dokument sorteras. [DocumentCollate](./) och JobCollateAlldocuments är ömsesidigt uteslutande. Beteendet och implementeringen av huruvida båda eller endast ett av dessa nyckelord implementeras lämnas åt drivrutinen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Skapar en ny instans. |
## Se även

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
