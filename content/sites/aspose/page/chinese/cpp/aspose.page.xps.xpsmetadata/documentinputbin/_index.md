---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin 类"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin 类。描述设备中已安装的输入纸盒或设备支持的全部纸盒列表。JobInputBin、DocumentInputBin 和 PageInputBin 关键字相互排斥。两者不应在 PrintTicket 或打印功能文档中同时指定。 in C++."
type: docs
weight: 1800
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


描述设备中已安装的输入纸盒或设备支持的全部纸盒列表。[JobInputBin](../jobinputbin/)、[DocumentInputBin](./) 和 [PageInputBin](../pageinputbin/) 关键字相互排斥。两者不应在 [PrintTicket](../printticket/) 或打印功能文档中同时指定。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin)。

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
