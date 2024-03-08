---
title: add method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.threed.render/irenderqueue/add/
is_root: false
---

## add {#aspose.threed.render.RenderQueueGroupId-aspose.threed.render.IPipeline-any-int}

Add render task to the render queue.



```python
def add(self, group_id, pipeline, renderable_resource, sub_entity):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| group_id | [`RenderQueueGroupId`](/3d/python-net/aspose.threed.render/renderqueuegroupid) | Which group of the queue the render task will be in |
| pipeline | [`IPipeline`](/3d/python-net/aspose.threed.render/ipipeline) | The pipeline instance used for this render task |
| renderable_resource | any | Custom object that will be sent to [`EntityRenderer.render_entity`](/3d/python-net/aspose.threed.render/entityrenderer/render_entity) |
| sub_entity | int | The index of sub entities, useful when the entity is consisting of more than one sub renderable components. |



### See Also
* module [`aspose.threed.render`](../../)
* class [`IRenderQueue`](/3d/python-net/aspose.threed.render/irenderqueue)
