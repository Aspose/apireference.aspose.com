---
title: Class SVGScriptElement
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.SVGScriptElement クラス. SVGScriptElement インターフェイスはscript要素に対応します
type: docs
weight: 3450
url: /ja/net/aspose.svg/svgscriptelement/
---
## SVGScriptElement class

SVGScriptElement インターフェイスは「script」要素に対応します。

```csharp
public class SVGScriptElement : SVGElement, ISVGURIReference
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes/) { get; } | このノードの属性を含む NamedNodeMap (要素の場合)、またはそれ以外の場合は null. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | このノードの絶対ベース URI、または実装が絶対 URI を取得できなかった場合は null。 |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount/) { get; } | この要素の子である要素ノードの現在の数を返します。この要素に nodeType 1. の子ノードがない場合は 0 |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | このノードのすべての子を含む NodeList。子がない場合、これはノードを含まない NodeList です.. |
| [Children](../../aspose.svg.dom/element/children/) { get; } | 現在の要素の子要素を返します. |
| [ClassList](../../aspose.svg.dom/element/classlist/) { get; } | 「クラス」属性の解析から受け取ったトークンを含むライブ DOMTokenList を返します。 |
| [ClassName](../../aspose.svg/svgelement/classname/) { get; } | 指定された要素の属性「クラス」に対応します。 |
| [ClassName](../../aspose.svg.dom/element/classname/) { get; set; } | 要素のクラス属性。この属性は、多くの言語で公開されている「class」キーワードと競合するため、名前が due に変更されました。 HTML 4.01. のクラス属性定義を参照してください。 |
| [CrossOrigin](../../aspose.svg/svgscriptelement/crossorigin/) { get; set; } | 指定された「script」要素の属性「crossorigin」に対応します。 |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | このノードの最初の子。そのようなノードがない場合、これは null. を返します。 |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild/) { get; } | この要素の最初の子要素ノードを返します。この要素に子要素がない場合は null. |
| [Href](../../aspose.svg/svgscriptelement/href/) { get; } | 指定された要素の属性 'xlink:href' に対応します。 |
| [Id](../../aspose.svg/svgelement/id/) { get; set; } | 指定された要素の 'id' 属性の値、または 'id' が存在しない場合は空の文字列. |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml/) { get; set; } | 要素のコンテンツを表す HTML または XML のフラグメントを返します。 設定して、要素のコンテンツを指定された文字列から解析されたノードに置き換えることができます。 |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | このノードの最後の子。そのようなノードがない場合、これは null. を返します。 |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild/) { get; } | この要素の最後の子要素ノードを返します。この要素に子要素がない場合は null. |
| override [LocalName](../../aspose.svg.dom/element/localname/) { get; } | このノードの修飾名のローカル部分を返します。 ELEMENT_NODE および ATTRIBUTE_NODE 以外のタイプのノード、および Document.createElement() などの DOM レベル 1 メソッドで作成されたノードの場合、これは常に null です。 |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri/) { get; } | このノードの名前空間 URI、または指定されていない場合は null. |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling/) { get; } | この要素の次の兄弟要素ノードを返します。この要素に、ドキュメント ツリーでこの要素の後に続く要素兄弟ノードがない場合は null. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | このノードの直後のノード。そのようなノードがない場合、これは null. を返します。 |
| override [NodeName](../../aspose.svg.dom/element/nodename/) { get; } | タイプに応じたこのノードの名前. |
| override [NodeType](../../aspose.svg.dom/element/nodetype/) { get; } | 基礎となるオブジェクトのタイプを表すコード. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | タイプに応じたこのノードの値. |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml/) { get; set; } | 要素とそのコンテンツを表す HTML または XML のフラグメントを返します。 設定して、指定された文字列から解析されたノードで要素を置き換えることができます。 |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | このノードに関連付けられたドキュメント オブジェクト。これは、新しいノードを作成するために使用される Document オブジェクトでもあります。このノードがドキュメントまたはドキュメントでまだ使用されていない DocumentType である場合、これは null. です。 |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement/) { get; } | 最も近い先祖「svg」要素。指定された要素が最も外側の SVG 要素である場合は null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | 親を取得します[`Element`](../../aspose.svg.dom/element/)このノードの. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | このノードの親。 Attr、Document、DocumentFragment、Entity、および Notation を除くすべてのノードは、親を持つことができます。ただし、ノードが作成されたばかりでまだツリーに追加されていない場合、またはツリーから削除されている場合、これは null. です。 |
| override [Prefix](../../aspose.svg.dom/element/prefix/) { get; } | このノードの名前空間プレフィックス、または指定されていない場合は null。 null と定義されている場合、設定しても効果はありません |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling/) { get; } | この要素の前の兄弟要素ノードを返します。この要素に、ドキュメント ツリー内でこの要素の前にある要素の兄弟ノードがない場合は null. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | このノードの直前のノード。そのようなノードがない場合、これは null. を返します。 |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo/) { get; } | この要素に関連付けられた型情報。 |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot/) { get; } | この要素に格納されている shadowRoot を返すか、閉じている場合は null を返します。 |
| [Style](../../aspose.svg/svgelement/style/) { get; } | 指定された要素の属性「スタイル」に対応します。ユーザー エージェントが CSS によるスタイリングをサポートしていない場合、この属性は常に null. の値を持つ必要があります。 |
| [TagName](../../aspose.svg.dom/element/tagname/) { get; } | 要素の名前。 |
| override [TextContent](../../aspose.svg.dom/element/textcontent/) { get; set; } | この属性は、このノードとその子孫のテキスト コンテンツを返します。 null として定義されている場合、設定しても効果はありません。設定時に、このノードが持つ可能性のある子はすべて削除され、新しい文字列が空または null でない場合は、この属性が設定されている文字列を含む単一の Text ノードに置き換えられます。 |
| [Type](../../aspose.svg/svgscriptelement/type/) { get; set; } | 指定された「スクリプト」要素の属性「タイプ」に対応します。 |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement/) { get; } | 現在のビューポートを確立した要素。多くの場合、最も近い祖先の 'svg' 要素です。指定された要素が最も外側の SVG 要素である場合は null. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | ノード newChild をこのノードの子のリストの最後に追加します。 newChild がすでにツリーにある場合は、最初に削除されます. |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow/)(ShadowRootMode) | シャドウ ルートを作成し、現在の要素にアタッチします。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | このノードの複製を返します。つまり、ノードの汎用コピー コンストラクタとして機能します。複製ノードには親がなく (parentNode が null)、ユーザー データもありません。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | このノードの複製を返します。つまり、ノードの汎用コピー コンストラクタとして機能します。複製ノードには親がなく (parentNode が null)、ユーザー データもありません。 |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | このメソッドにより、イベントを実装イベント モデルにディスパッチできます。 |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | アンマネージ リソースの解放、解放、またはリセットに関連するアプリケーション定義のタスクを実行します。 |
| [GetAttribute](../../aspose.svg.dom/element/getattribute/)(string) | 名前で属性値を取得します。 |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode/)(string) | 名前で属性ノードを取得します。 |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens/)(string, string) | ローカル名と名前空間 URI で Attr ノードを取得します。 |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens/)(string, string) | ローカル名と名前空間 URI によって属性値を取得します。 |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname/)(string) | 引数で指定されたすべてのクラスを持つドキュメント内のすべての要素を含むライブ NodeList オブジェクトを返します。 http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname/)(string) | 指定されたタグ名を持つすべての子孫要素の NodeList をドキュメント順に返します。 |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens/)(string, string) | 指定されたローカル名と名前空間 URI を持つすべての子孫要素の NodeList をドキュメント順に返します。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute/)(string) | 指定された名前の属性がこの要素で指定されている場合、またはデフォルト値がある場合は true、それ以外の場合は false を返します。 |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens/)(string, string) | 特定のローカル名と名前空間 URI を持つ属性がこの要素で指定されている場合、またはデフォルト値がある場合は true、それ以外の場合は false を返します。 |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes/)() | このノード (エレメントの場合) が属性を持つかどうかを返します |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | このノードに子があるかどうかを返します. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | 既存の子ノード child の前にノードを挿入します。 child が null の場合、child のリストの最後に node を挿入します。 child が DocumentFragment オブジェクトの場合、すべての子が同じ順序で child の前に挿入されます。子がすでにツリーにある場合は、最初に削除されます. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | このメソッドは、指定された namespaceURI がデフォルトの名前空間であるかどうかをチェックします。 |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | 2 つのノードが等しいかどうかをテストします。 このメソッドは、Node.isSameNode() でテストできる同一性 (つまり、2 つのノードが同じオブジェクトへの参照であるかどうか) ではなく、ノードの等しいかどうかをテストします。逆は真ではないかもしれませんが、同じであるすべてのノードも等しくなります. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | このノードが指定されたノードと同じかどうかを返します。 このメソッドは、実装によって返された 2 つの Node 参照が同じオブジェクトを参照しているかどうかを判断する方法を提供します。 2 つの Node 参照が同じオブジェクトへの参照である場合、たとえプロキシ経由であっても、すべての属性が同じ値を持ち、いずれかの参照で同じ DOM メソッドを呼び出すと、常にまったく同じ効果が得られるように、参照を完全に交換可能に使用できます. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | このノードから開始して、指定されたプレフィックスに関連付けられた名前空間 URI を検索します。 |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | このノードから開始して、指定された名前空間 URI に関連付けられたプレフィックスを検索します。デフォルトの名前空間宣言は、このメソッドによって無視されます。 このメソッドで使用されるアルゴリズムの詳細については、ネームスペース プレフィックス ルックアップを参照してください。 |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | 属性ノードを含む、このノードの下のサブツリーの深さ全体にあるすべてのテキスト ノードを、構造 (要素、コメント、処理命令、CDATA セクション、およびエンティティ参照など) のみがテキストを分離する「通常の」形式にします。つまり、隣接する Text ノードも空の Text ノードもありません。これは、ドキュメントの DOM ビューが、保存されて再ロードされた場合と同じであることを保証するために使用でき、特定のドキュメント ツリー構造に依存する操作 (XPointer [XPointer] ルックアップなど) が必要な場合に役立ちます。利用される。 Node.ownerDocument に添付された DOMConfiguration オブジェクトのパラメーター「normalize-characters」が true の場合、このメソッドは Text ノードの文字も完全に正規化します。 |
| [QuerySelector](../../aspose.svg.dom/element/queryselector/)(string) | セレクター に一致する、ドキュメント内の最初の要素を返します |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall/)(string) | ドキュメント内のすべての要素の NodeList を返します。これは、selector に一致します。 |
| [Remove](../../aspose.svg.dom/element/remove/)() | このインスタンスを削除します。 |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute/)(string) | 名前で属性を削除します。 |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode/)(Attr) | 指定した属性ノードを削除します。 |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens/)(string, string) | ローカル名と名前空間 URI によって属性を削除します。 |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | oldChild で示される子ノードを子のリストから削除し、それを返します。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます[`EventTarget`](../../aspose.svg.dom/eventtarget/)イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます[`EventTarget`](../../aspose.svg.dom/eventtarget/)イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます[`EventTarget`](../../aspose.svg.dom/eventtarget/)イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | 子のリストで子ノード oldChild を newChild に置き換え、oldChild ノードを返します。 newChild が DocumentFragment オブジェクトの場合、oldChild は DocumentFragment のすべての子に置き換えられ、同じ順序で挿入されます。 newChild がすでにツリーにある場合は、最初に削除されます. |
| [SetAttribute](../../aspose.svg.dom/element/setattribute/)(string, string) | 新しい属性を追加します。その名前の属性が要素にすでに存在する場合、その値は値 parameter の値に変更されます。 |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode/)(Attr) | 新しい属性ノードを追加します。その名前 (nodeName) を持つ属性が要素に既に存在する場合、新しい属性に置き換えられます。 |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens/)(Attr) | 新しい属性を追加します。そのローカル名とその名前空間 URI を持つ属性が要素に既に存在する場合、それは新しいものに置き換えられます. |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens/)(string, string, string) | 新しい属性を追加します。同じローカル名と名前空間 URI を持つ属性が要素に既に存在する場合、そのプレフィックスは修飾された名前のプレフィックス部分に変更され、その値は値パラメーターに変更されます. |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute/)(string, bool) | パラメータ isId が true の場合、このメソッドは、指定された属性がユーザー定義の ID 属性であることを宣言します。 |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode/)(Attr, bool) | パラメータ isId が true の場合、このメソッドは、指定された属性がユーザー定義の ID 属性であることを宣言します。 |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens/)(string, string, bool) | パラメータ isId が true の場合、このメソッドは、指定された属性がユーザー定義の ID 属性であることを宣言します。 |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | を返しますStringこのインスタンスを表す. |

### 関連項目

* class [SVGElement](../svgelement/)
* interface [ISVGURIReference](../isvgurireference/)
* 名前空間 [Aspose.Svg](../../aspose.svg/)
* 組み立て [Aspose.SVG](../../)


