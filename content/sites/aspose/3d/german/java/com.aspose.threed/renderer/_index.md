---
title: Renderer
second_title: Aspose.3D für Java API-Referenz
description: Der Kontext zum Renderer.
type: docs
weight: 152
url: /de/java/com.aspose.threed/renderer/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public abstract class Renderer implements Closeable
```

Der Kontext zum Renderer.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clearCache()](#clearCache--) | Cache manuell leeren. |
| [close()](#close--) | Verwerfen Sie den [Renderer](../../com.aspose.threed/renderer) und alle zugehörigen Ressourcen. |
| [createRenderer()](#createRenderer--) | Erstellt einen neuen [Renderer](../../com.aspose.threed/renderer) mit dem Standardprofil. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [execute(PostProcessing postProcessing, IRenderTarget result)](#execute-com.aspose.threed.PostProcessing-com.aspose.threed.IRenderTarget-) | Führen Sie eine Nachbearbeitung auf dem angegebenen Renderziel aus. |
| [getAssetDirectories()](#getAssetDirectories--) | Verzeichnisse, die externe Assets speichern. |
| [getClass()](#getClass--) |  |
| [getEnableShadows()](#getEnableShadows--) | Liest, ob Schatten aktiviert werden sollen. |
| [getFallbackEntityRenderer()](#getFallbackEntityRenderer--) | Gibt den Fallback-Entitätsrenderer zurück, wenn für die Entität kein spezieller Renderer definiert ist. |
| [getFrustum()](#getFrustum--) | Gibt das Sichtvolumen zurück, das zur Bereitstellung der Ansichtsmatrix verwendet wird. |
| [getMaterial()](#getMaterial--) | Gibt das Material zurück, das Materialinformationen liefert, die von Shadern verwendet werden. |
| [getNode()](#getNode--) | Gibt die [getNode](../../com.aspose.threed/renderer\#getNode)-Instanz zurück, die zur Bereitstellung der Welttransformationsmatrix verwendet wird. |
| [getPostProcessing(String name)](#getPostProcessing-java.lang.String-) | Gibt einen integrierten Postprozessor zurück, der vom Renderer unterstützt wird. |
| [getPostProcessings()](#getPostProcessings--) | Aktive Post‑Processing‑Kette |
| [getPresetShaders()](#getPresetShaders--) | Gibt das voreingestellte Shader‑Set zurück |
| [getRenderFactory()](#getRenderFactory--) | Gibt die Fabrik zurück, um renderbezogene Objekte zu erstellen. |
| [getRenderStage()](#getRenderStage--) | Gibt die aktuelle Render‑Stufe zurück. |
| [getRenderTarget()](#getRenderTarget--) | Geben Sie das Renderziel an, auf dem die folgenden Render‑Operationen ausgeführt werden. |
| [getShader()](#getShader--) | Gibt die Shader‑Instanz zurück, die zum Rendern der Geometrie verwendet wird. |
| [getShaderSet()](#getShaderSet--) | Gibt das Shader‑Set zurück, das zum Rendern der Szene verwendet wird |
| [getVariables()](#getVariables--) | Zugriff auf die internen Variablen, die für das Rendering verwendet werden |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [registerEntityRenderer(EntityRenderer renderer)](#registerEntityRenderer-com.aspose.threed.EntityRenderer-) | Registrieren Sie den Entitätsrenderer für die angegebene Entität |
| [render(IRenderTarget renderTarget)](#render-com.aspose.threed.IRenderTarget-) | Rendern Sie das angegebene Ziel |
| [setEnableShadows(boolean value)](#setEnableShadows-boolean-) | Legt fest, ob Schatten aktiviert werden sollen. |
| [setFallbackEntityRenderer(EntityRenderer value)](#setFallbackEntityRenderer-com.aspose.threed.EntityRenderer-) | Setzt den Fallback-Entitätsrenderer, wenn für die Entität kein spezieller Renderer definiert ist. |
| [setFrustum(Frustum value)](#setFrustum-com.aspose.threed.Frustum-) | Setzt das Sichtvolumen, das zur Bereitstellung der Ansichtsmatrix verwendet wird. |
| [setMaterial(Material value)](#setMaterial-com.aspose.threed.Material-) | Setzt das Material, das Materialinformationen liefert, die von Shadern verwendet werden. |
| [setNode(Node value)](#setNode-com.aspose.threed.Node-) | Setzt die [getNode](../../com.aspose.threed/renderer\#getNode)-Instanz, die zur Bereitstellung der Welttransformationsmatrix verwendet wird. |
| [setPresetShaders(PresetShaders value)](#setPresetShaders-com.aspose.threed.PresetShaders-) | Setzt das voreingestellte Shader‑Set |
| [setShader(ShaderProgram value)](#setShader-com.aspose.threed.ShaderProgram-) | Setzt die Shader‑Instanz, die zum Rendern der Geometrie verwendet wird. |
| [setShaderSet(ShaderSet value)](#setShaderSet-com.aspose.threed.ShaderSet-) | Setzt das Shader‑Set, das zum Rendern der Szene verwendet wird |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clearCache() {#clearCache--}
```
public void clearCache()
```


Cache manuell leeren. Aspose.3D cached einige Objekte wie Materialien/Geometrien in internen Typen, die mit der Rendering‑Pipeline kompatibel sind. Dies sollte manuell aufgerufen werden, wenn die Szene größere Änderungen erfährt.

### close() {#close--}
```
public void close()
```


Verwerfen Sie den [Renderer](../../com.aspose.threed/renderer) und alle zugehörigen Ressourcen.

### createRenderer() {#createRenderer--}
```
public static Renderer createRenderer()
```


Erstellt einen neuen [Renderer](../../com.aspose.threed/renderer) mit dem Standardprofil.

**Returns:**
[Renderer](../../com.aspose.threed/renderer)
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### execute(PostProcessing postProcessing, IRenderTarget result) {#execute-com.aspose.threed.PostProcessing-com.aspose.threed.IRenderTarget-}
```
public abstract void execute(PostProcessing postProcessing, IRenderTarget result)
```


Führen Sie eine Nachbearbeitung auf dem angegebenen Renderziel aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| postProcessing | [PostProcessing](../../com.aspose.threed/postprocessing) |  |
| result | [IRenderTarget](../../com.aspose.threed/irendertarget) |  |

### getAssetDirectories() {#getAssetDirectories--}
```
public ArrayList<String> getAssetDirectories()
```


Verzeichnisse, die externe Assets speichern.

**Returns:**
java.util.ArrayList<java.lang.String> - Verzeichnisse, die externe Assets speichern
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


Liest, ob Schatten aktiviert werden sollen.

**Returns:**
boolean - ob Schatten aktiviert werden sollen.
### getFallbackEntityRenderer() {#getFallbackEntityRenderer--}
```
public EntityRenderer getFallbackEntityRenderer()
```


Gibt den Fallback-Entitätsrenderer zurück, wenn für die Entität kein spezieller Renderer definiert ist.

**Returns:**
[EntityRenderer](../../com.aspose.threed/entityrenderer) - the fallback entity renderer when the entity has no special renderer defined.
### getFrustum() {#getFrustum--}
```
public Frustum getFrustum()
```


Gibt das Sichtvolumen zurück, das zur Bereitstellung der Ansichtsmatrix verwendet wird.

**Returns:**
[Frustum](../../com.aspose.threed/frustum) - the frustum that used to provide view matrix.
### getMaterial() {#getMaterial--}
```
public Material getMaterial()
```


Gibt das Material zurück, das Materialinformationen liefert, die von Shadern verwendet werden.

**Returns:**
[Material](../../com.aspose.threed/material) - the material that used to provide material information used by shaders.
### getNode() {#getNode--}
```
public Node getNode()
```


Gibt die [getNode](../../com.aspose.threed/renderer\#getNode)-Instanz zurück, die zur Bereitstellung der Welttransformationsmatrix verwendet wird.

**Returns:**
[Node](../../com.aspose.threed/node) - the [getNode](../../com.aspose.threed/renderer\#getNode) instance used to provide world transform matrix.
### getPostProcessing(String name) {#getPostProcessing-java.lang.String-}
```
public PostProcessing getPostProcessing(String name)
```


Gibt einen integrierten Postprozessor zurück, der vom Renderer unterstützt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[PostProcessing](../../com.aspose.threed/postprocessing)
### getPostProcessings() {#getPostProcessings--}
```
public List<PostProcessing> getPostProcessings()
```


Aktive Post‑Processing‑Kette

**Returns:**
java.util.List<com.aspose.threed.PostProcessing> - Aktive Nachbearbeitungskette
### getPresetShaders() {#getPresetShaders--}
```
public PresetShaders getPresetShaders()
```


Gibt das voreingestellte Shader‑Set zurück

**Returns:**
[PresetShaders](../../com.aspose.threed/presetshaders) - the preset shader set
### getRenderFactory() {#getRenderFactory--}
```
public abstract RenderFactory getRenderFactory()
```


Gibt die Fabrik zurück, um renderbezogene Objekte zu erstellen.

**Returns:**
[RenderFactory](../../com.aspose.threed/renderfactory) - the factory to build render-related objects.
### getRenderStage() {#getRenderStage--}
```
public RenderStage getRenderStage()
```


Gibt die aktuelle Render‑Stufe zurück.

**Returns:**
[RenderStage](../../com.aspose.threed/renderstage) - the current render stage.
### getRenderTarget() {#getRenderTarget--}
```
public IRenderTarget getRenderTarget()
```


Geben Sie das Renderziel an, auf dem die folgenden Render‑Operationen ausgeführt werden.

**Returns:**
[IRenderTarget](../../com.aspose.threed/irendertarget) - Specify the render target that the following render operations will be performed on.
### getShader() {#getShader--}
```
public ShaderProgram getShader()
```


Gibt die Shader‑Instanz zurück, die zum Rendern der Geometrie verwendet wird.

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram) - the shader instance used for rendering the geometry.
### getShaderSet() {#getShaderSet--}
```
public ShaderSet getShaderSet()
```


Gibt das Shader‑Set zurück, das zum Rendern der Szene verwendet wird

**Returns:**
[ShaderSet](../../com.aspose.threed/shaderset) - the shader set that used to render the scene
### getVariables() {#getVariables--}
```
public RendererVariableManager getVariables()
```


Zugriff auf die internen Variablen, die für das Rendering verwendet werden

**Returns:**
[RendererVariableManager](../../com.aspose.threed/renderervariablemanager) - Access to the internal variables used for rendering
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


Registrieren Sie den Entitätsrenderer für die angegebene Entität

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| renderer | [EntityRenderer](../../com.aspose.threed/entityrenderer) |  |

### render(IRenderTarget renderTarget) {#render-com.aspose.threed.IRenderTarget-}
```
public void render(IRenderTarget renderTarget)
```


Rendern Sie das angegebene Ziel

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| renderTarget | [IRenderTarget](../../com.aspose.threed/irendertarget) |  |

### setEnableShadows(boolean value) {#setEnableShadows-boolean-}
```
public void setEnableShadows(boolean value)
```


Legt fest, ob Schatten aktiviert werden sollen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setFallbackEntityRenderer(EntityRenderer value) {#setFallbackEntityRenderer-com.aspose.threed.EntityRenderer-}
```
public void setFallbackEntityRenderer(EntityRenderer value)
```


Setzt den Fallback-Entitätsrenderer, wenn für die Entität kein spezieller Renderer definiert ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [EntityRenderer](../../com.aspose.threed/entityrenderer) | Neuer Wert |

### setFrustum(Frustum value) {#setFrustum-com.aspose.threed.Frustum-}
```
public void setFrustum(Frustum value)
```


Setzt das Sichtvolumen, das zur Bereitstellung der Ansichtsmatrix verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Frustum](../../com.aspose.threed/frustum) | Neuer Wert |

### setMaterial(Material value) {#setMaterial-com.aspose.threed.Material-}
```
public void setMaterial(Material value)
```


Setzt das Material, das Materialinformationen liefert, die von Shadern verwendet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Material](../../com.aspose.threed/material) | Neuer Wert |

### setNode(Node value) {#setNode-com.aspose.threed.Node-}
```
public void setNode(Node value)
```


Setzt die [getNode](../../com.aspose.threed/renderer\#getNode)-Instanz, die zur Bereitstellung der Welttransformationsmatrix verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | Neuer Wert |

### setPresetShaders(PresetShaders value) {#setPresetShaders-com.aspose.threed.PresetShaders-}
```
public void setPresetShaders(PresetShaders value)
```


Setzt das voreingestellte Shader‑Set

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [PresetShaders](../../com.aspose.threed/presetshaders) | Neuer Wert |

### setShader(ShaderProgram value) {#setShader-com.aspose.threed.ShaderProgram-}
```
public void setShader(ShaderProgram value)
```


Setzt die Shader‑Instanz, die zum Rendern der Geometrie verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ShaderProgram](../../com.aspose.threed/shaderprogram) | Neuer Wert |

### setShaderSet(ShaderSet value) {#setShaderSet-com.aspose.threed.ShaderSet-}
```
public void setShaderSet(ShaderSet value)
```


Setzt das Shader‑Set, das zum Rendern der Szene verwendet wird

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ShaderSet](../../com.aspose.threed/shaderset) | Neuer Wert |

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
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

