---
title: Interface IWindow
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Window.IWindow インターフェース. window オブジェクトはDOM ドキュメントを含むウィンドウを表します
type: docs
weight: 3820
url: /ja/net/aspose.svg.window/iwindow/
---
## IWindow interface

window オブジェクトは、DOM ドキュメントを含むウィンドウを表します。

```csharp
public interface IWindow : IDisposable, IDocumentView, IEventTarget, IGlobalEventHandlers, 
    IWindowEventHandlers, IWindowTimers
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Document](../../aspose.svg.window/iwindow/document/) { get; } | document 属性は Window オブジェクトの最新の Document オブジェクトを返さなければなりません. |
| [FrameElement](../../aspose.svg.window/iwindow/frameelement/) { get; } | Document の frameElement オブジェクト。 |
| [Location](../../aspose.svg.window/iwindow/location/) { get; } | Window インターフェイスの location 属性は、その Window オブジェクトの Document. の Location オブジェクトを返す必要があります。 |
| [Name](../../aspose.svg.window/iwindow/name/) { get; set; } | Window オブジェクトの name 属性は、取得時にブラウジング コンテキストの現在の名前を返し、設定時にブラウジング コンテキストの名前を新しい値に設定する必要があります。 |
| [Opener](../../aspose.svg.window/iwindow/opener/) { get; } | Window オブジェクトのオープナー IDL 属性は、取得時に、現在のブラウジング コンテキストが作成されたブラウジング コンテキスト (そのオープナー ブラウジング コンテキスト) の WindowProxy オブジェクトを返す必要があります。現在のブラウジング コンテキストはオープナーを否定していません。それ以外の場合は、null を返す必要があります。設定時に、新しい値が null の場合、現在のブラウジング コンテキストはそのオープナーを否認する必要があります。新しい値がそれ以外の場合、ユーザー エージェントは Window オブジェクトの [[DefineOwnProperty]] 内部メソッドを呼び出し、プロパティ名「opener」をプロパティ キーとして渡し、Property Descriptor { [[Value]]: value , [[Writable]]: true, [[Enumerable]]: true, [[Configurable]]: true } はプロパティ記述子として、値は新しい値です. |
| [Parent](../../aspose.svg.window/iwindow/parent/) { get; } | ブラウジング コンテキスト b の Document の Window オブジェクトの親 IDL 属性は、親ブラウジング コンテキストが存在する場合 (つまり、b が子ブラウジング コンテキストの場合)、その WindowProxy オブジェクト、またはブラウジングの WindowProxy オブジェクトを返す必要があります。コンテキスト b 自体。 |
| [Self](../../aspose.svg.window/iwindow/self/) { get; } | Window オブジェクトのブラウジング コンテキストの WindowProxy オブジェクトを返します。 |
| [Top](../../aspose.svg.window/iwindow/top/) { get; } | ブラウジング コンテキスト b の Document の Window オブジェクトの最上位の IDL 属性は、最上位のブラウジング コンテキストの WindowProxy オブジェクトを返さなければなりません (それが最上位のブラウジング コンテキスト自体である場合は、それ自体の WindowProxy オブジェクトになります)。それ以外の場合は、1 つ、または独自の WindowProxy オブジェクトがあります (たとえば、切り離されたネストされたブラウジング コンテキストの場合)。 |
| [Window](../../aspose.svg.window/iwindow/window/) { get; } | Window オブジェクトのブラウジング コンテキストの WindowProxy オブジェクトを返します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Alert](../../aspose.svg.window/iwindow/alert/)(string) | 指定されたメッセージでモーダル アラートを表示し、ユーザーがそれを閉じるのを待ちます |
| [Confirm](../../aspose.svg.window/iwindow/confirm/)(string) | 指定されたメッセージとともにモーダル OK/キャンセル プロンプトを表示し、ユーザーがそれを閉じるのを待ち、ユーザーが [OK] をクリックした場合は true を返し、ユーザーが [キャンセル] をクリックした場合は false を返します。 |
| [Prompt](../../aspose.svg.window/iwindow/prompt/)(string, string) | 指定されたメッセージとともにモーダル テキスト フィールド プロンプトを表示し、ユーザーがそれを閉じるのを待って、ユーザーが入力した値を返します。ユーザーがプロンプトをキャンセルすると、代わりに null が返されます。 2 番目の引数が存在する場合、指定された値がデフォルトとして使用されます。 |

### 関連項目

* interface [IDocumentView](../../aspose.svg.dom.views/idocumentview/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* interface [IGlobalEventHandlers](../../aspose.svg.dom/iglobaleventhandlers/)
* interface [IWindowEventHandlers](../iwindoweventhandlers/)
* interface [IWindowTimers](../iwindowtimers/)
* 名前空間 [Aspose.Svg.Window](../../aspose.svg.window/)
* 組み立て [Aspose.SVG](../../)


