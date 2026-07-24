---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList クラス"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList クラス。World Wide Web Consortium (W3C) が指定する XML Schema の list 要素を表します。このクラスは、C++ で指定されたデータ型の値のリストとして simpleType 要素を定義するために使用できます。"
type: docs
weight: 6400
url: /ja/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


World Wide [Web](../../system.web/) Consortium (W3C) が指定する XML [Schema](../) の **list** 要素を表します。このクラスは、指定されたデータ型の値のリストとして **simpleType** 要素を定義するために使用できます。

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | シンプル型の [XmlSchemaSimpleType](../xmlschemasimpletype/) を返します。この **simpleType** 要素のタイプは、[XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) と [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) の値に基づいて表されます。 |
| [get_ItemType](./get_itemtype/)() | ベース値で指定されたタイプから派生した **simpleType** 要素を返します。 |
| [get_ItemTypeName](./get_itemtypename/)() | このスキーマ（または指定された名前空間で示される別のスキーマ）で定義された組み込みデータ型または **simpleType** 要素の名前を返します。 |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | [XmlSchemaSimpleType](../xmlschemasimpletype/) を設定します。この **simpleType** 要素のタイプは、[XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) と [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) の値に基づいて表されます。 |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | ベース値で指定されたタイプから派生した **simpleType** 要素を設定します。 |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | このスキーマ（または指定された名前空間で示される別のスキーマ）で定義された組み込みデータ型または **simpleType** 要素の名前を設定します。 |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | 新しい [XmlSchemaSimpleTypeList](./) クラスのインスタンスを初期化します。 |
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
