---
title: "System::Xml::Schema::XmlSchemaGroup クラス"
linktitle: "XmlSchemaGroup"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaGroup クラス。World Wide Web Consortium (W3C) が定義する XML Schema の **group** 要素を表します。このクラスは、複合型から参照されるスキーマレベルのグループを定義します。要素宣言の集合をグループ化し、C++ の複合型定義にグループとして組み込むことができます。"
type: docs
weight: 3100
url: /ja/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


XML [Schema](../) の **group** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義するように表します。このクラスは、**schema** レベルで複合型から参照されるグループを定義します。要素宣言の集合をグループ化し、複合型定義にグループとして組み込むことができます。

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Name](./get_name/)() | スキーマグループの名前を返します。 |
| [get_Particle](./get_particle/)() | [XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/)、または [XmlSchemaSequence](../xmlschemasequence/) クラスのいずれかを返します。 |
| [get_QualifiedName](./get_qualifiedname/)() | スキーマグループの完全修飾名を返します。 |
| [set_Name](./set_name/)(const String\&) | スキーマグループの名前を設定します。 |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | [XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/)、または [XmlSchemaSequence](../xmlschemasequence/) クラスのいずれかを設定します。 |
| [XmlSchemaGroup](./xmlschemagroup/)() | 新しい [XmlSchemaGroup](./) クラスのインスタンスを初期化します。 |
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
