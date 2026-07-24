---
title: "System::Xml::XmlEntityReference クラス"
linktitle: "XmlEntityReference"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlEntityReference クラス。C++ におけるエンティティ参照ノードを表します。"
type: docs
weight: 1900
url: /ja/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


エンティティ参照ノードを表します。

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [get_BaseURI](./get_baseuri/)() override | 現在のノードの基本 Uniform Resource Identifier (URI) を返します。 |
| [get_IsReadOnly](./get_isreadonly/)() override | ノードが読み取り専用かどうかを示す値を返します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの名前を返します。 |
| [get_NodeType](./get_nodetype/)() override | ノードのタイプを返します。 |
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

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
