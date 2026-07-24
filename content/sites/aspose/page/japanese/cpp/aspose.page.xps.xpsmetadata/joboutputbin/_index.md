---
title: "Aspose::Page::XPS::XpsMetadata::JobOutputBin クラス"
linktitle: "JobOutputBin"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::JobOutputBin クラス。デバイスにインストールされた出力ビン、またはデバイスがサポートするビンの全リストを記述します。JobOutputBin、DocumentOutputBin、PageOutputBin キーワードは相互に排他的で、PrintTicket または Print Capabilities ドキュメントではいずれか一つだけを指定すべきです。C++ において。"
type: docs
weight: 6100
url: /ja/cpp/aspose.page.xps.xpsmetadata/joboutputbin/
---
## JobOutputBin class


デバイスにインストールされた出力ビン、またはデバイスがサポートするビンの全リストを記述します。[JobOutputBin](./)、[DocumentOutputBin](../documentoutputbin/) および [PageOutputBin](../pageoutputbin/) キーワードは相互に排他的で、いずれか一つだけを [PrintTicket](../printticket/) または Print Capabilities ドキュメントで指定すべきです。[https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin)。

```cpp
class JobOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [JobOutputBin](./joboutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
