---
title: FocusEvent class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.svg.dom.events/focusevent/
is_root: false
---

## FocusEvent class

The FocusEvent interface provides specific contextual information associated with Focus events.



**Inheritance:** [`FocusEvent`](./aspose.svg.dom.events/focusevent) → 
[`UIEvent`](./aspose.svg.dom.events/uievent) → 
[`Event`](./aspose.svg.dom.events/event) → 
[`DOMObject`](./aspose.svg.dom/domobject)



The FocusEvent type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](./aspose.svg.dom.events/focusevent/__init__/#str) | Initializes a new instance of the [`FocusEvent`](./aspose.svg.dom.events/focusevent) class. |


### Properties
| Property | Description |
| :- | :- |
| [bubbles](./aspose.svg.dom.events/focusevent/bubbles) | Used to indicate whether or not an event is a bubbling event. If the event can bubble the value is true, else the value is false. |
| [cancelable](./aspose.svg.dom.events/focusevent/cancelable) | Used to indicate whether or not an event can have its default action prevented. If the default action can be prevented the value is true, else the value is false. |
| [current_target](./aspose.svg.dom.events/focusevent/current_target) | Used to indicate the [`IEventTarget`](./aspose.svg.dom.events/ieventtarget) whose [`IEventListener`](./aspose.svg.dom.events/ieventlistener)s are currently being processed.<br/>This is particularly useful during capturing and bubbling. |
| [event_phase](./aspose.svg.dom.events/focusevent/event_phase) | Used to indicate which phase of event flow is currently being evaluated. |
| [target](./aspose.svg.dom.events/focusevent/target) | Used to indicate the [`IEventTarget`](./aspose.svg.dom.events/ieventtarget) to which the event was originally dispatched. |
| [time_stamp](./aspose.svg.dom.events/focusevent/time_stamp) | Used to specify the time (in milliseconds relative to the epoch) at which the event was created.<br/>Due to the fact that some systems may not provide this information the value of timeStamp may be not available for all events.<br/>When not available, a value of 0 will be returned.<br/>Examples of epoch time are the time of the system start or 0:0:0 UTC 1st January 1970. |
| [type](./aspose.svg.dom.events/focusevent/type) | The name of the event (case-insensitive). The name must be an XML name. |
| [default_prevented](./aspose.svg.dom.events/focusevent/default_prevented) | Returns true if preventDefault() was invoked while the cancelable attribute value is true, and false otherwise. |
| [is_trusted](./aspose.svg.dom.events/focusevent/is_trusted) | The isTrusted attribute must return the value it was initialized to. When an event is created the attribute must be initialized to false. |
| [NONE_PHASE](./aspose.svg.dom.events/focusevent/none_phase) | Events not currently dispatched are in this phase. |
| [CAPTURING_PHASE](./aspose.svg.dom.events/focusevent/capturing_phase) | The event is currently being evaluated at the target [`IEventTarget`](./aspose.svg.dom.events/ieventtarget). |
| [AT_TARGET_PHASE](./aspose.svg.dom.events/focusevent/at_target_phase) | The current event phase is the capturing phase. |
| [BUBBLING_PHASE](./aspose.svg.dom.events/focusevent/bubbling_phase) | The current event phase is the bubbling phase. |
| [view](./aspose.svg.dom.events/focusevent/view) | The view attribute identifies the Window from which the event was generated.<br/>The un-initialized value of this attribute MUST be null. |
| [detail](./aspose.svg.dom.events/focusevent/detail) | Specifies some detail information about the Event, depending on the type of event. |
| [related_target](./aspose.svg.dom.events/focusevent/related_target) | Used to identify a secondary EventTarget related to a Focus event, depending on the type of event. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](./aspose.svg.dom.events/focusevent/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |
| [init_event](./aspose.svg.dom.events/focusevent/init_event/#str-bool-bool) | The [`Event.init_event`](./aspose.svg.dom.events/event/init_event) method is used to initialize the value of an [`Event`](./aspose.svg.dom.events/event) created through the<br/>[`IDocumentEvent`](./aspose.svg.dom.events/idocumentevent) interface. |
| [prevent_default](./aspose.svg.dom.events/focusevent/prevent_default/#) | If an event is cancelable, the [`Event.prevent_default`](./aspose.svg.dom.events/event/prevent_default) method is used to signify that the event is to be canceled,<br/>meaning any default action normally taken by the implementation as a result of the event will not occur. |
| [stop_propagation](./aspose.svg.dom.events/focusevent/stop_propagation/#) | The [`Event.stop_propagation`](./aspose.svg.dom.events/event/stop_propagation) method is used prevent further propagation of an event during event flow. |
| [stop_immediate_propagation](./aspose.svg.dom.events/focusevent/stop_immediate_propagation/#) | Invoking this method prevents event from reaching any event listeners registered after the current one and when dispatched in a tree also prevents event from reaching any other objects. |



### See Also
* module [`aspose.svg.dom.events`](..)
* class [`DOMObject`](./aspose.svg.dom/domobject)
* class [`Event`](./aspose.svg.dom.events/event)
* class [`FocusEvent`](./aspose.svg.dom.events/focusevent)
* class [`IDocumentEvent`](./aspose.svg.dom.events/idocumentevent)
* class [`IEventListener`](./aspose.svg.dom.events/ieventlistener)
* class [`IEventTarget`](./aspose.svg.dom.events/ieventtarget)
* class [`UIEvent`](./aspose.svg.dom.events/uievent)
