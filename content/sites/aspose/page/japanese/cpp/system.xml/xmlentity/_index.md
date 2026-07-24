---
title: "System::Xml::XmlEntity クラス"
linktitle: "XmlEntity"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlEntity クラス。C++ における <!ENTITY...> のようなエンティティ宣言を表します。"
type: docs
weight: 1800
url: /ja/cpp/system.xml/xmlentity/
---
## XmlEntity class


エンティティ宣言（例: **<!ENTITY... >**）を表します。

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。エンティティノードはクローンできません。このメソッドを [XmlEntity](./) オブジェクトで呼び出すと例外がスローされます。 |
| [get_BaseURI](./get_baseuri/)() override | 現在のノードの基本 Uniform Resource Identifier (URI) を返します。 |
| [get_InnerText](./get_innertext/)() override | エンティティノードとそのすべての子ノードの連結された値を返します。 |
| [get_InnerXml](./get_innerxml/)() override | このノードの子要素を表すマークアップを返します。 |
| [get_IsReadOnly](./get_isreadonly/)() override | ノードが読み取り専用かどうかを示す値を返します。 |
| [get_LocalName](./get_localname/)() override | 名前空間プレフィックスなしでノードの名前を返します。 |
| [get_Name](./get_name/)() override | ノードの名前を返します。 |
| [get_NodeType](./get_nodetype/)() override | ノードのタイプを返します。 |
| [get_NotationName](./get_notationname/)() | エンティティ宣言のオプションのNDATA属性の名前を返します。 |
| [get_OuterXml](./get_outerxml/)() override | このノードとそのすべての子ノードを表すマークアップを返します。 |
| [get_PublicId](./get_publicid/)() | エンティティ宣言の公開識別子の値を返します。 |
| [get_SystemId](./get_systemid/)() | エンティティ宣言のシステム識別子の値を返します。 |
| [set_InnerText](./set_innertext/)(String) override | エンティティノードとそのすべての子ノードの連結された値を設定します。 |
| [set_InnerXml](./set_innerxml/)(String) override | このノードの子ノードを表すマークアップを設定します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 指定された[XmlWriter](../xmlwriter/)にノードのすべての子を保存します。[XmlEntity](./)ノードの場合、このメソッドは効果がありません。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 指定された[XmlWriter](../xmlwriter/)にノードを保存します。[XmlEntity](./)ノードの場合、このメソッドは効果がありません。 |
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
