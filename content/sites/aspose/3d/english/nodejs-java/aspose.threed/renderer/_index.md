---
title: Renderer 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/renderer/
---
## Renderer class

  The context about renderer.  @hideconstructor


## Methods

### getShaderSet{#getShaderSet}

| Name | Description |
| --- | --- |
| getShaderSet() | Gets or sets the shader set that used to render the scene | 

 **Result:**



---


### setShaderSet{#setShaderSet}

| Name | Description |
| --- | --- |
| setShaderSet(value) | Gets or sets the shader set that used to render the scene | 

 **Result:**



---


### getVariables{#getVariables}

| Name | Description |
| --- | --- |
| getVariables() | Access to the internal variables used for rendering | 

 **Result:**



---


### getPresetShaders{#getPresetShaders}

| Name | Description |
| --- | --- |
| getPresetShaders() | Gets or sets the preset shader set The value of the property is PresetShaders integer constant. | 

 **Result:**



---


### setPresetShaders{#setPresetShaders}

| Name | Description |
| --- | --- |
| setPresetShaders(value) | Gets or sets the preset shader set The value of the property is PresetShaders integer constant. | 

 **Result:**



---


### getRenderFactory{#getRenderFactory}

| Name | Description |
| --- | --- |
| getRenderFactory() | Gets the factory to build render-related objects. | 

 **Result:**



---


### getAssetDirectories{#getAssetDirectories}

| Name | Description |
| --- | --- |
| getAssetDirectories() | Directories that stored external assets | 

 **Result:**



---


### getPostProcessings{#getPostProcessings}

| Name | Description |
| --- | --- |
| getPostProcessings() | Active post-processing chain | 

 **Result:**



---


### getEnableShadows{#getEnableShadows}

| Name | Description |
| --- | --- |
| getEnableShadows() | Gets or sets whether to enable shadows. | 

 **Result:**



---


### setEnableShadows{#setEnableShadows}

| Name | Description |
| --- | --- |
| setEnableShadows(value) | Gets or sets whether to enable shadows. | 

 **Result:**



---


### getRenderTarget{#getRenderTarget}

| Name | Description |
| --- | --- |
| getRenderTarget() | Specify the render target that the following render operations will be performed on. | 

 **Result:**



---


### getNode{#getNode}

| Name | Description |
| --- | --- |
| getNode() | Gets or sets the Node instance used to provide world transform matrix. | 

 **Result:**



---


### setNode{#setNode}

| Name | Description |
| --- | --- |
| setNode(value) | Gets or sets the Node instance used to provide world transform matrix. | 

 **Result:**



---


### getFrustum{#getFrustum}

| Name | Description |
| --- | --- |
| getFrustum() | Gets or sets the frustum that used to provide view matrix. | 

 **Result:**



---


### setFrustum{#setFrustum}

| Name | Description |
| --- | --- |
| setFrustum(value) | Gets or sets the frustum that used to provide view matrix. | 

 **Result:**



---


### getRenderStage{#getRenderStage}

| Name | Description |
| --- | --- |
| getRenderStage() | Gets the current render stage. The value of the property is RenderStage integer constant. | 

 **Result:**



---


### getMaterial{#getMaterial}

| Name | Description |
| --- | --- |
| getMaterial() | Gets or sets the material that used to provide material information used by shaders. | 

 **Result:**



---


### setMaterial{#setMaterial}

| Name | Description |
| --- | --- |
| setMaterial(value) | Gets or sets the material that used to provide material information used by shaders. | 

 **Result:**



---


### getShader{#getShader}

| Name | Description |
| --- | --- |
| getShader() | Gets or sets the shader instance used for rendering the geometry. | 

 **Result:**



---


### setShader{#setShader}

| Name | Description |
| --- | --- |
| setShader(value) | Gets or sets the shader instance used for rendering the geometry. | 

 **Result:**



---


### getFallbackEntityRenderer{#getFallbackEntityRenderer}

| Name | Description |
| --- | --- |
| getFallbackEntityRenderer() | Gets or sets the fallback entity renderer when the entity has no special renderer defined. | 

 **Result:**



---


### setFallbackEntityRenderer{#setFallbackEntityRenderer}

| Name | Description |
| --- | --- |
| setFallbackEntityRenderer(value) | Gets or sets the fallback entity renderer when the entity has no special renderer defined. | 

 **Result:**



---


### clearCache{#clearCache}

| Name | Description |
| --- | --- |
| clearCache() | Manually clear the cache. Aspose.3D will cache some objects like materials/geometries into internal types that compatible with the render pipeline. This should be manually called when scene has major changes. | 

 **Result:**



---


### getPostProcessing{#getPostProcessing}

| Name | Description |
| --- | --- |
| getPostProcessing(name) | Gets a built-in post-processor that supported by the renderer. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  nam | String | null |

 **Result:**
PostProcessing


---


### execute{#execute}

| Name | Description |
| --- | --- |
| execute(postProcessing, result) | Execute an post processing on specified render target | 

 **Result:**
PostProcessing


---


### createRenderer{#createRenderer}

| Name | Description |
| --- | --- |
| createRenderer() | Creates a new Renderer with default profile. | 

 **Result:**
Renderer


---


### registerEntityRenderer{#registerEntityRenderer}

| Name | Description |
| --- | --- |
| registerEntityRenderer(renderer) | Register the entity renderer for specified entity | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  rendere | EntityRenderer | null |

 **Result:**
Renderer


---


### render{#render}

| Name | Description |
| --- | --- |
| render(renderTarget) | Render the specified target | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  renderTarge | IRenderTarget | null |

 **Result:**
Renderer


---



