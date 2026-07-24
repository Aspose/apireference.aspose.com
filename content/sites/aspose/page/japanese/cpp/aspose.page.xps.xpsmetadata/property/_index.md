---
title: "Aspose::Page::XPS::XpsMetadata::Property クラス"
linktitle: "プロパティ"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::Property クラス。共通の PrintTicketProperty を実装するクラスです。すべてのスキーマ定義プロパティの基本クラスです。Property 要素は、name 属性で指定された名前を持つデバイス、ジョブの書式設定、またはその他の関連プロパティを宣言します。Value 要素は Property に値を割り当てるために使用されます。Property は複雑になることがあり、複数のサブプロパティを含む場合があります。サブプロパティも Property 要素で表されます。C++ において。"
type: docs
weight: 14300
url: /ja/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


共通の [PrintTicket](../printticket/)**[Property](./)** を実装するクラスです。すべてのスキーマ定義プロパティの基本クラスです。**[Property](./)** 要素は、name 属性で指定された名前を持つデバイス、ジョブの書式設定、またはその他の関連プロパティを宣言します。[Value](../value/) 要素は **[Property](./)** に値を割り当てるために使用されます。**[Property](./)** は複雑になることがあり、複数のサブプロパティを含む場合があります。サブプロパティも **[Property](./)** 要素で表されます。[https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property)。

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | 新しいインスタンスを作成します。 |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
