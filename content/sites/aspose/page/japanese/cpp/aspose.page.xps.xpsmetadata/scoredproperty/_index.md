---
title: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class"
linktitle: "ScoredProperty"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class. 共通の PrintTicketScoredProperty を実装するクラスです。すべてのスキーマ定義されたスコアドプロパティの基底クラスです。ScoredProperty 要素は Option 定義に固有のプロパティを宣言します。このようなプロパティは、要求された Option がデバイスがサポートする Option とどれだけ一致しているかを評価する際に比較されるべきです。（C++）"
type: docs
weight: 14600
url: /ja/cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


共通の [PrintTicket](../printticket/)**[ScoredProperty](./)** を実装するクラスです。すべてのスキーマ定義されたスコアドプロパティの基底クラスです。**[ScoredProperty](./)** 要素は [Option](../option/) 定義に固有のプロパティを宣言します。このようなプロパティは、要求された [Option](../option/) がデバイスがサポートする [Option](../option/) とどれだけ一致しているかを評価する際に比較されるべきです。[https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty).

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | 新しいインスタンスを作成します。 |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
