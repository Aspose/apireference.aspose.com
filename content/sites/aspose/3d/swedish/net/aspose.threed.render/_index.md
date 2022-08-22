---
title: Aspose.ThreeD.Render
second_title: Aspose.3D för .NET API-referens
description: Alla renderingsrelaterade klasser är definierade i detta namnutrymme
type: docs
weight: 70
url: /sv/net/aspose.threed.render/
---
Alla renderingsrelaterade klasser är definierade i detta namnutrymme

## Klasser

| Klass | Beskrivning |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | Denna klass gör det möjligt att uppdatera[`IDescriptorSet`](../aspose.threed.render/idescriptorset) i en kedjeoperation. |
| [DriverException](./driverexception) | Undantaget som uppstår av interna renderingsdrivrutiner. |
| [EntityRenderer](./entityrenderer) | Underklass detta för att implementera rendering för olika typer av enheter. |
| [EntityRendererKey](./entityrendererkey) | Nyckeln till registrerad enhet renderer |
| [GLSLSource](./glslsource) | Källkoden för shaders i GLSL |
| [InitializationException](./initializationexception) | Undantag i rendering pipeline initialization |
| [PostProcessing](./postprocessing) | Efterbehandlingseffekterna |
| [PushConstant](./pushconstant) | Ett verktyg för att tillhandahålla data till shader genom push constant. |
| [Renderer](./renderer) | Kontexten om renderer. |
| [RendererVariableManager](./renderervariablemanager) | Den här klassen hanterar variabler som används i rendering |
| [RenderFactory](./renderfactory) | RenderFactory skapar alla resurser som representeras i renderingspipeline. |
| [RenderParameters](./renderparameters) | Beskriv parametrarna för renderingen target |
| [RenderResource](./renderresource) | Den abstrakta klassen för alla renderingsresurser Alla renderingsresurser kommer att tas bort när renderaren släpps. Klasser som t.ex.[`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture) kommer att ha en motsvarande RenderResource |
| [RenderState](./renderstate) | Rendertillstånd för att bygga pipeline Ändringarna som görs i renderingstillstånd kommer inte att påverka de skapade pipelineinstanserna. |
| [ShaderException](./shaderexception) | Shader-relaterade undantag |
| [ShaderProgram](./shaderprogram) | Shader-programmet |
| [ShaderSet](./shaderset) | Shader-program för varje typ av material |
| [ShaderSource](./shadersource) | Källkoden för shader |
| [ShaderVariable](./shadervariable) | Shader variabel |
| [SPIRVSource](./spirvsource) | Den kompilerade skuggningen i SPIR-V-format. |
| [StencilState](./stencilstate) | Stenciltillstånd per yta. |
| [TextureData](./texturedata) | Den här klassen innehåller rådata och formatdefinition för en textur. |
| [Viewport](./viewport) | A[`IRenderTarget`](../aspose.threed.render/irendertarget) innehåller minst en visningsport för att rendera scenen. |
| [WindowHandle](./windowhandle) | Inkapslat fönsterhandtag för olika plattformar. |
## Gränssnitt

| Gränssnitt | Beskrivning |
| --- | --- |
| [IBuffer](./ibuffer) | Basgränssnittet för alla hanterade buffertar som används i rendering |
| [ICommandList](./icommandlist) | Kodar en sekvens av kommandon som skickas till GPU för att rendera. |
| [IDescriptorSet](./idescriptorset) | Deskriptoruppsättningarna beskriver olika resurser som kan användas för att binda till renderingspipelinen som buffertar, textures |
| [IIndexBuffer](./iindexbuffer) | Indexbufferten beskriver geometrin som används vid rendering av pipeline. |
| [IPipeline](./ipipeline) | Den förgräddade sekvensen av operationer för att rita på GPU-sidan. |
| [IRenderQueue](./irenderqueue) | Entity renderer använder denna kö för att hantera renderingsuppgifter. |
| [IRenderTarget](./irendertarget) | Basgränssnittet för render target |
| [IRenderTexture](./irendertexture) | Gränssnittet för render texture |
| [IRenderWindow](./irenderwindow) | IRenderWindow representerar det ursprungliga fönstret som skapats av operativsystem som stöder rendering. |
| [ITexture1D](./itexture1d) | 1D texture |
| [ITexture2D](./itexture2d) | 2D texture |
| [ITextureCubemap](./itexturecubemap) | Kubkarta texture |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit) representerar en textur i minnet som delas mellan GPU och CPU och som kan samplas av shadern, där[`Texture`](../aspose.threed.shading/texture) representerar endast en referens till en extern fil. Mer information finns https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | Vertexbufferten innehåller polygonvertexdata som kommer att skickas till rendering pipeline |
## Uppräkning

| Uppräkning | Beskrivning |
| --- | --- |
| [BlendFactor](./blendfactor) | Blandningsfaktor specificera pixelaritmetik. |
| [CompareFunction](./comparefunction) | Jämföringsfunktionen som används vid djup-/stenciltestning. |
| [CubeFace](./cubeface) | Varje yta av kubkartans struktur |
| [CullFaceMode](./cullfacemode) | Vilket ansikte att avliva |
| [DrawOperation](./drawoperation) | De primitiva typerna att rendera |
| [EntityRendererFeatures](./entityrendererfeatures) | De extra funktioner som entitetsrenderaren kommer att tillhandahålla |
| [FrontFace](./frontface) | Definiera fram- och bakåtvända polygoner |
| [IndexDataType](./indexdatatype) | Datatypen för elementen i[`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | Pixelns format som används i texturenheten. |
| [PolygonMode](./polygonmode) | Polygonrasteriseringsläget |
| [PresetShaders](./presetshaders) | Detta definierar de förinställda interna shaders som används av renderaren. |
| [RenderQueueGroupId](./renderqueuegroupid) | Grupp-id för rendering queue |
| [RenderStage](./renderstage) | Renderingsstadiet |
| [ShaderStage](./shaderstage) | Shader scen |
| [StencilAction](./stencilaction) | Schablonen test actions |
| [TextureType](./texturetype) | Typen av[`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
