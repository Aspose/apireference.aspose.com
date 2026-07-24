---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin クラス"
linktitle: "DocumentInputBin"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin クラス。デバイスにインストールされた入力ビン、またはデバイスがサポートするビンの完全なリストを記述します。JobInputBin、DocumentInputBin、PageInputBin キーワードは相互に排他的です。PrintTicket または Print Capabilities ドキュメントで同時に指定してはいけません。 C++で。"
type: docs
weight: 1800
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


デバイスにインストールされた入力ビン、またはデバイスがサポートするビンの完全なリストを記述します。 [JobInputBin](../jobinputbin/)、[DocumentInputBin](./)、および [PageInputBin](../pageinputbin/) キーワードは相互に排他的です。両方を同時に [PrintTicket](../printticket/) または Print Capabilities ドキュメントで指定すべきではありません。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin)。

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
