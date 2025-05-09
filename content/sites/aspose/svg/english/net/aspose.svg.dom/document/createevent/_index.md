---
title: Document.CreateEvent
second_title: Aspose.SVG for .NET API Reference
description: Document CreateEvent method. Creates an Event of a type supported by the implementation
type: docs
weight: 880
url: /net/aspose.svg.dom/document/createevent/
---
## Document.CreateEvent method

Creates an [`Event`](../../../aspose.svg.dom.events/event/) of a type supported by the implementation.

```csharp
public Event CreateEvent(string eventType)
```

| Parameter | Type | Description |
| --- | --- | --- |
| eventType | String | The eventType parameter specifies the type of [`Event`](../../../aspose.svg.dom.events/event/) interface to be created.  If the [`Event`](../../../aspose.svg.dom.events/event/) interface specified is supported by the implementation this method will return a new [`Event`](../../../aspose.svg.dom.events/event/) of the interface type requested. If the [`Event`](../../../aspose.svg.dom.events/event/) is to be dispatched via the [`DispatchEvent`](../../../aspose.svg.dom.events/ieventtarget/dispatchevent/) method the appropriate [`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) method must be called after creation in order to initialize the [`Event`](../../../aspose.svg.dom.events/event/)'s values. |

### Return Value

The newly created [`Event`](../../../aspose.svg.dom.events/event/)

### Exceptions

| exception | condition |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: Raised if the implementation does not support the type of [`Event`](../../../aspose.svg.dom.events/event/) interface requested |

### See Also

* class [Event](../../../aspose.svg.dom.events/event/)
* class [Document](../)
* namespace [Aspose.Svg.Dom](../../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../../)
