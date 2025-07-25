---
title: MediaQueryList Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Window.MediaQueryList class. A MediaQueryList object stores information on a media query applied to a document with support for both immediate and event-driven matching against the state of the document. See CSSOM View Module specification https//www.w3.org/TR/cssom-view/the-mediaquerylist-interface
type: docs
weight: 6150
url: /net/aspose.html.window/mediaquerylist/
---
## MediaQueryList class

A MediaQueryList object stores information on a media query applied to a document, with support for both immediate and event-driven matching against the state of the document. See CSSOM View Module specification: [https://www.w3.org/TR/cssom-view/#the-mediaquerylist-interface](https://www.w3.org/TR/cssom-view/#the-mediaquerylist-interface)

```csharp
public class MediaQueryList : EventTarget
```

## Properties

| Name | Description |
| --- | --- |
| [Document](../../aspose.html.window/mediaquerylist/document/) { get; } | Context object's associated document. |
| [Matches](../../aspose.html.window/mediaquerylist/matches/) { get; } | A boolean value that returns true if the document currently matches the media query list, or false if not. |
| [Media](../../aspose.html.window/mediaquerylist/media/) { get; } | A string representing a serialized media query. |

## Methods

| Name | Description |
| --- | --- |
| [AddEventListener](../../aspose.html.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.html.dom.events/ieventlistener/)*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddEventListener](../../aspose.html.dom/eventtarget/addeventlistener/)(*string, [DOMEventHandler](../../aspose.html.dom.events/domeventhandler/), bool*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddEventListener](../../aspose.html.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.html.dom.events/ieventlistener/), bool*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddListener](../../aspose.html.window/mediaquerylist/addlistener/)(*[IEventListener](../../aspose.html.dom.events/ieventlistener/)*) | Add MediaQueryList matches state change event listener. |
| [DispatchEvent](../../aspose.html.dom/eventtarget/dispatchevent/)(*[Event](../../aspose.html.dom.events/event/)*) | Dispatches an Event at the specified [`IEventTarget`](../../aspose.html.dom.events/ieventtarget/), (synchronously) invoking the affected EventListeners in the appropriate order. The normal event processing rules (including the capturing and optional bubbling phase) also apply to events dispatched manually with [`DispatchEvent`](../../aspose.html.dom.events/ieventtarget/dispatchevent/). |
| [Dispose](../../aspose.html.dom/eventtarget/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |
| [RemoveEventListener](../../aspose.html.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.html.dom.events/ieventlistener/)*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.html.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.html.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.html.dom/eventtarget/removeeventlistener/)(*string, [DOMEventHandler](../../aspose.html.dom.events/domeventhandler/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.html.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.html.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.html.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.html.dom.events/ieventlistener/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.html.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.html.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveListener](../../aspose.html.window/mediaquerylist/removelistener/)(*[IEventListener](../../aspose.html.dom.events/ieventlistener/)*) | Remove MediaQueryList matches state change event listener. |

## Events

| Name | Description |
| --- | --- |
| event [OnChange](../../aspose.html.window/mediaquerylist/onchange/) | Event that is fired at the MediaQueryList when the matches state changes. |

### See Also

* class [EventTarget](../../aspose.html.dom/eventtarget/)
* namespace [Aspose.Html.Window](../../aspose.html.window/)
* assembly [Aspose.HTML](../../)
