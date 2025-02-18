---
title: MediaQueryList Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Window.MediaQueryList class. A MediaQueryList object stores information on a media query applied to a document with support for both immediate and event-driven matching against the state of the document. See CSSOM View Module specification https//www.w3.org/TR/cssom-view/the-mediaquerylist-interface
type: docs
weight: 2710
url: /net/aspose.svg.window/mediaquerylist/
---
## MediaQueryList class

A MediaQueryList object stores information on a media query applied to a document, with support for both immediate and event-driven matching against the state of the document. See CSSOM View Module specification: [https://www.w3.org/TR/cssom-view/#the-mediaquerylist-interface](https://www.w3.org/TR/cssom-view/#the-mediaquerylist-interface)

```csharp
public class MediaQueryList : EventTarget
```

## Properties

| Name | Description |
| --- | --- |
| [Document](../../aspose.svg.window/mediaquerylist/document/) { get; } | Context object's associated document. |
| [Matches](../../aspose.svg.window/mediaquerylist/matches/) { get; } | A boolean value that returns true if the document currently matches the media query list, or false if not. |
| [Media](../../aspose.svg.window/mediaquerylist/media/) { get; } | A string representing a serialized media query. |

## Methods

| Name | Description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | This method allows the registration of event listeners on the event target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | This method allows the registration of event listeners on the event target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | This method allows the registration of event listeners on the event target. |
| [AddListener](../../aspose.svg.window/mediaquerylist/addlistener/)(IEventListener) | Add MediaQueryList matches state change event listener. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | This method allows the dispatch of events into the implementations event model. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveListener](../../aspose.svg.window/mediaquerylist/removelistener/)(IEventListener) | Remove MediaQueryList matches state change event listener. |

## Events

| Name | Description |
| --- | --- |
| event [OnChange](../../aspose.svg.window/mediaquerylist/onchange/) | Event that is fired at the MediaQueryList when the matches state changes. |

### See Also

* class [EventTarget](../../aspose.svg.dom/eventtarget/)
* namespace [Aspose.Svg.Window](../../aspose.svg.window/)
* assembly [Aspose.SVG](../../)
