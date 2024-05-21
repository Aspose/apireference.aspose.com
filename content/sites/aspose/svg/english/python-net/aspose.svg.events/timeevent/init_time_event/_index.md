---
title: init_time_event method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.svg.events/timeevent/init_time_event/
is_root: false
---

## init_time_event {#str-aspose.svg.dom.views.IAbstractView-int}

The initTimeEvent method is used to initialize the value of a TimeEvent created through the DocumentEvent interface. This method may only be called before the TimeEvent has been dispatched via the dispatchEvent method, though it may be called multiple times during that phase if necessary. If called multiple times, the final invocation takes precedence.



```python
def init_time_event(self, type_arg, view_arg, detail_arg):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| type_arg | str | Specifies the event type. |
| view_arg | aspose.svg.dom.views.IAbstractView | Specifies the Event's AbstractView. |
| detail_arg | int | Specifies the Event's detail. |



### See Also
* module [`aspose.svg.events`](../../)
* class [`TimeEvent`](/svg/python-net/aspose.svg.events/timeevent)
