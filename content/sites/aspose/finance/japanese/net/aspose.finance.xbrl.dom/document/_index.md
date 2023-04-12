---
title: Class Document
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.Dom.Document クラス. Document はインライン xbrl ドキュメント全体を表します概念的にはドキュメント ツリーのルートでありドキュメントのデータへの主要なアクセスを提供します
type: docs
weight: 6690
url: /ja/net/aspose.finance.xbrl.dom/document/
---
## Document class

Document は、インライン xbrl ドキュメント全体を表します。概念的には、ドキュメント ツリーのルートであり、ドキュメントのデータへの主要なアクセスを提供します。

```csharp
public class Document : Node
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Document](document/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | このノードの絶対ベース URI を取得するか、実装が絶対 URI を取得できなかった場合は null を取得します。 |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | ドキュメントのエンコーディングを取得します。 |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | 子要素を取得します。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 子ノードを取得します。 |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | ドキュメントのコンテンツ タイプを取得します。 |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | これは、ドキュメントのドキュメント要素である子ノードに直接アクセスできる便利な属性です。 |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | ドキュメントの URI を取得します。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | このノードの最初の子を取得します。そのようなノードがない場合、これは null を返します。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | このノードに子があるかどうかを取得します. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | このノードの最後の子を取得します。そのようなノードがない場合、これは null を返します。 |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | このノードの修飾名のローカル部分を取得します。 |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | このノードの名前空間 URI を取得します。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | このノードの直後のノードを取得します。そのようなノードがない場合、これは null を返します。 |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename/) { get; } | ドキュメントのノード名を取得します。 |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | ノード タイプを取得します。 |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | タイプに応じて、このノードの値を取得または設定します。 |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | このノードに関連付けられたドキュメント オブジェクトを取得します。 |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | 親ノードを取得します。 |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix/) { get; set; } | このノードのネームスペース プレフィックスを取得または設定します。 |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | このノードの直前のノードを取得します。そのようなノードがない場合、これは null を返します。 |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | このノードとその子孫のテキスト コンテンツを取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | ノード newChild をこのノードの子リストの最後に追加します。 |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | old child で示された子ノードを子のリストから削除します。 |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | 子ノードの古い子を子のリスト内の新しい子に置き換え、古い子ノードを返します。 |

### 関連項目

* class [Node](../node/)
* 名前空間 [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* 組み立て [Aspose.Finance](../../)


