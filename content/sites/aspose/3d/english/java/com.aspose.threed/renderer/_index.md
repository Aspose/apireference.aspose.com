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
| [close()](#close--) | Dispose the [Renderer](../../com.aspose.threed/renderer) and all related resources |
| [createRenderer()](#createRenderer--) | Creates a new [Renderer](../../com.aspose.threed/renderer) with default profile. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [execute(PostProcessing postProcessing, IRenderTarget result)](#execute-com.aspose.threed.PostProcessing-com.aspose.threed.IRenderTarget-) | Execute an post processing on specified render target |
| [getAssetDirectories()](#getAssetDirectories--) | Directories that stored external assets |
| [getClass()](#getClass--) |  |
| [getEnableShadows()](#getEnableShadows--) | Gets whether to enable shadows. |
| [getFallbackEntityRenderer()](#getFallbackEntityRenderer--) | Gets the fallback entity renderer when the entity has no special renderer defined. |
| [getFrustum()](#getFrustum--) | Gets the frustum that used to provide view matrix. |
| [getMaterial()](#getMaterial--) | Gets the material that used to provide material information used by shaders. |
| [getNode()](#getNode--) | Gets the [getNode](../../com.aspose.threed/renderer\#getNode) instance used to provide world transform matrix. |
| [getPostProcessing(String name)](#getPostProcessing-java.lang.String-) | Gets a built-in post-processor that supported by the renderer. |
| [getPostProcessings()](#getPostProcessings--) | Active post-processing chain |
| [getPresetShaders()](#getPresetShaders--) | Gets the preset shader set |
| [getRenderFactory()](#getRenderFactory--) | Gets the factory to build render-related objects. |
| [getRenderStage()](#getRenderStage--) | Gets the current render stage. |
| [getRenderTarget()](#getRenderTarget--) | Specify the render target that the following render operations will be performed on. |
| [getShader()](#getShader--) | Gets the shader instance used for rendering the geometry. |
| [getShaderSet()](#getShaderSet--) | Gets the shader set that used to render the scene |
| [getVariables()](#getVariables--) | Access to the internal variables used for rendering |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [registerEntityRenderer(EntityRenderer renderer)](#registerEntityRenderer-com.aspose.threed.EntityRenderer-) | Register the entity renderer for specified entity |
| [render(IRenderTarget renderTarget)](#render-com.aspose.threed.IRenderTarget-) | Render the specified target |
| [setEnableShadows(boolean value)](#setEnableShadows-boolean-) | Sets whether to enable shadows. |
| [setFallbackEntityRenderer(EntityRenderer value)](#setFallbackEntityRenderer-com.aspose.threed.EntityRenderer-) | Sets the fallback entity renderer when the entity has no special renderer defined. |
| [setFrustum(Frustum value)](#setFrustum-com.aspose.threed.Frustum-) | Sets the frustum that used to provide view matrix. |
| [setMaterial(Material value)](#setMaterial-com.aspose.threed.Material-) | Sets the material that used to provide material information used by shaders. |
| [setNode(Node value)](#setNode-com.aspose.threed.Node-) | Sets the [getNode](../../com.aspose.threed/renderer\#getNode) instance used to provide world transform matrix. |
| [setPresetShaders(PresetShaders value)](#setPresetShaders-com.aspose.threed.PresetShaders-) | Sets the preset shader set |
| [setShader(ShaderProgram value)](#setShader-com.aspose.threed.ShaderProgram-) | Sets the shader instance used for rendering the geometry. |
| [setShaderSet(ShaderSet value)](#setShaderSet-com.aspose.threed.ShaderSet-) | Sets the shader set that used to render the scene |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clearCache() {#clearCache--}
```
public void clearCache()
```


Manually clear the cache. Aspose.3D will cache some objects like materials/geometries into internal types that compatible with the render pipeline. This should be manually called when scene has major changes.

### close() {#close--}
```
public void close()
```


Dispose the [Renderer](../../com.aspose.threed/renderer) and all related resources

### createRenderer() {#createRenderer--}
```
public static Renderer createRenderer()
```


Creates a new [Renderer](../../com.aspose.threed/renderer) with default profile.

**Returns:**
[Renderer](../../com.aspose.threed/renderer)
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
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

### getAssetDirectories() {#getAssetDirectories--}
```
public ArrayList<String> getAssetDirectories()
```


Directories that stored external assets

**Returns:**
java.util.ArrayList<java.lang.String>
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEnableShadows() {#getEnableShadows--}
```
public boolean getEnableShadows()
```


Gets whether to enable shadows.

**Returns:**
boolean
### getFallbackEntityRenderer() {#getFallbackEntityRenderer--}
```
public EntityRenderer getFallbackEntityRenderer()
```


Gets the fallback entity renderer when the entity has no special renderer defined.

**Returns:**
[EntityRenderer](../../com.aspose.threed/entityrenderer)
### getFrustum() {#getFrustum--}
```
public Frustum getFrustum()
```


Gets the frustum that used to provide view matrix.

**Returns:**
[Frustum](../../com.aspose.threed/frustum)
### getMaterial() {#getMaterial--}
```
public Material getMaterial()
```


Gets the material that used to provide material information used by shaders.

**Returns:**
[Material](../../com.aspose.threed/material)
### getNode() {#getNode--}
```
public Node getNode()
```


Gets the [getNode](../../com.aspose.threed/renderer\#getNode) instance used to provide world transform matrix.

**Returns:**
[Node](../../com.aspose.threed/node)
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
### getPostProcessings() {#getPostProcessings--}
```
public List<PostProcessing> getPostProcessings()
```


Active post-processing chain

**Returns:**
java.util.List<com.aspose.threed.PostProcessing>
### getPresetShaders() {#getPresetShaders--}
```
public PresetShaders getPresetShaders()
```


Gets the preset shader set

**Returns:**
[PresetShaders](../../com.aspose.threed/presetshaders)
### getRenderFactory() {#getRenderFactory--}
```
public abstract RenderFactory getRenderFactory()
```


Gets the factory to build render-related objects.

**Returns:**
[RenderFactory](../../com.aspose.threed/renderfactory)
### getRenderStage() {#getRenderStage--}
```
public RenderStage getRenderStage()
```


Gets the current render stage.

**Returns:**
[RenderStage](../../com.aspose.threed/renderstage)
### getRenderTarget() {#getRenderTarget--}
```
public IRenderTarget getRenderTarget()
```


Specify the render target that the following render operations will be performed on.

**Returns:**
[IRenderTarget](../../com.aspose.threed/irendertarget)
### getShader() {#getShader--}
```
public ShaderProgram getShader()
```


Gets the shader instance used for rendering the geometry.

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram)
### getShaderSet() {#getShaderSet--}
```
public ShaderSet getShaderSet()
```


Gets the shader set that used to render the scene

**Returns:**
[ShaderSet](../../com.aspose.threed/shaderset)
### getVariables() {#getVariables--}
```
public RendererVariableManager getVariables()
```


Access to the internal variables used for rendering

**Returns:**
[RendererVariableManager](../../com.aspose.threed/renderervariablemanager)
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

### setEnableShadows(boolean value) {#setEnableShadows-boolean-}
```
public void setEnableShadows(boolean value)
```


Sets whether to enable shadows.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setFallbackEntityRenderer(EntityRenderer value) {#setFallbackEntityRenderer-com.aspose.threed.EntityRenderer-}
```
public void setFallbackEntityRenderer(EntityRenderer value)
```


Sets the fallback entity renderer when the entity has no special renderer defined.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EntityRenderer](../../com.aspose.threed/entityrenderer) | New value |

### setFrustum(Frustum value) {#setFrustum-com.aspose.threed.Frustum-}
```
public void setFrustum(Frustum value)
```


Sets the frustum that used to provide view matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Frustum](../../com.aspose.threed/frustum) | New value |

### setMaterial(Material value) {#setMaterial-com.aspose.threed.Material-}
```
public void setMaterial(Material value)
```


Sets the material that used to provide material information used by shaders.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Material](../../com.aspose.threed/material) | New value |

### setNode(Node value) {#setNode-com.aspose.threed.Node-}
```
public void setNode(Node value)
```


Sets the [getNode](../../com.aspose.threed/renderer\#getNode) instance used to provide world transform matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

### setPresetShaders(PresetShaders value) {#setPresetShaders-com.aspose.threed.PresetShaders-}
```
public void setPresetShaders(PresetShaders value)
```


Sets the preset shader set

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PresetShaders](../../com.aspose.threed/presetshaders) | New value |

### setShader(ShaderProgram value) {#setShader-com.aspose.threed.ShaderProgram-}
```
public void setShader(ShaderProgram value)
```


Sets the shader instance used for rendering the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | New value |

### setShaderSet(ShaderSet value) {#setShaderSet-com.aspose.threed.ShaderSet-}
```
public void setShaderSet(ShaderSet value)
```


Sets the shader set that used to render the scene

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ShaderSet](../../com.aspose.threed/shaderset) | New value |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

