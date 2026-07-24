---
title: "System::Xml::Schema::XmlSchemaAny クラス"
linktitle: "XmlSchemaAny"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAny クラス。World Wide Web Consortium (W3C) の any 要素を C++ で表します。"
type: docs
weight: 800
url: /ja/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


World Wide [Web](../../system.web/) Consortium (W3C) の **any** 要素を表します。

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Namespace](./get_namespace/)() | 使用可能な要素を含む名前空間を返します。 |
| [get_ProcessContents](./get_processcontents/)() | **any** 要素で指定された要素に対する XML ドキュメントの検証を、アプリケーションまたは XML プロセッサがどのように処理すべきかに関する情報を返します。 |
| [set_Namespace](./set_namespace/)(const String\&) | 使用可能な要素を含む名前空間を設定します。 |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | **any** 要素で指定された要素に対する XML ドキュメントの検証を、アプリケーションまたは XML プロセッサがどのように処理すべきかに関する情報を設定します。 |
| [XmlSchemaAny](./xmlschemaany/)() | 新しい [XmlSchemaAny](./) クラスのインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
