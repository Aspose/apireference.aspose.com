---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding class"
linktitle: "DocumentBinding"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding class. Beschrijft de bindmethode. Elk document wordt afzonderlijk gebonden. DocumentBinding en JobBindAllDocuments zijn wederzijds exclusief. Het is aan de driver om de afhandeling van beperkingen tussen trefwoorden te bepalen.  in C++."
type: docs
weight: 600
url: /nl/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Beschrijft de bindmethode. Elk document wordt afzonderlijk gebonden. [DocumentBinding](./) en [JobBindAllDocuments](../jobbindalldocuments/) zijn wederzijds exclusief. Het is aan de driver om de afhandeling van beperkingen tussen trefwoorden te bepalen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
