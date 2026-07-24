---
title: "Aspose::Page::XPS::XpsMetadata::PagePoster 类"
linktitle: "PagePoster"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::PagePoster 类。描述单页输出到多个物理介质纸张的情况。C++ 中。"
type: docs
weight: 11800
url: /zh/cpp/aspose.page.xps.xpsmetadata/pageposter/
---
## PagePoster class


描述单页输出到多张物理介质纸张的情况。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageposter](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageposter)。

```cpp
class PagePoster : public Aspose::Page::XPS::XpsMetadata::Feature,
                   public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                   public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                   public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | 添加一个带有 **PagesPerSheet** 计分属性值的选项。指定每个逻辑页对应的物理纸张数量。 |
| [PagePoster](./pageposter/)() | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
