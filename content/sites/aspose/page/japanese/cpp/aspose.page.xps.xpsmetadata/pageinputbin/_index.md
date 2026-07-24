---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin クラス"
linktitle: "PageInputBin"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin クラス。デバイスにインストールされた入力ビン、またはデバイスがサポートするビンの全リストを記述します。ページ単位で入力ビンを指定できます。JobInputBin、DocumentInputBin、PageInputBin キーワードは相互に排他的です。PrintTicket または Print Capabilities ドキュメントで同時に指定してはいけません。C++ において。"
type: docs
weight: 10000
url: /ja/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


デバイスにインストールされた入力ビン、またはデバイスがサポートするビンの全リストを記述します。ページ単位で入力ビンを指定できます。[JobInputBin](../jobinputbin/)、[DocumentInputBin](../documentinputbin/) および [PageInputBin](./) キーワードは相互に排他的です。両方を同時に [PrintTicket](../printticket/) または Print Capabilities ドキュメントで指定してはいけません。[https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin)。

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
