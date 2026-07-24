---
title: "System::Xml::Schema::XmlSchemaExternal クラス"
linktitle: "XmlSchemaExternal"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaExternal クラス。C++ におけるインクルードされたスキーマに関する情報を提供します。"
type: docs
weight: 2800
url: /ja/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


含まれるスキーマに関する情報を提供します。

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Id](./get_id/)() | 文字列 ID を返します。 |
| [get_Schema](./get_schema/)() | 参照されたスキーマの [XmlSchema](../xmlschema/) を返します。 |
| [get_SchemaLocation](./get_schemalocation/)() | スキーマの Uniform Resource Identifier (URI) の場所を返します。これによりスキーマプロセッサはスキーマが実際に存在する場所を知ることができます。 |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | スキーマのターゲット名前空間に属さない、修飾された属性を返します。 |
| [set_Id](./set_id/)(const String\&) | 文字列 ID を設定します。 |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | 参照されたスキーマの [XmlSchema](../xmlschema/) を設定します。 |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | スキーマの Uniform Resource Identifier (URI) の場所を設定します。これにより、スキーマプロセッサにスキーマが実際に存在する場所が伝えられます。 |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | スキーマのターゲット名前空間に属さない、修飾された属性を設定します。 |
| [XmlSchemaExternal](./xmlschemaexternal/)() | [XmlSchemaExternal](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
