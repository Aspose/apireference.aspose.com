---
title: "System::Xml::XPath::XPathNavigator クラス"
linktitle: "XPathNavigator"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator クラス。C++ で XML データをナビゲートおよび編集するためのカーソルモデルを提供します。"
type: docs
weight: 500
url: /ja/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


XML データのナビゲーションと編集のためのカーソルモデルを提供します。

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | 現在のノードの子ノードリストの末尾に、1 つ以上の新しい子ノードを作成するために使用される [XmlWriter](../../system.xml/xmlwriter/) オブジェクトを返します。 |
| virtual [AppendChild](./appendchild/)(String) | 指定された XML データ文字列を使用して、現在のノードの子ノードリストの末尾に新しい子ノードを作成します。 |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | 指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトの XML コンテンツを使用して、現在のノードの子ノードリストの末尾に新しい子ノードを作成します。 |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | 指定された [XPathNavigator](./) のノードを使用して、現在のノードの子ノードリストの末尾に新しい子ノードを作成します。 |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | 指定された名前空間プレフィックス、ローカル名、および名前空間 URI とその値を使用して、現在のノードの子ノードリストの末尾に新しい子要素ノードを作成します。 |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | [XPathNavigator](./) の XML データが提供された XML [Schema](../../system.xml.schema/) 定義言語 (XSD) スキーマに準拠していることを検証します。 |
| virtual [Clone](./clone/)() | 派生クラスでオーバーライドされた場合、現在の [XPathNavigator](./) と同じノードに位置する新しい [XPathNavigator](./) を作成します。 |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | 現在の [XPathNavigator](./) の位置と指定された [XPathNavigator](./) の位置を比較します。 |
| virtual [Compile](./compile/)(String) | [XPath](../) 式を表す文字列をコンパイルし、[XPathExpression](../xpathexpression/) オブジェクトを返します。 |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | 指定された名前空間プレフィックス、ローカル名、および名前空間 URI とその値を使用して、現在の要素ノードに属性ノードを作成します。 |
| virtual [CreateAttributes](./createattributes/)() | 現在の要素に新しい属性を作成するために使用される [XmlWriter](../../system.xml/xmlwriter/) オブジェクトを返します。 |
| [CreateNavigator](./createnavigator/)() override | [XPathNavigator](./) のコピーを返します。 |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | 現在のノードから指定されたノードまでの兄弟ノードの範囲を削除します。 |
| virtual [DeleteSelf](./deleteself/)() | 現在のノードとその子ノードを削除します。 |
| virtual [Evaluate](./evaluate/)(String) | 指定された [XPath](../) 式を評価し、型付き結果を返します。 |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 指定された [XPath](../) 式を評価し、型付き結果を返します。評価には、[XPath](../) 式内の名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用します。 |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | [XPathExpression](../xpathexpression/) を評価し、型付き結果を返します。 |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | 提供されたコンテキストを使用して [XPathExpression](../xpathexpression/) を評価し、型付き結果を返します。 |
| virtual [get_BaseURI](./get_baseuri/)() | 派生クラスでオーバーライドされた場合、現在のノードのベース URI を取得します。 |
| virtual [get_CanEdit](./get_canedit/)() | [XPathNavigator](./) が基になる XML データを編集できるかどうかを示す値を返します。 |
| virtual [get_HasAttributes](./get_hasattributes/)() | 現在のノードに属性があるかどうかを示す値を返します。 |
| virtual [get_HasChildren](./get_haschildren/)() | 現在のノードに子ノードがあるかどうかを示す値を返します。 |
| virtual [get_InnerXml](./get_innerxml/)() | 現在のノードの子ノードを表すマークアップを返します。 |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | 派生クラスでオーバーライドされた場合、現在のノードが終了タグのない空要素かどうかを示す値を取得します。 |
| [get_IsNode](./get_isnode/)() override | 現在のノードが [XPath](../) ノードを表すかどうかを示す値を返します。 |
| virtual [get_LocalName](./get_localname/)() | 派生クラスでオーバーライドされた場合、名前空間プレフィックスなしで現在のノードの [XPathNavigator::get_Name](./get_name/) を取得します。 |
| virtual [get_Name](./get_name/)() | 派生クラスでオーバーライドされた場合、現在のノードの修飾名を取得します。 |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | 派生クラスでオーバーライドされた場合、現在のノードの名前空間 URI を取得します。 |
| virtual [get_NameTable](./get_nametable/)() | 派生クラスでオーバーライドされた場合、[XPathNavigator](./) の [XmlNameTable](../../system.xml/xmlnametable/) を取得します。 |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | [XPathNavigator](./) オブジェクトの等価比較に使用される [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) を返します。 |
| virtual [get_NodeType](./get_nodetype/)() | 派生クラスでオーバーライドされた場合、現在のノードの [XPathNodeType](../xpathnodetype/) を取得します。 |
| virtual [get_OuterXml](./get_outerxml/)() | 現在のノードとその子ノードの開始タグと終了タグを表すマークアップを返します。 |
| virtual [get_Prefix](./get_prefix/)() | 派生クラスでオーバーライドされた場合、現在のノードに関連付けられた名前空間プレフィックスを取得します。 |
| virtual [get_SchemaInfo](./get_schemainfo/)() | スキーマ検証の結果、現在のノードに割り当てられたスキーマ情報を返します。 |
| [get_TypedValue](./get_typedvalue/)() override | 最も適切な型のボックス化されたオブジェクトとして現在のノードを返します。 |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | ストア上に「仮想化」された XML ビューを提供する [XPathNavigator](./) 実装で使用され、基礎となるオブジェクトへのアクセスを提供します。 |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | 現在のノードの値を [Boolean](../../system/boolean/) として返します。 |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | 現在のノードの値を [DateTime](../../system/datetime/) として返します。 |
| [get_ValueAsDouble](./get_valueasdouble/)() override | 現在のノードの値を [Double](../../system/double/) として返します。 |
| [get_ValueAsInt](./get_valueasint/)() override | 現在のノードの値を [Int32](../../system/int32/) として返します。 |
| [get_ValueAsLong](./get_valueaslong/)() override | 現在のノードの値を [Int64](../../system/int64/) として返します。 |
| [get_ValueType](./get_valuetype/)() override | 現在のノードの型を返します。 |
| virtual [get_XmlLang](./get_xmllang/)() | 現在のノードの **xml:lang** スコープを返します。 |
| [get_XmlType](./get_xmltype/)() override | 現在のノードの XmlSchemaType 情報を返します。 |
| virtual [GetAttribute](./getattribute/)(String, String) | 指定されたローカル名と名前空間 URI を持つ属性の値を返します。 |
| virtual [GetNamespace](./getnamespace/)(String) | 指定されたローカル名に対応する名前空間ノードの値を返します。 |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | 現在のノードのスコープ内名前空間を返します。 |
| virtual [InsertAfter](./insertafter/)() | 現在選択されているノードの後に新しい兄弟ノードを作成するために使用される [XmlWriter](../../system.xml/xmlwriter/) オブジェクトを返します。 |
| virtual [InsertAfter](./insertafter/)(String) | 指定された XML 文字列を使用して、現在選択されているノードの後に新しい兄弟ノードを作成します。 |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | 指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトの XML 内容を使用して、現在選択されているノードの後に新しい兄弟ノードを作成します。 |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | 指定された [XPathNavigator](./) オブジェクト内のノードを使用して、現在選択されているノードの後に新しい兄弟ノードを作成します。 |
| virtual [InsertBefore](./insertbefore/)() | 現在選択されているノードの前に新しい兄弟ノードを作成するために使用される [XmlWriter](../../system.xml/xmlwriter/) オブジェクトを返します。 |
| virtual [InsertBefore](./insertbefore/)(String) | 指定された XML 文字列を使用して、現在選択されているノードの前に新しい兄弟ノードを作成します。 |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | 指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトの XML 内容を使用して、現在選択されているノードの前に新しい兄弟ノードを作成します。 |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | 指定された [XPathNavigator](./) のノードを使用して、現在選択されているノードの前に新しい兄弟ノードを作成します。 |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | 指定された名前空間プレフィックス、ローカル名、名前空間 URI を使用し、指定された値で、現在のノードの後に新しい兄弟要素を作成します。 |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | 指定された名前空間プレフィックス、ローカル名、名前空間URIを使用し、指定された値で、現在のノードの前に新しい兄弟要素を作成します。 |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | 指定された[XPathNavigator](./)が現在の[XPathNavigator](./)の子孫であるかどうかを判断します。 |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | 派生クラスでオーバーライドされた場合、現在の[XPathNavigator](./)が指定された[XPathNavigator](./)と同じ位置にあるかどうかを判断します。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 指定されたプレフィックスの名前空間 URI を返します。 |
| [LookupPrefix](./lookupprefix/)(const String\&) override | 指定された名前空間URIに対して宣言されたプレフィックスを返します。 |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | 現在のノードが指定された[XPathExpression](../xpathexpression/)と一致するかどうかを判断します。 |
| virtual [Matches](./matches/)(String) | 現在のノードが指定された[XPath](../)式と一致するかどうかを判断します。 |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | 派生クラスでオーバーライドされた場合、[XPathNavigator](./)を指定された[XPathNavigator](./)と同じ位置に移動します。 |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | [XPathNavigator](./)を一致するローカル名と名前空間URIを持つ属性へ移動します。 |
| virtual [MoveToChild](./movetochild/)(String, String) | [XPathNavigator](./)を指定されたローカル名と名前空間URIを持つ子ノードへ移動します。 |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | [XPathNavigator](./)を指定された[XPathNodeType](../xpathnodetype/)の子ノードへ移動します。 |
| virtual [MoveToFirst](./movetofirst/)() | [XPathNavigator](./)を現在のノードの最初の兄弟ノードへ移動します。 |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | 派生クラスでオーバーライドされた場合、[XPathNavigator](./)を現在のノードの最初の属性へ移動します。 |
| virtual [MoveToFirstChild](./movetofirstchild/)() | 派生クラスでオーバーライドされた場合、[XPathNavigator](./)を現在のノードの最初の子ノードへ移動します。 |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | 派生クラスでオーバーライドされた場合、[XPathNavigator](./)を指定された[XPathNamespaceScope](../xpathnamespacescope/)に一致する最初の名前空間ノードへ移動します。 |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | [XPathNavigator](./)を現在のノードの最初の名前空間ノードへ移動します。 |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | [XPathNavigator](./)を文書順で指定されたローカル名と名前空間URIを持つ要素へ移動します。 |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./)を文書順で、指定されたローカル名と名前空間URIを持つ要素へ、指定された境界まで移動します。 |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | [XPathNavigator](./)を文書順で指定された[XPathNodeType](../xpathnodetype/)の次の要素へ移動します。 |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./)を文書順で、指定された[XPathNodeType](../xpathnodetype/)の次の要素へ、指定された境界まで移動します。 |
| virtual [MoveToId](./movetoid/)(String) | 派生クラスでオーバーライドされた場合、**ID** 型の属性を持ち、その値が指定された[String](../../system/string/)と一致するノードへ移動します。 |
| virtual [MoveToNamespace](./movetonamespace/)(String) | [XPathNavigator](./)を指定された名前空間プレフィックスを持つ名前空間ノードへ移動します。 |
| virtual [MoveToNext](./movetonext/)() | 派生クラスでオーバーライドされた場合、[XPathNavigator](./)を現在のノードの次の兄弟ノードへ移動します。 |
| virtual [MoveToNext](./movetonext/)(String, String) | [XPathNavigator](./)を指定されたローカル名と名前空間URIを持つ次の兄弟ノードへ移動します。 |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | [XPathNavigator](./)を現在のノードの次の兄弟ノードで、指定された[XPathNodeType](../xpathnodetype/)に一致するものへ移動します。 |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | 派生クラスでオーバーライドされた場合、[XPathNavigator](./)を次の属性へ移動します。 |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | 派生クラスでオーバーライドされた場合、[XPathNavigator](./) を指定された [XPathNamespaceScope](../xpathnamespacescope/) に一致する次の名前空間ノードへ移動します。 |
| [MoveToNextNamespace](./movetonextnamespace/)() | [XPathNavigator](./) を次の名前空間ノードへ移動します。 |
| virtual [MoveToParent](./movetoparent/)() | 派生クラスでオーバーライドされた場合、[XPathNavigator](./) を現在のノードの親ノードへ移動します。 |
| virtual [MoveToPrevious](./movetoprevious/)() | 派生クラスでオーバーライドされた場合、[XPathNavigator](./) を現在のノードの前の兄弟ノードへ移動します。 |
| virtual [MoveToRoot](./movetoroot/)() | [XPathNavigator](./) を現在のノードが属するルートノードへ移動します。 |
| virtual [PrependChild](./prependchild/)() | 現在のノードの子ノードリストの先頭に新しい子ノードを作成するために使用される [XmlWriter](../../system.xml/xmlwriter/) オブジェクトを返します。 |
| virtual [PrependChild](./prependchild/)(String) | 指定された XML 文字列を使用して、現在のノードの子ノードリストの先頭に新しい子ノードを作成します。 |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | 指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトの XML 内容を使用して、現在のノードの子ノードリストの先頭に新しい子ノードを作成します。 |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | 指定された [XPathNavigator](./) オブジェクトのノードを使用して、現在のノードの子ノードリストの先頭に新しい子ノードを作成します。 |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | 指定された名前空間プレフィックス、ローカル名、名前空間 URI とその値を使用して、現在のノードの子ノードリストの先頭に新しい子要素を作成します。 |
| virtual [ReadSubtree](./readsubtree/)() | 現在のノードとその子ノードを含む [XmlReader](../../system.xml/xmlreader/) オブジェクトを返します。 |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | 現在のノードから指定されたノードまでの兄弟ノードの範囲を置換します。 |
| virtual [ReplaceSelf](./replaceself/)(String) | 指定された文字列の内容で現在のノードを置換します。 |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | 指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトの内容で現在のノードを置換します。 |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | 指定された [XPathNavigator](./) オブジェクトの内容で現在のノードを置換します。 |
| virtual [Select](./select/)(String) | 指定された [XPath](../) 式を使用してノードセットを選択します。 |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用し、指定された [XPath](../) 式でノードセットを選択します。 |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | 指定された [XPathExpression](../xpathexpression/) を使用してノードセットを選択します。 |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | 一致する [XPathNodeType](../xpathnodetype/) を持つ現在のノードのすべての先祖ノードを選択します。 |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | 指定されたローカル名と名前空間 URI を持つ現在のノードのすべての先祖ノードを選択します。 |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | 一致する [XPathNodeType](../xpathnodetype/) を持つ現在のノードのすべての子ノードを選択します。 |
| virtual [SelectChildren](./selectchildren/)(String, String) | 指定されたローカル名と名前空間 URI を持つ現在のノードのすべての子ノードを選択します。 |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | 一致する [XPathNodeType](../xpathnodetype/) を持つ現在のノードのすべての子孫ノードを選択します。 |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | 指定されたローカル名と名前空間 URI を持つ現在のノードのすべての子孫ノードを選択します。 |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | 指定された [XPath](../) クエリを使用して [XPathNavigator](./) 内の単一ノードを選択します。 |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 指定された [XPath](../) クエリを使用し、名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) オブジェクトと共に、[XPathNavigator](./) オブジェクト内の単一ノードを選択します。 |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | [XPathNavigator](./) で、指定された [XPathExpression](../xpathexpression/) オブジェクトを使用して単一ノードを選択します。 |
| virtual [set_InnerXml](./set_innerxml/)(String) | 現在のノードの子ノードを表すマークアップを設定します。 |
| virtual [set_OuterXml](./set_outerxml/)(String) | 現在のノードとその子ノードの開始タグと終了タグを表すマークアップを設定します。 |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | 現在のノードの型付き値を設定します。 |
| virtual [SetValue](./setvalue/)(String) | 現在のノードの値を設定します。 |
| [ToString](./tostring/)() const override | 現在のノードのテキスト値を返します。 |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | 名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用し、指定された型として現在のノードの値を返します。 |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | 指定された [XmlWriter](../../system.xml/xmlwriter/) オブジェクトに現在のノードとその子ノードをストリームします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
