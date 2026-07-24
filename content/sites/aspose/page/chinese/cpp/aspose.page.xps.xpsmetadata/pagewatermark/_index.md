---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark 类"
linktitle: "PageWatermark"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark 类。描述输出的水印设置和水印特性。水印适用于逻辑页面，而非物理页面。例如，如果启用了 DocumentDuplex，则水印会出现在每张纸张的每个 NUp 页面上。如果 DocumentDuplex，PagesPerSheet=2，则每张纸张会有 2 个水印。（在 C++ 中）"
type: docs
weight: 13100
url: /zh/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


描述输出的水印设置和水印特性。水印适用于逻辑页面，而非物理页面。例如，如果 [DocumentDuplex](../documentduplex/) 已启用，水印会出现在每张纸张的每个 **[NUp](../nup/)** 页面上。如果 [DocumentDuplex](../documentduplex/)，**PagesPerSheet**=2，则每张纸张会有 2 个水印。[https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark)。

```cpp
class PageWatermark : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Nested classes

* Class [IPageWatermarkItem](./ipagewatermarkitem/)
* Class [IPageWatermarkOptionItem](./ipagewatermarkoptionitem/)
* Class [Layering](./layering/)
* Class [LayeringOption](./layeringoption/)
* Class [PageWatermarkOption](./pagewatermarkoption/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
