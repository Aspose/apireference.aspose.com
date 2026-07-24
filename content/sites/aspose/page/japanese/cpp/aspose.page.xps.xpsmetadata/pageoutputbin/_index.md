---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin クラス"
linktitle: "PageOutputBin"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin クラス。デバイスでサポートされるビンの全リストを説明します。ページ単位で出力ビンを指定できます。JobOutputBin、DocumentOutputBin、PageOutputBin キーワードは相互に排他的で、PrintTicket または Print Capabilities ドキュメントで指定できるのは 1 つだけです。C++ において。"
type: docs
weight: 11400
url: /ja/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


デバイスでサポートされるビンの全リストを説明します。ページ単位で出力ビンを指定できます。[JobOutputBin](../joboutputbin/)、[DocumentOutputBin](../documentoutputbin/) および [PageOutputBin](./) キーワードは相互に排他的で、[PrintTicket](../printticket/) または Print Capabilities ドキュメントで指定できるのは 1 つだけです。[https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin)。

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
