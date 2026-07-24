---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion クラス"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion クラス。XML スキーマからのシンプル型の union 要素を、World Wide Web Consortium (W3C) が定義する通りに表します。union データ型は simpleType の内容を指定するために使用できます。simpleType 要素の値は、union で指定された代替データ型の集合のいずれかでなければなりません。union 型は常に派生型であり、C++ では少なくとも2つの代替データ型を含む必要があります。"
type: docs
weight: 6600
url: /ja/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


XML [Schema](../) からのシンプル型の **union** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する通りに表します。**union** データ型は **simpleType** の内容を指定するために使用できます。**simpleType** 要素の値は、union で指定された代替データ型の集合のいずれかでなければなりません。union 型は常に派生型であり、少なくとも2つの代替データ型を含む必要があります。

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | **simpleType** 要素の型を表す [XmlSchemaSimpleType](../xmlschemasimpletype/) オブジェクトの配列を、[XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) と [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) の値に基づいて返します。 |
| [get_BaseTypes](./get_basetypes/)() | 基本型のコレクションを返します。 |
| [get_MemberTypes](./get_membertypes/)() | このスキーマで定義された組み込みデータ型または **simpleType** 要素の修飾されたメンバー名の配列を返します（または、指定された名前空間で示される別のスキーマ）。 |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | このスキーマで定義された組み込みデータ型または **simpleType** 要素の修飾されたメンバー名の配列を設定します（または、指定された名前空間で示される別のスキーマ）。 |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | 新しい [XmlSchemaSimpleTypeUnion](./) クラスのインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
