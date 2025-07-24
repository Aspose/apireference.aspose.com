---
title: MediaQueryList class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.svg.window/mediaquerylist/
is_root: false
---

## MediaQueryList class

A MediaQueryList object stores information on a media query applied to a document, 
with support for both immediate and event-driven matching against the state of the document.
See CSSOM View Module specification:



**Inheritance:** [`MediaQueryList`](/svg/python-net/aspose.svg.window/mediaquerylist) → 
[`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The MediaQueryList type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [document](/svg/python-net/aspose.svg.window/mediaquerylist/document) | Context object's associated document. |
| [media](/svg/python-net/aspose.svg.window/mediaquerylist/media) | A string representing a serialized media query. |
| [matches](/svg/python-net/aspose.svg.window/mediaquerylist/matches) | A boolean value that returns true if the document currently matches the media query list, <br/>or false if not. |


### Methods
| Method | Description |
| :- | :- |
| [add_event_listener](/svg/python-net/aspose.svg.window/mediaquerylist/add_event_listener/#str-aspose.svg.dom.events.IEventListener) | Sets up a function that will be called whenever the specified event is delivered to the target.<br/><br/><br/>It works by adding a function, or an object that implements [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener),<br/>to the list of event listeners for the specified event type on the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which it's called.<br/>If the function or object, is already in the list of event listeners for this target, they are not added a second time. |
| [add_event_listener](/svg/python-net/aspose.svg.window/mediaquerylist/add_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | Sets up a function that will be called whenever the specified event is delivered to the target.<br/><br/><br/>It works by adding a function, or an object that implements [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener),<br/>to the list of event listeners for the specified event type on the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which it's called.<br/>If the function or object, is already in the list of event listeners for this target, they are not added a second time. |
| [remove_event_listener](/svg/python-net/aspose.svg.window/mediaquerylist/remove_event_listener/#str-aspose.svg.dom.events.IEventListener) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [remove_event_listener](/svg/python-net/aspose.svg.window/mediaquerylist/remove_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [get_platform_type](/svg/python-net/aspose.svg.window/mediaquerylist/get_platform_type/#) | This method is used to retrieve the ECMAScript object Type. |
| [dispatch_event](/svg/python-net/aspose.svg.window/mediaquerylist/dispatch_event/#aspose.svg.dom.events.Event) | Dispatches an Event at the specified [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget), (synchronously) invoking<br/>the affected EventListeners in the appropriate order. <br/>The normal event processing rules (including the capturing and optional bubbling phase) also apply to events <br/>dispatched manually with [`IEventTarget.dispatch_event`](/svg/python-net/aspose.svg.dom.events/ieventtarget/dispatch_event). |
| [add_listener](/svg/python-net/aspose.svg.window/mediaquerylist/add_listener/#aspose.svg.dom.events.IEventListener) | Add MediaQueryList matches state change event listener. |
| [remove_listener](/svg/python-net/aspose.svg.window/mediaquerylist/remove_listener/#aspose.svg.dom.events.IEventListener) | Remove MediaQueryList matches state change event listener. |



### See Also
* module [`aspose.svg.window`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget)
* class [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener)
* class [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget)
* class [`MediaQueryList`](/svg/python-net/aspose.svg.window/mediaquerylist)
