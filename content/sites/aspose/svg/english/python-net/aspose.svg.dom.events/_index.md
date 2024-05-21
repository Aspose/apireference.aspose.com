---
title: aspose.svg.dom.events
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.svg.dom.events/
is_root: false
---

The **Aspose.Svg.Dom.Events**  namespace provides objects for
any events related DOM updating. It includes subscription to
specific contextual information observation
associated with event as well as custom events construction.

### Classes
| Class | Description |
| :- | :- |
| [`CustomEvent`](/svg/python-net/aspose.svg.dom.events/customevent) | Events using the CustomEvent interface can be used to carry custom data. |
| [`DocumentLoadErrorEvent`](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent) | The [`DocumentLoadErrorEvent`](/svg/python-net/aspose.svg.dom.events/documentloaderrorevent) occurres when the requested resource is not available. |
| [`ErrorEvent`](/svg/python-net/aspose.svg.dom.events/errorevent) | The [`ErrorEvent`](/svg/python-net/aspose.svg.dom.events/errorevent) provides contextual information about an errors that occurred during runtime. |
| [`Event`](/svg/python-net/aspose.svg.dom.events/event) | The [`Event`](/svg/python-net/aspose.svg.dom.events/event) is used to provide contextual information about an event to the handler processing the event. |
| [`FocusEvent`](/svg/python-net/aspose.svg.dom.events/focusevent) | The FocusEvent interface provides specific contextual information associated with Focus events. |
| [`IDocumentEvent`](/svg/python-net/aspose.svg.dom.events/idocumentevent) | The [`IDocumentEvent`](/svg/python-net/aspose.svg.dom.events/idocumentevent) interface provides a mechanism by which the user can create an [`Event`](/svg/python-net/aspose.svg.dom.events/event) of a type supported by the implementation. |
| [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) | The [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) interface is the primary method for handling events.<br/>Users implement the [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) interface and register their listener on an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) using the [`EventTarget.add_event_listener`](/svg/python-net/aspose.svg.dom/eventtarget/add_event_listener) method.<br/>The users should also remove their [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) from its [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) after they have completed using the listener. |
| [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget) | The [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) interface is implemented by all Nodes in an implementation which supports the DOM Event Model.<br/>Therefore, this interface can be obtained by using binding-specific casting methods on an instance of the Node interface.<br/>The interface allows registration and removal of Event Listeners on an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) and dispatch of events to that [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget). |
| [`InputEvent`](/svg/python-net/aspose.svg.dom.events/inputevent) | Input events are sent as notifications whenever the DOM is being updated. |
| [`KeyboardEvent`](/svg/python-net/aspose.svg.dom.events/keyboardevent) | The KeyboardEvent interface provides specific contextual information associated with keyboard devices. Each keyboard event references a key using a value. Keyboard events are commonly directed at the element that has the focus. |
| [`MouseEvent`](/svg/python-net/aspose.svg.dom.events/mouseevent) | The MouseEvent interface provides specific contextual information associated with Mouse events. |
| [`UIEvent`](/svg/python-net/aspose.svg.dom.events/uievent) | The UIEvent interface provides specific contextual information associated with User Interface events. |
| [`WheelEvent`](/svg/python-net/aspose.svg.dom.events/wheelevent) | The WheelEvent interface provides specific contextual information associated with wheel events. To create an instance of the WheelEvent interface, use the WheelEvent constructor, passing an optional WheelEventInit dictionary. |


