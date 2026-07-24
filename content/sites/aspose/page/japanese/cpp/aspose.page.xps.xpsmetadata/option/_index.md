---
title: "Aspose::Page::XPS::XpsMetadata::Option クラス"
linktitle: "Option"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::Option クラス。共通の PrintTicketOption を実装するクラスです。すべてのスキーマ定義オプションの基底クラスです。Option 要素は、このオプションに関連付けられたすべての Property と ScoredProperty 要素を含みます。C++ において。"
type: docs
weight: 7600
url: /ja/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


共通の [PrintTicket](../printticket/)**[Option](./)** を実装するクラスです。すべてのスキーマ定義オプションの基底クラスです。[Option](./) 要素は、このオプションに関連付けられたすべての [Property](../property/) と [ScoredProperty](../scoredproperty/) 要素を含みます。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option)。

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | このオプションのアイテムリストの末尾に項目のリストを追加します。各項目は [ScoredProperty](../scoredproperty/) または [Property](../property/) のインスタンスでなければなりません。 |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | 新しい [PrintTicket](../printticket/) オプションインスタンスを作成します。 |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | 新しい [PrintTicket](../printticket/) オプションインスタンスを作成します。 |
| [Option](./option/)(System::SharedPtr\<Option\>) | クローンオプションインスタンスを作成します。 |
## 参照

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
