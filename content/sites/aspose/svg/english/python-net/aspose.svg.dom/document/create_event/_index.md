---
title: create_event method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 140
url: /python-net/aspose.svg.dom/document/create_event/
is_root: false
---

## create_event {#str}

Creates an [`Event`](/svg/python-net/aspose.svg.dom.events/event) of a type supported by the implementation.


### Returns 


The newly created [`Event`](/svg/python-net/aspose.svg.dom.events/event)


```python
def create_event(self, event_type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| event_type | str | The eventType parameter specifies the type of [`Event`](/svg/python-net/aspose.svg.dom.events/event) interface to be created.<br/><br/>If the [`Event`](/svg/python-net/aspose.svg.dom.events/event) interface specified is supported by the implementation this method will<br/>return a new [`Event`](/svg/python-net/aspose.svg.dom.events/event) of the interface type requested.<br/>If the [`Event`](/svg/python-net/aspose.svg.dom.events/event) is to be dispatched via the [`IEventTarget.dispatch_event`](/svg/python-net/aspose.svg.dom.events/ieventtarget/dispatch_event) method the appropriate [`Event.init_event`](/svg/python-net/aspose.svg.dom.events/event/init_event)<br/>method must be called after creation in order to initialize the [`Event`](/svg/python-net/aspose.svg.dom.events/event)'s values.<br/><br/><br/>The [`IDocumentEvent.create_event`](/svg/python-net/aspose.svg.dom.events/idocumentevent/create_event) method is used in creating [`Event`](/svg/python-net/aspose.svg.dom.events/event)s when it is either inconvenient or unnecessary<br/>for the user to create an [`Event`](/svg/python-net/aspose.svg.dom.events/event) themselves.<br/>In cases where the implementation provided [`Event`](/svg/python-net/aspose.svg.dom.events/event) is insufficient, users may supply<br/>their own [`Event`](/svg/python-net/aspose.svg.dom.events/event) implementations for use with the [`IEventTarget.dispatch_event`](/svg/python-net/aspose.svg.dom.events/ieventtarget/dispatch_event) method. |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | NOT_SUPPORTED_ERR: Raised if the implementation does not support the type of [`Event`](/svg/python-net/aspose.svg.dom.events/event) interface requested |





### See Also
* module [`aspose.svg.dom`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`Document`](/svg/python-net/aspose.svg.dom/document)
* class [`Event`](/svg/python-net/aspose.svg.dom.events/event)
