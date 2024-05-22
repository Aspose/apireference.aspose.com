---
title: embed method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.saving/resource/embed/
is_root: false
---

## embed {#aspose.svg.saving.ResourceHandlingContext}

Embeds this resource within its parent by encoding it as Base64. The encoding result will be written to [`Resource.output_url`](/svg/python-net/aspose.svg.saving/resource#output_url).


### Returns 


This resource so that you can chain calls.


```python
def embed(self, context):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| context | [`ResourceHandlingContext`](/svg/python-net/aspose.svg.saving/resourcehandlingcontext) | Resource handling context. |
### Exceptions
| Exception | Description |
| :- | :- |
| InvalidOperationException | Raised if there is no [`ResourceHandlingContext.parent_resource`](/svg/python-net/aspose.svg.saving/resourcehandlingcontext#parent_resource) because there is nowhere to embed the result. |





### See Also
* module [`aspose.svg.saving`](../../)
* class [`Resource`](/svg/python-net/aspose.svg.saving/resource)
