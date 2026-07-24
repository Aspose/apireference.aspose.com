---
title: "System::Xml::XmlSignificantWhitespace クラス"
linktitle: "XmlSignificantWhitespace"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlSignificantWhitespace クラス。混在コンテンツノード内のマークアップ間の空白、または xml:space=''preserve'' スコープ内の空白を表します。C++ ではこれを有意な空白とも呼びます。"
type: docs
weight: 3700
url: /ja/cpp/system.xml/xmlsignificantwhitespace/
---
## XmlSignificantWhitespace class


混在コンテンツノードのマークアップ間の空白、または **xml:space='preserve'** スコープ内の空白を表します。これは有意な空白とも呼ばれます。

```cpp
class XmlSignificantWhitespace : public System::Xml::XmlCharacterData
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_PreviousText](./get_previoustext/)() override | このノードの直前にあるテキストノードを返します。 |
| [get_Value](./get_value/)() override | ノードの値を返します。 |
| [set_Value](./set_value/)(String) override | ノードの値を設定します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | ノードのすべての子ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
