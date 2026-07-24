---
title: "System::Xml::Schema::XmlSchemaNotation クラス"
linktitle: "XmlSchemaNotation"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaNotation クラス。XML スキーマからの notation 要素を、World Wide Web Consortium (W3C) が定義する通りに表します。XML スキーマの notation 宣言は、XML 1.0 NOTATION 宣言の再構築です。notation の目的は、XML ドキュメント内の非 XML データの形式を C++ で記述することです。"
type: docs
weight: 4800
url: /ja/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


XML [Schema](../) からの **notation** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する通りに表します。XML [Schema](../)**notation** 宣言は、**XML** 1.0 NOTATION 宣言の再構築です。notation の目的は、XML ドキュメント内の非 XML データの形式を記述することです。

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Name](./get_name/)() | notation の名前を返します。 |
| [get_Public](./get_public/)() | **public** 識別子を返します。 |
| [get_System](./get_system/)() | **system** 識別子を返します。 |
| [set_Name](./set_name/)(const String\&) | notation の名前を設定します。 |
| [set_Public](./set_public/)(const String\&) | **public** 識別子を設定します。 |
| [set_System](./set_system/)(const String\&) | **system** 識別子を設定します。 |
| [XmlSchemaNotation](./xmlschemanotation/)() | 新しい [XmlSchemaNotation](./) クラスのインスタンスを初期化します。 |
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
