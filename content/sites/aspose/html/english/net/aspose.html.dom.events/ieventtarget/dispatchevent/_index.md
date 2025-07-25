---
title: IEventTarget.DispatchEvent
second_title: Aspose.HTML for .NET API Reference
description: IEventTarget DispatchEvent method. This method allows the dispatch of events into the implementations event model
type: docs
weight: 20
url: /net/aspose.html.dom.events/ieventtarget/dispatchevent/
---
## IEventTarget.DispatchEvent method

This method allows the dispatch of events into the implementations event model.

```csharp
public bool DispatchEvent(Event @event)
```

| Parameter | Type | Description |
| --- | --- | --- |
| event | Event | Specifies the event type, behavior, and contextual information to be used in processing the event. |

### Return Value

The return value of [`DispatchEvent`](../../../aspose.html.dom/eventtarget/dispatchevent/) indicates whether any of the listeners which handled the event called [`PreventDefault`](../../event/preventdefault/). If [`PreventDefault`](../../event/preventdefault/) was called the value is false, else the value is true.

### Exceptions

| exception | condition |
| --- | --- |
| [DOMException](../../../aspose.html.dom/domexception/) |  |

## Remarks

Events dispatched in this manner will have the same capturing and bubbling behavior as events dispatched directly by the implementation. The target of the event is the [`EventTarget`](../../../aspose.html.dom/eventtarget/) on which [`DispatchEvent`](../../../aspose.html.dom/eventtarget/dispatchevent/) is called.

### See Also

* class [Event](../../event/)
* interface [IEventTarget](../)
* namespace [Aspose.Html.Dom.Events](../../../aspose.html.dom.events/)
* assembly [Aspose.HTML](../../../)
