---
title: SVGSVGElement.CreateEvent
second_title: Aspose.HTML for .NET API Reference
description: SVGSVGElement CreateEvent method. Creates an Event of a type supported by the implementation
type: docs
weight: 110
url: /net/aspose.html.dom.svg/svgsvgelement/createevent/
---
## SVGSVGElement.CreateEvent method

Creates an [`Event`](../../../aspose.html.dom.events/event/) of a type supported by the implementation.

```csharp
public Event CreateEvent(string eventType)
```

| Parameter | Type | Description |
| --- | --- | --- |
| eventType | String | The eventType parameter specifies the type of [`Event`](../../../aspose.html.dom.events/event/) interface to be created.  If the [`Event`](../../../aspose.html.dom.events/event/) interface specified is supported by the implementation this method will return a new [`Event`](../../../aspose.html.dom.events/event/) of the interface type requested. If the [`Event`](../../../aspose.html.dom.events/event/) is to be dispatched via the [`DispatchEvent`](../../../aspose.html.dom/eventtarget/dispatchevent/) method the appropriate [`InitEvent`](../../../aspose.html.dom.events/event/initevent/) method must be called after creation in order to initialize the [`Event`](../../../aspose.html.dom.events/event/)'s values. |

### Return Value

The newly created [`Event`](../../../aspose.html.dom.events/event/)

### Exceptions

| exception | condition |
| --- | --- |
| [DOMException](../../../aspose.html.dom/domexception/) | NOT_SUPPORTED_ERR: Raised if the implementation does not support the type of [`Event`](../../../aspose.html.dom.events/event/) interface requested |

### See Also

* class [Event](../../../aspose.html.dom.events/event/)
* class [SVGSVGElement](../)
* namespace [Aspose.Html.Dom.Svg](../../../aspose.html.dom.svg/)
* assembly [Aspose.HTML](../../../)
