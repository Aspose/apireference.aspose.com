---
title: "System::Xml::Schema::XmlSchemaComplexType クラス"
linktitle: "XmlSchemaComplexType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaComplexType クラス。XML スキーマ（World Wide Web Consortium (W3C) が定義）からの complexType 要素を表します。このクラスは、C++ における要素の属性セットと内容を決定する複合型を定義します。"
type: docs
weight: 2100
url: /ja/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


XML [Schema](../) からの **complexType** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する形で表します。このクラスは、要素の属性セットと内容を決定する複合型を定義します。

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 複合型の [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) コンポーネントの値を返します。 |
| [get_Attributes](./get_attributes/)() | 複合型の属性コレクションを返します。 |
| [get_AttributeUses](./get_attributeuses/)() | この複合型とその基底型のすべてのコンパイル済み属性のコレクションを返します。 |
| [get_AttributeWildcard](./get_attributewildcard/)() | この複合型およびその基底型の **anyAttribute** のコンパイル後の値を返します。 |
| [get_Block](./get_block/)() | **block** 属性を返します。 |
| [get_BlockResolved](./get_blockresolved/)() | 型がスキーマ検証後情報セット（infoset）にコンパイルされた後の値を返します。この値は、インスタンス文書で **xsi:type** が使用されたときに型がどのように適用されるかを示します。 |
| [get_ContentModel](./get_contentmodel/)() | この複合型のコンパイル後の [XmlSchemaContentModel](../xmlschemacontentmodel/) を返します。 |
| [get_ContentType](./get_contenttype/)() | コンパイル後の値を保持する複合型のコンテンツモデルを返します。 |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | コンパイル後の値を保持する [XmlSchemaComplexType::get_ContentType](./get_contenttype/) パーティクルを返します。 |
| [get_IsAbstract](./get_isabstract/)() | **complexType** 要素がインスタンス文書で使用できるかどうかを決定する情報を返します。 |
| [get_IsMixed](./get_ismixed/)() override | 複合型が混在コンテンツモデル（コンテンツ内のマークアップ）を持つかどうかを決定する情報を返します。 |
| [get_Particle](./get_particle/)() | [XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/)、または [XmlSchemaSequence](../xmlschemasequence/) クラスのいずれかとしてコンポジタタイプを返します。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 複合型の [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) コンポーネントの値を設定します。 |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | **block** 属性を設定します。 |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | この複合型のコンパイル後の [XmlSchemaContentModel](../xmlschemacontentmodel/) を設定します。 |
| [set_IsAbstract](./set_isabstract/)(bool) | **complexType** 要素がインスタンス文書で使用できるかどうかを決定する情報を設定します。 |
| [set_IsMixed](./set_ismixed/)(bool) override | 複合型が混在コンテンツモデル（コンテンツ内のマークアップ）を持つかどうかを決定する情報を設定します。 |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | [XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/)、または [XmlSchemaSequence](../xmlschemasequence/) クラスのいずれかとしてコンポジタタイプを設定します。 |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | [XmlSchemaComplexType](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
