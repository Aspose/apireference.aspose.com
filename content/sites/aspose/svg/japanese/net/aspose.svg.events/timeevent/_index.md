---
title: Class TimeEvent
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Events.TimeEvent クラス. TimeEvent インターフェイスは時間イベントに関連付けられた特定のコンテキスト情報を提供します発生する可能性のあるさまざまなタイプのイベントはbeginEventendEventrepeatEvent です
type: docs
weight: 1630
url: /ja/net/aspose.svg.events/timeevent/
---
## TimeEvent class

TimeEvent インターフェイスは、時間イベントに関連付けられた特定のコンテキスト情報を提供します。発生する可能性のあるさまざまなタイプのイベントは、beginEvent、endEvent、repeatEvent です。

```csharp
public class TimeEvent : Event
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles/) { get; } | イベントがバブリング イベントかどうかを示すために使用されます。イベントがバブルできる場合、値は true、それ以外の場合、値は false. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable/) { get; } | イベントのデフォルト アクションを防止できるかどうかを示すために使用されます。デフォルト アクションを防止できる場合、値は true であり、それ以外の場合、値は false. です。 |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget/) { get; } | を示すために使用されます[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/)だれの[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) は現在処理中です. これは、キャプチャとバブリング中に特に役立ちます. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented/) { get; } | cancelable 属性値が true のときに preventDefault() が呼び出された場合は true を返し、それ以外の場合は false を返します。 |
| [Detail](../../aspose.svg.events/timeevent/detail/) { get; } | イベントのタイプに応じて、イベントに関する詳細情報を指定します。このイベント タイプでは、アニメーションの繰り返し回数を示します。 |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase/) { get; } | イベントフローのどのフェーズが現在評価されているかを示すために使用されます. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted/) { get; } | isTrusted 属性は、初期化された値を返す必要があります。イベントが作成されたら、属性を false. に初期化する必要があります。 |
| [Target](../../aspose.svg.dom.events/event/target/) { get; } | を示すために使用されます[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/)イベントが最初にディスパッチされた先. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp/) { get; } | イベントが作成された時刻 (エポックからのミリ秒単位) を指定するために使用されます。 、値 0 が返されます。 エポック時間の例は、システムの開始時間または 1970 年 1 月 1 日の 0:0:0 UTC です。 |
| [Type](../../aspose.svg.dom.events/event/type/) { get; } | イベントの名前 (大文字と小文字を区別しない)。名前は XML 名でなければなりません. |
| [View](../../aspose.svg.events/timeevent/view/) { get; } | ビュー属性は、イベントが生成された AbstractView [DOM2VIEWS] を識別します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent/)(string, bool, bool) | [`InitEvent`](../../aspose.svg.dom.events/event/initevent/)メソッドは、の値を初期化するために使用されます[`Event`](../../aspose.svg.dom.events/event/) the で作成[`IDocumentEvent`](../../aspose.svg.dom.events/idocumentevent/)インターフェイス. |
| [InitTimeEvent](../../aspose.svg.events/timeevent/inittimeevent/)(string, IAbstractView, long) | initTimeEvent メソッドは、DocumentEvent インターフェイスを介して作成された TimeEvent の値を初期化するために使用されます。このメソッドは、TimeEvent が dispatchEvent メソッドを介してディスパッチされる前にのみ呼び出すことができますが、必要に応じてそのフェーズ中に複数回呼び出すことができます。複数回呼び出された場合、最後の呼び出しが優先されます。 |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault/)() | イベントがキャンセル可能な場合、[`PreventDefault`](../../aspose.svg.dom.events/event/preventdefault/)メソッドは、イベントがキャンセルされることを示すために使用されます。 は、イベントの結果として実装によって通常実行されるデフォルト アクションが発生しないことを意味します。 |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation/)() | このメソッドを呼び出すと、イベントが現在のイベントリスナーの後に登録されたイベントリスナーに到達するのを防ぎ、ツリーでディスパッチされたときに、イベントが他のオブジェクトに到達するのを防ぎます. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation/)() | [`StopPropagation`](../../aspose.svg.dom.events/event/stoppropagation/)メソッドが使用され、イベント フロー中にイベントがさらに伝播するのを防ぎます。 |

### 関連項目

* class [Event](../../aspose.svg.dom.events/event/)
* 名前空間 [Aspose.Svg.Events](../../aspose.svg.events/)
* 組み立て [Aspose.SVG](../../)


