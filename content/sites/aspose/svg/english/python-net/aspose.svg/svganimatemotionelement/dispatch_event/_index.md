---
title: dispatch_event method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.svg/svganimatemotionelement/dispatch_event/
is_root: false
---

## dispatch_event {#aspose.svg.dom.events.Event}

Dispatches an Event at the specified [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget), (synchronously) invoking
the affected EventListeners in the appropriate order. 
The normal event processing rules (including the capturing and optional bubbling phase) also apply to events 
dispatched manually with [`IEventTarget.dispatch_event`](/svg/python-net/aspose.svg.dom.events/ieventtarget/dispatch_event).


### Returns 


The return value of [`EventTarget.dispatch_event`](/svg/python-net/aspose.svg.dom/eventtarget/dispatch_event) indicates whether any of the listeners which handled the event called [`Event.prevent_default`](/svg/python-net/aspose.svg.dom.events/event/prevent_default).
If [`Event.prevent_default`](/svg/python-net/aspose.svg.dom.events/event/prevent_default) was called the value is false, else the value is true.


```python
def dispatch_event(self, event):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| event | aspose.svg.dom.events.Event | Specifies the event type, behavior, and contextual information to be used in processing the event. |
### Remarks

Events dispatched in this manner will have the same capturing and bubbling behavior as events dispatched directly by the implementation.
The target of the event is the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which [`EventTarget.dispatch_event`](/svg/python-net/aspose.svg.dom/eventtarget/dispatch_event) is called.### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) |  |





### See Also
* module [`aspose.svg`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget)
* class [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget)
* class [`SVGAnimateMotionElement`](/svg/python-net/aspose.svg/svganimatemotionelement)
