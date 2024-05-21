---
title: save method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.svg.saving/resource/save/
is_root: false
---

## save {#io.RawIOBase-aspose.svg.saving.ResourceHandlingContext}

Saves the resource to the provided stream.


### Returns 


This resource so that you can chain calls.


```python
def save(self, stream, context):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream in which the resource will be saved. |
| context | [`ResourceHandlingContext`](/svg/python-net/aspose.svg.saving/resourcehandlingcontext) | Resource handling context. |
### Exceptions
| Exception | Description |
| :- | :- |
| InvalidOperationException | Raised if [`Resource.output_url`](/svg/python-net/aspose.svg.saving/resource#output_url) is . [`Resource.output_url`](/svg/python-net/aspose.svg.saving/resource#output_url) should be specified before saving the resource because otherwise it is impossible to specify the correct reference in the resources referencing this one. |





### See Also
* module [`aspose.svg.saving`](../../)
* class [`Resource`](/svg/python-net/aspose.svg.saving/resource)
