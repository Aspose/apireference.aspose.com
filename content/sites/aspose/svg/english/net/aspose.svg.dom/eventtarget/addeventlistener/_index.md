---
title: EventTarget.AddEventListener
second_title: Aspose.SVG for .NET API Reference
description: EventTarget AddEventListener method. Sets up a function that will be called whenever the specified event is delivered to the target
type: docs
weight: 20
url: /net/aspose.svg.dom/eventtarget/addeventlistener/
---
## AddEventListener(*string, [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler/), bool*) {#addeventlistener}

Sets up a function that will be called whenever the specified event is delivered to the target.

It works by adding a function, or an object that implements [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/), to the list of event listeners for the specified event type on the [`EventTarget`](../) on which it's called. If the function or object, is already in the list of event listeners for this target, they are not added a second time.

```csharp
public void AddEventListener(string type, DOMEventHandler handler, bool useCapture)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | String | The event type for which the user is registering |
| handler | DOMEventHandler | Takes an [`DOMEventHandler`](../../../aspose.svg.dom.events/domeventhandler/) to be called when the event occurs. |
| useCapture | Boolean | If true, useCapture indicates that the user wishes to initiate capture. After initiating capture, all events of the specified type will be dispatched to the registered [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) before being dispatched to any Event Targets beneath them in the tree. Events which are bubbling upward through the tree will not trigger an [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) designated to use capture. |

## Remarks

If an [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) is added to an [`EventTarget`](../) while it is processing an event, it will not be triggered by the current actions but may be triggered during a later stage of event flow, such as the bubbling phase.

If multiple identical Event Listeners are registered on the same [`EventTarget`](../) with the same parameters the duplicate instances are discarded. They do not cause the [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) to be called twice and since they are discarded they do not need to be removed with the [`RemoveEventListener`](../removeeventlistener/) method.

### See Also

* delegate [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler/)
* class [EventTarget](../)
* namespace [Aspose.Svg.Dom](../../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../../)

---

## AddEventListener(*string, [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)*) {#addeventlistener_1}

Sets up a function that will be called whenever the specified event is delivered to the target.

It works by adding a function, or an object that implements [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/), to the list of event listeners for the specified event type on the [`EventTarget`](../) on which it's called. If the function or object, is already in the list of event listeners for this target, they are not added a second time.

```csharp
public void AddEventListener(string type, IEventListener listener)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | String | The event type for which the user is registering |
| listener | IEventListener | Takes an interface implemented by the user which contains the methods to be called when the event occurs. |

## Remarks

If an [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) is added to an [`EventTarget`](../) while it is processing an event, it will not be triggered by the current actions but may be triggered during a later stage of event flow, such as the bubbling phase.

If multiple identical Event Listeners are registered on the same [`EventTarget`](../) with the same parameters the duplicate instances are discarded. They do not cause the [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) to be called twice and since they are discarded they do not need to be removed with the [`RemoveEventListener`](../removeeventlistener/) method.

### See Also

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* namespace [Aspose.Svg.Dom](../../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../../)

---

## AddEventListener(*string, [IEventListener](../../../aspose.svg.dom.events/ieventlistener/), bool*) {#addeventlistener_2}

Sets up a function that will be called whenever the specified event is delivered to the target.

It works by adding a function, or an object that implements [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/), to the list of event listeners for the specified event type on the [`EventTarget`](../) on which it's called. If the function or object, is already in the list of event listeners for this target, they are not added a second time.

```csharp
public void AddEventListener(string type, IEventListener listener, bool useCapture)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | String | The event type for which the user is registering |
| listener | IEventListener | Takes an interface implemented by the user which contains the methods to be called when the event occurs. |
| useCapture | Boolean | If true, useCapture indicates that the user wishes to initiate capture. After initiating capture, all events of the specified type will be dispatched to the registered [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) before being dispatched to any Event Targets beneath them in the tree. Events which are bubbling upward through the tree will not trigger an [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) designated to use capture. |

## Remarks

If an [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) is added to an [`EventTarget`](../) while it is processing an event, it will not be triggered by the current actions but may be triggered during a later stage of event flow, such as the bubbling phase.

If multiple identical Event Listeners are registered on the same [`EventTarget`](../) with the same parameters the duplicate instances are discarded. They do not cause the [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) to be called twice and since they are discarded they do not need to be removed with the [`RemoveEventListener`](../removeeventlistener/) method.

### See Also

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* namespace [Aspose.Svg.Dom](../../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../../)
