---
title: IEventListener Interface
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Events.IEventListener interface. The IEventListener interface is the primary method for handling events. Users implement the IEventListener interface and register their listener on an EventTarget using the AddEventListener method. The users should also remove their IEventListener from its EventTarget after they have completed using the listener
type: docs
weight: 970
url: /net/aspose.html.dom.events/ieventlistener/
---
## IEventListener interface

The `IEventListener` interface is the primary method for handling events. Users implement the `IEventListener` interface and register their listener on an [`EventTarget`](../../aspose.html.dom/eventtarget/) using the [`AddEventListener`](../../aspose.html.dom/eventtarget/addeventlistener/) method. The users should also remove their `IEventListener` from its [`EventTarget`](../../aspose.html.dom/eventtarget/) after they have completed using the listener.

```csharp
public interface IEventListener
```

## Methods

| Name | Description |
| --- | --- |
| [HandleEvent](../../aspose.html.dom.events/ieventlistener/handleevent/)(*[Event](../event/)*) | This method is called whenever an event occurs of the type for which the `IEventListener` interface was registered. |

## Remarks

When a Node is copied using the cloneNode method the Event Listeners attached to the source Node are not attached to the copied Node. If the user wishes the same Event Listeners to be added to the newly created copy the user must add them manually.

### See Also

* namespace [Aspose.Html.Dom.Events](../../aspose.html.dom.events/)
* assembly [Aspose.HTML](../../)
