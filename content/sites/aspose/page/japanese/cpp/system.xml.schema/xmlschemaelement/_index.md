---
title: "System::Xml::Schema::XmlSchemaElement クラス"
linktitle: "XmlSchemaElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaElement クラス。XML スキーマの element 要素を、World Wide Web Consortium (W3C) が定義する通りに表します。このクラスはすべてのパーティクル型の基底クラスであり、C++ で XML ドキュメント内の要素を記述するために使用されます。"
type: docs
weight: 2600
url: /ja/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


XML [Schema](../) の **element** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する通りに表します。このクラスはすべてのパーティクル型の基底クラスであり、XML ドキュメント内の要素を記述するために使用されます。

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Block](./get_block/)() | **Block** 派生を返します。 |
| [get_BlockResolved](./get_blockresolved/)() | **Block** 値のコンパイル後の解釈を返します。 |
| [get_Constraints](./get_constraints/)() | 要素に対する制約のコレクションを返します。 |
| [get_DefaultValue](./get_defaultvalue/)() | 要素の内容がシンプルタイプであるか、要素の内容が **textOnly** の場合、要素のデフォルト値を返します。 |
| [get_ElementSchemaType](./get_elementschematype/)() | [XmlSchemaElement::get_SchemaType](./get_schematype/) または [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) の値に基づいて、要素の型を表す [XmlSchemaType](../xmlschematype/) オブジェクトを返します。 |
| [get_ElementType](./get_elementtype/)() | 要素の [XmlSchemaElement](./) または [XmlSchemaElement](./) に基づくオブジェクトを返します。このオブジェクトは **ElementType** 値のコンパイル後の解釈を保持します。 |
| [get_Final](./get_final/)() | これ以上の派生が許可されないことを示すために **Final** 値を返します。 |
| [get_FinalResolved](./get_finalresolved/)() | **Final** 値のコンパイル後の解釈を返します。 |
| [get_FixedValue](./get_fixedvalue/)() | 固定値を返します。 |
| [get_Form](./get_form/)() | 要素の形式を返します。 |
| [get_IsAbstract](./get_isabstract/)() | 要素がインスタンス文書で使用できるかどうかを示す情報を返します。 |
| [get_IsNillable](./get_isnillable/)() | インスタンスデータで **xsi:nil** が発生し得るかを示す情報を返します。要素に明示的な nil 値を割り当てられるかどうかを示します。 |
| [get_Name](./get_name/)() | 要素の名前を返します。 |
| [get_QualifiedName](./get_qualifiedname/)() | 指定された要素の実際の修飾名を返します。 |
| [get_RefName](./get_refname/)() | このスキーマ（または指定された名前空間で示される別のスキーマ）で宣言された要素の参照名を返します。 |
| [get_SchemaType](./get_schematype/)() | 要素の型を返します。これは複合型またはシンプル型のいずれかです。 |
| [get_SchemaTypeName](./get_schematypename/)() | このスキーマまたは指定された名前空間で示される別のスキーマで定義された組み込みデータ型の名前を返します。 |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | この要素によって置換される要素の名前を返します。 |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | **Block** 派生を設定します。 |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | 要素の内容が単純型であるか、要素の内容が **textOnly** の場合、要素のデフォルト値を設定します。 |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | さらに派生が許可されないことを示すために **Final** 値を設定します。 |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | 固定値を設定します。 |
| [set_Form](./set_form/)(XmlSchemaForm) | 要素の形式を設定します。 |
| [set_IsAbstract](./set_isabstract/)(bool) | 要素がインスタンス文書で使用できるかどうかを示す情報を設定します。 |
| [set_IsNillable](./set_isnillable/)(bool) | インスタンスデータで **xsi:nil** が発生し得るかを示す情報を設定します。要素に明示的な nil 値を割り当てられるかどうかを示します。 |
| [set_Name](./set_name/)(const String\&) | 要素の名前を設定します。 |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | このスキーマ（または指定された名前空間で示される別のスキーマ）で宣言された要素の参照名を設定します。 |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | 要素の型を設定します。これは複合型または単純型のいずれかです。 |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | このスキーマまたは指定された名前空間で示される別のスキーマで定義された組み込みデータ型の名前を設定します。 |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | この要素によって置換される要素の名前を設定します。 |
| [XmlSchemaElement](./xmlschemaelement/)() | [XmlSchemaElement](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
