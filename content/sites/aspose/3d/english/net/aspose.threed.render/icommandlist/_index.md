---
title: Interface ICommandList
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Render.ICommandList interface. Encodes a sequence of commands which will be sent to GPU to render
type: docs
weight: 2030
url: /net/aspose.threed.render/icommandlist/
---
## ICommandList interface

Encodes a sequence of commands which will be sent to GPU to render.

```csharp
public interface ICommandList
```

## Methods

| Name | Description |
| --- | --- |
| [BindDescriptorSet](../../aspose.threed.render/icommandlist/binddescriptorset/)(IDescriptorSet) | Bind the descriptor set to current pipeline |
| [BindIndexBuffer](../../aspose.threed.render/icommandlist/bindindexbuffer/)(IIndexBuffer) | Bind the index buffer for rendering |
| [BindPipeline](../../aspose.threed.render/icommandlist/bindpipeline/)(IPipeline) | Bind the pipeline instance for rendering |
| [BindVertexBuffer](../../aspose.threed.render/icommandlist/bindvertexbuffer/)(IVertexBuffer) | Bind the vertex buffer for rendering |
| [Draw](../../aspose.threed.render/icommandlist/draw/#draw)() | Draw without index buffer |
| [Draw](../../aspose.threed.render/icommandlist/draw/#draw_1)(int, int) | Draw without index buffer |
| [DrawIndex](../../aspose.threed.render/icommandlist/drawindex/#drawindex)() | Issue an indexed draw into a command list |
| [DrawIndex](../../aspose.threed.render/icommandlist/drawindex/#drawindex_1)(int, int) | Issue an indexed draw into a command list |
| [PushConstants](../../aspose.threed.render/icommandlist/pushconstants/#pushconstants)(ShaderStage, byte[]) | Push the constant to the pipeline |
| [PushConstants](../../aspose.threed.render/icommandlist/pushconstants/#pushconstants_1)(ShaderStage, byte[], int) | Push the constant to the pipeline |

### See Also

* namespace [Aspose.ThreeD.Render](../../aspose.threed.render/)
* assembly [Aspose.3D](../../)


