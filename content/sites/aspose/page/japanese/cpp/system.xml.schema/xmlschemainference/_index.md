---
title: "System::Xml::Schema::XmlSchemaInference class"
linktitle: "XmlSchemaInference"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaInference クラス。XML ドキュメントから XML スキーマ定義言語 (XSD) スキーマを推測します。C++ では XmlSchemaInference クラスを継承できません。"
type: docs
weight: 3700
url: /ja/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


XML ドキュメントから XML [Schema](../) 定義言語 (XSD) スキーマを推測します。[XmlSchemaInference](./) クラスは継承できません。

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| 列挙型 | 説明 |
| --- | --- |
| [InferenceOption](./inferenceoption/) | [XmlSchemaInference](./) クラスが XML ドキュメント内の要素と属性に対して推測する出現回数と型情報に影響します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | XML ドキュメントから推測されたスキーマの出現宣言に影響する [XmlSchemaInference::InferenceOption](./inferenceoption/) の値を返します。 |
| [get_TypeInference](./get_typeinference/)() | XML ドキュメントから推測された型に影響する [XmlSchemaInference::InferenceOption](./inferenceoption/) の値を返します。 |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | 指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトに含まれる XML ドキュメントから XML [Schema](../) 定義言語 (XSD) スキーマを推測します。 |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | 指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトに含まれる XML ドキュメントから XML [Schema](../) 定義言語 (XSD) スキーマを推測し、同じターゲット名前空間を持つ [XmlSchemaSet](../xmlschemaset/) オブジェクトに指定された既存スキーマを使用して推測されたスキーマを洗練します。 |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | XML ドキュメントから推測されたスキーマの出現宣言に影響する [XmlSchemaInference::InferenceOption](./inferenceoption/) の値を設定します。 |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | XML ドキュメントから推測された型に影響を与える [XmlSchemaInference::InferenceOption](./inferenceoption/) の値を設定します。 |
| [XmlSchemaInference](./xmlschemainference/)() | [XmlSchemaInference](./) クラスの新しいインスタンスを初期化します。 |
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
