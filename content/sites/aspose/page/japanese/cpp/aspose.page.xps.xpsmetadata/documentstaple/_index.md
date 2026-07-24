---
title: "Aspose::Page::XPS::XpsMetadata::DocumentStaple class"
linktitle: "DocumentStaple"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentStaple クラス。出力のホチキス特性を説明します。各ドキュメントは個別にホチキス留めされます。JobStapleAllDocuments と DocumentStaple キーワードは相互に排他的です。これらのキーワード間の制約処理はドライバーが決定します。 in C++"
type: docs
weight: 2600
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class


出力のホチキス特性を説明します。各ドキュメントは個別にホチキス留めされます。[JobStapleAllDocuments](../jobstaplealldocuments/) と [DocumentStaple](./) キーワードは相互に排他的です。これらのキーワード間の制約処理はドライバーが決定します。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple)。

```cpp
class DocumentStaple : public Aspose::Page::XPS::XpsMetadata::Staple,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentStaple](./documentstaple/)(const System::ArrayPtr\<System::SharedPtr\<Staple::StapleOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Staple](../staple/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
