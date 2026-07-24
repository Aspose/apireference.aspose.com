---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive メソッド"
linktitle: "RemoveRecursive"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive メソッド。C++ で指定された XML スキーマ定義言語 (XSD) スキーマと、そのインポートされたすべてのスキーマを XmlSchemaSet から削除します。"
type: docs
weight: 1400
url: /ja/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


指定された XML [Schema](../../) 定義言語 (XSD) スキーマと、そのインポートされたすべてのスキーマを [XmlSchemaSet](../) から削除します。

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | 削除対象の [XmlSchema](../../xmlschema/) オブジェクト（[XmlSchemaSet](../) から）。 |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
