---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate クラス"
linktitle: "DocumentCollate"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate クラス。出力のページ順序特性を記述します。各個別ドキュメントのすべてのページが順序付けられます。DocumentCollate と JobCollateAlldocuments は相互に排他的です。これらのキーワードの両方またはどちらか一方が実装されるかの動作と実装はドライバーに委ねられます。C++ で。"
type: docs
weight: 800
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


出力のページ順序特性を記述します。各個別ドキュメントのすべてのページが順序付けられます。[DocumentCollate](./) と JobCollateAlldocuments は相互に排他的です。これらのキーワードの両方またはどちらか一方が実装されるかの動作と実装はドライバーに委ねられます。[https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate)。

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
