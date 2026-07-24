---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction クラス"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction クラス。World Wide Web Consortium (W3C) が定義する XML Schema のシンプルタイプに対する restriction 要素を表します。このクラスは、C++ で simpleType 要素を制限するために使用できます。"
type: docs
weight: 6500
url: /ja/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


XML [Schema](../) のシンプルタイプに対する **restriction** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する形で表します。このクラスは、**simpleType** 要素を制限するために使用できます。

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_BaseType](./get_basetype/)() | 基底型に関する情報を返します。 |
| [get_BaseTypeName](./get_basetypename/)() | 修飾された基底型の名前を返します。 |
| [get_Facets](./get_facets/)() | [Xml](../../system.xml/)[Schema](../) のファセットを返します。 |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 基底型に関する情報を設定します。 |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 修飾された基底型の名前を設定します。 |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | [XmlSchemaSimpleTypeRestriction](./) クラスの新しいインスタンスを初期化します。 |
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
