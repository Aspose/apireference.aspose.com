---
title: IEventTarget Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.Events.IEventTarget interface. The EventTarget interface is implemented by all Nodes in an implementation which supports the DOM Event Model. Therefore this interface can be obtained by using binding-specific casting methods on an instance of the Node interface. The interface allows registration and removal of Event Listeners on an EventTarget and dispatch of events to that IEventTarget
type: docs
weight: 2040
url: /net/aspose.svg.dom.events/ieventtarget/
---
## IEventTarget interface

The [`EventTarget`](../../aspose.svg.dom/eventtarget/) interface is implemented by all Nodes in an implementation which supports the DOM Event Model. Therefore, this interface can be obtained by using binding-specific casting methods on an instance of the Node interface. The interface allows registration and removal of Event Listeners on an [`EventTarget`](../../aspose.svg.dom/eventtarget/) and dispatch of events to that `IEventTarget`.

```csharp
public interface IEventTarget
```

## Methods

| Name | Description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener)(string, IEventListener) | This method allows the registration of event listeners on the event target. |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener, bool) | This method allows the registration of event listeners on the event target. |
| [DispatchEvent](../../aspose.svg.dom.events/ieventtarget/dispatchevent/)(Event) | This method allows the dispatch of events into the implementations event model. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener)(string, IEventListener) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener, bool) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |

### See Also

* namespace [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* assembly [Aspose.SVG](../../)
