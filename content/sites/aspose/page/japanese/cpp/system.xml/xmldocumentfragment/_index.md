---
title: "System::Xml::XmlDocumentFragment クラス"
linktitle: "XmlDocumentFragment"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocumentFragment クラス。C++ でツリー挿入操作に便利な軽量オブジェクトを表します。"
type: docs
weight: 1500
url: /ja/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


ツリー挿入操作に便利な軽量オブジェクトを表します。

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [get_InnerXml](./get_innerxml/)() override | このノードの子要素を表すマークアップを返します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_OwnerDocument](./get_ownerdocument/)() override | このノードが属する [XmlDocument](../xmldocument/) を返します。 |
| [set_InnerXml](./set_innerxml/)(String) override | このノードの子ノードを表すマークアップを設定します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | ノードのすべての子ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
