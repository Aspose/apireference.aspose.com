---
title: Interface IEventTarget
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.Events.IEventTarget インターフェース. EventTargetインターフェイスはDOM イベント モデルをサポートする実装ですべてのノードによって実装されます したがってこのインターフェイスはNode インターフェイスのインスタンスでバインディング固有のキャスト メソッドを使用して取得できます インターフェイスによりイベント リスナーの登録と削除が可能になりますをEventTargetそれにイベントをディスパッチするIEventTarget .
type: docs
weight: 960
url: /ja/net/aspose.svg.dom.events/ieventtarget/
---
## IEventTarget interface

[`EventTarget`](../../aspose.svg.dom/eventtarget/)インターフェイスは、DOM イベント モデルをサポートする実装ですべてのノードによって実装されます。 したがって、このインターフェイスは、Node インターフェイスのインスタンスでバインディング固有のキャスト メソッドを使用して取得できます。 インターフェイスにより、イベント リスナーの登録と削除が可能になります。を[`EventTarget`](../../aspose.svg.dom/eventtarget/)それにイベントをディスパッチする`IEventTarget` .

```csharp
public interface IEventTarget
```

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener)(string, IEventListener) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener, bool) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [DispatchEvent](../../aspose.svg.dom.events/ieventtarget/dispatchevent/)(Event) | このメソッドにより、イベントを実装イベント モデルにディスパッチできます。 |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener)(string, IEventListener) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../ieventlistener/)から削除されます[`EventTarget`](../../aspose.svg.dom/eventtarget/)イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener, bool) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../ieventlistener/)から削除されます[`EventTarget`](../../aspose.svg.dom/eventtarget/)イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |

### 関連項目

* 名前空間 [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* 組み立て [Aspose.SVG](../../)


