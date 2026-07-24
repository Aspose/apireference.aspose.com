---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark クラス"
linktitle: "PageWatermark"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark クラス。出力の透かし設定と透かしの特性を記述します。透かしは物理ページではなく論理ページに適用されます。例えば、DocumentDuplex が有効な場合、各シートの各 NUp ページに透かしが表示されます。DocumentDuplex、PagesPerSheet=2 の場合、各シートに 2 つの透かしが付きます。  in C++."
type: docs
weight: 13100
url: /ja/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


出力の透かし設定と透かしの特性を記述します。透かしは物理ページではなく論理ページに適用されます。例えば、[DocumentDuplex](../documentduplex/) が有効な場合、各シートの各 **[NUp](../nup/)** ページに透かしが表示されます。[DocumentDuplex](../documentduplex/) の場合、**PagesPerSheet**=2 で、各シートに 2 つの透かしが付きます。[https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark)。

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
## メソッド

| メソッド | 説明 |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
