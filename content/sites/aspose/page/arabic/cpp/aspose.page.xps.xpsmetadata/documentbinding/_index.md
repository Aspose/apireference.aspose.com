---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding class"
linktitle: "DocumentBinding"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding class. يصف طريقة التجليد. يتم تجليد كل مستند على حدة. DocumentBinding و JobBindAllDocuments متنافيان. الأمر متروك للسائق لتحديد معالجة القيود بين الكلمات المفتاحية. في C++."
type: docs
weight: 600
url: /ar/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


يصف طريقة التجليد. يتم تجليد كل مستند على حدة. [DocumentBinding](./) و [JobBindAllDocuments](../jobbindalldocuments/) متنافيان. الأمر متروك للسائق لتحديد معالجة القيود بين الكلمات المفتاحية. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
