---
title: "System::Xml::Schema::XmlSchemaObject class"
linktitle: "XmlSchemaObject"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaObject class. Xml スキーマオブジェクトモデル階層のルートクラスを表し、C++ の XmlSchema クラスなどのクラスの基底クラスとして機能します。"
type: docs
weight: 5000
url: /ja/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


[Xml](../../system.xml/) スキーマオブジェクトモデル階層のルートクラスを表し、[XmlSchema](../xmlschema/) クラスなどのクラスの基底クラスとして機能します。

```cpp
class XmlSchemaObject : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | **schema** 要素が参照するファイル内の行番号を返します。 |
| [get_LinePosition](./get_lineposition/)() | **schema** 要素が参照するファイル内の行位置を返します。 |
| [get_Namespaces](./get_namespaces/)() | このスキーマオブジェクトで使用する XmlSerializerNamespaces を返します。 |
| [get_Parent](./get_parent/)() | この [XmlSchemaObject](./) の親を返します。 |
| [get_SourceUri](./get_sourceuri/)() | スキーマを読み込んだファイルのソース位置を返します。 |
| [set_LineNumber](./set_linenumber/)(int32_t) | **schema** 要素が参照するファイル内の行番号を設定します。 |
| [set_LinePosition](./set_lineposition/)(int32_t) | **schema** 要素が参照するファイル内の行位置を設定します。 |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | このスキーマ オブジェクトで使用する XmlSerializerNamespaces を設定します。 |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | この [XmlSchemaObject](./) の親を設定します。 |
| [set_SourceUri](./set_sourceuri/)(const String\&) | スキーマを読み込んだファイルのソース位置を設定します。 |
| [XmlSchemaObject](./xmlschemaobject/)() | [XmlSchemaObject](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
