---
title: Class Document
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.Document クラス. ドキュメントはHTMLXMLまたは SVG ドキュメント全体を表します概念的にはドキュメント ツリーのルートでありドキュメントのデータへのプライマリ アクセスを提供します
type: docs
weight: 810
url: /ja/net/aspose.svg.dom/document/
---
## Document class

ドキュメントは、HTML、XML、または SVG ドキュメント全体を表します。概念的には、ドキュメント ツリーのルートであり、ドキュメントのデータへのプライマリ アクセスを提供します。

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | このノードの属性を含む NamedNodeMap (要素の場合)、またはそれ以外の場合は null. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri/) { get; } | このノードの絶対ベース URI、または実装が絶対 URI を取得できなかった場合は null。 |
| [CharacterSet](../../aspose.svg.dom/document/characterset/) { get; } | ドキュメントのエンコーディングを取得します。 |
| [Charset](../../aspose.svg.dom/document/charset/) { get; } | ドキュメントのエンコーディングを取得します。 |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount/) { get; } | この要素の子である要素ノードの現在の数を返します。この要素に nodeType 1. の子ノードがない場合は 0 |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | このノードのすべての子を含む NodeList。子がない場合、これはノードを含まない NodeList です.. |
| [Children](../../aspose.svg.dom/document/children/) { get; } | 子要素を返します。 |
| [ContentType](../../aspose.svg.dom/document/contenttype/) { get; } | ドキュメントのコンテンツ タイプを取得します。 |
| [Context](../../aspose.svg.dom/document/context/) { get; } | 現在のブラウジング コンテキストを取得します。 |
| [DefaultView](../../aspose.svg.dom/document/defaultview/) { get; } | Document インターフェイスの defaultView IDL 属性は、取得時に がこの Document の閲覧コンテキストの WindowProxy オブジェクトを返す必要があります。この Document に関連する閲覧コンテキストがある場合は 、そうでない場合は null です。 |
| [Doctype](../../aspose.svg.dom/document/doctype/) { get; } | このドキュメントに関連付けられたドキュメント タイプ宣言。 |
| [DocumentElement](../../aspose.svg.dom/document/documentelement/) { get; } | これは、ドキュメントのドキュメント要素である子ノードに直接アクセスできる便利な属性です。 |
| [DocumentURI](../../aspose.svg.dom/document/documenturi/) { get; } | ドキュメントの場所。未定義の場合、または Document が DOMImplementation.createDocument. を使用して作成された場合は null |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | このノードの最初の子。そのようなノードがない場合、これは null. を返します。 |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild/) { get; } | この要素の最初の子要素ノードを返します。この要素に子要素がない場合は null. |
| [Implementation](../../aspose.svg.dom/document/implementation/) { get; } | このドキュメントを処理する DOMImplementation オブジェクト. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding/) { get; } | ドキュメントのエンコーディングを取得します。 |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | このノードの最後の子。そのようなノードがない場合、これは null. を返します。 |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild/) { get; } | この要素の最後の子要素ノードを返します。この要素に子要素がない場合は null. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | このノードの修飾名のローカル部分を返します。 ELEMENT_NODE および ATTRIBUTE_NODE 以外のタイプのノード、および Document.createElement() などの DOM レベル 1 メソッドで作成されたノードの場合、これは常に null です。 |
| [Location](../../aspose.svg.dom/document/location/) { get; } | ドキュメントの場所。 |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | このノードの名前空間 URI、または指定されていない場合は null. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling/) { get; } | この要素の次の兄弟要素ノードを返します。この要素に、ドキュメント ツリーでこの要素の後に続く要素兄弟ノードがない場合は null. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | このノードの直後のノード。そのようなノードがない場合、これは null. を返します。 |
| override [NodeName](../../aspose.svg.dom/document/nodename/) { get; } | タイプに応じたこのノードの名前. |
| override [NodeType](../../aspose.svg.dom/document/nodetype/) { get; } | 基礎となるオブジェクトのタイプを表すコード. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | タイプに応じたこのノードの値. |
| [Origin](../../aspose.svg.dom/document/origin/) { get; } | ドキュメントの原点を取得します。 |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument/) { get; } | 所有者ドキュメントを取得します。 |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | 親を取得します[`Element`](../element/)このノードの. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | このノードの親。 Attr、Document、DocumentFragment、Entity、および Notation を除くすべてのノードは、親を持つことができます。ただし、ノードが作成されたばかりでまだツリーに追加されていない場合、またはツリーから削除されている場合、これは null. です。 |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | このノードの名前空間プレフィックス、または指定されていない場合は null。 null と定義されている場合、設定しても効果はありません |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling/) { get; } | この要素の前の兄弟要素ノードを返します。この要素に、ドキュメント ツリー内でこの要素の前にある要素の兄弟ノードがない場合は null. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | このノードの直前のノード。そのようなノードがない場合、これは null. を返します。 |
| [ReadyState](../../aspose.svg.dom/document/readystate/) { get; } | ドキュメントの準備状況を返します。ドキュメントの読み込み中は「読み込み中」、解析が終了してもまだサブリソースを読み込み中は「インタラクティブ」、読み込みが完了すると「完了」. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking/) { get; set; } | エラー チェックを実施するかどうかを指定する属性。 false に設定すると、実装は、通常 DOM 操作で定義されている可能性のあるすべてのエラー ケースをテストせず、DOM 操作で DOMException を発生させたり、Document.normalizeDocument() の使用中にエラーを報告したりしません。エラーが発生した場合の動作は未定義です。この属性はデフォルトで true です。 |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets/) { get; } | ドキュメントに明示的にリンクまたは埋め込まれたすべてのスタイル シートを含むリスト。 HTML ドキュメントの場合、これには、HTML LINK 要素とインライン STYLE 要素を介して含まれる外部スタイル シートが含まれます。 |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | この属性は、このノードとその子孫のテキスト コンテンツを返します。 null として定義されている場合、設定しても効果はありません。設定時に、このノードが持つ可能性のある子はすべて削除され、新しい文字列が空または null でない場合は、この属性が設定されている文字列を含む単一の Text ノードに置き換えられます。 |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone/) { get; set; } | XML 宣言の一部として、このドキュメントがスタンドアロンかどうかを指定する属性。指定されていない場合は false です。 |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion/) { get; set; } | XML 宣言の一部として、このドキュメントのバージョン番号を指定する属性。宣言がなく、このドキュメントが「XML」機能をサポートしている場合、値は「1.0」です。このドキュメントが「XML」機能をサポートしていない場合、値は常に null. です。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | ノード newChild をこのノードの子のリストの最後に追加します。 newChild がすでにツリーにある場合は、最初に削除されます. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | このノードの複製を返します。つまり、ノードの汎用コピー コンストラクタとして機能します。複製ノードには親がなく (parentNode が null)、ユーザー データもありません。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | このノードの複製を返します。つまり、ノードの汎用コピー コンストラクタとして機能します。複製ノードには親がなく (parentNode が null)、ユーザー データもありません。 |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute/)(string) | 指定された名前の Attr を作成します。 |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens/)(string, string) | 指定された修飾名と名前空間 URI の属性を作成します。 |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection/)(string) | 値が指定された文字列である CDATASection ノードを作成します。 |
| [CreateComment](../../aspose.svg.dom/document/createcomment/)(string) | 指定された文字列でコメント ノードを作成します。 |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment/)() | 空の DocumentFragment オブジェクトを作成します。 |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype/)(string, string, string, string) | DocumentType ノードを作成します。 |
| [CreateElement](../../aspose.svg.dom/document/createelement/)(string) | 指定されたタイプの要素を作成します。返されたインスタンスは Element インターフェイスを実装しているため、返されたオブジェクトで属性を直接指定できることに注意してください。 |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns/)(string, string) | 指定された修飾名と名前空間 URI の要素を作成します。 |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference/)(string) | EntityReference オブジェクトを作成します。また、参照されるエンティティが既知の場合、EntityReference ノードの子リストは、対応する Entity ノードの子リストと同じになります。 |
| [CreateEvent](../../aspose.svg.dom/document/createevent/)(string) | を作成します[`Event`](../../aspose.svg.dom.events/event/)実装でサポートされているタイプの. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression/)(string, IXPathNSResolver) | 名前空間が解決された解析済み XPath 式を作成します。これは、 式文字列をより効率的な内部形式にコンパイルし、 式内で発生するすべての名前空間プレフィックスを事前に解決できるため、式がアプリケーションで再利用される場合に便利です. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator)(Node) | 指定したノード をルートとするサブツリーに新しい NodeIterator を作成します。 |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_1)(Node, long) | 指定したノード をルートとするサブツリーに新しい NodeIterator を作成します。 |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_2)(Node, long, INodeFilter) | 指定したノード をルートとするサブツリーに新しい NodeIterator を作成します。 |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver/)(Node) | 任意の DOM ノードを名前空間を解決するように適応させ、XPath 式がドキュメント内で出現したノードのコンテキストに対して 簡単に評価できるようにします。このアダプターは、DOM レベル 3 メソッドのように 動作します`lookupNamespaceURI`ノード上で、time lookupNamespaceURI が呼び出されたときにノードの階層で利用可能な現在の情報を使用して、指定されたプレフィックスから namespaceURI を解決し、暗黙的な xml プレフィックス. も正しく解決します。 |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction/)(string, string) | 指定された名前とデータ文字列を指定して ProcessingInstruction ノードを作成します。 |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode/)(string) | 指定された文字列を指定して Text ノードを作成します。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker)(Node) | 指定したノード をルートとするサブツリーに新しい TreeWalker を作成します。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_1)(Node, long) | 指定したノード をルートとするサブツリーに新しい TreeWalker を作成します。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_2)(Node, long, INodeFilter) | 指定したノード をルートとするサブツリーに新しい TreeWalker を作成します。 |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | このメソッドにより、イベントを実装イベント モデルにディスパッチできます。 |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | アンマネージ リソースの解放、解放、またはリセットに関連するアプリケーション定義のタスクを実行します。 |
| [Evaluate](../../aspose.svg.dom/document/evaluate/)(string, Node, IXPathNSResolver, XPathResultType, object) | XPath 式文字列を評価し、可能であれば指定された型の結果を返します。 |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid/)(string) | 指定された値を持つ ID 属性を持つ要素を返します。そのような要素が存在しない場合、これは null を返します。複数の要素にその値を持つ ID 属性がある場合、返される内容は undefined. です。 |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname/)(string) | 引数で指定されたすべてのクラスを持つドキュメント内のすべての要素を含むライブ NodeList オブジェクトを返します。 http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname/)(string) | 指定されたタグ名を持ち、ドキュメントに含まれているすべての要素の NodeList をドキュメント順で返します。 |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens/)(string, string) | 指定されたローカル名と名前空間 URI を持つすべての要素の NodeList をドキュメント順に返します。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | このノード (エレメントの場合) が属性を持つかどうかを返します |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | このノードに子があるかどうかを返します. |
| [ImportNode](../../aspose.svg.dom/document/importnode/)(Node, bool) | 元のドキュメントからソース ノードを変更または削除せずに、別のドキュメントからこのドキュメントにノードをインポートします。このメソッドは、ソース ノードの新しいコピーを作成します。 |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | 既存の子ノード child の前にノードを挿入します。 child が null の場合、child のリストの最後に node を挿入します。 child が DocumentFragment オブジェクトの場合、すべての子が同じ順序で child の前に挿入されます。子がすでにツリーにある場合は、最初に削除されます. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | このメソッドは、指定された namespaceURI がデフォルトの名前空間であるかどうかをチェックします。 |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | 2 つのノードが等しいかどうかをテストします。 このメソッドは、Node.isSameNode() でテストできる同一性 (つまり、2 つのノードが同じオブジェクトへの参照であるかどうか) ではなく、ノードの等しいかどうかをテストします。逆は真ではないかもしれませんが、同じであるすべてのノードも等しくなります. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | このノードが指定されたノードと同じかどうかを返します。 このメソッドは、実装によって返された 2 つの Node 参照が同じオブジェクトを参照しているかどうかを判断する方法を提供します。 2 つの Node 参照が同じオブジェクトへの参照である場合、たとえプロキシ経由であっても、すべての属性が同じ値を持ち、いずれかの参照で同じ DOM メソッドを呼び出すと、常にまったく同じ効果が得られるように、参照を完全に交換可能に使用できます. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | このノードから開始して、指定されたプレフィックスに関連付けられた名前空間 URI を検索します。 |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | このノードから開始して、指定された名前空間 URI に関連付けられたプレフィックスを検索します。デフォルトの名前空間宣言は、このメソッドによって無視されます。 このメソッドで使用されるアルゴリズムの詳細については、ネームスペース プレフィックス ルックアップを参照してください。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate)(RequestMessage) | 指定されたリクエスト オブジェクトに基づいてドキュメントを読み込み、以前のコンテンツを置き換えます。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_4)(string) | 指定された URL (Uniform Resource Locator) にあるドキュメントを現在のインスタンスに読み込み、以前のコンテンツを置き換えます。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_1)(Url) | 指定された URL (Uniform Resource Locator) にあるドキュメントを現在のインスタンスに読み込み、以前のコンテンツを置き換えます。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_3)(Stream, string) | 指定されたコンテンツからドキュメントを読み込み、baseUri を使用して相対リソースを解決し、前のコンテンツを置き換えます。 ドキュメントの読み込みは、ストリーム内の現在の位置から開始されます。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_2)(Stream, Url) | 指定されたコンテンツからドキュメントを読み込み、baseUri を使用して相対リソースを解決し、前のコンテンツを置き換えます。 ドキュメントの読み込みは、ストリーム内の現在の位置から開始されます。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_6)(string, string) | 指定されたコンテンツからドキュメントを読み込み、baseUri を使用して相対リソースを解決し、以前のコンテンツを置き換えます。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_5)(string, Url) | 指定されたコンテンツからドキュメントを読み込み、baseUri を使用して相対リソースを解決し、以前のコンテンツを置き換えます。 |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | 属性ノードを含む、このノードの下のサブツリーの深さ全体にあるすべてのテキスト ノードを、構造 (要素、コメント、処理命令、CDATA セクション、およびエンティティ参照など) のみがテキストを分離する「通常の」形式にします。つまり、隣接する Text ノードも空の Text ノードもありません。これは、ドキュメントの DOM ビューが、保存されて再ロードされた場合と同じであることを保証するために使用でき、特定のドキュメント ツリー構造に依存する操作 (XPointer [XPointer] ルックアップなど) が必要な場合に役立ちます。利用される。 Node.ownerDocument に添付された DOMConfiguration オブジェクトのパラメーター「normalize-characters」が true の場合、このメソッドは Text ノードの文字も完全に正規化します。 |
| [QuerySelector](../../aspose.svg.dom/document/queryselector/)(string) | セレクター に一致する、ドキュメント内の最初の要素を返します |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall/)(string) | ドキュメント内のすべての要素の NodeList を返します。これは、selector に一致します。 |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | oldChild で示される子ノードを子のリストから削除し、それを返します。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます[`EventTarget`](../eventtarget/)イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます[`EventTarget`](../eventtarget/)イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます[`EventTarget`](../eventtarget/)イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto/)(IDevice) | このメソッドは、現在のドキュメントのコンテンツを指定されたグラフィカル デバイスにレンダリングするために使用されます。 |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | 子のリストで子ノード oldChild を newChild に置き換え、oldChild ノードを返します。 newChild が DocumentFragment オブジェクトの場合、oldChild は DocumentFragment のすべての子に置き換えられ、同じ順序で挿入されます。 newChild がすでにツリーにある場合は、最初に削除されます. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | を返しますStringこのインスタンスを表す. |
| [Write](../../aspose.svg.dom/document/write/)(params string[]) | open() によって開かれたドキュメント ストリームにテキストの文字列を書き込みます。この関数は、必ずしも DTD によって駆動されるとは限らない document を生成することに注意してください。 |
| [WriteLn](../../aspose.svg.dom/document/writeln/)(params string[]) | open() によって開かれた document ストリームに、テキストの文字列とそれに続く改行文字を書き込みます。関数 will は、必ずしも DTD によって駆動されるとは限らないドキュメントを生成し、 は、 document のコンテキストで無効な結果を生成する可能性があることに注意してください。 |

