---
title: IEventListener class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 70
url: /aspose.svg.dom.events/ieventlistener/
is_root: false
---

## IEventListener class

The [`IEventListener`](./aspose.svg.dom.events/ieventlistener) interface is the primary method for handling events.
Users implement the [`IEventListener`](./aspose.svg.dom.events/ieventlistener) interface and register their listener on an [`EventTarget`](./aspose.svg.dom/eventtarget) using the [`EventTarget.add_event_listener`](./aspose.svg.dom/eventtarget/add_event_listener) method.
The users should also remove their [`IEventListener`](./aspose.svg.dom.events/ieventlistener) from its [`EventTarget`](./aspose.svg.dom/eventtarget) after they have completed using the listener.



The IEventListener type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [handle_event](./aspose.svg.dom.events/ieventlistener/handle_event/#aspose.svg.dom.events.Event) | This method is called whenever an event occurs of the type for which the [`IEventListener`](./aspose.svg.dom.events/ieventlistener) interface was registered. |



### Remarks 


When a Node is copied using the cloneNode method the Event Listeners attached to the source Node are not attached to the copied Node.
If the user wishes the same Event Listeners to be added to the newly created copy the user must add them manually.

### See Also
* module [`aspose.svg.dom.events`](..)
* class [`EventTarget`](./aspose.svg.dom/eventtarget)
* class [`IEventListener`](./aspose.svg.dom.events/ieventlistener)
