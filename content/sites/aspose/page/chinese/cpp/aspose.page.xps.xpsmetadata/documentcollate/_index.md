---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate 类"
linktitle: "DocumentCollate"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate 类。描述输出的分页特性。每个单独文档中的所有页面都会进行分页。DocumentCollate 和 JobCollateAlldocuments 互斥。这两个关键字是实现两者都实现还是仅实现其中一个的行为和实现方式由驱动程序决定。 在 C++ 中。"
type: docs
weight: 800
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


描述输出的分页特性。每个单独文档中的所有页面都会进行分页。[DocumentCollate](./) 和 JobCollateAlldocuments 互斥。这两个关键字是实现两者都实现还是仅实现其中一个的行为和实现方式由驱动程序决定。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate)。

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
