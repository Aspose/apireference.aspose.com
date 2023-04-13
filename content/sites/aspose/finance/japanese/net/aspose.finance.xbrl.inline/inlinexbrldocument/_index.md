---
title: Class InlineXbrlDocument
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.Inline.InlineXbrlDocument クラス. インライン XBRL ドキュメント
type: docs
weight: 7790
url: /ja/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

インライン XBRL ドキュメント。

```csharp
public class InlineXbrlDocument : Document
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument/#constructor)(Stream) | の新しいインスタンスを初期化します`InlineXbrlDocument`クラスで開き、stream.. で開きます |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_2)(string) | の新しいインスタンスを初期化します`InlineXbrlDocument`クラスを開き、ファイルを開きます. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_1)(Stream, LoadOptions) | の新しいインスタンスを初期化します`InlineXbrlDocument`クラスで開き、stream. で開きます |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_3)(string, LoadOptions) | の新しいインスタンスを初期化します`InlineXbrlDocument`クラスを開き、ファイルを開きます. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences/) { get; } | のコレクションを取得します[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference/)インライン XBRL ドキュメント内。 |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | このノードの絶対ベース URI を取得するか、実装が絶対 URI を取得できなかった場合は null を取得します。 |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | ドキュメントのエンコーディングを取得します。 |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | 子要素を取得します。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 子ノードを取得します。 |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | ドキュメントのコンテンツ タイプを取得します。 |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts/) { get; } | のコレクションを取得します[`Context`](../../aspose.finance.xbrl/context/)インライン XBRL ドキュメント内。 |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations/) { get; } | のコレクションを取得します[`InlineContinuation`](../inlinecontinuation/)インライン XBRL ドキュメント内。 |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | これは、ドキュメントのドキュメント要素である子ノードに直接アクセスできる便利な属性です。 |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | ドキュメントの URI を取得します。 |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts/) { get; } | のコレクションを取得します[`InlineFact`](../inlinefact/)インライン XBRL ドキュメント内。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | このノードの最初の子を取得します。そのようなノードがない場合、これは null を返します。 |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes/) { get; } | のコレクションを取得します[`InlineFootnote`](../inlinefootnote/)インライン XBRL ドキュメント内。 |
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
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references/) { get; } | を取得します[`InlineReferences`](../inlinereferences/)インライン XBRL ドキュメント内。 |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships/) { get; } | のコレクションを取得します[`InlineRelationship`](../inlinerelationship/)インライン XBRL ドキュメント内。 |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences/) { get; } | のコレクションを取得します[`RoleReference`](../../aspose.finance.xbrl/rolereference/)インライン XBRL ドキュメント内。 |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | このノードとその子孫のテキスト コンテンツを取得または設定します。 |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units/) { get; } | のコレクションを取得します[`Unit`](../../aspose.finance.xbrl/unit/)インライン XBRL ドキュメント内。 |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors/) { get; set; } | のコレクションを取得します[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror/)インライン XBRL ドキュメント内。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | ノード newChild をこのノードの子リストの最後に追加します。 |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement/)(string, string) | Html 要素を作成します。 |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement/)(string, string) | インライン xbrl 要素を作成します。 |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement/)(string, string) | xbrl インスタンス要素を作成します。 |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement/)(string, string) | xbrl リンクベース要素を作成します。 |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl)() | XbrlDocument オブジェクトにエクスポートします。 |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_1)(Stream) | xbrl ストリームにエクスポートします。 |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_2)(string) | xbrl ファイルにエクスポートします。 |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri/)(string) | 指定された uri. を持つ ArcroleType を取得します |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid/)(string) | 指定された id を持つコンテキストを取得します。 |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc/)(Loc) | ロケーターで概念を取得します。 |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname/)(string) | 指定した名前の概念を取得します。 |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid/)(string) | 指定された id を持つコンテキストを取得します。 |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference/)(string) | 継続参照に従って継続チェーンを取得します。 |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri/)(string) | 指定された uri. を持つ RoleType を取得します |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid/)(string) | 指定されたIDを持つユニットを取得します. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid/)() | このインライン XBRL ドキュメントが有効かどうかをチェックします。 |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects/)() | DOM ツリーのインライン Xbrl 要素を追加、更新、削除する場合、このメソッドを呼び出してインライン xbrl オブジェクトを更新する必要があります。 |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | old child で示された子ノードを子のリストから削除します。 |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | 子ノードの古い子を子のリスト内の新しい子に置き換え、古い子ノードを返します。 |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save)(Stream) | インライン xbrl ファイルを作成してストリームに保存します。 |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_2)(string) | インライン xbrl ファイルを作成し、ディスクに保存します。 |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_1)(Stream, SaveOptions) | インライン xbrl ファイルを作成してストリームに保存します。 |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_3)(string, SaveOptions) | インライン xbrl ファイルを作成し、ディスクに保存します。 |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate/)() | このインライン XBRL ドキュメントを検証します。 |

### 関連項目

* class [Document](../../aspose.finance.xbrl.dom/document/)
* 名前空間 [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline/)
* 組み立て [Aspose.Finance](../../)


