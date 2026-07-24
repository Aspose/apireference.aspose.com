---
title: "Aspose::Page::XPS::XpsMetadata::Feature class"
linktitle: "機能"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::Feature class. 共通の Print Schema 機能をカプセル化するクラスです。すべてのスキーマ定義された機能の基底クラスです。Feature 要素は、デバイス属性、ジョブフォーマット設定、またはその他の関連特性を完全に記述する Option と Property 要素の完全なリストを含みます。（C++）"
type: docs
weight: 2900
url: /ja/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


共通の Print Schema 機能をカプセル化するクラスです。すべてのスキーマ定義機能の基底クラスです。**[Feature](./)** 要素は、デバイス属性、ジョブの書式設定、またはその他の関連特性を完全に記述する [Option](../option/) と [Property](../property/) 要素の完全なリストを含みます。[https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature)。

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | この機能のアイテムリストの末尾に項目のリストを追加します。各項目は [Feature](./)、[Option](../option/) または [Property](../property/) のインスタンスでなければなりません。 |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | 新しい [PrintTicket](../printticket/) 機能インスタンスを作成します。 |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | 新しい [PrintTicket](../printticket/) 機能インスタンスを作成します。 |
## 参照

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
