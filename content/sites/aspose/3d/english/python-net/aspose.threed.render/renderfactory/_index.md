---
title: RenderFactory class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 270
url: /aspose.threed.render/renderfactory/
is_root: false
---

## RenderFactory class

RenderFactory creates all resources that represented in rendering pipeline.



The RenderFactory type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [create_render_texture](/3d/python-net/aspose.threed.render/renderfactory/create_render_texture/#aspose.threed.render.RenderParameters-int-int-int) | Create a render target that renders to the texture |
| [create_render_texture](/3d/python-net/aspose.threed.render/renderfactory/create_render_texture/#aspose.threed.render.RenderParameters-int-int) | Create a render target contains 1 targets that renders to the texture |
| [create_texture_unit](/3d/python-net/aspose.threed.render/renderfactory/create_texture_unit/#aspose.threed.render.TextureType) | Create a texture unit that can be accessed by shader. |
| [create_texture_unit](/3d/python-net/aspose.threed.render/renderfactory/create_texture_unit/#) | Create a 2D texture unit that can be accessed by shader. |
| [create_descriptor_set](/3d/python-net/aspose.threed.render/renderfactory/create_descriptor_set/#aspose.threed.render.ShaderProgram) | Create the descriptor set for specified shader program. |
| [create_cube_render_texture](/3d/python-net/aspose.threed.render/renderfactory/create_cube_render_texture/#aspose.threed.render.RenderParameters-int-int) | Create a render target contains 1 cube texture |
| [create_render_window](/3d/python-net/aspose.threed.render/renderfactory/create_render_window/#aspose.threed.render.RenderParameters-aspose.threed.render.WindowHandle) | Create a render target that renders to the native window. |
| [create_vertex_buffer](/3d/python-net/aspose.threed.render/renderfactory/create_vertex_buffer/#aspose.threed.utilities.VertexDeclaration) | Create an [`IVertexBuffer`](/3d/python-net/aspose.threed.render/ivertexbuffer) instance to store polygon's vertex information. |
| [create_index_buffer](/3d/python-net/aspose.threed.render/renderfactory/create_index_buffer/#) | Create an [`IIndexBuffer`](/3d/python-net/aspose.threed.render/iindexbuffer) instance to store polygon's face information. |
| [create_shader_program](/3d/python-net/aspose.threed.render/renderfactory/create_shader_program/#aspose.threed.render.ShaderSource) | Create a [`ShaderProgram`](/3d/python-net/aspose.threed.render/shaderprogram) object |
| [create_pipeline](/3d/python-net/aspose.threed.render/renderfactory/create_pipeline/#aspose.threed.render.ShaderProgram-aspose.threed.render.RenderState-aspose.threed.utilities.VertexDeclaration-aspose.threed.render.DrawOperation) | Create a preconfigured graphics pipeline with preconfigured shader/render state/vertex declaration and draw operations. |
| [create_uniform_buffer](/3d/python-net/aspose.threed.render/renderfactory/create_uniform_buffer/#int) | Create a new uniform buffer in GPU side with pre-allocated size. |



### See Also
* module [`aspose.threed.render`](..)
* class [`IIndexBuffer`](/3d/python-net/aspose.threed.render/iindexbuffer)
* class [`IVertexBuffer`](/3d/python-net/aspose.threed.render/ivertexbuffer)
* class [`ShaderProgram`](/3d/python-net/aspose.threed.render/shaderprogram)
