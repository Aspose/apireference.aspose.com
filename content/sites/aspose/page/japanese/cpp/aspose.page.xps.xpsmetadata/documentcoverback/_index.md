---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack クラス"
linktitle: "DocumentCoverBack"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack クラス。裏表紙シート（終了カバーシート）を記述します。各ドキュメントは個別のシートを持ちます。カバーシートはドキュメントの最終ページに使用される PageMediaSize と PageMediaType で印刷する必要があります。カバーシートは、指定された Option によって示されるように、DocumentDuplex や DocumentNUp などの処理オプションに統合すべきです。 C++ において。"
type: docs
weight: 1000
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


裏表紙シート（終了カバーシート）を記述します。各ドキュメントは個別のシートを持ちます。カバーシートはドキュメントの最終ページに使用される [PageMediaSize](../pagemediasize/) と [PageMediaType](../pagemediatype/) で印刷する必要があります。カバーシートは、指定された [Option](../option/) によって示されるように、[DocumentDuplex](../documentduplex/) や [DocumentNUp](../documentnup/) などの処理オプションに統合すべきです。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback)。

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
