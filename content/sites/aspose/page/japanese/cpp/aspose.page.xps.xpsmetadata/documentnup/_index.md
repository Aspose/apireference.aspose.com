---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp クラス"
linktitle: "DocumentNUp"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp クラス。複数の論理ページを単一の物理シートに出力する形式とフォーマットを記述します。各ドキュメントは個別にコンパイルされます。DocumentNUp と JobNUpAllDocumentsContiguously は相互に排他的です。これらのキーワード間の制約処理はドライバーが決定します。 C++ において。"
type: docs
weight: 2000
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


複数の論理ページを単一の物理シートに出力する形式とフォーマットを記述します。各ドキュメントは個別にコンパイルされます。**[DocumentNUp](./)** と [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) は相互に排他的です。これらのキーワード間の制約処理はドライバーが決定します。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup)。

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | **PagesPerSheet** スコアドプロパティ値を持つオプションを追加します。物理シートあたりの論理ページ数を指定します。 |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
