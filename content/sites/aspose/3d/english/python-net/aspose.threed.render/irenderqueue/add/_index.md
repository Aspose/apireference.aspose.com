---
title: add method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.render/irenderqueue/add/
is_root: false
---

## add(self, group_id, pipeline, renderable_resource, sub_entity) {#aspose.threed.render.RenderQueueGroupId-aspose.threed.render.IPipeline-System.Object-int}

Add render task to the render queue.



```python

def add(self, group_id, pipeline, renderable_resource, sub_entity):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| group_id | aspose.threed.render.RenderQueueGroupId | Which group of the queue the render task will be in |
| pipeline | aspose.threed.render.IPipeline | The pipeline instance used for this render task |
| renderable_resource | System.Object | Custom object that will be sent to [`EntityRenderer.render_entity`](/3d/python-net/aspose.threed.render/entityrenderer/render_entity) |
| sub_entity | int | The index of sub entities, useful when the entity is consisting of more than one sub renderable components. |



### See Also
* module [`aspose.threed.render`](../../)
* class [`IRenderQueue`](/3d/python-net/aspose.threed.render/irenderqueue)
