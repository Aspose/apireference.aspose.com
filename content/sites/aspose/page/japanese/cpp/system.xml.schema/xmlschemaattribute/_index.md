---
title: "System::Xml::Schema::XmlSchemaAttribute class"
linktitle: "XmlSchemaAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAttribute クラス。World Wide Web Consortium (W3C) が定義する XML スキーマからの attribute 要素を表します。属性は他のドキュメント要素に追加情報を提供します。属性タグはスキーマ用のドキュメント要素のタグ間にネストされます。XML ドキュメントは、C++ において要素の開始タグ内に名前付き項目として属性を表示します。"
type: docs
weight: 1100
url: /ja/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


XML [Schema](../) からの **attribute** 要素を World Wide [Web](../../system.web/) Consortium (W3C) が定義するように表します。属性は他のドキュメント要素に追加情報を提供します。属性タグはスキーマ用のドキュメント要素のタグ間にネストされます。XML ドキュメントは要素の開始タグ内に名前付き項目として属性を表示します。

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | [XmlSchemaSimpleType](../xmlschemasimpletype/) オブジェクトを返します。このオブジェクトは属性の [XmlSchemaAttribute::get_SchemaType](./get_schematype/) または [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) の値に基づいて属性の型を表します。 |
| [get_AttributeType](./get_attributetype/)() | 属性の [XmlSchemaAttribute::get_SchemaType](./get_schematype/) または [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) の値に基づくオブジェクトを返します。このオブジェクトは **AttributeType** 値のコンパイル後の解釈を保持します。 |
| [get_DefaultValue](./get_defaultvalue/)() | 属性の既定値を返します。 |
| [get_FixedValue](./get_fixedvalue/)() | 属性の固定値を返します。 |
| [get_Form](./get_form/)() | 属性の形式を返します。 |
| [get_Name](./get_name/)() | 属性の名前を返します。 |
| [get_QualifiedName](./get_qualifiedname/)() | 属性の修飾名を返します。 |
| [get_RefName](./get_refname/)() | このスキーマ（または指定された名前空間で示される別のスキーマ）で宣言された属性の名前を返します。 |
| [get_SchemaType](./get_schematype/)() | 属性の型を単純型として返します。 |
| [get_SchemaTypeName](./get_schematypename/)() | このスキーマ（または指定された名前空間で示される別のスキーマ）で定義された単純型の名前を返します。 |
| [get_Use](./get_use/)() | 属性がどのように使用されるかに関する情報を返します。 |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | 属性の既定値を設定します。 |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | 属性の固定値を設定します。 |
| [set_Form](./set_form/)(XmlSchemaForm) | 属性の形式を設定します。 |
| [set_Name](./set_name/)(const String\&) | 属性の名前を設定します。 |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | このスキーマ（または指定された名前空間で示される別のスキーマ）で宣言された属性の名前を設定します。 |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 属性の型を単純型に設定します。 |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | このスキーマ（または指定された名前空間で示される別のスキーマ）で定義された単純型の名前を設定します。 |
| [set_Use](./set_use/)(XmlSchemaUse) | 属性がどのように使用されるかに関する情報を設定します。 |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | 新しい [XmlSchemaAttribute](./) クラスのインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
