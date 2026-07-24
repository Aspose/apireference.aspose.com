---
title: "System::Xml::XmlCDataSection クラス"
linktitle: "XmlCDataSection"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlCDataSection クラス。C++ における CDATA セクションを表します。"
type: docs
weight: 800
url: /ja/cpp/system.xml/xmlcdatasection/
---
## XmlCDataSection class


CDATA セクションを表します。

```cpp
class XmlCDataSection : public System::Xml::XmlCharacterData
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_PreviousText](./get_previoustext/)() override | このノードの直前にあるテキストノードを返します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | ノードの子要素を指定された[XmlWriter](../xmlwriter/)に保存します。 |
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
