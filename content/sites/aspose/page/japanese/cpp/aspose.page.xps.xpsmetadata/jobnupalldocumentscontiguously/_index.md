---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class. 複数の論理ページを 1 枚の物理シートに出力することを記述します。ジョブ内のすべてのドキュメントは連続してまとめられます。JobNUpAllDocumentsContiguously と DocumentNUp は相互に排他的です。これらのキーワード間の制約処理はドライバーが決定します。（C++）"
type: docs
weight: 5900
url: /ja/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


複数の論理ページを 1 枚の物理シートに出力することを記述します。ジョブ内のすべてのドキュメントは連続してまとめられます。[JobNUpAllDocumentsContiguously](./) と [DocumentNUp](../documentnup/) は相互に排他的です。これらのキーワード間の制約処理はドライバーが決定します。[https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | **PagesPerSheet** スコアドプロパティ値を持つオプションを追加します。物理シートあたりの論理ページ数を指定します。 |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
