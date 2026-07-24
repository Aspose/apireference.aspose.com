---
title: "System::Xml::Schema::XmlSchemaDocumentation クラス"
linktitle: "XmlSchemaDocumentation"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaDocumentation クラス。World Wide Web Consortium (W3C) が定義する XML Schema の documentation 要素を表します。このクラスは C++ のアノテーション内で人間が読み取ったり使用したりする情報を指定します。"
type: docs
weight: 2500
url: /ja/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


XML [Schema](../) の **documentation** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が指定する形で表します。このクラスは **annotation** 内で人間が読み取ったり使用したりする情報を指定します。

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Language](./get_language/)() | **xml:lang** 属性を返します。これはコンテンツで使用されている言語の指標として機能します。 |
| [get_Markup](./get_markup/)() | [XmlNode](../../system.xml/xmlnode/) オブジェクトの配列を返します。この配列は documentation の子ノードを表します。 |
| [get_Source](./get_source/)() | 情報の Uniform Resource Identifier (URI) ソースを返します。 |
| [set_Language](./set_language/)(const String\&) | **xml:lang** 属性を設定します。これはコンテンツで使用されている言語の指標として機能します。 |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | [XmlNode](../../system.xml/xmlnode/) オブジェクトの配列を設定します。この配列は documentation の子ノードを表します。 |
| [set_Source](./set_source/)(const String\&) | 情報の Uniform Resource Identifier (URI) ソースを設定します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
