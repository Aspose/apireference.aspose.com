---
title: Class Renderer
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Render.Renderer class. The context about renderer
type: docs
weight: 2240
url: /net/aspose.threed.render/renderer/
---
## Renderer class

The context about renderer.

```csharp
public abstract class Renderer : IDisposable
```

## Properties

| Name | Description |
| --- | --- |
| [AssetDirectories](../../aspose.threed.render/renderer/assetdirectories/) { get; } | Directories that stored external assets |
| [EnableShadows](../../aspose.threed.render/renderer/enableshadows/) { get; set; } | Gets or sets whether to enable shadows. |
| [FallbackEntityRenderer](../../aspose.threed.render/renderer/fallbackentityrenderer/) { get; set; } | Gets or sets the fallback entity renderer when the entity has no special renderer defined. |
| virtual [Frustum](../../aspose.threed.render/renderer/frustum/) { get; set; } | Gets or sets the frustum that used to provide view matrix. |
| virtual [Material](../../aspose.threed.render/renderer/material/) { get; set; } | Gets or sets the material that used to provide material information used by shaders. |
| [Node](../../aspose.threed.render/renderer/node/) { get; set; } | Gets or sets the [`Node`](./node/) instance used to provide world transform matrix. |
| [PostProcessings](../../aspose.threed.render/renderer/postprocessings/) { get; } | Active post-processing chain |
| [PresetShaders](../../aspose.threed.render/renderer/presetshaders/) { get; set; } | Gets or sets the preset shader set |
| abstract [RenderFactory](../../aspose.threed.render/renderer/renderfactory/) { get; } | Gets the factory to build render-related objects. |
| [RenderStage](../../aspose.threed.render/renderer/renderstage/) { get; } | Gets the current render stage. |
| [RenderTarget](../../aspose.threed.render/renderer/rendertarget/) { get; } | Specify the render target that the following render operations will be performed on. |
| [Shader](../../aspose.threed.render/renderer/shader/) { get; set; } | Gets or sets the shader instance used for rendering the geometry. |
| [ShaderSet](../../aspose.threed.render/renderer/shaderset/) { get; set; } | Gets or sets the shader set that used to render the scene |
| [Variables](../../aspose.threed.render/renderer/variables/) { get; } | Access to the internal variables used for rendering |

## Methods

| Name | Description |
| --- | --- |
| static [CreateRenderer](../../aspose.threed.render/renderer/createrenderer/)() | Creates a new `Renderer` with default profile. |
| virtual [ClearCache](../../aspose.threed.render/renderer/clearcache/)() | Manually clear the cache. Aspose.3D will cache some objects like materials/geometries into internal types that compatible with the render pipeline. This should be manually called when scene has major changes. |
| [Dispose](../../aspose.threed.render/renderer/dispose/)() | Dispose the `Renderer` and all related resources |
| abstract [Execute](../../aspose.threed.render/renderer/execute/)(PostProcessing, IRenderTarget) | Execute an post processing on specified render target |
| [GetPostProcessing](../../aspose.threed.render/renderer/getpostprocessing/)(string) | Gets a built-in post-processor that supported by the renderer. |
| virtual [RegisterEntityRenderer](../../aspose.threed.render/renderer/registerentityrenderer/)(EntityRenderer) | Register the entity renderer for specified entity |
| virtual [Render](../../aspose.threed.render/renderer/render/)(IRenderTarget) | Render the specified target |

### See Also

* namespace [Aspose.ThreeD.Render](../../aspose.threed.render/)
* assembly [Aspose.3D](../../)


