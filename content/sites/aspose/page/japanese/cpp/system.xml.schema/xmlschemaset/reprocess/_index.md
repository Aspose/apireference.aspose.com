---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess メソッド"
linktitle: "再処理"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess メソッド。C++ の XmlSchemaSet に既に存在する XML スキーマ定義言語 (XSD) スキーマを再処理します。"
type: docs
weight: 1500
url: /ja/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


[XmlSchemaSet](../) に既に存在する XML [Schema](../../) 定義言語 (XSD) スキーマを再処理します。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| スキーマ | SharedPtr\<XmlSchema\> | 再処理するスキーマです。 |

### ReturnValue

スキーマが有効な場合は [XmlSchema](../../xmlschema/) オブジェクトが返されます。スキーマが無効で、かつ [ValidationEventHandler](../../validationeventhandler/) が指定されている場合、**nullptr** が返され、適切な検証イベントが発生します。それ以外の場合は [XmlSchemaException](../../xmlschemaexception/) がスローされます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
