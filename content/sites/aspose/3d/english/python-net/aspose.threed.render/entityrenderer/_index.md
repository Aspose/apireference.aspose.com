---
title: EntityRenderer class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /aspose.threed.render/entityrenderer/
is_root: false
---

## EntityRenderer class

Subclass this to implement rendering for different kind of entities.



The EntityRenderer type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.render/entityrenderer/__init__/#str-aspose.threed.render.EntityRendererFeatures) | Constructor of [`EntityRenderer`](/3d/python-net/aspose.threed.render/entityrenderer) |
| [__init__](/3d/python-net/aspose.threed.render/entityrenderer/__init__/#str) | Constructor of [`EntityRenderer`](/3d/python-net/aspose.threed.render/entityrenderer) |


### Methods
| Method | Description |
| :- | :- |
| [initialize](/3d/python-net/aspose.threed.render/entityrenderer/initialize/#aspose.threed.render.Renderer) | Initialize the entity renderer |
| [reset_scene_cache](/3d/python-net/aspose.threed.render/entityrenderer/reset_scene_cache/#) | The scene has changed or removed, need to dispose scene-level render resources in this |
| [frame_begin](/3d/python-net/aspose.threed.render/entityrenderer/frame_begin/#aspose.threed.render.Renderer-aspose.threed.render.IRenderQueue) | Begin rendering a frame |
| [frame_end](/3d/python-net/aspose.threed.render/entityrenderer/frame_end/#aspose.threed.render.Renderer-aspose.threed.render.IRenderQueue) | Ends rendering a frame |
| [prepare_render_queue](/3d/python-net/aspose.threed.render/entityrenderer/prepare_render_queue/#aspose.threed.render.Renderer-aspose.threed.render.IRenderQueue-aspose.threed.Node-aspose.threed.Entity) | Prepare rendering commands for specified node/entity pair. |
| [render_entity](/3d/python-net/aspose.threed.render/entityrenderer/render_entity/#aspose.threed.render.Renderer-aspose.threed.render.ICommandList-aspose.threed.Node-any-int) | Each render task pushed to the [`IRenderQueue`](/3d/python-net/aspose.threed.render/irenderqueue) will have a corresponding RenderEntity call<br/>to perform the concrete rendering job. |
| [dispose](/3d/python-net/aspose.threed.render/entityrenderer/dispose/#) | The entity renderer is being disposed, release shared resources. |



### See Also
* module [`aspose.threed.render`](..)
* class [`EntityRenderer`](/3d/python-net/aspose.threed.render/entityrenderer)
* class [`IRenderQueue`](/3d/python-net/aspose.threed.render/irenderqueue)
