---
title: TimeEvent class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.svg.events/timeevent/
is_root: false
---

## TimeEvent class

The TimeEvent interface provides specific contextual information associated with Time events.The different types of events that can occur are: beginEvent, endEvent and repeatEvent.



**Inheritance:** [`TimeEvent`](./aspose.svg.events/timeevent) → 
[`Event`](./aspose.svg.dom.events/event) → 
[`DOMObject`](./aspose.svg.dom/domobject)



The TimeEvent type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [bubbles](./aspose.svg.events/timeevent/bubbles) | Used to indicate whether or not an event is a bubbling event. If the event can bubble the value is true, else the value is false. |
| [cancelable](./aspose.svg.events/timeevent/cancelable) | Used to indicate whether or not an event can have its default action prevented. If the default action can be prevented the value is true, else the value is false. |
| [current_target](./aspose.svg.events/timeevent/current_target) | Used to indicate the [`IEventTarget`](./aspose.svg.dom.events/ieventtarget) whose [`IEventListener`](./aspose.svg.dom.events/ieventlistener)s are currently being processed.<br/>This is particularly useful during capturing and bubbling. |
| [event_phase](./aspose.svg.events/timeevent/event_phase) | Used to indicate which phase of event flow is currently being evaluated. |
| [target](./aspose.svg.events/timeevent/target) | Used to indicate the [`IEventTarget`](./aspose.svg.dom.events/ieventtarget) to which the event was originally dispatched. |
| [time_stamp](./aspose.svg.events/timeevent/time_stamp) | Used to specify the time (in milliseconds relative to the epoch) at which the event was created.<br/>Due to the fact that some systems may not provide this information the value of timeStamp may be not available for all events.<br/>When not available, a value of 0 will be returned.<br/>Examples of epoch time are the time of the system start or 0:0:0 UTC 1st January 1970. |
| [type](./aspose.svg.events/timeevent/type) | The name of the event (case-insensitive). The name must be an XML name. |
| [default_prevented](./aspose.svg.events/timeevent/default_prevented) | Returns true if preventDefault() was invoked while the cancelable attribute value is true, and false otherwise. |
| [is_trusted](./aspose.svg.events/timeevent/is_trusted) | The isTrusted attribute must return the value it was initialized to. When an event is created the attribute must be initialized to false. |
| [NONE_PHASE](./aspose.svg.events/timeevent/none_phase) | Events not currently dispatched are in this phase. |
| [CAPTURING_PHASE](./aspose.svg.events/timeevent/capturing_phase) | The event is currently being evaluated at the target [`IEventTarget`](./aspose.svg.dom.events/ieventtarget). |
| [AT_TARGET_PHASE](./aspose.svg.events/timeevent/at_target_phase) | The current event phase is the capturing phase. |
| [BUBBLING_PHASE](./aspose.svg.events/timeevent/bubbling_phase) | The current event phase is the bubbling phase. |
| [view](./aspose.svg.events/timeevent/view) | The view attribute identifies the AbstractView [DOM2VIEWS] from which the event was generated. |
| [detail](./aspose.svg.events/timeevent/detail) | Specifies some detail information about the Event, depending on the type of the event. For this event type, indicates the repeat number for the animation. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](./aspose.svg.events/timeevent/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |
| [init_event](./aspose.svg.events/timeevent/init_event/#str-bool-bool) | The [`Event.init_event`](./aspose.svg.dom.events/event/init_event) method is used to initialize the value of an [`Event`](./aspose.svg.dom.events/event) created through the<br/>[`IDocumentEvent`](./aspose.svg.dom.events/idocumentevent) interface. |
| [prevent_default](./aspose.svg.events/timeevent/prevent_default/#) | If an event is cancelable, the [`Event.prevent_default`](./aspose.svg.dom.events/event/prevent_default) method is used to signify that the event is to be canceled,<br/>meaning any default action normally taken by the implementation as a result of the event will not occur. |
| [stop_propagation](./aspose.svg.events/timeevent/stop_propagation/#) | The [`Event.stop_propagation`](./aspose.svg.dom.events/event/stop_propagation) method is used prevent further propagation of an event during event flow. |
| [stop_immediate_propagation](./aspose.svg.events/timeevent/stop_immediate_propagation/#) | Invoking this method prevents event from reaching any event listeners registered after the current one and when dispatched in a tree also prevents event from reaching any other objects. |
| [init_time_event](./aspose.svg.events/timeevent/init_time_event/#str-aspose.svg.dom.views.IAbstractView-int) | The initTimeEvent method is used to initialize the value of a TimeEvent created through the DocumentEvent interface. This method may only be called before the TimeEvent has been dispatched via the dispatchEvent method, though it may be called multiple times during that phase if necessary. If called multiple times, the final invocation takes precedence. |



### See Also
* module [`aspose.svg.events`](..)
* class [`DOMObject`](./aspose.svg.dom/domobject)
* class [`Event`](./aspose.svg.dom.events/event)
* class [`IDocumentEvent`](./aspose.svg.dom.events/idocumentevent)
* class [`IEventListener`](./aspose.svg.dom.events/ieventlistener)
* class [`IEventTarget`](./aspose.svg.dom.events/ieventtarget)
* class [`TimeEvent`](./aspose.svg.events/timeevent)
