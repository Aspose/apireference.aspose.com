---
title: Class Node
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.Dom.Node クラス. Node クラスはDocument オブジェクト モデル全体の主要なデータ型ですこれはドキュメント ツリー内の単一のノードを表します
type: docs
weight: 7460
url: /ja/net/aspose.finance.xbrl.dom/node/
---
## Node class

Node クラスは、Document オブジェクト モデル全体の主要なデータ型です。これは、ドキュメント ツリー内の単一のノードを表します。

```csharp
public abstract class Node
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | このノードの絶対ベース URI を取得するか、実装が絶対 URI を取得できなかった場合は null を取得します。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 子ノードを取得します。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | このノードの最初の子を取得します。そのようなノードがない場合、これは null を返します。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | このノードに子があるかどうかを取得します. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | このノードの最後の子を取得します。そのようなノードがない場合、これは null を返します。 |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | このノードの修飾名のローカル部分を取得します。 |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | このノードの名前空間 URI を取得します。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | このノードの直後のノードを取得します。そのようなノードがない場合、これは null を返します。 |
| abstract [NodeName](../../aspose.finance.xbrl.dom/node/nodename/) { get; } | タイプに応じてノード名を取得します。 |
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

## 田畑

| 名前 | 説明 |
| --- | --- |
| const [COMMENT_NODE](../../aspose.finance.xbrl.dom/node/comment_node/) | コメント ノード タイプ. |
| const [DOCUMENT_NODE](../../aspose.finance.xbrl.dom/node/document_node/) | ドキュメント ノード タイプ. |
| const [DOCUMENT_TYPE_NODE](../../aspose.finance.xbrl.dom/node/document_type_node/) | 文書型ノード type. |
| const [ELEMENT_NODE](../../aspose.finance.xbrl.dom/node/element_node/) | 要素ノード タイプ. |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.finance.xbrl.dom/node/processing_instruction_node/) | 処理命令ノード タイプ. |
| const [TEXT_NODE](../../aspose.finance.xbrl.dom/node/text_node/) | テキスト ノード タイプ. |

### 関連項目

* 名前空間 [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* 組み立て [Aspose.Finance](../../)


