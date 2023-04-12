---
title: Class HTMLFieldSetElement
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.Dom.Html.HTMLFieldSetElement クラス. フォーム コントロールを論理グループに編成します HTML 4.01 の FIELDSET 要素の定義を参照してください
type: docs
weight: 6870
url: /ja/net/aspose.finance.xbrl.dom.html/htmlfieldsetelement/
---
## HTMLFieldSetElement class

フォーム コントロールを論理グループに編成します。 HTML 4.01 の FIELDSET 要素の定義を参照してください。

```csharp
public class HTMLFieldSetElement : HTMLElement
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Attributes](../../aspose.finance.xbrl.dom/element/attributes/) { get; } | 要素の属性を取得します。 |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | このノードの絶対ベース URI を取得するか、実装が絶対 URI を取得できなかった場合は null を取得します。 |
| [ChildElements](../../aspose.finance.xbrl.dom/element/childelements/) { get; } | 要素の子要素を取得します。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 子ノードを取得します。 |
| [ClassName](../../aspose.finance.xbrl.dom.html/htmlelement/classname/) { get; set; } | 要素のクラス属性を取得または設定します。この属性は、多くの言語で公開されている「class」キーワードと競合するため、名前が変更されました。 HTML 4.01 の class 属性の定義を参照してください。 |
| [Dir](../../aspose.finance.xbrl.dom.html/htmlelement/dir/) { get; set; } | 方向的にニュートラルなテキストのベース方向とテーブルの方向性を取得または設定します。 HTML 4.01. の dir 属性の定義を参照してください。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | このノードの最初の子を取得します。そのようなノードがない場合、これは null を返します。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | このノードに子があるかどうかを取得します. |
| [Id](../../aspose.finance.xbrl.dom.html/htmlelement/id/) { get; set; } | 要素の識別子を取得または設定します。 HTML 4.01 の id 属性の定義を参照してください。 |
| [Lang](../../aspose.finance.xbrl.dom.html/htmlelement/lang/) { get; set; } | RFC 1766 で定義されている言語コードを取得または設定します。HTML 4.01 の lang 属性の定義を参照してください。 |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | このノードの最後の子を取得します。そのようなノードがない場合、これは null を返します。 |
| override [LocalName](../../aspose.finance.xbrl.dom/element/localname/) { get; } | 要素のローカル名を取得します。 |
| override [NamespaceURI](../../aspose.finance.xbrl.dom/element/namespaceuri/) { get; } | 要素の名前空間 URI を取得します。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | このノードの直後のノードを取得します。そのようなノードがない場合、これは null を返します。 |
| override [NodeName](../../aspose.finance.xbrl.dom/element/nodename/) { get; } | 要素のノード名を取得します。 |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | ノード タイプを取得します。 |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | タイプに応じて、このノードの値を取得または設定します。 |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | このノードに関連付けられたドキュメント オブジェクトを取得します。 |
| [ParentElement](../../aspose.finance.xbrl.dom/element/parentelement/) { get; } | 要素の親要素を取得します。 |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | 親ノードを取得します。 |
| override [Prefix](../../aspose.finance.xbrl.dom/element/prefix/) { get; } | 要素のプレフィックスを取得します。 |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | このノードの直前のノードを取得します。そのようなノードがない場合、これは null を返します。 |
| override [TextContent](../../aspose.finance.xbrl.dom/element/textcontent/) { get; set; } | 要素のテキスト コンテンツを取得します。 |
| [Title](../../aspose.finance.xbrl.dom.html/htmlelement/title/) { get; set; } | 要素のアドバイザリ タイトルを取得または設定します。 HTML 4.01 の title 属性の定義を参照してください。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | ノード newChild をこのノードの子リストの最後に追加します。 |
| [GetAttribute](../../aspose.finance.xbrl.dom/element/getattribute/)(string) | 名前で属性値を取得します。 |
| [GetAttributeNS](../../aspose.finance.xbrl.dom/element/getattributens/)(string, string) | ローカル名と名前空間 URI によって属性値を取得します。 |
| [HasAttribute](../../aspose.finance.xbrl.dom/element/hasattribute/)(string) | 指定された名前の属性がこの要素で指定されている場合、またはデフォルト値がある場合は true、それ以外の場合は false を返します。 |
| [HasAttributeNS](../../aspose.finance.xbrl.dom/element/hasattributens/)(string, string) | 特定のローカル名と名前空間 URI を持つ属性がこの要素で指定されている場合、またはデフォルト値がある場合は true、それ以外の場合は false を返します。 |
| [RemoveAttribute](../../aspose.finance.xbrl.dom/element/removeattribute/)(string) | 名前で属性を削除します。 |
| [RemoveAttributeNS](../../aspose.finance.xbrl.dom/element/removeattributens/)(string, string) | ローカル名と名前空間 URI によって属性を削除します。 |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | old child で示された子ノードを子のリストから削除します。 |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | 子ノードの古い子を子のリスト内の新しい子に置き換え、古い子ノードを返します。 |
| [SetAttribute](../../aspose.finance.xbrl.dom/element/setattribute/)(string, string) | 新しい属性を追加します。その名前の属性が要素に既に存在する場合、その値は値パラメーターの値に変更されます。 |
| [SetAttributeNS](../../aspose.finance.xbrl.dom/element/setattributens/)(string, string, string) | 新しい属性を追加します。同じローカル名と名前空間 URI を持つ属性が要素に既に存在する場合、そのプレフィックスは修飾された名前のプレフィックス部分に変更され、その値は値パラメーターに変更されます. |

### 関連項目

* class [HTMLElement](../htmlelement/)
* 名前空間 [Aspose.Finance.Xbrl.Dom.Html](../../aspose.finance.xbrl.dom.html/)
* 組み立て [Aspose.Finance](../../)


