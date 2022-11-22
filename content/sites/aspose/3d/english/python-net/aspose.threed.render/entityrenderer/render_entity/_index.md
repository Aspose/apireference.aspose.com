---
title: render_entity method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.render/entityrenderer/render_entity/
is_root: false
---

## render_entity(renderer, command_list, node, renderable_resource, sub_entity) {#Renderer-ICommandList-Node-any-int}

Each render task pushed to the [IRenderQueue](/3d/python-net/aspose.threed.render/irenderqueue) will have a corresponding RenderEntity call
            to perform the concrete rendering job.



```python
def render_entity(self, renderer, command_list, node, renderable_resource, sub_entity):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| renderer | [Renderer](/3d/python-net/aspose.threed.render/renderer) | The renderer |
| command_list | [ICommandList](/3d/python-net/aspose.threed.render/icommandlist) | The commandList used to record the rendering commands |
| node | [Node](/3d/python-net/aspose.threed/node) | The same node that passed to PrepareRenderQueue of the entity that will be rendered |
| renderable_resource | any | The custom object that passed to IRenderQueue during the PrepareRenderQueue |
| sub_entity | int | The index of the sub entity that passed to IRenderQueue |



### See Also
* module [aspose.threed.render](../../)
* class [EntityRenderer](/3d/python-net/aspose.threed.render/entityrenderer)
