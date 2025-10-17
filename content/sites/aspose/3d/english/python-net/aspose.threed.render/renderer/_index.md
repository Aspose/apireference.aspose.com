---
title: Renderer class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 310
url: /python-net/aspose.threed.render/renderer/
is_root: false
---

## Renderer class

The context about renderer.



The Renderer type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [shader_set](/3d/python-net/aspose.threed.render/renderer/shader_set) | Gets or sets the shader set that used to render the scene |
| [variables](/3d/python-net/aspose.threed.render/renderer/variables) | Access to the internal variables used for rendering |
| [preset_shaders](/3d/python-net/aspose.threed.render/renderer/preset_shaders) | Gets or sets the preset shader set |
| [render_factory](/3d/python-net/aspose.threed.render/renderer/render_factory) | Gets the factory to build render-related objects. |
| [asset_directories](/3d/python-net/aspose.threed.render/renderer/asset_directories) | Directories that stored external assets |
| [post_processings](/3d/python-net/aspose.threed.render/renderer/post_processings) | Active post-processing chain |
| [enable_shadows](/3d/python-net/aspose.threed.render/renderer/enable_shadows) | Gets or sets whether to enable shadows. |
| [render_target](/3d/python-net/aspose.threed.render/renderer/render_target) | Specify the render target that the following render operations will be performed on. |
| [node](/3d/python-net/aspose.threed.render/renderer/node) | Gets or sets the [`Renderer.node`](/3d/python-net/aspose.threed.render/renderer#node) instance used to provide world transform matrix. |
| [frustum](/3d/python-net/aspose.threed.render/renderer/frustum) | Gets or sets the frustum that used to provide view matrix. |
| [render_stage](/3d/python-net/aspose.threed.render/renderer/render_stage) | Gets the current render stage. |
| [material](/3d/python-net/aspose.threed.render/renderer/material) | Gets or sets the material that used to provide material information used by shaders. |
| [shader](/3d/python-net/aspose.threed.render/renderer/shader) | Gets or sets the shader instance used for rendering the geometry. |
| [fallback_entity_renderer](/3d/python-net/aspose.threed.render/renderer/fallback_entity_renderer) | Gets or sets the fallback entity renderer when the entity has no special renderer defined. |


### Methods
| Method | Description |
| :- | :- |
| [`clear_cache(self)`](/3d/python-net/aspose.threed.render/renderer/clear_cache/#) | Manually clear the cache.<br/>Aspose.3D will cache some objects like materials/geometries into internal types that compatible with the render pipeline.<br/>This should be manually called when scene has major changes. |
| [`get_post_processing(self, name)`](/3d/python-net/aspose.threed.render/renderer/get_post_processing/#system.string) | Gets a built-in post-processor that supported by the renderer. |
| [`execute(self, post_processing, result)`](/3d/python-net/aspose.threed.render/renderer/execute/#aspose.threed.render.postprocessing-aspose.threed.render.irendertarget) | Execute an post processing on specified render target |
| [`create_renderer()`](/3d/python-net/aspose.threed.render/renderer/create_renderer/#) | Creates a new [`Renderer`](/3d/python-net/aspose.threed.render/renderer) with default profile. |
| [`register_entity_renderer(self, renderer)`](/3d/python-net/aspose.threed.render/renderer/register_entity_renderer/#aspose.threed.render.entityrenderer) | Register the entity renderer for specified entity |
| [`render(self, render_target)`](/3d/python-net/aspose.threed.render/renderer/render/#aspose.threed.render.irendertarget) | Render the specified target |



### See Also
* module [`aspose.threed.render`](..)
* class [`Renderer`](/3d/python-net/aspose.threed.render/renderer)
