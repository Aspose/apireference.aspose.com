---
title: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex クラス"
linktitle: "DocumentDuplex"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex クラス。出力の両面特性を記述します。両面機能により媒体の両面に印刷できます。各ドキュメントは個別に両面処理されます。DocumentDuplex と JobDuplexAllDocumentsContiguously は相互に排他的です。これらのキーワード間の制約処理はドライバーが決定します。C++ で。"
type: docs
weight: 1400
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class


出力の両面特性を記述します。両面機能により媒体の両面に印刷できます。各ドキュメントは個別に両面処理されます。[DocumentDuplex](./) と [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/) は相互に排他的です。これらのキーワード間の制約処理はドライバーが決定します。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex)。

```cpp
class DocumentDuplex : public Aspose::Page::XPS::XpsMetadata::Duplex,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentDuplex](./documentduplex/)(const System::ArrayPtr\<System::SharedPtr\<Duplex::DuplexOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Duplex](../duplex/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
