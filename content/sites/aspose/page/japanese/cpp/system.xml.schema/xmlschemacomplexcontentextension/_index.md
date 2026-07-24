---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension クラス"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension クラス。World Wide Web Consortium (W3C) が定める XML Schema の extension 要素を表します。このクラスは、extension によって導出された複合コンテンツモデルを持つ複合型用です。C++ で属性や要素を追加して複合型を拡張します。"
type: docs
weight: 1900
url: /ja/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


XML [Schema](../) の **extension** 要素を、World Wide [Web](../../system.web/) コンソーシアム (W3C) が定める通りに表します。このクラスは、extension によって導出された複合コンテンツモデルを持つ複合型用です。属性や要素を追加して複合型を拡張します。

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 複合コンテンツモデルの [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) コンポーネントを返します。 |
| [get_Attributes](./get_attributes/)() | 複合コンテンツの属性コレクションを返します。ここには [XmlSchemaAttribute](../xmlschemaattribute/) と [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 要素が含まれます。 |
| [get_BaseTypeName](./get_basetypename/)() | この型が extension によって派生した複合型の名前を返します。 |
| [get_Particle](./get_particle/)() | [XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/)、または [XmlSchemaSequence](../xmlschemasequence/) クラスのいずれかを返します。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 複合コンテンツモデルの [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) コンポーネントを設定します。 |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | この型が extension によって派生した複合型の名前を設定します。 |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | [XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/)、または [XmlSchemaSequence](../xmlschemasequence/) クラスのいずれかを設定します。 |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | [XmlSchemaComplexContentExtension](./) クラスの新しいインスタンスを初期化します。 |
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
