---
title: EntityRenderer 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/entityrenderer/
---
## EntityRenderer class

  Subclass this to implement rendering for different kind of entities.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(key, features) | Constructor of EntityRenderer | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| key | String | The key of the entity renderer |
| features | byte | EntityRendererFeatures |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(key) | Constructor of EntityRenderer | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| key | String | The key of the entity renderer |

 **Result:**



---


### initialize{#initialize}

| Name | Description |
| --- | --- |
| initialize(renderer) | Initialize the entity renderer | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  rendere | Renderer | null |

 **Result:**



---


### resetSceneCache{#resetSceneCache}

| Name | Description |
| --- | --- |
| resetSceneCache() | The scene has changed or removed, need to dispose scene-level render resources in this | 

 **Result:**



---


### frameBegin{#frameBegin}

| Name | Description |
| --- | --- |
| frameBegin(renderer, renderQueue) | Begin rendering a frame | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| renderer | Renderer | Current renderer |
| renderQueue | IRenderQueue | Render queue |

 **Result:**



---


### frameEnd{#frameEnd}

| Name | Description |
| --- | --- |
| frameEnd(renderer, renderQueue) | Ends rendering a frame | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| renderer | Renderer | Current renderer |
| renderQueue | IRenderQueue | Render queue |

 **Result:**



---


### prepareRenderQueue{#prepareRenderQueue}

| Name | Description |
| --- | --- |
| prepareRenderQueue(renderer, queue, node, entity) | Prepare rendering commands for specified node/entity pair. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| renderer | Renderer | The current renderer instance |
| queue | IRenderQueue | The render queue used to manage render tasks |
| node | Node | Current node |
| entity | Entity | The entity that need to be rendered |

 **Result:**



---


### renderEntity{#renderEntity}

| Name | Description |
| --- | --- |
| renderEntity(renderer, commandList, node, renderableResource, subEntity) | Each render task pushed to the com.aspose.threed.IRenderQueue will have a corresponding RenderEntity call to perform the concrete rendering job. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| renderer | Renderer | The renderer |
| commandList | ICommandList | The commandList used to record the rendering commands |
| node | Node | The same node that passed to PrepareRenderQueue of the entity that will be rendered |
| renderableResource | Object | The custom object that passed to IRenderQueue during the PrepareRenderQueue |
| subEntity | Number | The index of the sub entity that passed to IRenderQueue |

 **Result:**



---


### dispose{#dispose}

| Name | Description |
| --- | --- |
| dispose() | The entity renderer is being disposed, release shared resources. | 

 **Result:**



---



