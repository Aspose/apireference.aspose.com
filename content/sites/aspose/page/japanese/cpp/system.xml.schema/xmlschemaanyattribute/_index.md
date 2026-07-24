---
title: "System::Xml::Schema::XmlSchemaAnyAttribute クラス"
linktitle: "XmlSchemaAnyAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAnyAttribute クラス。C++ における World Wide Web Consortium (W3C) の anyAttribute 要素を表します。"
type: docs
weight: 900
url: /ja/cpp/system.xml.schema/xmlschemaanyattribute/
---
## XmlSchemaAnyAttribute class


World Wide [Web](../../system.web/) Consortium (W3C) の **anyAttribute** 要素を表します。

```cpp
class XmlSchemaAnyAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Namespace](./get_namespace/)() | 使用可能な属性を含む名前空間を返します。 |
| [get_ProcessContents](./get_processcontents/)() | アプリケーションまたは XML プロセッサが **anyAttribute** 要素で指定された属性に対して XML ドキュメントの検証をどのように処理すべきかに関する情報を返します。 |
| [set_Namespace](./set_namespace/)(const String\&) | 使用可能な属性を含む名前空間を設定します。 |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | アプリケーションまたは XML プロセッサが **anyAttribute** 要素で指定された属性に対して XML ドキュメントの検証をどのように処理すべきかに関する情報を設定します。 |
| [XmlSchemaAnyAttribute](./xmlschemaanyattribute/)() | [XmlSchemaAnyAttribute](./) クラスの新しいインスタンスを初期化します。 |
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
