---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding クラス"
linktitle: "DocumentBinding"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding クラス。バインディング方法を記述します。各ドキュメントは個別にバインドされます。DocumentBinding と JobBindAllDocuments は相互に排他的です。キーワード間の制約処理を決定するのはドライバー次第です。C++ において。"
type: docs
weight: 600
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


バインディング方法を記述します。各ドキュメントは個別にバインドされます。[DocumentBinding](./) と [JobBindAllDocuments](../jobbindalldocuments/) は相互に排他的です。キーワード間の制約処理を決定するのはドライバー次第です。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding)。

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
