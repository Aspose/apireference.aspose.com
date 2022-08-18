---
title: Aspose.ThreeD.Render
second_title: Aspose.3D für .NET-API-Referenz
description: Alle Rendering-bezogenen Klassen sind in diesem Namensraum definiert
type: docs
weight: 70
url: /de/net/aspose.threed.render/
---
Alle Rendering-bezogenen Klassen sind in diesem Namensraum definiert

## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | Diese Klasse ermöglicht die Aktualisierung der[`IDescriptorSet`](../aspose.threed.render/idescriptorset) in einer Kettenoperation. |
| [DriverException](./driverexception) | Die von internen Rendering-Treibern ausgelöste Ausnahme. |
| [EntityRenderer](./entityrenderer) | Unterklassifizieren Sie dies, um das Rendering für verschiedene Arten von Entitäten zu implementieren. |
| [EntityRendererKey](./entityrendererkey) | Der Schlüssel der registrierten Entität renderer |
| [GLSLSource](./glslsource) | Der Quellcode von Shadern in GLSL |
| [InitializationException](./initializationexception) | Ausnahmen bei der Initialisierung der Renderpipeline |
| [PostProcessing](./postprocessing) | Die Nachbearbeitungseffekte |
| [PushConstant](./pushconstant) | Ein Dienstprogramm zur Bereitstellung von Daten für den Shader durch Push-Konstante. |
| [Renderer](./renderer) | Der Kontext zum Renderer. |
| [RendererVariableManager](./renderervariablemanager) | Diese Klasse verwaltet Variablen, die beim Rendern verwendet werden. |
| [RenderFactory](./renderfactory) | RenderFactory erstellt alle Ressourcen, die in der Rendering-Pipeline dargestellt werden. |
| [RenderParameters](./renderparameters) | Beschreiben Sie die Parameter des Renderziels |
| [RenderResource](./renderresource) | Die abstrakte Klasse aller Render-Ressourcen Alle Render-Ressourcen werden verworfen, wenn der Renderer veröffentlicht wird. Klassen wie[`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture) wird eine entsprechende RenderResource haben |
| [RenderState](./renderstate) | Renderstatus zum Erstellen der Pipeline Die am Renderstatus vorgenommenen Änderungen wirken sich nicht auf die erstellten Pipelineinstanzen aus. |
| [ShaderException](./shaderexception) | Shader-bezogene Ausnahmen |
| [ShaderProgram](./shaderprogram) | Das Shader-Programm |
| [ShaderSet](./shaderset) | Shader-Programme für jede Art von Materialien |
| [ShaderSource](./shadersource) | Der Quellcode von shader |
| [ShaderVariable](./shadervariable) | Shader-Variable |
| [SPIRVSource](./spirvsource) | Der kompilierte Shader im SPIR-V-Format. |
| [StencilState](./stencilstate) | Schablonenzustände pro Seite. |
| [TextureData](./texturedata) | Diese Klasse enthält die Rohdaten und die Formatdefinition einer Textur. |
| [Viewport](./viewport) | A[`IRenderTarget`](../aspose.threed.render/irendertarget) enthält mindestens ein Ansichtsfenster zum Rendern der Szene. |
| [WindowHandle](./windowhandle) | Gekapselter Fenstergriff für verschiedene Plattformen. |
## Schnittstellen

| Schnittstelle | Beschreibung |
| --- | --- |
| [IBuffer](./ibuffer) | Die Basisschnittstelle aller verwalteten Puffer, die beim Rendern verwendet werden |
| [ICommandList](./icommandlist) | Codiert eine Folge von Befehlen, die zum Rendern an die GPU gesendet werden. |
| [IDescriptorSet](./idescriptorset) | Die Deskriptorsätze beschreiben verschiedene Ressourcen, die zum Binden an die Renderpipeline verwendet werden können, wie Puffer, Texturen |
| [IIndexBuffer](./iindexbuffer) | Der Indexpuffer beschreibt die Geometrie, die in der Rendering-Pipeline verwendet wird. |
| [IPipeline](./ipipeline) | Die vorgebackene Abfolge von Vorgängen zum Zeichnen auf der GPU-Seite. |
| [IRenderQueue](./irenderqueue) | Der Entity-Renderer verwendet diese Warteschlange, um Renderaufgaben zu verwalten. |
| [IRenderTarget](./irendertarget) | Die Basisschnittstelle von render target |
| [IRenderTexture](./irendertexture) | Die Oberfläche der Rendertextur |
| [IRenderWindow](./irenderwindow) | IRenderWindow stellt das native Fenster dar, das vom Betriebssystem erstellt wird, das Rendering unterstützt. |
| [ITexture1D](./itexture1d) | 1D-Textur |
| [ITexture2D](./itexture2d) | 2D-Textur |
| [ITextureCubemap](./itexturecubemap) | Würfelkartentextur |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit) stellt eine Textur im Speicher dar, die von GPU und CPU geteilt wird und vom Shader gesampelt werden kann, wobei die[`Texture`](../aspose.threed.shading/texture) stellt nur einen Verweis auf eine externe Datei dar. Weitere Details finden Sie unter https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | Der Vertex-Puffer enthält die Polygon-Vertex-Daten, die an die Rendering-Pipeline gesendet werden |
## Aufzählung

| Aufzählung | Beschreibung |
| --- | --- |
| [BlendFactor](./blendfactor) | Mischfaktor gibt Pixelarithmetik an. |
| [CompareFunction](./comparefunction) | Die Vergleichsfunktion, die beim Tiefen-/Schablonentest verwendet wird. |
| [CubeFace](./cubeface) | Jede Fläche der Würfelkartentextur |
| [CullFaceMode](./cullfacemode) | Welches Gesicht zu cull |
| [DrawOperation](./drawoperation) | Die zu rendernden primitiven Typen |
| [EntityRendererFeatures](./entityrendererfeatures) | Die zusätzlichen Funktionen, die der Entity-Renderer bereitstellt |
| [FrontFace](./frontface) | Vorder- und Rückseitenpolygone definieren |
| [IndexDataType](./indexdatatype) | Der Datentyp der Elemente in[`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | Das in der Textureinheit verwendete Pixelformat. |
| [PolygonMode](./polygonmode) | Der Polygon-Rasterungsmodus |
| [PresetShaders](./presetshaders) | Dies definiert die voreingestellten internen Shader, die vom Renderer verwendet werden. |
| [RenderQueueGroupId](./renderqueuegroupid) | Die Gruppen-ID der Renderwarteschlange |
| [RenderStage](./renderstage) | Die Renderstufe |
| [ShaderStage](./shaderstage) | Shader-Bühne |
| [StencilAction](./stencilaction) | Die Schablonentestaktionen |
| [TextureType](./texturetype) | Der Typ der[`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
