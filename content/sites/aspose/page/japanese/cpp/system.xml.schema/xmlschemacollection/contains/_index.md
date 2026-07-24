---
title: "System::Xml::Schema::XmlSchemaCollection::Contains メソッド"
linktitle: "Contains"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollection::Contains メソッド。C++ で指定された XmlSchema の targetNamespace がコレクションに含まれているかどうかを示す値を返します。"
type: docs
weight: 300
url: /ja/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


指定された [XmlSchema](../../xmlschema/) の **targetNamespace** がコレクションに含まれているかどうかを示す値を返します。

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) オブジェクト。 |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


指定された名前空間を持つスキーマがコレクションに存在するかどうかを示す値を返します。

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ns | const String\& | スキーマに関連付けられた名前空間 URI。XML スキーマの場合、通常はターゲット名前空間になります。 |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## 参照

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
