---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute メソッド"
linktitle: "ValidateAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute メソッド。現在の要素コンテキストで属性名、名前空間 URI、値を検証します（C++）。"
type: docs
weight: 1600
url: /ja/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


現在の要素コンテキストで属性名、名前空間 URI、値を検証します。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | const String\& | 検証対象属性のローカル名。 |
| namespaceUri | const String\& | 検証対象属性の名前空間 URI。 |
| attributeValue | const String\& | 検証対象属性の値。 |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 属性の検証が成功したときにプロパティが設定される [XmlSchemaInfo](../../xmlschemainfo/) オブジェクトです。このパラメーターは **nullptr** にできます。 |

### ReturnValue

検証済み属性の値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


現在の要素コンテキストで属性名、名前空間 URI、値を検証します。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | const String\& | 検証対象属性のローカル名。 |
| namespaceUri | const String\& | 検証対象属性の名前空間 URI。 |
| attributeValue | XmlValueGetter | [XmlValueGetter](../../xmlvaluegetter/) コールバックで、属性の値を属性の XML [Schema](../../) 定義言語 (XSD) 型と互換性のある型として渡すために使用されます。 |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 属性の検証が成功したときにプロパティが設定される [XmlSchemaInfo](../../xmlschemainfo/) オブジェクトです。このパラメーターは **nullptr** にできます。 |

### ReturnValue

検証済み属性の値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
