---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema メソッド"
linktitle: "InferSchema"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema メソッド。C++ で指定された XmlReader オブジェクトに含まれる XML ドキュメントから XML スキーマ定義言語 (XSD) スキーマを推測します。"
type: docs
weight: 400
url: /ja/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


指定された [XmlReader](../../../system.xml/xmlreader/) オブジェクトに含まれる XML ドキュメントから XML [Schema](../../) 定義言語 (XSD) スキーマを推測します。

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) オブジェクトで、スキーマを推測する対象の XML ドキュメントを含みます。 |

### ReturnValue

[XmlSchemaSet](../../xmlschemaset/) オブジェクトで、推測されたスキーマを含みます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


指定された [XmlReader](../../../system.xml/xmlreader/) オブジェクトに含まれる XML ドキュメントから XML [Schema](../../) 定義言語 (XSD) スキーマを推測し、同じターゲット名前空間を持つ [XmlSchemaSet](../../xmlschemaset/) オブジェクトに含まれる既存のスキーマを使用して推測されたスキーマを洗練します。

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) オブジェクトで、スキーマを推測する対象の XML ドキュメントを含みます。 |
| schemas | SharedPtr\<XmlSchemaSet\> | [XmlSchemaSet](../../xmlschemaset/) オブジェクトで、推測されたスキーマを洗練するために使用される既存のスキーマを含みます。 |

### ReturnValue

[XmlSchemaSet](../../xmlschemaset/) オブジェクトで、推測されたスキーマを含みます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
