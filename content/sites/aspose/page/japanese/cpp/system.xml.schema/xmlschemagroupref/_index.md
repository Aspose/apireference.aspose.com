---
title: "System::Xml::Schema::XmlSchemaGroupRef クラス"
linktitle: "XmlSchemaGroupRef"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaGroupRef クラス。World Wide Web Consortium (W3C) が指定する XML スキーマからの ref 属性を持つ group 要素を表します。このクラスは、C++ においてスキーマレベルで定義された group を参照する複合型内で使用されます。"
type: docs
weight: 3300
url: /ja/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


XML [Schema](../) からの **ref** 属性を持つ **group** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が指定するように表します。このクラスは、**schema** レベルで定義された **group** を参照する複合型内で使用されます。

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Particle](./get_particle/)() | コンパイル後の **Particle** 値の解釈を保持する、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/)、または [XmlSchemaSequence](../xmlschemasequence/) クラスのいずれかを返します。 |
| [get_RefName](./get_refname/)() | このスキーマ（または指定された名前空間で示される別のスキーマ）で定義された group の名前を返します。 |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | このスキーマ（または指定された名前空間で示される別のスキーマ）で定義された group の名前を設定します。 |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | 新しい [XmlSchemaGroupRef](./) クラスのインスタンスを初期化します。 |
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
