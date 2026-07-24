---
title: "System::Xml::Schema::XmlSchemaSimpleType クラス"
linktitle: "XmlSchemaSimpleType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleType クラス。World Wide Web Consortium (W3C) が定義する XML Schema のシンプルコンテンツ用 simpleType 要素を表します。このクラスはシンプル型を定義します。シンプル型は C++ において、属性またはテキストのみのコンテンツを持つ要素の値に対する情報や制約を指定できます。"
type: docs
weight: 6200
url: /ja/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


XML [Schema](../) のシンプルコンテンツ用 **simpleType** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する形で表します。このクラスはシンプル型を定義します。シンプル型は属性またはテキストのみのコンテンツを持つ要素の値に対する情報や制約を指定できます。

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Content](./get_content/)() | [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/)、[XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/)、または [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) のいずれかを返します。 |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/)、[XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/)、または [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) のいずれかを設定します。 |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | [XmlSchemaSimpleType](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
