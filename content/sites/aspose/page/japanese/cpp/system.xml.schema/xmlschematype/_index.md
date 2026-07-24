---
title: "System::Xml::Schema::XmlSchemaType クラス"
linktitle: "XmlSchemaType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaType クラス。C++ におけるすべての単純型と複合型の基底クラスです。"
type: docs
weight: 6800
url: /ja/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


すべての単純型および複合型の基底クラスです。

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | コンパイル後のオブジェクト型または組み込み XML [Schema](../) 定義言語 (XSD) データ型、simpleType 要素、または complexType 要素を返します。これはスキーマコンパイル後の情報セット値です。 |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | このスキーマ型の基底型に対するコンパイル後の値を返します。 |
| [get_Datatype](./get_datatype/)() | 複合型のデータ型に対するコンパイル後の値を返します。 |
| [get_DerivedBy](./get_derivedby/)() | この要素が基底型からどのように派生したかに関するコンパイル後の情報を返します。 |
| [get_Final](./get_final/)() | さらに派生が許可されているかを示す型派生の final 属性を返します。 |
| [get_FinalResolved](./get_finalresolved/)() | [XmlSchemaType::get_Final](./get_final/) 値のコンパイル後の解釈を返します。 |
| virtual [get_IsMixed](./get_ismixed/)() | この型が混在コンテンツモデルを持つかどうかを示す値を返します。この呼び出しは複合型でのみ有効です。 |
| [get_Name](./get_name/)() | 型の名前を返します。 |
| [get_QualifiedName](./get_qualifiedname/)() | この型の **Name** 属性から構築された型の修飾名を返します。これはスキーマコンパイル後の値です。 |
| [get_TypeCode](./get_typecode/)() | 型の [XmlTypeCode](../xmltypecode/) を返します。 |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | 指定された複合型の組み込み複合型を表す [XmlSchemaComplexType](../xmlschemacomplextype/) を返します。 |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | 修飾名で指定された複合型の組み込み複合型を表す [XmlSchemaComplexType](../xmlschemacomplextype/) を返します。 |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | 修飾名で指定された単純型の組み込み単純型を表す [XmlSchemaSimpleType](../xmlschemasimpletype/) を返します。 |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | 指定された単純型の組み込み単純型を表す [XmlSchemaSimpleType](../xmlschemasimpletype/) を返します。 |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | 指定された派生スキーマ型が指定された基底スキーマ型から派生しているかどうかを示す値を返します。 |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | さらに派生が許可されているかを示す型派生の final 属性を設定します。 |
| virtual [set_IsMixed](./set_ismixed/)(bool) | この型が混在コンテンツモデルを持つかどうかを示す値を設定します。この呼び出しは複合型でのみ有効です。 |
| [set_Name](./set_name/)(const String\&) | 型の名前を設定します。 |
| [XmlSchemaType](./xmlschematype/)() | [XmlSchemaType](./) クラスの新しいインスタンスを初期化します。 |
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
