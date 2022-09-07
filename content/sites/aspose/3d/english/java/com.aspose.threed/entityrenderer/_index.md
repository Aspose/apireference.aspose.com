---
title: EntityRenderer
second_title: Aspose.3D for Java API Reference
description: Subclass this to implement rendering for different kind of entities.
type: docs
weight: 50
url: /java/com.aspose.threed/entityrenderer/
---

**Inheritance:**
java.lang.Object
```
public class EntityRenderer
```

Subclass this to implement rendering for different kind of entities.
## Constructors

| Constructor | Description |
| --- | --- |
| [EntityRenderer(String key, byte features)](#EntityRenderer-java.lang.String-byte-) | Constructor of com.aspose.threed.EntityRenderer |
| [EntityRenderer(String key)](#EntityRenderer-java.lang.String-) | Constructor of com.aspose.threed.EntityRenderer |
## Methods

| Method | Description |
| --- | --- |
| [initialize(Renderer renderer)](#initialize-com.aspose.threed.Renderer-) | Initialize the entity renderer |
| [resetSceneCache()](#resetSceneCache--) | The scene has changed or removed, need to dispose scene-level render resources in this |
| [frameBegin(Renderer renderer, IRenderQueue renderQueue)](#frameBegin-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-) | Begin rendering a frame |
| [frameEnd(Renderer renderer, IRenderQueue renderQueue)](#frameEnd-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-) | Ends rendering a frame |
| [prepareRenderQueue(Renderer renderer, IRenderQueue queue, Node node, Entity entity)](#prepareRenderQueue-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-com.aspose.threed.Node-com.aspose.threed.Entity-) | Prepare rendering commands for specified node/entity pair. |
| [renderEntity(Renderer renderer, ICommandList commandList, Node node, Object renderableResource, int subEntity)](#renderEntity-com.aspose.threed.Renderer-com.aspose.threed.ICommandList-com.aspose.threed.Node-java.lang.Object-int-) | Each render task pushed to the com.aspose.threed.IRenderQueue will have a corresponding RenderEntity call to perform the concrete rendering job. |
| [dispose()](#dispose--) | The entity renderer is being disposed, release shared resources. |
### EntityRenderer(String key, byte features) {#EntityRenderer-java.lang.String-byte-}
```
public EntityRenderer(String key, byte features)
```


Constructor of com.aspose.threed.EntityRenderer

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The key of the entity renderer |
| features | byte | The extra features of the entity renderer |

### EntityRenderer(String key) {#EntityRenderer-java.lang.String-}
```
public EntityRenderer(String key)
```


Constructor of com.aspose.threed.EntityRenderer

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| key | java.lang.String | The key of the entity renderer |

### initialize(Renderer renderer) {#initialize-com.aspose.threed.Renderer-}
```
public void initialize(Renderer renderer)
```


Initialize the entity renderer

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) |  |

### resetSceneCache() {#resetSceneCache--}
```
public void resetSceneCache()
```


The scene has changed or removed, need to dispose scene-level render resources in this

### frameBegin(Renderer renderer, IRenderQueue renderQueue) {#frameBegin-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-}
```
public void frameBegin(Renderer renderer, IRenderQueue renderQueue)
```


Begin rendering a frame

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) | Current renderer |
| renderQueue | [IRenderQueue](../../com.aspose.threed/irenderqueue) | Render queue |

### frameEnd(Renderer renderer, IRenderQueue renderQueue) {#frameEnd-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-}
```
public void frameEnd(Renderer renderer, IRenderQueue renderQueue)
```


Ends rendering a frame

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) | Current renderer |
| renderQueue | [IRenderQueue](../../com.aspose.threed/irenderqueue) | Render queue |

### prepareRenderQueue(Renderer renderer, IRenderQueue queue, Node node, Entity entity) {#prepareRenderQueue-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-com.aspose.threed.Node-com.aspose.threed.Entity-}
```
public void prepareRenderQueue(Renderer renderer, IRenderQueue queue, Node node, Entity entity)
```


Prepare rendering commands for specified node/entity pair.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) | The current renderer instance |
| queue | [IRenderQueue](../../com.aspose.threed/irenderqueue) | The render queue used to manage render tasks |
| node | [Node](../../com.aspose.threed/node) | Current node |
| entity | [Entity](../../com.aspose.threed/entity) | The entity that need to be rendered |

### renderEntity(Renderer renderer, ICommandList commandList, Node node, Object renderableResource, int subEntity) {#renderEntity-com.aspose.threed.Renderer-com.aspose.threed.ICommandList-com.aspose.threed.Node-java.lang.Object-int-}
```
public void renderEntity(Renderer renderer, ICommandList commandList, Node node, Object renderableResource, int subEntity)
```


Each render task pushed to the com.aspose.threed.IRenderQueue will have a corresponding RenderEntity call to perform the concrete rendering job.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) | The renderer |
| commandList | [ICommandList](../../com.aspose.threed/icommandlist) | The commandList used to record the rendering commands |
| node | [Node](../../com.aspose.threed/node) | The same node that passed to PrepareRenderQueue of the entity that will be rendered |
| renderableResource | java.lang.Object | The custom object that passed to IRenderQueue during the PrepareRenderQueue |
| subEntity | int | The index of the sub entity that passed to IRenderQueue |

### dispose() {#dispose--}
```
public void dispose()
```


The entity renderer is being disposed, release shared resources.

