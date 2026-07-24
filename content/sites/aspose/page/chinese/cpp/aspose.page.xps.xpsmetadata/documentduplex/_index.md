---
title: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex 类"
linktitle: "DocumentDuplex"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex 类。描述输出的双面特性。双面功能允许在介质的两面进行打印。每个文档单独进行双面处理。DocumentDuplex 和 JobDuplexAllDocumentsContiguously 互斥。由驱动程序决定这些关键字之间的约束处理方式。 在 C++ 中。"
type: docs
weight: 1400
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class


描述输出的双面特性。双面功能允许在介质的两面进行打印。每个文档单独进行双面处理。[DocumentDuplex](./) 和 [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/) 互斥。由驱动程序决定这些关键字之间的约束处理方式。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex)。

```cpp
class DocumentDuplex : public Aspose::Page::XPS::XpsMetadata::Duplex,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentDuplex](./documentduplex/)(const System::ArrayPtr\<System::SharedPtr\<Duplex::DuplexOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Duplex](../duplex/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
