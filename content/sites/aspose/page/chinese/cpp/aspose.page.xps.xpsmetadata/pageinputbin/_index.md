---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin 类"
linktitle: "PageInputBin"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin 类。描述设备中已安装的输入纸盒或设备支持的全部纸盒列表。允许在每页基础上指定输入纸盒。JobInputBin、DocumentInputBin 和 PageInputBin 关键字互斥。两者不应在同一个 PrintTicket 或打印功能文档中同时指定。 在 C++ 中。"
type: docs
weight: 10000
url: /zh/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


描述设备中已安装的输入纸盒或设备支持的全部纸盒列表。允许在每页基础上指定输入纸盒。[JobInputBin](../jobinputbin/)、[DocumentInputBin](../documentinputbin/) 和 [PageInputBin](./) 关键字互斥。两者不应在同一个 [PrintTicket](../printticket/) 或打印功能文档中同时指定。[https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin)。

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
