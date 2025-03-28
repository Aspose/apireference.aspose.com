---
title: Class EntityRenderer
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Render.EntityRenderer class. Subclass this to implement rendering for different kind of entities
type: docs
weight: 1870
url: /net/aspose.threed.render/entityrenderer/
---
## EntityRenderer class

Subclass this to implement rendering for different kind of entities.

```csharp
public class EntityRenderer
```

## Constructors

| Name | Description |
| --- | --- |
| [EntityRenderer](entityrenderer/#constructor)(string) | Constructor of `EntityRenderer` |
| [EntityRenderer](entityrenderer/#constructor_1)(string, EntityRendererFeatures) | Constructor of `EntityRenderer` |

## Methods

| Name | Description |
| --- | --- |
| virtual [Dispose](../../aspose.threed.render/entityrenderer/dispose/)() | The entity renderer is being disposed, release shared resources. |
| virtual [FrameBegin](../../aspose.threed.render/entityrenderer/framebegin/)(Renderer, IRenderQueue) | Begin rendering a frame |
| virtual [FrameEnd](../../aspose.threed.render/entityrenderer/frameend/)(Renderer, IRenderQueue) | Ends rendering a frame |
| virtual [Initialize](../../aspose.threed.render/entityrenderer/initialize/)(Renderer) | Initialize the entity renderer |
| virtual [PrepareRenderQueue](../../aspose.threed.render/entityrenderer/preparerenderqueue/)(Renderer, IRenderQueue, Node, Entity) | Prepare rendering commands for specified node/entity pair. |
| virtual [RenderEntity](../../aspose.threed.render/entityrenderer/renderentity/)(Renderer, ICommandList, Node, object, int) | Each render task pushed to the [`IRenderQueue`](../irenderqueue/) will have a corresponding RenderEntity call to perform the concrete rendering job. |
| virtual [ResetSceneCache](../../aspose.threed.render/entityrenderer/resetscenecache/)() | The scene has changed or removed, need to dispose scene-level render resources in this |

### See Also

* namespace [Aspose.ThreeD.Render](../../aspose.threed.render/)
* assembly [Aspose.3D](../../)


