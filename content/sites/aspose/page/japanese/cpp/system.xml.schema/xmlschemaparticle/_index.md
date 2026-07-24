---
title: "System::Xml::Schema::XmlSchemaParticle クラス"
linktitle: "XmlSchemaParticle"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaParticle クラス。すべてのパーティクル型（例：XmlSchemaAny）の基底クラスです（C++）。"
type: docs
weight: 5400
url: /ja/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


すべてのパーティクル型（例：[XmlSchemaAny](../xmlschemaany/)）の基底クラスです。

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | パーティクルが出現できる最大回数を返します。 |
| [get_MaxOccursString](./get_maxoccursstring/)() | 数値を文字列として返します。パーティクルが出現できる最大回数です。 |
| [get_MinOccurs](./get_minoccurs/)() | パーティクルが出現できる最小回数を返します。 |
| [get_MinOccursString](./get_minoccursstring/)() | 数値を文字列として返します。パーティクルが出現できる最小回数です。 |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | パーティクルが出現できる最大回数を設定します。 |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | 数値を文字列として設定します。パーティクルが出現できる最大回数です。 |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | パーティクルが出現できる最小回数を設定します。 |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | 数値を文字列として設定します。パーティクルが出現できる最小回数です。 |
| [XmlSchemaParticle](./xmlschemaparticle/)() | [XmlSchemaParticle](./) クラスの新しいインスタンスを初期化します。 |
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
