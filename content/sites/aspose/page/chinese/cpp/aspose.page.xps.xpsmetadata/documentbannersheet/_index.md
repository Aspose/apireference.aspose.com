---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet 类"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet 类。描述特定文档要输出的横幅纸张。横幅纸张应使用默认的 PageMediaSize 并使用默认的 PageMediaType 输出。横幅纸张还应与作业的其余部分隔离。这意味着任何装订或处理选项（如 DocumentDuplex、DocumentStaple 或 DocumentBinding）不应包括横幅纸张。横幅纸张可能会也可能不会与作业其余部分隔离。这意味着任何作业的装订或处理选项，可能会包括文档横幅纸张。横幅纸张应作为文档的第一张纸张出现。在 C++ 中。"
type: docs
weight: 400
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


描述特定文档要输出的横幅纸张。横幅纸张应使用默认的 [PageMediaSize](../pagemediasize/) 并使用默认的 [PageMediaType](../pagemediatype/) 输出。横幅纸张还应与作业的其余部分隔离。这意味着任何装订或处理选项（如 [DocumentDuplex](../documentduplex/)、[DocumentStaple](../documentstaple/)、或 [DocumentBinding](../documentbinding/)）不应包括横幅纸张。横幅纸张可能会也可能不会与作业其余部分隔离。这意味着任何作业的装订或处理选项，可能会包括文档横幅纸张。横幅纸张应作为文档的第一张纸张出现。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet)。

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
