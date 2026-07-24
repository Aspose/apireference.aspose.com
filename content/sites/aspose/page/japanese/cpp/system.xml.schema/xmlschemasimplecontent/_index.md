---
title: "System::Xml::Schema::XmlSchemaSimpleContent クラス"
linktitle: "XmlSchemaSimpleContent"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleContent クラス。World Wide Web Consortium (W3C) が定義する XML Schema の simpleContent 要素を表します。このクラスは、C++ におけるシンプルコンテンツモデルを持つ単純型および複合型用です。"
type: docs
weight: 5900
url: /ja/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


XML [Schema](../) からの **simpleContent** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する形で表します。このクラスはシンプルコンテンツモデルを持つ単純型および複合型用です。

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Content](./get_content/)() override | [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) または [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/) のいずれかを返します。 |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) または [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/) のいずれかを返します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
