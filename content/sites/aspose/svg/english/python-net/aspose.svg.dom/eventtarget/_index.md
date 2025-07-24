---
title: EventTarget class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.svg.dom/eventtarget/
is_root: false
---

## EventTarget class

The [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) interface is implemented by all Nodes in an implementation which supports the DOM Event Model.
Therefore, this interface can be obtained by using binding-specific casting methods on an instance of the Node interface.
The interface allows registration and removal of Event Listeners on an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) and dispatch of events to that [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget).



**Inheritance:** [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The EventTarget type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/svg/python-net/aspose.svg.dom/eventtarget/__init__/#) | Constructs a new instance of EventTarget |


### Methods
| Method | Description |
| :- | :- |
| [add_event_listener](/svg/python-net/aspose.svg.dom/eventtarget/add_event_listener/#str-aspose.svg.dom.events.IEventListener) | Sets up a function that will be called whenever the specified event is delivered to the target.<br/><br/><br/>It works by adding a function, or an object that implements [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener),<br/>to the list of event listeners for the specified event type on the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which it's called.<br/>If the function or object, is already in the list of event listeners for this target, they are not added a second time. |
| [add_event_listener](/svg/python-net/aspose.svg.dom/eventtarget/add_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | Sets up a function that will be called whenever the specified event is delivered to the target.<br/><br/><br/>It works by adding a function, or an object that implements [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener),<br/>to the list of event listeners for the specified event type on the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which it's called.<br/>If the function or object, is already in the list of event listeners for this target, they are not added a second time. |
| [remove_event_listener](/svg/python-net/aspose.svg.dom/eventtarget/remove_event_listener/#str-aspose.svg.dom.events.IEventListener) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [remove_event_listener](/svg/python-net/aspose.svg.dom/eventtarget/remove_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [get_platform_type](/svg/python-net/aspose.svg.dom/eventtarget/get_platform_type/#) | This method is used to retrieve the ECMAScript object Type. |
| [dispatch_event](/svg/python-net/aspose.svg.dom/eventtarget/dispatch_event/#aspose.svg.dom.events.Event) | Dispatches an Event at the specified [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget), (synchronously) invoking<br/>the affected EventListeners in the appropriate order. <br/>The normal event processing rules (including the capturing and optional bubbling phase) also apply to events <br/>dispatched manually with [`IEventTarget.dispatch_event`](/svg/python-net/aspose.svg.dom.events/ieventtarget/dispatch_event). |



### See Also
* module [`aspose.svg.dom`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget)
* class [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener)
* class [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget)
