---
title: ICommandList class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.render/icommandlist/
is_root: false
---

## ICommandList class

Encodes a sequence of commands which will be sent to GPU to render.



The ICommandList type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [draw(start, count)](/3d/python-net/aspose.threed.render/icommandlist/draw/#int-int) | Draw without index buffer |
| [draw()](/3d/python-net/aspose.threed.render/icommandlist/draw/#) | Draw without index buffer |
| [draw_index()](/3d/python-net/aspose.threed.render/icommandlist/draw_index/#) | Issue an indexed draw into a command list |
| [draw_index(start, count)](/3d/python-net/aspose.threed.render/icommandlist/draw_index/#int-int) | Issue an indexed draw into a command list |
| [push_constants(stage, data)](/3d/python-net/aspose.threed.render/icommandlist/push_constants/#ShaderStage-bytes) | Push the constant to the pipeline |
| [push_constants(stage, data, size)](/3d/python-net/aspose.threed.render/icommandlist/push_constants/#ShaderStage-bytes-int) | Push the constant to the pipeline |
| [bind_pipeline(pipeline)](/3d/python-net/aspose.threed.render/icommandlist/bind_pipeline/#IPipeline) | Bind the pipeline instance for rendering |
| [bind_vertex_buffer(vertex_buffer)](/3d/python-net/aspose.threed.render/icommandlist/bind_vertex_buffer/#IVertexBuffer) | Bind the vertex buffer for rendering |
| [bind_index_buffer(index_buffer)](/3d/python-net/aspose.threed.render/icommandlist/bind_index_buffer/#IIndexBuffer) | Bind the index buffer for rendering |
| [bind_descriptor_set(descriptor_set)](/3d/python-net/aspose.threed.render/icommandlist/bind_descriptor_set/#IDescriptorSet) | Bind the descriptor set to current pipeline |


### See Also

* module [aspose.threed.render](../)
