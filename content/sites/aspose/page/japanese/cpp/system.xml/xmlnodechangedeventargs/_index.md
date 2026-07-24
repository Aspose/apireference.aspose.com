---
title: "System::Xml::XmlNodeChangedEventArgs クラス"
linktitle: "XmlNodeChangedEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs クラス。C++ における XmlDocument::NodeChanged、XmlDocument::NodeChanging、XmlDocument::NodeInserted、XmlDocument::NodeInserting、XmlDocument::NodeRemoved、XmlDocument::NodeRemoving イベントのデータを提供します。"
type: docs
weight: 2600
url: /ja/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


**XmlDocument::NodeChanged**、**XmlDocument::NodeChanging**、**XmlDocument::NodeInserted**、**XmlDocument::NodeInserting**、**XmlDocument::NodeRemoved** および **XmlDocument::NodeRemoving** イベントに対するデータを提供します。

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Action](./get_action/)() | ノード変更イベントの種類を示す値を返します。 |
| [get_NewParent](./get_newparent/)() | 操作完了後の [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) の値を返します。 |
| [get_NewValue](./get_newvalue/)() | ノードの新しい値を返します。 |
| [get_Node](./get_node/)() | 追加、削除、または変更されている [XmlNode](../xmlnode/) を返します。 |
| [get_OldParent](./get_oldparent/)() | 操作開始前の [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) の値を返します。 |
| [get_OldValue](./get_oldvalue/)() | ノードの元の値を返します。 |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | [XmlNodeChangedEventArgs](./) クラスの新しいインスタンスを初期化します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
