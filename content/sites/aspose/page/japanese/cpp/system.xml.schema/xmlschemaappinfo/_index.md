---
title: "System::Xml::Schema::XmlSchemaAppInfo クラス"
linktitle: "XmlSchemaAppInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAppInfo クラス。C++ における World Wide Web Consortium (W3C) の appinfo 要素を表します。"
type: docs
weight: 1000
url: /ja/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


World Wide [Web](../../system.web/) Consortium (W3C) の **appinfo** 要素を表します。

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Markup](./get_markup/)() | [XmlNode](../../system.xml/xmlnode/) オブジェクトの配列を返します。この配列は **appinfo** の子ノードを表します。 |
| [get_Source](./get_source/)() | アプリケーション情報のソースを返します。 |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | [XmlNode](../../system.xml/xmlnode/) オブジェクトの配列を設定します。この配列は **appinfo** の子ノードを表します。 |
| [set_Source](./set_source/)(const String\&) | アプリケーション情報のソースを設定します。 |
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
