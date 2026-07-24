---
title: "System::Xml::Schema::XmlSchemaComplexContent クラス"
linktitle: "XmlSchemaComplexContent"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaComplexContent クラス。World Wide Web Consortium (W3C) が定義する XML Schema の complexContent 要素を表します。このクラスは複合型のための complex content モデルを表します。C++ において、要素のみまたは混在コンテンツを持つ複合型に対する拡張または制限を含みます。"
type: docs
weight: 1800
url: /ja/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


XML [Schema](../) からの **complexContent** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する通りに表します。このクラスは複合型のための complex content モデルを表します。要素のみまたは混在コンテンツを持つ複合型に対する拡張または制限を含みます。

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Content](./get_content/)() override | コンテンツを返します。 |
| [get_IsMixed](./get_ismixed/)() | 型が混在コンテンツモデルを持つかどうかを判断する情報を返します。 |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | コンテンツを設定します。 |
| [set_IsMixed](./set_ismixed/)(bool) | 型が混在コンテンツモデルを持つかどうかを判断する情報を設定します。 |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | [XmlSchemaComplexContent](./) クラスの新しいインスタンスを初期化します。 |
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
