---
title: add_event_listener method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg/svgtextcontentelement/add_event_listener/
is_root: false
---

## add_event_listener {#str-aspose.svg.dom.events.IEventListener}

Sets up a function that will be called whenever the specified event is delivered to the target.


It works by adding a function, or an object that implements [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener),
to the list of event listeners for the specified event type on the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which it's called.
If the function or object, is already in the list of event listeners for this target, they are not added a second time.



```python
def add_event_listener(self, type, listener):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| type | str | The event type for which the user is registering |
| listener | aspose.svg.dom.events.IEventListener | Takes an interface implemented by the user which contains the methods to be called when the event occurs. |
### Remarks

If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is added to an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered
by the current actions but may be triggered during a later stage of event flow, such as the bubbling phase.




If multiple identical Event Listeners are registered on the same [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) with the same parameters the duplicate instances are discarded.
They do not cause the [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) to be called twice and since they are discarded they do not need to be removed with the
[`EventTarget.remove_event_listener`](/svg/python-net/aspose.svg.dom/eventtarget/remove_event_listener)
method.

## add_event_listener {#str-aspose.svg.dom.events.IEventListener-bool}

Sets up a function that will be called whenever the specified event is delivered to the target.


It works by adding a function, or an object that implements [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener),
to the list of event listeners for the specified event type on the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which it's called.
If the function or object, is already in the list of event listeners for this target, they are not added a second time.



```python
def add_event_listener(self, type, listener, use_capture):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| type | str | The event type for which the user is registering |
| listener | aspose.svg.dom.events.IEventListener | Takes an interface implemented by the user which contains the methods to be called when the event occurs. |
| use_capture | bool | If true, useCapture indicates that the user wishes to initiate capture.<br/>After initiating capture, all events of the specified type will be dispatched to the registered<br/>[`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener)<br/>before being dispatched to any Event Targets beneath them in the tree.<br/>Events which are bubbling upward through the tree will not trigger an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) designated to use capture. |
### Remarks

If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is added to an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered
by the current actions but may be triggered during a later stage of event flow, such as the bubbling phase.




If multiple identical Event Listeners are registered on the same [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) with the same parameters the duplicate instances are discarded.
They do not cause the [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) to be called twice and since they are discarded they do not need to be removed with the
[`EventTarget.remove_event_listener`](/svg/python-net/aspose.svg.dom/eventtarget/remove_event_listener)
method.


### See Also
* module [`aspose.svg`](../../)
* class [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget)
* class [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener)
* class [`SVGTextContentElement`](/svg/python-net/aspose.svg/svgtextcontentelement)
