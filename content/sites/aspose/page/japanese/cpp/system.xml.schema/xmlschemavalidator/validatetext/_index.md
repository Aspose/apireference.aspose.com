---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateText メソッド"
linktitle: "ValidateText"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateText メソッド。指定されたテキスト文字列が現在の要素コンテキストで許可されているかを検証し、現在の要素が単純コンテンツを持つ場合は検証のためにテキストを蓄積します（C++）。"
type: docs
weight: 2000
url: /ja/cpp/system.xml.schema/xmlschemavalidator/validatetext/
---
## XmlSchemaValidator::ValidateText(const String\&) method


指定されたテキスト **string** が現在の要素コンテキストで許可されているかを検証し、現在の要素が単純コンテンツを持つ場合は検証のためにテキストを蓄積します。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateText(const String &elementValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| elementValue | const String\& | 現在の要素コンテキストで検証するテキスト **string**。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateText(XmlValueGetter) method


指定された [XmlValueGetter](../../xmlvaluegetter/) オブジェクトが返すテキストが現在の要素コンテキストで許可されているかを検証し、現在の要素が単純コンテンツを持つ場合は検証のためにテキストを蓄積します。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateText(XmlValueGetter elementValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| elementValue | XmlValueGetter | 属性の XML [Schema](../../) 定義言語 (XSD) 型と互換性のある型としてテキスト値を渡すために使用される [XmlValueGetter](../../xmlvaluegetter/) コールバックです。 |

## 参照

* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
