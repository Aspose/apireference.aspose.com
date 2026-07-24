---
title: "System::Xml::Schema::IXmlSchemaInfo クラス"
linktitle: "IXmlSchemaInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::IXmlSchemaInfo クラス。C++ における検証済みXMLノードのスキーマ検証後情報セットを定義します。"
type: docs
weight: 100
url: /ja/cpp/system.xml.schema/ixmlschemainfo/
---
## IXmlSchemaInfo class


検証済み XML ノードのスキーマ検証後情報セットを定義します。

```cpp
class IXmlSchemaInfo : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_IsDefault](./get_isdefault/)() | XML [Schema](../) 定義言語 (XSD) スキーマ検証中にデフォルトが適用された結果としてこの検証済み XML ノードが設定されたかどうかを示す値を返します。 |
| virtual [get_IsNil](./get_isnil/)() | この検証済み XML ノードの値が **nil** であるかどうかを示す値を返します。 |
| virtual [get_MemberType](./get_membertype/)() | この検証済み XML ノードの動的スキーマ型を返します。 |
| virtual [get_SchemaAttribute](./get_schemaattribute/)() | この検証済みXMLノードに対応する、コンパイルされた[XmlSchemaAttribute](../xmlschemaattribute/)を返します。 |
| virtual [get_SchemaElement](./get_schemaelement/)() | この検証済みXMLノードに対応する、コンパイルされた[XmlSchemaElement](../xmlschemaelement/)を返します。 |
| virtual [get_SchemaType](./get_schematype/)() | この検証済み XML ノードの静的 XML [Schema](../) 定義言語 (XSD) スキーマ型を返します。 |
| virtual [get_Validity](./get_validity/)() | この検証済みXMLノードの [XmlSchemaValidity](../xmlschemavalidity/) 値を返します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
