---
title: DocumentLoadErrorEvent class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.dom.events/documentloaderrorevent/
is_root: false
---

## DocumentLoadErrorEvent class

The [`DocumentLoadErrorEvent`](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent) occurres when the requested resource is not available.



**Inheritance:** [`DocumentLoadErrorEvent`](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent) → 
[`ErrorEvent`](/svg/python-net/aspose.svg.dom.events/errorevent) → 
[`Event`](/svg/python-net/aspose.svg.dom.events/event) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The DocumentLoadErrorEvent type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [bubbles](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/bubbles) | Used to indicate whether or not an event is a bubbling event. If the event can bubble the value is true, else the value is false. |
| [cancelable](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/cancelable) | Used to indicate whether or not an event can have its default action prevented. If the default action can be prevented the value is true, else the value is false. |
| [current_target](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/current_target) | Used to indicate the [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget) whose [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener)s are currently being processed.<br/>This is particularly useful during capturing and bubbling. |
| [event_phase](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/event_phase) | Used to indicate which phase of event flow is currently being evaluated. |
| [target](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/target) | Used to indicate the [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget) to which the event was originally dispatched. |
| [time_stamp](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/time_stamp) | Used to specify the time (in milliseconds relative to the epoch) at which the event was created.<br/>Due to the fact that some systems may not provide this information the value of timeStamp may be not available for all events.<br/>When not available, a value of 0 will be returned.<br/>Examples of epoch time are the time of the system start or 0:0:0 UTC 1st January 1970. |
| [type](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/type) | The name of the event (case-insensitive). The name must be an XML name. |
| [default_prevented](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/default_prevented) | Returns true if preventDefault() was invoked while the cancelable attribute value is true, and false otherwise. |
| [is_trusted](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/is_trusted) | The isTrusted attribute must return the value it was initialized to. When an event is created the attribute must be initialized to false. |
| [NONE_PHASE](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/none_phase) | Events not currently dispatched are in this phase. |
| [CAPTURING_PHASE](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/capturing_phase) | The event is currently being evaluated at the target [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget). |
| [AT_TARGET_PHASE](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/at_target_phase) | The current event phase is the capturing phase. |
| [BUBBLING_PHASE](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/bubbling_phase) | The current event phase is the bubbling phase. |
| [message](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/message) | The message attribute must return the value it was initialized to. When the object is created, this attribute must be initialized to the empty string. It represents the error message. |
| [file_name](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/file_name) | The filename attribute must return the value it was initialized to. When the object is created, this attribute must be initialized to the empty string. It represents the absolute URL of the script in which the error originally occurred. |
| [line_no](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/line_no) | The lineno attribute must return the value it was initialized to. When the object is created, this attribute must be initialized to zero. It represents the line number where the error occurred in the script. |
| [col_no](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/col_no) | The colno attribute must return the value it was initialized to. When the object is created, this attribute must be initialized to zero. It represents the column number where the error occurred in the script. |
| [error](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/error) | The error attribute must return the value it was initialized to. When the object is created, this attribute must be initialized to null. Where appropriate, it is set to the object representing the error (e.g. the exception object in the case of an uncaught DOM exception). |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |
| [init_event](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/init_event/#str-bool-bool) | The [`Event.init_event`](/svg/python-net/aspose.svg.dom.events/event/init_event) method is used to initialize the value of an [`Event`](/svg/python-net/aspose.svg.dom.events/event) created through the<br/>[`IDocumentEvent`](/svg/python-net/aspose.svg.dom.events/idocumentevent) interface. |
| [prevent_default](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/prevent_default/#) | If an event is cancelable, the [`Event.prevent_default`](/svg/python-net/aspose.svg.dom.events/event/prevent_default) method is used to signify that the event is to be canceled,<br/>meaning any default action normally taken by the implementation as a result of the event will not occur. |
| [stop_propagation](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/stop_propagation/#) | The [`Event.stop_propagation`](/svg/python-net/aspose.svg.dom.events/event/stop_propagation) method is used prevent further propagation of an event during event flow. |
| [stop_immediate_propagation](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent/stop_immediate_propagation/#) | Invoking this method prevents event from reaching any event listeners registered after the current one and when dispatched in a tree also prevents event from reaching any other objects. |



### See Also
* module [`aspose.svg.dom.events`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`DocumentLoadErrorEvent`](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent)
* class [`ErrorEvent`](/svg/python-net/aspose.svg.dom.events/errorevent)
* class [`Event`](/svg/python-net/aspose.svg.dom.events/event)
* class [`IDocumentEvent`](/svg/python-net/aspose.svg.dom.events/idocumentevent)
* class [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener)
* class [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget)
