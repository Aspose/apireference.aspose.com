---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin 类"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin 类。描述设备支持的完整纸盒列表。允许在每个文档基础上指定输出纸盒。JobOutputBin、DocumentOutputBin 和 PageOutputBin 关键字互斥，在 PrintTicket 或打印功能文档中只能指定一个。C++ 中。"
type: docs
weight: 2100
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


描述设备支持的完整纸盒列表。允许在每个文档基础上指定输出纸盒。[JobOutputBin](../joboutputbin/)、[DocumentOutputBin](./) 和 [PageOutputBin](../pageoutputbin/) 关键字互斥，在 [PrintTicket](../printticket/) 或打印功能文档中只能指定一个。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin)。

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
