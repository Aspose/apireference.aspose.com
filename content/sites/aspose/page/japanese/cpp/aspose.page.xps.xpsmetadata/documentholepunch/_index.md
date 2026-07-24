---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch クラス"
linktitle: "DocumentHolePunch"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch クラス。出力の穴あけ特性を説明します。各ドキュメントは個別に穴あけされます。JobHolePunch と DocumentHolePunch キーワードは相互に排他的で、PrintTicket または Print Capabilities ドキュメントで同時に指定すべきではありません。C++ において。"
type: docs
weight: 1500
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


出力の穴あけ特性を説明します。各ドキュメントは個別に穴あけされます。[JobHolePunch](../jobholepunch/) と [DocumentHolePunch](./) キーワードは相互に排他的です。両方を同時に [PrintTicket](../printticket/) または Print Capabilities ドキュメントで指定すべきではありません。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch)。

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
