---
title: "System::Xml::Schema::XmlSchemaImport クラス"
linktitle: "XmlSchemaImport"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaImport クラス。World Wide Web Consortium (W3C) が定義する XML Schema の import 要素を表します。このクラスは C++ で他のスキーマからスキーマコンポーネントをインポートするために使用されます。"
type: docs
weight: 3500
url: /ja/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


XML [Schema](../) の **import** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する形で表します。このクラスは他のスキーマからスキーマコンポーネントをインポートするために使用されます。

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** の値を返します。 |
| [get_Namespace](./get_namespace/)() | インポートされたスキーマのターゲット名前空間を Uniform Resource Identifier (URI) 参照として返します。 |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** の値を設定します。 |
| [set_Namespace](./set_namespace/)(const String\&) | インポートされたスキーマのターゲット名前空間を Uniform Resource Identifier (URI) 参照として設定します。 |
| [XmlSchemaImport](./xmlschemaimport/)() | [XmlSchemaImport](./) クラスの新しいインスタンスを初期化します。 |
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
