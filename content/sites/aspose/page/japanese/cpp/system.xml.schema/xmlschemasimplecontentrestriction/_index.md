---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction クラス"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction クラス。World Wide Web Consortium (W3C) が定める XML Schema のシンプルコンテンツ用制限要素を表します。このクラスは、制限によってシンプル型を派生させるために使用できます。そのような派生は、C++ において継承されたシンプル型で指定された値のサブセットに要素の値範囲を制限するために利用できます。"
type: docs
weight: 6100
url: /ja/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


XML [Schema](../) からのシンプルコンテンツ用 **restriction** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定める通りに表します。このクラスは、制限によってシンプル型を派生させるために使用できます。そのような派生は、継承されたシンプル型で指定された値のサブセットに要素の値範囲を制限するために利用できます。

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 属性値に使用するための [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) を返します。 |
| [get_Attributes](./get_attributes/)() | シンプル型の属性コレクションである [XmlSchemaAttribute](../xmlschemaattribute/) と [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) を返します。 |
| [get_BaseType](./get_basetype/)() | 単純型の基本値を返します。 |
| [get_BaseTypeName](./get_basetypename/)() | この型が派生している組み込みデータ型または単純型の名前を返します。 |
| [get_Facets](./get_facets/)() | [Xml](../../system.xml/)[Schema](../) のファセットを返します。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 属性値に使用する [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) を設定します。 |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 単純型の基本値を設定します。 |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | この型が派生している組み込みデータ型または単純型の名前を設定します。 |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | [XmlSchemaSimpleContentRestriction](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
