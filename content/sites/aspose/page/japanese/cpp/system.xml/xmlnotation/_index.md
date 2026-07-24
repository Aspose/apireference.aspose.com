---
title: "System::Xml::XmlNotation クラス"
linktitle: "XmlNotation"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNotation クラス。C++ の <!NOTATION...> のような表記宣言を表します。"
type: docs
weight: 2900
url: /ja/cpp/system.xml/xmlnotation/
---
## XmlNotation class


**<!NOTATION... >** のような表記宣言を表します。

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。Notation ノードはクローンできません。このメソッドを [XmlNotation](./) オブジェクトで呼び出すと例外がスローされます。 |
| [get_InnerXml](./get_innerxml/)() override | このノードの子要素を表すマークアップを返します。 |
| [get_IsReadOnly](./get_isreadonly/)() override | ノードが読み取り専用かどうかを示す値を返します。 |
| [get_LocalName](./get_localname/)() override | 現在のノードの名前を、名前空間プレフィックスなしで返します。 |
| [get_Name](./get_name/)() override | 現在のノードの名前を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_OuterXml](./get_outerxml/)() override | このノードとそのすべての子ノードを表すマークアップを返します。 |
| [get_PublicId](./get_publicid/)() | 表記宣言の公開識別子の値を返します。 |
| [get_SystemId](./get_systemid/)() | 表記宣言のシステム識別子の値を返します。 |
| [set_InnerXml](./set_innerxml/)(String) override | このノードの子ノードを表すマークアップを設定します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | ノードの子ノードを指定された[XmlWriter](../xmlwriter/)に保存します。このメソッドは[XmlNotation](./)ノードには影響しません。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | ノードを指定された[XmlWriter](../xmlwriter/)に保存します。このメソッドは[XmlNotation](./)ノードには影響しません。 |
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
