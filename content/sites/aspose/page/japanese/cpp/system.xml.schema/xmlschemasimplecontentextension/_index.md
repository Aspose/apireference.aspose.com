---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension クラス"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension クラス。World Wide Web Consortium (W3C) が定義する XML Schema のシンプルコンテンツ用 extension 要素を表します。このクラスは拡張によってシンプル型を派生させるために使用できます。そのような派生は、C++ で属性を追加することにより要素のシンプル型コンテンツを拡張するために利用されます。"
type: docs
weight: 6000
url: /ja/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


XML [Schema](../) のシンプルコンテンツ用 **extension** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する形で表します。このクラスは拡張によってシンプル型を派生させるために使用できます。そのような派生は、属性を追加することで要素のシンプル型コンテンツを拡張するために利用されます。

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 属性値に使用される[XmlSchemaAnyAttribute](../xmlschemaanyattribute/)を返します。 |
| [get_Attributes](./get_attributes/)() | [XmlSchemaAttribute](../xmlschemaattribute/) と [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) のコレクションを返します。 |
| [get_BaseTypeName](./get_basetypename/)() | この型が拡張される組み込みデータ型またはシンプル型の名前を返します。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 属性値に使用される[XmlSchemaAnyAttribute](../xmlschemaanyattribute/)を設定します。 |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | この型が拡張される組み込みデータ型またはシンプル型の名前を設定します。 |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | [XmlSchemaSimpleContentExtension](./) クラスの新しいインスタンスを初期化します。 |
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
