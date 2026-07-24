---
title: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes メソッド"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes メソッド。C++ の要素コンテキストで XmlSchemaValidator::ValidateAttribute メソッドを使用して事前に検証されていないデフォルト値を持つ属性に対し、デフォルト属性の同一性制約を検証し、指定された List に XmlSchemaAttribute オブジェクトを追加します。"
type: docs
weight: 900
url: /ja/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


デフォルト属性の同一性制約を検証し、要素コンテキストで [XmlSchemaValidator::ValidateAttribute](../validateattribute/) メソッドを使用して事前に検証されていないデフォルト値を持つ属性について、指定された List に [XmlSchemaAttribute](../../xmlschemaattribute/) オブジェクトを追加します。

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | 要素コンテキストで検証中にまだ出現していない属性のために、[XmlSchemaAttribute](../../xmlschemaattribute/) オブジェクトを格納する List。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
