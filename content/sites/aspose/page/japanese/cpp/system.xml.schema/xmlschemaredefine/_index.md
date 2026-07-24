---
title: "System::Xml::Schema::XmlSchemaRedefine クラス"
linktitle: "XmlSchemaRedefine"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaRedefine クラス。World Wide Web Consortium (W3C) が定義する XML Schema の redefine 要素を表します。このクラスは、外部スキーマファイルからの単純型および複合型、グループ、属性グループを現在のスキーマで再定義できるように使用できます。また、このクラスは C++ におけるスキーマ要素のバージョン管理を提供するためにも使用できます。"
type: docs
weight: 5600
url: /ja/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


XML [Schema](../) の **redefine** 要素を、World Wide [Web](../../system.web/) コンソーシアム (W3C) が定める通りに表します。このクラスは、外部スキーマファイルからの単純型および複合型、グループ、属性グループを現在のスキーマで再定義するために使用できます。また、このクラスはスキーマ要素のバージョン管理を提供するためにも使用できます。

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | スキーマ内のすべての属性に対する [XmlSchemaObjectTable](../xmlschemaobjecttable/) を返します。このテーブルは **AttributeGroups** のコンパイル後の解釈を保持しています。 |
| [get_Groups](./get_groups/)() | スキーマ内のすべてのグループに対する [XmlSchemaObjectTable](../xmlschemaobjecttable/) を返します。このテーブルは **Groups** のコンパイル後の解釈を保持しています。 |
| [get_Items](./get_items/)() | 次のクラスのコレクションを返します: [XmlSchemaAnnotation](../xmlschemaannotation/)、[XmlSchemaAttributeGroup](../xmlschemaattributegroup/)、[XmlSchemaComplexType](../xmlschemacomplextype/)、[XmlSchemaSimpleType](../xmlschemasimpletype/)、および [XmlSchemaGroup](../xmlschemagroup/)。 |
| [get_SchemaTypes](./get_schematypes/)() | スキーマ内のすべての単純型および複合型に対する [XmlSchemaObjectTable](../xmlschemaobjecttable/) を返します。このテーブルは **SchemaTypes** のコンパイル後の解釈を保持しています。 |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | [XmlSchemaRedefine](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
