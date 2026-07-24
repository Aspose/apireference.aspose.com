---
title: "System::Xml::Schema::XmlSchemaSequence クラス"
linktitle: "XmlSchemaSequence"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSequence クラス。XML スキーマ（World Wide Web Consortium (W3C) が定義）からの sequence 要素（コンポジタ）を表します。sequence は、グループ内の要素が包含要素内で指定された順序で出現することを要求します（C++）。"
type: docs
weight: 5700
url: /ja/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


XML [Schema](../) からの **sequence** 要素（コンポジタ）を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する通りに表します。**sequence** は、グループ内の要素が包含要素内で指定された順序で出現することを要求します。

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Items](./get_items/)() override | コンポジタに含まれる要素。以下のコレクション: [XmlSchemaElement](../xmlschemaelement/)、[XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaSequence](./)、または [XmlSchemaAny](../xmlschemaany/)。 |
| [XmlSchemaSequence](./xmlschemasequence/)() | [XmlSchemaSequence](./) クラスの新しいインスタンスを初期化します。 |
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
