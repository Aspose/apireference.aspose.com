---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement メソッド"
linktitle: "ValidateElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement メソッド。C++ で現在のコンテキストの要素を検証します。"
type: docs
weight: 1700
url: /ja/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


現在のコンテキストで要素を検証します。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | const String\& | 検証対象要素のローカル名。 |
| namespaceUri | const String\& | 検証対象要素の名前空間 URI。 |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 要素名の検証が成功したときにプロパティが設定される [XmlSchemaInfo](../../xmlschemainfo/) オブジェクト。このパラメータは **nullptr** にすることができます。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


現在のコンテキストで、指定された **xsi:Type**、**xsi:Nil**、**xsi:SchemaLocation**、および **xsi:NoNamespaceSchemaLocation** 属性値を使用して要素を検証します。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | const String\& | 検証対象要素のローカル名。 |
| namespaceUri | const String\& | 検証対象要素の名前空間 URI。 |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 要素名の検証が成功したときにプロパティが設定される [XmlSchemaInfo](../../xmlschemainfo/) オブジェクト。このパラメータは **nullptr** にすることができます。 |
| xsiType | const String\& | 要素の **xsi:Type** 属性値。このパラメータは **nullptr** にすることができます。 |
| xsiNil | const String\& | 要素の **xsi:Nil** 属性値。このパラメータは **nullptr** にすることができます。 |
| xsiSchemaLocation | const String\& | 要素の **xsi:SchemaLocation** 属性値。このパラメータは **nullptr** にすることができます。 |
| xsiNoNamespaceSchemaLocation | const String\& | 要素の **xsi:NoNamespaceSchemaLocation** 属性値。このパラメータは **nullptr** にすることができます。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
