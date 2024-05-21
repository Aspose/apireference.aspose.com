---
title: embed method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.svg.saving/resource/embed/
is_root: false
---

## embed {#aspose.svg.saving.ResourceHandlingContext}

Embeds this resource within its parent by encoding it as Base64. The encoding result will be written to [`Resource.output_url`](./aspose.svg.saving/resource#output_url).


### Returns 


This resource so that you can chain calls.


```python
def embed(self, context):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| context | [`ResourceHandlingContext`](./aspose.svg.saving/resourcehandlingcontext) | Resource handling context. |
### Exceptions
| Exception | Description |
| :- | :- |
| InvalidOperationException | Raised if there is no [`ResourceHandlingContext.parent_resource`](./aspose.svg.saving/resourcehandlingcontext#parent_resource) because there is nowhere to embed the result. |





### See Also
* module [`aspose.svg.saving`](../../)
* class [`Resource`](./aspose.svg.saving/resource)
