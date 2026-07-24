---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding Klasse"
linktitle: "DocumentBinding"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding Klasse. Beschreibt die Bindemethode. Jedes Dokument wird separat gebunden. DocumentBinding und JobBindAllDocuments schließen sich gegenseitig aus. Es liegt am Treiber, die Behandlung von Einschränkungen zwischen Schlüsselwörtern zu bestimmen. in C++."
type: docs
weight: 600
url: /de/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Beschreibt die Bindemethode. Jedes Dokument wird separat gebunden. [DocumentBinding](./) und [JobBindAllDocuments](../jobbindalldocuments/) schließen sich gegenseitig aus. Es liegt am Treiber, die Behandlung von Einschränkungen zwischen Schlüsselwörtern zu bestimmen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

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

| Methode | Beschreibung |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
