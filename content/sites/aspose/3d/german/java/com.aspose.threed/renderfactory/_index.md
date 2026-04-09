---
title: RenderFactory
second_title: Aspose.3D für Java API-Referenz
description: RenderFactory erstellt alle Ressourcen, die in der Rendering-Pipeline dargestellt werden.
type: docs
weight: 148
url: /de/java/com.aspose.threed/renderfactory/
---

**Inheritance:**
java.lang.Object
```
public abstract class RenderFactory
```

RenderFactory erstellt alle Ressourcen, die in der Rendering-Pipeline dargestellt werden.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [RenderFactory()](#RenderFactory--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [createCubeRenderTexture(RenderParameters parameters, int width, int height)](#createCubeRenderTexture-com.aspose.threed.RenderParameters-int-int-) | Erstellt ein Renderziel, das 1 Würfeltextur enthält |
| [createDescriptorSet(ShaderProgram shader)](#createDescriptorSet-com.aspose.threed.ShaderProgram-) | Erstellt das Deskriptorset für das angegebene Shader-Programm. |
| [createIndexBuffer()](#createIndexBuffer--) | Erstellt eine [IIndexBuffer](../../com.aspose.threed/iindexbuffer)-Instanz, um die Flächeninformationen des Polygons zu speichern. |
| [createPipeline(ShaderProgram shader, RenderState renderState, VertexDeclaration vertexDeclaration, DrawOperation drawOperation)](#createPipeline-com.aspose.threed.ShaderProgram-com.aspose.threed.RenderState-com.aspose.threed.VertexDeclaration-com.aspose.threed.DrawOperation-) | Erstellt eine vorkonfigurierte Grafikpipeline mit vorkonfiguriertem Shader-/Render-Status/Vertex-Deklaration und Zeichenoperationen. |
| [createRenderTexture(RenderParameters parameters, int width, int height)](#createRenderTexture-com.aspose.threed.RenderParameters-int-int-) | Erstellt ein Renderziel, das 1 Ziel enthält, das auf die Textur rendert |
| [createRenderTexture(RenderParameters parameters, int targets, int width, int height)](#createRenderTexture-com.aspose.threed.RenderParameters-int-int-int-) | Erstellt ein Renderziel, das auf die Textur rendert |
| [createRenderWindow(RenderParameters parameters, WindowHandle handle)](#createRenderWindow-com.aspose.threed.RenderParameters-com.aspose.threed.WindowHandle-) | Erstellt ein Renderziel, das auf das native Fenster rendert. |
| [createShaderProgram(ShaderSource shaderSource)](#createShaderProgram-com.aspose.threed.ShaderSource-) | Erstellt ein [ShaderProgram](../../com.aspose.threed/shaderprogram)-Objekt |
| [createTextureUnit()](#createTextureUnit--) | Erstellt eine 2D-Textureinheit, auf die vom Shader zugegriffen werden kann. |
| [createTextureUnit(TextureType textureType)](#createTextureUnit-com.aspose.threed.TextureType-) | Erstellt eine Textureinheit, auf die vom Shader zugegriffen werden kann. |
| [createUniformBuffer(int size)](#createUniformBuffer-int-) | Erstellt einen neuen Uniform-Puffer auf der GPU-Seite mit vorab zugewiesener Größe. |
| [createVertexBuffer(VertexDeclaration declaration)](#createVertexBuffer-com.aspose.threed.VertexDeclaration-) | Erstellt eine [IVertexBuffer](../../com.aspose.threed/ivertexbuffer)-Instanz, um die Vertex-Informationen des Polygons zu speichern. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RenderFactory() {#RenderFactory--}
```
public RenderFactory()
```


### createCubeRenderTexture(RenderParameters parameters, int width, int height) {#createCubeRenderTexture-com.aspose.threed.RenderParameters-int-int-}
```
public abstract IRenderTexture createCubeRenderTexture(RenderParameters parameters, int width, int height)
```


Erstellt ein Renderziel, das 1 Würfeltextur enthält

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | [RenderParameters](../../com.aspose.threed/renderparameters) | Renderparameter zum Erstellen der Render-Textur |
| Breite | int | Die Breite der Render-Textur |
| height | int | Die Höhe der Render-Textur |

**Returns:**
[IRenderTexture](../../com.aspose.threed/irendertexture)
### createDescriptorSet(ShaderProgram shader) {#createDescriptorSet-com.aspose.threed.ShaderProgram-}
```
public abstract IDescriptorSet createDescriptorSet(ShaderProgram shader)
```


Erstellt das Deskriptorset für das angegebene Shader-Programm.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| shader | [ShaderProgram](../../com.aspose.threed/shaderprogram) | Das Shader-Programm |

**Returns:**
[IDescriptorSet](../../com.aspose.threed/idescriptorset) - A new descriptor set instance
### createIndexBuffer() {#createIndexBuffer--}
```
public abstract IIndexBuffer createIndexBuffer()
```


Erstellt eine [IIndexBuffer](../../com.aspose.threed/iindexbuffer)-Instanz, um die Flächeninformationen des Polygons zu speichern.

**Returns:**
[IIndexBuffer](../../com.aspose.threed/iindexbuffer)
### createPipeline(ShaderProgram shader, RenderState renderState, VertexDeclaration vertexDeclaration, DrawOperation drawOperation) {#createPipeline-com.aspose.threed.ShaderProgram-com.aspose.threed.RenderState-com.aspose.threed.VertexDeclaration-com.aspose.threed.DrawOperation-}
```
public abstract IPipeline createPipeline(ShaderProgram shader, RenderState renderState, VertexDeclaration vertexDeclaration, DrawOperation drawOperation)
```


Erstellt eine vorkonfigurierte Grafikpipeline mit vorkonfiguriertem Shader-/Render-Status/Vertex-Deklaration und Zeichenoperationen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| shader | [ShaderProgram](../../com.aspose.threed/shaderprogram) | Der im Rendering verwendete Shader |
| renderState | [RenderState](../../com.aspose.threed/renderstate) | Der im Rendering verwendete Render-Status |
| vertexDeclaration | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | Die Vertex-Deklaration der Eingabe-Vertex-Daten |
| drawOperation | [DrawOperation](../../com.aspose.threed/drawoperation) | Zeichenvorgang |

**Returns:**
[IPipeline](../../com.aspose.threed/ipipeline) - A new pipeline instance
### createRenderTexture(RenderParameters parameters, int width, int height) {#createRenderTexture-com.aspose.threed.RenderParameters-int-int-}
```
public abstract IRenderTexture createRenderTexture(RenderParameters parameters, int width, int height)
```


Erstellt ein Renderziel, das 1 Ziel enthält, das auf die Textur rendert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | [RenderParameters](../../com.aspose.threed/renderparameters) | Renderparameter zum Erstellen der Render-Textur |
| Breite | int | Die Breite der Render-Textur |
| height | int | Die Höhe der Render-Textur |

**Returns:**
[IRenderTexture](../../com.aspose.threed/irendertexture)
### createRenderTexture(RenderParameters parameters, int targets, int width, int height) {#createRenderTexture-com.aspose.threed.RenderParameters-int-int-int-}
```
public abstract IRenderTexture createRenderTexture(RenderParameters parameters, int targets, int width, int height)
```


Erstellt ein Renderziel, das auf die Textur rendert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | [RenderParameters](../../com.aspose.threed/renderparameters) | Renderparameter zum Erstellen der Render-Textur |
| Ziele | int | Wie viele Farbausgabeziele |
| Breite | int | Die Breite der Render-Textur |
| height | int | Die Höhe der Render-Textur |

**Returns:**
[IRenderTexture](../../com.aspose.threed/irendertexture)
### createRenderWindow(RenderParameters parameters, WindowHandle handle) {#createRenderWindow-com.aspose.threed.RenderParameters-com.aspose.threed.WindowHandle-}
```
public abstract IRenderWindow createRenderWindow(RenderParameters parameters, WindowHandle handle)
```


Erstellt ein Renderziel, das auf das native Fenster rendert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | [RenderParameters](../../com.aspose.threed/renderparameters) | Renderparameter zum Erstellen des Renderfensters |
| handle | [WindowHandle](../../com.aspose.threed/windowhandle) | Der Handle des zu rendernden Fensters |

**Returns:**
[IRenderWindow](../../com.aspose.threed/irenderwindow)
### createShaderProgram(ShaderSource shaderSource) {#createShaderProgram-com.aspose.threed.ShaderSource-}
```
public abstract ShaderProgram createShaderProgram(ShaderSource shaderSource)
```


Erstellt ein [ShaderProgram](../../com.aspose.threed/shaderprogram)-Objekt

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| shaderSource | [ShaderSource](../../com.aspose.threed/shadersource) | Der Quellcode des Shaders |

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram)
### createTextureUnit() {#createTextureUnit--}
```
public ITextureUnit createTextureUnit()
```


Erstellt eine 2D-Textureinheit, auf die vom Shader zugegriffen werden kann.

**Returns:**
[ITextureUnit](../../com.aspose.threed/itextureunit)
### createTextureUnit(TextureType textureType) {#createTextureUnit-com.aspose.threed.TextureType-}
```
public abstract ITextureUnit createTextureUnit(TextureType textureType)
```


Erstellt eine Textureinheit, auf die vom Shader zugegriffen werden kann.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| textureType | [TextureType](../../com.aspose.threed/texturetype) | Typ der Textur |

**Returns:**
[ITextureUnit](../../com.aspose.threed/itextureunit)
### createUniformBuffer(int size) {#createUniformBuffer-int-}
```
public abstract IBuffer createUniformBuffer(int size)
```


Erstellt einen neuen Uniform-Puffer auf der GPU-Seite mit vorab zugewiesener Größe.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | int | Die Größe des Uniform-Puffers |

**Returns:**
[IBuffer](../../com.aspose.threed/ibuffer) - The uniform buffer instance
### createVertexBuffer(VertexDeclaration declaration) {#createVertexBuffer-com.aspose.threed.VertexDeclaration-}
```
public abstract IVertexBuffer createVertexBuffer(VertexDeclaration declaration)
```


Erstellt eine [IVertexBuffer](../../com.aspose.threed/ivertexbuffer)-Instanz, um die Vertex-Informationen des Polygons zu speichern.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| declaration | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) |  |

**Returns:**
[IVertexBuffer](../../com.aspose.threed/ivertexbuffer)
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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

