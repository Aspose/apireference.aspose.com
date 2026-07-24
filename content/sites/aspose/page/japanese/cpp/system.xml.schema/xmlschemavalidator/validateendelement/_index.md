---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement メソッド"
linktitle: "ValidateEndElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement メソッド。要素のテキスト内容が単純コンテンツの場合はそのデータ型に従って有効かどうかを検証し、複合コンテンツの場合は現在の要素の内容が完了しているかどうかを検証します（C++）。"
type: docs
weight: 1800
url: /ja/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


単純コンテンツを持つ要素については、要素のテキスト内容がそのデータ型に従って有効かどうかを検証し、複合コンテンツを持つ要素については、現在の要素の内容が完全であるかどうかを検証します。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 要素の検証が成功したときにプロパティが設定される [XmlSchemaInfo](../../xmlschemainfo/) オブジェクト。このパラメーターは **nullptr** にすることができます。 |

### ReturnValue

要素が単純コンテンツを持つ場合の、解析された型付きテキスト値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


指定された要素のテキスト内容がそのデータ型に従って有効かどうかを検証します。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 要素のテキスト内容の検証が成功したときにプロパティが設定される [XmlSchemaInfo](../../xmlschemainfo/) オブジェクト。このパラメーターは **nullptr** にすることができます。 |
| typedValue | const SharedPtr\<Object\>\& | 要素の型付きテキスト内容。 |

### ReturnValue

要素の解析された型付き単純コンテンツ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
