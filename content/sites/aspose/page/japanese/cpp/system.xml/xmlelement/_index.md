---
title: "System::Xml::XmlElement クラス"
linktitle: "XmlElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement クラス。C++ の要素を表します。"
type: docs
weight: 1700
url: /ja/cpp/system.xml/xmlelement/
---
## XmlElement class


要素を表します。

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| virtual [get_HasAttributes](./get_hasattributes/)() | 現在のノードが属性を持つかどうかを示す **bool** 値を返します。 |
| [get_InnerText](./get_innertext/)() override | ノードとそのすべての子の連結された値を返します。 |
| [get_InnerXml](./get_innerxml/)() override | このノードの子だけを表すマークアップを返します。 |
| [get_IsEmpty](./get_isempty/)() | 要素のタグ形式を返します。 |
| [get_LocalName](./get_localname/)() override | 現在のノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | このノードの名前空間 URI を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_OwnerDocument](./get_ownerdocument/)() override | このノードが属する [XmlDocument](../xmldocument/) を返します。 |
| [get_Prefix](./get_prefix/)() override | このノードの名前空間プレフィックスを返します。 |
| [get_SchemaInfo](./get_schemainfo/)() override | スキーマ検証の結果としてこのノードに割り当てられた、スキーマ検証後の情報セットを返します。 |
| virtual [GetAttribute](./getattribute/)(String) | 指定された名前の属性の値を返します。 |
| virtual [GetAttribute](./getattribute/)(String, String) | 指定されたローカル名と名前空間 URI の属性の値を返します。 |
| virtual [GetAttributeNode](./getattributenode/)(String) | 指定された名前の [XmlAttribute](../xmlattribute/) を返します。 |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | 指定されたローカル名と名前空間 URI の [XmlAttribute](../xmlattribute/) を返します。 |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | 指定された [XmlElement::get_Name](./get_name/) と一致するすべての子孫要素のリストを含む [XmlNodeList](../xmlnodelist/) を返します。 |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | 指定された [XmlElement::get_LocalName](./get_localname/) と [XmlElement::get_NamespaceURI](./get_namespaceuri/) の値と一致するすべての子孫要素のリストを含む [XmlNodeList](../xmlnodelist/) を返します。 |
| virtual [HasAttribute](./hasattribute/)(String) | 現在のノードが指定された名前の属性を持つかどうかを判定します。 |
| virtual [HasAttribute](./hasattribute/)(String, String) | 現在のノードが指定されたローカル名と名前空間 URI の属性を持つかどうかを判定します。 |
| [RemoveAll](./removeall/)() override | 現在のノードの指定されたすべての属性と子要素を削除します。デフォルト属性は削除されません。 |
| virtual [RemoveAllAttributes](./removeallattributes/)() | 要素から指定されたすべての属性を削除します。デフォルト属性は削除されません。 |
| virtual [RemoveAttribute](./removeattribute/)(String) | 名前で属性を削除します。 |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | 指定されたローカル名と名前空間 URI を持つ属性を削除します。（削除された属性にデフォルト値がある場合、すぐに置き換えられます）。 |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | 要素から指定されたインデックスの属性ノードを削除します。（削除された属性にデフォルト値がある場合、すぐに置き換えられます）。 |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | 指定された[XmlAttribute](../xmlattribute/)を削除します。 |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | ローカル名と名前空間 URI で指定された[XmlAttribute](../xmlattribute/)を削除します。（削除された属性にデフォルト値がある場合、すぐに置き換えられます）。 |
| [set_InnerText](./set_innertext/)(String) override | ノードとそのすべての子ノードの連結された値を設定します。 |
| [set_InnerXml](./set_innerxml/)(String) override | このノードの子要素だけを表すマークアップを設定します。 |
| [set_IsEmpty](./set_isempty/)(bool) | 要素のタグ形式を設定します。 |
| [set_Prefix](./set_prefix/)(String) override | このノードの名前空間プレフィックスを設定します。 |
| virtual [SetAttribute](./setattribute/)(String, String) | 指定された名前の属性の値を設定します。 |
| virtual [SetAttribute](./setattribute/)(String, String, String) | 指定されたローカル名と名前空間 URI を持つ属性の値を設定します。 |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | 指定された[XmlAttribute](../xmlattribute/)を追加します。 |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | 指定された[XmlAttribute](../xmlattribute/)を追加します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | ノードのすべての子ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 現在のノードを指定された[XmlWriter](../xmlwriter/)に保存します。 |
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
