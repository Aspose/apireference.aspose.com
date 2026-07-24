---
title: "System::Xml::Schema::XmlSchemaInfo クラス"
linktitle: "XmlSchemaInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaInfo クラス。C++ における検証済み XML ノードのスキーマ検証後情報セットを表します。"
type: docs
weight: 3800
url: /ja/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


検証済み XML ノードのスキーマ検証後情報セットを表します。

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | この検証済み XML ノードのコンテンツタイプに対応する [XmlSchemaContentType](../xmlschemacontenttype/) オブジェクトを返します。 |
| [get_IsDefault](./get_isdefault/)() override | XML [Schema](../) 定義言語 (XSD) スキーマ検証中にデフォルトが適用された結果としてこの検証済み XML ノードが設定されたかどうかを示す値を返します。 |
| [get_IsNil](./get_isnil/)() override | この検証済み XML ノードの値が **nil** であるかどうかを示す値を返します。 |
| [get_MemberType](./get_membertype/)() override | この検証済み XML ノードの動的スキーマ型を返します。 |
| [get_SchemaAttribute](./get_schemaattribute/)() override | この検証済み XML ノードに対応するコンパイル済み [XmlSchemaAttribute](../xmlschemaattribute/) オブジェクトを返します。 |
| [get_SchemaElement](./get_schemaelement/)() override | この検証済み XML ノードに対応するコンパイル済み [XmlSchemaElement](../xmlschemaelement/) オブジェクトを返します。 |
| [get_SchemaType](./get_schematype/)() override | この検証済み XML ノードの静的 XML [Schema](../) 定義言語 (XSD) スキーマ型を返します。 |
| [get_Validity](./get_validity/)() override | この検証済みXMLノードの [XmlSchemaValidity](../xmlschemavalidity/) 値を返します。 |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | この検証済みXMLノードのコンテンツタイプに対応する [XmlSchemaContentType](../xmlschemacontenttype/) オブジェクトを設定します。 |
| [set_IsDefault](./set_isdefault/)(bool) | XML [Schema](../) 定義言語 (XSD) スキーマ検証中にデフォルトが適用された結果としてこの検証済みXMLノードが設定されたかどうかを示す値を設定します。 |
| [set_IsNil](./set_isnil/)(bool) | この検証済みXMLノードの値が **nil** かどうかを示す値を設定します。 |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | この検証済みXMLノードの動的スキーマ型を設定します。 |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | この検証済みXMLノードに対応するコンパイル済みの [XmlSchemaAttribute](../xmlschemaattribute/) オブジェクトを設定します。 |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | この検証済みXMLノードに対応するコンパイル済みの [XmlSchemaElement](../xmlschemaelement/) オブジェクトを設定します。 |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | この検証済みXMLノードの静的XML [Schema](../) 定義言語 (XSD) スキーマ型を設定します。 |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | この検証済みXMLノードの [XmlSchemaValidity](../xmlschemavalidity/) 値を設定します。 |
| [XmlSchemaInfo](./xmlschemainfo/)() | [XmlSchemaInfo](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
