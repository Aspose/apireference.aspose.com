---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges 类"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges 类。描述文档的页数输出范围。参数值必须符合以下结构：C++ 中。"
type: docs
weight: 2200
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


描述文档的页数输出范围。参数值必须符合以下结构：

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | 创建一个新实例。 |
## 备注


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## 另见

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
