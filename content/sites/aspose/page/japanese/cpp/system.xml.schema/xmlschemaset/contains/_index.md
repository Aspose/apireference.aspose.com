---
title: "System::Xml::Schema::XmlSchemaSet::Contains メソッド"
linktitle: "Contains"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::Contains メソッド。C++ の XmlSchemaSet に指定された XML スキーマ定義言語 (XSD) XmlSchema オブジェクトが含まれているかどうかを示します。"
type: docs
weight: 400
url: /ja/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


指定された XML [Schema](../../) 定義言語 (XSD) [XmlSchema](../../xmlschema/) オブジェクトが [XmlSchemaSet](../) に含まれているかどうかを示します。

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) オブジェクト。 |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Contains(String) method


指定されたターゲット名前空間 URI を持つ XML [Schema](../../) 定義言語 (XSD) スキーマが [XmlSchemaSet](../) に含まれているかどうかを示します。

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| targetNamespace | String | スキーマの **targetNamespace** プロパティです。 |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## 参照

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
