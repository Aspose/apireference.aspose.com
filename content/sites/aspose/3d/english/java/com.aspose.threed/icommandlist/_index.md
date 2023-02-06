---
title: ICommandList
second_title: Aspose.3D for Java API Reference
description: Encodes a sequence of commands which will be sent to GPU to render.
type: docs
weight: 217
url: /java/com.aspose.threed/icommandlist/
---
```
public interface ICommandList
```

Encodes a sequence of commands which will be sent to GPU to render.
## Methods

| Method | Description |
| --- | --- |
| [bindDescriptorSet(IDescriptorSet descriptorSet)](#bindDescriptorSet-com.aspose.threed.IDescriptorSet-) | Bind the descriptor set to current pipeline |
| [bindIndexBuffer(IIndexBuffer indexBuffer)](#bindIndexBuffer-com.aspose.threed.IIndexBuffer-) | Bind the index buffer for rendering |
| [bindPipeline(IPipeline pipeline)](#bindPipeline-com.aspose.threed.IPipeline-) | Bind the pipeline instance for rendering |
| [bindVertexBuffer(IVertexBuffer vertexBuffer)](#bindVertexBuffer-com.aspose.threed.IVertexBuffer-) | Bind the vertex buffer for rendering |
| [draw()](#draw--) | Draw without index buffer |
| [draw(int start, int count)](#draw-int-int-) | Draw without index buffer |
| [drawIndex()](#drawIndex--) | Issue an indexed draw into a command list |
| [drawIndex(int start, int count)](#drawIndex-int-int-) | Issue an indexed draw into a command list |
| [pushConstants(int stage, byte[] data)](#pushConstants-int-byte---) | Push the constant to the pipeline |
| [pushConstants(int stage, byte[] data, int size)](#pushConstants-int-byte---int-) | Push the constant to the pipeline |
### bindDescriptorSet(IDescriptorSet descriptorSet) {#bindDescriptorSet-com.aspose.threed.IDescriptorSet-}
```
public abstract void bindDescriptorSet(IDescriptorSet descriptorSet)
```


Bind the descriptor set to current pipeline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| descriptorSet | [IDescriptorSet](../../com.aspose.threed/idescriptorset) |  |

### bindIndexBuffer(IIndexBuffer indexBuffer) {#bindIndexBuffer-com.aspose.threed.IIndexBuffer-}
```
public abstract void bindIndexBuffer(IIndexBuffer indexBuffer)
```


Bind the index buffer for rendering

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| indexBuffer | [IIndexBuffer](../../com.aspose.threed/iindexbuffer) |  |

### bindPipeline(IPipeline pipeline) {#bindPipeline-com.aspose.threed.IPipeline-}
```
public abstract void bindPipeline(IPipeline pipeline)
```


Bind the pipeline instance for rendering

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pipeline | [IPipeline](../../com.aspose.threed/ipipeline) |  |

### bindVertexBuffer(IVertexBuffer vertexBuffer) {#bindVertexBuffer-com.aspose.threed.IVertexBuffer-}
```
public abstract void bindVertexBuffer(IVertexBuffer vertexBuffer)
```


Bind the vertex buffer for rendering

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vertexBuffer | [IVertexBuffer](../../com.aspose.threed/ivertexbuffer) |  |

### draw() {#draw--}
```
public abstract void draw()
```


Draw without index buffer

### draw(int start, int count) {#draw-int-int-}
```
public abstract void draw(int start, int count)
```


Draw without index buffer

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| start | int |  |
| count | int |  |

### drawIndex() {#drawIndex--}
```
public abstract void drawIndex()
```


Issue an indexed draw into a command list

### drawIndex(int start, int count) {#drawIndex-int-int-}
```
public abstract void drawIndex(int start, int count)
```


Issue an indexed draw into a command list

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| start | int | The first index to draw |
| count | int | The count of indices to draw |

### pushConstants(int stage, byte[] data) {#pushConstants-int-byte---}
```
public abstract void pushConstants(int stage, byte[] data)
```


Push the constant to the pipeline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stage | int | Which shader stage will consume the constant data |
| data | byte[] | The data that will be sent to the shader |

### pushConstants(int stage, byte[] data, int size) {#pushConstants-int-byte---int-}
```
public abstract void pushConstants(int stage, byte[] data, int size)
```


Push the constant to the pipeline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stage | int | Which shader stage will consume the constant data |
| data | byte[] | The data that will be sent to the shader |
| size | int | Bytes to write to the pipeline |

