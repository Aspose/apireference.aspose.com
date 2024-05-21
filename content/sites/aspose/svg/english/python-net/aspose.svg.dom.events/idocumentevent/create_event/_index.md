---
title: create_event method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.svg.dom.events/idocumentevent/create_event/
is_root: false
---

## create_event {#str}

Creates an [`Event`](./aspose.svg.dom.events/event) of a type supported by the implementation.


### Returns 


The newly created [`Event`](./aspose.svg.dom.events/event)


```python
def create_event(self, event_type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| event_type | str | The eventType parameter specifies the type of [`Event`](./aspose.svg.dom.events/event) interface to be created.<br/><br/>If the [`Event`](./aspose.svg.dom.events/event) interface specified is supported by the implementation this method will return a new<br/>[`Event`](./aspose.svg.dom.events/event) of the interface type requested.<br/>If the [`Event`](./aspose.svg.dom.events/event) is to be dispatched via the [`EventTarget.dispatch_event`](./aspose.svg.dom/eventtarget/dispatch_event) method the appropriate<br/>[`Event.init_event`](./aspose.svg.dom.events/event/init_event) method must be called after creation in order to initialize the [`Event`](./aspose.svg.dom.events/event)'s values.<br/><br/><br/>The [`IDocumentEvent.create_event`](./aspose.svg.dom.events/idocumentevent/create_event) method is used in creating [`Event`](./aspose.svg.dom.events/event)s when it is either inconvenient<br/>or unnecessary for the user to create an [`Event`](./aspose.svg.dom.events/event) themselves.<br/>In cases where the implementation provided [`Event`](./aspose.svg.dom.events/event) is insufficient, users may supply their own<br/>[`Event`](./aspose.svg.dom.events/event) implementations for use with the [`EventTarget.dispatch_event`](./aspose.svg.dom/eventtarget/dispatch_event) method. |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](./aspose.svg.dom/domexception) | NOT_SUPPORTED_ERR: Raised if the implementation does not support the type of [`Event`](./aspose.svg.dom.events/event) interface requested |





### See Also
* module [`aspose.svg.dom.events`](../../)
* class [`DOMException`](./aspose.svg.dom/domexception)
* class [`Event`](./aspose.svg.dom.events/event)
* class [`IDocumentEvent`](./aspose.svg.dom.events/idocumentevent)
