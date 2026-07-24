---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaChoice クラス。World Wide Web Consortium (W3C) が定義する XML スキーマからの choice 要素（コンポジタ）を表します。choice は、その子要素のうち 1 つだけが C++ のインスタンスに現れることを許可します。"
type: docs
weight: 1400
url: /ja/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


XML [Schema](../) からの **choice** 要素（コンポジタ）を World Wide [Web](../../system.web/) Consortium (W3C) が定義するように表します。**choice** は、その子要素のうち 1 つだけがインスタンスに現れることを許可します。

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Items](./get_items/)() override | コンポジタ（**choice**）に含まれる要素のコレクションを返します: [XmlSchemaElement](../xmlschemaelement/)、[XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](./)、[XmlSchemaSequence](../xmlschemasequence/)、または [XmlSchemaAny](../xmlschemaany/)。 |
| [XmlSchemaChoice](./xmlschemachoice/)() | [XmlSchemaChoice](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
