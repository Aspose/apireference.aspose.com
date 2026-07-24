---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet クラス"
linktitle: "DocumentBannerSheet"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet クラス。特定のドキュメントの出力用バナーシートを説明します。バナーシートはデフォルトの PageMediaSize で、デフォルトの PageMediaType を使用して出力する必要があります。また、バナーシートはジョブの残りの部分から分離されるべきです。これは、DocumentDuplex、DocumentStaple、DocumentBinding などの仕上げや処理オプションにバナーシートが含まれないことを意味します。バナーシートはジョブの残りから分離される場合とされない場合があります。これは、ジョブの仕上げや処理オプションにドキュメントバナーシートが含まれる可能性があることを意味します。バナーシートはドキュメントの最初のシートとして配置されるべきです。C++ において。"
type: docs
weight: 400
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


特定のドキュメントの出力用バナーシートを説明します。バナーシートはデフォルトの [PageMediaSize](../pagemediasize/) で、デフォルトの [PageMediaType](../pagemediatype/) を使用して出力する必要があります。また、バナーシートはジョブの残りから分離されるべきです。これは、[DocumentDuplex](../documentduplex/)、[DocumentStaple](../documentstaple/)、[DocumentBinding](../documentbinding/) などの仕上げや処理オプションにバナーシートが含まれないことを意味します。バナーシートはジョブの残りから分離される場合とされない場合があります。これは、ジョブの仕上げや処理オプションにドキュメントバナーシートが含まれる可能性があることを意味します。バナーシートはドキュメントの最初のシートとして配置されるべきです。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet)。

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
