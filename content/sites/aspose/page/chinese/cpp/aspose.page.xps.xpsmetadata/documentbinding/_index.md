---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding 类"
linktitle: "DocumentBinding"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding 类。描述装订方式。每个文档单独装订。DocumentBinding 和 JobBindAllDocuments 互斥。由驱动程序决定关键字之间的约束处理方式。 在 C++ 中。"
type: docs
weight: 600
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


描述装订方式。每个文档单独装订。[DocumentBinding](./) 和 [JobBindAllDocuments](../jobbindalldocuments/) 互斥。由驱动程序决定关键字之间的约束处理方式。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding)。

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
