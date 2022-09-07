---
title: Renderer
second_title: Aspose.3D for Java API Reference
description: The context about renderer.
type: docs
weight: 137
url: /java/com.aspose.threed/renderer/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public abstract class Renderer implements Closeable
```

The context about renderer.
## Methods

| Method | Description |
| --- | --- |
| [clearCache()](#clearCache--) | Manually clear the cache. |
| [getShaderSet()](#getShaderSet--) | Gets the shader set that used to render the scene |
| [setShaderSet(ShaderSet value)](#setShaderSet-com.aspose.threed.ShaderSet-) | Sets the shader set that used to render the scene |
| [getVariables()](#getVariables--) | Access to the internal variables used for rendering |
| [getPresetShaders()](#getPresetShaders--) | Gets the preset shader set |
| [setPresetShaders(PresetShaders value)](#setPresetShaders-com.aspose.threed.PresetShaders-) | Sets the preset shader set |
| [getRenderFactory()](#getRenderFactory--) | Gets the factory to build render-related objects. |
| [getAssetDirectories()](#getAssetDirectories--) | Directories that stored external assets |
| [getPostProcessings()](#getPostProcessings--) | Active post-processing chain |
| [getPostProcessing(String name)](#getPostProcessing-java.lang.String-) | Gets a built-in post-processor that supported by the renderer. |
| [execute(PostProcessing postProcessing, IRenderTarget result)](#execute-com.aspose.threed.PostProcessing-com.aspose.threed.IRenderTarget-) | Execute an post processing on specified render target |
| [getEnableShadows()](#getEnableShadows--) | Gets whether to enable shadows. |
| [setEnableShadows(boolean value)](#setEnableShadows-boolean-) | Sets whether to enable shadows. |
| [getRenderTarget()](#getRenderTarget--) | Specify the render target that the following render operations will be performed on. |
| [getNode()](#getNode--) | Gets the com.aspose.threed.Renderer\#getNode instance used to provide world transform matrix. |
| [setNode(Node value)](#setNode-com.aspose.threed.Node-) | Sets the com.aspose.threed.Renderer\#getNode instance used to provide world transform matrix. |
| [getFrustum()](#getFrustum--) | Gets the frustum that used to provide view matrix. |
| [setFrustum(Frustum value)](#setFrustum-com.aspose.threed.Frustum-) | Sets the frustum that used to provide view matrix. |
| [getRenderStage()](#getRenderStage--) | Gets the current render stage. |
| [getMaterial()](#getMaterial--) | Gets the material that used to provide material information used by shaders. |
| [setMaterial(Material value)](#setMaterial-com.aspose.threed.Material-) | Sets the material that used to provide material information used by shaders. |
| [getShader()](#getShader--) | Gets the shader instance used for rendering the geometry. |
| [setShader(ShaderProgram value)](#setShader-com.aspose.threed.ShaderProgram-) | Sets the shader instance used for rendering the geometry. |
| [createRenderer()](#createRenderer--) | Creates a new com.aspose.threed.Renderer with default profile. |
| [getFallbackEntityRenderer()](#getFallbackEntityRenderer--) | Gets the fallback entity renderer when the entity has no special renderer defined. |
| [setFallbackEntityRenderer(EntityRenderer value)](#setFallbackEntityRenderer-com.aspose.threed.EntityRenderer-) | Sets the fallback entity renderer when the entity has no special renderer defined. |
| [registerEntityRenderer(EntityRenderer renderer)](#registerEntityRenderer-com.aspose.threed.EntityRenderer-) | Register the entity renderer for specified entity |
| [render(IRenderTarget renderTarget)](#render-com.aspose.threed.IRenderTarget-) | Render the specified target |
| [close()](#close--) | Dispose the com.aspose.threed.Renderer and all related resources |
### clearCache() {#clearCache--}
```
public void clearCache()
```


Manually clear the cache. Aspose.3D will cache some objects like materials/geometries into internal types that compatible with the render pipeline. This should be manually called when scene has major changes.

### getShaderSet() {#getShaderSet--}
```
public ShaderSet getShaderSet()
```


Gets the shader set that used to render the scene

**Returns:**
[ShaderSet](../../com.aspose.threed/shaderset)
### setShaderSet(ShaderSet value) {#setShaderSet-com.aspose.threed.ShaderSet-}
```
public void setShaderSet(ShaderSet value)
```


Sets the shader set that used to render the scene

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderSet](../../com.aspose.threed/shaderset) | New value |

### getVariables() {#getVariables--}
```
public RendererVariableManager getVariables()
```


Access to the internal variables used for rendering

**Returns:**
[RendererVariableManager](../../com.aspose.threed/renderervariablemanager)
### getPresetShaders() {#getPresetShaders--}
```
public PresetShaders getPresetShaders()
```


Gets the preset shader set

**Returns:**
[PresetShaders](../../com.aspose.threed/presetshaders)
### setPresetShaders(PresetShaders value) {#setPresetShaders-com.aspose.threed.PresetShaders-}
```
public void setPresetShaders(PresetShaders value)
```


Sets the preset shader set

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PresetShaders](../../com.aspose.threed/presetshaders) | New value |

### getRenderFactory() {#getRenderFactory--}
```
public abstract RenderFactory getRenderFactory()
```


Gets the factory to build render-related objects.

**Returns:**
[RenderFactory](../../com.aspose.threed/renderfactory)
### getAssetDirectories() {#getAssetDirectories--}
```
public ArrayList<String> getAssetDirectories()
```


Directories that stored external assets

**Returns:**
java.util.ArrayList<java.lang.String>
### getPostProcessings() {#getPostProcessings--}
```
public List<PostProcessing> getPostProcessings()
```


Active post-processing chain

**Returns:**
java.util.List<com.aspose.threed.PostProcessing>
### getPostProcessing(String name) {#getPostProcessing-java.lang.String-}
```
public PostProcessing getPostProcessing(String name)
```


Gets a built-in post-processor that supported by the renderer.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[PostProcessing](../../com.aspose.threed/postprocessing)
### execute(PostProcessing postProcessing, IRenderTarget result) {#execute-com.aspose.threed.PostProcessing-com.aspose.threed.IRenderTarget-}
```
public abstract void execute(PostProcessing postProcessing, IRenderTarget result)
```


Execute an post processing on specified render target

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| postProcessing | [PostProcessing](../../com.aspose.threed/postprocessing) |  |
| result | [IRenderTarget](../../com.aspose.threed/irendertarget) |  |

### getEnableShadows() {#getEnableShadows--}
```
public boolean getEnableShadows()
```


Gets whether to enable shadows.

**Returns:**
boolean
### setEnableShadows(boolean value) {#setEnableShadows-boolean-}
```
public void setEnableShadows(boolean value)
```


Sets whether to enable shadows.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getRenderTarget() {#getRenderTarget--}
```
public IRenderTarget getRenderTarget()
```


Specify the render target that the following render operations will be performed on.

**Returns:**
[IRenderTarget](../../com.aspose.threed/irendertarget)
### getNode() {#getNode--}
```
public Node getNode()
```


Gets the com.aspose.threed.Renderer\#getNode instance used to provide world transform matrix.

**Returns:**
[Node](../../com.aspose.threed/node)
### setNode(Node value) {#setNode-com.aspose.threed.Node-}
```
public void setNode(Node value)
```


Sets the com.aspose.threed.Renderer\#getNode instance used to provide world transform matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

### getFrustum() {#getFrustum--}
```
public Frustum getFrustum()
```


Gets the frustum that used to provide view matrix.

**Returns:**
[Frustum](../../com.aspose.threed/frustum)
### setFrustum(Frustum value) {#setFrustum-com.aspose.threed.Frustum-}
```
public void setFrustum(Frustum value)
```


Sets the frustum that used to provide view matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Frustum](../../com.aspose.threed/frustum) | New value |

### getRenderStage() {#getRenderStage--}
```
public RenderStage getRenderStage()
```


Gets the current render stage.

**Returns:**
[RenderStage](../../com.aspose.threed/renderstage)
### getMaterial() {#getMaterial--}
```
public Material getMaterial()
```


Gets the material that used to provide material information used by shaders.

**Returns:**
[Material](../../com.aspose.threed/material)
### setMaterial(Material value) {#setMaterial-com.aspose.threed.Material-}
```
public void setMaterial(Material value)
```


Sets the material that used to provide material information used by shaders.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Material](../../com.aspose.threed/material) | New value |

### getShader() {#getShader--}
```
public ShaderProgram getShader()
```


Gets the shader instance used for rendering the geometry.

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram)
### setShader(ShaderProgram value) {#setShader-com.aspose.threed.ShaderProgram-}
```
public void setShader(ShaderProgram value)
```


Sets the shader instance used for rendering the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### createRenderer() {#createRenderer--}
```
public static Renderer createRenderer()
```


Creates a new com.aspose.threed.Renderer with default profile.

**Returns:**
[Renderer](../../com.aspose.threed/renderer)
### getFallbackEntityRenderer() {#getFallbackEntityRenderer--}
```
public EntityRenderer getFallbackEntityRenderer()
```


Gets the fallback entity renderer when the entity has no special renderer defined.

**Returns:**
[EntityRenderer](../../com.aspose.threed/entityrenderer)
### setFallbackEntityRenderer(EntityRenderer value) {#setFallbackEntityRenderer-com.aspose.threed.EntityRenderer-}
```
public void setFallbackEntityRenderer(EntityRenderer value)
```


Sets the fallback entity renderer when the entity has no special renderer defined.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EntityRenderer](../../com.aspose.threed/entityrenderer) | New value |

### registerEntityRenderer(EntityRenderer renderer) {#registerEntityRenderer-com.aspose.threed.EntityRenderer-}
```
public void registerEntityRenderer(EntityRenderer renderer)
```


Register the entity renderer for specified entity

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| renderer | [EntityRenderer](../../com.aspose.threed/entityrenderer) |  |

### render(IRenderTarget renderTarget) {#render-com.aspose.threed.IRenderTarget-}
```
public void render(IRenderTarget renderTarget)
```


Render the specified target

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| renderTarget | [IRenderTarget](../../com.aspose.threed/irendertarget) |  |

### close() {#close--}
```
public void close()
```


Dispose the com.aspose.threed.Renderer and all related resources

