---
title: IEventTarget.RemoveEventListener
second_title: Aspose.SVG for .NET API Reference
description: IEventTarget RemoveEventListener method. This method allows the removal of event listeners from the event target. If an IEventListener is removed from an EventTarget while it is processing an event it will not be triggered by the current actions. Event Listeners can never be invoked after being removed
type: docs
weight: 30
url: /net/aspose.svg.dom.events/ieventtarget/removeeventlistener/
---
## RemoveEventListener(*string, [IEventListener](../../ieventlistener/)*) {#removeeventlistener}

This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../ieventlistener/) is removed from an [`EventTarget`](../../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed.

```csharp
public void RemoveEventListener(string type, IEventListener listener)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | String | Specifies the event type of the [`IEventListener`](../../ieventlistener/) being removed. |
| listener | IEventListener | The [`IEventListener`](../../ieventlistener/) parameter indicates the [`IEventListener`](../../ieventlistener/) to be removed. |

### See Also

* interface [IEventListener](../../ieventlistener/)
* interface [IEventTarget](../)
* namespace [Aspose.Svg.Dom.Events](../../../aspose.svg.dom.events/)
* assembly [Aspose.SVG](../../../)

---

## RemoveEventListener(*string, [IEventListener](../../ieventlistener/), bool*) {#removeeventlistener_1}

This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../ieventlistener/) is removed from an [`EventTarget`](../../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed.

```csharp
public void RemoveEventListener(string type, IEventListener listener, bool useCapture)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | String | Specifies the event type of the [`IEventListener`](../../ieventlistener/) being removed. |
| listener | IEventListener | The [`IEventListener`](../../ieventlistener/) parameter indicates the [`IEventListener`](../../ieventlistener/) to be removed. |
| useCapture | Boolean | Specifies whether the EventListener being removed was registered as a capturing listener or not. If a listener was registered twice, one with capture and one without, each must be removed separately. Removal of a capturing listener does not affect a non-capturing version of the same listener, and vice versa. |

### See Also

* interface [IEventListener](../../ieventlistener/)
* interface [IEventTarget](../)
* namespace [Aspose.Svg.Dom.Events](../../../aspose.svg.dom.events/)
* assembly [Aspose.SVG](../../../)
