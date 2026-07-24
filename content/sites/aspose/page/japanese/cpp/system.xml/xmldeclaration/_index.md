---
title: "System::Xml::XmlDeclaration クラス"
linktitle: "XmlDeclaration"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDeclaration クラス。C++ における XML 宣言ノード <?xml version=''1.0''...?> を表します。"
type: docs
weight: 1300
url: /ja/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


XML 宣言ノード **<?xml version='1.0'...?>** を表します。

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [get_Encoding](./get_encoding/)() | XML ドキュメントのエンコーディングレベルを返します。 |
| [get_InnerText](./get_innertext/)() override | [XmlDeclaration](./) の連結された値を返します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_Standalone](./get_standalone/)() | standalone 属性の値を返します。 |
| [get_Value](./get_value/)() override | [XmlDeclaration](./) の値を返します。 |
| [get_Version](./get_version/)() | ドキュメントの XML バージョンを返します。 |
| [set_Encoding](./set_encoding/)(const String\&) | XML ドキュメントのエンコーディングレベルを設定します。 |
| [set_InnerText](./set_innertext/)(String) override | [XmlDeclaration](./) の連結された値を設定します。 |
| [set_Standalone](./set_standalone/)(const String\&) | standalone 属性の値を設定します。 |
| [set_Value](./set_value/)(String) override | [XmlDeclaration](./) の値を設定します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | ノードの子要素を指定された [XmlWriter](../xmlwriter/) に保存します。[XmlDeclaration](./) ノードは子要素を持たないため、このメソッドは効果がありません。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
