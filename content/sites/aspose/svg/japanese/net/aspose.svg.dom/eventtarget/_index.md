---
title: Class EventTarget
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.EventTarget クラス. EventTargetインターフェイスはDOM イベント モデルをサポートする実装ですべてのノードによって実装されます したがってこのインターフェイスはNode インターフェイスのインスタンスでバインディング固有のキャスト メソッドを使用して取得できます インターフェイスによりイベント リスナーの登録と削除が可能になりますをEventTargetそれにイベントをディスパッチするIEventTarget .
type: docs
weight: 870
url: /ja/net/aspose.svg.dom/eventtarget/
---
## EventTarget class

`EventTarget`インターフェイスは、DOM イベント モデルをサポートする実装ですべてのノードによって実装されます。 したがって、このインターフェイスは、Node インターフェイスのインスタンスでバインディング固有のキャスト メソッドを使用して取得できます。 インターフェイスにより、イベント リスナーの登録と削除が可能になります。を`EventTarget`それにイベントをディスパッチする[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) .

```csharp
public class EventTarget : DOMObject, IDisposable, IEventTarget
```

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener)(string, DOMEventHandler, bool) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_2)(string, IEventListener, bool) | このメソッドを使用すると、イベント ターゲットにイベント リスナーを登録できます。 |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | このメソッドにより、イベントを実装イベント モデルにディスパッチできます。 |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | アンマネージ リソースの解放、解放、またはリセットに関連するアプリケーション定義のタスクを実行します。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます`EventTarget`イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener)(string, DOMEventHandler, bool) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます`EventTarget`イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_2)(string, IEventListener, bool) | このメソッドを使用すると、イベント ターゲットからイベント リスナーを削除できます。[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)から削除されます`EventTarget`イベントの処理中は、現在のアクションによってトリガーされません. イベントリスナーは、削除された後は呼び出されません. |

### 関連項目

* class [DOMObject](../domobject/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* 名前空間 [Aspose.Svg.Dom](../../aspose.svg.dom/)
* 組み立て [Aspose.SVG](../../)


