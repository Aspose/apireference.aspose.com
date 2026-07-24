---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch 类"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch 类。描述了输出的打孔特性。每个文档单独打孔。JobHolePunch 和 DocumentHolePunch 关键字相互排斥，不能在同一 PrintTicket 或 Print Capabilities 文档中同时指定。 适用于 C++。"
type: docs
weight: 1500
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


描述了输出的打孔特性。每个文档单独打孔。[JobHolePunch](../jobholepunch/) 和 [DocumentHolePunch](./) 关键字相互排斥，不能在同一 [PrintTicket](../printticket/) 或 Print Capabilities 文档中同时指定。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch)。

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
