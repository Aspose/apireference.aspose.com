---
title: "Aspose::Page::XPS::XpsMetadata::PageColorManagement クラス"
linktitle: "PageColorManagement"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageColorManagement クラス。現在のページのカラー管理を構成します。これは SHIM の DM_ICMMethod Add System では自動とみなされます。どのコンポーネントがカラー管理を実行すべきか（例：ドライバ）を記述します。C++で。"
type: docs
weight: 8900
url: /ja/cpp/aspose.page.xps.xpsmetadata/pagecolormanagement/
---
## PageColorManagement class


現在のページのカラー管理を構成します。これは SHIM の DM_ICMMethod Add [System](../../system/) では自動とみなされます。どのコンポーネントがカラー管理を実行すべきか（例：ドライバ）を記述します。[https://docs.microsoft.com/en-us/windows/win32/printdocs/pagecolormanagement](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagecolormanagement)。

```cpp
class PageColorManagement : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Nested classes

* Class [PageColorManagementOption](./pagecolormanagementoption/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [PageColorManagement](./pagecolormanagement/)(const System::ArrayPtr\<System::SharedPtr\<PageColorManagement::PageColorManagementOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
