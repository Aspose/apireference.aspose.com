---
title: "System::Xml::Schema::XmlSchemaKeyref クラス"
linktitle: "XmlSchemaKeyref"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaKeyref クラス。このクラスは、World Wide Web コンソーシアム (W3C) によって C++ で指定された XMLSchema の keyref 要素を表します。"
type: docs
weight: 4000
url: /ja/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


このクラスは、World Wide [Web](../../system.web/) コンソーシアム (W3C) によって指定された XMLSchema の **keyref** 要素を表します。

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Refer](./get_refer/)() | この制約が別の単純型または複合型で参照するキーの名前を返します。 |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | この制約が別の単純型または複合型で参照するキーの名前を設定します。 |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | [XmlSchemaKeyref](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