## イベント

| 名前 | 説明 |
| --- | --- |
| event [OnAbort](../../aspose.svg.dom/document/onabort/) | OnAbort イベントのイベント ハンドラーを取得または設定します。 |
| event [OnBlur](../../aspose.svg.dom/document/onblur/) | OnBlur イベントのイベント ハンドラーを取得または設定します。 |
| event [OnCancel](../../aspose.svg.dom/document/oncancel/) | OnCancel イベントのイベント ハンドラーを取得または設定します。 |
| event [OnCanplay](../../aspose.svg.dom/document/oncanplay/) | OnCanplay イベントのイベント ハンドラーを取得または設定します。 |
| event [OnCanPlayThrough](../../aspose.svg.dom/document/oncanplaythrough/) | OnCanPlayThrough イベントのイベント ハンドラーを取得または設定します。 |
| event [OnChange](../../aspose.svg.dom/document/onchange/) | OnChange イベントのイベント ハンドラーを取得または設定します。 |
| event [OnClick](../../aspose.svg.dom/document/onclick/) | OnClick イベントのイベント ハンドラーを取得または設定します。 |
| event [OnCueChange](../../aspose.svg.dom/document/oncuechange/) | OnCueChange イベントのイベント ハンドラーを取得または設定します。 |
| event [OnDblClick](../../aspose.svg.dom/document/ondblclick/) | OnDblClick イベントのイベント ハンドラーを取得または設定します。 |
| event [OnDurationChange](../../aspose.svg.dom/document/ondurationchange/) | OnDurationChange イベントのイベント ハンドラーを取得または設定します。 |
| event [OnEmptied](../../aspose.svg.dom/document/onemptied/) | OnEmptied イベントのイベント ハンドラーを取得または設定します。 |
| event [OnEnded](../../aspose.svg.dom/document/onended/) | OnEnded イベントのイベント ハンドラーを取得または設定します。 |
| event [OnError](../../aspose.svg.dom/document/onerror/) | OnError イベントのイベント ハンドラーを取得または設定します。 |
| event [OnFocus](../../aspose.svg.dom/document/onfocus/) | OnFocus イベントのイベント ハンドラーを取得または設定します。 |
| event [OnInput](../../aspose.svg.dom/document/oninput/) | OnInput イベントのイベント ハンドラーを取得または設定します。 |
| event [OnInvalid](../../aspose.svg.dom/document/oninvalid/) | OnInvalid イベントのイベント ハンドラーを取得または設定します。 |
| event [OnKeyDown](../../aspose.svg.dom/document/onkeydown/) | OnKeyDown イベントのイベント ハンドラーを取得または設定します。 |
| event [OnKeyPress](../../aspose.svg.dom/document/onkeypress/) | OnKeyPress イベントのイベント ハンドラーを取得または設定します。 |
| event [OnKeyUp](../../aspose.svg.dom/document/onkeyup/) | OnKeyUp イベントのイベント ハンドラーを取得または設定します。 |
| event [OnLoad](../../aspose.svg.dom/document/onload/) | OnLoad イベントのイベント ハンドラーを取得または設定します。 |
| event [OnLoadedData](../../aspose.svg.dom/document/onloadeddata/) | OnLoadedData イベントのイベント ハンドラーを取得または設定します。 |
| event [OnLoadedMetadata](../../aspose.svg.dom/document/onloadedmetadata/) | OnLoadedMetadata イベントのイベント ハンドラーを取得または設定します。 |
| event [OnLoadStart](../../aspose.svg.dom/document/onloadstart/) | OnLoadStart イベントのイベント ハンドラーを取得または設定します。 |
| event [OnMouseDown](../../aspose.svg.dom/document/onmousedown/) | OnMouseDown イベントのイベント ハンドラーを取得または設定します。 |
| event [OnMouseEnter](../../aspose.svg.dom/document/onmouseenter/) | OnMouseEnter イベントのイベント ハンドラーを取得または設定します。 |
| event [OnMouseLeave](../../aspose.svg.dom/document/onmouseleave/) | OnMouseLeave イベントのイベント ハンドラーを取得または設定します。 |
| event [OnMouseMove](../../aspose.svg.dom/document/onmousemove/) | OnMouseMove イベントのイベント ハンドラーを取得または設定します。 |
| event [OnMouseOut](../../aspose.svg.dom/document/onmouseout/) | OnMouseOut イベントのイベント ハンドラーを取得または設定します。 |
| event [OnMouseOver](../../aspose.svg.dom/document/onmouseover/) | OnMouseOver イベントのイベント ハンドラーを取得または設定します。 |
| event [OnMouseUp](../../aspose.svg.dom/document/onmouseup/) | OnMouseUp イベントのイベント ハンドラーを取得または設定します。 |
| event [OnMouseWheel](../../aspose.svg.dom/document/onmousewheel/) | OnMouseWheel イベントのイベント ハンドラーを取得または設定します。 |
| event [OnPause](../../aspose.svg.dom/document/onpause/) | OnPause イベントのイベント ハンドラーを取得または設定します。 |
| event [OnPlay](../../aspose.svg.dom/document/onplay/) | OnPlay イベントのイベント ハンドラーを取得または設定します。 |
| event [OnPlaying](../../aspose.svg.dom/document/onplaying/) | OnPlaying イベントのイベント ハンドラーを取得または設定します。 |
| event [OnProgress](../../aspose.svg.dom/document/onprogress/) | OnProgress イベントのイベント ハンドラーを取得または設定します。 |
| event [OnRateChange](../../aspose.svg.dom/document/onratechange/) | OnRateChange イベントのイベント ハンドラーを取得または設定します。 |
| event [OnReadyStateChange](../../aspose.svg.dom/document/onreadystatechange/) | OnReadyStateChange イベントのイベント ハンドラーを取得または設定します。 |
| event [OnReset](../../aspose.svg.dom/document/onreset/) | OnReset イベントのイベント ハンドラーを取得または設定します。 |
| event [OnResize](../../aspose.svg.dom/document/onresize/) | OnResize イベントのイベント ハンドラーを取得または設定します。 |
| event [OnScroll](../../aspose.svg.dom/document/onscroll/) | OnScroll イベントのイベント ハンドラーを取得または設定します。 |
| event [OnSeeked](../../aspose.svg.dom/document/onseeked/) | OnSeeked イベントのイベント ハンドラーを取得または設定します。 |
| event [OnSeeking](../../aspose.svg.dom/document/onseeking/) | OnSeeking イベントのイベント ハンドラーを取得または設定します。 |
| event [OnSelect](../../aspose.svg.dom/document/onselect/) | OnSelect イベントのイベント ハンドラーを取得または設定します。 |
| event [OnShow](../../aspose.svg.dom/document/onshow/) | OnShow イベントのイベント ハンドラーを取得または設定します。 |
| event [OnStalled](../../aspose.svg.dom/document/onstalled/) | OnStalled イベントのイベント ハンドラーを取得または設定します。 |
| event [OnSubmit](../../aspose.svg.dom/document/onsubmit/) | OnSubmit イベントのイベント ハンドラーを取得または設定します。 |
| event [OnSuspend](../../aspose.svg.dom/document/onsuspend/) | OnSuspend イベントのイベント ハンドラーを取得または設定します。 |
| event [OnTimeUpdate](../../aspose.svg.dom/document/ontimeupdate/) | OnTimeUpdate イベントのイベント ハンドラーを取得または設定します。 |
| event [OnToggle](../../aspose.svg.dom/document/ontoggle/) | OnToggle イベントのイベント ハンドラーを取得または設定します。 |
| event [OnVolumeChange](../../aspose.svg.dom/document/onvolumechange/) | OnVolumeChange イベントのイベント ハンドラーを取得または設定します。 |
| event [OnWaiting](../../aspose.svg.dom/document/onwaiting/) | OnWaiting イベントのイベント ハンドラーを取得または設定します。 |

### 関連項目

* class [Node](../node/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle/)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal/)
* interface [IGlobalEventHandlers](../iglobaleventhandlers/)
* interface [INonElementParentNode](../inonelementparentnode/)
* interface [IParentNode](../iparentnode/)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator/)
* 名前空間 [Aspose.Svg.Dom](../../aspose.svg.dom/)
* 組み立て [Aspose.SVG](../../)


