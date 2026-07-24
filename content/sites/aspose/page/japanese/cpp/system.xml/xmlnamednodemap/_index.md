---
title: "System::Xml::XmlNamedNodeMap クラス"
linktitle: "XmlNamedNodeMap"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap クラス。C++ で名前またはインデックスでアクセスできるノードのコレクションを表します。"
type: docs
weight: 2200
url: /ja/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


名前またはインデックスでアクセスできるノードのコレクションを表します。

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [begin](./begin/)() const | コレクションの最初の要素へのイテレータを取得します。 |
| [cbegin](./cbegin/)() const | コレクションの最初の要素へのイテレータを取得します。 |
| [cend](./cend/)() const | コレクションの最後の要素の後ろにある存在しない要素へのイテレータを取得します。 |
| [end](./end/)() const | コレクションの最後の要素の後ろにある存在しない要素へのイテレータを取得します。 |
| virtual [get_Count](./get_count/)() | [XmlNamedNodeMap](./) のノード数を返します。 |
| [GetEnumerator](./getenumerator/)() override | [XmlNamedNodeMap](./) のノードコレクションの反復処理をサポートします。 |
| virtual [GetNamedItem](./getnameditem/)(String) | 名前で指定された[XmlNode](../xmlnode/)を取得します。 |
| virtual [GetNamedItem](./getnameditem/)(String, String) | 一致する[XmlNode::get_LocalName](../xmlnode/get_localname/)と[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)の値を持つノードを取得します。 |
| virtual [Item](./item/)(int32_t) | 指定されたインデックスの[XmlNamedNodeMap](./)内のノードを取得します。 |
| virtual [RemoveNamedItem](./removenameditem/)(String) | [XmlNamedNodeMap](./)からノードを削除します。 |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | 一致する[XmlNode::get_LocalName](../xmlnode/get_localname/)と[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)の値を持つノードを削除します。 |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | [XmlNode::get_Name](../xmlnode/get_name/)の値を使用して[XmlNode](../xmlnode/)を追加します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [iterator](./iterator/) | イテレータ型。 |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
