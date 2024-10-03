---
title: Aspose::Page::XPS::XpsMetadata::DocumentBinding class
linktitle: DocumentBinding
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentBinding class. Describes the method of binding. Each document is bound separately. DocumentBinding and JobBindAllDocuments are mutually exclusive. It is up to the driver to determine constraint handling between keywords.  in C++.'
type: docs
weight: 600
url: /cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Describes the method of binding. Each document is bound separately. [DocumentBinding](./) and [JobBindAllDocuments](../jobbindalldocuments/) are mutually exclusive. It is up to the driver to determine constraint handling between keywords. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Methods

| Method | Description |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
