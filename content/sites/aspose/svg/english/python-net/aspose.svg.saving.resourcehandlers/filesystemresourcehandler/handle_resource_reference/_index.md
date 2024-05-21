---
title: handle_resource_reference method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.svg.saving.resourcehandlers/filesystemresourcehandler/handle_resource_reference/
is_root: false
---

## handle_resource_reference {#aspose.svg.saving.Resource-aspose.svg.saving.ResourceHandlingContext}

This method is responsible for handling the resource reference. In this method, you can set what the reference to the resource being handled will look like.


### Returns 


A string that will be written to the parent resource and which represents a reference to the resource that is currently being handled.


```python
def handle_resource_reference(self, resource, context):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| resource | [`Resource`](/svg/python-net/aspose.svg.saving/resource) | The [`Resource`](/svg/python-net/aspose.svg.saving/resource) which will be handled. |
| context | [`ResourceHandlingContext`](/svg/python-net/aspose.svg.saving/resourcehandlingcontext) | Resource handling context. |
### Exceptions
| Exception | Description |
| :- | :- |
| InvalidOperationException | Raised if [`Resource.output_url`](/svg/python-net/aspose.svg.saving/resource#output_url) is  and [`Resource.status`](/svg/python-net/aspose.svg.saving/resource#status) is [`ResourceStatus.SAVED`](/svg/python-net/aspose.svg.saving/resourcestatus#SAVED). [`Resource.output_url`](/svg/python-net/aspose.svg.saving/resource#output_url) should be specified for saved resource because otherwise it is impossible to specify the correct reference in the resources referencing this one. |





### See Also
* module [`aspose.svg.saving.resourcehandlers`](../../)
* class [`FileSystemResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/filesystemresourcehandler)
* class [`Resource`](/svg/python-net/aspose.svg.saving/resource)
