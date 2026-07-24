---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin 类"
linktitle: "PageOutputBin"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin 类。描述了设备支持的全部纸盒列表。允许在每页基础上指定输出纸盒。JobOutputBin、DocumentOutputBin 和 PageOutputBin 关键字相互排斥，在 PrintTicket 或 Print Capabilities 文档中只能指定一个。 适用于 C++。"
type: docs
weight: 11400
url: /zh/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


描述了设备支持的全部纸盒列表。允许在每页基础上指定输出纸盒。[JobOutputBin](../joboutputbin/)、[DocumentOutputBin](../documentoutputbin/) 和 [PageOutputBin](./) 关键字相互排斥，在 [PrintTicket](../printticket/) 或 Print Capabilities 文档中只能指定一个。[https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin)。

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
