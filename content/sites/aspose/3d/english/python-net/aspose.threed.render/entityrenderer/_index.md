---
title: EntityRenderer class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.render/entityrenderer/
is_root: false
---

## EntityRenderer class

Subclass this to implement rendering for different kind of entities.



The EntityRenderer type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [EntityRenderer(key, features)](/3d/python-net/aspose.threed.render/entityrenderer/__init__/#str-EntityRendererFeatures) | Constructor of [EntityRenderer](/3d/python-net/aspose.threed.render/entityrenderer) |
| [EntityRenderer(key)](/3d/python-net/aspose.threed.render/entityrenderer/__init__/#str) | Constructor of [EntityRenderer](/3d/python-net/aspose.threed.render/entityrenderer) |


### Methods
| Method | Description |
| :- | :- |
| [initialize(renderer)](/3d/python-net/aspose.threed.render/entityrenderer/initialize/#Renderer) | Initialize the entity renderer |
| [reset_scene_cache()](/3d/python-net/aspose.threed.render/entityrenderer/reset_scene_cache/#) | The scene has changed or removed, need to dispose scene-level render resources in this |
| [frame_begin(renderer, render_queue)](/3d/python-net/aspose.threed.render/entityrenderer/frame_begin/#Renderer-IRenderQueue) | Begin rendering a frame |
| [frame_end(renderer, render_queue)](/3d/python-net/aspose.threed.render/entityrenderer/frame_end/#Renderer-IRenderQueue) | Ends rendering a frame |
| [prepare_render_queue(renderer, queue, node, entity)](/3d/python-net/aspose.threed.render/entityrenderer/prepare_render_queue/#Renderer-IRenderQueue-Node-Entity) | Prepare rendering commands for specified node/entity pair. |
| [render_entity(renderer, command_list, node, renderable_resource, sub_entity)](/3d/python-net/aspose.threed.render/entityrenderer/render_entity/#Renderer-ICommandList-Node-any-int) | Each render task pushed to the [IRenderQueue](/3d/python-net/aspose.threed.render/irenderqueue) will have a corresponding RenderEntity call<br/>to perform the concrete rendering job. |
| [dispose()](/3d/python-net/aspose.threed.render/entityrenderer/dispose/#) | The entity renderer is being disposed, release shared resources. |



### See Also
* module [aspose.threed.render](..)
* class [EntityRenderer](/3d/python-net/aspose.threed.render/entityrenderer)
* class [IRenderQueue](/3d/python-net/aspose.threed.render/irenderqueue)
