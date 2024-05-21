---
title: IEventTarget class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 80
url: /aspose.svg.dom.events/ieventtarget/
is_root: false
---

## IEventTarget class

The [`EventTarget`](./aspose.svg.dom/eventtarget) interface is implemented by all Nodes in an implementation which supports the DOM Event Model.
Therefore, this interface can be obtained by using binding-specific casting methods on an instance of the Node interface.
The interface allows registration and removal of Event Listeners on an [`EventTarget`](./aspose.svg.dom/eventtarget) and dispatch of events to that [`IEventTarget`](./aspose.svg.dom.events/ieventtarget).



The IEventTarget type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [add_event_listener](./aspose.svg.dom.events/ieventtarget/add_event_listener/#str-aspose.svg.dom.events.IEventListener) | This method allows the registration of event listeners on the event target. |
| [add_event_listener](./aspose.svg.dom.events/ieventtarget/add_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | This method allows the registration of event listeners on the event target. |
| [remove_event_listener](./aspose.svg.dom.events/ieventtarget/remove_event_listener/#str-aspose.svg.dom.events.IEventListener) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](./aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](./aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [remove_event_listener](./aspose.svg.dom.events/ieventtarget/remove_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](./aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](./aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [dispatch_event](./aspose.svg.dom.events/ieventtarget/dispatch_event/#aspose.svg.dom.events.Event) | This method allows the dispatch of events into the implementations event model. |



### See Also
* module [`aspose.svg.dom.events`](..)
* class [`EventTarget`](./aspose.svg.dom/eventtarget)
* class [`IEventListener`](./aspose.svg.dom.events/ieventlistener)
* class [`IEventTarget`](./aspose.svg.dom.events/ieventtarget)
