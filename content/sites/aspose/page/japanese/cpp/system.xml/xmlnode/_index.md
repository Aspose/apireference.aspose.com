---
title: "System::Xml::XmlNode クラス"
linktitle: "XmlNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNode クラス。C++ の XML ドキュメント内の単一ノードを表します。"
type: docs
weight: 2500
url: /ja/cpp/system.xml/xmlnode/
---
## XmlNode class


XML ドキュメント内の単一ノードを表します。

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | このノードの子ノードリストの末尾に、指定されたノードを追加します。 |
| virtual [Clone](./clone/)() | このノードの複製を作成します。 |
| virtual [CloneNode](./clonenode/)(bool) | 派生クラスでオーバーライドされた場合、ノードの複製を作成します。 |
| [CreateNavigator](./createnavigator/)() override | このオブジェクトをナビゲートするための XPathNavigator を作成します。 |
| virtual [get_Attributes](./get_attributes/)() | このノードの属性を含む [XmlAttributeCollection](../xmlattributecollection/) を返します。 |
| virtual [get_BaseURI](./get_baseuri/)() | 現在のノードの基本 URI を返します。 |
| virtual [get_ChildNodes](./get_childnodes/)() | ノードのすべての子ノードを返します。 |
| virtual [get_FirstChild](./get_firstchild/)() | ノードの最初の子ノードを返します。 |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | このノードに子ノードがあるかどうかを示す値を返します。 |
| virtual [get_InnerText](./get_innertext/)() | ノードとすべての子ノードの連結された値を返します。 |
| virtual [get_InnerXml](./get_innerxml/)() | このノードの子ノードのみを表すマークアップを返します。 |
| virtual [get_IsReadOnly](./get_isreadonly/)() | ノードが読み取り専用かどうかを示す値を返します。 |
| virtual [get_LastChild](./get_lastchild/)() | ノードの最後の子ノードを返します。 |
| virtual [get_LocalName](./get_localname/)() | 派生クラスでオーバーライドされた場合、ノードのローカル名を返します。 |
| virtual [get_Name](./get_name/)() | 派生クラスでオーバーライドされた場合、ノードの修飾名を返します。 |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | このノードの名前空間 URI を返します。 |
| virtual [get_NextSibling](./get_nextsibling/)() | このノードのすぐ後にあるノードを返します。 |
| virtual [get_NodeType](./get_nodetype/)() | 派生クラスでオーバーライドされた場合、現在のノードのタイプを返します。 |
| virtual [get_OuterXml](./get_outerxml/)() | このノードとすべての子ノードを含むマークアップを返します。 |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | このノードが属する [XmlDocument](../xmldocument/) を返します。 |
| virtual [get_ParentNode](./get_parentnode/)() | このノードの親ノードを返します（親を持てるノードの場合）。 |
| virtual [get_Prefix](./get_prefix/)() | このノードの名前空間プレフィックスを返します。 |
| virtual [get_PreviousSibling](./get_previoussibling/)() | このノードのすぐ前にあるノードを返します。 |
| virtual [get_PreviousText](./get_previoustext/)() | このノードの直前にあるテキストノードを返します。 |
| virtual [get_SchemaInfo](./get_schemainfo/)() | スキーマ検証の結果としてこのノードに割り当てられた、スキーマ検証後の情報セットを返します。 |
| virtual [get_Value](./get_value/)() | ノードの値を返します。 |
| [GetEnumerator](./getenumerator/)() override | 現在のノード内の子ノードを反復処理する列挙子を返します。 |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | 現在のノードのスコープ内で指定されたプレフィックスに最も近い **xmlns** 宣言を検索し、その宣言に含まれる名前空間 URI を返します。 |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | 現在のノードのスコープ内で指定された名前空間 URI に最も近い **xmlns** 宣言を検索し、その宣言で定義されたプレフィックスを返します。 |
| virtual [idx_get](./idx_get/)(String) | 指定された [XmlNode::get_Name](./get_name/) を持つ最初の子要素を返します。 |
| virtual [idx_get](./idx_get/)(String, String) | 指定された [XmlNode::get_LocalName](./get_localname/) と [XmlNode::get_NamespaceURI](./get_namespaceuri/) の値を持つ最初の子要素を返します。 |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 指定されたノードを、指定された参照ノードの直後に挿入します。 |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 指定されたノードを、指定された参照ノードの直前に挿入します。 |
| virtual [Normalize](./normalize/)() | この [XmlNode](./) の下位サブツリー全体の深さにあるすべての [XmlText](../xmltext/) ノードを、マークアップ（タグ、コメント、処理命令、CDATA セクション、エンティティ参照）のみが [XmlText](../xmltext/) ノードを分離する「通常」形式に変換します。つまり、隣接する [XmlText](../xmltext/) ノードは存在しません。 |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | 指定されたノードを、このノードの子ノードリストの先頭に追加します。 |
| virtual [RemoveAll](./removeall/)() | 現在のノードのすべての子ノードおよび/または属性を削除します。 |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | 指定された子ノードを削除します。 |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 子ノード **oldChild** を **newChild** ノードに置き換えます。 |
| [SelectNodes](./selectnodes/)(const String\&) | [XPath](../../system.xml.xpath/) 式に一致するノードのリストを選択します。 |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | [XPath](../../system.xml.xpath/) 式に一致するノードのリストを選択します。 [XPath](../../system.xml.xpath/) 式で見つかったすべてのプレフィックスは、提供された [XmlNamespaceManager](../xmlnamespacemanager/) を使用して解決されます。 |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | [XPath](../../system.xml.xpath/) 式に一致する最初の [XmlNode](./) を選択します。 |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | [XPath](../../system.xml.xpath/) 式に一致する最初の [XmlNode](./) を選択します。 [XPath](../../system.xml.xpath/) 式で見つかったすべてのプレフィックスは、提供された [XmlNamespaceManager](../xmlnamespacemanager/) を使用して解決されます。 |
| virtual [set_InnerText](./set_innertext/)(String) | ノードとそのすべての子ノードの連結された値を設定します。 |
| virtual [set_InnerXml](./set_innerxml/)(String) | このノードの子ノードのみを表すマークアップを設定します。 |
| virtual [set_Prefix](./set_prefix/)(String) | このノードの名前空間プレフィックスを設定します。 |
| virtual [set_Value](./set_value/)(String) | ノードの値を設定します。 |
| virtual [Supports](./supports/)(String, String) | DOM 実装が特定の機能を実装しているかテストします。 |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | 派生クラスでオーバーライドされた場合、ノードのすべての子ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | 派生クラスでオーバーライドされた場合、現在のノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
