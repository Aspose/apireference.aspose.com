---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin クラス"
linktitle: "DocumentOutputBin"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin クラス。デバイスでサポートされるビンの全リストを記述します。ドキュメント単位で出力ビンを指定できます。JobOutputBin、DocumentOutputBin、PageOutputBin キーワードは相互に排他的で、PrintTicket または Print Capabilities ドキュメントではいずれか一つだけを指定すべきです。C++ において。"
type: docs
weight: 2100
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


デバイスでサポートされるビンの全リストを記述します。ドキュメント単位で出力ビンを指定できます。[JobOutputBin](../joboutputbin/)、[DocumentOutputBin](./) および [PageOutputBin](../pageoutputbin/) キーワードは相互に排他的で、[PrintTicket](../printticket/) または Print Capabilities ドキュメントではいずれか一つだけを指定すべきです。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin)。

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
