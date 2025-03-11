---
title: RenderFactory class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 270
url: /python-net/aspose.threed.render/renderfactory/
is_root: false
---

## RenderFactory class

RenderFactory creates all resources that represented in rendering pipeline.



The RenderFactory type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [`create_render_texture(self, parameters, targets, width, height)`](/3d/python-net/aspose.threed.render/renderfactory/create_render_texture/#aspose.threed.render.renderparameters-int-int-int) | Create a render target that renders to the texture |
| [`create_render_texture(self, parameters, width, height)`](/3d/python-net/aspose.threed.render/renderfactory/create_render_texture/#aspose.threed.render.renderparameters-int-int) | Create a render target contains 1 targets that renders to the texture |
| [`create_texture_unit(self, texture_type)`](/3d/python-net/aspose.threed.render/renderfactory/create_texture_unit/#aspose.threed.render.texturetype) | Create a texture unit that can be accessed by shader. |
| [`create_texture_unit(self)`](/3d/python-net/aspose.threed.render/renderfactory/create_texture_unit/#) | Create a 2D texture unit that can be accessed by shader. |
| [`create_descriptor_set(self, shader)`](/3d/python-net/aspose.threed.render/renderfactory/create_descriptor_set/#aspose.threed.render.shaderprogram) | Create the descriptor set for specified shader program. |
| [`create_cube_render_texture(self, parameters, width, height)`](/3d/python-net/aspose.threed.render/renderfactory/create_cube_render_texture/#aspose.threed.render.renderparameters-int-int) | Create a render target contains 1 cube texture |
| [`create_render_window(self, parameters, handle)`](/3d/python-net/aspose.threed.render/renderfactory/create_render_window/#aspose.threed.render.renderparameters-aspose.threed.render.windowhandle) | Create a render target that renders to the native window. |
| [`create_vertex_buffer(self, declaration)`](/3d/python-net/aspose.threed.render/renderfactory/create_vertex_buffer/#aspose.threed.utilities.vertexdeclaration) | Create an [`IVertexBuffer`](/3d/python-net/aspose.threed.render/ivertexbuffer) instance to store polygon's vertex information. |
| [`create_index_buffer(self)`](/3d/python-net/aspose.threed.render/renderfactory/create_index_buffer/#) | Create an [`IIndexBuffer`](/3d/python-net/aspose.threed.render/iindexbuffer) instance to store polygon's face information. |
| [`create_shader_program(self, shader_source)`](/3d/python-net/aspose.threed.render/renderfactory/create_shader_program/#aspose.threed.render.shadersource) | Create a [`ShaderProgram`](/3d/python-net/aspose.threed.render/shaderprogram) object |
| [`create_pipeline(self, shader, render_state, vertex_declaration, draw_operation)`](/3d/python-net/aspose.threed.render/renderfactory/create_pipeline/#aspose.threed.render.shaderprogram-aspose.threed.render.renderstate-aspose.threed.utilities.vertexdeclaration-aspose.threed.render.drawoperation) | Create a preconfigured graphics pipeline with preconfigured shader/render state/vertex declaration and draw operations. |
| [`create_uniform_buffer(self, size)`](/3d/python-net/aspose.threed.render/renderfactory/create_uniform_buffer/#int) | Create a new uniform buffer in GPU side with pre-allocated size. |



### See Also
* module [`aspose.threed.render`](..)
* class [`IIndexBuffer`](/3d/python-net/aspose.threed.render/iindexbuffer)
* class [`IVertexBuffer`](/3d/python-net/aspose.threed.render/ivertexbuffer)
* class [`ShaderProgram`](/3d/python-net/aspose.threed.render/shaderprogram)
