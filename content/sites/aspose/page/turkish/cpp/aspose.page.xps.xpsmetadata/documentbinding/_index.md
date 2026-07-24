---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding sınıfı"
linktitle: "DocumentBinding"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding sınıfı. Bağlama yöntemini açıklar. Her belge ayrı ayrı bağlanır. DocumentBinding ve JobBindAllDocuments birbirini dışlar. Sürücünün anahtar kelimeler arasındaki kısıtlama işleme kararını vermesi gerekir. C++'da."
type: docs
weight: 600
url: /tr/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Bağlama yöntemini açıklar. Her belge ayrı ayrı bağlanır. [DocumentBinding](./) ve [JobBindAllDocuments](../jobbindalldocuments/) birbirini dışlar. Sürücünün anahtar kelimeler arasındaki kısıtlama işleme kararını vermesi gerekir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
