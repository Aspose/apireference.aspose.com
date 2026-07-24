---
title: "System::Xml::Schema::XmlSchemaInclude クラス"
linktitle: "XmlSchemaInclude"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaInclude クラス。World Wide Web Consortium (W3C) が定義する XML Schema の include 要素を表します。このクラスは外部スキーマから宣言と定義をインクルードするために使用されます。インクルードされた宣言と定義は、C++ の包含スキーマ内で処理できるようになります。"
type: docs
weight: 3600
url: /ja/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


XML [Schema](../) の **include** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が指定する通りに表します。このクラスは外部スキーマから宣言と定義をインクルードするために使用されます。インクルードされた宣言と定義は、包含スキーマ内で処理できるようになります。

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** の値を返します。 |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** の値を設定します。 |
| [XmlSchemaInclude](./xmlschemainclude/)() | [XmlSchemaInclude](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
