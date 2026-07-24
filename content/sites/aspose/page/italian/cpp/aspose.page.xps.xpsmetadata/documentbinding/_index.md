---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding class"
linktitle: "DocumentBinding"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding class. Descrive il metodo di rilegatura. Ogni documento è rilegato separatamente. DocumentBinding e JobBindAllDocuments sono mutuamente esclusivi. Spetta al driver determinare la gestione dei vincoli tra le parole chiave. in C++."
type: docs
weight: 600
url: /it/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Descrive il metodo di rilegatura. Ogni documento è rilegato separatamente. [DocumentBinding](./) e [JobBindAllDocuments](../jobbindalldocuments/) sono mutuamente esclusivi. Spetta al driver determinare la gestione dei vincoli tra le parole chiave. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
