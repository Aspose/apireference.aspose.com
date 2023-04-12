---
title: Class ProcessingInstruction
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.Dom.ProcessingInstruction クラス. クラスは処理命令を表しドキュメントのテキストにプロセッサ固有の情報を保持する方法として XML で使用されます
type: docs
weight: 7480
url: /ja/net/aspose.finance.xbrl.dom/processinginstruction/
---
## ProcessingInstruction class

クラスは「処理命令」を表し、ドキュメントのテキストにプロセッサ固有の情報を保持する方法として XML で使用されます。

```csharp
public class ProcessingInstruction : CharacterData
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | このノードの絶対ベース URI を取得するか、実装が絶対 URI を取得できなかった場合は null を取得します。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 子ノードを取得します。 |
| [Data](../../aspose.finance.xbrl.dom/characterdata/data/) { get; set; } | このインターフェイスを実装するノードの文字データを取得または設定します。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | このノードの最初の子を取得します。そのようなノードがない場合、これは null を返します。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | このノードに子があるかどうかを取得します. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | このノードの最後の子を取得します。そのようなノードがない場合、これは null を返します。 |
| [Length](../../aspose.finance.xbrl.dom/characterdata/length/) { get; } | データを通じて利用可能な 16 ビット ユニットの数を取得します。これは、値がゼロの場合があります。つまり、CharacterData ノードが空である場合があります。 |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | このノードの修飾名のローカル部分を取得します。 |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | このノードの名前空間 URI を取得します。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | このノードの直後のノードを取得します。そのようなノードがない場合、これは null を返します。 |
| override [NodeName](../../aspose.finance.xbrl.dom/processinginstruction/nodename/) { get; } | この処理命令の名前を取得します。 |
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
| virtual [AppendData](../../aspose.finance.xbrl.dom/characterdata/appenddata/)(string) | ノードの文字データの末尾に文字列を追加します。 |
| virtual [DeleteData](../../aspose.finance.xbrl.dom/characterdata/deletedata/)(int, int) | ノードからコンテンツの範囲を削除します。 |
| virtual [InsertData](../../aspose.finance.xbrl.dom/characterdata/insertdata/)(int, string) | 指定されたオフセットに文字列を挿入します。 |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | old child で示された子ノードを子のリストから削除します。 |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | 子ノードの古い子を子のリスト内の新しい子に置き換え、古い子ノードを返します。 |
| virtual [ReplaceData](../../aspose.finance.xbrl.dom/characterdata/replacedata/)(int, int, string) | 指定されたオフセットで始まる文字を指定された文字列に置き換えます。 |
| virtual [Substring](../../aspose.finance.xbrl.dom/characterdata/substring/)(int, int) | ノードから一定範囲のデータを抽出します。 |

### 関連項目

* class [CharacterData](../characterdata/)
* 名前空間 [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* 組み立て [Aspose.Finance](../../)


