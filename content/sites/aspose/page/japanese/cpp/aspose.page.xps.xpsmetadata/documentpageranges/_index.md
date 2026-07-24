---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges クラス"
linktitle: "DocumentPageRanges"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges クラス。ドキュメントのページ単位の出力範囲を記述します。パラメータ値は以下の構造に従う必要があります：C++ において。"
type: docs
weight: 2200
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


ドキュメントのページ単位での出力範囲を記述します。パラメータ値は以下の構造に従う必要があります:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | 新しいインスタンスを作成します。 |
## 備考


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## 参照

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
